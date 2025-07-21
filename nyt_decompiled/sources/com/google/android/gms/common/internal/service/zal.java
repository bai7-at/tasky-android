package com.google.android.gms.common.internal.service;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import defpackage.co9;
import defpackage.io9;

/* loaded from: classes2.dex */
public final class zal extends co9 implements IInterface {
    zal(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.ICommonService");
    }

    public final void zae(zak zakVar) throws RemoteException {
        Parcel zaa = zaa();
        io9.e(zaa, zakVar);
        zad(1, zaa);
    }
}
