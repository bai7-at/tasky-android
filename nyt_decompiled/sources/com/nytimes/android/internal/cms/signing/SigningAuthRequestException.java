package com.nytimes.android.internal.cms.signing;

/* loaded from: classes4.dex */
public final class SigningAuthRequestException extends RuntimeException {
    private final Throwable cause;
    private final String message;

    public SigningAuthRequestException(String str, Throwable th) {
        this.message = str;
        this.cause = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }
}
