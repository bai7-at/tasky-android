package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import defpackage.t9b;
import java.util.List;

@SafeParcelable.Class(creator = "NonagonRequestParcelCreator")
/* loaded from: classes3.dex */
public final class zzbze extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbze> CREATOR = new t9b();

    @SafeParcelable.Field(id = 1)
    public final Bundle zza;

    @SafeParcelable.Field(id = 2)
    public final zzcei zzb;

    @SafeParcelable.Field(id = 3)
    public final ApplicationInfo zzc;

    @SafeParcelable.Field(id = 4)
    public final String zzd;

    @SafeParcelable.Field(id = 5)
    public final List zze;

    @SafeParcelable.Field(id = 6)
    public final PackageInfo zzf;

    @SafeParcelable.Field(id = 7)
    public final String zzg;

    @SafeParcelable.Field(id = 9)
    public final String zzh;

    @SafeParcelable.Field(id = 10)
    public zzfjc zzi;

    @SafeParcelable.Field(id = 11)
    public String zzj;

    @SafeParcelable.Field(id = 12)
    public final boolean zzk;

    @SafeParcelable.Field(id = 13)
    public final boolean zzl;

    public zzbze(Bundle bundle, zzcei zzceiVar, ApplicationInfo applicationInfo, String str, List list, PackageInfo packageInfo, String str2, String str3, zzfjc zzfjcVar, String str4, boolean z, boolean z2) {
        this.zza = bundle;
        this.zzb = zzceiVar;
        this.zzd = str;
        this.zzc = applicationInfo;
        this.zze = list;
        this.zzf = packageInfo;
        this.zzg = str2;
        this.zzh = str3;
        this.zzi = zzfjcVar;
        this.zzj = str4;
        this.zzk = z;
        this.zzl = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 1, bundle, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzc, i, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeStringList(parcel, 5, this.zze, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzf, i, false);
        SafeParcelWriter.writeString(parcel, 7, this.zzg, false);
        SafeParcelWriter.writeString(parcel, 9, this.zzh, false);
        SafeParcelWriter.writeParcelable(parcel, 10, this.zzi, i, false);
        SafeParcelWriter.writeString(parcel, 11, this.zzj, false);
        SafeParcelWriter.writeBoolean(parcel, 12, this.zzk);
        SafeParcelWriter.writeBoolean(parcel, 13, this.zzl);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
