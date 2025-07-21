package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* loaded from: classes3.dex */
public abstract class yya extends mia implements zya {
    public yya() {
        super("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheCallback");
    }

    @Override // defpackage.mia
    protected final boolean v6(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) nia.a(parcel, ParcelFileDescriptor.CREATOR);
        nia.c(parcel);
        L3(parcelFileDescriptor);
        return true;
    }
}
