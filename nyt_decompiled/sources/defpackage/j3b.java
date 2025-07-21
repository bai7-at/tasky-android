package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.appsflyer.oaid.BuildConfig;
import com.comscore.streaming.EventType;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.internal.ads.zzbjb;
import com.google.android.gms.internal.ads.zzbpn;
import com.google.android.gms.internal.ads.zzbvg;
import defpackage.ee3;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public abstract class j3b extends mia implements k3b {
    public j3b() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // defpackage.mia
    protected final boolean v6(int i, Parcel parcel, Parcel parcel2, int i2) {
        t3b t3bVar = null;
        switch (i) {
            case 1:
                ee3 O = ee3.a.O(parcel.readStrongBinder());
                zzq zzqVar = (zzq) nia.a(parcel, zzq.CREATOR);
                zzl zzlVar = (zzl) nia.a(parcel, zzl.CREATOR);
                String readString = parcel.readString();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    t3bVar = queryLocalInterface instanceof t3b ? (t3b) queryLocalInterface : new l3b(readStrongBinder);
                }
                t3b t3bVar2 = t3bVar;
                nia.c(parcel);
                x3(O, zzqVar, zzlVar, readString, t3bVar2);
                parcel2.writeNoException();
                return true;
            case 2:
                ee3 zzn = zzn();
                parcel2.writeNoException();
                nia.f(parcel2, zzn);
                return true;
            case 3:
                ee3 O2 = ee3.a.O(parcel.readStrongBinder());
                zzl zzlVar2 = (zzl) nia.a(parcel, zzl.CREATOR);
                String readString2 = parcel.readString();
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    t3bVar = queryLocalInterface2 instanceof t3b ? (t3b) queryLocalInterface2 : new l3b(readStrongBinder2);
                }
                nia.c(parcel);
                u4(O2, zzlVar2, readString2, t3bVar);
                parcel2.writeNoException();
                return true;
            case 4:
                r();
                parcel2.writeNoException();
                return true;
            case 5:
                zzo();
                parcel2.writeNoException();
                return true;
            case 6:
                ee3 O3 = ee3.a.O(parcel.readStrongBinder());
                zzq zzqVar2 = (zzq) nia.a(parcel, zzq.CREATOR);
                zzl zzlVar3 = (zzl) nia.a(parcel, zzl.CREATOR);
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    t3bVar = queryLocalInterface3 instanceof t3b ? (t3b) queryLocalInterface3 : new l3b(readStrongBinder3);
                }
                t3b t3bVar3 = t3bVar;
                nia.c(parcel);
                z4(O3, zzqVar2, zzlVar3, readString3, readString4, t3bVar3);
                parcel2.writeNoException();
                return true;
            case 7:
                ee3 O4 = ee3.a.O(parcel.readStrongBinder());
                zzl zzlVar4 = (zzl) nia.a(parcel, zzl.CREATOR);
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    t3bVar = queryLocalInterface4 instanceof t3b ? (t3b) queryLocalInterface4 : new l3b(readStrongBinder4);
                }
                t3b t3bVar4 = t3bVar;
                nia.c(parcel);
                g5(O4, zzlVar4, readString5, readString6, t3bVar4);
                parcel2.writeNoException();
                return true;
            case 8:
                D();
                parcel2.writeNoException();
                return true;
            case 9:
                h();
                parcel2.writeNoException();
                return true;
            case 10:
                ee3 O5 = ee3.a.O(parcel.readStrongBinder());
                zzl zzlVar5 = (zzl) nia.a(parcel, zzl.CREATOR);
                String readString7 = parcel.readString();
                vbb w6 = ubb.w6(parcel.readStrongBinder());
                String readString8 = parcel.readString();
                nia.c(parcel);
                O2(O5, zzlVar5, readString7, w6, readString8);
                parcel2.writeNoException();
                return true;
            case 11:
                zzl zzlVar6 = (zzl) nia.a(parcel, zzl.CREATOR);
                String readString9 = parcel.readString();
                nia.c(parcel);
                U2(zzlVar6, readString9);
                parcel2.writeNoException();
                return true;
            case 12:
                u();
                parcel2.writeNoException();
                return true;
            case 13:
                boolean zzN = zzN();
                parcel2.writeNoException();
                int i3 = nia.b;
                parcel2.writeInt(zzN ? 1 : 0);
                return true;
            case 14:
                ee3 O6 = ee3.a.O(parcel.readStrongBinder());
                zzl zzlVar7 = (zzl) nia.a(parcel, zzl.CREATOR);
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    t3bVar = queryLocalInterface5 instanceof t3b ? (t3b) queryLocalInterface5 : new l3b(readStrongBinder5);
                }
                t3b t3bVar5 = t3bVar;
                zzbjb zzbjbVar = (zzbjb) nia.a(parcel, zzbjb.CREATOR);
                ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                nia.c(parcel);
                d1(O6, zzlVar7, readString10, readString11, t3bVar5, zzbjbVar, createStringArrayList);
                parcel2.writeNoException();
                return true;
            case 15:
                parcel2.writeNoException();
                nia.f(parcel2, null);
                return true;
            case 16:
                parcel2.writeNoException();
                nia.f(parcel2, null);
                return true;
            case 17:
                Bundle zze = zze();
                parcel2.writeNoException();
                nia.e(parcel2, zze);
                return true;
            case 18:
                Bundle zzf = zzf();
                parcel2.writeNoException();
                nia.e(parcel2, zzf);
                return true;
            case 19:
                Bundle zzg = zzg();
                parcel2.writeNoException();
                nia.e(parcel2, zzg);
                return true;
            case 20:
                zzl zzlVar8 = (zzl) nia.a(parcel, zzl.CREATOR);
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                nia.c(parcel);
                E3(zzlVar8, readString12, readString13);
                parcel2.writeNoException();
                return true;
            case 21:
                ee3 O7 = ee3.a.O(parcel.readStrongBinder());
                nia.c(parcel);
                O5(O7);
                parcel2.writeNoException();
                return true;
            case 22:
                parcel2.writeNoException();
                int i4 = nia.b;
                parcel2.writeInt(0);
                return true;
            case 23:
                ee3 O8 = ee3.a.O(parcel.readStrongBinder());
                vbb w62 = ubb.w6(parcel.readStrongBinder());
                ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
                nia.c(parcel);
                R2(O8, w62, createStringArrayList2);
                parcel2.writeNoException();
                return true;
            case 24:
                jua zzi = zzi();
                parcel2.writeNoException();
                nia.f(parcel2, zzi);
                return true;
            case EventType.SUBS /* 25 */:
                boolean g = nia.g(parcel);
                nia.c(parcel);
                Q(g);
                parcel2.writeNoException();
                return true;
            case EventType.CDN /* 26 */:
                znc zzh = zzh();
                parcel2.writeNoException();
                nia.f(parcel2, zzh);
                return true;
            case 27:
                c4b zzk = zzk();
                parcel2.writeNoException();
                nia.f(parcel2, zzk);
                return true;
            case 28:
                ee3 O9 = ee3.a.O(parcel.readStrongBinder());
                zzl zzlVar9 = (zzl) nia.a(parcel, zzl.CREATOR);
                String readString14 = parcel.readString();
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    t3bVar = queryLocalInterface6 instanceof t3b ? (t3b) queryLocalInterface6 : new l3b(readStrongBinder6);
                }
                nia.c(parcel);
                N2(O9, zzlVar9, readString14, t3bVar);
                parcel2.writeNoException();
                return true;
            case BuildConfig.VERSION_CODE /* 29 */:
            default:
                return false;
            case 30:
                ee3 O10 = ee3.a.O(parcel.readStrongBinder());
                nia.c(parcel);
                x0(O10);
                parcel2.writeNoException();
                return true;
            case 31:
                ee3 O11 = ee3.a.O(parcel.readStrongBinder());
                jza w63 = iza.w6(parcel.readStrongBinder());
                ArrayList createTypedArrayList = parcel.createTypedArrayList(zzbpn.CREATOR);
                nia.c(parcel);
                W3(O11, w63, createTypedArrayList);
                parcel2.writeNoException();
                return true;
            case 32:
                ee3 O12 = ee3.a.O(parcel.readStrongBinder());
                zzl zzlVar10 = (zzl) nia.a(parcel, zzl.CREATOR);
                String readString15 = parcel.readString();
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    t3bVar = queryLocalInterface7 instanceof t3b ? (t3b) queryLocalInterface7 : new l3b(readStrongBinder7);
                }
                nia.c(parcel);
                Z4(O12, zzlVar10, readString15, t3bVar);
                parcel2.writeNoException();
                return true;
            case 33:
                zzbvg zzl = zzl();
                parcel2.writeNoException();
                nia.e(parcel2, zzl);
                return true;
            case 34:
                zzbvg zzm = zzm();
                parcel2.writeNoException();
                nia.e(parcel2, zzm);
                return true;
            case 35:
                ee3 O13 = ee3.a.O(parcel.readStrongBinder());
                zzq zzqVar3 = (zzq) nia.a(parcel, zzq.CREATOR);
                zzl zzlVar11 = (zzl) nia.a(parcel, zzl.CREATOR);
                String readString16 = parcel.readString();
                String readString17 = parcel.readString();
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    t3bVar = queryLocalInterface8 instanceof t3b ? (t3b) queryLocalInterface8 : new l3b(readStrongBinder8);
                }
                t3b t3bVar6 = t3bVar;
                nia.c(parcel);
                Q4(O13, zzqVar3, zzlVar11, readString16, readString17, t3bVar6);
                parcel2.writeNoException();
                return true;
            case 36:
                w3b zzj = zzj();
                parcel2.writeNoException();
                nia.f(parcel2, zzj);
                return true;
            case 37:
                ee3 O14 = ee3.a.O(parcel.readStrongBinder());
                nia.c(parcel);
                J1(O14);
                parcel2.writeNoException();
                return true;
            case 38:
                ee3 O15 = ee3.a.O(parcel.readStrongBinder());
                zzl zzlVar12 = (zzl) nia.a(parcel, zzl.CREATOR);
                String readString18 = parcel.readString();
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    t3bVar = queryLocalInterface9 instanceof t3b ? (t3b) queryLocalInterface9 : new l3b(readStrongBinder9);
                }
                nia.c(parcel);
                H2(O15, zzlVar12, readString18, t3bVar);
                parcel2.writeNoException();
                return true;
            case 39:
                ee3 O16 = ee3.a.O(parcel.readStrongBinder());
                nia.c(parcel);
                C1(O16);
                parcel2.writeNoException();
                return true;
        }
    }
}
