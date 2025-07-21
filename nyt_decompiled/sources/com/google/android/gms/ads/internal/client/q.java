package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbjb;
import defpackage.c0b;
import defpackage.hva;
import defpackage.jxa;
import defpackage.lia;
import defpackage.nia;
import defpackage.pqa;
import defpackage.tua;
import defpackage.wua;

/* loaded from: classes2.dex */
public final class q extends lia implements c0b {
    q(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // defpackage.c0b
    public final void b2(String str, wua wuaVar, tua tuaVar) {
        Parcel O = O();
        O.writeString(str);
        nia.f(O, wuaVar);
        nia.f(O, tuaVar);
        l3(5, O);
    }

    @Override // defpackage.c0b
    public final void p4(hva hvaVar) {
        Parcel O = O();
        nia.f(O, hvaVar);
        l3(10, O);
    }

    @Override // defpackage.c0b
    public final void r3(pqa pqaVar) {
        Parcel O = O();
        nia.f(O, pqaVar);
        l3(2, O);
    }

    @Override // defpackage.c0b
    public final void u1(zzbjb zzbjbVar) {
        Parcel O = O();
        nia.d(O, zzbjbVar);
        l3(6, O);
    }

    @Override // defpackage.c0b
    public final jxa zze() {
        jxa pVar;
        Parcel Q1 = Q1(1, O());
        IBinder readStrongBinder = Q1.readStrongBinder();
        if (readStrongBinder == null) {
            pVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            pVar = queryLocalInterface instanceof jxa ? (jxa) queryLocalInterface : new p(readStrongBinder);
        }
        Q1.recycle();
        return pVar;
    }
}
