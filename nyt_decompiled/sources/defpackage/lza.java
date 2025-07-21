package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbpd;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public abstract class lza extends mia implements mza {
    public lza() {
        super("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    public static mza w6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
        return queryLocalInterface instanceof mza ? (mza) queryLocalInterface : new kza(iBinder);
    }

    @Override // defpackage.mia
    protected final boolean v6(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(zzbpd.CREATOR);
        nia.c(parcel);
        P2(createTypedArrayList);
        parcel2.writeNoException();
        return true;
    }
}
