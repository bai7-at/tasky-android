package com.skydoves.balloon;

import defpackage.ke5;
import defpackage.lt2;
import defpackage.qs2;
import defpackage.st2;
import defpackage.zq3;

/* loaded from: classes4.dex */
final /* synthetic */ class e implements ke5, st2 {
    private final /* synthetic */ qs2 a;

    e(qs2 qs2Var) {
        zq3.h(qs2Var, "function");
        this.a = qs2Var;
    }

    @Override // defpackage.ke5
    public final /* synthetic */ void a() {
        this.a.mo865invoke();
    }

    @Override // defpackage.st2
    public final lt2 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ke5) && (obj instanceof st2)) {
            return zq3.c(b(), ((st2) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
