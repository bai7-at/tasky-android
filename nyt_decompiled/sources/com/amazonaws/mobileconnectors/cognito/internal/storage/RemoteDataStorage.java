package com.amazonaws.mobileconnectors.cognito.internal.storage;

import com.amazonaws.mobileconnectors.cognito.DatasetMetadata;
import com.amazonaws.mobileconnectors.cognito.Record;
import com.amazonaws.mobileconnectors.cognito.exceptions.DataConflictException;
import com.amazonaws.mobileconnectors.cognito.exceptions.DataStorageException;
import com.amazonaws.mobileconnectors.cognito.exceptions.DatasetNotFoundException;
import java.util.List;

@Deprecated
/* loaded from: classes.dex */
public interface RemoteDataStorage {

    public interface DatasetUpdates {
        String getDatasetName();

        List<String> getMergedDatasetNameList();

        List<Record> getRecords();

        long getSyncCount();

        String getSyncSessionToken();

        boolean isDeleted();

        boolean isExists();
    }

    void deleteDataset(String str) throws DatasetNotFoundException;

    DatasetMetadata getDatasetMetadata(String str) throws DataStorageException;

    List<DatasetMetadata> getDatasets() throws DataStorageException;

    DatasetUpdates listUpdates(String str, long j) throws DataStorageException;

    List<Record> putRecords(String str, List<Record> list, String str2, String str3) throws DatasetNotFoundException, DataConflictException;

    void subscribeToDataset(String str, String str2);

    void unsubscribeFromDataset(String str, String str2);
}
