package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes3.dex */
public final class cye extends n3e implements jye {
    cye(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.signalsdk.ISignalSdkService");
    }

    @Override // defpackage.jye
    public final void d2(Bundle bundle, zxe zxeVar) {
        Parcel O = O();
        r5e.d(O, bundle);
        r5e.e(O, zxeVar);
        n4(1, O);
    }
}
