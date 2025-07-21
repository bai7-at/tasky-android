package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes3.dex */
public final class a9e extends n3e implements cbe {
    a9e(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.adshield.internal.IAdShieldClient");
    }

    @Override // defpackage.cbe
    public final String zze(ee3 ee3Var, String str) {
        Parcel O = O();
        r5e.e(O, ee3Var);
        O.writeString("");
        Parcel Q1 = Q1(8, O);
        String readString = Q1.readString();
        Q1.recycle();
        return readString;
    }

    @Override // defpackage.cbe
    public final String zzg(ee3 ee3Var, byte[] bArr) {
        Parcel O = O();
        r5e.e(O, ee3Var);
        O.writeByteArray(null);
        Parcel Q1 = Q1(12, O);
        String readString = Q1.readString();
        Q1.recycle();
        return readString;
    }

    @Override // defpackage.cbe
    public final String zzk(ee3 ee3Var, ee3 ee3Var2, ee3 ee3Var3) {
        Parcel O = O();
        r5e.e(O, ee3Var);
        r5e.e(O, ee3Var2);
        r5e.e(O, ee3Var3);
        Parcel Q1 = Q1(14, O);
        String readString = Q1.readString();
        Q1.recycle();
        return readString;
    }

    @Override // defpackage.cbe
    public final void zzl(ee3 ee3Var) {
        Parcel O = O();
        r5e.e(O, ee3Var);
        l3(9, O);
    }
}
