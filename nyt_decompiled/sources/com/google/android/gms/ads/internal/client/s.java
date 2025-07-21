package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.cma;
import defpackage.cua;
import defpackage.ee3;
import defpackage.koa;
import defpackage.lia;
import defpackage.nia;
import defpackage.pqa;
import defpackage.q4b;
import defpackage.qkc;
import defpackage.ucb;
import defpackage.ukb;
import defpackage.zcc;
import defpackage.znc;

/* loaded from: classes2.dex */
public final class s extends lia implements q4b {
    s(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    @Override // defpackage.q4b
    public final void B3(zzl zzlVar, cua cuaVar) {
        Parcel O = O();
        nia.d(O, zzlVar);
        nia.f(O, cuaVar);
        l3(43, O);
    }

    @Override // defpackage.q4b
    public final void C2(zzw zzwVar) {
        Parcel O = O();
        nia.d(O, zzwVar);
        l3(39, O);
    }

    @Override // defpackage.q4b
    public final void D0(ucb ucbVar) {
        Parcel O = O();
        nia.f(O, ucbVar);
        l3(8, O);
    }

    @Override // defpackage.q4b
    public final void I5(boolean z) {
        Parcel O = O();
        int i = nia.b;
        O.writeInt(z ? 1 : 0);
        l3(34, O);
    }

    @Override // defpackage.q4b
    public final void K4(pqa pqaVar) {
        Parcel O = O();
        nia.f(O, pqaVar);
        l3(7, O);
    }

    @Override // defpackage.q4b
    public final void N5(koa koaVar) {
        Parcel O = O();
        nia.f(O, koaVar);
        l3(20, O);
    }

    @Override // defpackage.q4b
    public final void T5(cma cmaVar) {
        Parcel O = O();
        nia.f(O, cmaVar);
        l3(40, O);
    }

    @Override // defpackage.q4b
    public final void W2(zcc zccVar) {
        Parcel O = O();
        nia.f(O, zccVar);
        l3(42, O);
    }

    @Override // defpackage.q4b
    public final void e() {
        l3(2, O());
    }

    @Override // defpackage.q4b
    public final void i4(ukb ukbVar) {
        Parcel O = O();
        nia.f(O, ukbVar);
        l3(45, O);
    }

    @Override // defpackage.q4b
    public final void n3(zzfk zzfkVar) {
        Parcel O = O();
        nia.d(O, zzfkVar);
        l3(29, O);
    }

    @Override // defpackage.q4b
    public final boolean p3(zzl zzlVar) {
        Parcel O = O();
        nia.d(O, zzlVar);
        Parcel Q1 = Q1(4, O);
        boolean g = nia.g(Q1);
        Q1.recycle();
        return g;
    }

    @Override // defpackage.q4b
    public final void q6(boolean z) {
        Parcel O = O();
        int i = nia.b;
        O.writeInt(z ? 1 : 0);
        l3(22, O);
    }

    @Override // defpackage.q4b
    public final void s5(ee3 ee3Var) {
        Parcel O = O();
        nia.f(O, ee3Var);
        l3(44, O);
    }

    @Override // defpackage.q4b
    public final void v() {
        l3(6, O());
    }

    @Override // defpackage.q4b
    public final void x5(zzq zzqVar) {
        Parcel O = O();
        nia.d(O, zzqVar);
        l3(13, O);
    }

    @Override // defpackage.q4b
    public final void z() {
        l3(5, O());
    }

    @Override // defpackage.q4b
    public final zzq zzg() {
        Parcel Q1 = Q1(12, O());
        zzq zzqVar = (zzq) nia.a(Q1, zzq.CREATOR);
        Q1.recycle();
        return zzqVar;
    }

    @Override // defpackage.q4b
    public final qkc zzk() {
        qkc xVar;
        Parcel Q1 = Q1(41, O());
        IBinder readStrongBinder = Q1.readStrongBinder();
        if (readStrongBinder == null) {
            xVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            xVar = queryLocalInterface instanceof qkc ? (qkc) queryLocalInterface : new x(readStrongBinder);
        }
        Q1.recycle();
        return xVar;
    }

    @Override // defpackage.q4b
    public final znc zzl() {
        znc zVar;
        Parcel Q1 = Q1(26, O());
        IBinder readStrongBinder = Q1.readStrongBinder();
        if (readStrongBinder == null) {
            zVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            zVar = queryLocalInterface instanceof znc ? (znc) queryLocalInterface : new z(readStrongBinder);
        }
        Q1.recycle();
        return zVar;
    }

    @Override // defpackage.q4b
    public final ee3 zzn() {
        Parcel Q1 = Q1(1, O());
        ee3 O = ee3.a.O(Q1.readStrongBinder());
        Q1.recycle();
        return O;
    }

    @Override // defpackage.q4b
    public final String zzr() {
        Parcel Q1 = Q1(31, O());
        String readString = Q1.readString();
        Q1.recycle();
        return readString;
    }
}
