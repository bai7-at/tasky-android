package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* loaded from: classes3.dex */
public final class uza extends lia implements wza {
    uza(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
    }

    @Override // defpackage.wza
    public final void F3(qza qzaVar) {
        Parcel O = O();
        nia.f(O, qzaVar);
        l3(1, O);
    }

    @Override // defpackage.wza
    public final void d(zze zzeVar) {
        Parcel O = O();
        nia.d(O, zzeVar);
        l3(3, O);
    }

    @Override // defpackage.wza
    public final void i(int i) {
        Parcel O = O();
        O.writeInt(i);
        l3(2, O);
    }
}
