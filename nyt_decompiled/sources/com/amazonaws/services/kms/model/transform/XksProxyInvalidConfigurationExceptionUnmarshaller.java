package com.amazonaws.services.kms.model.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.http.JsonErrorResponseHandler;
import com.amazonaws.services.kms.model.XksProxyInvalidConfigurationException;
import com.amazonaws.transform.JsonErrorUnmarshaller;

/* loaded from: classes2.dex */
public class XksProxyInvalidConfigurationExceptionUnmarshaller extends JsonErrorUnmarshaller {
    public XksProxyInvalidConfigurationExceptionUnmarshaller() {
        super(XksProxyInvalidConfigurationException.class);
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller
    public boolean match(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) throws Exception {
        return jsonErrorResponse.getErrorCode().equals("XksProxyInvalidConfigurationException");
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller, com.amazonaws.transform.Unmarshaller
    public AmazonServiceException unmarshall(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) throws Exception {
        XksProxyInvalidConfigurationException xksProxyInvalidConfigurationException = (XksProxyInvalidConfigurationException) super.unmarshall(jsonErrorResponse);
        xksProxyInvalidConfigurationException.setErrorCode("XksProxyInvalidConfigurationException");
        return xksProxyInvalidConfigurationException;
    }
}
