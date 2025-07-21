package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class p9b extends lia implements ucb {
    p9b(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    @Override // defpackage.ucb
    public final void o0(String str, String str2) {
        Parcel O = O();
        O.writeString(str);
        O.writeString(str2);
        l3(1, O);
    }
}
