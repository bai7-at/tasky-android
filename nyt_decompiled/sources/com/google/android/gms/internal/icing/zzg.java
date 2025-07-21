package com.google.android.gms.internal.icing;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;
import java.util.Arrays;
import java.util.BitSet;

@ShowFirstParty
@SafeParcelable.Class(creator = "DocumentContentsCreator")
@SafeParcelable.Reserved({NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT})
/* loaded from: classes3.dex */
public final class zzg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzg> CREATOR = new v1();

    @SafeParcelable.Field(id = 1)
    final zzk[] zza;

    @SafeParcelable.Field(id = 2)
    public final String zzb;

    @SafeParcelable.Field(id = 3)
    public final boolean zzc;

    @SafeParcelable.Field(id = 4)
    public final Account zzd;

    zzg(String str, boolean z, Account account, zzk... zzkVarArr) {
        this(zzkVarArr, str, z, account);
        if (zzkVarArr != null) {
            int length = z1.a.length;
            BitSet bitSet = new BitSet(10);
            for (zzk zzkVar : zzkVarArr) {
                int i = zzkVar.zzd;
                if (i != -1) {
                    if (bitSet.get(i)) {
                        String valueOf = String.valueOf(z1.a(i));
                        throw new IllegalArgumentException(valueOf.length() != 0 ? "Duplicate global search section type ".concat(valueOf) : new String("Duplicate global search section type "));
                    }
                    bitSet.set(i);
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzg) {
            zzg zzgVar = (zzg) obj;
            if (Objects.equal(this.zzb, zzgVar.zzb) && Objects.equal(Boolean.valueOf(this.zzc), Boolean.valueOf(zzgVar.zzc)) && Objects.equal(this.zzd, zzgVar.zzd) && Arrays.equals(this.zza, zzgVar.zza)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zzb, Boolean.valueOf(this.zzc), this.zzd, Integer.valueOf(Arrays.hashCode(this.zza)));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedArray(parcel, 1, this.zza, i, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzc);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    zzg(zzk[] zzkVarArr, String str, boolean z, Account account) {
        this.zza = zzkVarArr;
        this.zzb = str;
        this.zzc = z;
        this.zzd = account;
    }
}
