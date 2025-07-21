package defpackage;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;
import defpackage.ee3;

/* loaded from: classes3.dex */
public abstract class b5b extends mia implements c5b {
    public b5b() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // defpackage.mia
    protected final boolean v6(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            ee3 O = ee3.a.O(parcel.readStrongBinder());
            nia.c(parcel);
            s0(O);
        } else if (i == 2) {
            String readString = parcel.readString();
            nia.c(parcel);
            b(readString);
        } else if (i == 3) {
            zze zzeVar = (zze) nia.a(parcel, zze.CREATOR);
            nia.c(parcel);
            d(zzeVar);
        } else {
            if (i != 4) {
                return false;
            }
            w3b w6 = v3b.w6(parcel.readStrongBinder());
            nia.c(parcel);
            g6(w6);
        }
        parcel2.writeNoException();
        return true;
    }
}
