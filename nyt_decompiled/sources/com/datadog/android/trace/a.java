package com.datadog.android.trace;

import defpackage.tx7;
import defpackage.zq3;

/* loaded from: classes2.dex */
public abstract class a {
    public static final void a(tx7 tx7Var, String str) {
        zq3.h(tx7Var, "<this>");
        zq3.h(str, "message");
        AndroidTracer.B.a(tx7Var, str);
    }

    public static final void b(tx7 tx7Var, Throwable th) {
        zq3.h(tx7Var, "<this>");
        zq3.h(th, "throwable");
        AndroidTracer.B.b(tx7Var, th);
    }
}
