package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes3.dex */
public abstract class iza extends mia implements jza {
    public iza() {
        super("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    public static jza w6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
        return queryLocalInterface instanceof jza ? (jza) queryLocalInterface : new hza(iBinder);
    }

    @Override // defpackage.mia
    protected final boolean v6(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 2) {
            zzf();
        } else {
            if (i != 3) {
                return false;
            }
            String readString = parcel.readString();
            nia.c(parcel);
            b(readString);
        }
        parcel2.writeNoException();
        return true;
    }
}
