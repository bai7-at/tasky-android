package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import defpackage.ee3;
import defpackage.fc5;

@SafeParcelable.Class(creator = "GoogleCertificatesLookupQueryCreator")
/* loaded from: classes2.dex */
public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzo> CREATOR = new zzp();

    @SafeParcelable.Field(getter = "getCallingPackage", id = 1)
    private final String zza;

    @SafeParcelable.Field(getter = "getAllowTestKeys", id = 2)
    private final boolean zzb;

    @SafeParcelable.Field(defaultValue = "false", getter = "getIgnoreTestKeysOverride", id = 3)
    private final boolean zzc;

    @SafeParcelable.Field(getter = "getCallingContextBinder", id = 4, type = "android.os.IBinder")
    private final Context zzd;

    @SafeParcelable.Field(getter = "getIsChimeraPackage", id = 5)
    private final boolean zze;

    @SafeParcelable.Field(getter = "getIncludeHashesInErrorMessage", id = 6)
    private final boolean zzf;

    @SafeParcelable.Constructor
    zzo(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) boolean z, @SafeParcelable.Param(id = 3) boolean z2, @SafeParcelable.Param(id = 4) IBinder iBinder, @SafeParcelable.Param(id = 5) boolean z3, @SafeParcelable.Param(id = 6) boolean z4) {
        this.zza = str;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = (Context) fc5.Q1(ee3.a.O(iBinder));
        this.zze = z3;
        this.zzf = z4;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [android.os.IBinder, ee3] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzb);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzc);
        SafeParcelWriter.writeIBinder(parcel, 4, fc5.l3(this.zzd), false);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zze);
        SafeParcelWriter.writeBoolean(parcel, 6, this.zzf);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
