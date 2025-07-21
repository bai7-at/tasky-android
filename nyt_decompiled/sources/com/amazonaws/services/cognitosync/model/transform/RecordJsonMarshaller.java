package com.amazonaws.services.cognitosync.model.transform;

import com.amazonaws.services.cognitosync.model.Record;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.Date;

@Deprecated
/* loaded from: classes.dex */
class RecordJsonMarshaller {
    private static RecordJsonMarshaller instance;

    RecordJsonMarshaller() {
    }

    public static RecordJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new RecordJsonMarshaller();
        }
        return instance;
    }

    public void marshall(Record record, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (record.getKey() != null) {
            String key = record.getKey();
            awsJsonWriter.name("Key");
            awsJsonWriter.value(key);
        }
        if (record.getValue() != null) {
            String value = record.getValue();
            awsJsonWriter.name("Value");
            awsJsonWriter.value(value);
        }
        if (record.getSyncCount() != null) {
            Long syncCount = record.getSyncCount();
            awsJsonWriter.name("SyncCount");
            awsJsonWriter.value(syncCount);
        }
        if (record.getLastModifiedDate() != null) {
            Date lastModifiedDate = record.getLastModifiedDate();
            awsJsonWriter.name("LastModifiedDate");
            awsJsonWriter.value(lastModifiedDate);
        }
        if (record.getLastModifiedBy() != null) {
            String lastModifiedBy = record.getLastModifiedBy();
            awsJsonWriter.name("LastModifiedBy");
            awsJsonWriter.value(lastModifiedBy);
        }
        if (record.getDeviceLastModifiedDate() != null) {
            Date deviceLastModifiedDate = record.getDeviceLastModifiedDate();
            awsJsonWriter.name("DeviceLastModifiedDate");
            awsJsonWriter.value(deviceLastModifiedDate);
        }
        awsJsonWriter.endObject();
    }
}
