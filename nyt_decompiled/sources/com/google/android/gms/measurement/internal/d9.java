package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class d9 extends n {
    final /* synthetic */ e9 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d9(e9 e9Var, w5 w5Var) {
        super(w5Var);
        this.e = e9Var;
    }

    @Override // com.google.android.gms.measurement.internal.n
    public final void c() {
        this.e.i();
        this.e.a.o().u().a("Starting upload from DelayedRunnable");
        this.e.b.A();
    }
}
