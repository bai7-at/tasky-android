package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes3.dex */
public final class i5f extends n3e implements n5f {
    i5f(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // defpackage.n5f
    public final void zze(ee3 ee3Var, String str, String str2) {
        Parcel O = O();
        r5e.e(O, ee3Var);
        O.writeString("ADSHIELD");
        O.writeString(null);
        l3(8, O);
    }

    @Override // defpackage.n5f
    public final void zzf() {
        l3(3, O());
    }

    @Override // defpackage.n5f
    public final void zzg(int i) {
        Parcel O = O();
        O.writeInt(i);
        l3(7, O);
    }

    @Override // defpackage.n5f
    public final void zzh(int[] iArr) {
        Parcel O = O();
        O.writeIntArray(null);
        l3(4, O);
    }

    @Override // defpackage.n5f
    public final void zzi(int i) {
        Parcel O = O();
        O.writeInt(i);
        l3(6, O);
    }

    @Override // defpackage.n5f
    public final void zzj(byte[] bArr) {
        Parcel O = O();
        O.writeByteArray(bArr);
        l3(5, O);
    }
}
