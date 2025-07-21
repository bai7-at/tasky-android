package com.amazonaws.mobileconnectors.cognito.exceptions;

import com.amazonaws.AmazonClientException;

@Deprecated
/* loaded from: classes.dex */
public class RegistrationFailedException extends AmazonClientException {
    private static final long serialVersionUID = 5706724903415180392L;

    public RegistrationFailedException(String str, Throwable th) {
        super(str, th);
    }

    public RegistrationFailedException(String str) {
        super(str);
    }
}
