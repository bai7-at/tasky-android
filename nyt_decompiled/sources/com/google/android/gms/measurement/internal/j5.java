package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
final class j5 implements Runnable {
    final /* synthetic */ zzq a;
    final /* synthetic */ t5 b;

    j5(t5 t5Var, zzq zzqVar) {
        this.b = t5Var;
        this.a = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r9 r9Var;
        r9 r9Var2;
        r9Var = this.b.a;
        r9Var.a();
        r9Var2 = this.b.a;
        zzq zzqVar = this.a;
        r9Var2.e().c();
        r9Var2.b();
        Preconditions.checkNotEmpty(zzqVar.zza);
        r9Var2.Q(zzqVar);
    }
}
