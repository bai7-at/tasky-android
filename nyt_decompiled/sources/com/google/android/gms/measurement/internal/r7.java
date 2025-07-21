package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import defpackage.chb;
import defpackage.shd;

/* loaded from: classes3.dex */
final class r7 implements Runnable {
    final /* synthetic */ zzq a;
    final /* synthetic */ chb b;
    final /* synthetic */ m8 c;

    r7(m8 m8Var, zzq zzqVar, chb chbVar) {
        this.c = m8Var;
        this.a = zzqVar;
        this.b = chbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a5 a5Var;
        shd shdVar;
        String str = null;
        try {
            try {
                if (this.c.a.E().m().i(zzah.ANALYTICS_STORAGE)) {
                    m8 m8Var = this.c;
                    shdVar = m8Var.d;
                    if (shdVar == null) {
                        m8Var.a.o().n().a("Failed to get app instance id");
                        a5Var = this.c.a;
                    } else {
                        Preconditions.checkNotNull(this.a);
                        str = shdVar.r4(this.a);
                        if (str != null) {
                            this.c.a.H().C(str);
                            this.c.a.E().g.b(str);
                        }
                        this.c.D();
                        a5Var = this.c.a;
                    }
                } else {
                    this.c.a.o().w().a("Analytics storage consent denied; will not get app instance id");
                    this.c.a.H().C(null);
                    this.c.a.E().g.b(null);
                    a5Var = this.c.a;
                }
            } catch (RemoteException e) {
                this.c.a.o().n().b("Failed to get app instance id", e);
                a5Var = this.c.a;
            }
            a5Var.M().I(this.b, str);
        } catch (Throwable th) {
            this.c.a.M().I(this.b, null);
            throw th;
        }
    }
}
