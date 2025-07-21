package com.amazonaws.mobileconnectors.cognito.exceptions;

import com.amazonaws.AmazonClientException;

@Deprecated
/* loaded from: classes.dex */
public class DataStorageException extends AmazonClientException {
    private static final long serialVersionUID = -6906342391685175623L;

    public DataStorageException(String str, Throwable th) {
        super(str, th);
    }

    public DataStorageException(String str) {
        super(str);
    }
}
