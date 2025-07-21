package com.amazonaws.services.dynamodbv2.model.transform;

import com.amazonaws.services.dynamodbv2.model.Capacity;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes2.dex */
class CapacityJsonMarshaller {
    private static CapacityJsonMarshaller instance;

    CapacityJsonMarshaller() {
    }

    public static CapacityJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new CapacityJsonMarshaller();
        }
        return instance;
    }

    public void marshall(Capacity capacity, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (capacity.getCapacityUnits() != null) {
            Double capacityUnits = capacity.getCapacityUnits();
            awsJsonWriter.name("CapacityUnits");
            awsJsonWriter.value(capacityUnits);
        }
        awsJsonWriter.endObject();
    }
}
