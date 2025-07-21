package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes3.dex */
public final class jab extends lia implements IInterface {
    jab(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
    }

    public final void s4(iab iabVar, String str, String str2) {
        Parcel O = O();
        nia.f(O, iabVar);
        O.writeString(str);
        O.writeString(str2);
        l3(2, O);
    }
}
