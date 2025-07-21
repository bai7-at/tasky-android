package com.apollographql.apollo.exception;

import defpackage.zq3;

/* loaded from: classes2.dex */
public final class JsonDataException extends ApolloException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonDataException(String str) {
        super(str, null, 2, null);
        zq3.h(str, "message");
    }
}
