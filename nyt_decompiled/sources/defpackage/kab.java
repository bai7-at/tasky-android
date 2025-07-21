package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzcab;
import defpackage.ee3;

/* loaded from: classes3.dex */
public abstract class kab extends mia implements lab {
    public kab() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    @Override // defpackage.mia
    protected final boolean v6(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            zzcab zzcabVar = (zzcab) nia.a(parcel, zzcab.CREATOR);
            nia.c(parcel);
            g4(zzcabVar);
            parcel2.writeNoException();
        } else if (i != 2) {
            rbb rbbVar = null;
            jab jabVar = null;
            if (i == 3) {
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    rbbVar = queryLocalInterface instanceof rbb ? (rbb) queryLocalInterface : new mab(readStrongBinder);
                }
                nia.c(parcel);
                i6(rbbVar);
                parcel2.writeNoException();
            } else if (i != 34) {
                switch (i) {
                    case 5:
                        boolean zzs = zzs();
                        parcel2.writeNoException();
                        int i3 = nia.b;
                        parcel2.writeInt(zzs ? 1 : 0);
                        break;
                    case 6:
                        zzh();
                        parcel2.writeNoException();
                        break;
                    case 7:
                        zzj();
                        parcel2.writeNoException();
                        break;
                    case 8:
                        zze();
                        parcel2.writeNoException();
                        break;
                    case 9:
                        ee3 O = ee3.a.O(parcel.readStrongBinder());
                        nia.c(parcel);
                        zzi(O);
                        parcel2.writeNoException();
                        break;
                    case 10:
                        ee3 O2 = ee3.a.O(parcel.readStrongBinder());
                        nia.c(parcel);
                        B(O2);
                        parcel2.writeNoException();
                        break;
                    case 11:
                        ee3 O3 = ee3.a.O(parcel.readStrongBinder());
                        nia.c(parcel);
                        zzf(O3);
                        parcel2.writeNoException();
                        break;
                    case 12:
                        String zzd = zzd();
                        parcel2.writeNoException();
                        parcel2.writeString(zzd);
                        break;
                    case 13:
                        String readString = parcel.readString();
                        nia.c(parcel);
                        E(readString);
                        parcel2.writeNoException();
                        break;
                    case 14:
                        r8b w6 = u7b.w6(parcel.readStrongBinder());
                        nia.c(parcel);
                        s3(w6);
                        parcel2.writeNoException();
                        break;
                    case 15:
                        Bundle zzb = zzb();
                        parcel2.writeNoException();
                        nia.e(parcel2, zzb);
                        break;
                    case 16:
                        IBinder readStrongBinder2 = parcel.readStrongBinder();
                        if (readStrongBinder2 != null) {
                            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
                            jabVar = queryLocalInterface2 instanceof jab ? (jab) queryLocalInterface2 : new jab(readStrongBinder2);
                        }
                        nia.c(parcel);
                        v2(jabVar);
                        parcel2.writeNoException();
                        break;
                    case 17:
                        parcel.readString();
                        nia.c(parcel);
                        parcel2.writeNoException();
                        break;
                    case 18:
                        ee3 O4 = ee3.a.O(parcel.readStrongBinder());
                        nia.c(parcel);
                        F(O4);
                        parcel2.writeNoException();
                        break;
                    case 19:
                        String readString2 = parcel.readString();
                        nia.c(parcel);
                        Z1(readString2);
                        parcel2.writeNoException();
                        break;
                    case 20:
                        boolean g = g();
                        parcel2.writeNoException();
                        int i4 = nia.b;
                        parcel2.writeInt(g ? 1 : 0);
                        break;
                    case 21:
                        qkc zzc = zzc();
                        parcel2.writeNoException();
                        nia.f(parcel2, zzc);
                        break;
                    default:
                        return false;
                }
            } else {
                boolean g2 = nia.g(parcel);
                nia.c(parcel);
                t(g2);
                parcel2.writeNoException();
            }
        } else {
            zzq();
            parcel2.writeNoException();
        }
        return true;
    }
}
