package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import defpackage.co9;
import defpackage.ee3;
import defpackage.io9;

/* loaded from: classes2.dex */
public final class zam extends co9 implements IInterface {
    zam(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ISignInButtonCreator");
    }

    public final ee3 zae(ee3 ee3Var, zax zaxVar) throws RemoteException {
        Parcel zaa = zaa();
        io9.e(zaa, ee3Var);
        io9.d(zaa, zaxVar);
        Parcel zab = zab(2, zaa);
        ee3 O = ee3.a.O(zab.readStrongBinder());
        zab.recycle();
        return O;
    }
}
