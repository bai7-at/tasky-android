package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes3.dex */
public final class xbb extends lia implements zbb {
    xbb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    @Override // defpackage.zbb
    public final int zze() {
        Parcel Q1 = Q1(2, O());
        int readInt = Q1.readInt();
        Q1.recycle();
        return readInt;
    }

    @Override // defpackage.zbb
    public final String zzf() {
        Parcel Q1 = Q1(1, O());
        String readString = Q1.readString();
        Q1.recycle();
        return readString;
    }
}
