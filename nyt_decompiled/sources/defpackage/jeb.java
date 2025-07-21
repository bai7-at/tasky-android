package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes3.dex */
public final class jeb extends lia implements leb {
    jeb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    @Override // defpackage.leb
    public final void f(String str) {
        Parcel O = O();
        O.writeString(str);
        l3(2, O);
    }

    @Override // defpackage.leb
    public final void f1(String str, String str2, Bundle bundle) {
        Parcel O = O();
        O.writeString(str);
        O.writeString(str2);
        nia.d(O, bundle);
        l3(3, O);
    }
}
