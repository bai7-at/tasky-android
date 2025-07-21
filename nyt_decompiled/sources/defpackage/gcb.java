package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes3.dex */
public final class gcb extends lia implements IInterface {
    gcb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
    }

    public final IBinder s4(ee3 ee3Var, String str, h3b h3bVar, int i) {
        Parcel O = O();
        nia.f(O, ee3Var);
        O.writeString(str);
        nia.f(O, h3bVar);
        O.writeInt(240304000);
        Parcel Q1 = Q1(1, O);
        IBinder readStrongBinder = Q1.readStrongBinder();
        Q1.recycle();
        return readStrongBinder;
    }
}
