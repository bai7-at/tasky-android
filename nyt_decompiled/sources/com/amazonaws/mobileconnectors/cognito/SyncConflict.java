package com.amazonaws.mobileconnectors.cognito;

import com.amazonaws.mobileconnectors.cognito.Record;
import java.util.Date;

@Deprecated
/* loaded from: classes.dex */
public class SyncConflict {
    private final String key;
    private final Record localRecord;
    private final Record remoteRecord;

    public SyncConflict(Record record, Record record2) {
        if (record == null || record2 == null) {
            throw new IllegalArgumentException("record can't be null");
        }
        if (!record.getKey().equals(record2.getKey())) {
            throw new IllegalArgumentException("the keys of remote record and local record don't match");
        }
        this.key = record.getKey();
        this.remoteRecord = record;
        this.localRecord = record2;
    }

    public String getKey() {
        return this.key;
    }

    public Record getLocalRecord() {
        return this.localRecord;
    }

    public Record getRemoteRecord() {
        return this.remoteRecord;
    }

    public Record resolveWithLastWriterWins() {
        return this.remoteRecord.getLastModifiedDate().after(this.localRecord.getLastModifiedDate()) ? resolveWithRemoteRecord() : resolveWithLocalRecord();
    }

    public Record resolveWithLocalRecord() {
        return new Record.Builder(this.key).value(this.localRecord.getValue()).syncCount(this.remoteRecord.getSyncCount()).lastModifiedDate(this.localRecord.getLastModifiedDate()).lastModifiedBy(this.localRecord.getLastModifiedBy()).deviceLastModifiedDate(this.localRecord.getDeviceLastModifiedDate()).modified(true).build();
    }

    public Record resolveWithRemoteRecord() {
        return new Record.Builder(this.key).value(this.remoteRecord.getValue()).syncCount(this.remoteRecord.getSyncCount()).lastModifiedDate(this.remoteRecord.getLastModifiedDate()).lastModifiedBy(this.remoteRecord.getLastModifiedBy()).deviceLastModifiedDate(this.remoteRecord.getDeviceLastModifiedDate()).modified(false).build();
    }

    public Record resolveWithValue(String str) {
        Date date = new Date();
        return new Record.Builder(this.key).value(str).syncCount(this.remoteRecord.getSyncCount()).lastModifiedDate(date).lastModifiedBy(this.localRecord.getLastModifiedBy()).deviceLastModifiedDate(date).modified(true).build();
    }
}
