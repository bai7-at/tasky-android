package defpackage;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.offline.buffering.zza;

/* loaded from: classes3.dex */
public final class b7b extends lia implements d7b {
    b7b(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    @Override // defpackage.d7b
    public final void Y2(ee3 ee3Var, zza zzaVar) {
        Parcel O = O();
        nia.f(O, ee3Var);
        nia.d(O, zzaVar);
        l3(6, O);
    }

    @Override // defpackage.d7b
    public final void s0(ee3 ee3Var) {
        Parcel O = O();
        nia.f(O, ee3Var);
        l3(4, O);
    }

    @Override // defpackage.d7b
    public final void t0(Intent intent) {
        Parcel O = O();
        nia.d(O, intent);
        l3(1, O);
    }

    @Override // defpackage.d7b
    public final void w0(String[] strArr, int[] iArr, ee3 ee3Var) {
        Parcel O = O();
        O.writeStringArray(strArr);
        O.writeIntArray(iArr);
        nia.f(O, ee3Var);
        l3(5, O);
    }

    @Override // defpackage.d7b
    public final void zzh() {
        l3(3, O());
    }
}
