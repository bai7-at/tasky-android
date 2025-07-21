package com.amazonaws.services.dynamodbv2.model.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.http.JsonErrorResponseHandler;
import com.amazonaws.services.dynamodbv2.model.ConditionalCheckFailedException;
import com.amazonaws.transform.JsonErrorUnmarshaller;

/* loaded from: classes2.dex */
public class ConditionalCheckFailedExceptionUnmarshaller extends JsonErrorUnmarshaller {
    public ConditionalCheckFailedExceptionUnmarshaller() {
        super(ConditionalCheckFailedException.class);
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller
    public boolean match(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) throws Exception {
        return jsonErrorResponse.getErrorCode().equals("ConditionalCheckFailedException");
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller, com.amazonaws.transform.Unmarshaller
    public AmazonServiceException unmarshall(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) throws Exception {
        ConditionalCheckFailedException conditionalCheckFailedException = (ConditionalCheckFailedException) super.unmarshall(jsonErrorResponse);
        conditionalCheckFailedException.setErrorCode("ConditionalCheckFailedException");
        return conditionalCheckFailedException;
    }
}
