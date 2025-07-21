package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import defpackage.shd;

/* loaded from: classes3.dex */
final class p7 implements Runnable {
    final /* synthetic */ zzq a;
    final /* synthetic */ m8 b;

    p7(m8 m8Var, zzq zzqVar) {
        this.b = m8Var;
        this.a = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        shd shdVar;
        m8 m8Var = this.b;
        shdVar = m8Var.d;
        if (shdVar == null) {
            m8Var.a.o().n().a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.a);
            shdVar.S2(this.a);
        } catch (RemoteException e) {
            this.b.a.o().n().b("Failed to reset data on the service: remote exception", e);
        }
        this.b.D();
    }
}
