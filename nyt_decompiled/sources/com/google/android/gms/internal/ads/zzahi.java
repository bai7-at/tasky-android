package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzahi;
import defpackage.wad;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class zzahi implements Parcelable {
    public final long zzb;
    public final long zzc;
    public final int zzd;
    public static final Comparator zza = new Comparator() { // from class: u0a
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            zzahi zzahiVar = (zzahi) obj;
            zzahi zzahiVar2 = (zzahi) obj2;
            return she.j().c(zzahiVar.zzb, zzahiVar2.zzb).c(zzahiVar.zzc, zzahiVar2.zzc).b(zzahiVar.zzd, zzahiVar2.zzd).a();
        }
    };
    public static final Parcelable.Creator<zzahi> CREATOR = new w();

    public zzahi(long j, long j2, int i) {
        wad.d(j < j2);
        this.zzb = j;
        this.zzc = j2;
        this.zzd = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzahi.class == obj.getClass()) {
            zzahi zzahiVar = (zzahi) obj;
            if (this.zzb == zzahiVar.zzb && this.zzc == zzahiVar.zzc && this.zzd == zzahiVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.zzb), Long.valueOf(this.zzc), Integer.valueOf(this.zzd)});
    }

    public final String toString() {
        return String.format(Locale.US, "Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.zzb), Long.valueOf(this.zzc), Integer.valueOf(this.zzd));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.zzb);
        parcel.writeLong(this.zzc);
        parcel.writeInt(this.zzd);
    }
}
