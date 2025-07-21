package com.amazonaws.mobileconnectors.cognito.exceptions;

import com.amazonaws.AmazonClientException;

@Deprecated
/* loaded from: classes.dex */
public class UnsubscribeFailedException extends AmazonClientException {
    private static final long serialVersionUID = 5706724903415180392L;

    public UnsubscribeFailedException(String str, Throwable th) {
        super(str, th);
    }

    public UnsubscribeFailedException(String str) {
        super(str);
    }
}
