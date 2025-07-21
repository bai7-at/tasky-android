package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.util.zzbb;

/* loaded from: classes3.dex */
public abstract class h9b extends mia implements i9b {
    public h9b() {
        super("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
    }

    @Override // defpackage.mia
    protected final boolean v6(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) nia.a(parcel, ParcelFileDescriptor.CREATOR);
            nia.c(parcel);
            f0(parcelFileDescriptor);
        } else {
            if (i != 2) {
                return false;
            }
            zzbb zzbbVar = (zzbb) nia.a(parcel, zzbb.CREATOR);
            nia.c(parcel);
            a0(zzbbVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
