package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes3.dex */
public final class iva extends lia implements kva {
    iva(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
    }

    @Override // defpackage.kva
    public final boolean zze(ee3 ee3Var) {
        Parcel O = O();
        nia.f(O, ee3Var);
        Parcel Q1 = Q1(2, O);
        boolean g = nia.g(Q1);
        Q1.recycle();
        return g;
    }
}
