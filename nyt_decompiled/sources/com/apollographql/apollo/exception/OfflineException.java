package com.apollographql.apollo.exception;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class OfflineException extends IOException {
    public static final OfflineException a = new OfflineException();

    private OfflineException() {
        super("The device is offline");
    }

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof OfflineException);
    }

    public int hashCode() {
        return -155984151;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "OfflineException";
    }
}
