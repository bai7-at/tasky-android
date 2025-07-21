package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.bcb;
import defpackage.c0b;
import defpackage.c7b;
import defpackage.ccb;
import defpackage.cgb;
import defpackage.d7b;
import defpackage.ee3;
import defpackage.h3b;
import defpackage.j7b;
import defpackage.k7b;
import defpackage.kgc;
import defpackage.lia;
import defpackage.neb;
import defpackage.nia;
import defpackage.oeb;
import defpackage.pta;
import defpackage.q4b;
import defpackage.qta;

/* loaded from: classes2.dex */
public final class u extends lia implements cgb {
    u(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // defpackage.cgb
    public final q4b A0(ee3 ee3Var, zzq zzqVar, String str, h3b h3bVar, int i) {
        q4b sVar;
        Parcel O = O();
        nia.f(O, ee3Var);
        nia.d(O, zzqVar);
        O.writeString(str);
        nia.f(O, h3bVar);
        O.writeInt(240304000);
        Parcel Q1 = Q1(1, O);
        IBinder readStrongBinder = Q1.readStrongBinder();
        if (readStrongBinder == null) {
            sVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            sVar = queryLocalInterface instanceof q4b ? (q4b) queryLocalInterface : new s(readStrongBinder);
        }
        Q1.recycle();
        return sVar;
    }

    @Override // defpackage.cgb
    public final oeb B2(ee3 ee3Var, h3b h3bVar, int i) {
        Parcel O = O();
        nia.f(O, ee3Var);
        nia.f(O, h3bVar);
        O.writeInt(240304000);
        Parcel Q1 = Q1(14, O);
        oeb w6 = neb.w6(Q1.readStrongBinder());
        Q1.recycle();
        return w6;
    }

    @Override // defpackage.cgb
    public final c0b H3(ee3 ee3Var, String str, h3b h3bVar, int i) {
        c0b qVar;
        Parcel O = O();
        nia.f(O, ee3Var);
        O.writeString(str);
        nia.f(O, h3bVar);
        O.writeInt(240304000);
        Parcel Q1 = Q1(3, O);
        IBinder readStrongBinder = Q1.readStrongBinder();
        if (readStrongBinder == null) {
            qVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            qVar = queryLocalInterface instanceof c0b ? (c0b) queryLocalInterface : new q(readStrongBinder);
        }
        Q1.recycle();
        return qVar;
    }

    @Override // defpackage.cgb
    public final q4b N0(ee3 ee3Var, zzq zzqVar, String str, h3b h3bVar, int i) {
        q4b sVar;
        Parcel O = O();
        nia.f(O, ee3Var);
        nia.d(O, zzqVar);
        O.writeString(str);
        nia.f(O, h3bVar);
        O.writeInt(240304000);
        Parcel Q1 = Q1(2, O);
        IBinder readStrongBinder = Q1.readStrongBinder();
        if (readStrongBinder == null) {
            sVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            sVar = queryLocalInterface instanceof q4b ? (q4b) queryLocalInterface : new s(readStrongBinder);
        }
        Q1.recycle();
        return sVar;
    }

    @Override // defpackage.cgb
    public final q4b P1(ee3 ee3Var, zzq zzqVar, String str, h3b h3bVar, int i) {
        q4b sVar;
        Parcel O = O();
        nia.f(O, ee3Var);
        nia.d(O, zzqVar);
        O.writeString(str);
        nia.f(O, h3bVar);
        O.writeInt(240304000);
        Parcel Q1 = Q1(13, O);
        IBinder readStrongBinder = Q1.readStrongBinder();
        if (readStrongBinder == null) {
            sVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            sVar = queryLocalInterface instanceof q4b ? (q4b) queryLocalInterface : new s(readStrongBinder);
        }
        Q1.recycle();
        return sVar;
    }

    @Override // defpackage.cgb
    public final d7b X0(ee3 ee3Var, h3b h3bVar, int i) {
        Parcel O = O();
        nia.f(O, ee3Var);
        nia.f(O, h3bVar);
        O.writeInt(240304000);
        Parcel Q1 = Q1(15, O);
        d7b w6 = c7b.w6(Q1.readStrongBinder());
        Q1.recycle();
        return w6;
    }

    @Override // defpackage.cgb
    public final q4b c4(ee3 ee3Var, zzq zzqVar, String str, int i) {
        q4b sVar;
        Parcel O = O();
        nia.f(O, ee3Var);
        nia.d(O, zzqVar);
        O.writeString(str);
        O.writeInt(240304000);
        Parcel Q1 = Q1(10, O);
        IBinder readStrongBinder = Q1.readStrongBinder();
        if (readStrongBinder == null) {
            sVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            sVar = queryLocalInterface instanceof q4b ? (q4b) queryLocalInterface : new s(readStrongBinder);
        }
        Q1.recycle();
        return sVar;
    }

    @Override // defpackage.cgb
    public final ccb h2(ee3 ee3Var, String str, h3b h3bVar, int i) {
        Parcel O = O();
        nia.f(O, ee3Var);
        O.writeString(str);
        nia.f(O, h3bVar);
        O.writeInt(240304000);
        Parcel Q1 = Q1(12, O);
        ccb w6 = bcb.w6(Q1.readStrongBinder());
        Q1.recycle();
        return w6;
    }

    @Override // defpackage.cgb
    public final qta w2(ee3 ee3Var, ee3 ee3Var2) {
        Parcel O = O();
        nia.f(O, ee3Var);
        nia.f(O, ee3Var2);
        Parcel Q1 = Q1(5, O);
        qta w6 = pta.w6(Q1.readStrongBinder());
        Q1.recycle();
        return w6;
    }

    @Override // defpackage.cgb
    public final kgc z5(ee3 ee3Var, h3b h3bVar, int i) {
        kgc vVar;
        Parcel O = O();
        nia.f(O, ee3Var);
        nia.f(O, h3bVar);
        O.writeInt(240304000);
        Parcel Q1 = Q1(17, O);
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

    @Override // defpackage.cgb
    public final k7b zzm(ee3 ee3Var) {
        Parcel O = O();
        nia.f(O, ee3Var);
        Parcel Q1 = Q1(8, O);
        k7b w6 = j7b.w6(Q1.readStrongBinder());
        Q1.recycle();
        return w6;
    }
}
