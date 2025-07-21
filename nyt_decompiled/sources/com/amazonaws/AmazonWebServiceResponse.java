package com.amazonaws;

/* loaded from: classes.dex */
public class AmazonWebServiceResponse<T> {
    private ResponseMetadata responseMetadata;
    private T result;

    public String getRequestId() {
        ResponseMetadata responseMetadata = this.responseMetadata;
        if (responseMetadata == null) {
            return null;
        }
        return responseMetadata.getRequestId();
    }

    public ResponseMetadata getResponseMetadata() {
        return this.responseMetadata;
    }

    public T getResult() {
        return this.result;
    }

    public void setResponseMetadata(ResponseMetadata responseMetadata) {
        this.responseMetadata = responseMetadata;
    }

    public void setResult(T t) {
        this.result = t;
    }
}
