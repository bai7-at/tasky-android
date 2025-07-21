package com.amazonaws.services.dynamodbv2.model.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.http.JsonErrorResponseHandler;
import com.amazonaws.services.dynamodbv2.model.GlobalTableAlreadyExistsException;
import com.amazonaws.transform.JsonErrorUnmarshaller;

/* loaded from: classes2.dex */
public class GlobalTableAlreadyExistsExceptionUnmarshaller extends JsonErrorUnmarshaller {
    public GlobalTableAlreadyExistsExceptionUnmarshaller() {
        super(GlobalTableAlreadyExistsException.class);
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller
    public boolean match(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) throws Exception {
        return jsonErrorResponse.getErrorCode().equals("GlobalTableAlreadyExistsException");
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller, com.amazonaws.transform.Unmarshaller
    public AmazonServiceException unmarshall(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) throws Exception {
        GlobalTableAlreadyExistsException globalTableAlreadyExistsException = (GlobalTableAlreadyExistsException) super.unmarshall(jsonErrorResponse);
        globalTableAlreadyExistsException.setErrorCode("GlobalTableAlreadyExistsException");
        return globalTableAlreadyExistsException;
    }
}
