package com.google.android.gms.measurement.internal;

import defpackage.erf;
import defpackage.n1a;

/* loaded from: classes3.dex */
final class v6 implements Runnable {
    final /* synthetic */ n1a a;
    final /* synthetic */ int b;
    final /* synthetic */ long c;
    final /* synthetic */ boolean d;
    final /* synthetic */ n1a e;
    final /* synthetic */ z6 f;

    v6(z6 z6Var, n1a n1aVar, int i, long j, boolean z, n1a n1aVar2) {
        this.f = z6Var;
        this.a = n1aVar;
        this.b = i;
        this.c = j;
        this.d = z;
        this.e = n1aVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f.K(this.a);
        z6.e0(this.f, this.a, this.b, this.c, false, this.d);
        erf.b();
        if (this.f.a.y().A(null, m3.K0)) {
            z6.d0(this.f, this.a, this.e);
        }
    }
}
