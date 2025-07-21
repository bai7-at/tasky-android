package com.amazonaws.mobileconnectors.s3.transferutility;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.event.ProgressListener;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferObserver;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
class TransferStatusUpdater {
    static final String TEMP_FILE_PREFIX = "aws-s3-d861b25a-1edf-11eb-adc1-0242ac120002";
    private static TransferDBUtil dbUtil;
    private static TransferStatusUpdater transferStatusUpdater;
    private Context context;
    private final Handler mainHandler;
    private final Map<Integer, TransferRecord> transfers;
    private static final Log LOGGER = LogFactory.getLog((Class<?>) TransferStatusUpdater.class);
    private static final HashSet<TransferState> STATES_NOT_TO_NOTIFY = new HashSet<>(Arrays.asList(TransferState.PART_COMPLETED, TransferState.PENDING_CANCEL, TransferState.PENDING_PAUSE, TransferState.PENDING_NETWORK_DISCONNECT));
    static final Map<Integer, List<TransferListener>> LISTENERS = new ConcurrentHashMap<Integer, List<TransferListener>>() { // from class: com.amazonaws.mobileconnectors.s3.transferutility.TransferStatusUpdater.1
    };

    private class TransferProgressListener implements ProgressListener {
        private long bytesTransferredSoFar;
        private final TransferRecord transfer;

        public TransferProgressListener(TransferRecord transferRecord) {
            this.transfer = transferRecord;
        }

        @Override // com.amazonaws.event.ProgressListener
        public synchronized void progressChanged(ProgressEvent progressEvent) {
            try {
                if (32 == progressEvent.getEventCode()) {
                    TransferStatusUpdater.LOGGER.info("Reset Event triggered. Resetting the bytesCurrent to 0.");
                    this.bytesTransferredSoFar = 0L;
                } else {
                    long bytesTransferred = this.bytesTransferredSoFar + progressEvent.getBytesTransferred();
                    this.bytesTransferredSoFar = bytesTransferred;
                    TransferRecord transferRecord = this.transfer;
                    if (bytesTransferred > transferRecord.bytesCurrent) {
                        transferRecord.bytesCurrent = bytesTransferred;
                        TransferStatusUpdater.this.updateProgress(transferRecord.id, bytesTransferred, transferRecord.bytesTotal, true);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    TransferStatusUpdater(TransferDBUtil transferDBUtil, Context context) {
        dbUtil = transferDBUtil;
        this.context = context;
        this.mainHandler = new Handler(Looper.getMainLooper());
        this.transfers = new ConcurrentHashMap();
    }

    public static synchronized TransferStatusUpdater getInstance(Context context) {
        TransferStatusUpdater transferStatusUpdater2;
        synchronized (TransferStatusUpdater.class) {
            try {
                if (transferStatusUpdater == null) {
                    TransferDBUtil transferDBUtil = new TransferDBUtil(context);
                    dbUtil = transferDBUtil;
                    transferStatusUpdater = new TransferStatusUpdater(transferDBUtil, context);
                }
                transferStatusUpdater2 = transferStatusUpdater;
            } catch (Throwable th) {
                throw th;
            }
        }
        return transferStatusUpdater2;
    }

    static void registerListener(int i, TransferListener transferListener) {
        if (transferListener == null) {
            throw new IllegalArgumentException("Listener can't be null");
        }
        Map<Integer, List<TransferListener>> map = LISTENERS;
        synchronized (map) {
            try {
                List<TransferListener> list = map.get(Integer.valueOf(i));
                if (list == null) {
                    CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                    copyOnWriteArrayList.add(transferListener);
                    map.put(Integer.valueOf(i), copyOnWriteArrayList);
                } else if (!list.contains(transferListener)) {
                    list.add(transferListener);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static void unregisterListener(int i, TransferListener transferListener) {
        if (transferListener == null) {
            throw new IllegalArgumentException("Listener can't be null");
        }
        Map<Integer, List<TransferListener>> map = LISTENERS;
        synchronized (map) {
            try {
                List<TransferListener> list = map.get(Integer.valueOf(i));
                if (list != null && !list.isEmpty()) {
                    list.remove(transferListener);
                }
            } finally {
            }
        }
    }

    synchronized void addTransfer(TransferRecord transferRecord) {
        this.transfers.put(Integer.valueOf(transferRecord.id), transferRecord);
    }

    synchronized void clear() {
        Map<Integer, List<TransferListener>> map = LISTENERS;
        synchronized (map) {
            map.clear();
        }
        this.transfers.clear();
    }

    synchronized TransferRecord getTransfer(int i) {
        return this.transfers.get(Integer.valueOf(i));
    }

    synchronized Map<Integer, TransferRecord> getTransfers() {
        return Collections.unmodifiableMap(this.transfers);
    }

    synchronized ProgressListener newProgressListener(int i) {
        TransferRecord transfer;
        transfer = getTransfer(i);
        if (transfer == null) {
            LOGGER.info("TransferStatusUpdater doesn't track the transfer: " + i);
            throw new IllegalArgumentException("transfer " + i + " doesn't exist");
        }
        LOGGER.info("Creating a new progress listener for transfer: " + i);
        return new TransferProgressListener(transfer);
    }

    synchronized void removeTransfer(int i) {
        Map<Integer, List<TransferListener>> map = LISTENERS;
        synchronized (map) {
            map.remove(Integer.valueOf(i));
        }
        this.transfers.remove(Integer.valueOf(i));
    }

    synchronized void removeTransferRecordFromDB(int i) {
        try {
            TransferRecord transferById = dbUtil.getTransferById(i);
            if (transferById != null) {
                String str = transferById.file;
                if (new File(str).getName().startsWith(TEMP_FILE_PREFIX)) {
                    new File(str).delete();
                }
            }
            S3ClientReference.remove(Integer.valueOf(i));
            dbUtil.deleteTransferRecords(i);
        } catch (Throwable th) {
            throw th;
        }
    }

    void throwError(final int i, final Exception exc) {
        Map<Integer, List<TransferListener>> map = LISTENERS;
        synchronized (map) {
            try {
                List<TransferListener> list = map.get(Integer.valueOf(i));
                if (list != null && !list.isEmpty()) {
                    for (final TransferListener transferListener : list) {
                        this.mainHandler.post(new Runnable() { // from class: com.amazonaws.mobileconnectors.s3.transferutility.TransferStatusUpdater.4
                            @Override // java.lang.Runnable
                            public void run() {
                                transferListener.onError(i, exc);
                            }
                        });
                    }
                }
            } finally {
            }
        }
    }

    synchronized void updateProgress(final int i, final long j, final long j2, boolean z) {
        try {
            TransferRecord transferRecord = this.transfers.get(Integer.valueOf(i));
            if (transferRecord != null) {
                transferRecord.bytesCurrent = j;
                transferRecord.bytesTotal = j2;
            }
            dbUtil.updateBytesTransferred(i, j);
            if (z) {
                Map<Integer, List<TransferListener>> map = LISTENERS;
                synchronized (map) {
                    try {
                        List<TransferListener> list = map.get(Integer.valueOf(i));
                        if (list != null && !list.isEmpty()) {
                            for (Iterator<TransferListener> it2 = list.iterator(); it2.hasNext(); it2 = it2) {
                                final TransferListener next = it2.next();
                                this.mainHandler.post(new Runnable() { // from class: com.amazonaws.mobileconnectors.s3.transferutility.TransferStatusUpdater.3
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        next.onProgressChanged(i, j, j2);
                                    }
                                });
                            }
                        }
                    } finally {
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    synchronized void updateState(final int i, final TransferState transferState) {
        try {
            boolean contains = STATES_NOT_TO_NOTIFY.contains(transferState);
            TransferRecord transferRecord = this.transfers.get(Integer.valueOf(i));
            if (transferRecord != null) {
                contains |= transferState.equals(transferRecord.state);
                transferRecord.state = transferState;
                if (dbUtil.updateTransferRecord(transferRecord) == 0) {
                    LOGGER.warn("Failed to update the status of transfer " + i);
                }
            } else if (dbUtil.updateState(i, transferState) == 0) {
                LOGGER.warn("Failed to update the status of transfer " + i);
            }
            if (contains) {
                return;
            }
            if (TransferState.COMPLETED.equals(transferState)) {
                removeTransferRecordFromDB(i);
            }
            Map<Integer, List<TransferListener>> map = LISTENERS;
            synchronized (map) {
                try {
                    List<TransferListener> list = map.get(Integer.valueOf(i));
                    if (list != null && !list.isEmpty()) {
                        for (final TransferListener transferListener : list) {
                            if (transferListener instanceof TransferObserver.TransferStatusListener) {
                                transferListener.onStateChanged(i, transferState);
                            } else {
                                this.mainHandler.post(new Runnable() { // from class: com.amazonaws.mobileconnectors.s3.transferutility.TransferStatusUpdater.2
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        transferListener.onStateChanged(i, transferState);
                                    }
                                });
                            }
                        }
                        if (TransferState.isFinalState(transferState)) {
                            list.clear();
                        }
                    }
                } finally {
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
