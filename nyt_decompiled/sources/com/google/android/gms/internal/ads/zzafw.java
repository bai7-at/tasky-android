package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b9e;
import defpackage.ege;
import defpackage.khe;
import defpackage.o3b;
import defpackage.qcb;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzafw implements zzbx {
    public static final Parcelable.Creator<zzafw> CREATOR = new g();
    public final int zza;
    public final String zzb;
    public final String zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final byte[] zzh;

    public zzafw(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.zza = i;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = i2;
        this.zze = i3;
        this.zzf = i4;
        this.zzg = i5;
        this.zzh = bArr;
    }

    public static zzafw a(b9e b9eVar) {
        int v = b9eVar.v();
        String e = qcb.e(b9eVar.a(b9eVar.v(), ege.a));
        String a = b9eVar.a(b9eVar.v(), ege.c);
        int v2 = b9eVar.v();
        int v3 = b9eVar.v();
        int v4 = b9eVar.v();
        int v5 = b9eVar.v();
        int v6 = b9eVar.v();
        byte[] bArr = new byte[v6];
        b9eVar.g(bArr, 0, v6);
        return new zzafw(v, e, a, v2, v3, v4, v5, bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzbx
    public final void L(o3b o3bVar) {
        o3bVar.s(this.zzh, this.zza);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzafw.class == obj.getClass()) {
            zzafw zzafwVar = (zzafw) obj;
            if (this.zza == zzafwVar.zza && this.zzb.equals(zzafwVar.zzb) && this.zzc.equals(zzafwVar.zzc) && this.zzd == zzafwVar.zzd && this.zze == zzafwVar.zze && this.zzf == zzafwVar.zzf && this.zzg == zzafwVar.zzg && Arrays.equals(this.zzh, zzafwVar.zzh)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.zza + 527) * 31) + this.zzb.hashCode()) * 31) + this.zzc.hashCode()) * 31) + this.zzd) * 31) + this.zze) * 31) + this.zzf) * 31) + this.zzg) * 31) + Arrays.hashCode(this.zzh);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.zzb + ", description=" + this.zzc;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeInt(this.zzd);
        parcel.writeInt(this.zze);
        parcel.writeInt(this.zzf);
        parcel.writeInt(this.zzg);
        parcel.writeByteArray(this.zzh);
    }

    zzafw(Parcel parcel) {
        this.zza = parcel.readInt();
        String readString = parcel.readString();
        int i = khe.a;
        this.zzb = readString;
        this.zzc = parcel.readString();
        this.zzd = parcel.readInt();
        this.zze = parcel.readInt();
        this.zzf = parcel.readInt();
        this.zzg = parcel.readInt();
        this.zzh = parcel.createByteArray();
    }
}
