package com.google.ads.interactivemedia.v3.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class zzob extends zzmr implements zzoc {
    public zzob() {
        super("com.google.android.gms.ads.signalsdk.ISignalSdkCallback");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmr
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            Bundle bundle = (Bundle) zzms.zza(parcel, Bundle.CREATOR);
            zzms.zzb(parcel);
            zzc(bundle);
        } else {
            if (i != 2) {
                return false;
            }
            int readInt = parcel.readInt();
            zzms.zzb(parcel);
            zzb(readInt);
        }
        return true;
    }
}
