package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import defpackage.mpa;
import defpackage.p3e;
import defpackage.pla;
import defpackage.q3e;
import defpackage.r3e;

@SafeParcelable.Class(creator = "PoolConfigurationCreator")
/* loaded from: classes3.dex */
public final class zzfjc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfjc> CREATOR = new r3e();
    public final Context zza;
    public final zzfiz zzb;

    @SafeParcelable.Field(id = 2)
    public final int zzc;

    @SafeParcelable.Field(id = 3)
    public final int zzd;

    @SafeParcelable.Field(id = 4)
    public final int zze;

    @SafeParcelable.Field(id = 5)
    public final String zzf;
    public final int zzg;
    private final zzfiz[] zzh;

    @SafeParcelable.Field(getter = "getFormatInt", id = 1)
    private final int zzi;

    @SafeParcelable.Field(getter = "getPoolDiscardStrategyInt", id = 6)
    private final int zzj;

    @SafeParcelable.Field(getter = "getPrecacheStartTriggerInt", id = 7)
    private final int zzk;
    private final int[] zzl;
    private final int[] zzm;

    public zzfjc(int i, int i2, int i3, int i4, String str, int i5, int i6) {
        zzfiz[] values = zzfiz.values();
        this.zzh = values;
        int[] a = p3e.a();
        this.zzl = a;
        int[] a2 = q3e.a();
        this.zzm = a2;
        this.zza = null;
        this.zzi = i;
        this.zzb = values[i];
        this.zzc = i2;
        this.zzd = i3;
        this.zze = i4;
        this.zzf = str;
        this.zzj = i5;
        this.zzg = a[i5];
        this.zzk = i6;
        int i7 = a2[i6];
    }

    public static zzfjc t0(zzfiz zzfizVar, Context context) {
        if (zzfizVar == zzfiz.Rewarded) {
            return new zzfjc(context, zzfizVar, ((Integer) pla.c().a(mpa.t6)).intValue(), ((Integer) pla.c().a(mpa.z6)).intValue(), ((Integer) pla.c().a(mpa.B6)).intValue(), (String) pla.c().a(mpa.D6), (String) pla.c().a(mpa.v6), (String) pla.c().a(mpa.x6));
        }
        if (zzfizVar == zzfiz.Interstitial) {
            return new zzfjc(context, zzfizVar, ((Integer) pla.c().a(mpa.u6)).intValue(), ((Integer) pla.c().a(mpa.A6)).intValue(), ((Integer) pla.c().a(mpa.C6)).intValue(), (String) pla.c().a(mpa.E6), (String) pla.c().a(mpa.w6), (String) pla.c().a(mpa.y6));
        }
        if (zzfizVar != zzfiz.AppOpen) {
            return null;
        }
        return new zzfjc(context, zzfizVar, ((Integer) pla.c().a(mpa.H6)).intValue(), ((Integer) pla.c().a(mpa.J6)).intValue(), ((Integer) pla.c().a(mpa.K6)).intValue(), (String) pla.c().a(mpa.F6), (String) pla.c().a(mpa.G6), (String) pla.c().a(mpa.I6));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zzi;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i2);
        SafeParcelWriter.writeInt(parcel, 2, this.zzc);
        SafeParcelWriter.writeInt(parcel, 3, this.zzd);
        SafeParcelWriter.writeInt(parcel, 4, this.zze);
        SafeParcelWriter.writeString(parcel, 5, this.zzf, false);
        SafeParcelWriter.writeInt(parcel, 6, this.zzj);
        SafeParcelWriter.writeInt(parcel, 7, this.zzk);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    private zzfjc(Context context, zzfiz zzfizVar, int i, int i2, int i3, String str, String str2, String str3) {
        int i4;
        this.zzh = zzfiz.values();
        this.zzl = p3e.a();
        this.zzm = q3e.a();
        this.zza = context;
        this.zzi = zzfizVar.ordinal();
        this.zzb = zzfizVar;
        this.zzc = i;
        this.zzd = i2;
        this.zze = i3;
        this.zzf = str;
        if ("oldest".equals(str2)) {
            i4 = 1;
        } else {
            i4 = (!"lru".equals(str2) && "lfu".equals(str2)) ? 3 : 2;
        }
        this.zzg = i4;
        this.zzj = i4 - 1;
        "onAdClosed".equals(str3);
        this.zzk = 0;
    }
}
