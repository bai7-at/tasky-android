package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import defpackage.shd;

/* loaded from: classes3.dex */
final class o7 implements Runnable {
    final /* synthetic */ zzq a;
    final /* synthetic */ boolean b;
    final /* synthetic */ zzlo c;
    final /* synthetic */ m8 d;

    o7(m8 m8Var, zzq zzqVar, boolean z, zzlo zzloVar) {
        this.d = m8Var;
        this.a = zzqVar;
        this.b = z;
        this.c = zzloVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        shd shdVar;
        m8 m8Var = this.d;
        shdVar = m8Var.d;
        if (shdVar == null) {
            m8Var.a.o().n().a("Discarding data. Failed to set user property");
            return;
        }
        Preconditions.checkNotNull(this.a);
        this.d.n(shdVar, this.b ? null : this.c, this.a);
        this.d.D();
    }
}
