package com.amazonaws.services.dynamodbv2.model.transform;

import com.amazonaws.services.dynamodbv2.model.RestoreTableFromBackupResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes2.dex */
public class RestoreTableFromBackupResultJsonUnmarshaller implements Unmarshaller<RestoreTableFromBackupResult, JsonUnmarshallerContext> {
    private static RestoreTableFromBackupResultJsonUnmarshaller instance;

    public static RestoreTableFromBackupResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new RestoreTableFromBackupResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public RestoreTableFromBackupResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        RestoreTableFromBackupResult restoreTableFromBackupResult = new RestoreTableFromBackupResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("TableDescription")) {
                restoreTableFromBackupResult.setTableDescription(TableDescriptionJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return restoreTableFromBackupResult;
    }
}
