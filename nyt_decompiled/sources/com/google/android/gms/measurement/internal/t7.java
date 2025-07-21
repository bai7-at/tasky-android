package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import defpackage.shd;

/* loaded from: classes3.dex */
final class t7 implements Runnable {
    final /* synthetic */ e7 a;
    final /* synthetic */ m8 b;

    t7(m8 m8Var, e7 e7Var) {
        this.b = m8Var;
        this.a = e7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        shd shdVar;
        m8 m8Var = this.b;
        shdVar = m8Var.d;
        if (shdVar == null) {
            m8Var.a.o().n().a("Failed to send current screen to service");
            return;
        }
        try {
            e7 e7Var = this.a;
            if (e7Var == null) {
                shdVar.g2(0L, null, null, m8Var.a.zzau().getPackageName());
            } else {
                shdVar.g2(e7Var.c, e7Var.a, e7Var.b, m8Var.a.zzau().getPackageName());
            }
            this.b.D();
        } catch (RemoteException e) {
            this.b.a.o().n().b("Failed to send current screen to the service", e);
        }
    }
}
