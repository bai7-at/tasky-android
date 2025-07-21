package com.apollographql.apollo.network.http;

import defpackage.qs2;
import defpackage.sa3;
import defpackage.zq3;

/* loaded from: classes2.dex */
public abstract class a {
    public static final sa3 a(long j) {
        return new JvmHttpEngine(j);
    }

    public static final sa3 b(qs2 qs2Var) {
        zq3.h(qs2Var, "httpCallFactory");
        return new JvmHttpEngine(qs2Var);
    }

    public static /* synthetic */ sa3 c(long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 60000;
        }
        return a(j);
    }
}
