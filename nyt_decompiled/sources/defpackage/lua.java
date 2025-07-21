package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes3.dex */
public final class lua extends lia implements nua {
    lua(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    @Override // defpackage.nua
    public final void O4(eua euaVar) {
        Parcel O = O();
        nia.f(O, euaVar);
        l3(1, O);
    }
}
