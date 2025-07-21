package com.google.android.gms.measurement.internal;

import defpackage.erf;
import defpackage.n1a;

/* loaded from: classes3.dex */
final class u6 implements Runnable {
    final /* synthetic */ n1a a;
    final /* synthetic */ long b;
    final /* synthetic */ int c;
    final /* synthetic */ long d;
    final /* synthetic */ boolean e;
    final /* synthetic */ n1a f;
    final /* synthetic */ z6 g;

    u6(z6 z6Var, n1a n1aVar, long j, int i, long j2, boolean z, n1a n1aVar2) {
        this.g = z6Var;
        this.a = n1aVar;
        this.b = j;
        this.c = i;
        this.d = j2;
        this.e = z;
        this.f = n1aVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.g.K(this.a);
        this.g.z(this.b, false);
        z6.e0(this.g, this.a, this.c, this.d, true, this.e);
        erf.b();
        if (this.g.a.y().A(null, m3.K0)) {
            z6.d0(this.g, this.a, this.f);
        }
    }
}
