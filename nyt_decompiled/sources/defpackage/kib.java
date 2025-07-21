package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* loaded from: classes2.dex */
public final class kib extends lia implements ukb {
    kib(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }

    @Override // defpackage.ukb
    public final void N(zze zzeVar) {
        Parcel O = O();
        nia.d(O, zzeVar);
        l3(1, O);
    }

    @Override // defpackage.ukb
    public final void zzb() {
        l3(5, O());
    }

    @Override // defpackage.ukb
    public final void zzc() {
        l3(3, O());
    }

    @Override // defpackage.ukb
    public final void zze() {
        l3(4, O());
    }

    @Override // defpackage.ukb
    public final void zzf() {
        l3(2, O());
    }
}
