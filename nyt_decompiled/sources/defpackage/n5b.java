package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.internal.ads.zzbjb;
import com.google.android.gms.internal.ads.zzbvg;
import defpackage.ee3;

/* loaded from: classes3.dex */
public abstract class n5b extends mia implements o5b {
    public n5b() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public static o5b w6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        return queryLocalInterface instanceof o5b ? (o5b) queryLocalInterface : new m5b(iBinder);
    }

    @Override // defpackage.mia
    protected final boolean v6(int i, Parcel parcel, Parcel parcel2, int i2) {
        r5b r5bVar = null;
        z4b x4bVar = null;
        i5b g5bVar = null;
        c5b a5bVar = null;
        l5b j5bVar = null;
        i5b g5bVar2 = null;
        l5b j5bVar2 = null;
        f5b d5bVar = null;
        c5b a5bVar2 = null;
        if (i == 1) {
            ee3 O = ee3.a.O(parcel.readStrongBinder());
            String readString = parcel.readString();
            Parcelable.Creator creator = Bundle.CREATOR;
            Bundle bundle = (Bundle) nia.a(parcel, creator);
            Bundle bundle2 = (Bundle) nia.a(parcel, creator);
            zzq zzqVar = (zzq) nia.a(parcel, zzq.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
                r5bVar = queryLocalInterface instanceof r5b ? (r5b) queryLocalInterface : new p5b(readStrongBinder);
            }
            r5b r5bVar2 = r5bVar;
            nia.c(parcel);
            c2(O, readString, bundle, bundle2, zzqVar, r5bVar2);
            parcel2.writeNoException();
        } else if (i == 2) {
            zzbvg zzf = zzf();
            parcel2.writeNoException();
            nia.e(parcel2, zzf);
        } else if (i == 3) {
            zzbvg zzg = zzg();
            parcel2.writeNoException();
            nia.e(parcel2, zzg);
        } else if (i == 5) {
            znc zze = zze();
            parcel2.writeNoException();
            nia.f(parcel2, zze);
        } else if (i == 10) {
            ee3.a.O(parcel.readStrongBinder());
            nia.c(parcel);
            parcel2.writeNoException();
        } else if (i != 11) {
            switch (i) {
                case 13:
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    zzl zzlVar = (zzl) nia.a(parcel, zzl.CREATOR);
                    ee3 O2 = ee3.a.O(parcel.readStrongBinder());
                    IBinder readStrongBinder2 = parcel.readStrongBinder();
                    if (readStrongBinder2 != null) {
                        IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        a5bVar2 = queryLocalInterface2 instanceof c5b ? (c5b) queryLocalInterface2 : new a5b(readStrongBinder2);
                    }
                    c5b c5bVar = a5bVar2;
                    t3b w6 = s3b.w6(parcel.readStrongBinder());
                    zzq zzqVar2 = (zzq) nia.a(parcel, zzq.CREATOR);
                    nia.c(parcel);
                    o1(readString2, readString3, zzlVar, O2, c5bVar, w6, zzqVar2);
                    parcel2.writeNoException();
                    break;
                case 14:
                    String readString4 = parcel.readString();
                    String readString5 = parcel.readString();
                    zzl zzlVar2 = (zzl) nia.a(parcel, zzl.CREATOR);
                    ee3 O3 = ee3.a.O(parcel.readStrongBinder());
                    IBinder readStrongBinder3 = parcel.readStrongBinder();
                    if (readStrongBinder3 != null) {
                        IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                        d5bVar = queryLocalInterface3 instanceof f5b ? (f5b) queryLocalInterface3 : new d5b(readStrongBinder3);
                    }
                    f5b f5bVar = d5bVar;
                    t3b w62 = s3b.w6(parcel.readStrongBinder());
                    nia.c(parcel);
                    R4(readString4, readString5, zzlVar2, O3, f5bVar, w62);
                    parcel2.writeNoException();
                    break;
                case 15:
                    ee3 O4 = ee3.a.O(parcel.readStrongBinder());
                    nia.c(parcel);
                    boolean c0 = c0(O4);
                    parcel2.writeNoException();
                    parcel2.writeInt(c0 ? 1 : 0);
                    break;
                case 16:
                    String readString6 = parcel.readString();
                    String readString7 = parcel.readString();
                    zzl zzlVar3 = (zzl) nia.a(parcel, zzl.CREATOR);
                    ee3 O5 = ee3.a.O(parcel.readStrongBinder());
                    IBinder readStrongBinder4 = parcel.readStrongBinder();
                    if (readStrongBinder4 != null) {
                        IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        j5bVar2 = queryLocalInterface4 instanceof l5b ? (l5b) queryLocalInterface4 : new j5b(readStrongBinder4);
                    }
                    l5b l5bVar = j5bVar2;
                    t3b w63 = s3b.w6(parcel.readStrongBinder());
                    nia.c(parcel);
                    Q5(readString6, readString7, zzlVar3, O5, l5bVar, w63);
                    parcel2.writeNoException();
                    break;
                case 17:
                    ee3 O6 = ee3.a.O(parcel.readStrongBinder());
                    nia.c(parcel);
                    boolean b5 = b5(O6);
                    parcel2.writeNoException();
                    parcel2.writeInt(b5 ? 1 : 0);
                    break;
                case 18:
                    String readString8 = parcel.readString();
                    String readString9 = parcel.readString();
                    zzl zzlVar4 = (zzl) nia.a(parcel, zzl.CREATOR);
                    ee3 O7 = ee3.a.O(parcel.readStrongBinder());
                    IBinder readStrongBinder5 = parcel.readStrongBinder();
                    if (readStrongBinder5 != null) {
                        IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        g5bVar2 = queryLocalInterface5 instanceof i5b ? (i5b) queryLocalInterface5 : new g5b(readStrongBinder5);
                    }
                    i5b i5bVar = g5bVar2;
                    t3b w64 = s3b.w6(parcel.readStrongBinder());
                    nia.c(parcel);
                    O1(readString8, readString9, zzlVar4, O7, i5bVar, w64);
                    parcel2.writeNoException();
                    break;
                case 19:
                    String readString10 = parcel.readString();
                    nia.c(parcel);
                    U(readString10);
                    parcel2.writeNoException();
                    break;
                case 20:
                    String readString11 = parcel.readString();
                    String readString12 = parcel.readString();
                    zzl zzlVar5 = (zzl) nia.a(parcel, zzl.CREATOR);
                    ee3 O8 = ee3.a.O(parcel.readStrongBinder());
                    IBinder readStrongBinder6 = parcel.readStrongBinder();
                    if (readStrongBinder6 != null) {
                        IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        j5bVar = queryLocalInterface6 instanceof l5b ? (l5b) queryLocalInterface6 : new j5b(readStrongBinder6);
                    }
                    l5b l5bVar2 = j5bVar;
                    t3b w65 = s3b.w6(parcel.readStrongBinder());
                    nia.c(parcel);
                    y5(readString11, readString12, zzlVar5, O8, l5bVar2, w65);
                    parcel2.writeNoException();
                    break;
                case 21:
                    String readString13 = parcel.readString();
                    String readString14 = parcel.readString();
                    zzl zzlVar6 = (zzl) nia.a(parcel, zzl.CREATOR);
                    ee3 O9 = ee3.a.O(parcel.readStrongBinder());
                    IBinder readStrongBinder7 = parcel.readStrongBinder();
                    if (readStrongBinder7 != null) {
                        IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        a5bVar = queryLocalInterface7 instanceof c5b ? (c5b) queryLocalInterface7 : new a5b(readStrongBinder7);
                    }
                    c5b c5bVar2 = a5bVar;
                    t3b w66 = s3b.w6(parcel.readStrongBinder());
                    zzq zzqVar3 = (zzq) nia.a(parcel, zzq.CREATOR);
                    nia.c(parcel);
                    I1(readString13, readString14, zzlVar6, O9, c5bVar2, w66, zzqVar3);
                    parcel2.writeNoException();
                    break;
                case 22:
                    String readString15 = parcel.readString();
                    String readString16 = parcel.readString();
                    zzl zzlVar7 = (zzl) nia.a(parcel, zzl.CREATOR);
                    ee3 O10 = ee3.a.O(parcel.readStrongBinder());
                    IBinder readStrongBinder8 = parcel.readStrongBinder();
                    if (readStrongBinder8 != null) {
                        IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        g5bVar = queryLocalInterface8 instanceof i5b ? (i5b) queryLocalInterface8 : new g5b(readStrongBinder8);
                    }
                    i5b i5bVar2 = g5bVar;
                    t3b w67 = s3b.w6(parcel.readStrongBinder());
                    zzbjb zzbjbVar = (zzbjb) nia.a(parcel, zzbjb.CREATOR);
                    nia.c(parcel);
                    t2(readString15, readString16, zzlVar7, O10, i5bVar2, w67, zzbjbVar);
                    parcel2.writeNoException();
                    break;
                case 23:
                    String readString17 = parcel.readString();
                    String readString18 = parcel.readString();
                    zzl zzlVar8 = (zzl) nia.a(parcel, zzl.CREATOR);
                    ee3 O11 = ee3.a.O(parcel.readStrongBinder());
                    IBinder readStrongBinder9 = parcel.readStrongBinder();
                    if (readStrongBinder9 != null) {
                        IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
                        x4bVar = queryLocalInterface9 instanceof z4b ? (z4b) queryLocalInterface9 : new x4b(readStrongBinder9);
                    }
                    z4b z4bVar = x4bVar;
                    t3b w68 = s3b.w6(parcel.readStrongBinder());
                    nia.c(parcel);
                    N4(readString17, readString18, zzlVar8, O11, z4bVar, w68);
                    parcel2.writeNoException();
                    break;
                case 24:
                    ee3 O12 = ee3.a.O(parcel.readStrongBinder());
                    nia.c(parcel);
                    boolean F = F(O12);
                    parcel2.writeNoException();
                    parcel2.writeInt(F ? 1 : 0);
                    break;
                default:
                    return false;
            }
        } else {
            parcel.createStringArray();
            nia.c(parcel);
            parcel2.writeNoException();
        }
        return true;
    }
}
