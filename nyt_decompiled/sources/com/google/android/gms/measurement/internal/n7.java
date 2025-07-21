package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import defpackage.chb;
import defpackage.shd;
import java.util.List;

/* loaded from: classes3.dex */
final class n7 implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ zzq c;
    final /* synthetic */ boolean d;
    final /* synthetic */ chb e;
    final /* synthetic */ m8 f;

    n7(m8 m8Var, String str, String str2, zzq zzqVar, boolean z, chb chbVar) {
        this.f = m8Var;
        this.a = str;
        this.b = str2;
        this.c = zzqVar;
        this.d = z;
        this.e = chbVar;
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x009b: MOVE (r0 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:44:0x009a */
    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        RemoteException e;
        Bundle bundle2;
        shd shdVar;
        Bundle bundle3 = new Bundle();
        try {
            try {
                m8 m8Var = this.f;
                shdVar = m8Var.d;
                if (shdVar == null) {
                    m8Var.a.o().n().c("Failed to get user properties; not connected to service", this.a, this.b);
                    this.f.a.M().E(this.e, bundle3);
                    return;
                }
                Preconditions.checkNotNull(this.c);
                List<zzlo> G2 = shdVar.G2(this.a, this.b, this.d, this.c);
                bundle = new Bundle();
                if (G2 != null) {
                    for (zzlo zzloVar : G2) {
                        String str = zzloVar.zze;
                        if (str != null) {
                            bundle.putString(zzloVar.zzb, str);
                        } else {
                            Long l = zzloVar.zzd;
                            if (l != null) {
                                bundle.putLong(zzloVar.zzb, l.longValue());
                            } else {
                                Double d = zzloVar.zzg;
                                if (d != null) {
                                    bundle.putDouble(zzloVar.zzb, d.doubleValue());
                                }
                            }
                        }
                    }
                }
                try {
                    this.f.D();
                    this.f.a.M().E(this.e, bundle);
                } catch (RemoteException e2) {
                    e = e2;
                    this.f.a.o().n().c("Failed to get user properties; remote exception", this.a, e);
                    this.f.a.M().E(this.e, bundle);
                }
            } catch (Throwable th) {
                th = th;
                bundle3 = bundle2;
                this.f.a.M().E(this.e, bundle3);
                throw th;
            }
        } catch (RemoteException e3) {
            bundle = bundle3;
            e = e3;
        } catch (Throwable th2) {
            th = th2;
            this.f.a.M().E(this.e, bundle3);
            throw th;
        }
    }
}
