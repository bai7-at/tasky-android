package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import defpackage.chb;
import defpackage.shd;
import java.util.ArrayList;

/* loaded from: classes3.dex */
final class d8 implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ zzq c;
    final /* synthetic */ chb d;
    final /* synthetic */ m8 e;

    d8(m8 m8Var, String str, String str2, zzq zzqVar, chb chbVar) {
        this.e = m8Var;
        this.a = str;
        this.b = str2;
        this.c = zzqVar;
        this.d = chbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a5 a5Var;
        shd shdVar;
        ArrayList arrayList = new ArrayList();
        try {
            try {
                m8 m8Var = this.e;
                shdVar = m8Var.d;
                if (shdVar == null) {
                    m8Var.a.o().n().c("Failed to get conditional properties; not connected to service", this.a, this.b);
                    a5Var = this.e.a;
                } else {
                    Preconditions.checkNotNull(this.c);
                    arrayList = x9.u(shdVar.d5(this.a, this.b, this.c));
                    this.e.D();
                    a5Var = this.e.a;
                }
            } catch (RemoteException e) {
                this.e.a.o().n().d("Failed to get conditional properties; remote exception", this.a, this.b, e);
                a5Var = this.e.a;
            }
            a5Var.M().D(this.d, arrayList);
        } catch (Throwable th) {
            this.e.a.M().D(this.d, arrayList);
            throw th;
        }
    }
}
