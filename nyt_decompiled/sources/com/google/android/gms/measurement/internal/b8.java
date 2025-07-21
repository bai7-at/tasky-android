package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import defpackage.shd;

/* loaded from: classes3.dex */
final class b8 implements Runnable {
    final /* synthetic */ zzq a;
    final /* synthetic */ boolean b;
    final /* synthetic */ zzac c;
    final /* synthetic */ zzac d;
    final /* synthetic */ m8 e;

    b8(m8 m8Var, boolean z, zzq zzqVar, boolean z2, zzac zzacVar, zzac zzacVar2) {
        this.e = m8Var;
        this.a = zzqVar;
        this.b = z2;
        this.c = zzacVar;
        this.d = zzacVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        shd shdVar;
        m8 m8Var = this.e;
        shdVar = m8Var.d;
        if (shdVar == null) {
            m8Var.a.o().n().a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        Preconditions.checkNotNull(this.a);
        this.e.n(shdVar, this.b ? null : this.c, this.a);
        this.e.D();
    }
}
