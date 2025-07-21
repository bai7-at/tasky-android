package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzccx;

/* loaded from: classes3.dex */
public final class meb extends lia implements oeb {
    meb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    @Override // defpackage.oeb
    public final void J(ee3 ee3Var) {
        Parcel O = O();
        nia.f(O, ee3Var);
        l3(8, O);
    }

    @Override // defpackage.oeb
    public final void p5(ee3 ee3Var, zzccx zzccxVar, leb lebVar) {
        Parcel O = O();
        nia.f(O, ee3Var);
        nia.d(O, zzccxVar);
        nia.f(O, lebVar);
        l3(1, O);
    }
}
