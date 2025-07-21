package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* loaded from: classes2.dex */
public final class ura extends lia implements cua {
    ura(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    @Override // defpackage.cua
    public final void h0(zze zzeVar) {
        Parcel O = O();
        nia.d(O, zzeVar);
        l3(2, O);
    }

    @Override // defpackage.cua
    public final void zzc() {
        l3(1, O());
    }
}
