package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes3.dex */
public final class gce extends lia implements ice {
    gce(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // defpackage.ice
    public final void zze(ee3 ee3Var, String str, String str2) {
        Parcel O = O();
        nia.f(O, ee3Var);
        O.writeString(str);
        O.writeString(null);
        l3(8, O);
    }

    @Override // defpackage.ice
    public final void zzf() {
        l3(3, O());
    }

    @Override // defpackage.ice
    public final void zzg(int i) {
        Parcel O = O();
        O.writeInt(i);
        l3(7, O);
    }

    @Override // defpackage.ice
    public final void zzh(int[] iArr) {
        Parcel O = O();
        O.writeIntArray(null);
        l3(4, O);
    }

    @Override // defpackage.ice
    public final void zzi(int i) {
        Parcel O = O();
        O.writeInt(i);
        l3(6, O);
    }

    @Override // defpackage.ice
    public final void zzj(byte[] bArr) {
        Parcel O = O();
        O.writeByteArray(bArr);
        l3(5, O);
    }
}
