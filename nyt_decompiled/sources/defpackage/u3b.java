package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import defpackage.ee3;

/* loaded from: classes3.dex */
public final class u3b extends lia implements w3b {
    u3b(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    @Override // defpackage.w3b
    public final ee3 zze() {
        Parcel Q1 = Q1(1, O());
        ee3 O = ee3.a.O(Q1.readStrongBinder());
        Q1.recycle();
        return O;
    }

    @Override // defpackage.w3b
    public final boolean zzf() {
        Parcel Q1 = Q1(2, O());
        boolean g = nia.g(Q1);
        Q1.recycle();
        return g;
    }
}
