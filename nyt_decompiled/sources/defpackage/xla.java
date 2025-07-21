package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.y;

/* loaded from: classes3.dex */
public final class xla extends lia implements zla {
    xla(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // defpackage.zla
    public final void q2(ee3 ee3Var, gma gmaVar) {
        Parcel O = O();
        nia.f(O, ee3Var);
        nia.f(O, gmaVar);
        l3(4, O);
    }

    @Override // defpackage.zla
    public final qkc zzf() {
        Parcel Q1 = Q1(5, O());
        qkc w6 = y.w6(Q1.readStrongBinder());
        Q1.recycle();
        return w6;
    }
}
