package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.ee3;
import defpackage.h3b;
import defpackage.kgc;
import defpackage.lia;
import defpackage.nia;

/* loaded from: classes2.dex */
public final class w extends lia implements IInterface {
    w(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
    }

    public final kgc s4(ee3 ee3Var, h3b h3bVar, int i) {
        kgc vVar;
        Parcel O = O();
        nia.f(O, ee3Var);
        nia.f(O, h3bVar);
        O.writeInt(240304000);
        Parcel Q1 = Q1(1, O);
        IBinder readStrongBinder = Q1.readStrongBinder();
        if (readStrongBinder == null) {
            vVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            vVar = queryLocalInterface instanceof kgc ? (kgc) queryLocalInterface : new v(readStrongBinder);
        }
        Q1.recycle();
        return vVar;
    }
}
