package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* loaded from: classes2.dex */
public final class poa extends lia implements pqa {
    poa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // defpackage.pqa
    public final void d(zze zzeVar) {
        Parcel O = O();
        nia.d(O, zzeVar);
        l3(8, O);
    }

    @Override // defpackage.pqa
    public final void i(int i) {
        Parcel O = O();
        O.writeInt(i);
        l3(2, O);
    }

    @Override // defpackage.pqa
    public final void zzc() {
        l3(6, O());
    }

    @Override // defpackage.pqa
    public final void zzd() {
        l3(1, O());
    }

    @Override // defpackage.pqa
    public final void zzg() {
        l3(7, O());
    }

    @Override // defpackage.pqa
    public final void zzh() {
        l3(3, O());
    }

    @Override // defpackage.pqa
    public final void zzi() {
        l3(4, O());
    }

    @Override // defpackage.pqa
    public final void zzj() {
        l3(5, O());
    }

    @Override // defpackage.pqa
    public final void zzk() {
        l3(9, O());
    }
}
