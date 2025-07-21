package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class y8 extends n {
    final /* synthetic */ z8 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    y8(z8 z8Var, w5 w5Var) {
        super(w5Var);
        this.e = z8Var;
    }

    @Override // com.google.android.gms.measurement.internal.n
    public final void c() {
        z8 z8Var = this.e;
        z8Var.d.c();
        z8Var.d(false, false, z8Var.d.a.p().elapsedRealtime());
        z8Var.d.a.x().j(z8Var.d.a.p().elapsedRealtime());
    }
}
