package com.amazonaws.mobileconnectors.cognito.exceptions;

@Deprecated
/* loaded from: classes.dex */
public class DataAccessNotAuthorizedException extends DataStorageException {
    private static final long serialVersionUID = 5067700802587075978L;

    public DataAccessNotAuthorizedException(String str, Throwable th) {
        super(str, th);
    }

    public DataAccessNotAuthorizedException(String str) {
        super(str);
    }
}
