package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.khe;
import defpackage.l6a;
import defpackage.o3b;
import defpackage.x3a;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzaft implements zzbx {
    public static final Parcelable.Creator<zzaft> CREATOR;
    private static final l6a zzf;
    private static final l6a zzg;
    public final String zza;
    public final String zzb;
    public final long zzc;
    public final long zzd;
    public final byte[] zze;
    private int zzh;

    static {
        x3a x3aVar = new x3a();
        x3aVar.w("application/id3");
        zzf = x3aVar.D();
        x3a x3aVar2 = new x3a();
        x3aVar2.w("application/x-scte35");
        zzg = x3aVar2.D();
        CREATOR = new f();
    }

    public zzaft(String str, String str2, long j, long j2, byte[] bArr) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = j;
        this.zzd = j2;
        this.zze = bArr;
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
        if (obj != null && zzaft.class == obj.getClass()) {
            zzaft zzaftVar = (zzaft) obj;
            if (this.zzc == zzaftVar.zzc && this.zzd == zzaftVar.zzd && khe.f(this.zza, zzaftVar.zza) && khe.f(this.zzb, zzaftVar.zzb) && Arrays.equals(this.zze, zzaftVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzh;
        if (i != 0) {
            return i;
        }
        String str = this.zza;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.zzb;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        long j = this.zzc;
        long j2 = this.zzd;
        int hashCode3 = ((((((((hashCode + 527) * 31) + hashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + Arrays.hashCode(this.zze);
        this.zzh = hashCode3;
        return hashCode3;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.zza + ", id=" + this.zzd + ", durationMs=" + this.zzc + ", value=" + this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeLong(this.zzc);
        parcel.writeLong(this.zzd);
        parcel.writeByteArray(this.zze);
    }

    zzaft(Parcel parcel) {
        String readString = parcel.readString();
        int i = khe.a;
        this.zza = readString;
        this.zzb = parcel.readString();
        this.zzc = parcel.readLong();
        this.zzd = parcel.readLong();
        this.zze = parcel.createByteArray();
    }
}
