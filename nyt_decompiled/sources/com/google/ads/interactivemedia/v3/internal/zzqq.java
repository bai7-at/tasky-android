package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.RemoteException;
import defpackage.ee3;

/* loaded from: classes2.dex */
public abstract class zzqq extends zzmr implements zzqr {
    public zzqq() {
        super("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmr
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 2:
                ee3.a.O(parcel.readStrongBinder());
                parcel.readString();
                zzms.zzb(parcel);
                break;
            case 3:
                break;
            case 4:
                parcel.createIntArray();
                zzms.zzb(parcel);
                break;
            case 5:
                parcel.createByteArray();
                zzms.zzb(parcel);
                break;
            case 6:
                parcel.readInt();
                zzms.zzb(parcel);
                break;
            case 7:
                parcel.readInt();
                zzms.zzb(parcel);
                break;
            case 8:
                ee3.a.O(parcel.readStrongBinder());
                parcel.readString();
                parcel.readString();
                zzms.zzb(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
