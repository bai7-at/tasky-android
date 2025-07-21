package com.amazonaws.mobileconnectors.cognito.exceptions;

@Deprecated
/* loaded from: classes.dex */
public class DataConflictException extends DataStorageException {
    private static final long serialVersionUID = 4937963535057299466L;

    public DataConflictException(String str, Throwable th) {
        super(str, th);
    }

    public DataConflictException(String str) {
        super(str);
    }
}
