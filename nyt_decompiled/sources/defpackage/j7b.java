package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.ee3;

/* loaded from: classes3.dex */
public abstract class j7b extends mia implements k7b {
    public j7b() {
        super("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    public static k7b w6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
        return queryLocalInterface instanceof k7b ? (k7b) queryLocalInterface : new i7b(iBinder);
    }

    @Override // defpackage.mia
    protected final boolean v6(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                Bundle bundle = (Bundle) nia.a(parcel, Bundle.CREATOR);
                nia.c(parcel);
                p2(bundle);
                parcel2.writeNoException();
                return true;
            case 2:
                parcel2.writeNoException();
                return true;
            case 3:
                g();
                parcel2.writeNoException();
                return true;
            case 4:
                zzr();
                parcel2.writeNoException();
                return true;
            case 5:
                zzo();
                parcel2.writeNoException();
                return true;
            case 6:
                Bundle bundle2 = (Bundle) nia.a(parcel, Bundle.CREATOR);
                nia.c(parcel);
                j0(bundle2);
                parcel2.writeNoException();
                nia.e(parcel2, bundle2);
                return true;
            case 7:
                c();
                parcel2.writeNoException();
                return true;
            case 8:
                zzm();
                parcel2.writeNoException();
                return true;
            case 9:
                e();
                parcel2.writeNoException();
                return true;
            case 10:
                zzi();
                parcel2.writeNoException();
                return true;
            case 11:
                boolean m = m();
                parcel2.writeNoException();
                int i3 = nia.b;
                parcel2.writeInt(m ? 1 : 0);
                return true;
            case 12:
                parcel.readInt();
                parcel.readInt();
                nia.c(parcel);
                parcel2.writeNoException();
                return true;
            case 13:
                ee3 O = ee3.a.O(parcel.readStrongBinder());
                nia.c(parcel);
                B(O);
                parcel2.writeNoException();
                return true;
            case 14:
                a();
                parcel2.writeNoException();
                return true;
            case 15:
                int readInt = parcel.readInt();
                String[] createStringArray = parcel.createStringArray();
                int[] createIntArray = parcel.createIntArray();
                nia.c(parcel);
                H1(readInt, createStringArray, createIntArray);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
