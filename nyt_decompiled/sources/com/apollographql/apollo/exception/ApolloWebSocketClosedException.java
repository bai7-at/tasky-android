package com.apollographql.apollo.exception;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class ApolloWebSocketClosedException extends ApolloException {
    private final int code;
    private final String reason;

    public /* synthetic */ ApolloWebSocketClosedException(int i, String str, Throwable th, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : th);
    }

    public ApolloWebSocketClosedException(int i, String str, Throwable th) {
        super("WebSocket Closed code='" + i + "' reason='" + str + '\'', th, null);
        this.code = i;
        this.reason = str;
    }
}
