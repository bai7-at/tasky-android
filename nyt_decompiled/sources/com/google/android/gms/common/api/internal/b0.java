package com.google.android.gms.common.api.internal;

/* loaded from: classes2.dex */
final class b0 implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ zabq b;

    b0(zabq zabqVar, int i) {
        this.b = zabqVar;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.zaH(this.a);
    }
}
