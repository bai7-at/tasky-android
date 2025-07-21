package com.apollographql.apollo.exception;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class ApolloParseException extends ApolloException {
    /* JADX WARN: Multi-variable type inference failed */
    public ApolloParseException() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public ApolloParseException(String str, Throwable th) {
        super(str, th, null);
    }

    public /* synthetic */ ApolloParseException(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : th);
    }
}
