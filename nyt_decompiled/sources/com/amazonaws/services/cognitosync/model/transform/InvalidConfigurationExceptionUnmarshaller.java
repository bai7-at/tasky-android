package com.amazonaws.services.cognitosync.model.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.http.JsonErrorResponseHandler;
import com.amazonaws.services.cognitosync.model.InvalidConfigurationException;
import com.amazonaws.transform.JsonErrorUnmarshaller;

@Deprecated
/* loaded from: classes.dex */
public class InvalidConfigurationExceptionUnmarshaller extends JsonErrorUnmarshaller {
    public InvalidConfigurationExceptionUnmarshaller() {
        super(InvalidConfigurationException.class);
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller
    public boolean match(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) throws Exception {
        return jsonErrorResponse.getErrorCode().equals("InvalidConfigurationException");
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller, com.amazonaws.transform.Unmarshaller
    public AmazonServiceException unmarshall(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) throws Exception {
        InvalidConfigurationException invalidConfigurationException = (InvalidConfigurationException) super.unmarshall(jsonErrorResponse);
        invalidConfigurationException.setErrorCode("InvalidConfigurationException");
        return invalidConfigurationException;
    }
}
