package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes3.dex */
public final class vde extends lia implements xde {
    vde(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.lmd.protocol.ILmdOverlayService");
    }

    @Override // defpackage.xde
    public final void L2(String str, Bundle bundle, zde zdeVar) {
        Parcel O = O();
        O.writeString(str);
        nia.d(O, bundle);
        nia.f(O, zdeVar);
        n4(1, O);
    }

    @Override // defpackage.xde
    public final void M0(Bundle bundle, zde zdeVar) {
        Parcel O = O();
        nia.d(O, bundle);
        nia.f(O, zdeVar);
        n4(3, O);
    }

    @Override // defpackage.xde
    public final void y1(Bundle bundle, zde zdeVar) {
        Parcel O = O();
        nia.d(O, bundle);
        nia.f(O, zdeVar);
        n4(2, O);
    }
}
