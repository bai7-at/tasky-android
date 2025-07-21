package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import defpackage.c6;
import defpackage.itd;
import defpackage.qkc;
import defpackage.r07;
import defpackage.t64;

@SafeParcelable.Class(creator = "AdErrorParcelCreator")
/* loaded from: classes2.dex */
public final class zze extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zze> CREATOR = new itd();

    @SafeParcelable.Field(id = 1)
    public final int zza;

    @SafeParcelable.Field(id = 2)
    public final String zzb;

    @SafeParcelable.Field(id = 3)
    public final String zzc;

    @SafeParcelable.Field(id = 4)
    public zze zzd;

    @SafeParcelable.Field(id = 5, type = "android.os.IBinder")
    public IBinder zze;

    public zze(int i, String str, String str2, zze zzeVar, IBinder iBinder) {
        this.zza = i;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzeVar;
        this.zze = iBinder;
    }

    public final t64 G0() {
        c6 c6Var;
        zze zzeVar = this.zzd;
        qkc qkcVar = null;
        if (zzeVar == null) {
            c6Var = null;
        } else {
            c6Var = new c6(zzeVar.zza, zzeVar.zzb, zzeVar.zzc);
        }
        int i = this.zza;
        String str = this.zzb;
        String str2 = this.zzc;
        IBinder iBinder = this.zze;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            qkcVar = queryLocalInterface instanceof qkc ? (qkc) queryLocalInterface : new x(iBinder);
        }
        return new t64(i, str, str2, c6Var, r07.d(qkcVar));
    }

    public final c6 t0() {
        c6 c6Var;
        zze zzeVar = this.zzd;
        if (zzeVar == null) {
            c6Var = null;
        } else {
            String str = zzeVar.zzc;
            c6Var = new c6(zzeVar.zza, zzeVar.zzb, str);
        }
        return new c6(this.zza, this.zzb, this.zzc, c6Var);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i2);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i, false);
        SafeParcelWriter.writeIBinder(parcel, 5, this.zze, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
