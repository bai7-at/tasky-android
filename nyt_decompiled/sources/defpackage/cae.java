package defpackage;

import android.os.Parcel;
import defpackage.ee3;

/* loaded from: classes3.dex */
public abstract class cae extends o4e implements cbe {
    public cae() {
        super("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
    }

    @Override // defpackage.o4e
    protected final boolean O(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                parcel2.writeNoException();
                parcel2.writeString(zzj());
                return true;
            case 2:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                r5e.b(parcel);
                zzn(readString, readString2);
                parcel2.writeNoException();
                return true;
            case 3:
                ee3 O = ee3.a.O(parcel.readStrongBinder());
                r5e.b(parcel);
                boolean zzp = zzp(O);
                parcel2.writeNoException();
                r5e.c(parcel2, zzp);
                return true;
            case 4:
                ee3 O2 = ee3.a.O(parcel.readStrongBinder());
                r5e.b(parcel);
                boolean zzq = zzq(O2);
                parcel2.writeNoException();
                r5e.c(parcel2, zzq);
                return true;
            case 5:
                String readString3 = parcel.readString();
                r5e.b(parcel);
                zzo(readString3);
                parcel2.writeNoException();
                return true;
            case 6:
                ee3 O3 = ee3.a.O(parcel.readStrongBinder());
                ee3 O4 = ee3.a.O(parcel.readStrongBinder());
                r5e.b(parcel);
                ee3 zzd = zzd(O3, O4);
                parcel2.writeNoException();
                r5e.e(parcel2, zzd);
                return true;
            case 7:
                ee3 O5 = ee3.a.O(parcel.readStrongBinder());
                r5e.b(parcel);
                String zzf = zzf(O5);
                parcel2.writeNoException();
                parcel2.writeString(zzf);
                return true;
            case 8:
                ee3 O6 = ee3.a.O(parcel.readStrongBinder());
                String readString4 = parcel.readString();
                r5e.b(parcel);
                String zze = zze(O6, readString4);
                parcel2.writeNoException();
                parcel2.writeString(zze);
                return true;
            case 9:
                ee3 O7 = ee3.a.O(parcel.readStrongBinder());
                r5e.b(parcel);
                zzl(O7);
                parcel2.writeNoException();
                return true;
            case 10:
                ee3 O8 = ee3.a.O(parcel.readStrongBinder());
                ee3 O9 = ee3.a.O(parcel.readStrongBinder());
                r5e.b(parcel);
                ee3 zzc = zzc(O8, O9);
                parcel2.writeNoException();
                r5e.e(parcel2, zzc);
                return true;
            case 11:
                String readString5 = parcel.readString();
                boolean f = r5e.f(parcel);
                r5e.b(parcel);
                boolean C3 = C3(readString5, f);
                parcel2.writeNoException();
                r5e.c(parcel2, C3);
                return true;
            case 12:
                ee3 O10 = ee3.a.O(parcel.readStrongBinder());
                byte[] createByteArray = parcel.createByteArray();
                r5e.b(parcel);
                String zzg = zzg(O10, createByteArray);
                parcel2.writeNoException();
                parcel2.writeString(zzg);
                return true;
            case 13:
                ee3 O11 = ee3.a.O(parcel.readStrongBinder());
                r5e.b(parcel);
                String zzi = zzi(O11);
                parcel2.writeNoException();
                parcel2.writeString(zzi);
                return true;
            case 14:
                ee3 O12 = ee3.a.O(parcel.readStrongBinder());
                ee3 O13 = ee3.a.O(parcel.readStrongBinder());
                ee3 O14 = ee3.a.O(parcel.readStrongBinder());
                r5e.b(parcel);
                String zzk = zzk(O12, O13, O14);
                parcel2.writeNoException();
                parcel2.writeString(zzk);
                return true;
            case 15:
                ee3 O15 = ee3.a.O(parcel.readStrongBinder());
                r5e.b(parcel);
                zzm(O15);
                parcel2.writeNoException();
                return true;
            case 16:
            default:
                return false;
            case 17:
                ee3 O16 = ee3.a.O(parcel.readStrongBinder());
                ee3 O17 = ee3.a.O(parcel.readStrongBinder());
                ee3 O18 = ee3.a.O(parcel.readStrongBinder());
                ee3 O19 = ee3.a.O(parcel.readStrongBinder());
                r5e.b(parcel);
                String zzh = zzh(O16, O17, O18, O19);
                parcel2.writeNoException();
                parcel2.writeString(zzh);
                return true;
            case 18:
                parcel2.writeNoException();
                r5e.c(parcel2, true);
                return true;
            case 19:
                parcel2.writeNoException();
                r5e.c(parcel2, true);
                return true;
            case 20:
                int zzb = zzb();
                parcel2.writeNoException();
                parcel2.writeInt(zzb);
                return true;
        }
    }
}
