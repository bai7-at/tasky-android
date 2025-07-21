package defpackage;

import android.os.Parcel;

/* loaded from: classes3.dex */
public abstract class hab extends mia implements iab {
    public hab() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardItem");
    }

    @Override // defpackage.mia
    protected final boolean v6(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            String zzc = zzc();
            parcel2.writeNoException();
            parcel2.writeString(zzc);
        } else {
            if (i != 2) {
                return false;
            }
            int zzb = zzb();
            parcel2.writeNoException();
            parcel2.writeInt(zzb);
        }
        return true;
    }
}
