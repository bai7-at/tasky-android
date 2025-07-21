package com.amazonaws.services.dynamodbv2.model.transform;

import com.amazonaws.services.dynamodbv2.model.AutoScalingSettingsUpdate;
import com.amazonaws.services.dynamodbv2.model.ReplicaGlobalSecondaryIndexSettingsUpdate;
import com.amazonaws.services.dynamodbv2.model.ReplicaSettingsUpdate;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.List;

/* loaded from: classes2.dex */
class ReplicaSettingsUpdateJsonMarshaller {
    private static ReplicaSettingsUpdateJsonMarshaller instance;

    ReplicaSettingsUpdateJsonMarshaller() {
    }

    public static ReplicaSettingsUpdateJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new ReplicaSettingsUpdateJsonMarshaller();
        }
        return instance;
    }

    public void marshall(ReplicaSettingsUpdate replicaSettingsUpdate, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (replicaSettingsUpdate.getRegionName() != null) {
            String regionName = replicaSettingsUpdate.getRegionName();
            awsJsonWriter.name("RegionName");
            awsJsonWriter.value(regionName);
        }
        if (replicaSettingsUpdate.getReplicaProvisionedReadCapacityUnits() != null) {
            Long replicaProvisionedReadCapacityUnits = replicaSettingsUpdate.getReplicaProvisionedReadCapacityUnits();
            awsJsonWriter.name("ReplicaProvisionedReadCapacityUnits");
            awsJsonWriter.value(replicaProvisionedReadCapacityUnits);
        }
        if (replicaSettingsUpdate.getReplicaProvisionedReadCapacityAutoScalingSettingsUpdate() != null) {
            AutoScalingSettingsUpdate replicaProvisionedReadCapacityAutoScalingSettingsUpdate = replicaSettingsUpdate.getReplicaProvisionedReadCapacityAutoScalingSettingsUpdate();
            awsJsonWriter.name("ReplicaProvisionedReadCapacityAutoScalingSettingsUpdate");
            AutoScalingSettingsUpdateJsonMarshaller.getInstance().marshall(replicaProvisionedReadCapacityAutoScalingSettingsUpdate, awsJsonWriter);
        }
        if (replicaSettingsUpdate.getReplicaGlobalSecondaryIndexSettingsUpdate() != null) {
            List<ReplicaGlobalSecondaryIndexSettingsUpdate> replicaGlobalSecondaryIndexSettingsUpdate = replicaSettingsUpdate.getReplicaGlobalSecondaryIndexSettingsUpdate();
            awsJsonWriter.name("ReplicaGlobalSecondaryIndexSettingsUpdate");
            awsJsonWriter.beginArray();
            for (ReplicaGlobalSecondaryIndexSettingsUpdate replicaGlobalSecondaryIndexSettingsUpdate2 : replicaGlobalSecondaryIndexSettingsUpdate) {
                if (replicaGlobalSecondaryIndexSettingsUpdate2 != null) {
                    ReplicaGlobalSecondaryIndexSettingsUpdateJsonMarshaller.getInstance().marshall(replicaGlobalSecondaryIndexSettingsUpdate2, awsJsonWriter);
                }
            }
            awsJsonWriter.endArray();
        }
        awsJsonWriter.endObject();
    }
}
