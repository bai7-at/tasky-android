package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.jrc;
import defpackage.lia;
import defpackage.nia;
import defpackage.znc;

/* loaded from: classes2.dex */
public final class z extends lia implements znc {
    z(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    @Override // defpackage.znc
    public final void W5(jrc jrcVar) {
        Parcel O = O();
        nia.f(O, jrcVar);
        l3(8, O);
    }

    @Override // defpackage.znc
    public final float zze() {
        throw null;
    }

    @Override // defpackage.znc
    public final float zzf() {
        throw null;
    }

    @Override // defpackage.znc
    public final float zzg() {
        throw null;
    }

    @Override // defpackage.znc
    public final jrc zzi() {
        jrc b0Var;
        Parcel Q1 = Q1(11, O());
        IBinder readStrongBinder = Q1.readStrongBinder();
        if (readStrongBinder == null) {
            b0Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
            b0Var = queryLocalInterface instanceof jrc ? (jrc) queryLocalInterface : new b0(readStrongBinder);
        }
        Q1.recycle();
        return b0Var;
    }
}
