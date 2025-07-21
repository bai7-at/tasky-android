package defpackage;

import android.os.Bundle;
import android.os.Parcel;

/* loaded from: classes3.dex */
public abstract class keb extends mia implements leb {
    public keb() {
        super("com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    @Override // defpackage.mia
    protected final boolean v6(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            parcel.readString();
            parcel.readString();
            nia.c(parcel);
        } else if (i == 2) {
            String readString = parcel.readString();
            nia.c(parcel);
            f(readString);
        } else {
            if (i != 3) {
                return false;
            }
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            Bundle bundle = (Bundle) nia.a(parcel, Bundle.CREATOR);
            nia.c(parcel);
            f1(readString2, readString3, bundle);
        }
        parcel2.writeNoException();
        return true;
    }
}
