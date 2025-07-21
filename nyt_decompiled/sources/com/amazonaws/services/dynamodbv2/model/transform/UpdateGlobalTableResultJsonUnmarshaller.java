package com.amazonaws.services.dynamodbv2.model.transform;

import com.amazonaws.services.dynamodbv2.model.UpdateGlobalTableResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes2.dex */
public class UpdateGlobalTableResultJsonUnmarshaller implements Unmarshaller<UpdateGlobalTableResult, JsonUnmarshallerContext> {
    private static UpdateGlobalTableResultJsonUnmarshaller instance;

    public static UpdateGlobalTableResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new UpdateGlobalTableResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public UpdateGlobalTableResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        UpdateGlobalTableResult updateGlobalTableResult = new UpdateGlobalTableResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("GlobalTableDescription")) {
                updateGlobalTableResult.setGlobalTableDescription(GlobalTableDescriptionJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return updateGlobalTableResult;
    }
}
