package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import defpackage.dyf;
import defpackage.j64;
import defpackage.kke;
import defpackage.mpa;
import defpackage.oaa;
import defpackage.pgb;
import defpackage.pla;
import defpackage.pzc;
import defpackage.qaa;
import defpackage.ugb;
import defpackage.zaa;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class x5 implements oaa {
    private volatile o5 a;
    private final Context b;

    public x5(Context context) {
        this.b = context;
    }

    static /* bridge */ /* synthetic */ void c(x5 x5Var) {
        if (x5Var.a == null) {
            return;
        }
        x5Var.a.disconnect();
        Binder.flushPendingCommands();
    }

    @Override // defpackage.oaa
    public final qaa a(zaa zaaVar) {
        Parcelable.Creator<zzboq> creator = zzboq.CREATOR;
        Map l = zaaVar.l();
        int size = l.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i = 0;
        int i2 = 0;
        for (Map.Entry entry : l.entrySet()) {
            strArr[i2] = (String) entry.getKey();
            strArr2[i2] = (String) entry.getValue();
            i2++;
        }
        zzboq zzboqVar = new zzboq(zaaVar.k(), strArr, strArr2);
        long elapsedRealtime = dyf.b().elapsedRealtime();
        try {
            ugb ugbVar = new ugb();
            this.a = new o5(this.b, dyf.v().b(), new v5(this, ugbVar), new w5(this, ugbVar));
            this.a.checkAvailabilityAndConnect();
            t5 t5Var = new t5(this, zzboqVar);
            kke kkeVar = pgb.a;
            j64 o = zb.o(zb.n(ugbVar, t5Var, kkeVar), ((Integer) pla.c().a(mpa.t4)).intValue(), TimeUnit.MILLISECONDS, pgb.d);
            o.a(new u5(this), kkeVar);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) o.get();
            pzc.k("Http assets remote cache took " + (dyf.b().elapsedRealtime() - elapsedRealtime) + "ms");
            zzbos zzbosVar = (zzbos) new zzbzc(parcelFileDescriptor).t0(zzbos.CREATOR);
            if (zzbosVar == null) {
                return null;
            }
            if (zzbosVar.zza) {
                throw new zzaqj(zzbosVar.zzb);
            }
            if (zzbosVar.zze.length != zzbosVar.zzf.length) {
                return null;
            }
            HashMap hashMap = new HashMap();
            while (true) {
                String[] strArr3 = zzbosVar.zze;
                if (i >= strArr3.length) {
                    return new qaa(zzbosVar.zzc, zzbosVar.zzd, hashMap, zzbosVar.zzg, zzbosVar.zzh);
                }
                hashMap.put(strArr3[i], zzbosVar.zzf[i]);
                i++;
            }
        } catch (InterruptedException | ExecutionException unused) {
            pzc.k("Http assets remote cache took " + (dyf.b().elapsedRealtime() - elapsedRealtime) + "ms");
            return null;
        } catch (Throwable th) {
            pzc.k("Http assets remote cache took " + (dyf.b().elapsedRealtime() - elapsedRealtime) + "ms");
            throw th;
        }
    }
}
