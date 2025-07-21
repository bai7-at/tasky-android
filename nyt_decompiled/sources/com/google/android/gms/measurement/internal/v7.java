package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class v7 extends n {
    final /* synthetic */ m8 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    v7(m8 m8Var, w5 w5Var) {
        super(w5Var);
        this.e = m8Var;
    }

    @Override // com.google.android.gms.measurement.internal.n
    public final void c() {
        m8 m8Var = this.e;
        m8Var.c();
        if (m8Var.y()) {
            m8Var.a.o().u().a("Inactivity, disconnecting from the service");
            m8Var.P();
        }
    }
}
