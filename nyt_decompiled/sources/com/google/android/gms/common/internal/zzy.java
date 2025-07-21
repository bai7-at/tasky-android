package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import defpackage.ee3;
import defpackage.vp9;

/* loaded from: classes2.dex */
public final class zzy extends vp9 implements zzaa {
    zzy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // com.google.android.gms.common.internal.zzaa
    public final int zzc() throws RemoteException {
        Parcel zzB = zzB(2, zza());
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.common.internal.zzaa
    public final ee3 zzd() throws RemoteException {
        Parcel zzB = zzB(1, zza());
        ee3 O = ee3.a.O(zzB.readStrongBinder());
        zzB.recycle();
        return O;
    }
}
