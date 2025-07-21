package com.amazonaws.services.cognitosync.model.transform;

import com.amazonaws.services.cognitosync.model.RecordPatch;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.Date;

@Deprecated
/* loaded from: classes.dex */
class RecordPatchJsonMarshaller {
    private static RecordPatchJsonMarshaller instance;

    RecordPatchJsonMarshaller() {
    }

    public static RecordPatchJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new RecordPatchJsonMarshaller();
        }
        return instance;
    }

    public void marshall(RecordPatch recordPatch, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (recordPatch.getOp() != null) {
            String op = recordPatch.getOp();
            awsJsonWriter.name("Op");
            awsJsonWriter.value(op);
        }
        if (recordPatch.getKey() != null) {
            String key = recordPatch.getKey();
            awsJsonWriter.name("Key");
            awsJsonWriter.value(key);
        }
        if (recordPatch.getValue() != null) {
            String value = recordPatch.getValue();
            awsJsonWriter.name("Value");
            awsJsonWriter.value(value);
        }
        if (recordPatch.getSyncCount() != null) {
            Long syncCount = recordPatch.getSyncCount();
            awsJsonWriter.name("SyncCount");
            awsJsonWriter.value(syncCount);
        }
        if (recordPatch.getDeviceLastModifiedDate() != null) {
            Date deviceLastModifiedDate = recordPatch.getDeviceLastModifiedDate();
            awsJsonWriter.name("DeviceLastModifiedDate");
            awsJsonWriter.value(deviceLastModifiedDate);
        }
        awsJsonWriter.endObject();
    }
}
