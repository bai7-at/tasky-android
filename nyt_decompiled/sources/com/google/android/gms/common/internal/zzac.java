package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import defpackage.sab;
import defpackage.tka;

/* loaded from: classes2.dex */
public abstract class zzac extends tka implements IGmsCallbacks {
    public zzac() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // defpackage.tka
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) sab.a(parcel, Bundle.CREATOR);
            sab.b(parcel);
            onPostInitComplete(readInt, readStrongBinder, bundle);
        } else if (i == 2) {
            int readInt2 = parcel.readInt();
            Bundle bundle2 = (Bundle) sab.a(parcel, Bundle.CREATOR);
            sab.b(parcel);
            zzb(readInt2, bundle2);
        } else {
            if (i != 3) {
                return false;
            }
            int readInt3 = parcel.readInt();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            zzk zzkVar = (zzk) sab.a(parcel, zzk.CREATOR);
            sab.b(parcel);
            zzc(readInt3, readStrongBinder2, zzkVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
