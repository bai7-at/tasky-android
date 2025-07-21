package com.amazonaws.services.cognitosync.model.transform;

import com.amazonaws.services.cognitosync.model.UpdateRecordsResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

@Deprecated
/* loaded from: classes.dex */
public class UpdateRecordsResultJsonUnmarshaller implements Unmarshaller<UpdateRecordsResult, JsonUnmarshallerContext> {
    private static UpdateRecordsResultJsonUnmarshaller instance;

    public static UpdateRecordsResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new UpdateRecordsResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public UpdateRecordsResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        UpdateRecordsResult updateRecordsResult = new UpdateRecordsResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("Records")) {
                updateRecordsResult.setRecords(new ListUnmarshaller(RecordJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return updateRecordsResult;
    }
}
