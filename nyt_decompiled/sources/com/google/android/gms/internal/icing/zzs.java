package com.google.android.gms.internal.icing;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;
import java.util.Arrays;

@ShowFirstParty
@SafeParcelable.Class(creator = "RegisterSectionInfoCreator")
@SafeParcelable.Reserved({NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT, 8, 9, 10})
/* loaded from: classes3.dex */
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new b2();

    @SafeParcelable.Field(id = 1)
    public final String zza;

    @SafeParcelable.Field(id = 2)
    public final String zzb;

    @SafeParcelable.Field(id = 3)
    public final boolean zzc;

    @SafeParcelable.Field(defaultValue = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, id = 4)
    public final int zzd;

    @SafeParcelable.Field(id = 5)
    public final boolean zze;

    @SafeParcelable.Field(id = 6)
    public final String zzf;

    @SafeParcelable.Field(id = 7)
    public final zzm[] zzg;

    @SafeParcelable.Field(id = 11)
    public final String zzh;

    @SafeParcelable.Field(id = 12)
    public final zzu zzi;

    zzs(String str, String str2, boolean z, int i, boolean z2, String str3, zzm[] zzmVarArr, String str4, zzu zzuVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = z;
        this.zzd = i;
        this.zze = z2;
        this.zzf = str3;
        this.zzg = zzmVarArr;
        this.zzh = str4;
        this.zzi = zzuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzs)) {
            return false;
        }
        zzs zzsVar = (zzs) obj;
        return this.zzc == zzsVar.zzc && this.zzd == zzsVar.zzd && this.zze == zzsVar.zze && Objects.equal(this.zza, zzsVar.zza) && Objects.equal(this.zzb, zzsVar.zzb) && Objects.equal(this.zzf, zzsVar.zzf) && Objects.equal(this.zzh, zzsVar.zzh) && Objects.equal(this.zzi, zzsVar.zzi) && Arrays.equals(this.zzg, zzsVar.zzg);
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, Boolean.valueOf(this.zzc), Integer.valueOf(this.zzd), Boolean.valueOf(this.zze), this.zzf, Integer.valueOf(Arrays.hashCode(this.zzg)), this.zzh, this.zzi);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzc);
        SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zze);
        SafeParcelWriter.writeString(parcel, 6, this.zzf, false);
        SafeParcelWriter.writeTypedArray(parcel, 7, this.zzg, i, false);
        SafeParcelWriter.writeString(parcel, 11, this.zzh, false);
        SafeParcelWriter.writeParcelable(parcel, 12, this.zzi, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
