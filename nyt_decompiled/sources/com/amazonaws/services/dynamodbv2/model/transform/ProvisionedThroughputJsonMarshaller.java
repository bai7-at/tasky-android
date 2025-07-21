package com.amazonaws.services.dynamodbv2.model.transform;

import com.amazonaws.services.dynamodbv2.model.ProvisionedThroughput;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes2.dex */
class ProvisionedThroughputJsonMarshaller {
    private static ProvisionedThroughputJsonMarshaller instance;

    ProvisionedThroughputJsonMarshaller() {
    }

    public static ProvisionedThroughputJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new ProvisionedThroughputJsonMarshaller();
        }
        return instance;
    }

    public void marshall(ProvisionedThroughput provisionedThroughput, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (provisionedThroughput.getReadCapacityUnits() != null) {
            Long readCapacityUnits = provisionedThroughput.getReadCapacityUnits();
            awsJsonWriter.name("ReadCapacityUnits");
            awsJsonWriter.value(readCapacityUnits);
        }
        if (provisionedThroughput.getWriteCapacityUnits() != null) {
            Long writeCapacityUnits = provisionedThroughput.getWriteCapacityUnits();
            awsJsonWriter.name("WriteCapacityUnits");
            awsJsonWriter.value(writeCapacityUnits);
        }
        awsJsonWriter.endObject();
    }
}
