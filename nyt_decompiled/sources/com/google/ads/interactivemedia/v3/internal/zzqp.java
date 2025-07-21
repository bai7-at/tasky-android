package com.google.ads.interactivemedia.v3.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import defpackage.ee3;

/* loaded from: classes2.dex */
public final class zzqp extends zzmq implements zzqr {
    zzqp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzqr
    public final void zze(ee3 ee3Var, String str, String str2) throws RemoteException {
        Parcel zza = zza();
        zzms.zzd(zza, ee3Var);
        zza.writeString(str);
        zza.writeString(null);
        zzv(8, zza);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzqr
    public final void zzf() throws RemoteException {
        zzv(3, zza());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzqr
    public final void zzg(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzv(7, zza);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzqr
    public final void zzh(int[] iArr) throws RemoteException {
        Parcel zza = zza();
        zza.writeIntArray(null);
        zzv(4, zza);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzqr
    public final void zzi(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzv(6, zza);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzqr
    public final void zzj(byte[] bArr) throws RemoteException {
        Parcel zza = zza();
        zza.writeByteArray(bArr);
        zzv(5, zza);
    }
}
