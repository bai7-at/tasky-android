package com.google.android.gms.signin.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.internal.IAccountAccessor;
import defpackage.co9;
import defpackage.io9;
import defpackage.oo9;

/* loaded from: classes3.dex */
public final class c extends co9 implements IInterface {
    c(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void O(int i) {
        Parcel zaa = zaa();
        zaa.writeInt(i);
        zac(7, zaa);
    }

    public final void Q1(IAccountAccessor iAccountAccessor, int i, boolean z) {
        Parcel zaa = zaa();
        io9.e(zaa, iAccountAccessor);
        zaa.writeInt(i);
        io9.c(zaa, z);
        zac(9, zaa);
    }

    public final void l3(zai zaiVar, oo9 oo9Var) {
        Parcel zaa = zaa();
        io9.d(zaa, zaiVar);
        io9.e(zaa, oo9Var);
        zac(12, zaa);
    }
}
