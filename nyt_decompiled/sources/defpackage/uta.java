package defpackage;

import android.os.Parcel;
import defpackage.ee3;

/* loaded from: classes3.dex */
public abstract class uta extends mia implements vta {
    public uta() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    @Override // defpackage.mia
    protected final boolean v6(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            ee3 O = ee3.a.O(parcel.readStrongBinder());
            nia.c(parcel);
            a5(O);
        } else if (i == 2) {
            zzd();
        } else {
            if (i != 3) {
                return false;
            }
            ee3 O2 = ee3.a.O(parcel.readStrongBinder());
            nia.c(parcel);
            J4(O2);
        }
        parcel2.writeNoException();
        return true;
    }
}
