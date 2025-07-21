package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.ee3;
import defpackage.sab;
import defpackage.vp9;

/* loaded from: classes2.dex */
public final class l extends vp9 implements IInterface {
    l(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final int O(ee3 ee3Var, String str, boolean z) {
        Parcel zza = zza();
        sab.e(zza, ee3Var);
        zza.writeString(str);
        zza.writeInt(z ? 1 : 0);
        Parcel zzB = zzB(3, zza);
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }

    public final int Q1(ee3 ee3Var, String str, boolean z) {
        Parcel zza = zza();
        sab.e(zza, ee3Var);
        zza.writeString(str);
        zza.writeInt(z ? 1 : 0);
        Parcel zzB = zzB(5, zza);
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }

    public final ee3 l3(ee3 ee3Var, String str, int i) {
        Parcel zza = zza();
        sab.e(zza, ee3Var);
        zza.writeString(str);
        zza.writeInt(i);
        Parcel zzB = zzB(2, zza);
        ee3 O = ee3.a.O(zzB.readStrongBinder());
        zzB.recycle();
        return O;
    }

    public final ee3 n4(ee3 ee3Var, String str, int i, ee3 ee3Var2) {
        Parcel zza = zza();
        sab.e(zza, ee3Var);
        zza.writeString(str);
        zza.writeInt(i);
        sab.e(zza, ee3Var2);
        Parcel zzB = zzB(8, zza);
        ee3 O = ee3.a.O(zzB.readStrongBinder());
        zzB.recycle();
        return O;
    }

    public final ee3 s4(ee3 ee3Var, String str, int i) {
        Parcel zza = zza();
        sab.e(zza, ee3Var);
        zza.writeString(str);
        zza.writeInt(i);
        Parcel zzB = zzB(4, zza);
        ee3 O = ee3.a.O(zzB.readStrongBinder());
        zzB.recycle();
        return O;
    }

    public final ee3 x4(ee3 ee3Var, String str, boolean z, long j) {
        Parcel zza = zza();
        sab.e(zza, ee3Var);
        zza.writeString(str);
        zza.writeInt(z ? 1 : 0);
        zza.writeLong(j);
        Parcel zzB = zzB(7, zza);
        ee3 O = ee3.a.O(zzB.readStrongBinder());
        zzB.recycle();
        return O;
    }

    public final int zze() {
        Parcel zzB = zzB(6, zza());
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }
}
