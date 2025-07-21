package com.google.ads.interactivemedia.v3.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzod extends zzmq implements zzof {
    zzod(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.signalsdk.ISignalSdkService");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzof
    public final void zze(zzog zzogVar, zzoa zzoaVar) throws RemoteException {
        Parcel zza = zza();
        zzms.zzc(zza, zzogVar);
        zzms.zzd(zza, zzoaVar);
        zzw(2, zza);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzof
    public final void zzf(Bundle bundle, zzoc zzocVar) throws RemoteException {
        Parcel zza = zza();
        zzms.zzc(zza, bundle);
        zzms.zzd(zza, zzocVar);
        zzw(1, zza);
    }
}
