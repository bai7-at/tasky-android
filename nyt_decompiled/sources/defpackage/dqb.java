package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzff;
import defpackage.ee3;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class dqb extends mia implements jrb {
    public dqb() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // defpackage.mia
    protected final boolean v6(int i, Parcel parcel, Parcel parcel2, int i2) {
        y5c u2cVar;
        switch (i) {
            case 1:
                zzk();
                parcel2.writeNoException();
                return true;
            case 2:
                float readFloat = parcel.readFloat();
                nia.c(parcel);
                i5(readFloat);
                parcel2.writeNoException();
                return true;
            case 3:
                String readString = parcel.readString();
                nia.c(parcel);
                R(readString);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean g = nia.g(parcel);
                nia.c(parcel);
                s6(g);
                parcel2.writeNoException();
                return true;
            case 5:
                ee3 O = ee3.a.O(parcel.readStrongBinder());
                String readString2 = parcel.readString();
                nia.c(parcel);
                S1(O, readString2);
                parcel2.writeNoException();
                return true;
            case 6:
                String readString3 = parcel.readString();
                ee3 O2 = ee3.a.O(parcel.readStrongBinder());
                nia.c(parcel);
                I4(readString3, O2);
                parcel2.writeNoException();
                return true;
            case 7:
                float zze = zze();
                parcel2.writeNoException();
                parcel2.writeFloat(zze);
                return true;
            case 8:
                boolean a = a();
                parcel2.writeNoException();
                int i3 = nia.b;
                parcel2.writeInt(a ? 1 : 0);
                return true;
            case 9:
                String zzf = zzf();
                parcel2.writeNoException();
                parcel2.writeString(zzf);
                return true;
            case 10:
                String readString4 = parcel.readString();
                nia.c(parcel);
                zzh(readString4);
                parcel2.writeNoException();
                return true;
            case 11:
                h3b w6 = g3b.w6(parcel.readStrongBinder());
                nia.c(parcel);
                T2(w6);
                parcel2.writeNoException();
                return true;
            case 12:
                mza w62 = lza.w6(parcel.readStrongBinder());
                nia.c(parcel);
                e2(w62);
                parcel2.writeNoException();
                return true;
            case 13:
                List zzg = zzg();
                parcel2.writeNoException();
                parcel2.writeTypedList(zzg);
                return true;
            case 14:
                zzff zzffVar = (zzff) nia.a(parcel, zzff.CREATOR);
                nia.c(parcel);
                w5(zzffVar);
                parcel2.writeNoException();
                return true;
            case 15:
                zzi();
                parcel2.writeNoException();
                return true;
            case 16:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    u2cVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
                    u2cVar = queryLocalInterface instanceof y5c ? (y5c) queryLocalInterface : new u2c(readStrongBinder);
                }
                nia.c(parcel);
                I0(u2cVar);
                parcel2.writeNoException();
                return true;
            case 17:
                boolean g2 = nia.g(parcel);
                nia.c(parcel);
                b0(g2);
                parcel2.writeNoException();
                return true;
            case 18:
                String readString5 = parcel.readString();
                nia.c(parcel);
                W(readString5);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
