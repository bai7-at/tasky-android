package com.amazonaws.services.dynamodbv2.model.transform;

import com.amazonaws.services.dynamodbv2.model.UpdateContinuousBackupsResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes2.dex */
public class UpdateContinuousBackupsResultJsonUnmarshaller implements Unmarshaller<UpdateContinuousBackupsResult, JsonUnmarshallerContext> {
    private static UpdateContinuousBackupsResultJsonUnmarshaller instance;

    public static UpdateContinuousBackupsResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new UpdateContinuousBackupsResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public UpdateContinuousBackupsResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        UpdateContinuousBackupsResult updateContinuousBackupsResult = new UpdateContinuousBackupsResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("ContinuousBackupsDescription")) {
                updateContinuousBackupsResult.setContinuousBackupsDescription(ContinuousBackupsDescriptionJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return updateContinuousBackupsResult;
    }
}
