package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class w6 implements Runnable {
    final /* synthetic */ boolean a;
    final /* synthetic */ z6 b;

    w6(z6 z6Var, boolean z) {
        this.b = z6Var;
        this.a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean k = this.b.a.k();
        boolean j = this.b.a.j();
        this.b.a.g(this.a);
        if (j == this.a) {
            this.b.a.o().u().b("Default data collection state already set to", Boolean.valueOf(this.a));
        }
        if (this.b.a.k() == k || this.b.a.k() != this.b.a.j()) {
            this.b.a.o().w().c("Default data collection is different than actual status", Boolean.valueOf(this.a), Boolean.valueOf(k));
        }
        this.b.R();
    }
}
