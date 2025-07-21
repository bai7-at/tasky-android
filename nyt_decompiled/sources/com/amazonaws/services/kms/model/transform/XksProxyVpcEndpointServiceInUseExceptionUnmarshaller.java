package com.amazonaws.services.kms.model.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.http.JsonErrorResponseHandler;
import com.amazonaws.services.kms.model.XksProxyVpcEndpointServiceInUseException;
import com.amazonaws.transform.JsonErrorUnmarshaller;

/* loaded from: classes2.dex */
public class XksProxyVpcEndpointServiceInUseExceptionUnmarshaller extends JsonErrorUnmarshaller {
    public XksProxyVpcEndpointServiceInUseExceptionUnmarshaller() {
        super(XksProxyVpcEndpointServiceInUseException.class);
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller
    public boolean match(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) throws Exception {
        return jsonErrorResponse.getErrorCode().equals("XksProxyVpcEndpointServiceInUseException");
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller, com.amazonaws.transform.Unmarshaller
    public AmazonServiceException unmarshall(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) throws Exception {
        XksProxyVpcEndpointServiceInUseException xksProxyVpcEndpointServiceInUseException = (XksProxyVpcEndpointServiceInUseException) super.unmarshall(jsonErrorResponse);
        xksProxyVpcEndpointServiceInUseException.setErrorCode("XksProxyVpcEndpointServiceInUseException");
        return xksProxyVpcEndpointServiceInUseException;
    }
}
