package com.apollographql.apollo.exception;

/* loaded from: classes2.dex */
public final class ApolloWebSocketForceCloseException extends ApolloException {
    public static final ApolloWebSocketForceCloseException a = new ApolloWebSocketForceCloseException();

    private ApolloWebSocketForceCloseException() {
        super("closeConnection() was called", null, 2, null);
    }

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof ApolloWebSocketForceCloseException);
    }

    public int hashCode() {
        return 1630789127;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "ApolloWebSocketForceCloseException";
    }
}
