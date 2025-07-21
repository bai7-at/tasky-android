package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class dua extends mia implements eua {
    public dua() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
    }

    @Override // defpackage.mia
    protected final boolean v6(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 2:
                ee3 zzh = zzh();
                parcel2.writeNoException();
                nia.f(parcel2, zzh);
                return true;
            case 3:
                String zzk = zzk();
                parcel2.writeNoException();
                parcel2.writeString(zzk);
                return true;
            case 4:
                List zzo = zzo();
                parcel2.writeNoException();
                parcel2.writeList(zzo);
                return true;
            case 5:
                String zzi = zzi();
                parcel2.writeNoException();
                parcel2.writeString(zzi);
                return true;
            case 6:
                mta zzf = zzf();
                parcel2.writeNoException();
                nia.f(parcel2, zzf);
                return true;
            case 7:
                String zzj = zzj();
                parcel2.writeNoException();
                parcel2.writeString(zzj);
                return true;
            case 8:
                double zzb = zzb();
                parcel2.writeNoException();
                parcel2.writeDouble(zzb);
                return true;
            case 9:
                String zzn = zzn();
                parcel2.writeNoException();
                parcel2.writeString(zzn);
                return true;
            case 10:
                String zzm = zzm();
                parcel2.writeNoException();
                parcel2.writeString(zzm);
                return true;
            case 11:
                Bundle zzc = zzc();
                parcel2.writeNoException();
                nia.e(parcel2, zzc);
                return true;
            case 12:
                zzp();
                parcel2.writeNoException();
                return true;
            case 13:
                znc zzd = zzd();
                parcel2.writeNoException();
                nia.f(parcel2, zzd);
                return true;
            case 14:
                Bundle bundle = (Bundle) nia.a(parcel, Bundle.CREATOR);
                nia.c(parcel);
                M(bundle);
                parcel2.writeNoException();
                return true;
            case 15:
                Bundle bundle2 = (Bundle) nia.a(parcel, Bundle.CREATOR);
                nia.c(parcel);
                boolean j0 = j0(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(j0 ? 1 : 0);
                return true;
            case 16:
                Bundle bundle3 = (Bundle) nia.a(parcel, Bundle.CREATOR);
                nia.c(parcel);
                n0(bundle3);
                parcel2.writeNoException();
                return true;
            case 17:
                fta zze = zze();
                parcel2.writeNoException();
                nia.f(parcel2, zze);
                return true;
            case 18:
                ee3 zzg = zzg();
                parcel2.writeNoException();
                nia.f(parcel2, zzg);
                return true;
            case 19:
                String zzl = zzl();
                parcel2.writeNoException();
                parcel2.writeString(zzl);
                return true;
            default:
                return false;
        }
    }
}
