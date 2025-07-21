package com.amazonaws.services.kms.model.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.http.JsonErrorResponseHandler;
import com.amazonaws.services.kms.model.XksKeyInvalidConfigurationException;
import com.amazonaws.transform.JsonErrorUnmarshaller;

/* loaded from: classes2.dex */
public class XksKeyInvalidConfigurationExceptionUnmarshaller extends JsonErrorUnmarshaller {
    public XksKeyInvalidConfigurationExceptionUnmarshaller() {
        super(XksKeyInvalidConfigurationException.class);
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller
    public boolean match(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) throws Exception {
        return jsonErrorResponse.getErrorCode().equals("XksKeyInvalidConfigurationException");
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller, com.amazonaws.transform.Unmarshaller
    public AmazonServiceException unmarshall(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) throws Exception {
        XksKeyInvalidConfigurationException xksKeyInvalidConfigurationException = (XksKeyInvalidConfigurationException) super.unmarshall(jsonErrorResponse);
        xksKeyInvalidConfigurationException.setErrorCode("XksKeyInvalidConfigurationException");
        return xksKeyInvalidConfigurationException;
    }
}
