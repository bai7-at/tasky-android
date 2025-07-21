package com.google.android.gms.common.api.internal;

/* loaded from: classes2.dex */
final class m0 implements Runnable {
    final /* synthetic */ com.google.android.gms.signin.internal.zak a;
    final /* synthetic */ zact b;

    m0(zact zactVar, com.google.android.gms.signin.internal.zak zakVar) {
        this.b = zactVar;
        this.a = zakVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zact.zad(this.b, this.a);
    }
}
