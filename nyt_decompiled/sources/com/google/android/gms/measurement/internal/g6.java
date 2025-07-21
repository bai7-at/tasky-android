package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class g6 implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ Object c;
    final /* synthetic */ long d;
    final /* synthetic */ z6 e;

    g6(z6 z6Var, String str, String str2, Object obj, long j) {
        this.e = z6Var;
        this.a = str;
        this.b = str2;
        this.c = obj;
        this.d = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.N(this.a, this.b, this.c, this.d);
    }
}
