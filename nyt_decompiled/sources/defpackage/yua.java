package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes3.dex */
public final class yua extends lia implements ava {
    yua(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    @Override // defpackage.ava
    public final void M3(q4b q4bVar, ee3 ee3Var) {
        Parcel O = O();
        nia.f(O, q4bVar);
        nia.f(O, ee3Var);
        l3(1, O);
    }
}
