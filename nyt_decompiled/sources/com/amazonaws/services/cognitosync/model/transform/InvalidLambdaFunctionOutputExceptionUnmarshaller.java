package com.amazonaws.services.cognitosync.model.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.http.JsonErrorResponseHandler;
import com.amazonaws.services.cognitosync.model.InvalidLambdaFunctionOutputException;
import com.amazonaws.transform.JsonErrorUnmarshaller;

@Deprecated
/* loaded from: classes.dex */
public class InvalidLambdaFunctionOutputExceptionUnmarshaller extends JsonErrorUnmarshaller {
    public InvalidLambdaFunctionOutputExceptionUnmarshaller() {
        super(InvalidLambdaFunctionOutputException.class);
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller
    public boolean match(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) throws Exception {
        return jsonErrorResponse.getErrorCode().equals("InvalidLambdaFunctionOutputException");
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller, com.amazonaws.transform.Unmarshaller
    public AmazonServiceException unmarshall(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) throws Exception {
        InvalidLambdaFunctionOutputException invalidLambdaFunctionOutputException = (InvalidLambdaFunctionOutputException) super.unmarshall(jsonErrorResponse);
        invalidLambdaFunctionOutputException.setErrorCode("InvalidLambdaFunctionOutputException");
        return invalidLambdaFunctionOutputException;
    }
}
