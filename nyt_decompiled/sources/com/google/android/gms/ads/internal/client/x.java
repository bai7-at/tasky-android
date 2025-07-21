package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import defpackage.lia;
import defpackage.nia;
import defpackage.qkc;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class x extends lia implements qkc {
    x(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    @Override // defpackage.qkc
    public final Bundle zze() {
        Parcel Q1 = Q1(5, O());
        Bundle bundle = (Bundle) nia.a(Q1, Bundle.CREATOR);
        Q1.recycle();
        return bundle;
    }

    @Override // defpackage.qkc
    public final zzu zzf() {
        Parcel Q1 = Q1(4, O());
        zzu zzuVar = (zzu) nia.a(Q1, zzu.CREATOR);
        Q1.recycle();
        return zzuVar;
    }

    @Override // defpackage.qkc
    public final String zzg() {
        Parcel Q1 = Q1(1, O());
        String readString = Q1.readString();
        Q1.recycle();
        return readString;
    }

    @Override // defpackage.qkc
    public final String zzh() {
        Parcel Q1 = Q1(6, O());
        String readString = Q1.readString();
        Q1.recycle();
        return readString;
    }

    @Override // defpackage.qkc
    public final String zzi() {
        Parcel Q1 = Q1(2, O());
        String readString = Q1.readString();
        Q1.recycle();
        return readString;
    }

    @Override // defpackage.qkc
    public final List zzj() {
        Parcel Q1 = Q1(3, O());
        ArrayList createTypedArrayList = Q1.createTypedArrayList(zzu.CREATOR);
        Q1.recycle();
        return createTypedArrayList;
    }
}
