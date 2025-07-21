package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes3.dex */
public final class bva extends lia implements hva {
    bva(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    @Override // defpackage.hva
    public final void d3(pva pvaVar) {
        Parcel O = O();
        nia.f(O, pvaVar);
        l3(1, O);
    }
}
