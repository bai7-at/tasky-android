package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import defpackage.ee3;

/* loaded from: classes3.dex */
public final class ota extends lia implements qta {
    ota(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    @Override // defpackage.qta
    public final void G5(ee3 ee3Var) {
        Parcel O = O();
        nia.f(O, ee3Var);
        l3(9, O);
    }

    @Override // defpackage.qta
    public final void I3(ee3 ee3Var) {
        Parcel O = O();
        nia.f(O, ee3Var);
        l3(6, O);
    }

    @Override // defpackage.qta
    public final void M1(ee3 ee3Var, int i) {
        Parcel O = O();
        nia.f(O, ee3Var);
        O.writeInt(i);
        l3(5, O);
    }

    @Override // defpackage.qta
    public final void X(ee3 ee3Var) {
        Parcel O = O();
        nia.f(O, ee3Var);
        l3(7, O);
    }

    @Override // defpackage.qta
    public final ee3 f(String str) {
        Parcel O = O();
        O.writeString(str);
        Parcel Q1 = Q1(2, O);
        ee3 O2 = ee3.a.O(Q1.readStrongBinder());
        Q1.recycle();
        return O2;
    }

    @Override // defpackage.qta
    public final void u5(ee3 ee3Var) {
        Parcel O = O();
        nia.f(O, ee3Var);
        l3(3, O);
    }

    @Override // defpackage.qta
    public final void v0(jta jtaVar) {
        Parcel O = O();
        nia.f(O, jtaVar);
        l3(8, O);
    }

    @Override // defpackage.qta
    public final void v1(String str, ee3 ee3Var) {
        Parcel O = O();
        O.writeString(str);
        nia.f(O, ee3Var);
        l3(1, O);
    }
}
