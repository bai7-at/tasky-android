package com.google.android.gms.common.moduleinstall.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.IStatusCallback;
import defpackage.co9;
import defpackage.io9;

/* loaded from: classes2.dex */
public final class zaf extends co9 implements IInterface {
    zaf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
    }

    public final void zae(zae zaeVar, ApiFeatureRequest apiFeatureRequest) throws RemoteException {
        Parcel zaa = zaa();
        io9.e(zaa, zaeVar);
        io9.d(zaa, apiFeatureRequest);
        zac(1, zaa);
    }

    public final void zaf(zae zaeVar, ApiFeatureRequest apiFeatureRequest) throws RemoteException {
        Parcel zaa = zaa();
        io9.e(zaa, zaeVar);
        io9.d(zaa, apiFeatureRequest);
        zac(3, zaa);
    }

    public final void zag(zae zaeVar, ApiFeatureRequest apiFeatureRequest, zah zahVar) throws RemoteException {
        Parcel zaa = zaa();
        io9.e(zaa, zaeVar);
        io9.d(zaa, apiFeatureRequest);
        io9.e(zaa, zahVar);
        zac(2, zaa);
    }

    public final void zah(IStatusCallback iStatusCallback, ApiFeatureRequest apiFeatureRequest) throws RemoteException {
        Parcel zaa = zaa();
        io9.e(zaa, iStatusCallback);
        io9.d(zaa, apiFeatureRequest);
        zac(4, zaa);
    }

    public final void zai(IStatusCallback iStatusCallback, zah zahVar) throws RemoteException {
        Parcel zaa = zaa();
        io9.e(zaa, iStatusCallback);
        io9.e(zaa, zahVar);
        zac(6, zaa);
    }
}
