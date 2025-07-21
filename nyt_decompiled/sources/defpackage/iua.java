package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.ee3;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class iua extends mia implements jua {
    public iua() {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    public static jua w6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        return queryLocalInterface instanceof jua ? (jua) queryLocalInterface : new hua(iBinder);
    }

    @Override // defpackage.mia
    protected final boolean v6(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                String readString = parcel.readString();
                nia.c(parcel);
                String P5 = P5(readString);
                parcel2.writeNoException();
                parcel2.writeString(P5);
                return true;
            case 2:
                String readString2 = parcel.readString();
                nia.c(parcel);
                mta K = K(readString2);
                parcel2.writeNoException();
                nia.f(parcel2, K);
                return true;
            case 3:
                List<String> zzk = zzk();
                parcel2.writeNoException();
                parcel2.writeStringList(zzk);
                return true;
            case 4:
                String zzi = zzi();
                parcel2.writeNoException();
                parcel2.writeString(zzi);
                return true;
            case 5:
                String readString3 = parcel.readString();
                nia.c(parcel);
                C(readString3);
                parcel2.writeNoException();
                return true;
            case 6:
                zzo();
                parcel2.writeNoException();
                return true;
            case 7:
                znc zze = zze();
                parcel2.writeNoException();
                nia.f(parcel2, zze);
                return true;
            case 8:
                zzl();
                parcel2.writeNoException();
                return true;
            case 9:
                ee3 zzh = zzh();
                parcel2.writeNoException();
                nia.f(parcel2, zzh);
                return true;
            case 10:
                ee3 O = ee3.a.O(parcel.readStrongBinder());
                nia.c(parcel);
                boolean c0 = c0(O);
                parcel2.writeNoException();
                parcel2.writeInt(c0 ? 1 : 0);
                return true;
            case 11:
                parcel2.writeNoException();
                nia.f(parcel2, null);
                return true;
            case 12:
                boolean zzq = zzq();
                parcel2.writeNoException();
                int i3 = nia.b;
                parcel2.writeInt(zzq ? 1 : 0);
                return true;
            case 13:
                boolean g = g();
                parcel2.writeNoException();
                int i4 = nia.b;
                parcel2.writeInt(g ? 1 : 0);
                return true;
            case 14:
                ee3 O2 = ee3.a.O(parcel.readStrongBinder());
                nia.c(parcel);
                zzp(O2);
                parcel2.writeNoException();
                return true;
            case 15:
                zzm();
                parcel2.writeNoException();
                return true;
            case 16:
                jta zzf = zzf();
                parcel2.writeNoException();
                nia.f(parcel2, zzf);
                return true;
            case 17:
                ee3 O3 = ee3.a.O(parcel.readStrongBinder());
                nia.c(parcel);
                boolean F = F(O3);
                parcel2.writeNoException();
                parcel2.writeInt(F ? 1 : 0);
                return true;
            default:
                return false;
        }
    }
}
