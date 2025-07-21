package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;

/* loaded from: classes3.dex */
abstract class u5 implements w5 {
    protected final a5 a;

    u5(a5 a5Var) {
        Preconditions.checkNotNull(a5Var);
        this.a = a5Var;
    }

    public void b() {
        this.a.e().b();
    }

    public void c() {
        this.a.e().c();
    }

    @Override // com.google.android.gms.measurement.internal.w5
    public final y4 e() {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.w5
    public final x3 o() {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.w5
    public final Clock p() {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.w5
    public final c q() {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.w5
    public final Context zzau() {
        throw null;
    }
}
