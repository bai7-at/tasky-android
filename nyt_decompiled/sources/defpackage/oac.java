package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzs;

/* loaded from: classes2.dex */
public final class oac extends lia implements zcc {
    oac(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    @Override // defpackage.zcc
    public final void n5(zzs zzsVar) {
        Parcel O = O();
        nia.d(O, zzsVar);
        l3(1, O);
    }

    @Override // defpackage.zcc
    public final boolean zzf() {
        Parcel Q1 = Q1(2, O());
        boolean g = nia.g(Q1);
        Q1.recycle();
        return g;
    }
}
