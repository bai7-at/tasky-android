package com.amazonaws.services.dynamodbv2.model.transform;

import com.amazonaws.services.dynamodbv2.model.CreateReplicaAction;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes2.dex */
class CreateReplicaActionJsonMarshaller {
    private static CreateReplicaActionJsonMarshaller instance;

    CreateReplicaActionJsonMarshaller() {
    }

    public static CreateReplicaActionJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new CreateReplicaActionJsonMarshaller();
        }
        return instance;
    }

    public void marshall(CreateReplicaAction createReplicaAction, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (createReplicaAction.getRegionName() != null) {
            String regionName = createReplicaAction.getRegionName();
            awsJsonWriter.name("RegionName");
            awsJsonWriter.value(regionName);
        }
        awsJsonWriter.endObject();
    }
}
