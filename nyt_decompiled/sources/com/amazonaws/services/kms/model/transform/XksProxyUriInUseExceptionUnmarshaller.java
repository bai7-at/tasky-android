package com.amazonaws.services.kms.model.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.http.JsonErrorResponseHandler;
import com.amazonaws.services.kms.model.XksProxyUriInUseException;
import com.amazonaws.transform.JsonErrorUnmarshaller;

/* loaded from: classes2.dex */
public class XksProxyUriInUseExceptionUnmarshaller extends JsonErrorUnmarshaller {
    public XksProxyUriInUseExceptionUnmarshaller() {
        super(XksProxyUriInUseException.class);
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller
    public boolean match(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) throws Exception {
        return jsonErrorResponse.getErrorCode().equals("XksProxyUriInUseException");
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller, com.amazonaws.transform.Unmarshaller
    public AmazonServiceException unmarshall(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) throws Exception {
        XksProxyUriInUseException xksProxyUriInUseException = (XksProxyUriInUseException) super.unmarshall(jsonErrorResponse);
        xksProxyUriInUseException.setErrorCode("XksProxyUriInUseException");
        return xksProxyUriInUseException;
    }
}
