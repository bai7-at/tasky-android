package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import defpackage.jxa;
import defpackage.lia;
import defpackage.nia;

/* loaded from: classes2.dex */
public final class p extends lia implements jxa {
    p(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // defpackage.jxa
    public final void P4(zzl zzlVar) {
        Parcel O = O();
        nia.d(O, zzlVar);
        l3(1, O);
    }
}
