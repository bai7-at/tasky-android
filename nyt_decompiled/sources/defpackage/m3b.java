package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.appsflyer.oaid.BuildConfig;
import com.comscore.streaming.EventType;
import com.google.android.gms.ads.internal.client.zzdu;
import com.google.android.gms.ads.internal.client.zzfk;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
import defpackage.ee3;

/* loaded from: classes2.dex */
public abstract class m3b extends mia implements q4b {
    public m3b() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    @Override // defpackage.mia
    protected final boolean v6(int i, Parcel parcel, Parcel parcel2, int i2) {
        pqa pqaVar = null;
        ukb ukbVar = null;
        cua cuaVar = null;
        zcc zccVar = null;
        r8b r8bVar = null;
        fhb fhbVar = null;
        koa koaVar = null;
        ucb ucbVar = null;
        switch (i) {
            case 1:
                ee3 zzn = zzn();
                parcel2.writeNoException();
                nia.f(parcel2, zzn);
                return true;
            case 2:
                e();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean V = V();
                parcel2.writeNoException();
                int i3 = nia.b;
                parcel2.writeInt(V ? 1 : 0);
                return true;
            case 4:
                zzl zzlVar = (zzl) nia.a(parcel, zzl.CREATOR);
                nia.c(parcel);
                boolean p3 = p3(zzlVar);
                parcel2.writeNoException();
                parcel2.writeInt(p3 ? 1 : 0);
                return true;
            case 5:
                z();
                parcel2.writeNoException();
                return true;
            case 6:
                v();
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    pqaVar = queryLocalInterface instanceof pqa ? (pqa) queryLocalInterface : new poa(readStrongBinder);
                }
                nia.c(parcel);
                K4(pqaVar);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    ucbVar = queryLocalInterface2 instanceof ucb ? (ucb) queryLocalInterface2 : new p9b(readStrongBinder2);
                }
                nia.c(parcel);
                D0(ucbVar);
                parcel2.writeNoException();
                return true;
            case 9:
                g1();
                parcel2.writeNoException();
                return true;
            case 10:
                parcel2.writeNoException();
                return true;
            case 11:
                o();
                parcel2.writeNoException();
                return true;
            case 12:
                zzq zzg = zzg();
                parcel2.writeNoException();
                nia.e(parcel2, zzg);
                return true;
            case 13:
                zzq zzqVar = (zzq) nia.a(parcel, zzq.CREATOR);
                nia.c(parcel);
                x5(zzqVar);
                parcel2.writeNoException();
                return true;
            case 14:
                x7b w6 = w7b.w6(parcel.readStrongBinder());
                nia.c(parcel);
                e3(w6);
                parcel2.writeNoException();
                return true;
            case 15:
                a8b w62 = z7b.w6(parcel.readStrongBinder());
                String readString = parcel.readString();
                nia.c(parcel);
                r6(w62, readString);
                parcel2.writeNoException();
                return true;
            case 16:
            case 17:
            case 27:
            case 28:
            default:
                return false;
            case 18:
                String zzs = zzs();
                parcel2.writeNoException();
                parcel2.writeString(zzs);
                return true;
            case 19:
                qqa w63 = jqa.w6(parcel.readStrongBinder());
                nia.c(parcel);
                J3(w63);
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    koaVar = queryLocalInterface3 instanceof koa ? (koa) queryLocalInterface3 : new sna(readStrongBinder3);
                }
                nia.c(parcel);
                N5(koaVar);
                parcel2.writeNoException();
                return true;
            case 21:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    fhbVar = queryLocalInterface4 instanceof fhb ? (fhb) queryLocalInterface4 : new fhb(readStrongBinder4);
                }
                nia.c(parcel);
                V1(fhbVar);
                parcel2.writeNoException();
                return true;
            case 22:
                boolean g = nia.g(parcel);
                nia.c(parcel);
                q6(g);
                parcel2.writeNoException();
                return true;
            case 23:
                boolean T = T();
                parcel2.writeNoException();
                int i4 = nia.b;
                parcel2.writeInt(T ? 1 : 0);
                return true;
            case 24:
                rbb w64 = nab.w6(parcel.readStrongBinder());
                nia.c(parcel);
                B4(w64);
                parcel2.writeNoException();
                return true;
            case EventType.SUBS /* 25 */:
                String readString2 = parcel.readString();
                nia.c(parcel);
                G4(readString2);
                parcel2.writeNoException();
                return true;
            case EventType.CDN /* 26 */:
                znc zzl = zzl();
                parcel2.writeNoException();
                nia.f(parcel2, zzl);
                return true;
            case BuildConfig.VERSION_CODE /* 29 */:
                zzfk zzfkVar = (zzfk) nia.a(parcel, zzfk.CREATOR);
                nia.c(parcel);
                n3(zzfkVar);
                parcel2.writeNoException();
                return true;
            case 30:
                zzdu zzduVar = (zzdu) nia.a(parcel, zzdu.CREATOR);
                nia.c(parcel);
                W0(zzduVar);
                parcel2.writeNoException();
                return true;
            case 31:
                String zzr = zzr();
                parcel2.writeNoException();
                parcel2.writeString(zzr);
                return true;
            case 32:
                ucb zzj = zzj();
                parcel2.writeNoException();
                nia.f(parcel2, zzj);
                return true;
            case 33:
                pqa zzi = zzi();
                parcel2.writeNoException();
                nia.f(parcel2, zzi);
                return true;
            case 34:
                boolean g2 = nia.g(parcel);
                nia.c(parcel);
                I5(g2);
                parcel2.writeNoException();
                return true;
            case 35:
                String g3 = g();
                parcel2.writeNoException();
                parcel2.writeString(g3);
                return true;
            case 36:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    r8bVar = queryLocalInterface5 instanceof r8b ? (r8b) queryLocalInterface5 : new x6b(readStrongBinder5);
                }
                nia.c(parcel);
                e5(r8bVar);
                parcel2.writeNoException();
                return true;
            case 37:
                Bundle zzd = zzd();
                parcel2.writeNoException();
                nia.e(parcel2, zzd);
                return true;
            case 38:
                String readString3 = parcel.readString();
                nia.c(parcel);
                O3(readString3);
                parcel2.writeNoException();
                return true;
            case 39:
                zzw zzwVar = (zzw) nia.a(parcel, zzw.CREATOR);
                nia.c(parcel);
                C2(zzwVar);
                parcel2.writeNoException();
                return true;
            case 40:
                cma w65 = bma.w6(parcel.readStrongBinder());
                nia.c(parcel);
                T5(w65);
                parcel2.writeNoException();
                return true;
            case 41:
                qkc zzk = zzk();
                parcel2.writeNoException();
                nia.f(parcel2, zzk);
                return true;
            case 42:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
                    zccVar = queryLocalInterface6 instanceof zcc ? (zcc) queryLocalInterface6 : new oac(readStrongBinder6);
                }
                nia.c(parcel);
                W2(zccVar);
                parcel2.writeNoException();
                return true;
            case 43:
                zzl zzlVar2 = (zzl) nia.a(parcel, zzl.CREATOR);
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoadCallback");
                    cuaVar = queryLocalInterface7 instanceof cua ? (cua) queryLocalInterface7 : new ura(readStrongBinder7);
                }
                nia.c(parcel);
                B3(zzlVar2, cuaVar);
                parcel2.writeNoException();
                return true;
            case 44:
                ee3 O = ee3.a.O(parcel.readStrongBinder());
                nia.c(parcel);
                s5(O);
                parcel2.writeNoException();
                return true;
            case 45:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                    ukbVar = queryLocalInterface8 instanceof ukb ? (ukb) queryLocalInterface8 : new kib(readStrongBinder8);
                }
                nia.c(parcel);
                i4(ukbVar);
                parcel2.writeNoException();
                return true;
        }
    }
}
