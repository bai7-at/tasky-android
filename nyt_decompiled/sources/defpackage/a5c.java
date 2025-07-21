package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes3.dex */
public final class a5c extends qp9 implements ntd {
    a5c(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    @Override // defpackage.ntd
    public final boolean T0(boolean z) {
        Parcel O = O();
        kbb.a(O, true);
        Parcel Q1 = Q1(2, O);
        boolean b = kbb.b(Q1);
        Q1.recycle();
        return b;
    }

    @Override // defpackage.ntd
    public final String zzc() {
        Parcel Q1 = Q1(1, O());
        String readString = Q1.readString();
        Q1.recycle();
        return readString;
    }

    @Override // defpackage.ntd
    public final boolean zzd() {
        Parcel Q1 = Q1(6, O());
        boolean b = kbb.b(Q1);
        Q1.recycle();
        return b;
    }
}
