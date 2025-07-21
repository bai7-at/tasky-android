package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes3.dex */
public final class sbe extends n3e implements IInterface {
    sbe(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.adshield.internal.IAdShieldCreator");
    }

    public final IBinder s4(String str, ee3 ee3Var) {
        Parcel O = O();
        O.writeString("h.3.2.2/n.android.3.2.2");
        r5e.e(O, ee3Var);
        Parcel Q1 = Q1(2, O);
        IBinder readStrongBinder = Q1.readStrongBinder();
        Q1.recycle();
        return readStrongBinder;
    }
}
