package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.y;
import com.google.android.gms.ads.internal.client.zzl;

/* loaded from: classes3.dex */
public final class acb extends lia implements ccb {
    acb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // defpackage.ccb
    public final void K1(zzl zzlVar, jcb jcbVar) {
        Parcel O = O();
        nia.d(O, zzlVar);
        nia.f(O, jcbVar);
        l3(14, O);
    }

    @Override // defpackage.ccb
    public final void i2(fcb fcbVar) {
        Parcel O = O();
        nia.f(O, fcbVar);
        l3(2, O);
    }

    @Override // defpackage.ccb
    public final void p1(zzl zzlVar, jcb jcbVar) {
        Parcel O = O();
        nia.d(O, zzlVar);
        nia.f(O, jcbVar);
        l3(1, O);
    }

    @Override // defpackage.ccb
    public final qkc zzc() {
        Parcel Q1 = Q1(12, O());
        qkc w6 = y.w6(Q1.readStrongBinder());
        Q1.recycle();
        return w6;
    }

    @Override // defpackage.ccb
    public final void zzm(ee3 ee3Var) {
        Parcel O = O();
        nia.f(O, ee3Var);
        l3(5, O);
    }
}
