package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import defpackage.shd;

/* loaded from: classes3.dex */
final class u7 implements Runnable {
    final /* synthetic */ zzq a;
    final /* synthetic */ Bundle b;
    final /* synthetic */ m8 c;

    u7(m8 m8Var, zzq zzqVar, Bundle bundle) {
        this.c = m8Var;
        this.a = zzqVar;
        this.b = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        shd shdVar;
        m8 m8Var = this.c;
        shdVar = m8Var.d;
        if (shdVar == null) {
            m8Var.a.o().n().a("Failed to send default event parameters to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.a);
            shdVar.Y3(this.b, this.a);
        } catch (RemoteException e) {
            this.c.a.o().n().b("Failed to send default event parameters to service", e);
        }
    }
}
