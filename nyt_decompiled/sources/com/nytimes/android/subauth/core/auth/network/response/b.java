package com.nytimes.android.subauth.core.auth.network.response;

import com.nytimes.android.subauth.core.auth.network.response.a;
import defpackage.kl5;
import defpackage.rz;
import defpackage.zq3;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes4.dex */
public abstract class b {
    public static final a a(kl5 kl5Var) {
        zq3.h(kl5Var, "<this>");
        if (zq3.c(kl5Var, kl5.c.a)) {
            return a.C0413a.a;
        }
        if (zq3.c(kl5Var, kl5.d.a)) {
            return a.b.a;
        }
        if (zq3.c(kl5Var, kl5.e.a)) {
            return new a.c("ENABLED", null, null, 6, null);
        }
        if (zq3.c(kl5Var, kl5.h.a)) {
            return new a.c("ENABLED", Boolean.TRUE, "620620");
        }
        if (zq3.c(kl5Var, kl5.f.a)) {
            return new a.c("ENABLED", Boolean.FALSE, null, 4, null);
        }
        if (zq3.c(kl5Var, kl5.i.a)) {
            return new a.c("NO_ACCOUNT", Boolean.TRUE, null, 4, null);
        }
        if (zq3.c(kl5Var, kl5.g.a)) {
            return new a.c("NO_ACCOUNT", Boolean.FALSE, null, 4, null);
        }
        if (zq3.c(kl5Var, kl5.j.a)) {
            return new a.d(null, 1, null);
        }
        if (zq3.c(kl5Var, kl5.k.a)) {
            return a.e.a;
        }
        if (zq3.c(kl5Var, kl5.a.a)) {
            return new a.d(new rz(false, true, false, 4, null));
        }
        if (zq3.c(kl5Var, kl5.b.a)) {
            return new a.d(new rz(false, false, true, 2, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
