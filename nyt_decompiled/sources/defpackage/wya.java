package defpackage;

import android.os.Parcel;

/* loaded from: classes3.dex */
public abstract class wya extends mia implements xya {
    public wya() {
        super("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
    }

    @Override // defpackage.mia
    protected final boolean v6(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            String readString = parcel.readString();
            nia.c(parcel);
            n(readString);
        } else {
            if (i != 2) {
                return false;
            }
            zze();
        }
        parcel2.writeNoException();
        return true;
    }
}
