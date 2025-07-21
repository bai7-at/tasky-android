package com.amazonaws.services.dynamodbv2.model.transform;

import com.amazonaws.services.dynamodbv2.model.GlobalSecondaryIndexInfo;
import com.amazonaws.services.dynamodbv2.model.KeySchemaElement;
import com.amazonaws.services.dynamodbv2.model.Projection;
import com.amazonaws.services.dynamodbv2.model.ProvisionedThroughput;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.List;

/* loaded from: classes2.dex */
class GlobalSecondaryIndexInfoJsonMarshaller {
    private static GlobalSecondaryIndexInfoJsonMarshaller instance;

    GlobalSecondaryIndexInfoJsonMarshaller() {
    }

    public static GlobalSecondaryIndexInfoJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new GlobalSecondaryIndexInfoJsonMarshaller();
        }
        return instance;
    }

    public void marshall(GlobalSecondaryIndexInfo globalSecondaryIndexInfo, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (globalSecondaryIndexInfo.getIndexName() != null) {
            String indexName = globalSecondaryIndexInfo.getIndexName();
            awsJsonWriter.name("IndexName");
            awsJsonWriter.value(indexName);
        }
        if (globalSecondaryIndexInfo.getKeySchema() != null) {
            List<KeySchemaElement> keySchema = globalSecondaryIndexInfo.getKeySchema();
            awsJsonWriter.name("KeySchema");
            awsJsonWriter.beginArray();
            for (KeySchemaElement keySchemaElement : keySchema) {
                if (keySchemaElement != null) {
                    KeySchemaElementJsonMarshaller.getInstance().marshall(keySchemaElement, awsJsonWriter);
                }
            }
            awsJsonWriter.endArray();
        }
        if (globalSecondaryIndexInfo.getProjection() != null) {
            Projection projection = globalSecondaryIndexInfo.getProjection();
            awsJsonWriter.name("Projection");
            ProjectionJsonMarshaller.getInstance().marshall(projection, awsJsonWriter);
        }
        if (globalSecondaryIndexInfo.getProvisionedThroughput() != null) {
            ProvisionedThroughput provisionedThroughput = globalSecondaryIndexInfo.getProvisionedThroughput();
            awsJsonWriter.name("ProvisionedThroughput");
            ProvisionedThroughputJsonMarshaller.getInstance().marshall(provisionedThroughput, awsJsonWriter);
        }
        awsJsonWriter.endObject();
    }
}
