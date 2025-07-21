package com.amazonaws.mobileconnectors.cognito.internal.storage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import com.amazonaws.mobileconnectors.cognito.DatasetMetadata;
import com.amazonaws.mobileconnectors.cognito.Record;
import com.amazonaws.mobileconnectors.cognito.exceptions.DataStorageException;
import com.amazonaws.mobileconnectors.cognito.internal.util.DatasetUtils;
import com.amazonaws.mobileconnectors.cognito.internal.util.StringUtils;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.amazonaws.services.s3.model.InstructionFileId;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Deprecated
/* loaded from: classes.dex */
public class SQLiteLocalStorage implements LocalStorage {
    static final String TABLE_DATASETS = "datasets";
    static final String TABLE_RECORDS = "records";
    private static final String TAG = "SQLiteLocalStorage";
    private final DatabaseHelper helper;

    private class DatabaseHelper extends SQLiteOpenHelper {
        private static final int DB_VERSION = 2;

        public DatabaseHelper(Context context, String str) {
            super(context.getApplicationContext(), str, (SQLiteDatabase.CursorFactory) null, 2);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("CREATE TABLE datasets(identity_id TEXT NOT NULL,dataset_name TEXT NOT NULL,creation_timestamp INTEGER DEFAULT 0,last_modified_timestamp INTEGER DEFAULT 0,last_modified_by TEXT,storage_size_bytes INTEGER DEFAULT 0,record_count INTEGER DEFAULT 0,last_sync_count INTEGER NOT NULL DEFAULT 0,last_sync_timestamp INTEGER DEFAULT 0,last_sync_result TEXT,UNIQUE (identity_id, dataset_name))");
            sQLiteDatabase.execSQL("CREATE TABLE records(identity_id TEXT NOT NULL,dataset_name TEXT NOT NULL,key TEXT NOT NULL,value TEXT,sync_count INTEGER NOT NULL DEFAULT 0,last_modified_timestamp INTEGER DEFAULT 0,last_modified_by TEXT,device_last_modified_timestamp INTEGER DEFAULT 0,modified INTEGER NOT NULL DEFAULT 1,UNIQUE (identity_id, dataset_name, key))");
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            Log.w(SQLiteLocalStorage.TAG, "Upgrading database; wiping all data");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS datasets");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS records");
            onCreate(sQLiteDatabase);
        }
    }

    static class DatasetColumns {
        static final String IDENTITY_ID = "identity_id";
        static final String DATASET_NAME = "dataset_name";
        static final String CREATION_TIMESTAMP = "creation_timestamp";
        static final String LAST_MODIFIED_TIMESTAMP = "last_modified_timestamp";
        static final String LAST_MODIFIED_BY = "last_modified_by";
        static final String STORAGE_SIZE_BYTES = "storage_size_bytes";
        static final String RECORD_COUNT = "record_count";
        static final String LAST_SYNC_COUNT = "last_sync_count";
        static final String LAST_SYNC_TIMESTAMP = "last_sync_timestamp";
        static final String LAST_SYNC_RESULT = "last_sync_result";
        static final String[] ALL = {IDENTITY_ID, DATASET_NAME, CREATION_TIMESTAMP, LAST_MODIFIED_TIMESTAMP, LAST_MODIFIED_BY, STORAGE_SIZE_BYTES, RECORD_COUNT, LAST_SYNC_COUNT, LAST_SYNC_TIMESTAMP, LAST_SYNC_RESULT};

        DatasetColumns() {
        }
    }

    static class RecordColumns {
        static final String KEY = "key";
        static final String IDENTITY_ID = "identity_id";
        static final String DATASET_NAME = "dataset_name";
        static final String VALUE = "value";
        static final String SYNC_COUNT = "sync_count";
        static final String LAST_MODIFIED_TIMESTAMP = "last_modified_timestamp";
        static final String LAST_MODIFIED_BY = "last_modified_by";
        static final String DEVICE_LAST_MODIFIED_TIMESTAMP = "device_last_modified_timestamp";
        static final String MODIFIED = "modified";
        static final String[] ALL = {IDENTITY_ID, DATASET_NAME, "key", VALUE, SYNC_COUNT, LAST_MODIFIED_TIMESTAMP, LAST_MODIFIED_BY, DEVICE_LAST_MODIFIED_TIMESTAMP, MODIFIED};

        RecordColumns() {
        }
    }

    public SQLiteLocalStorage(Context context, String str) {
        this.helper = new DatabaseHelper(context, str);
    }

    @Override // com.amazonaws.mobileconnectors.cognito.internal.storage.LocalStorage
    public synchronized void changeIdentityId(String str, String str2) {
        SQLiteDatabase writableDatabase = this.helper.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            if (DatasetUtils.UNKNOWN_IDENTITY_ID.equals(str)) {
                Set<String> commonDatasetNames = getCommonDatasetNames(str, str2);
                if (commonDatasetNames.size() > 0) {
                    for (String str3 : commonDatasetNames) {
                        writableDatabase.execSQL("UPDATE datasets SET dataset_name = '" + str3 + InstructionFileId.DOT + str + "' WHERE identity_id = ? AND dataset_name = ?", new String[]{str, str3});
                        writableDatabase.execSQL("UPDATE records SET dataset_name = '" + str3 + InstructionFileId.DOT + str + "' WHERE identity_id = ? AND dataset_name = ?", new String[]{str, str3});
                    }
                }
                writableDatabase.execSQL("UPDATE datasets SET identity_id = '" + str2 + "' WHERE identity_id = ?", new String[]{str});
                writableDatabase.execSQL("UPDATE records SET identity_id = '" + str2 + "' WHERE identity_id = ?", new String[]{str});
            } else {
                writableDatabase.execSQL("INSERT INTO datasets(identity_id,dataset_name,creation_timestamp,storage_size_bytes,record_count) SELECT '" + str2 + "',dataset_name,creation_timestamp,storage_size_bytes,record_count FROM " + TABLE_DATASETS + " WHERE identity_id = ?", new String[]{str});
                writableDatabase.execSQL("INSERT INTO records(identity_id,dataset_name,key,value,last_modified_timestamp,last_modified_by,device_last_modified_timestamp) SELECT '" + str2 + "',dataset_name," + TransferTable.COLUMN_KEY + ",value,last_modified_timestamp,last_modified_by,device_last_modified_timestamp FROM " + TABLE_RECORDS + " WHERE identity_id = ?", new String[]{str});
                StringBuilder sb = new StringBuilder();
                sb.append("UPDATE datasets SET identity_id = '");
                sb.append(str2);
                sb.append("', ");
                sb.append("dataset_name");
                sb.append(" = ");
                sb.append("dataset_name");
                sb.append(" || '.");
                sb.append(str);
                sb.append("' WHERE ");
                sb.append("identity_id");
                sb.append(" = ?");
                writableDatabase.execSQL(sb.toString(), new String[]{str});
                writableDatabase.execSQL("UPDATE records SET identity_id = '" + str2 + "', dataset_name = dataset_name || '." + str + "' WHERE identity_id = ?", new String[]{str});
            }
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
        } catch (Throwable th) {
            writableDatabase.endTransaction();
            throw th;
        }
    }

    public void close() {
        this.helper.close();
    }

    @Override // com.amazonaws.mobileconnectors.cognito.internal.storage.LocalStorage
    public void conditionallyPutRecords(String str, String str2, List<Record> list, List<Record> list2) {
        HashMap hashMap = new HashMap();
        for (Record record : list2) {
            hashMap.put(record.getKey(), record);
        }
        SQLiteDatabase writableDatabase = this.helper.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            for (Record record2 : list) {
                Record record3 = getRecord(str, str2, record2.getKey());
                Record record4 = (Record) hashMap.get(record2.getKey());
                if (record3 == null || record4 == null || (StringUtils.equals(record3.getValue(), record4.getValue()) && record3.getSyncCount() == record4.getSyncCount() && StringUtils.equals(record3.getLastModifiedBy(), record4.getLastModifiedBy()))) {
                    updateOrInsertRecord(writableDatabase, str, str2, record2);
                }
            }
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
        } catch (Throwable th) {
            writableDatabase.endTransaction();
            throw th;
        }
    }

    public void createDataset(String str, String str2) {
        SQLiteDatabase writableDatabase = this.helper.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            if (getMetadataInternal(writableDatabase, str, str2) == null) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("identity_id", str);
                contentValues.put("dataset_name", str2);
                contentValues.put("creation_timestamp", String.valueOf(new Date().getTime()));
                contentValues.put("last_modified_timestamp", String.valueOf(new Date().getTime()));
                if (writableDatabase.insert(TABLE_DATASETS, null, contentValues) == -1) {
                    Log.e(TAG, String.format("couldn't create dataset %s", str2));
                }
            }
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
        } catch (Throwable th) {
            writableDatabase.endTransaction();
            throw th;
        }
    }

    DatasetMetadata cursorToDatasetMetadata(Cursor cursor) {
        return new DatasetMetadata.Builder(cursor.getString(cursor.getColumnIndex("dataset_name"))).creationDate(new Date(cursor.getLong(cursor.getColumnIndex("creation_timestamp")))).lastModifiedDate(new Date(cursor.getLong(cursor.getColumnIndex("last_modified_timestamp")))).lastModifiedBy(cursor.getString(cursor.getColumnIndex("last_modified_by"))).storageSizeBytes(cursor.getLong(cursor.getColumnIndex("storage_size_bytes"))).recordCount(cursor.getLong(cursor.getColumnIndex("record_count"))).build();
    }

    Record cursorToRecord(Cursor cursor) {
        return new Record.Builder(cursor.getString(cursor.getColumnIndex(TransferTable.COLUMN_KEY))).value(cursor.getString(cursor.getColumnIndex("value"))).syncCount(cursor.getLong(cursor.getColumnIndex("sync_count"))).deviceLastModifiedDate(new Date(cursor.getLong(cursor.getColumnIndex("device_last_modified_timestamp")))).lastModifiedDate(new Date(cursor.getLong(cursor.getColumnIndex("last_modified_timestamp")))).lastModifiedBy(cursor.getString(cursor.getColumnIndex("last_modified_by"))).modified(cursor.getInt(cursor.getColumnIndex("modified")) == 1).build();
    }

    @Override // com.amazonaws.mobileconnectors.cognito.internal.storage.LocalStorage
    public void deleteDataset(String str, String str2) {
        SQLiteDatabase writableDatabase = this.helper.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            Log.i(TAG, String.format("%d records were deleted from dataset %s", Integer.valueOf(writableDatabase.delete(TABLE_RECORDS, "identity_id = ? AND dataset_name = ?", new String[]{str, str2})), str2));
            ContentValues contentValues = new ContentValues();
            contentValues.put("last_modified_timestamp", Long.valueOf(System.currentTimeMillis()));
            contentValues.put("last_sync_count", String.valueOf(-1));
            if (writableDatabase.update(TABLE_DATASETS, contentValues, "identity_id = ? AND dataset_name = ?", new String[]{str, str2}) != 1) {
                Log.e(TAG, String.format("couldn't mark dataset %s deleted", str2));
            } else {
                writableDatabase.setTransactionSuccessful();
            }
            writableDatabase.endTransaction();
        } catch (Throwable th) {
            writableDatabase.endTransaction();
            throw th;
        }
    }

    Set<String> getCommonDatasetNames(String str, String str2) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        if (str != null && str2 != null) {
            List<DatasetMetadata> datasets = getDatasets(str2);
            Iterator<DatasetMetadata> it2 = getDatasets(str).iterator();
            while (it2.hasNext()) {
                hashSet2.add(it2.next().getDatasetName());
            }
            Iterator<DatasetMetadata> it3 = datasets.iterator();
            while (it3.hasNext()) {
                hashSet.add(it3.next().getDatasetName());
            }
            hashSet2.retainAll(hashSet);
        }
        return hashSet2;
    }

    @Override // com.amazonaws.mobileconnectors.cognito.internal.storage.LocalStorage
    public DatasetMetadata getDatasetMetadata(String str, String str2) throws DataStorageException {
        Cursor query = this.helper.getWritableDatabase().query(TABLE_DATASETS, DatasetColumns.ALL, "identity_id = ? AND dataset_name = ?", new String[]{str, str2}, null, null, null);
        DatasetMetadata cursorToDatasetMetadata = query.moveToFirst() ? cursorToDatasetMetadata(query) : null;
        query.close();
        return cursorToDatasetMetadata;
    }

    @Override // com.amazonaws.mobileconnectors.cognito.internal.storage.LocalStorage
    public List<DatasetMetadata> getDatasets(String str) {
        ArrayList arrayList = new ArrayList();
        Cursor query = this.helper.getWritableDatabase().query(TABLE_DATASETS, DatasetColumns.ALL, "identity_id = ?", new String[]{str}, null, null, null);
        while (query.moveToNext()) {
            arrayList.add(cursorToDatasetMetadata(query));
        }
        query.close();
        return arrayList;
    }

    @Override // com.amazonaws.mobileconnectors.cognito.internal.storage.LocalStorage
    public long getLastSyncCount(String str, String str2) {
        long j;
        Cursor query = this.helper.getWritableDatabase().query(TABLE_DATASETS, DatasetColumns.ALL, "identity_id = ? AND dataset_name = ?", new String[]{str, str2}, null, null, null);
        if (query.moveToFirst()) {
            j = query.getInt(query.getColumnIndex("last_sync_count"));
        } else {
            Log.w(TAG, String.format("couldn't find %s in %s table", str2, TABLE_DATASETS));
            j = 0;
        }
        query.close();
        return j;
    }

    DatasetMetadata getMetadataInternal(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        Cursor query = sQLiteDatabase.query(TABLE_DATASETS, DatasetColumns.ALL, "identity_id = ? AND dataset_name = ?", new String[]{str, str2}, null, null, null);
        DatasetMetadata cursorToDatasetMetadata = query.moveToFirst() ? cursorToDatasetMetadata(query) : null;
        query.close();
        return cursorToDatasetMetadata;
    }

    @Override // com.amazonaws.mobileconnectors.cognito.internal.storage.LocalStorage
    public List<Record> getModifiedRecords(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        Cursor query = this.helper.getWritableDatabase().query(TABLE_RECORDS, RecordColumns.ALL, "identity_id = ? AND dataset_name = ? AND modified = ?", new String[]{str, str2, String.valueOf(1)}, null, null, null);
        while (query.moveToNext()) {
            arrayList.add(cursorToRecord(query));
        }
        query.close();
        return arrayList;
    }

    @Override // com.amazonaws.mobileconnectors.cognito.internal.storage.LocalStorage
    public Record getRecord(String str, String str2, String str3) {
        Cursor query = this.helper.getWritableDatabase().query(TABLE_RECORDS, RecordColumns.ALL, "identity_id = ? AND dataset_name = ? AND key = ?", new String[]{str, str2, str3}, null, null, null);
        Record cursorToRecord = query.moveToFirst() ? cursorToRecord(query) : null;
        query.close();
        return cursorToRecord;
    }

    @Override // com.amazonaws.mobileconnectors.cognito.internal.storage.LocalStorage
    public List<Record> getRecords(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        Cursor query = this.helper.getWritableDatabase().query(TABLE_RECORDS, RecordColumns.ALL, "identity_id = ? AND dataset_name = ?", new String[]{str, str2}, null, null, null);
        while (query.moveToNext()) {
            arrayList.add(cursorToRecord(query));
        }
        query.close();
        return arrayList;
    }

    @Override // com.amazonaws.mobileconnectors.cognito.internal.storage.LocalStorage
    public String getValue(String str, String str2, String str3) {
        Record record = getRecord(str, str2, str3);
        if (record == null) {
            return null;
        }
        return record.getValue();
    }

    @Override // com.amazonaws.mobileconnectors.cognito.internal.storage.LocalStorage
    public Map<String, String> getValueMap(String str, String str2) {
        HashMap hashMap = new HashMap();
        for (Record record : getRecords(str, str2)) {
            if (!record.isDeleted()) {
                hashMap.put(record.getKey(), record.getValue());
            }
        }
        return hashMap;
    }

    @Override // com.amazonaws.mobileconnectors.cognito.internal.storage.LocalStorage
    public void purgeDataset(String str, String str2) {
        deleteDataset(str, str2);
        if (this.helper.getWritableDatabase().delete(TABLE_DATASETS, "identity_id = ? AND dataset_name = ?", new String[]{str, str2}) != 1) {
            Log.e(TAG, String.format("failed to purge dataset %s", str2));
        }
    }

    @Override // com.amazonaws.mobileconnectors.cognito.internal.storage.LocalStorage
    public void putAllValues(String str, String str2, Map<String, String> map) {
        SQLiteDatabase writableDatabase = this.helper.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                putValueInternal(writableDatabase, str, str2, entry.getKey(), entry.getValue());
            }
            updateLastModifiedTimestamp(writableDatabase, str, str2);
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
        } catch (Throwable th) {
            writableDatabase.endTransaction();
            throw th;
        }
    }

    @Override // com.amazonaws.mobileconnectors.cognito.internal.storage.LocalStorage
    public void putRecords(String str, String str2, List<Record> list) {
        SQLiteDatabase writableDatabase = this.helper.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            Iterator<Record> it2 = list.iterator();
            while (it2.hasNext()) {
                updateOrInsertRecord(writableDatabase, str, str2, it2.next());
            }
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
        } catch (Throwable th) {
            writableDatabase.endTransaction();
            throw th;
        }
    }

    @Override // com.amazonaws.mobileconnectors.cognito.internal.storage.LocalStorage
    public void putValue(String str, String str2, String str3, String str4) {
        SQLiteDatabase writableDatabase = this.helper.getWritableDatabase();
        if (putValueInternal(writableDatabase, str, str2, str3, str4)) {
            updateLastModifiedTimestamp(writableDatabase, str, str2);
        } else {
            Log.e(TAG, String.format("failed to put record [%s: %s] into dataset %s", str3, str4, str2));
        }
    }

    boolean putValueInternal(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String str4) {
        Record record = getRecord(str, str2, str3);
        if (record != null && StringUtils.equals(record.getValue(), str4)) {
            return true;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("identity_id", str);
        contentValues.put("dataset_name", str2);
        contentValues.put(TransferTable.COLUMN_KEY, str3);
        contentValues.put("value", str4);
        contentValues.put("modified", Boolean.TRUE);
        contentValues.put("sync_count", Long.valueOf(record == null ? 0L : record.getSyncCount()));
        contentValues.put("device_last_modified_timestamp", String.valueOf(new Date().getTime()));
        return record == null ? sQLiteDatabase.insert(TABLE_RECORDS, null, contentValues) != -1 : sQLiteDatabase.update(TABLE_RECORDS, contentValues, "identity_id = ? AND dataset_name = ? AND key = ?", new String[]{str, str2, str3}) == 1;
    }

    void removeRecord(SQLiteDatabase sQLiteDatabase, String str, String str2, Record record) {
        if (sQLiteDatabase.delete(TABLE_RECORDS, "identity_id = ? AND dataset_name = ? AND key = ?", new String[]{str, str2, record.getKey()}) == 0) {
            Log.w(TAG, String.format("failed to delete record %s from dataset %s", record.getKey(), str2));
        }
    }

    @Override // com.amazonaws.mobileconnectors.cognito.internal.storage.LocalStorage
    public void updateDatasetMetadata(String str, List<DatasetMetadata> list) {
        SQLiteDatabase writableDatabase = this.helper.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            for (DatasetMetadata datasetMetadata : list) {
                if (!updateDatasetMetadataInternal(writableDatabase, str, datasetMetadata)) {
                    Log.w(TAG, String.format("couldn't update dataset metadata %s", datasetMetadata.getDatasetName()));
                }
            }
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
        } catch (Throwable th) {
            writableDatabase.endTransaction();
            throw th;
        }
    }

    boolean updateDatasetMetadataInternal(SQLiteDatabase sQLiteDatabase, String str, DatasetMetadata datasetMetadata) {
        DatasetMetadata metadataInternal = getMetadataInternal(sQLiteDatabase, str, datasetMetadata.getDatasetName());
        ContentValues contentValues = new ContentValues();
        contentValues.put("identity_id", str);
        contentValues.put("dataset_name", datasetMetadata.getDatasetName());
        contentValues.put("creation_timestamp", Long.valueOf(datasetMetadata.getCreationDate().getTime()));
        contentValues.put("last_modified_timestamp", Long.valueOf(datasetMetadata.getLastModifiedDate().getTime()));
        contentValues.put("last_modified_by", datasetMetadata.getLastModifiedBy());
        contentValues.put("record_count", Long.valueOf(datasetMetadata.getRecordCount()));
        contentValues.put("storage_size_bytes", Long.valueOf(datasetMetadata.getStorageSizeBytes()));
        return metadataInternal == null ? sQLiteDatabase.insert(TABLE_DATASETS, null, contentValues) != -1 : sQLiteDatabase.update(TABLE_DATASETS, contentValues, "identity_id = ? AND dataset_name = ?", new String[]{str, datasetMetadata.getDatasetName()}) == 1;
    }

    void updateLastModifiedTimestamp(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("last_modified_timestamp", Long.valueOf(System.currentTimeMillis()));
        if (sQLiteDatabase.update(TABLE_DATASETS, contentValues, "identity_id = ? AND dataset_name = ?", new String[]{str, str2}) != 1) {
            Log.w(TAG, String.format("failed to update last modified timestamp of dataset %s", str2));
        }
    }

    @Override // com.amazonaws.mobileconnectors.cognito.internal.storage.LocalStorage
    public void updateLastSyncCount(String str, String str2, long j) {
        SQLiteDatabase writableDatabase = this.helper.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("last_sync_count", Long.valueOf(j));
        contentValues.put("last_sync_timestamp", Long.valueOf(System.currentTimeMillis()));
        if (writableDatabase.update(TABLE_DATASETS, contentValues, "identity_id = ? AND dataset_name = ?", new String[]{str, str2}) != 1) {
            Log.e(TAG, String.format("failed to update last sync count of dataset %s", str2));
        }
    }

    void updateOrInsertRecord(SQLiteDatabase sQLiteDatabase, String str, String str2, Record record) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("identity_id", str);
        contentValues.put("dataset_name", str2);
        contentValues.put(TransferTable.COLUMN_KEY, record.getKey());
        contentValues.put("value", record.getValue());
        contentValues.put("sync_count", Long.valueOf(record.getSyncCount()));
        contentValues.put("modified", Boolean.valueOf(record.isModified()));
        contentValues.put("last_modified_by", record.getLastModifiedBy());
        if (record.getLastModifiedDate() != null) {
            contentValues.put("last_modified_timestamp", String.valueOf(record.getLastModifiedDate().getTime()));
        }
        if (record.getDeviceLastModifiedDate() != null) {
            contentValues.put("device_last_modified_timestamp", String.valueOf(record.getDeviceLastModifiedDate().getTime()));
        }
        if (sQLiteDatabase.replace(TABLE_RECORDS, null, contentValues) == -1) {
            Log.e(TAG, String.format("failed to store record [%s: %s] into dataset %s", record.getKey(), record.getValue(), str2));
        }
    }

    @Override // com.amazonaws.mobileconnectors.cognito.internal.storage.LocalStorage
    public void wipeData() {
        SQLiteDatabase writableDatabase = this.helper.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            writableDatabase.execSQL("DELETE FROM datasets");
            writableDatabase.execSQL("DELETE FROM records");
            writableDatabase.setTransactionSuccessful();
        } finally {
            writableDatabase.endTransaction();
        }
    }
}
