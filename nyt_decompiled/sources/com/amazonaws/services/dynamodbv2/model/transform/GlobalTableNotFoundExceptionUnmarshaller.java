package com.amazonaws.services.dynamodbv2.model.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.http.JsonErrorResponseHandler;
import com.amazonaws.services.dynamodbv2.model.GlobalTableNotFoundException;
import com.amazonaws.transform.JsonErrorUnmarshaller;

/* loaded from: classes2.dex */
public class GlobalTableNotFoundExceptionUnmarshaller extends JsonErrorUnmarshaller {
    public GlobalTableNotFoundExceptionUnmarshaller() {
        super(GlobalTableNotFoundException.class);
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller
    public boolean match(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) throws Exception {
        return jsonErrorResponse.getErrorCode().equals("GlobalTableNotFoundException");
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller, com.amazonaws.transform.Unmarshaller
    public AmazonServiceException unmarshall(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) throws Exception {
        GlobalTableNotFoundException globalTableNotFoundException = (GlobalTableNotFoundException) super.unmarshall(jsonErrorResponse);
        globalTableNotFoundException.setErrorCode("GlobalTableNotFoundException");
        return globalTableNotFoundException;
    }
}
