package defpackage;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* loaded from: classes3.dex */
public abstract class icb extends mia implements jcb {
    public icb() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // defpackage.mia
    protected final boolean v6(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            zzg();
        } else if (i == 2) {
            int readInt = parcel.readInt();
            nia.c(parcel);
            i(readInt);
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
