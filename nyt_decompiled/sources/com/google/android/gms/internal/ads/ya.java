package com.google.android.gms.internal.ads;

import defpackage.j64;

/* loaded from: classes3.dex */
final class ya implements Runnable {
    final eb a;
    final j64 b;

    ya(eb ebVar, j64 j64Var) {
        this.a = ebVar;
        this.b = j64Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Object h;
        ua uaVar;
        obj = this.a.a;
        if (obj != this) {
            return;
        }
        j64 j64Var = this.b;
        eb ebVar = this.a;
        h = eb.h(j64Var);
        uaVar = eb.f;
        if (uaVar.f(ebVar, this, h)) {
            eb.z(this.a, false);
        }
    }
}
