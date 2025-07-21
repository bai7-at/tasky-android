package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class m implements Runnable {
    final /* synthetic */ w5 a;
    final /* synthetic */ n b;

    m(n nVar, w5 w5Var) {
        this.b = nVar;
        this.a = w5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.q();
        if (c.a()) {
            this.a.e().y(this);
            return;
        }
        boolean e = this.b.e();
        this.b.c = 0L;
        if (e) {
            this.b.c();
        }
    }
}
