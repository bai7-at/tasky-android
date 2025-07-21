package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class fua extends mia implements gua {
    public fua() {
        super("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
    }

    @Override // defpackage.mia
    protected final boolean v6(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 2:
                ee3 zzg = zzg();
                parcel2.writeNoException();
                nia.f(parcel2, zzg);
                return true;
            case 3:
                String zzk = zzk();
                parcel2.writeNoException();
                parcel2.writeString(zzk);
                return true;
            case 4:
                List zzm = zzm();
                parcel2.writeNoException();
                parcel2.writeList(zzm);
                return true;
            case 5:
                String zzi = zzi();
                parcel2.writeNoException();
                parcel2.writeString(zzi);
                return true;
            case 6:
                mta zze = zze();
                parcel2.writeNoException();
                nia.f(parcel2, zze);
                return true;
            case 7:
                String zzj = zzj();
                parcel2.writeNoException();
                parcel2.writeString(zzj);
                return true;
            case 8:
                String zzh = zzh();
                parcel2.writeNoException();
                parcel2.writeString(zzh);
                return true;
            case 9:
                Bundle zzb = zzb();
                parcel2.writeNoException();
                nia.e(parcel2, zzb);
                return true;
            case 10:
                zzn();
                parcel2.writeNoException();
                return true;
            case 11:
                znc zzc = zzc();
                parcel2.writeNoException();
                nia.f(parcel2, zzc);
                return true;
            case 12:
                Bundle bundle = (Bundle) nia.a(parcel, Bundle.CREATOR);
                nia.c(parcel);
                j1(bundle);
                parcel2.writeNoException();
                return true;
            case 13:
                Bundle bundle2 = (Bundle) nia.a(parcel, Bundle.CREATOR);
                nia.c(parcel);
                boolean M = M(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(M ? 1 : 0);
                return true;
            case 14:
                Bundle bundle3 = (Bundle) nia.a(parcel, Bundle.CREATOR);
                nia.c(parcel);
                y(bundle3);
                parcel2.writeNoException();
                return true;
            case 15:
                fta zzd = zzd();
                parcel2.writeNoException();
                nia.f(parcel2, zzd);
                return true;
            case 16:
                ee3 zzf = zzf();
                parcel2.writeNoException();
                nia.f(parcel2, zzf);
                return true;
            case 17:
                String zzl = zzl();
                parcel2.writeNoException();
                parcel2.writeString(zzl);
                return true;
            default:
                return false;
        }
    }
}
