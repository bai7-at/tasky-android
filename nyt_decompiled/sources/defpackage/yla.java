package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.ee3;

/* loaded from: classes3.dex */
public abstract class yla extends mia implements zla {
    public yla() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // defpackage.mia
    protected final boolean v6(int i, Parcel parcel, Parcel parcel2, int i2) {
        gma emaVar;
        switch (i) {
            case 2:
                q4b zze = zze();
                parcel2.writeNoException();
                nia.f(parcel2, zze);
                return true;
            case 3:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback");
                    if (queryLocalInterface instanceof dma) {
                    }
                }
                nia.c(parcel);
                parcel2.writeNoException();
                return true;
            case 4:
                ee3 O = ee3.a.O(parcel.readStrongBinder());
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 == null) {
                    emaVar = null;
                } else {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
                    emaVar = queryLocalInterface2 instanceof gma ? (gma) queryLocalInterface2 : new ema(readStrongBinder2);
                }
                nia.c(parcel);
                q2(O, emaVar);
                parcel2.writeNoException();
                return true;
            case 5:
                qkc zzf = zzf();
                parcel2.writeNoException();
                nia.f(parcel2, zzf);
                return true;
            case 6:
                boolean g = nia.g(parcel);
                nia.c(parcel);
                w3(g);
                parcel2.writeNoException();
                return true;
            case 7:
                zcc w6 = tbc.w6(parcel.readStrongBinder());
                nia.c(parcel);
                h1(w6);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
