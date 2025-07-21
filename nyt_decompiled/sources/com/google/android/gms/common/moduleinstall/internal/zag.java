package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate;
import defpackage.go9;
import defpackage.io9;

/* loaded from: classes2.dex */
public abstract class zag extends go9 implements zah {
    public zag() {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallStatusListener");
    }

    @Override // defpackage.go9
    protected final boolean zaa(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        ModuleInstallStatusUpdate moduleInstallStatusUpdate = (ModuleInstallStatusUpdate) io9.a(parcel, ModuleInstallStatusUpdate.CREATOR);
        io9.b(parcel);
        zab(moduleInstallStatusUpdate);
        return true;
    }
}
