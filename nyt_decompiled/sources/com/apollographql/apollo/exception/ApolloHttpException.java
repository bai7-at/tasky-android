package com.apollographql.apollo.exception;

import defpackage.sd0;
import defpackage.va3;
import defpackage.zq3;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class ApolloHttpException extends ApolloException {
    private final sd0 body;
    private final List<va3> headers;
    private final int statusCode;

    public /* synthetic */ ApolloHttpException(int i, List list, sd0 sd0Var, String str, Throwable th, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, list, sd0Var, str, (i2 & 16) != 0 ? null : th);
    }

    public final int a() {
        return this.statusCode;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApolloHttpException(int i, List list, sd0 sd0Var, String str, Throwable th) {
        super(str, th, null);
        zq3.h(list, "headers");
        zq3.h(str, "message");
        this.statusCode = i;
        this.headers = list;
        this.body = sd0Var;
    }
}
