package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.ee3;
import defpackage.h3b;
import defpackage.lia;
import defpackage.nia;

/* loaded from: classes2.dex */
public final class t extends lia implements IInterface {
    t(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    public final IBinder s4(ee3 ee3Var, zzq zzqVar, String str, h3b h3bVar, int i, int i2) {
        Parcel O = O();
        nia.f(O, ee3Var);
        nia.d(O, zzqVar);
        O.writeString(str);
        nia.f(O, h3bVar);
        O.writeInt(240304000);
        O.writeInt(i2);
        Parcel Q1 = Q1(2, O);
        IBinder readStrongBinder = Q1.readStrongBinder();
        Q1.recycle();
        return readStrongBinder;
    }
}
