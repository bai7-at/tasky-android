package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cke;
import defpackage.o3b;
import defpackage.wad;

/* loaded from: classes3.dex */
public final class zzgf implements zzbx {
    public static final Parcelable.Creator<zzgf> CREATOR = new ta();
    public final float zza;
    public final float zzb;

    public zzgf(float f, float f2) {
        boolean z = false;
        if (f >= -90.0f && f <= 90.0f && f2 >= -180.0f && f2 <= 180.0f) {
            z = true;
        }
        wad.e(z, "Invalid latitude or longitude");
        this.zza = f;
        this.zzb = f2;
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
        if (obj != null && zzgf.class == obj.getClass()) {
            zzgf zzgfVar = (zzgf) obj;
            if (this.zza == zzgfVar.zza && this.zzb == zzgfVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.zza).hashCode() + 527) * 31) + Float.valueOf(this.zzb).hashCode();
    }

    public final String toString() {
        return "xyz: latitude=" + this.zza + ", longitude=" + this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.zza);
        parcel.writeFloat(this.zzb);
    }

    /* synthetic */ zzgf(Parcel parcel, cke ckeVar) {
        this.zza = parcel.readFloat();
        this.zzb = parcel.readFloat();
    }
}
