package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.comscore.streaming.EventType;
import com.google.android.gms.ads.internal.client.zzdu;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import zendesk.core.BuildConfig;

@SafeParcelable.Class(creator = "AdRequestInfoParcelCreator")
/* loaded from: classes3.dex */
public final class zzbyf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbyf> CREATOR = new d6();

    @SafeParcelable.Field(id = 31)
    public final long zzA;

    @SafeParcelable.Field(id = 33)
    public final String zzB;

    @SafeParcelable.Field(id = 34)
    public final float zzC;

    @SafeParcelable.Field(id = 35)
    public final int zzD;

    @SafeParcelable.Field(id = 36)
    public final int zzE;

    @SafeParcelable.Field(id = 37)
    public final boolean zzF;

    @SafeParcelable.Field(id = 39)
    public final String zzG;

    @SafeParcelable.Field(id = 40)
    public final boolean zzH;

    @SafeParcelable.Field(id = 41)
    public final String zzI;

    @SafeParcelable.Field(id = 42)
    public final boolean zzJ;

    @SafeParcelable.Field(id = 43)
    public final int zzK;

    @SafeParcelable.Field(id = 44)
    public final Bundle zzL;

    @SafeParcelable.Field(id = 45)
    public final String zzM;

    @SafeParcelable.Field(id = 46)
    public final zzdu zzN;

    @SafeParcelable.Field(id = 47)
    public final boolean zzO;

    @SafeParcelable.Field(id = 48)
    public final Bundle zzP;

    @SafeParcelable.Field(id = 49)
    public final String zzQ;

    @SafeParcelable.Field(id = 50)
    public final String zzR;

    @SafeParcelable.Field(id = 51)
    public final String zzS;

    @SafeParcelable.Field(id = 52)
    public final boolean zzT;

    @SafeParcelable.Field(id = BuildConfig.VERSION_CODE)
    public final List zzU;

    @SafeParcelable.Field(id = 54)
    public final String zzV;

    @SafeParcelable.Field(id = 55)
    public final List zzW;

    @SafeParcelable.Field(id = 56)
    public final int zzX;

    @SafeParcelable.Field(id = 57)
    public final boolean zzY;

    @SafeParcelable.Field(id = 58)
    public final boolean zzZ;

    @SafeParcelable.Field(id = 1)
    public final int zza;

    @SafeParcelable.Field(id = 59)
    public final boolean zzaa;

    @SafeParcelable.Field(id = LockFreeTaskQueueCore.FROZEN_SHIFT)
    public final ArrayList zzab;

    @SafeParcelable.Field(id = LockFreeTaskQueueCore.CLOSED_SHIFT)
    public final String zzac;

    @SafeParcelable.Field(id = 63)
    public final zzbpp zzad;

    @SafeParcelable.Field(id = 64)
    public final String zzae;

    @SafeParcelable.Field(id = 65)
    public final Bundle zzaf;

    @SafeParcelable.Field(id = 2)
    public final Bundle zzb;

    @SafeParcelable.Field(id = 3)
    public final zzl zzc;

    @SafeParcelable.Field(id = 4)
    public final zzq zzd;

    @SafeParcelable.Field(id = 5)
    public final String zze;

    @SafeParcelable.Field(id = 6)
    public final ApplicationInfo zzf;

    @SafeParcelable.Field(id = 7)
    public final PackageInfo zzg;

    @SafeParcelable.Field(id = 8)
    public final String zzh;

    @SafeParcelable.Field(id = 9)
    public final String zzi;

    @SafeParcelable.Field(id = 10)
    public final String zzj;

    @SafeParcelable.Field(id = 11)
    public final zzcei zzk;

    @SafeParcelable.Field(id = 12)
    public final Bundle zzl;

    @SafeParcelable.Field(id = 13)
    public final int zzm;

    @SafeParcelable.Field(id = 14)
    public final List zzn;

    @SafeParcelable.Field(id = 15)
    public final Bundle zzo;

    @SafeParcelable.Field(id = 16)
    public final boolean zzp;

    @SafeParcelable.Field(id = 18)
    public final int zzq;

    @SafeParcelable.Field(id = 19)
    public final int zzr;

    @SafeParcelable.Field(id = 20)
    public final float zzs;

    @SafeParcelable.Field(id = 21)
    public final String zzt;

    @SafeParcelable.Field(id = EventType.SUBS)
    public final long zzu;

    @SafeParcelable.Field(id = EventType.CDN)
    public final String zzv;

    @SafeParcelable.Field(id = 27)
    public final List zzw;

    @SafeParcelable.Field(id = 28)
    public final String zzx;

    @SafeParcelable.Field(id = com.appsflyer.oaid.BuildConfig.VERSION_CODE)
    public final zzbjb zzy;

    @SafeParcelable.Field(id = 30)
    public final List zzz;

    zzbyf(int i, Bundle bundle, zzl zzlVar, zzq zzqVar, String str, ApplicationInfo applicationInfo, PackageInfo packageInfo, String str2, String str3, String str4, zzcei zzceiVar, Bundle bundle2, int i2, List list, Bundle bundle3, boolean z, int i3, int i4, float f, String str5, long j, String str6, List list2, String str7, zzbjb zzbjbVar, List list3, long j2, String str8, float f2, boolean z2, int i5, int i6, boolean z3, String str9, String str10, boolean z4, int i7, Bundle bundle4, String str11, zzdu zzduVar, boolean z5, Bundle bundle5, String str12, String str13, String str14, boolean z6, List list4, String str15, List list5, int i8, boolean z7, boolean z8, boolean z9, ArrayList arrayList, String str16, zzbpp zzbppVar, String str17, Bundle bundle6) {
        this.zza = i;
        this.zzb = bundle;
        this.zzc = zzlVar;
        this.zzd = zzqVar;
        this.zze = str;
        this.zzf = applicationInfo;
        this.zzg = packageInfo;
        this.zzh = str2;
        this.zzi = str3;
        this.zzj = str4;
        this.zzk = zzceiVar;
        this.zzl = bundle2;
        this.zzm = i2;
        this.zzn = list;
        this.zzz = list3 == null ? Collections.emptyList() : Collections.unmodifiableList(list3);
        this.zzo = bundle3;
        this.zzp = z;
        this.zzq = i3;
        this.zzr = i4;
        this.zzs = f;
        this.zzt = str5;
        this.zzu = j;
        this.zzv = str6;
        this.zzw = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
        this.zzx = str7;
        this.zzy = zzbjbVar;
        this.zzA = j2;
        this.zzB = str8;
        this.zzC = f2;
        this.zzH = z2;
        this.zzD = i5;
        this.zzE = i6;
        this.zzF = z3;
        this.zzG = str9;
        this.zzI = str10;
        this.zzJ = z4;
        this.zzK = i7;
        this.zzL = bundle4;
        this.zzM = str11;
        this.zzN = zzduVar;
        this.zzO = z5;
        this.zzP = bundle5;
        this.zzQ = str12;
        this.zzR = str13;
        this.zzS = str14;
        this.zzT = z6;
        this.zzU = list4;
        this.zzV = str15;
        this.zzW = list5;
        this.zzX = i8;
        this.zzY = z7;
        this.zzZ = z8;
        this.zzaa = z9;
        this.zzab = arrayList;
        this.zzac = str16;
        this.zzad = zzbppVar;
        this.zzae = str17;
        this.zzaf = bundle6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i2);
        SafeParcelWriter.writeBundle(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzc, i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i, false);
        SafeParcelWriter.writeString(parcel, 5, this.zze, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzf, i, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.zzg, i, false);
        SafeParcelWriter.writeString(parcel, 8, this.zzh, false);
        SafeParcelWriter.writeString(parcel, 9, this.zzi, false);
        SafeParcelWriter.writeString(parcel, 10, this.zzj, false);
        SafeParcelWriter.writeParcelable(parcel, 11, this.zzk, i, false);
        SafeParcelWriter.writeBundle(parcel, 12, this.zzl, false);
        SafeParcelWriter.writeInt(parcel, 13, this.zzm);
        SafeParcelWriter.writeStringList(parcel, 14, this.zzn, false);
        SafeParcelWriter.writeBundle(parcel, 15, this.zzo, false);
        SafeParcelWriter.writeBoolean(parcel, 16, this.zzp);
        SafeParcelWriter.writeInt(parcel, 18, this.zzq);
        SafeParcelWriter.writeInt(parcel, 19, this.zzr);
        SafeParcelWriter.writeFloat(parcel, 20, this.zzs);
        SafeParcelWriter.writeString(parcel, 21, this.zzt, false);
        SafeParcelWriter.writeLong(parcel, 25, this.zzu);
        SafeParcelWriter.writeString(parcel, 26, this.zzv, false);
        SafeParcelWriter.writeStringList(parcel, 27, this.zzw, false);
        SafeParcelWriter.writeString(parcel, 28, this.zzx, false);
        SafeParcelWriter.writeParcelable(parcel, 29, this.zzy, i, false);
        SafeParcelWriter.writeStringList(parcel, 30, this.zzz, false);
        SafeParcelWriter.writeLong(parcel, 31, this.zzA);
        SafeParcelWriter.writeString(parcel, 33, this.zzB, false);
        SafeParcelWriter.writeFloat(parcel, 34, this.zzC);
        SafeParcelWriter.writeInt(parcel, 35, this.zzD);
        SafeParcelWriter.writeInt(parcel, 36, this.zzE);
        SafeParcelWriter.writeBoolean(parcel, 37, this.zzF);
        SafeParcelWriter.writeString(parcel, 39, this.zzG, false);
        SafeParcelWriter.writeBoolean(parcel, 40, this.zzH);
        SafeParcelWriter.writeString(parcel, 41, this.zzI, false);
        SafeParcelWriter.writeBoolean(parcel, 42, this.zzJ);
        SafeParcelWriter.writeInt(parcel, 43, this.zzK);
        SafeParcelWriter.writeBundle(parcel, 44, this.zzL, false);
        SafeParcelWriter.writeString(parcel, 45, this.zzM, false);
        SafeParcelWriter.writeParcelable(parcel, 46, this.zzN, i, false);
        SafeParcelWriter.writeBoolean(parcel, 47, this.zzO);
        SafeParcelWriter.writeBundle(parcel, 48, this.zzP, false);
        SafeParcelWriter.writeString(parcel, 49, this.zzQ, false);
        SafeParcelWriter.writeString(parcel, 50, this.zzR, false);
        SafeParcelWriter.writeString(parcel, 51, this.zzS, false);
        SafeParcelWriter.writeBoolean(parcel, 52, this.zzT);
        SafeParcelWriter.writeIntegerList(parcel, 53, this.zzU, false);
        SafeParcelWriter.writeString(parcel, 54, this.zzV, false);
        SafeParcelWriter.writeStringList(parcel, 55, this.zzW, false);
        SafeParcelWriter.writeInt(parcel, 56, this.zzX);
        SafeParcelWriter.writeBoolean(parcel, 57, this.zzY);
        SafeParcelWriter.writeBoolean(parcel, 58, this.zzZ);
        SafeParcelWriter.writeBoolean(parcel, 59, this.zzaa);
        SafeParcelWriter.writeStringList(parcel, 60, this.zzab, false);
        SafeParcelWriter.writeString(parcel, 61, this.zzac, false);
        SafeParcelWriter.writeParcelable(parcel, 63, this.zzad, i, false);
        SafeParcelWriter.writeString(parcel, 64, this.zzae, false);
        SafeParcelWriter.writeBundle(parcel, 65, this.zzaf, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
