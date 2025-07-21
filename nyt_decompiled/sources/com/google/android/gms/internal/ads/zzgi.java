package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ame;
import defpackage.o3b;

/* loaded from: classes3.dex */
public final class zzgi implements zzbx {
    public static final Parcelable.Creator<zzgi> CREATOR = new rc();
    public final long zza;
    public final long zzb;
    public final long zzc;

    public zzgi(long j, long j2, long j3) {
        this.zza = j;
        this.zzb = j2;
        this.zzc = j3;
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
        if (!(obj instanceof zzgi)) {
            return false;
        }
        zzgi zzgiVar = (zzgi) obj;
        return this.zza == zzgiVar.zza && this.zzb == zzgiVar.zzb && this.zzc == zzgiVar.zzc;
    }

    public final int hashCode() {
        long j = this.zzc;
        long j2 = this.zza;
        int i = ((int) (j2 ^ (j2 >>> 32))) + 527;
        long j3 = j ^ (j >>> 32);
        long j4 = this.zzb;
        return (((i * 31) + ((int) ((j4 >>> 32) ^ j4))) * 31) + ((int) j3);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.zza + ", modification time=" + this.zzb + ", timescale=" + this.zzc;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.zza);
        parcel.writeLong(this.zzb);
        parcel.writeLong(this.zzc);
    }

    /* synthetic */ zzgi(Parcel parcel, ame ameVar) {
        this.zza = parcel.readLong();
        this.zzb = parcel.readLong();
        this.zzc = parcel.readLong();
    }
}
