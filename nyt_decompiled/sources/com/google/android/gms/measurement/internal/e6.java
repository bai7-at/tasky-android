package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class e6 implements Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ z6 b;

    e6(z6 z6Var, long j) {
        this.b = z6Var;
        this.a = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.E().k.b(this.a);
        this.b.a.o().m().b("Session timeout duration set", Long.valueOf(this.a));
    }
}
