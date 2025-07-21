package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import defpackage.oma;
import java.io.InputStream;

@SafeParcelable.Class(creator = "CacheEntryParcelCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public final class zzbay extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbay> CREATOR = new oma();

    @SafeParcelable.Field(getter = "getContentFileDescriptor", id = 2)
    private ParcelFileDescriptor zza;

    @SafeParcelable.Field(getter = "hasAdditionalMetadataFromReadV2", id = 3)
    private final boolean zzb;

    @SafeParcelable.Field(getter = "isDownloaded", id = 4)
    private final boolean zzc;

    @SafeParcelable.Field(getter = "getCachedBytes", id = 5)
    private final long zzd;

    @SafeParcelable.Field(getter = "isGcacheHit", id = 6)
    private final boolean zze;

    public zzbay() {
        this(null, false, false, 0L, false);
    }

    final synchronized ParcelFileDescriptor G0() {
        return this.zza;
    }

    public final synchronized InputStream H0() {
        if (this.zza == null) {
            return null;
        }
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(this.zza);
        this.zza = null;
        return autoCloseInputStream;
    }

    public final synchronized boolean K0() {
        return this.zzb;
    }

    public final synchronized boolean X0() {
        return this.zza != null;
    }

    public final synchronized long t0() {
        return this.zzd;
    }

    public final synchronized boolean u1() {
        return this.zzc;
    }

    public final synchronized boolean v1() {
        return this.zze;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, G0(), i, false);
        SafeParcelWriter.writeBoolean(parcel, 3, K0());
        SafeParcelWriter.writeBoolean(parcel, 4, u1());
        SafeParcelWriter.writeLong(parcel, 5, t0());
        SafeParcelWriter.writeBoolean(parcel, 6, v1());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzbay(ParcelFileDescriptor parcelFileDescriptor, boolean z, boolean z2, long j, boolean z3) {
        this.zza = parcelFileDescriptor;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = j;
        this.zze = z3;
    }
}
