package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.o3b;
import defpackage.t0a;

/* loaded from: classes3.dex */
public final class zzahe implements zzbx {
    public static final Parcelable.Creator<zzahe> CREATOR = new u();
    public final long zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;

    public zzahe(long j, long j2, long j3, long j4, long j5) {
        this.zza = j;
        this.zzb = j2;
        this.zzc = j3;
        this.zzd = j4;
        this.zze = j5;
    }

    @Override // com.google.android.gms.internal.ads.zzbx
    public final /* synthetic */ void L(o3b o3bVar) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzahe.class == obj.getClass()) {
            zzahe zzaheVar = (zzahe) obj;
            if (this.zza == zzaheVar.zza && this.zzb == zzaheVar.zzb && this.zzc == zzaheVar.zzc && this.zzd == zzaheVar.zzd && this.zze == zzaheVar.zze) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.zze;
        long j2 = this.zza;
        int i = ((int) (j2 ^ (j2 >>> 32))) + 527;
        long j3 = j ^ (j >>> 32);
        long j4 = this.zzd;
        long j5 = j4 ^ (j4 >>> 32);
        long j6 = this.zzc;
        long j7 = j6 ^ (j6 >>> 32);
        long j8 = this.zzb;
        return (((((((i * 31) + ((int) ((j8 >>> 32) ^ j8))) * 31) + ((int) j7)) * 31) + ((int) j5)) * 31) + ((int) j3);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.zza + ", photoSize=" + this.zzb + ", photoPresentationTimestampUs=" + this.zzc + ", videoStartPosition=" + this.zzd + ", videoSize=" + this.zze;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.zza);
        parcel.writeLong(this.zzb);
        parcel.writeLong(this.zzc);
        parcel.writeLong(this.zzd);
        parcel.writeLong(this.zze);
    }

    /* synthetic */ zzahe(Parcel parcel, t0a t0aVar) {
        this.zza = parcel.readLong();
        this.zzb = parcel.readLong();
        this.zzc = parcel.readLong();
        this.zzd = parcel.readLong();
        this.zze = parcel.readLong();
    }
}
