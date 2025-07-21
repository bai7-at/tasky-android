package com.amazonaws.services.dynamodbv2.model.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.http.JsonErrorResponseHandler;
import com.amazonaws.services.dynamodbv2.model.IndexNotFoundException;
import com.amazonaws.transform.JsonErrorUnmarshaller;

/* loaded from: classes2.dex */
public class IndexNotFoundExceptionUnmarshaller extends JsonErrorUnmarshaller {
    public IndexNotFoundExceptionUnmarshaller() {
        super(IndexNotFoundException.class);
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller
    public boolean match(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) throws Exception {
        return jsonErrorResponse.getErrorCode().equals("IndexNotFoundException");
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller, com.amazonaws.transform.Unmarshaller
    public AmazonServiceException unmarshall(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) throws Exception {
        IndexNotFoundException indexNotFoundException = (IndexNotFoundException) super.unmarshall(jsonErrorResponse);
        indexNotFoundException.setErrorCode("IndexNotFoundException");
        return indexNotFoundException;
    }
}
