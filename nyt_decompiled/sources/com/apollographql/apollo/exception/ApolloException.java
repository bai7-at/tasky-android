package com.apollographql.apollo.exception;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public abstract class ApolloException extends RuntimeException {
    public /* synthetic */ ApolloException(String str, Throwable th, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, th);
    }

    private ApolloException(String str, Throwable th) {
        super(str, th);
    }

    public /* synthetic */ ApolloException(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : th, null);
    }
}
