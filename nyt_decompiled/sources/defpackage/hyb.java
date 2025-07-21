package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class hyb extends lia implements m0c {
    hyb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    @Override // defpackage.m0c
    public final String zze() {
        Parcel Q1 = Q1(1, O());
        String readString = Q1.readString();
        Q1.recycle();
        return readString;
    }

    @Override // defpackage.m0c
    public final String zzf() {
        Parcel Q1 = Q1(2, O());
        String readString = Q1.readString();
        Q1.recycle();
        return readString;
    }
}
