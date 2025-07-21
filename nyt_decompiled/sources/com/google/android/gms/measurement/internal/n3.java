package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import defpackage.gwa;
import defpackage.qya;
import defpackage.shd;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class n3 extends gwa implements shd {
    n3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // defpackage.shd
    public final void D2(zzq zzqVar) {
        Parcel O = O();
        qya.e(O, zzqVar);
        l3(20, O);
    }

    @Override // defpackage.shd
    public final List G2(String str, String str2, boolean z, zzq zzqVar) {
        Parcel O = O();
        O.writeString(str);
        O.writeString(str2);
        qya.d(O, z);
        qya.e(O, zzqVar);
        Parcel Q1 = Q1(14, O);
        ArrayList createTypedArrayList = Q1.createTypedArrayList(zzlo.CREATOR);
        Q1.recycle();
        return createTypedArrayList;
    }

    @Override // defpackage.shd
    public final void L1(zzlo zzloVar, zzq zzqVar) {
        Parcel O = O();
        qya.e(O, zzloVar);
        qya.e(O, zzqVar);
        l3(2, O);
    }

    @Override // defpackage.shd
    public final void M5(zzac zzacVar, zzq zzqVar) {
        Parcel O = O();
        qya.e(O, zzacVar);
        qya.e(O, zzqVar);
        l3(12, O);
    }

    @Override // defpackage.shd
    public final void R1(zzaw zzawVar, zzq zzqVar) {
        Parcel O = O();
        qya.e(O, zzawVar);
        qya.e(O, zzqVar);
        l3(1, O);
    }

    @Override // defpackage.shd
    public final void S2(zzq zzqVar) {
        Parcel O = O();
        qya.e(O, zzqVar);
        l3(18, O);
    }

    @Override // defpackage.shd
    public final void S3(zzq zzqVar) {
        Parcel O = O();
        qya.e(O, zzqVar);
        l3(6, O);
    }

    @Override // defpackage.shd
    public final void X1(zzq zzqVar) {
        Parcel O = O();
        qya.e(O, zzqVar);
        l3(4, O);
    }

    @Override // defpackage.shd
    public final void Y3(Bundle bundle, zzq zzqVar) {
        Parcel O = O();
        qya.e(O, bundle);
        qya.e(O, zzqVar);
        l3(19, O);
    }

    @Override // defpackage.shd
    public final List Z3(String str, String str2, String str3, boolean z) {
        Parcel O = O();
        O.writeString(null);
        O.writeString(str2);
        O.writeString(str3);
        qya.d(O, z);
        Parcel Q1 = Q1(15, O);
        ArrayList createTypedArrayList = Q1.createTypedArrayList(zzlo.CREATOR);
        Q1.recycle();
        return createTypedArrayList;
    }

    @Override // defpackage.shd
    public final List d5(String str, String str2, zzq zzqVar) {
        Parcel O = O();
        O.writeString(str);
        O.writeString(str2);
        qya.e(O, zzqVar);
        Parcel Q1 = Q1(16, O);
        ArrayList createTypedArrayList = Q1.createTypedArrayList(zzac.CREATOR);
        Q1.recycle();
        return createTypedArrayList;
    }

    @Override // defpackage.shd
    public final void g2(long j, String str, String str2, String str3) {
        Parcel O = O();
        O.writeLong(j);
        O.writeString(str);
        O.writeString(str2);
        O.writeString(str3);
        l3(10, O);
    }

    @Override // defpackage.shd
    public final byte[] k4(zzaw zzawVar, String str) {
        Parcel O = O();
        qya.e(O, zzawVar);
        O.writeString(str);
        Parcel Q1 = Q1(9, O);
        byte[] createByteArray = Q1.createByteArray();
        Q1.recycle();
        return createByteArray;
    }

    @Override // defpackage.shd
    public final String r4(zzq zzqVar) {
        Parcel O = O();
        qya.e(O, zzqVar);
        Parcel Q1 = Q1(11, O);
        String readString = Q1.readString();
        Q1.recycle();
        return readString;
    }

    @Override // defpackage.shd
    public final List w4(String str, String str2, String str3) {
        Parcel O = O();
        O.writeString(null);
        O.writeString(str2);
        O.writeString(str3);
        Parcel Q1 = Q1(17, O);
        ArrayList createTypedArrayList = Q1.createTypedArrayList(zzac.CREATOR);
        Q1.recycle();
        return createTypedArrayList;
    }
}
