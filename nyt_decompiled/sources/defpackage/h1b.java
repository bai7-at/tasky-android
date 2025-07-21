package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.offline.buffering.zza;

/* loaded from: classes2.dex */
public final class h1b extends lia implements n3b {
    h1b(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    @Override // defpackage.n3b
    public final void zze(ee3 ee3Var) {
        Parcel O = O();
        nia.f(O, ee3Var);
        l3(2, O);
    }

    @Override // defpackage.n3b
    public final boolean zzf(ee3 ee3Var, String str, String str2) {
        Parcel O = O();
        nia.f(O, ee3Var);
        O.writeString(str);
        O.writeString(str2);
        Parcel Q1 = Q1(1, O);
        boolean g = nia.g(Q1);
        Q1.recycle();
        return g;
    }

    @Override // defpackage.n3b
    public final boolean zzg(ee3 ee3Var, zza zzaVar) {
        Parcel O = O();
        nia.f(O, ee3Var);
        nia.d(O, zzaVar);
        Parcel Q1 = Q1(3, O);
        boolean g = nia.g(Q1);
        Q1.recycle();
        return g;
    }
}
