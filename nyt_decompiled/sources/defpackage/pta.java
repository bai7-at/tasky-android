package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.ee3;

/* loaded from: classes3.dex */
public abstract class pta extends mia implements qta {
    public pta() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    public static qta w6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
        return queryLocalInterface instanceof qta ? (qta) queryLocalInterface : new ota(iBinder);
    }

    @Override // defpackage.mia
    protected final boolean v6(int i, Parcel parcel, Parcel parcel2, int i2) {
        jta htaVar;
        switch (i) {
            case 1:
                String readString = parcel.readString();
                ee3 O = ee3.a.O(parcel.readStrongBinder());
                nia.c(parcel);
                v1(readString, O);
                parcel2.writeNoException();
                return true;
            case 2:
                String readString2 = parcel.readString();
                nia.c(parcel);
                ee3 f = f(readString2);
                parcel2.writeNoException();
                nia.f(parcel2, f);
                return true;
            case 3:
                ee3 O2 = ee3.a.O(parcel.readStrongBinder());
                nia.c(parcel);
                u5(O2);
                parcel2.writeNoException();
                return true;
            case 4:
                zzc();
                parcel2.writeNoException();
                return true;
            case 5:
                ee3.a.O(parcel.readStrongBinder());
                parcel.readInt();
                nia.c(parcel);
                parcel2.writeNoException();
                return true;
            case 6:
                ee3 O3 = ee3.a.O(parcel.readStrongBinder());
                nia.c(parcel);
                I3(O3);
                parcel2.writeNoException();
                return true;
            case 7:
                ee3 O4 = ee3.a.O(parcel.readStrongBinder());
                nia.c(parcel);
                X(O4);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    htaVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
                    htaVar = queryLocalInterface instanceof jta ? (jta) queryLocalInterface : new hta(readStrongBinder);
                }
                nia.c(parcel);
                v0(htaVar);
                parcel2.writeNoException();
                return true;
            case 9:
                ee3 O5 = ee3.a.O(parcel.readStrongBinder());
                nia.c(parcel);
                G5(O5);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
