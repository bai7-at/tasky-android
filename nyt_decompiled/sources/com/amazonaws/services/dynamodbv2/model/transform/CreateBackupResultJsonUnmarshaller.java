package com.amazonaws.services.dynamodbv2.model.transform;

import com.amazonaws.services.dynamodbv2.model.CreateBackupResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes2.dex */
public class CreateBackupResultJsonUnmarshaller implements Unmarshaller<CreateBackupResult, JsonUnmarshallerContext> {
    private static CreateBackupResultJsonUnmarshaller instance;

    public static CreateBackupResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new CreateBackupResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public CreateBackupResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        CreateBackupResult createBackupResult = new CreateBackupResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("BackupDetails")) {
                createBackupResult.setBackupDetails(BackupDetailsJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return createBackupResult;
    }
}
