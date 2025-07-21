package com.amazonaws.services.dynamodbv2.model.transform;

import com.amazonaws.services.dynamodbv2.model.UpdateGlobalTableSettingsResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes2.dex */
public class UpdateGlobalTableSettingsResultJsonUnmarshaller implements Unmarshaller<UpdateGlobalTableSettingsResult, JsonUnmarshallerContext> {
    private static UpdateGlobalTableSettingsResultJsonUnmarshaller instance;

    public static UpdateGlobalTableSettingsResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new UpdateGlobalTableSettingsResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public UpdateGlobalTableSettingsResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        UpdateGlobalTableSettingsResult updateGlobalTableSettingsResult = new UpdateGlobalTableSettingsResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("GlobalTableName")) {
                updateGlobalTableSettingsResult.setGlobalTableName(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("ReplicaSettings")) {
                updateGlobalTableSettingsResult.setReplicaSettings(new ListUnmarshaller(ReplicaSettingsDescriptionJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return updateGlobalTableSettingsResult;
    }
}
