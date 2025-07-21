package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* loaded from: classes3.dex */
public final class hcb extends lia implements jcb {
    hcb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // defpackage.jcb
    public final void d(zze zzeVar) {
        Parcel O = O();
        nia.d(O, zzeVar);
        l3(3, O);
    }

    @Override // defpackage.jcb
    public final void i(int i) {
        Parcel O = O();
        O.writeInt(i);
        l3(2, O);
    }

    @Override // defpackage.jcb
    public final void zzg() {
        l3(1, O());
    }
}
