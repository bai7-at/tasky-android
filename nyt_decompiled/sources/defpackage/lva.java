package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes3.dex */
public final class lva extends lia implements mva {
    lva(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
    }

    @Override // defpackage.mva
    public final void n(String str) {
        Parcel O = O();
        O.writeString(str);
        l3(1, O);
    }

    @Override // defpackage.mva
    public final void zze() {
        l3(2, O());
    }
}
