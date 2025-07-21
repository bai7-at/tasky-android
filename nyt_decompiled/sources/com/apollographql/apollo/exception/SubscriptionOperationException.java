package com.apollographql.apollo.exception;

import defpackage.zq3;

/* loaded from: classes2.dex */
public final class SubscriptionOperationException extends ApolloException {
    private final Object payload;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriptionOperationException(String str, Object obj) {
        super("Operation error " + str, null, 2, null);
        zq3.h(str, "operationName");
        this.payload = obj;
    }
}
