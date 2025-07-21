package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes2.dex */
final class l0 implements Runnable {
    final /* synthetic */ zact a;

    l0(zact zactVar) {
        this.a = zactVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zacs zacsVar;
        zacsVar = this.a.zah;
        zacsVar.zae(new ConnectionResult(4));
    }
}
