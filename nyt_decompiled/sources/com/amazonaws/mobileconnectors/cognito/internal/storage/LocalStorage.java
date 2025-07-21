package com.amazonaws.mobileconnectors.cognito.internal.storage;

import com.amazonaws.mobileconnectors.cognito.DatasetMetadata;
import com.amazonaws.mobileconnectors.cognito.Record;
import com.amazonaws.mobileconnectors.cognito.exceptions.DataStorageException;
import com.amazonaws.mobileconnectors.cognito.exceptions.DatasetNotFoundException;
import java.util.List;
import java.util.Map;

@Deprecated
/* loaded from: classes.dex */
public interface LocalStorage {
    void changeIdentityId(String str, String str2);

    void conditionallyPutRecords(String str, String str2, List<Record> list, List<Record> list2);

    void deleteDataset(String str, String str2) throws DatasetNotFoundException;

    DatasetMetadata getDatasetMetadata(String str, String str2) throws DataStorageException;

    List<DatasetMetadata> getDatasets(String str) throws DataStorageException;

    long getLastSyncCount(String str, String str2);

    List<Record> getModifiedRecords(String str, String str2);

    Record getRecord(String str, String str2, String str3);

    List<Record> getRecords(String str, String str2);

    String getValue(String str, String str2, String str3);

    Map<String, String> getValueMap(String str, String str2);

    void purgeDataset(String str, String str2);

    void putAllValues(String str, String str2, Map<String, String> map);

    void putRecords(String str, String str2, List<Record> list);

    void putValue(String str, String str2, String str3, String str4);

    void updateDatasetMetadata(String str, List<DatasetMetadata> list);

    void updateLastSyncCount(String str, String str2, long j);

    void wipeData();
}
