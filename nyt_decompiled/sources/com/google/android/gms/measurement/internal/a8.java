package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import defpackage.shd;

/* loaded from: classes3.dex */
final class a8 implements Runnable {
    final /* synthetic */ zzq a;
    final /* synthetic */ boolean b;
    final /* synthetic */ zzaw c;
    final /* synthetic */ String d;
    final /* synthetic */ m8 e;

    a8(m8 m8Var, boolean z, zzq zzqVar, boolean z2, zzaw zzawVar, String str) {
        this.e = m8Var;
        this.a = zzqVar;
        this.b = z2;
        this.c = zzawVar;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        shd shdVar;
        m8 m8Var = this.e;
        shdVar = m8Var.d;
        if (shdVar == null) {
            m8Var.a.o().n().a("Discarding data. Failed to send event to service");
            return;
        }
        Preconditions.checkNotNull(this.a);
        this.e.n(shdVar, this.b ? null : this.c, this.a);
        this.e.D();
    }
}
