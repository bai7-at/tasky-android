package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* loaded from: classes3.dex */
public final class ama extends lia implements cma {
    ama(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    @Override // defpackage.cma
    public final void A5(zze zzeVar) {
        Parcel O = O();
        nia.d(O, zzeVar);
        l3(3, O);
    }

    @Override // defpackage.cma
    public final void t3(zla zlaVar) {
        Parcel O = O();
        nia.f(O, zlaVar);
        l3(1, O);
    }

    @Override // defpackage.cma
    public final void zzb(int i) {
        Parcel O = O();
        O.writeInt(i);
        l3(2, O);
    }
}
