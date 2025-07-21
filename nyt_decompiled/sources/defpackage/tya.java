package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes3.dex */
public final class tya extends lia implements vya {
    tya(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
    }

    @Override // defpackage.vya
    public final void f(String str) {
        Parcel O = O();
        O.writeString(str);
        l3(1, O);
    }
}
