package com.google.ads.interactivemedia.v3.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzpy extends zzmq implements IInterface {
    zzpy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final zzpw zze(zzpu zzpuVar) throws RemoteException {
        Parcel zza = zza();
        zzms.zzc(zza, zzpuVar);
        Parcel zzu = zzu(1, zza);
        zzpw zzpwVar = (zzpw) zzms.zza(zzu, zzpw.CREATOR);
        zzu.recycle();
        return zzpwVar;
    }

    public final zzqf zzf(zzqd zzqdVar) throws RemoteException {
        Parcel zza = zza();
        zzms.zzc(zza, zzqdVar);
        Parcel zzu = zzu(3, zza);
        zzqf zzqfVar = (zzqf) zzms.zza(zzu, zzqf.CREATOR);
        zzu.recycle();
        return zzqfVar;
    }
}
