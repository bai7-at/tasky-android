package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import defpackage.shd;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
final class q7 implements Runnable {
    final /* synthetic */ AtomicReference a;
    final /* synthetic */ zzq b;
    final /* synthetic */ m8 c;

    q7(m8 m8Var, AtomicReference atomicReference, zzq zzqVar) {
        this.c = m8Var;
        this.a = atomicReference;
        this.b = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        shd shdVar;
        synchronized (this.a) {
            try {
                try {
                } catch (RemoteException e) {
                    this.c.a.o().n().b("Failed to get app instance id", e);
                    atomicReference = this.a;
                }
                if (!this.c.a.E().m().i(zzah.ANALYTICS_STORAGE)) {
                    this.c.a.o().w().a("Analytics storage consent denied; will not get app instance id");
                    this.c.a.H().C(null);
                    this.c.a.E().g.b(null);
                    this.a.set(null);
                    return;
                }
                m8 m8Var = this.c;
                shdVar = m8Var.d;
                if (shdVar == null) {
                    m8Var.a.o().n().a("Failed to get app instance id");
                    return;
                }
                Preconditions.checkNotNull(this.b);
                this.a.set(shdVar.r4(this.b));
                String str = (String) this.a.get();
                if (str != null) {
                    this.c.a.H().C(str);
                    this.c.a.E().g.b(str);
                }
                this.c.D();
                atomicReference = this.a;
                atomicReference.notify();
            } finally {
                this.a.notify();
            }
        }
    }
}
