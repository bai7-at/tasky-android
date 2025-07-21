package defpackage;

import android.os.Bundle;
import android.os.Parcel;

/* loaded from: classes3.dex */
public abstract class zfb extends lxa implements chb {
    public zfb() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // defpackage.lxa
    protected final boolean O(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        Bundle bundle = (Bundle) qya.a(parcel, Bundle.CREATOR);
        qya.c(parcel);
        G(bundle);
        parcel2.writeNoException();
        return true;
    }
}
