package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes3.dex */
public final class mab extends lia implements rbb {
    mab(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    @Override // defpackage.rbb
    public final void s2(iab iabVar) {
        Parcel O = O();
        nia.f(O, iabVar);
        l3(5, O);
    }

    @Override // defpackage.rbb
    public final void zzf() {
        l3(4, O());
    }

    @Override // defpackage.rbb
    public final void zzg(int i) {
        Parcel O = O();
        O.writeInt(i);
        l3(7, O);
    }

    @Override // defpackage.rbb
    public final void zzh() {
        l3(6, O());
    }

    @Override // defpackage.rbb
    public final void zzi() {
        l3(1, O());
    }

    @Override // defpackage.rbb
    public final void zzj() {
        l3(2, O());
    }

    @Override // defpackage.rbb
    public final void zzk() {
        l3(8, O());
    }

    @Override // defpackage.rbb
    public final void zzl() {
        l3(3, O());
    }
}
