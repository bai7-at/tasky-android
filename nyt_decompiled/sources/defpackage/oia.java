package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes3.dex */
public final class oia extends lia implements qia {
    oia(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.clearcut.IClearcut");
    }

    @Override // defpackage.qia
    public final void zze(ee3 ee3Var, String str) {
        Parcel O = O();
        nia.f(O, ee3Var);
        O.writeString("GMA_SDK");
        l3(2, O);
    }

    @Override // defpackage.qia
    public final void zzf() {
        l3(3, O());
    }

    @Override // defpackage.qia
    public final void zzg(int i) {
        Parcel O = O();
        O.writeInt(i);
        l3(7, O);
    }

    @Override // defpackage.qia
    public final void zzh(int[] iArr) {
        Parcel O = O();
        O.writeIntArray(null);
        l3(4, O);
    }

    @Override // defpackage.qia
    public final void zzi(int i) {
        Parcel O = O();
        O.writeInt(0);
        l3(6, O);
    }

    @Override // defpackage.qia
    public final void zzj(byte[] bArr) {
        Parcel O = O();
        O.writeByteArray(bArr);
        l3(5, O);
    }
}
