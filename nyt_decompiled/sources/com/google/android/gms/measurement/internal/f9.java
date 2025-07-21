package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
abstract class f9 extends u5 implements w5 {
    protected final r9 b;

    f9(r9 r9Var) {
        super(r9Var.a0());
        Preconditions.checkNotNull(r9Var);
        this.b = r9Var;
    }
}
