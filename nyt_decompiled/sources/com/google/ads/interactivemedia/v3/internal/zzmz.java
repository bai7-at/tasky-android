package com.google.ads.interactivemedia.v3.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import defpackage.ee3;

/* loaded from: classes2.dex */
public final class zzmz extends zzmq implements IInterface {
    zzmz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.adshield.internal.IAdShieldCreator");
    }

    public final IBinder zze(ee3 ee3Var, ee3 ee3Var2, byte[] bArr) throws RemoteException {
        Parcel zza = zza();
        zzms.zzd(zza, ee3Var);
        zzms.zzd(zza, ee3Var2);
        zza.writeByteArray(bArr);
        Parcel zzu = zzu(3, zza);
        IBinder readStrongBinder = zzu.readStrongBinder();
        zzu.recycle();
        return readStrongBinder;
    }
}
