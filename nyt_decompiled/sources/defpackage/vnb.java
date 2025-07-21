package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import defpackage.ee3;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class vnb extends mia implements wnb {
    public vnb() {
        super("com.google.android.gms.ads.measurement.IAppMeasurementProxy");
    }

    @Override // defpackage.mia
    protected final boolean v6(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                Bundle bundle = (Bundle) nia.a(parcel, Bundle.CREATOR);
                nia.c(parcel);
                y(bundle);
                parcel2.writeNoException();
                return true;
            case 2:
                Bundle bundle2 = (Bundle) nia.a(parcel, Bundle.CREATOR);
                nia.c(parcel);
                Bundle G = G(bundle2);
                parcel2.writeNoException();
                nia.e(parcel2, G);
                return true;
            case 3:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Bundle bundle3 = (Bundle) nia.a(parcel, Bundle.CREATOR);
                nia.c(parcel);
                v5(readString, readString2, bundle3);
                parcel2.writeNoException();
                return true;
            case 4:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                ee3 O = ee3.a.O(parcel.readStrongBinder());
                nia.c(parcel);
                L5(readString3, readString4, O);
                parcel2.writeNoException();
                return true;
            case 5:
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                boolean g = nia.g(parcel);
                nia.c(parcel);
                Map U5 = U5(readString5, readString6, g);
                parcel2.writeNoException();
                parcel2.writeMap(U5);
                return true;
            case 6:
                String readString7 = parcel.readString();
                nia.c(parcel);
                int f = f(readString7);
                parcel2.writeNoException();
                parcel2.writeInt(f);
                return true;
            case 7:
                Bundle bundle4 = (Bundle) nia.a(parcel, Bundle.CREATOR);
                nia.c(parcel);
                M(bundle4);
                parcel2.writeNoException();
                return true;
            case 8:
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                Bundle bundle5 = (Bundle) nia.a(parcel, Bundle.CREATOR);
                nia.c(parcel);
                c6(readString8, readString9, bundle5);
                parcel2.writeNoException();
                return true;
            case 9:
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                nia.c(parcel);
                List r2 = r2(readString10, readString11);
                parcel2.writeNoException();
                parcel2.writeList(r2);
                return true;
            case 10:
                String zzf = zzf();
                parcel2.writeNoException();
                parcel2.writeString(zzf);
                return true;
            case 11:
                String zzi = zzi();
                parcel2.writeNoException();
                parcel2.writeString(zzi);
                return true;
            case 12:
                long zzc = zzc();
                parcel2.writeNoException();
                parcel2.writeLong(zzc);
                return true;
            case 13:
                String readString12 = parcel.readString();
                nia.c(parcel);
                x(readString12);
                parcel2.writeNoException();
                return true;
            case 14:
                String readString13 = parcel.readString();
                nia.c(parcel);
                C(readString13);
                parcel2.writeNoException();
                return true;
            case 15:
                ee3 O2 = ee3.a.O(parcel.readStrongBinder());
                String readString14 = parcel.readString();
                String readString15 = parcel.readString();
                nia.c(parcel);
                R5(O2, readString14, readString15);
                parcel2.writeNoException();
                return true;
            case 16:
                String zzh = zzh();
                parcel2.writeNoException();
                parcel2.writeString(zzh);
                return true;
            case 17:
                String zzg = zzg();
                parcel2.writeNoException();
                parcel2.writeString(zzg);
                return true;
            case 18:
                String zze = zze();
                parcel2.writeNoException();
                parcel2.writeString(zze);
                return true;
            case 19:
                Bundle bundle6 = (Bundle) nia.a(parcel, Bundle.CREATOR);
                nia.c(parcel);
                n0(bundle6);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
