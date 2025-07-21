package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.internal.ads.zzcbb;
import defpackage.ee3;

/* loaded from: classes3.dex */
public abstract class bcb extends mia implements ccb {
    public bcb() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    public static ccb w6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        return queryLocalInterface instanceof ccb ? (ccb) queryLocalInterface : new acb(iBinder);
    }

    @Override // defpackage.mia
    protected final boolean v6(int i, Parcel parcel, Parcel parcel2, int i2) {
        jcb jcbVar = null;
        jcb jcbVar2 = null;
        kcb kcbVar = null;
        fcb fcbVar = null;
        switch (i) {
            case 1:
                zzl zzlVar = (zzl) nia.a(parcel, zzl.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    jcbVar = queryLocalInterface instanceof jcb ? (jcb) queryLocalInterface : new hcb(readStrongBinder);
                }
                nia.c(parcel);
                p1(zzlVar, jcbVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    fcbVar = queryLocalInterface2 instanceof fcb ? (fcb) queryLocalInterface2 : new dcb(readStrongBinder2);
                }
                nia.c(parcel);
                i2(fcbVar);
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zzo = zzo();
                parcel2.writeNoException();
                int i3 = nia.b;
                parcel2.writeInt(zzo ? 1 : 0);
                return true;
            case 4:
                String zze = zze();
                parcel2.writeNoException();
                parcel2.writeString(zze);
                return true;
            case 5:
                ee3 O = ee3.a.O(parcel.readStrongBinder());
                nia.c(parcel);
                zzm(O);
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    kcbVar = queryLocalInterface3 instanceof kcb ? (kcb) queryLocalInterface3 : new kcb(readStrongBinder3);
                }
                nia.c(parcel);
                U4(kcbVar);
                parcel2.writeNoException();
                return true;
            case 7:
                zzcbb zzcbbVar = (zzcbb) nia.a(parcel, zzcbb.CREATOR);
                nia.c(parcel);
                u3(zzcbbVar);
                parcel2.writeNoException();
                return true;
            case 8:
                j9c w6 = f8c.w6(parcel.readStrongBinder());
                nia.c(parcel);
                U1(w6);
                parcel2.writeNoException();
                return true;
            case 9:
                Bundle zzb = zzb();
                parcel2.writeNoException();
                nia.e(parcel2, zzb);
                return true;
            case 10:
                ee3 O2 = ee3.a.O(parcel.readStrongBinder());
                boolean g = nia.g(parcel);
                nia.c(parcel);
                A4(O2, g);
                parcel2.writeNoException();
                return true;
            case 11:
                zbb zzd = zzd();
                parcel2.writeNoException();
                nia.f(parcel2, zzd);
                return true;
            case 12:
                qkc zzc = zzc();
                parcel2.writeNoException();
                nia.f(parcel2, zzc);
                return true;
            case 13:
                zcc w62 = tbc.w6(parcel.readStrongBinder());
                nia.c(parcel);
                t6(w62);
                parcel2.writeNoException();
                return true;
            case 14:
                zzl zzlVar2 = (zzl) nia.a(parcel, zzl.CREATOR);
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    jcbVar2 = queryLocalInterface4 instanceof jcb ? (jcb) queryLocalInterface4 : new hcb(readStrongBinder4);
                }
                nia.c(parcel);
                K1(zzlVar2, jcbVar2);
                parcel2.writeNoException();
                return true;
            case 15:
                boolean g2 = nia.g(parcel);
                nia.c(parcel);
                m2(g2);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
