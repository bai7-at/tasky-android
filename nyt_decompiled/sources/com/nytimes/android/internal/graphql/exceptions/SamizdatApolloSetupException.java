package com.nytimes.android.internal.graphql.exceptions;

/* loaded from: classes4.dex */
public final class SamizdatApolloSetupException extends RuntimeException {
    private final String message;

    public SamizdatApolloSetupException(String str) {
        this.message = str;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }
}
