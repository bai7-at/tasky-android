package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes3.dex */
public final class hza extends lia implements jza {
    hza(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    @Override // defpackage.jza
    public final void b(String str) {
        Parcel O = O();
        O.writeString(str);
        l3(3, O);
    }

    @Override // defpackage.jza
    public final void zzf() {
        l3(2, O());
    }
}
