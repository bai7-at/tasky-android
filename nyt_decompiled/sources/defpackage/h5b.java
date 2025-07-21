package defpackage;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* loaded from: classes3.dex */
public abstract class h5b extends mia implements i5b {
    public h5b() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    @Override // defpackage.mia
    protected final boolean v6(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            c4b w6 = b4b.w6(parcel.readStrongBinder());
            nia.c(parcel);
            L4(w6);
        } else if (i == 2) {
            String readString = parcel.readString();
            nia.c(parcel);
            b(readString);
        } else {
            if (i != 3) {
                return false;
            }
            zze zzeVar = (zze) nia.a(parcel, zze.CREATOR);
            nia.c(parcel);
            d(zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
