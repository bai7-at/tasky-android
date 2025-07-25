package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.comscore.streaming.EventType;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@SafeParcelable.Class(creator = "AppMetadataCreator")
@SafeParcelable.Reserved({1, 17, 20})
/* loaded from: classes3.dex */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new ca();

    @SafeParcelable.Field(id = 2)
    public final String zza;

    @SafeParcelable.Field(id = 3)
    public final String zzb;

    @SafeParcelable.Field(id = 4)
    public final String zzc;

    @SafeParcelable.Field(id = 5)
    public final String zzd;

    @SafeParcelable.Field(id = 6)
    public final long zze;

    @SafeParcelable.Field(id = 7)
    public final long zzf;

    @SafeParcelable.Field(id = 8)
    public final String zzg;

    @SafeParcelable.Field(defaultValue = "true", id = 9)
    public final boolean zzh;

    @SafeParcelable.Field(id = 10)
    public final boolean zzi;

    @SafeParcelable.Field(defaultValueUnchecked = "Integer.MIN_VALUE", id = 11)
    public final long zzj;

    @SafeParcelable.Field(id = 12)
    public final String zzk;

    @SafeParcelable.Field(id = 13)
    public final long zzl;

    @SafeParcelable.Field(id = 14)
    public final long zzm;

    @SafeParcelable.Field(id = 15)
    public final int zzn;

    @SafeParcelable.Field(defaultValue = "true", id = 16)
    public final boolean zzo;

    @SafeParcelable.Field(id = 18)
    public final boolean zzp;

    @SafeParcelable.Field(id = 19)
    public final String zzq;

    @SafeParcelable.Field(id = 21)
    public final Boolean zzr;

    @SafeParcelable.Field(id = 22)
    public final long zzs;

    @SafeParcelable.Field(id = 23)
    public final List zzt;

    @SafeParcelable.Field(id = 24)
    public final String zzu;

    @SafeParcelable.Field(defaultValue = "", id = EventType.SUBS)
    public final String zzv;

    @SafeParcelable.Field(defaultValue = "", id = EventType.CDN)
    public final String zzw;

    @SafeParcelable.Field(id = 27)
    public final String zzx;

    zzq(String str, String str2, String str3, long j, String str4, long j2, long j3, String str5, boolean z, boolean z2, String str6, long j4, long j5, int i, boolean z3, boolean z4, String str7, Boolean bool, long j6, List list, String str8, String str9, String str10, String str11) {
        Preconditions.checkNotEmpty(str);
        this.zza = str;
        this.zzb = true != TextUtils.isEmpty(str2) ? str2 : null;
        this.zzc = str3;
        this.zzj = j;
        this.zzd = str4;
        this.zze = j2;
        this.zzf = j3;
        this.zzg = str5;
        this.zzh = z;
        this.zzi = z2;
        this.zzk = str6;
        this.zzl = j4;
        this.zzm = j5;
        this.zzn = i;
        this.zzo = z3;
        this.zzp = z4;
        this.zzq = str7;
        this.zzr = bool;
        this.zzs = j6;
        this.zzt = list;
        this.zzu = null;
        this.zzv = str9;
        this.zzw = str10;
        this.zzx = str11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 5, this.zzd, false);
        SafeParcelWriter.writeLong(parcel, 6, this.zze);
        SafeParcelWriter.writeLong(parcel, 7, this.zzf);
        SafeParcelWriter.writeString(parcel, 8, this.zzg, false);
        SafeParcelWriter.writeBoolean(parcel, 9, this.zzh);
        SafeParcelWriter.writeBoolean(parcel, 10, this.zzi);
        SafeParcelWriter.writeLong(parcel, 11, this.zzj);
        SafeParcelWriter.writeString(parcel, 12, this.zzk, false);
        SafeParcelWriter.writeLong(parcel, 13, this.zzl);
        SafeParcelWriter.writeLong(parcel, 14, this.zzm);
        SafeParcelWriter.writeInt(parcel, 15, this.zzn);
        SafeParcelWriter.writeBoolean(parcel, 16, this.zzo);
        SafeParcelWriter.writeBoolean(parcel, 18, this.zzp);
        SafeParcelWriter.writeString(parcel, 19, this.zzq, false);
        SafeParcelWriter.writeBooleanObject(parcel, 21, this.zzr, false);
        SafeParcelWriter.writeLong(parcel, 22, this.zzs);
        SafeParcelWriter.writeStringList(parcel, 23, this.zzt, false);
        SafeParcelWriter.writeString(parcel, 24, this.zzu, false);
        SafeParcelWriter.writeString(parcel, 25, this.zzv, false);
        SafeParcelWriter.writeString(parcel, 26, this.zzw, false);
        SafeParcelWriter.writeString(parcel, 27, this.zzx, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    zzq(String str, String str2, String str3, String str4, long j, long j2, String str5, boolean z, boolean z2, long j3, String str6, long j4, long j5, int i, boolean z3, boolean z4, String str7, Boolean bool, long j6, List list, String str8, String str9, String str10, String str11) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzj = j3;
        this.zzd = str4;
        this.zze = j;
        this.zzf = j2;
        this.zzg = str5;
        this.zzh = z;
        this.zzi = z2;
        this.zzk = str6;
        this.zzl = j4;
        this.zzm = j5;
        this.zzn = i;
        this.zzo = z3;
        this.zzp = z4;
        this.zzq = str7;
        this.zzr = bool;
        this.zzs = j6;
        this.zzt = list;
        this.zzu = str8;
        this.zzv = str9;
        this.zzw = str10;
        this.zzx = str11;
    }
}
