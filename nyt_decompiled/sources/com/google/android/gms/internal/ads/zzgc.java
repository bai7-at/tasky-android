package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.khe;
import defpackage.o3b;
import defpackage.sie;
import defpackage.wad;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzgc implements zzbx {
    public static final Parcelable.Creator<zzgc> CREATOR = new j9();
    public final String zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    public zzgc(String str, byte[] bArr, int i, int i2) {
        this.zza = str;
        this.zzb = bArr;
        this.zzc = i;
        this.zzd = i2;
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
        if (obj != null && zzgc.class == obj.getClass()) {
            zzgc zzgcVar = (zzgc) obj;
            if (this.zza.equals(zzgcVar.zza) && Arrays.equals(this.zzb, zzgcVar.zzb) && this.zzc == zzgcVar.zzc && this.zzd == zzgcVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.zza.hashCode() + 527) * 31) + Arrays.hashCode(this.zzb)) * 31) + this.zzc) * 31) + this.zzd;
    }

    public final String toString() {
        String O;
        int i = this.zzd;
        if (i != 1) {
            if (i == 23) {
                byte[] bArr = this.zzb;
                int i2 = khe.a;
                wad.d(bArr.length == 4);
                O = String.valueOf(Float.intBitsToFloat(((bArr[1] & 255) << 16) | (bArr[0] << 24) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)));
            } else if (i != 67) {
                byte[] bArr2 = this.zzb;
                int length = bArr2.length;
                StringBuilder sb = new StringBuilder(length + length);
                for (int i3 = 0; i3 < bArr2.length; i3++) {
                    sb.append(Character.forDigit((bArr2[i3] >> 4) & 15, 16));
                    sb.append(Character.forDigit(bArr2[i3] & 15, 16));
                }
                O = sb.toString();
            } else {
                byte[] bArr3 = this.zzb;
                int i4 = khe.a;
                wad.d(bArr3.length == 4);
                O = String.valueOf((bArr3[1] << 16) | (bArr3[0] << 24) | (bArr3[2] << 8) | bArr3[3]);
            }
        } else {
            O = khe.O(this.zzb);
        }
        return "mdta: key=" + this.zza + ", value=" + O;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeByteArray(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeInt(this.zzd);
    }

    /* synthetic */ zzgc(Parcel parcel, sie sieVar) {
        String readString = parcel.readString();
        int i = khe.a;
        this.zza = readString;
        this.zzb = parcel.createByteArray();
        this.zzc = parcel.readInt();
        this.zzd = parcel.readInt();
    }
}
