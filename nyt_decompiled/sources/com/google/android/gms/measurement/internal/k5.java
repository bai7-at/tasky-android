package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import defpackage.n1a;

/* loaded from: classes3.dex */
final class k5 implements Runnable {
    final /* synthetic */ zzq a;
    final /* synthetic */ t5 b;

    k5(t5 t5Var, zzq zzqVar) {
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
        n1a b = n1a.b(zzqVar.zzv);
        n1a T = r9Var2.T(zzqVar.zza);
        r9Var2.o().u().c("Setting consent, package, consent", zzqVar.zza, b);
        r9Var2.y(zzqVar.zza, b);
        if (b.k(T)) {
            r9Var2.t(zzqVar);
        }
    }
}
