package com.amazonaws.services.dynamodbv2.model.transform;

import com.amazonaws.services.dynamodbv2.model.Endpoint;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes2.dex */
class EndpointJsonMarshaller {
    private static EndpointJsonMarshaller instance;

    EndpointJsonMarshaller() {
    }

    public static EndpointJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new EndpointJsonMarshaller();
        }
        return instance;
    }

    public void marshall(Endpoint endpoint, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (endpoint.getAddress() != null) {
            String address = endpoint.getAddress();
            awsJsonWriter.name("Address");
            awsJsonWriter.value(address);
        }
        if (endpoint.getCachePeriodInMinutes() != null) {
            Long cachePeriodInMinutes = endpoint.getCachePeriodInMinutes();
            awsJsonWriter.name("CachePeriodInMinutes");
            awsJsonWriter.value(cachePeriodInMinutes);
        }
        awsJsonWriter.endObject();
    }
}
