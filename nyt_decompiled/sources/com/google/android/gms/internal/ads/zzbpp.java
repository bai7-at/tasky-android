package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import defpackage.oza;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;

@SafeParcelable.Class(creator = "InstreamAdConfigurationParcelCreator")
/* loaded from: classes3.dex */
public final class zzbpp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbpp> CREATOR = new oza();

    @SafeParcelable.VersionField(id = NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT)
    public final int zza;

    @SafeParcelable.Field(id = 1)
    public final int zzb;

    @SafeParcelable.Field(id = 2)
    public final String zzc;

    @SafeParcelable.Field(id = 3)
    public final int zzd;

    public zzbpp(int i, int i2, String str, int i3) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = str;
        this.zzd = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zzb;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i2);
        SafeParcelWriter.writeString(parcel, 2, this.zzc, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zzd);
        SafeParcelWriter.writeInt(parcel, NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT, this.zza);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
