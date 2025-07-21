package com.amazonaws.mobileconnectors.cognito.exceptions;

@Deprecated
/* loaded from: classes.dex */
public class NetworkException extends DataStorageException {
    private static final long serialVersionUID = 8685123233927843893L;

    public NetworkException(String str, Throwable th) {
        super(str, th);
    }

    public NetworkException(String str) {
        super(str);
    }
}
