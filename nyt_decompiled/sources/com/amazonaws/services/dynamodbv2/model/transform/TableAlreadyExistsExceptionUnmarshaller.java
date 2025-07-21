package com.amazonaws.services.dynamodbv2.model.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.http.JsonErrorResponseHandler;
import com.amazonaws.services.dynamodbv2.model.TableAlreadyExistsException;
import com.amazonaws.transform.JsonErrorUnmarshaller;

/* loaded from: classes2.dex */
public class TableAlreadyExistsExceptionUnmarshaller extends JsonErrorUnmarshaller {
    public TableAlreadyExistsExceptionUnmarshaller() {
        super(TableAlreadyExistsException.class);
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller
    public boolean match(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) throws Exception {
        return jsonErrorResponse.getErrorCode().equals("TableAlreadyExistsException");
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller, com.amazonaws.transform.Unmarshaller
    public AmazonServiceException unmarshall(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) throws Exception {
        TableAlreadyExistsException tableAlreadyExistsException = (TableAlreadyExistsException) super.unmarshall(jsonErrorResponse);
        tableAlreadyExistsException.setErrorCode("TableAlreadyExistsException");
        return tableAlreadyExistsException;
    }
}
