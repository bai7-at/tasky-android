package com.amazonaws.services.dynamodbv2.model.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.http.JsonErrorResponseHandler;
import com.amazonaws.services.dynamodbv2.model.InvalidRestoreTimeException;
import com.amazonaws.transform.JsonErrorUnmarshaller;

/* loaded from: classes2.dex */
public class InvalidRestoreTimeExceptionUnmarshaller extends JsonErrorUnmarshaller {
    public InvalidRestoreTimeExceptionUnmarshaller() {
        super(InvalidRestoreTimeException.class);
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller
    public boolean match(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) throws Exception {
        return jsonErrorResponse.getErrorCode().equals("InvalidRestoreTimeException");
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller, com.amazonaws.transform.Unmarshaller
    public AmazonServiceException unmarshall(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) throws Exception {
        InvalidRestoreTimeException invalidRestoreTimeException = (InvalidRestoreTimeException) super.unmarshall(jsonErrorResponse);
        invalidRestoreTimeException.setErrorCode("InvalidRestoreTimeException");
        return invalidRestoreTimeException;
    }
}
