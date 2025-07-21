package com.google.android.gms.common.internal.service;

import android.os.Parcel;
import android.os.RemoteException;
import defpackage.go9;
import defpackage.io9;

/* loaded from: classes2.dex */
public abstract class zaj extends go9 implements zak {
    public zaj() {
        super("com.google.android.gms.common.internal.service.ICommonCallbacks");
    }

    @Override // defpackage.go9
    protected final boolean zaa(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        int readInt = parcel.readInt();
        io9.b(parcel);
        zab(readInt);
        return true;
    }
}
