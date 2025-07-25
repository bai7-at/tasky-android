package com.amazonaws.mobileconnectors.s3.transferutility;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.services.s3.AmazonS3;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class TransferNetworkLossHandler extends BroadcastReceiver {
    private static final Log LOGGER = LogFactory.getLog((Class<?>) TransferNetworkLossHandler.class);
    private static TransferNetworkLossHandler transferNetworkLossHandler;
    final ConnectivityManager connManager;
    private TransferDBUtil dbUtil;
    TransferStatusUpdater updater;

    private TransferNetworkLossHandler(Context context) {
        this.connManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.dbUtil = new TransferDBUtil(context);
        this.updater = TransferStatusUpdater.getInstance(context);
    }

    public static synchronized TransferNetworkLossHandler getInstance(Context context) {
        TransferNetworkLossHandler transferNetworkLossHandler2;
        synchronized (TransferNetworkLossHandler.class) {
            try {
                if (transferNetworkLossHandler == null) {
                    transferNetworkLossHandler = new TransferNetworkLossHandler(context);
                }
                transferNetworkLossHandler2 = transferNetworkLossHandler;
            } catch (Throwable th) {
                throw th;
            }
        }
        return transferNetworkLossHandler2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void pauseAllTransfersDueToNetworkInterruption() {
        for (TransferRecord transferRecord : this.updater.getTransfers().values()) {
            AmazonS3 amazonS3 = S3ClientReference.get(Integer.valueOf(transferRecord.id));
            if (amazonS3 != null && transferRecord.pauseIfRequiredForNetworkInterruption(amazonS3, this.updater, this.connManager)) {
                this.updater.updateState(transferRecord.id, TransferState.WAITING_FOR_NETWORK);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void resumeAllTransfersOnNetworkAvailability() {
        TransferRecord transfer;
        TransferState[] transferStateArr = {TransferState.WAITING_FOR_NETWORK};
        LOGGER.debug("Loading transfers from database...");
        ArrayList<Integer> arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            cursor = this.dbUtil.queryTransfersWithTypeAndStates(TransferType.ANY, transferStateArr);
            int i = 0;
            while (cursor.moveToNext()) {
                int i2 = cursor.getInt(cursor.getColumnIndexOrThrow(TransferTable.COLUMN_ID));
                if (this.updater.getTransfer(i2) == null) {
                    TransferRecord transferRecord = new TransferRecord(i2);
                    transferRecord.updateFromDB(cursor);
                    this.updater.addTransfer(transferRecord);
                    i++;
                }
                arrayList.add(Integer.valueOf(i2));
            }
            LOGGER.debug("Closing the cursor for resumeAllTransfers");
            cursor.close();
            try {
                for (Integer num : arrayList) {
                    AmazonS3 amazonS3 = S3ClientReference.get(num);
                    if (amazonS3 != null && (transfer = this.updater.getTransfer(num.intValue())) != null && !transfer.isRunning()) {
                        transfer.start(amazonS3, this.dbUtil, this.updater, this.connManager);
                    }
                }
            } catch (Exception e) {
                LOGGER.error("Error in resuming the transfers." + e.getMessage());
            }
            LOGGER.debug(i + " transfers are loaded from database.");
        } catch (Throwable th) {
            if (cursor != null) {
                LOGGER.debug("Closing the cursor for resumeAllTransfers");
                cursor.close();
            }
            throw th;
        }
    }

    boolean isNetworkConnected() {
        NetworkInfo activeNetworkInfo = this.connManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            Log log = LOGGER;
            log.info("Network connectivity changed detected.");
            log.info("Network connected: " + isNetworkConnected());
            new Thread(new Runnable() { // from class: com.amazonaws.mobileconnectors.s3.transferutility.TransferNetworkLossHandler.1
                @Override // java.lang.Runnable
                public void run() {
                    if (TransferNetworkLossHandler.this.isNetworkConnected()) {
                        TransferNetworkLossHandler.this.resumeAllTransfersOnNetworkAvailability();
                    } else {
                        TransferNetworkLossHandler.this.pauseAllTransfersDueToNetworkInterruption();
                    }
                }
            }).start();
        }
    }

    public static synchronized TransferNetworkLossHandler getInstance() throws TransferUtilityException {
        TransferNetworkLossHandler transferNetworkLossHandler2;
        synchronized (TransferNetworkLossHandler.class) {
            transferNetworkLossHandler2 = transferNetworkLossHandler;
            if (transferNetworkLossHandler2 == null) {
                LOGGER.error("TransferNetworkLossHandler is not created. Please call `TransferNetworkLossHandler.getInstance(Context)` to instantiate it before retrieving");
                throw new TransferUtilityException("TransferNetworkLossHandler is not created. Please call `TransferNetworkLossHandler.getInstance(Context)` to instantiate it before retrieving");
            }
        }
        return transferNetworkLossHandler2;
    }
}
