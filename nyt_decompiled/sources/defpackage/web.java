package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes3.dex */
public final class web extends gwa implements chb {
    web(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // defpackage.chb
    public final void G(Bundle bundle) {
        Parcel O = O();
        qya.e(O, bundle);
        l3(1, O);
    }
}
