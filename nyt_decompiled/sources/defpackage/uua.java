package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes3.dex */
public final class uua extends lia implements wua {
    uua(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    @Override // defpackage.wua
    public final void a3(jua juaVar) {
        Parcel O = O();
        nia.f(O, juaVar);
        l3(1, O);
    }
}
