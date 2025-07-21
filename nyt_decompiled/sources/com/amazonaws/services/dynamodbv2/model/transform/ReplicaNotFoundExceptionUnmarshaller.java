package com.amazonaws.services.dynamodbv2.model.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.http.JsonErrorResponseHandler;
import com.amazonaws.services.dynamodbv2.model.ReplicaNotFoundException;
import com.amazonaws.transform.JsonErrorUnmarshaller;

/* loaded from: classes2.dex */
public class ReplicaNotFoundExceptionUnmarshaller extends JsonErrorUnmarshaller {
    public ReplicaNotFoundExceptionUnmarshaller() {
        super(ReplicaNotFoundException.class);
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller
    public boolean match(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) throws Exception {
        return jsonErrorResponse.getErrorCode().equals("ReplicaNotFoundException");
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller, com.amazonaws.transform.Unmarshaller
    public AmazonServiceException unmarshall(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) throws Exception {
        ReplicaNotFoundException replicaNotFoundException = (ReplicaNotFoundException) super.unmarshall(jsonErrorResponse);
        replicaNotFoundException.setErrorCode("ReplicaNotFoundException");
        return replicaNotFoundException;
    }
}
