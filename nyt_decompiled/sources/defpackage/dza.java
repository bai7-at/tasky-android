package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes3.dex */
public final class dza extends gwa implements f1b {
    dza(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    @Override // defpackage.f1b
    public final Bundle G(Bundle bundle) {
        Parcel O = O();
        qya.e(O, bundle);
        Parcel Q1 = Q1(1, O);
        Bundle bundle2 = (Bundle) qya.a(Q1, Bundle.CREATOR);
        Q1.recycle();
        return bundle2;
    }
}
