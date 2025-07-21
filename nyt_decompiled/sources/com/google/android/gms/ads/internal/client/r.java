package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.ee3;
import defpackage.h3b;
import defpackage.lia;
import defpackage.nia;

/* loaded from: classes2.dex */
public final class r extends lia implements IInterface {
    r(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
    }

    public final IBinder s4(ee3 ee3Var, String str, h3b h3bVar, int i) {
        Parcel O = O();
        nia.f(O, ee3Var);
        O.writeString(str);
        nia.f(O, h3bVar);
        O.writeInt(240304000);
        Parcel Q1 = Q1(1, O);
        IBinder readStrongBinder = Q1.readStrongBinder();
        Q1.recycle();
        return readStrongBinder;
    }
}
