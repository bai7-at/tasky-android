package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.o3b;
import defpackage.v0a;

/* loaded from: classes3.dex */
public final class zzahm implements zzbx {
    public static final Parcelable.Creator<zzahm> CREATOR = new x();
    public final float zza;
    public final int zzb;

    public zzahm(float f, int i) {
        this.zza = f;
        this.zzb = i;
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
        if (obj != null && zzahm.class == obj.getClass()) {
            zzahm zzahmVar = (zzahm) obj;
            if (this.zza == zzahmVar.zza && this.zzb == zzahmVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.zza).hashCode() + 527) * 31) + this.zzb;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.zza + ", svcTemporalLayerCount=" + this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.zza);
        parcel.writeInt(this.zzb);
    }

    /* synthetic */ zzahm(Parcel parcel, v0a v0aVar) {
        this.zza = parcel.readFloat();
        this.zzb = parcel.readInt();
    }
}
