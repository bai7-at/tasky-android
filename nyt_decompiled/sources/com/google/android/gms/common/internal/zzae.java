package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.zzs;
import defpackage.ee3;
import defpackage.sab;
import defpackage.vp9;

/* loaded from: classes2.dex */
public final class zzae extends vp9 implements zzag {
    zzae(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override // com.google.android.gms.common.internal.zzag
    public final com.google.android.gms.common.zzq zze(com.google.android.gms.common.zzo zzoVar) throws RemoteException {
        Parcel zza = zza();
        sab.c(zza, zzoVar);
        Parcel zzB = zzB(6, zza);
        com.google.android.gms.common.zzq zzqVar = (com.google.android.gms.common.zzq) sab.a(zzB, com.google.android.gms.common.zzq.CREATOR);
        zzB.recycle();
        return zzqVar;
    }

    @Override // com.google.android.gms.common.internal.zzag
    public final com.google.android.gms.common.zzq zzf(com.google.android.gms.common.zzo zzoVar) throws RemoteException {
        Parcel zza = zza();
        sab.c(zza, zzoVar);
        Parcel zzB = zzB(8, zza);
        com.google.android.gms.common.zzq zzqVar = (com.google.android.gms.common.zzq) sab.a(zzB, com.google.android.gms.common.zzq.CREATOR);
        zzB.recycle();
        return zzqVar;
    }

    @Override // com.google.android.gms.common.internal.zzag
    public final boolean zzg() throws RemoteException {
        Parcel zzB = zzB(9, zza());
        boolean f = sab.f(zzB);
        zzB.recycle();
        return f;
    }

    @Override // com.google.android.gms.common.internal.zzag
    public final boolean zzh(zzs zzsVar, ee3 ee3Var) throws RemoteException {
        Parcel zza = zza();
        sab.c(zza, zzsVar);
        sab.e(zza, ee3Var);
        Parcel zzB = zzB(5, zza);
        boolean f = sab.f(zzB);
        zzB.recycle();
        return f;
    }

    @Override // com.google.android.gms.common.internal.zzag
    public final boolean zzi() throws RemoteException {
        Parcel zzB = zzB(7, zza());
        boolean f = sab.f(zzB);
        zzB.recycle();
        return f;
    }
}
