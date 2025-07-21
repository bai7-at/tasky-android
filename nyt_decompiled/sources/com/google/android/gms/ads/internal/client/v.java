package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import defpackage.ee3;
import defpackage.kgc;
import defpackage.lia;
import defpackage.nia;

/* loaded from: classes2.dex */
public final class v extends lia implements kgc {
    v(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOutOfContextTester");
    }

    @Override // defpackage.kgc
    public final void B1(String str, ee3 ee3Var, ee3 ee3Var2) {
        Parcel O = O();
        O.writeString(str);
        nia.f(O, ee3Var);
        nia.f(O, ee3Var2);
        l3(1, O);
    }
}
