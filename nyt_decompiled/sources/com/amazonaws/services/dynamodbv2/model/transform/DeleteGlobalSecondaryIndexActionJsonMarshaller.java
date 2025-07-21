package com.amazonaws.services.dynamodbv2.model.transform;

import com.amazonaws.services.dynamodbv2.model.DeleteGlobalSecondaryIndexAction;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes2.dex */
class DeleteGlobalSecondaryIndexActionJsonMarshaller {
    private static DeleteGlobalSecondaryIndexActionJsonMarshaller instance;

    DeleteGlobalSecondaryIndexActionJsonMarshaller() {
    }

    public static DeleteGlobalSecondaryIndexActionJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new DeleteGlobalSecondaryIndexActionJsonMarshaller();
        }
        return instance;
    }

    public void marshall(DeleteGlobalSecondaryIndexAction deleteGlobalSecondaryIndexAction, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (deleteGlobalSecondaryIndexAction.getIndexName() != null) {
            String indexName = deleteGlobalSecondaryIndexAction.getIndexName();
            awsJsonWriter.name("IndexName");
            awsJsonWriter.value(indexName);
        }
        awsJsonWriter.endObject();
    }
}
