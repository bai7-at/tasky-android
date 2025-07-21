package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* loaded from: classes3.dex */
public final class dcb extends lia implements fcb {
    dcb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // defpackage.fcb
    public final void D4(zbb zbbVar) {
        Parcel O = O();
        nia.f(O, zbbVar);
        l3(3, O);
    }

    @Override // defpackage.fcb
    public final void b3(zze zzeVar) {
        Parcel O = O();
        nia.d(O, zzeVar);
        l3(5, O);
    }

    @Override // defpackage.fcb
    public final void zze() {
        l3(7, O());
    }

    @Override // defpackage.fcb
    public final void zzf() {
        l3(6, O());
    }

    @Override // defpackage.fcb
    public final void zzg() {
        l3(2, O());
    }

    @Override // defpackage.fcb
    public final void zzh(int i) {
        Parcel O = O();
        O.writeInt(i);
        l3(4, O);
    }

    @Override // defpackage.fcb
    public final void zzj() {
        l3(1, O());
    }
}
