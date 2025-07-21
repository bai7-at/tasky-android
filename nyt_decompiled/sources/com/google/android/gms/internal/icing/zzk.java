package com.google.android.gms.internal.icing;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;

@ShowFirstParty
@SafeParcelable.Class(creator = "DocumentSectionCreator")
@SafeParcelable.Reserved({NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT})
/* loaded from: classes3.dex */
public final class zzk extends AbstractSafeParcelable {
    private static final zzs zzf;

    @SafeParcelable.Field(id = 1)
    public final String zzb;

    @SafeParcelable.Field(id = 3)
    final zzs zzc;

    @SafeParcelable.Field(defaultValue = "-1", id = 4)
    public final int zzd;

    @SafeParcelable.Field(id = 5)
    public final byte[] zze;
    public static final int zza = Integer.parseInt("-1");
    public static final Parcelable.Creator<zzk> CREATOR = new w1();

    static {
        a2 a2Var = new a2("SsbContext");
        a2Var.b(true);
        a2Var.a("blob");
        zzf = a2Var.e();
    }

    zzk(String str, zzs zzsVar, int i, byte[] bArr) {
        String str2;
        int i2 = zza;
        boolean z = true;
        if (i != i2 && z1.a(i) == null) {
            z = false;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("Invalid section type ");
        sb.append(i);
        Preconditions.checkArgument(z, sb.toString());
        this.zzb = str;
        this.zzc = zzsVar;
        this.zzd = i;
        this.zze = bArr;
        if (i == i2 || z1.a(i) != null) {
            str2 = null;
            if (str != null && bArr != null) {
                str2 = "Both content and blobContent set";
            }
        } else {
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append("Invalid section type ");
            sb2.append(i);
            str2 = sb2.toString();
        }
        if (str2 != null) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static zzk t0(byte[] bArr) {
        return new zzk(null, zzf, zza, bArr);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zzb, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzc, i, false);
        SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        SafeParcelWriter.writeByteArray(parcel, 5, this.zze, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzk(byte[] bArr, zzs zzsVar) {
        this(null, zzsVar, zza, bArr);
    }
}
