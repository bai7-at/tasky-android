package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.oaid.BuildConfig;
import com.comscore.streaming.EventType;
import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ads.zzcei;
import defpackage.awa;
import defpackage.bgc;
import defpackage.cwa;
import defpackage.d7b;
import defpackage.ee3;
import defpackage.fc5;
import defpackage.jq9;
import defpackage.m7c;
import defpackage.mpa;
import defpackage.pla;
import defpackage.tof;
import defpackage.wlb;
import defpackage.wq9;

@SafeParcelable.Class(creator = "AdOverlayInfoCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public final class AdOverlayInfoParcel extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new i();

    @SafeParcelable.Field(id = 2)
    public final zzc zza;

    @SafeParcelable.Field(getter = "getAdClickListenerAsBinder", id = 3, type = "android.os.IBinder")
    public final jq9 zzb;

    @SafeParcelable.Field(getter = "getAdOverlayListenerAsBinder", id = 4, type = "android.os.IBinder")
    public final tof zzc;

    @SafeParcelable.Field(getter = "getAdWebViewAsBinder", id = 5, type = "android.os.IBinder")
    public final wlb zzd;

    @SafeParcelable.Field(getter = "getAppEventGmsgListenerAsBinder", id = 6, type = "android.os.IBinder")
    public final cwa zze;

    @SafeParcelable.Field(id = 7)
    public final String zzf;

    @SafeParcelable.Field(id = 8)
    public final boolean zzg;

    @SafeParcelable.Field(id = 9)
    public final String zzh;

    @SafeParcelable.Field(getter = "getLeaveApplicationListenerAsBinder", id = 10, type = "android.os.IBinder")
    public final wq9 zzi;

    @SafeParcelable.Field(id = 11)
    public final int zzj;

    @SafeParcelable.Field(id = 12)
    public final int zzk;

    @SafeParcelable.Field(id = 13)
    public final String zzl;

    @SafeParcelable.Field(id = 14)
    public final zzcei zzm;

    @SafeParcelable.Field(id = 16)
    public final String zzn;

    @SafeParcelable.Field(id = 17)
    public final zzj zzo;

    @SafeParcelable.Field(getter = "getAdMetadataGmsgListenerAsBinder", id = 18, type = "android.os.IBinder")
    public final awa zzp;

    @SafeParcelable.Field(id = 19)
    public final String zzq;

    @SafeParcelable.Field(id = 24)
    public final String zzr;

    @SafeParcelable.Field(id = EventType.SUBS)
    public final String zzs;

    @SafeParcelable.Field(getter = "getAdFailedToShowEventEmitterAsBinder", id = EventType.CDN, type = "android.os.IBinder")
    public final m7c zzt;

    @SafeParcelable.Field(getter = "getPhysicalClickListenerAsBinder", id = 27, type = "android.os.IBinder")
    public final bgc zzu;

    @SafeParcelable.Field(getter = "getOfflineUtilsAsBinder", id = 28, type = "android.os.IBinder")
    public final d7b zzv;

    @SafeParcelable.Field(id = BuildConfig.VERSION_CODE)
    public final boolean zzw;

    public AdOverlayInfoParcel(jq9 jq9Var, tof tofVar, awa awaVar, cwa cwaVar, wq9 wq9Var, wlb wlbVar, boolean z, int i, String str, zzcei zzceiVar, bgc bgcVar, d7b d7bVar, boolean z2) {
        this.zza = null;
        this.zzb = jq9Var;
        this.zzc = tofVar;
        this.zzd = wlbVar;
        this.zzp = awaVar;
        this.zze = cwaVar;
        this.zzf = null;
        this.zzg = z;
        this.zzh = null;
        this.zzi = wq9Var;
        this.zzj = i;
        this.zzk = 3;
        this.zzl = str;
        this.zzm = zzceiVar;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = bgcVar;
        this.zzv = d7bVar;
        this.zzw = z2;
    }

    public static AdOverlayInfoParcel t0(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        zzc zzcVar = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, zzcVar, i, false);
        SafeParcelWriter.writeIBinder(parcel, 3, fc5.l3(this.zzb).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 4, fc5.l3(this.zzc).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 5, fc5.l3(this.zzd).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 6, fc5.l3(this.zze).asBinder(), false);
        SafeParcelWriter.writeString(parcel, 7, this.zzf, false);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzg);
        SafeParcelWriter.writeString(parcel, 9, this.zzh, false);
        SafeParcelWriter.writeIBinder(parcel, 10, fc5.l3(this.zzi).asBinder(), false);
        SafeParcelWriter.writeInt(parcel, 11, this.zzj);
        SafeParcelWriter.writeInt(parcel, 12, this.zzk);
        SafeParcelWriter.writeString(parcel, 13, this.zzl, false);
        SafeParcelWriter.writeParcelable(parcel, 14, this.zzm, i, false);
        SafeParcelWriter.writeString(parcel, 16, this.zzn, false);
        SafeParcelWriter.writeParcelable(parcel, 17, this.zzo, i, false);
        SafeParcelWriter.writeIBinder(parcel, 18, fc5.l3(this.zzp).asBinder(), false);
        SafeParcelWriter.writeString(parcel, 19, this.zzq, false);
        SafeParcelWriter.writeString(parcel, 24, this.zzr, false);
        SafeParcelWriter.writeString(parcel, 25, this.zzs, false);
        SafeParcelWriter.writeIBinder(parcel, 26, fc5.l3(this.zzt).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 27, fc5.l3(this.zzu).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 28, fc5.l3(this.zzv).asBinder(), false);
        SafeParcelWriter.writeBoolean(parcel, 29, this.zzw);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public AdOverlayInfoParcel(jq9 jq9Var, tof tofVar, awa awaVar, cwa cwaVar, wq9 wq9Var, wlb wlbVar, boolean z, int i, String str, String str2, zzcei zzceiVar, bgc bgcVar, d7b d7bVar) {
        this.zza = null;
        this.zzb = jq9Var;
        this.zzc = tofVar;
        this.zzd = wlbVar;
        this.zzp = awaVar;
        this.zze = cwaVar;
        this.zzf = str2;
        this.zzg = z;
        this.zzh = str;
        this.zzi = wq9Var;
        this.zzj = i;
        this.zzk = 3;
        this.zzl = null;
        this.zzm = zzceiVar;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = bgcVar;
        this.zzv = d7bVar;
        this.zzw = false;
    }

    public AdOverlayInfoParcel(jq9 jq9Var, tof tofVar, wq9 wq9Var, wlb wlbVar, int i, zzcei zzceiVar, String str, zzj zzjVar, String str2, String str3, String str4, m7c m7cVar, d7b d7bVar) {
        this.zza = null;
        this.zzb = null;
        this.zzc = tofVar;
        this.zzd = wlbVar;
        this.zzp = null;
        this.zze = null;
        this.zzg = false;
        if (((Boolean) pla.c().a(mpa.I0)).booleanValue()) {
            this.zzf = null;
            this.zzh = null;
        } else {
            this.zzf = str2;
            this.zzh = str3;
        }
        this.zzi = null;
        this.zzj = i;
        this.zzk = 1;
        this.zzl = null;
        this.zzm = zzceiVar;
        this.zzn = str;
        this.zzo = zzjVar;
        this.zzq = null;
        this.zzr = null;
        this.zzs = str4;
        this.zzt = m7cVar;
        this.zzu = null;
        this.zzv = d7bVar;
        this.zzw = false;
    }

    public AdOverlayInfoParcel(jq9 jq9Var, tof tofVar, wq9 wq9Var, wlb wlbVar, boolean z, int i, zzcei zzceiVar, bgc bgcVar, d7b d7bVar) {
        this.zza = null;
        this.zzb = jq9Var;
        this.zzc = tofVar;
        this.zzd = wlbVar;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = z;
        this.zzh = null;
        this.zzi = wq9Var;
        this.zzj = i;
        this.zzk = 2;
        this.zzl = null;
        this.zzm = zzceiVar;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = bgcVar;
        this.zzv = d7bVar;
        this.zzw = false;
    }

    AdOverlayInfoParcel(zzc zzcVar, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z, String str2, IBinder iBinder5, int i, int i2, String str3, zzcei zzceiVar, String str4, zzj zzjVar, IBinder iBinder6, String str5, String str6, String str7, IBinder iBinder7, IBinder iBinder8, IBinder iBinder9, boolean z2) {
        this.zza = zzcVar;
        this.zzb = (jq9) fc5.Q1(ee3.a.O(iBinder));
        this.zzc = (tof) fc5.Q1(ee3.a.O(iBinder2));
        this.zzd = (wlb) fc5.Q1(ee3.a.O(iBinder3));
        this.zzp = (awa) fc5.Q1(ee3.a.O(iBinder6));
        this.zze = (cwa) fc5.Q1(ee3.a.O(iBinder4));
        this.zzf = str;
        this.zzg = z;
        this.zzh = str2;
        this.zzi = (wq9) fc5.Q1(ee3.a.O(iBinder5));
        this.zzj = i;
        this.zzk = i2;
        this.zzl = str3;
        this.zzm = zzceiVar;
        this.zzn = str4;
        this.zzo = zzjVar;
        this.zzq = str5;
        this.zzr = str6;
        this.zzs = str7;
        this.zzt = (m7c) fc5.Q1(ee3.a.O(iBinder7));
        this.zzu = (bgc) fc5.Q1(ee3.a.O(iBinder8));
        this.zzv = (d7b) fc5.Q1(ee3.a.O(iBinder9));
        this.zzw = z2;
    }

    public AdOverlayInfoParcel(zzc zzcVar, jq9 jq9Var, tof tofVar, wq9 wq9Var, zzcei zzceiVar, wlb wlbVar, bgc bgcVar) {
        this.zza = zzcVar;
        this.zzb = jq9Var;
        this.zzc = tofVar;
        this.zzd = wlbVar;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = wq9Var;
        this.zzj = -1;
        this.zzk = 4;
        this.zzl = null;
        this.zzm = zzceiVar;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = bgcVar;
        this.zzv = null;
        this.zzw = false;
    }

    public AdOverlayInfoParcel(tof tofVar, wlb wlbVar, int i, zzcei zzceiVar) {
        this.zzc = tofVar;
        this.zzd = wlbVar;
        this.zzj = 1;
        this.zzm = zzceiVar;
        this.zza = null;
        this.zzb = null;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = null;
        this.zzk = 1;
        this.zzl = null;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzv = null;
        this.zzw = false;
    }

    public AdOverlayInfoParcel(wlb wlbVar, zzcei zzceiVar, String str, String str2, int i, d7b d7bVar) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = wlbVar;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = null;
        this.zzj = 14;
        this.zzk = 5;
        this.zzl = null;
        this.zzm = zzceiVar;
        this.zzn = null;
        this.zzo = null;
        this.zzq = str;
        this.zzr = str2;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzv = d7bVar;
        this.zzw = false;
    }
}
