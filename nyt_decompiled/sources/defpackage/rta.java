package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes3.dex */
public final class rta extends lia implements tta {
    rta(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
    }

    @Override // defpackage.tta
    public final IBinder b4(ee3 ee3Var, ee3 ee3Var2, ee3 ee3Var3, int i) {
        Parcel O = O();
        nia.f(O, ee3Var);
        nia.f(O, ee3Var2);
        nia.f(O, ee3Var3);
        O.writeInt(240304000);
        Parcel Q1 = Q1(1, O);
        IBinder readStrongBinder = Q1.readStrongBinder();
        Q1.recycle();
        return readStrongBinder;
    }
}
