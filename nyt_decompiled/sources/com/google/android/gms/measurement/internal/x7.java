package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class x7 extends n {
    final /* synthetic */ m8 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    x7(m8 m8Var, w5 w5Var) {
        super(w5Var);
        this.e = m8Var;
    }

    @Override // com.google.android.gms.measurement.internal.n
    public final void c() {
        this.e.a.o().v().a("Tasks have been queued for a long time");
    }
}
