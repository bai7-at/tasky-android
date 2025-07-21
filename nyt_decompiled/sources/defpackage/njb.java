package defpackage;

import android.os.Bundle;
import android.os.Parcel;

/* loaded from: classes3.dex */
public abstract class njb extends lxa implements skb {
    public njb() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // defpackage.lxa
    protected final boolean O(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Bundle bundle = (Bundle) qya.a(parcel, Bundle.CREATOR);
            long readLong = parcel.readLong();
            qya.c(parcel);
            z0(readString, readString2, bundle, readLong);
            parcel2.writeNoException();
        } else {
            if (i != 2) {
                return false;
            }
            int zzd = zzd();
            parcel2.writeNoException();
            parcel2.writeInt(zzd);
        }
        return true;
    }
}
