package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbyi;
import com.google.android.gms.internal.ads.zzbym;

/* loaded from: classes3.dex */
public abstract class e9b extends mia implements f9b {
    public e9b() {
        super("com.google.android.gms.ads.internal.request.IAdsService");
    }

    @Override // defpackage.mia
    protected final boolean v6(int i, Parcel parcel, Parcel parcel2, int i2) {
        i9b i9bVar = null;
        if (i == 1) {
            zzbyi zzbyiVar = (zzbyi) nia.a(parcel, zzbyi.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                i9bVar = queryLocalInterface instanceof i9b ? (i9b) queryLocalInterface : new g9b(readStrongBinder);
            }
            nia.c(parcel);
            U0(zzbyiVar, i9bVar);
        } else if (i == 2) {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                if (queryLocalInterface2 instanceof i9b) {
                }
            }
            nia.c(parcel);
        } else {
            if (i != 3) {
                return false;
            }
            zzbym zzbymVar = (zzbym) nia.a(parcel, zzbym.CREATOR);
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                i9bVar = queryLocalInterface3 instanceof i9b ? (i9b) queryLocalInterface3 : new g9b(readStrongBinder3);
            }
            nia.c(parcel);
            D5(zzbymVar, i9bVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
