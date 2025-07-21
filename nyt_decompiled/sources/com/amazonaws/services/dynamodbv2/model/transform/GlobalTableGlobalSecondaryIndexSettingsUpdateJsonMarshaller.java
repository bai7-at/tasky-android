package com.amazonaws.services.dynamodbv2.model.transform;

import com.amazonaws.services.dynamodbv2.model.AutoScalingSettingsUpdate;
import com.amazonaws.services.dynamodbv2.model.GlobalTableGlobalSecondaryIndexSettingsUpdate;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes2.dex */
class GlobalTableGlobalSecondaryIndexSettingsUpdateJsonMarshaller {
    private static GlobalTableGlobalSecondaryIndexSettingsUpdateJsonMarshaller instance;

    GlobalTableGlobalSecondaryIndexSettingsUpdateJsonMarshaller() {
    }

    public static GlobalTableGlobalSecondaryIndexSettingsUpdateJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new GlobalTableGlobalSecondaryIndexSettingsUpdateJsonMarshaller();
        }
        return instance;
    }

    public void marshall(GlobalTableGlobalSecondaryIndexSettingsUpdate globalTableGlobalSecondaryIndexSettingsUpdate, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (globalTableGlobalSecondaryIndexSettingsUpdate.getIndexName() != null) {
            String indexName = globalTableGlobalSecondaryIndexSettingsUpdate.getIndexName();
            awsJsonWriter.name("IndexName");
            awsJsonWriter.value(indexName);
        }
        if (globalTableGlobalSecondaryIndexSettingsUpdate.getProvisionedWriteCapacityUnits() != null) {
            Long provisionedWriteCapacityUnits = globalTableGlobalSecondaryIndexSettingsUpdate.getProvisionedWriteCapacityUnits();
            awsJsonWriter.name("ProvisionedWriteCapacityUnits");
            awsJsonWriter.value(provisionedWriteCapacityUnits);
        }
        if (globalTableGlobalSecondaryIndexSettingsUpdate.getProvisionedWriteCapacityAutoScalingSettingsUpdate() != null) {
            AutoScalingSettingsUpdate provisionedWriteCapacityAutoScalingSettingsUpdate = globalTableGlobalSecondaryIndexSettingsUpdate.getProvisionedWriteCapacityAutoScalingSettingsUpdate();
            awsJsonWriter.name("ProvisionedWriteCapacityAutoScalingSettingsUpdate");
            AutoScalingSettingsUpdateJsonMarshaller.getInstance().marshall(provisionedWriteCapacityAutoScalingSettingsUpdate, awsJsonWriter);
        }
        awsJsonWriter.endObject();
    }
}
