package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.comscore.streaming.EventType;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import defpackage.ggb;
import defpackage.shf;
import java.util.ArrayList;
import java.util.List;

@SafeParcelable.Class(creator = "AdRequestParcelCreator")
/* loaded from: classes2.dex */
public final class zzl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzl> CREATOR = new shf();

    @SafeParcelable.Field(id = 1)
    public final int zza;

    @SafeParcelable.Field(id = 2)
    @Deprecated
    public final long zzb;

    @SafeParcelable.Field(id = 3)
    public final Bundle zzc;

    @SafeParcelable.Field(id = 4)
    @Deprecated
    public final int zzd;

    @SafeParcelable.Field(id = 5)
    public final List zze;

    @SafeParcelable.Field(id = 6)
    public final boolean zzf;

    @SafeParcelable.Field(id = 7)
    public final int zzg;

    @SafeParcelable.Field(id = 8)
    public final boolean zzh;

    @SafeParcelable.Field(id = 9)
    public final String zzi;

    @SafeParcelable.Field(id = 10)
    public final zzfh zzj;

    @SafeParcelable.Field(id = 11)
    public final Location zzk;

    @SafeParcelable.Field(id = 12)
    public final String zzl;

    @SafeParcelable.Field(id = 13)
    public final Bundle zzm;

    @SafeParcelable.Field(id = 14)
    public final Bundle zzn;

    @SafeParcelable.Field(id = 15)
    public final List zzo;

    @SafeParcelable.Field(id = 16)
    public final String zzp;

    @SafeParcelable.Field(id = 17)
    public final String zzq;

    @SafeParcelable.Field(id = 18)
    @Deprecated
    public final boolean zzr;

    @SafeParcelable.Field(id = 19)
    public final zzc zzs;

    @SafeParcelable.Field(id = 20)
    public final int zzt;

    @SafeParcelable.Field(id = 21)
    public final String zzu;

    @SafeParcelable.Field(id = 22)
    public final List zzv;

    @SafeParcelable.Field(id = 23)
    public final int zzw;

    @SafeParcelable.Field(id = 24)
    public final String zzx;

    @SafeParcelable.Field(id = EventType.SUBS)
    public final int zzy;

    public zzl(int i, long j, Bundle bundle, int i2, List list, boolean z, int i3, boolean z2, String str, zzfh zzfhVar, Location location, String str2, Bundle bundle2, Bundle bundle3, List list2, String str3, String str4, boolean z3, zzc zzcVar, int i4, String str5, List list3, int i5, String str6, int i6) {
        this.zza = i;
        this.zzb = j;
        this.zzc = bundle == null ? new Bundle() : bundle;
        this.zzd = i2;
        this.zze = list;
        this.zzf = z;
        this.zzg = i3;
        this.zzh = z2;
        this.zzi = str;
        this.zzj = zzfhVar;
        this.zzk = location;
        this.zzl = str2;
        this.zzm = bundle2 == null ? new Bundle() : bundle2;
        this.zzn = bundle3;
        this.zzo = list2;
        this.zzp = str3;
        this.zzq = str4;
        this.zzr = z3;
        this.zzs = zzcVar;
        this.zzt = i4;
        this.zzu = str5;
        this.zzv = list3 == null ? new ArrayList() : list3;
        this.zzw = i5;
        this.zzx = str6;
        this.zzy = i6;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzl)) {
            return false;
        }
        zzl zzlVar = (zzl) obj;
        return this.zza == zzlVar.zza && this.zzb == zzlVar.zzb && ggb.a(this.zzc, zzlVar.zzc) && this.zzd == zzlVar.zzd && Objects.equal(this.zze, zzlVar.zze) && this.zzf == zzlVar.zzf && this.zzg == zzlVar.zzg && this.zzh == zzlVar.zzh && Objects.equal(this.zzi, zzlVar.zzi) && Objects.equal(this.zzj, zzlVar.zzj) && Objects.equal(this.zzk, zzlVar.zzk) && Objects.equal(this.zzl, zzlVar.zzl) && ggb.a(this.zzm, zzlVar.zzm) && ggb.a(this.zzn, zzlVar.zzn) && Objects.equal(this.zzo, zzlVar.zzo) && Objects.equal(this.zzp, zzlVar.zzp) && Objects.equal(this.zzq, zzlVar.zzq) && this.zzr == zzlVar.zzr && this.zzt == zzlVar.zzt && Objects.equal(this.zzu, zzlVar.zzu) && Objects.equal(this.zzv, zzlVar.zzv) && this.zzw == zzlVar.zzw && Objects.equal(this.zzx, zzlVar.zzx) && this.zzy == zzlVar.zzy;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Long.valueOf(this.zzb), this.zzc, Integer.valueOf(this.zzd), this.zze, Boolean.valueOf(this.zzf), Integer.valueOf(this.zzg), Boolean.valueOf(this.zzh), this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzp, this.zzq, Boolean.valueOf(this.zzr), Integer.valueOf(this.zzt), this.zzu, this.zzv, Integer.valueOf(this.zzw), this.zzx, Integer.valueOf(this.zzy));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i2);
        SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        SafeParcelWriter.writeBundle(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        SafeParcelWriter.writeStringList(parcel, 5, this.zze, false);
        SafeParcelWriter.writeBoolean(parcel, 6, this.zzf);
        SafeParcelWriter.writeInt(parcel, 7, this.zzg);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzh);
        SafeParcelWriter.writeString(parcel, 9, this.zzi, false);
        SafeParcelWriter.writeParcelable(parcel, 10, this.zzj, i, false);
        SafeParcelWriter.writeParcelable(parcel, 11, this.zzk, i, false);
        SafeParcelWriter.writeString(parcel, 12, this.zzl, false);
        SafeParcelWriter.writeBundle(parcel, 13, this.zzm, false);
        SafeParcelWriter.writeBundle(parcel, 14, this.zzn, false);
        SafeParcelWriter.writeStringList(parcel, 15, this.zzo, false);
        SafeParcelWriter.writeString(parcel, 16, this.zzp, false);
        SafeParcelWriter.writeString(parcel, 17, this.zzq, false);
        SafeParcelWriter.writeBoolean(parcel, 18, this.zzr);
        SafeParcelWriter.writeParcelable(parcel, 19, this.zzs, i, false);
        SafeParcelWriter.writeInt(parcel, 20, this.zzt);
        SafeParcelWriter.writeString(parcel, 21, this.zzu, false);
        SafeParcelWriter.writeStringList(parcel, 22, this.zzv, false);
        SafeParcelWriter.writeInt(parcel, 23, this.zzw);
        SafeParcelWriter.writeString(parcel, 24, this.zzx, false);
        SafeParcelWriter.writeInt(parcel, 25, this.zzy);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
