package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import defpackage.chb;
import defpackage.shd;

/* loaded from: classes3.dex */
final class w7 implements Runnable {
    final /* synthetic */ zzaw a;
    final /* synthetic */ String b;
    final /* synthetic */ chb c;
    final /* synthetic */ m8 d;

    w7(m8 m8Var, zzaw zzawVar, String str, chb chbVar) {
        this.d = m8Var;
        this.a = zzawVar;
        this.b = str;
        this.c = chbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [chb] */
    @Override // java.lang.Runnable
    public final void run() {
        a5 a5Var;
        shd shdVar;
        byte[] bArr = null;
        try {
            try {
                m8 m8Var = this.d;
                shdVar = m8Var.d;
                if (shdVar == null) {
                    m8Var.a.o().n().a("Discarding data. Failed to send event to service to bundle");
                    a5Var = this.d.a;
                } else {
                    bArr = shdVar.k4(this.a, this.b);
                    this.d.D();
                    a5Var = this.d.a;
                }
            } catch (RemoteException e) {
                this.d.a.o().n().b("Failed to send event to the service to bundle", e);
                a5Var = this.d.a;
            }
            x9 M = a5Var.M();
            this = this.c;
            M.F(this, bArr);
        } catch (Throwable th) {
            this.d.a.M().F(this.c, bArr);
            throw th;
        }
    }
}
