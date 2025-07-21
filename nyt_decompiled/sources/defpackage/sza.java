package defpackage;

import android.os.Parcel;

/* loaded from: classes3.dex */
public abstract class sza extends mia implements tza {
    public sza() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    @Override // defpackage.mia
    protected final boolean v6(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            parcel.readInt();
            nia.c(parcel);
        }
        parcel2.writeNoException();
        return true;
    }
}
