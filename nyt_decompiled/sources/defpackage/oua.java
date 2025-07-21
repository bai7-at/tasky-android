package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes3.dex */
public final class oua extends lia implements qua {
    oua(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    @Override // defpackage.qua
    public final void m4(gua guaVar) {
        Parcel O = O();
        nia.f(O, guaVar);
        l3(1, O);
    }
}
