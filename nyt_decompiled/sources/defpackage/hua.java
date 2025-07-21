package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import defpackage.ee3;

/* loaded from: classes3.dex */
public final class hua extends lia implements jua {
    hua(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    @Override // defpackage.jua
    public final boolean F(ee3 ee3Var) {
        Parcel O = O();
        nia.f(O, ee3Var);
        Parcel Q1 = Q1(17, O);
        boolean g = nia.g(Q1);
        Q1.recycle();
        return g;
    }

    @Override // defpackage.jua
    public final boolean c0(ee3 ee3Var) {
        Parcel O = O();
        nia.f(O, ee3Var);
        Parcel Q1 = Q1(10, O);
        boolean g = nia.g(Q1);
        Q1.recycle();
        return g;
    }

    @Override // defpackage.jua
    public final ee3 zzh() {
        Parcel Q1 = Q1(9, O());
        ee3 O = ee3.a.O(Q1.readStrongBinder());
        Q1.recycle();
        return O;
    }

    @Override // defpackage.jua
    public final String zzi() {
        Parcel Q1 = Q1(4, O());
        String readString = Q1.readString();
        Q1.recycle();
        return readString;
    }
}
