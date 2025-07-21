package defpackage;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* loaded from: classes3.dex */
public abstract class y4b extends mia implements z4b {
    public y4b() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
    }

    @Override // defpackage.mia
    protected final boolean v6(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 2) {
            zzg();
        } else if (i == 3) {
            String readString = parcel.readString();
            nia.c(parcel);
            b(readString);
        } else {
            if (i != 4) {
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
