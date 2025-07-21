package com.amazonaws.services.kms.model.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.http.JsonErrorResponseHandler;
import com.amazonaws.services.kms.model.XksKeyNotFoundException;
import com.amazonaws.transform.JsonErrorUnmarshaller;

/* loaded from: classes2.dex */
public class XksKeyNotFoundExceptionUnmarshaller extends JsonErrorUnmarshaller {
    public XksKeyNotFoundExceptionUnmarshaller() {
        super(XksKeyNotFoundException.class);
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller
    public boolean match(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) throws Exception {
        return jsonErrorResponse.getErrorCode().equals("XksKeyNotFoundException");
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller, com.amazonaws.transform.Unmarshaller
    public AmazonServiceException unmarshall(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) throws Exception {
        XksKeyNotFoundException xksKeyNotFoundException = (XksKeyNotFoundException) super.unmarshall(jsonErrorResponse);
        xksKeyNotFoundException.setErrorCode("XksKeyNotFoundException");
        return xksKeyNotFoundException;
    }
}
