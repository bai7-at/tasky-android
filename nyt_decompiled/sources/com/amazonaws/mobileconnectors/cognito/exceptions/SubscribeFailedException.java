package com.amazonaws.mobileconnectors.cognito.exceptions;

import com.amazonaws.AmazonClientException;

@Deprecated
/* loaded from: classes.dex */
public class SubscribeFailedException extends AmazonClientException {
    private static final long serialVersionUID = 5706724903415180392L;

    public SubscribeFailedException(String str, Throwable th) {
        super(str, th);
    }

    public SubscribeFailedException(String str) {
        super(str);
    }
}
