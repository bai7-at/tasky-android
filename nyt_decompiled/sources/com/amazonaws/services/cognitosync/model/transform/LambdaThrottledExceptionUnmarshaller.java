package com.amazonaws.services.cognitosync.model.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.http.JsonErrorResponseHandler;
import com.amazonaws.services.cognitosync.model.LambdaThrottledException;
import com.amazonaws.transform.JsonErrorUnmarshaller;

@Deprecated
/* loaded from: classes.dex */
public class LambdaThrottledExceptionUnmarshaller extends JsonErrorUnmarshaller {
    public LambdaThrottledExceptionUnmarshaller() {
        super(LambdaThrottledException.class);
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller
    public boolean match(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) throws Exception {
        return jsonErrorResponse.getErrorCode().equals("LambdaThrottledException");
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller, com.amazonaws.transform.Unmarshaller
    public AmazonServiceException unmarshall(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) throws Exception {
        LambdaThrottledException lambdaThrottledException = (LambdaThrottledException) super.unmarshall(jsonErrorResponse);
        lambdaThrottledException.setErrorCode("LambdaThrottledException");
        return lambdaThrottledException;
    }
}
