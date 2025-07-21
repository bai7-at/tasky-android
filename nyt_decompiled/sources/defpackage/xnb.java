package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes3.dex */
public final class xnb extends lia implements znb {
    xnb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.measurement.IMeasurementManager");
    }

    @Override // defpackage.znb
    public final void n6(ee3 ee3Var, wnb wnbVar) {
        Parcel O = O();
        nia.f(O, ee3Var);
        nia.f(O, wnbVar);
        l3(2, O);
    }
}
