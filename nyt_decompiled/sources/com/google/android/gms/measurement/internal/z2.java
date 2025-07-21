package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
abstract class z2 extends u5 implements w5 {
    z2(a5 a5Var) {
        super(a5Var);
        Preconditions.checkNotNull(a5Var);
    }

    @Override // com.google.android.gms.measurement.internal.u5
    public final void c() {
        this.a.e().c();
    }
}
