package com.amazonaws.mobileconnectors.cognito;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.amazonaws.auth.CognitoCachingCredentialsProvider;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.mobileconnectors.cognito.Dataset;
import com.amazonaws.mobileconnectors.cognito.exceptions.DataConflictException;
import com.amazonaws.mobileconnectors.cognito.exceptions.DataStorageException;
import com.amazonaws.mobileconnectors.cognito.exceptions.DatasetNotFoundException;
import com.amazonaws.mobileconnectors.cognito.exceptions.NetworkException;
import com.amazonaws.mobileconnectors.cognito.internal.storage.LocalStorage;
import com.amazonaws.mobileconnectors.cognito.internal.storage.RemoteDataStorage;
import com.amazonaws.mobileconnectors.cognito.internal.util.DatasetUtils;
import com.amazonaws.mobileconnectors.cognito.internal.util.StringUtils;
import com.amazonaws.services.s3.model.InstructionFileId;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@Deprecated
/* loaded from: classes.dex */
class DefaultDataset implements Dataset {
    private static final Log LOGGER = LogFactory.getLog((Class<?>) DefaultDataset.class);
    private static final int MAX_RETRY = 3;
    private final Context context;
    private final String datasetName;
    private final LocalStorage local;
    private SyncOnConnectivity pendingSyncRequest = null;
    private final CognitoCachingCredentialsProvider provider;
    private final RemoteDataStorage remote;

    static class SyncOnConnectivity extends BroadcastReceiver {
        WeakReference<Dataset.SyncCallback> callbackRef;
        WeakReference<Dataset> datasetRef;

        SyncOnConnectivity(Dataset dataset, Dataset.SyncCallback syncCallback) {
            this.datasetRef = new WeakReference<>(dataset);
            this.callbackRef = new WeakReference<>(syncCallback);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (!DefaultDataset.isNetworkAvailable(context)) {
                DefaultDataset.LOGGER.debug("Connectivity is unavailable.");
                return;
            }
            DefaultDataset.LOGGER.debug("Connectivity is available. Try synchronizing.");
            context.unregisterReceiver(this);
            Dataset dataset = this.datasetRef.get();
            Dataset.SyncCallback syncCallback = this.callbackRef.get();
            if (dataset == null || syncCallback == null) {
                DefaultDataset.LOGGER.warn("Abort syncOnConnectivity because either dataset or callback was garbage collected");
            } else {
                dataset.synchronize(syncCallback);
            }
        }
    }

    public DefaultDataset(Context context, String str, CognitoCachingCredentialsProvider cognitoCachingCredentialsProvider, LocalStorage localStorage, RemoteDataStorage remoteDataStorage) {
        this.context = context;
        this.datasetName = str;
        this.provider = cognitoCachingCredentialsProvider;
        this.local = localStorage;
        this.remote = remoteDataStorage;
    }

    private SharedPreferences getSharedPreferences() {
        return this.context.getSharedPreferences("com.amazonaws.mobileconnectors.cognito", 0);
    }

    static boolean isNetworkAvailable(Context context) {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        return (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) ? false : true;
    }

    @Override // com.amazonaws.mobileconnectors.cognito.Dataset
    public void delete() {
        this.local.deleteDataset(getIdentityId(), this.datasetName);
    }

    boolean deleteLocalAndPurgeRemoteDataset(Dataset.SyncCallback syncCallback) {
        try {
            try {
                this.remote.deleteDataset(this.datasetName);
            } catch (DatasetNotFoundException e) {
                LOGGER.debug("Possibly a local-only dataset", e);
            }
            this.local.purgeDataset(getIdentityId(), this.datasetName);
            syncCallback.onSuccess(this, Collections.emptyList());
            return true;
        } catch (DataStorageException e2) {
            syncCallback.onFailure(e2);
            return false;
        }
    }

    void discardPendingSyncRequest() {
        if (this.pendingSyncRequest != null) {
            LOGGER.debug("Discard previous pending sync request");
            synchronized (this) {
                try {
                    this.context.unregisterReceiver(this.pendingSyncRequest);
                } catch (IllegalArgumentException unused) {
                    LOGGER.debug("SyncOnConnectivity has been unregistered.");
                }
                this.pendingSyncRequest = null;
            }
        }
    }

    @Override // com.amazonaws.mobileconnectors.cognito.Dataset
    public String get(String str) {
        return this.local.getValue(getIdentityId(), this.datasetName, DatasetUtils.validateRecordKey(str));
    }

    @Override // com.amazonaws.mobileconnectors.cognito.Dataset
    public Map<String, String> getAll() {
        HashMap hashMap = new HashMap();
        for (Record record : this.local.getRecords(getIdentityId(), this.datasetName)) {
            if (!record.isDeleted()) {
                hashMap.put(record.getKey(), record.getValue());
            }
        }
        return hashMap;
    }

    @Override // com.amazonaws.mobileconnectors.cognito.Dataset
    public List<Record> getAllRecords() {
        return this.local.getRecords(getIdentityId(), this.datasetName);
    }

    @Override // com.amazonaws.mobileconnectors.cognito.Dataset
    public DatasetMetadata getDatasetMetadata() {
        return this.local.getDatasetMetadata(getIdentityId(), this.datasetName);
    }

    String getIdentityId() {
        return DatasetUtils.getIdentityId(this.provider);
    }

    @Override // com.amazonaws.mobileconnectors.cognito.Dataset
    public long getLastSyncCount() {
        return this.local.getLastSyncCount(getIdentityId(), this.datasetName);
    }

    List<String> getLocalMergedDatasets() {
        ArrayList arrayList = new ArrayList();
        String str = this.datasetName + InstructionFileId.DOT;
        for (DatasetMetadata datasetMetadata : this.local.getDatasets(getIdentityId())) {
            if (datasetMetadata.getDatasetName().startsWith(str)) {
                arrayList.add(datasetMetadata.getDatasetName());
            }
        }
        return arrayList;
    }

    List<Record> getModifiedRecords() {
        return this.local.getModifiedRecords(getIdentityId(), this.datasetName);
    }

    @Override // com.amazonaws.mobileconnectors.cognito.Dataset
    public long getSizeInBytes(String str) {
        return DatasetUtils.computeRecordSize(this.local.getRecord(getIdentityId(), this.datasetName, DatasetUtils.validateRecordKey(str)));
    }

    @Override // com.amazonaws.mobileconnectors.cognito.Dataset
    public long getTotalSizeInBytes() {
        Iterator<Record> it2 = this.local.getRecords(getIdentityId(), this.datasetName).iterator();
        long j = 0;
        while (it2.hasNext()) {
            j += DatasetUtils.computeRecordSize(it2.next());
        }
        return j;
    }

    boolean handleDatasetMerge(Dataset.SyncCallback syncCallback, RemoteDataStorage.DatasetUpdates datasetUpdates, int i) {
        if (syncCallback.onDatasetsMerged(this, new ArrayList(datasetUpdates.getMergedDatasetNameList()))) {
            return synchronizeInternal(syncCallback, i - 1);
        }
        syncCallback.onFailure(new DataStorageException("Manual cancel"));
        return false;
    }

    boolean handleLocalModifications(Dataset.SyncCallback syncCallback, RemoteDataStorage.DatasetUpdates datasetUpdates, int i) {
        List<Record> modifiedRecords = getModifiedRecords();
        if (!modifiedRecords.isEmpty()) {
            long syncCount = datasetUpdates.getSyncCount();
            long j = 0;
            long j2 = 0;
            for (Record record : modifiedRecords) {
                if (record.getSyncCount() > j2) {
                    j2 = record.getSyncCount();
                }
            }
            LOGGER.info(String.format("push %d records to remote", Integer.valueOf(modifiedRecords.size())));
            try {
                List<Record> putRecords = this.remote.putRecords(this.datasetName, modifiedRecords, datasetUpdates.getSyncSessionToken(), getSharedPreferences().getString(namespaceIdPlatform("deviceId"), null));
                this.local.conditionallyPutRecords(getIdentityId(), this.datasetName, putRecords, modifiedRecords);
                for (Record record2 : putRecords) {
                    if (j < record2.getSyncCount()) {
                        j = record2.getSyncCount();
                    }
                }
                if (j == syncCount + 1) {
                    LOGGER.info(String.format("updated sync count %d", Long.valueOf(j)));
                    this.local.updateLastSyncCount(getIdentityId(), this.datasetName, j);
                }
            } catch (DataConflictException unused) {
                LOGGER.info("conflicts detected when pushing changes to remote.");
                if (syncCount > j2) {
                    this.local.updateLastSyncCount(getIdentityId(), this.datasetName, j2);
                }
                return synchronizeInternal(syncCallback, i - 1);
            } catch (DataStorageException e) {
                syncCallback.onFailure(e);
                return false;
            }
        }
        syncCallback.onSuccess(this, datasetUpdates.getRecords());
        return true;
    }

    boolean handleRemoteRecords(Dataset.SyncCallback syncCallback, RemoteDataStorage.DatasetUpdates datasetUpdates) {
        List<Record> records = datasetUpdates.getRecords();
        if (records.isEmpty()) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Record> it2 = records.iterator();
        while (it2.hasNext()) {
            Record next = it2.next();
            Record record = this.local.getRecord(getIdentityId(), this.datasetName, next.getKey());
            if (record != null && record.isModified() && record.getSyncCount() != next.getSyncCount() && !StringUtils.equals(record.getValue(), next.getValue())) {
                arrayList.add(new SyncConflict(next, record));
                it2.remove();
            }
        }
        if (!arrayList.isEmpty()) {
            LOGGER.info(String.format("%d records in conflict!", Integer.valueOf(arrayList.size())));
            if (!syncCallback.onConflict(this, arrayList)) {
                return false;
            }
        }
        if (!records.isEmpty()) {
            LOGGER.info(String.format("save %d records to local", Integer.valueOf(records.size())));
            this.local.putRecords(getIdentityId(), this.datasetName, records);
        }
        LOGGER.info(String.format("updated sync count %d", Long.valueOf(datasetUpdates.getSyncCount())));
        this.local.updateLastSyncCount(getIdentityId(), this.datasetName, datasetUpdates.getSyncCount());
        return true;
    }

    @Override // com.amazonaws.mobileconnectors.cognito.Dataset
    public boolean isChanged(String str) {
        Record record = this.local.getRecord(getIdentityId(), this.datasetName, DatasetUtils.validateRecordKey(str));
        return record != null && record.isModified();
    }

    String namespaceId(String str) {
        return this.provider.getIdentityId() + InstructionFileId.DOT + str;
    }

    String namespaceIdPlatform(String str) {
        return namespaceId(getSharedPreferences().getString(namespaceId("platform"), "")) + InstructionFileId.DOT + str;
    }

    @Override // com.amazonaws.mobileconnectors.cognito.Dataset
    public void put(String str, String str2) {
        this.local.putValue(getIdentityId(), this.datasetName, DatasetUtils.validateRecordKey(str), str2);
    }

    @Override // com.amazonaws.mobileconnectors.cognito.Dataset
    public void putAll(Map<String, String> map) {
        Iterator<String> it2 = map.keySet().iterator();
        while (it2.hasNext()) {
            DatasetUtils.validateRecordKey(it2.next());
        }
        this.local.putAllValues(getIdentityId(), this.datasetName, map);
    }

    @Override // com.amazonaws.mobileconnectors.cognito.Dataset
    public void remove(String str) {
        this.local.putValue(getIdentityId(), this.datasetName, DatasetUtils.validateRecordKey(str), null);
    }

    boolean removeLocalDataset(Dataset.SyncCallback syncCallback, RemoteDataStorage.DatasetUpdates datasetUpdates) {
        if (!syncCallback.onDatasetDeleted(this, datasetUpdates.getDatasetName())) {
            syncCallback.onFailure(new DataStorageException("Manual cancel"));
            return false;
        }
        this.local.deleteDataset(getIdentityId(), this.datasetName);
        this.local.purgeDataset(getIdentityId(), this.datasetName);
        syncCallback.onSuccess(this, Collections.emptyList());
        return true;
    }

    @Override // com.amazonaws.mobileconnectors.cognito.Dataset
    public void resolve(List<Record> list) {
        this.local.putRecords(getIdentityId(), this.datasetName, list);
    }

    @Override // com.amazonaws.mobileconnectors.cognito.Dataset
    public void subscribe() {
        String string = getSharedPreferences().getString(namespaceIdPlatform("deviceId"), "");
        if (string.isEmpty()) {
            throw new IllegalStateException("Device hasn't been registered yet");
        }
        this.remote.subscribeToDataset(this.datasetName, string);
    }

    @Override // com.amazonaws.mobileconnectors.cognito.Dataset
    public void synchronize(final Dataset.SyncCallback syncCallback) {
        if (syncCallback == null) {
            throw new IllegalArgumentException("callback can't be null");
        }
        if (!isNetworkAvailable(this.context)) {
            syncCallback.onFailure(new NetworkException("Network connectivity unavailable."));
        } else {
            discardPendingSyncRequest();
            new Thread(new Runnable() { // from class: com.amazonaws.mobileconnectors.cognito.DefaultDataset.1
                @Override // java.lang.Runnable
                public void run() {
                    boolean z;
                    DefaultDataset.LOGGER.debug("start to synchronize " + DefaultDataset.this.datasetName);
                    boolean z2 = false;
                    try {
                        List<String> localMergedDatasets = DefaultDataset.this.getLocalMergedDatasets();
                        if (localMergedDatasets.isEmpty()) {
                            z = true;
                        } else {
                            DefaultDataset.LOGGER.info("detected merge datasets " + DefaultDataset.this.datasetName);
                            z = syncCallback.onDatasetsMerged(DefaultDataset.this, localMergedDatasets);
                        }
                        if (z) {
                            z2 = DefaultDataset.this.synchronizeInternal(syncCallback, 3);
                        }
                    } catch (Exception e) {
                        syncCallback.onFailure(new DataStorageException("Unknown exception", e));
                    }
                    if (z2) {
                        DefaultDataset.LOGGER.debug("successfully synchronize " + DefaultDataset.this.datasetName);
                        return;
                    }
                    DefaultDataset.LOGGER.debug("failed to synchronize " + DefaultDataset.this.datasetName);
                }
            }).start();
        }
    }

    synchronized boolean synchronizeInternal(Dataset.SyncCallback syncCallback, int i) {
        if (i < 0) {
            LOGGER.error("Synchronize failed because it exceeded the maximum retries");
            syncCallback.onFailure(new DataStorageException("Synchronize failed because it exceeded the maximum retries"));
            return false;
        }
        long lastSyncCount = this.local.getLastSyncCount(getIdentityId(), this.datasetName);
        if (lastSyncCount == -1) {
            return deleteLocalAndPurgeRemoteDataset(syncCallback);
        }
        LOGGER.debug("get latest modified records since " + lastSyncCount);
        try {
            RemoteDataStorage.DatasetUpdates listUpdates = this.remote.listUpdates(this.datasetName, lastSyncCount);
            if (!listUpdates.getMergedDatasetNameList().isEmpty()) {
                return handleDatasetMerge(syncCallback, listUpdates, i);
            }
            if ((lastSyncCount != 0 && !listUpdates.isExists()) || listUpdates.isDeleted()) {
                return removeLocalDataset(syncCallback, listUpdates);
            }
            if (!handleRemoteRecords(syncCallback, listUpdates)) {
                return false;
            }
            return handleLocalModifications(syncCallback, listUpdates, i);
        } catch (DataStorageException e) {
            syncCallback.onFailure(e);
            return false;
        }
    }

    @Override // com.amazonaws.mobileconnectors.cognito.Dataset
    public void synchronizeOnConnectivity(Dataset.SyncCallback syncCallback) {
        if (isNetworkAvailable(this.context)) {
            synchronize(syncCallback);
            return;
        }
        discardPendingSyncRequest();
        LOGGER.debug("Connectivity is unavailable. Scheduling synchronize for when connectivity is resumed.");
        SyncOnConnectivity syncOnConnectivity = new SyncOnConnectivity(this, syncCallback);
        this.pendingSyncRequest = syncOnConnectivity;
        this.context.registerReceiver(syncOnConnectivity, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // com.amazonaws.mobileconnectors.cognito.Dataset
    public void unsubscribe() {
        String string = getSharedPreferences().getString(namespaceIdPlatform("deviceId"), "");
        if (string.isEmpty()) {
            throw new IllegalStateException("Device hasn't been registered yet");
        }
        this.remote.unsubscribeFromDataset(this.datasetName, string);
    }
}
