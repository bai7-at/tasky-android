package com.google.android.gms.measurement.internal;

import android.util.Log;
import defpackage.fmd;

/* loaded from: classes3.dex */
final class x5 implements fmd {
    final /* synthetic */ a5 a;

    x5(y5 y5Var, a5 a5Var) {
        this.a = a5Var;
    }

    @Override // defpackage.fmd
    public final boolean zza() {
        return this.a.m() && Log.isLoggable(this.a.o().B(), 3);
    }
}
