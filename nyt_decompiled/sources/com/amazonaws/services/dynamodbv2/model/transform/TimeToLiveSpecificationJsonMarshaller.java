package com.amazonaws.services.dynamodbv2.model.transform;

import com.amazonaws.services.dynamodbv2.model.TimeToLiveSpecification;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes2.dex */
class TimeToLiveSpecificationJsonMarshaller {
    private static TimeToLiveSpecificationJsonMarshaller instance;

    TimeToLiveSpecificationJsonMarshaller() {
    }

    public static TimeToLiveSpecificationJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new TimeToLiveSpecificationJsonMarshaller();
        }
        return instance;
    }

    public void marshall(TimeToLiveSpecification timeToLiveSpecification, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (timeToLiveSpecification.getEnabled() != null) {
            Boolean enabled = timeToLiveSpecification.getEnabled();
            awsJsonWriter.name("Enabled");
            awsJsonWriter.value(enabled.booleanValue());
        }
        if (timeToLiveSpecification.getAttributeName() != null) {
            String attributeName = timeToLiveSpecification.getAttributeName();
            awsJsonWriter.name("AttributeName");
            awsJsonWriter.value(attributeName);
        }
        awsJsonWriter.endObject();
    }
}
