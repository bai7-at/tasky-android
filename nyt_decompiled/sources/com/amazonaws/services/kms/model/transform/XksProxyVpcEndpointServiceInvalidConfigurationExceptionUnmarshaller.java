package com.amazonaws.services.kms.model.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.http.JsonErrorResponseHandler;
import com.amazonaws.services.kms.model.XksProxyVpcEndpointServiceInvalidConfigurationException;
import com.amazonaws.transform.JsonErrorUnmarshaller;

/* loaded from: classes2.dex */
public class XksProxyVpcEndpointServiceInvalidConfigurationExceptionUnmarshaller extends JsonErrorUnmarshaller {
    public XksProxyVpcEndpointServiceInvalidConfigurationExceptionUnmarshaller() {
        super(XksProxyVpcEndpointServiceInvalidConfigurationException.class);
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller
    public boolean match(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) throws Exception {
        return jsonErrorResponse.getErrorCode().equals("XksProxyVpcEndpointServiceInvalidConfigurationException");
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller, com.amazonaws.transform.Unmarshaller
    public AmazonServiceException unmarshall(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) throws Exception {
        XksProxyVpcEndpointServiceInvalidConfigurationException xksProxyVpcEndpointServiceInvalidConfigurationException = (XksProxyVpcEndpointServiceInvalidConfigurationException) super.unmarshall(jsonErrorResponse);
        xksProxyVpcEndpointServiceInvalidConfigurationException.setErrorCode("XksProxyVpcEndpointServiceInvalidConfigurationException");
        return xksProxyVpcEndpointServiceInvalidConfigurationException;
    }
}
