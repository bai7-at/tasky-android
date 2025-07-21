package com.google.android.gms.internal.appset;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.appset.zza;
import defpackage.oab;
import defpackage.rp9;
import defpackage.vsd;

/* loaded from: classes3.dex */
public final class b extends rp9 implements IInterface {
    b(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.appset.internal.IAppSetService");
    }

    public final void l3(zza zzaVar, vsd vsdVar) {
        Parcel O = O();
        oab.b(O, zzaVar);
        oab.c(O, vsdVar);
        Q1(1, O);
    }
}
