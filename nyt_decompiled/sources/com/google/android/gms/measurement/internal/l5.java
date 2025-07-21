package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class l5 implements Runnable {
    final /* synthetic */ zzaw a;
    final /* synthetic */ zzq b;
    final /* synthetic */ t5 c;

    l5(t5 t5Var, zzaw zzawVar, zzq zzqVar) {
        this.c = t5Var;
        this.a = zzawVar;
        this.b = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.s4(this.c.l3(this.a, this.b), this.b);
    }
}
