package com.amazonaws.mobileconnectors.cognito.exceptions;

@Deprecated
/* loaded from: classes.dex */
public class DataLimitExceededException extends DataStorageException {
    private static final long serialVersionUID = 4722137117318719134L;

    public DataLimitExceededException(String str, Throwable th) {
        super(str, th);
    }

    public DataLimitExceededException(String str) {
        super(str);
    }
}
