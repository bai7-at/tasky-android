package com.amazonaws.services.cognitosync.model.transform;

import com.amazonaws.services.cognitosync.model.RecordPatch;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

@Deprecated
/* loaded from: classes.dex */
class RecordPatchJsonUnmarshaller implements Unmarshaller<RecordPatch, JsonUnmarshallerContext> {
    private static RecordPatchJsonUnmarshaller instance;

    RecordPatchJsonUnmarshaller() {
    }

    public static RecordPatchJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new RecordPatchJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public RecordPatch unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        RecordPatch recordPatch = new RecordPatch();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("Op")) {
                recordPatch.setOp(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("Key")) {
                recordPatch.setKey(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("Value")) {
                recordPatch.setValue(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("SyncCount")) {
                recordPatch.setSyncCount(SimpleTypeJsonUnmarshallers.LongJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("DeviceLastModifiedDate")) {
                recordPatch.setDeviceLastModifiedDate(SimpleTypeJsonUnmarshallers.DateJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return recordPatch;
    }
}
