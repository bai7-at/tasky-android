package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.lia;
import defpackage.nia;
import defpackage.zya;

/* loaded from: classes3.dex */
public final class r5 extends lia implements IInterface {
    r5(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    public final void s4(zzboq zzboqVar, zya zyaVar) {
        Parcel O = O();
        nia.d(O, zzboqVar);
        nia.f(O, zyaVar);
        n4(2, O);
    }
}
