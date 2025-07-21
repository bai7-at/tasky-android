package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes3.dex */
public final class kcb extends lia implements IInterface {
    kcb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
    }

    public final void s4(zbb zbbVar, String str, String str2) {
        Parcel O = O();
        nia.f(O, zbbVar);
        O.writeString(str);
        O.writeString(str2);
        l3(2, O);
    }
}
