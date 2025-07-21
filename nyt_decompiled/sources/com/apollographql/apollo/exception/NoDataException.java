package com.apollographql.apollo.exception;

/* loaded from: classes2.dex */
public final class NoDataException extends ApolloException {
    public NoDataException(Throwable th) {
        super("No data was found", th, null);
    }
}
