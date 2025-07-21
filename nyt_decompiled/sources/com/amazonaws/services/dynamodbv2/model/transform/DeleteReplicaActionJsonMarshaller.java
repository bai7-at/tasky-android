package com.amazonaws.services.dynamodbv2.model.transform;

import com.amazonaws.services.dynamodbv2.model.DeleteReplicaAction;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes2.dex */
class DeleteReplicaActionJsonMarshaller {
    private static DeleteReplicaActionJsonMarshaller instance;

    DeleteReplicaActionJsonMarshaller() {
    }

    public static DeleteReplicaActionJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new DeleteReplicaActionJsonMarshaller();
        }
        return instance;
    }

    public void marshall(DeleteReplicaAction deleteReplicaAction, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (deleteReplicaAction.getRegionName() != null) {
            String regionName = deleteReplicaAction.getRegionName();
            awsJsonWriter.name("RegionName");
            awsJsonWriter.value(regionName);
        }
        awsJsonWriter.endObject();
    }
}
