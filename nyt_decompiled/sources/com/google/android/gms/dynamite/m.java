package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.ee3;
import defpackage.sab;
import defpackage.vp9;

/* loaded from: classes2.dex */
public final class m extends vp9 implements IInterface {
    m(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final ee3 O(ee3 ee3Var, String str, int i, ee3 ee3Var2) {
        Parcel zza = zza();
        sab.e(zza, ee3Var);
        zza.writeString(str);
        zza.writeInt(i);
        sab.e(zza, ee3Var2);
        Parcel zzB = zzB(2, zza);
        ee3 O = ee3.a.O(zzB.readStrongBinder());
        zzB.recycle();
        return O;
    }

    public final ee3 Q1(ee3 ee3Var, String str, int i, ee3 ee3Var2) {
        Parcel zza = zza();
        sab.e(zza, ee3Var);
        zza.writeString(str);
        zza.writeInt(i);
        sab.e(zza, ee3Var2);
        Parcel zzB = zzB(3, zza);
        ee3 O = ee3.a.O(zzB.readStrongBinder());
        zzB.recycle();
        return O;
    }
}
