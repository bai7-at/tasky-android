package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes3.dex */
public final class rza extends lia implements tza {
    rza(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    @Override // defpackage.tza
    public final void i(int i) {
        Parcel O = O();
        O.writeInt(i);
        l3(2, O);
    }

    @Override // defpackage.tza
    public final void zzf() {
        l3(1, O());
    }
}
