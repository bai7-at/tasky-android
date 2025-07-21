package com.amazonaws.services.dynamodbv2.model.transform;

import com.amazonaws.services.dynamodbv2.model.DescribeBackupResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes2.dex */
public class DescribeBackupResultJsonUnmarshaller implements Unmarshaller<DescribeBackupResult, JsonUnmarshallerContext> {
    private static DescribeBackupResultJsonUnmarshaller instance;

    public static DescribeBackupResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new DescribeBackupResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public DescribeBackupResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        DescribeBackupResult describeBackupResult = new DescribeBackupResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("BackupDescription")) {
                describeBackupResult.setBackupDescription(BackupDescriptionJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return describeBackupResult;
    }
}
