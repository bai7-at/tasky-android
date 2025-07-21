package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.id3.GeobFrame;
import defpackage.khe;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzagm extends zzagr {
    public static final Parcelable.Creator<zzagm> CREATOR = new o();
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final byte[] zzd;

    zzagm(Parcel parcel) {
        super(GeobFrame.ID);
        String readString = parcel.readString();
        int i = khe.a;
        this.zza = readString;
        this.zzb = parcel.readString();
        this.zzc = parcel.readString();
        this.zzd = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzagm.class == obj.getClass()) {
            zzagm zzagmVar = (zzagm) obj;
            if (khe.f(this.zza, zzagmVar.zza) && khe.f(this.zzb, zzagmVar.zzb) && khe.f(this.zzc, zzagmVar.zzc) && Arrays.equals(this.zzd, zzagmVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.zzb;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        int i = hashCode + 527;
        String str3 = this.zzc;
        return (((((i * 31) + hashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + Arrays.hashCode(this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzagr
    public final String toString() {
        return this.zzf + ": mimeType=" + this.zza + ", filename=" + this.zzb + ", description=" + this.zzc;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeByteArray(this.zzd);
    }

    public zzagm(String str, String str2, String str3, byte[] bArr) {
        super(GeobFrame.ID);
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = bArr;
    }
}
