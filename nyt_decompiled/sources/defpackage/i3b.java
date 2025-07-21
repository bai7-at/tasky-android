package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.internal.ads.zzbjb;
import com.google.android.gms.internal.ads.zzbvg;
import defpackage.ee3;
import java.util.List;

/* loaded from: classes3.dex */
public final class i3b extends lia implements k3b {
    i3b(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // defpackage.k3b
    public final void C1(ee3 ee3Var) {
        Parcel O = O();
        nia.f(O, ee3Var);
        l3(39, O);
    }

    @Override // defpackage.k3b
    public final void D() {
        l3(8, O());
    }

    @Override // defpackage.k3b
    public final boolean H() {
        Parcel Q1 = Q1(22, O());
        boolean g = nia.g(Q1);
        Q1.recycle();
        return g;
    }

    @Override // defpackage.k3b
    public final void H2(ee3 ee3Var, zzl zzlVar, String str, t3b t3bVar) {
        Parcel O = O();
        nia.f(O, ee3Var);
        nia.d(O, zzlVar);
        O.writeString(str);
        nia.f(O, t3bVar);
        l3(38, O);
    }

    @Override // defpackage.k3b
    public final void J1(ee3 ee3Var) {
        Parcel O = O();
        nia.f(O, ee3Var);
        l3(37, O);
    }

    @Override // defpackage.k3b
    public final void N2(ee3 ee3Var, zzl zzlVar, String str, t3b t3bVar) {
        Parcel O = O();
        nia.f(O, ee3Var);
        nia.d(O, zzlVar);
        O.writeString(str);
        nia.f(O, t3bVar);
        l3(28, O);
    }

    @Override // defpackage.k3b
    public final void O2(ee3 ee3Var, zzl zzlVar, String str, vbb vbbVar, String str2) {
        Parcel O = O();
        nia.f(O, ee3Var);
        nia.d(O, zzlVar);
        O.writeString(null);
        nia.f(O, vbbVar);
        O.writeString(str2);
        l3(10, O);
    }

    @Override // defpackage.k3b
    public final void O5(ee3 ee3Var) {
        Parcel O = O();
        nia.f(O, ee3Var);
        l3(21, O);
    }

    @Override // defpackage.k3b
    public final void Q(boolean z) {
        Parcel O = O();
        int i = nia.b;
        O.writeInt(z ? 1 : 0);
        l3(25, O);
    }

    @Override // defpackage.k3b
    public final void Q4(ee3 ee3Var, zzq zzqVar, zzl zzlVar, String str, String str2, t3b t3bVar) {
        Parcel O = O();
        nia.f(O, ee3Var);
        nia.d(O, zzqVar);
        nia.d(O, zzlVar);
        O.writeString(str);
        O.writeString(str2);
        nia.f(O, t3bVar);
        l3(35, O);
    }

    @Override // defpackage.k3b
    public final void R2(ee3 ee3Var, vbb vbbVar, List list) {
        Parcel O = O();
        nia.f(O, ee3Var);
        nia.f(O, vbbVar);
        O.writeStringList(list);
        l3(23, O);
    }

    @Override // defpackage.k3b
    public final void U2(zzl zzlVar, String str) {
        Parcel O = O();
        nia.d(O, zzlVar);
        O.writeString(str);
        l3(11, O);
    }

    @Override // defpackage.k3b
    public final void W3(ee3 ee3Var, jza jzaVar, List list) {
        Parcel O = O();
        nia.f(O, ee3Var);
        nia.f(O, jzaVar);
        O.writeTypedList(list);
        l3(31, O);
    }

    @Override // defpackage.k3b
    public final void Z4(ee3 ee3Var, zzl zzlVar, String str, t3b t3bVar) {
        Parcel O = O();
        nia.f(O, ee3Var);
        nia.d(O, zzlVar);
        O.writeString(str);
        nia.f(O, t3bVar);
        l3(32, O);
    }

    @Override // defpackage.k3b
    public final void d1(ee3 ee3Var, zzl zzlVar, String str, String str2, t3b t3bVar, zzbjb zzbjbVar, List list) {
        Parcel O = O();
        nia.f(O, ee3Var);
        nia.d(O, zzlVar);
        O.writeString(str);
        O.writeString(str2);
        nia.f(O, t3bVar);
        nia.d(O, zzbjbVar);
        O.writeStringList(list);
        l3(14, O);
    }

    @Override // defpackage.k3b
    public final void g5(ee3 ee3Var, zzl zzlVar, String str, String str2, t3b t3bVar) {
        Parcel O = O();
        nia.f(O, ee3Var);
        nia.d(O, zzlVar);
        O.writeString(str);
        O.writeString(str2);
        nia.f(O, t3bVar);
        l3(7, O);
    }

    @Override // defpackage.k3b
    public final void h() {
        l3(9, O());
    }

    @Override // defpackage.k3b
    public final z3b j() {
        z3b z3bVar;
        Parcel Q1 = Q1(16, O());
        IBinder readStrongBinder = Q1.readStrongBinder();
        if (readStrongBinder == null) {
            z3bVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            z3bVar = queryLocalInterface instanceof z3b ? (z3b) queryLocalInterface : new z3b(readStrongBinder);
        }
        Q1.recycle();
        return z3bVar;
    }

    @Override // defpackage.k3b
    public final void r() {
        l3(4, O());
    }

    @Override // defpackage.k3b
    public final void u() {
        l3(12, O());
    }

    @Override // defpackage.k3b
    public final void x0(ee3 ee3Var) {
        Parcel O = O();
        nia.f(O, ee3Var);
        l3(30, O);
    }

    @Override // defpackage.k3b
    public final void z4(ee3 ee3Var, zzq zzqVar, zzl zzlVar, String str, String str2, t3b t3bVar) {
        Parcel O = O();
        nia.f(O, ee3Var);
        nia.d(O, zzqVar);
        nia.d(O, zzlVar);
        O.writeString(str);
        O.writeString(str2);
        nia.f(O, t3bVar);
        l3(6, O);
    }

    @Override // defpackage.k3b
    public final boolean zzN() {
        Parcel Q1 = Q1(13, O());
        boolean g = nia.g(Q1);
        Q1.recycle();
        return g;
    }

    @Override // defpackage.k3b
    public final y3b zzO() {
        y3b y3bVar;
        Parcel Q1 = Q1(15, O());
        IBinder readStrongBinder = Q1.readStrongBinder();
        if (readStrongBinder == null) {
            y3bVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            y3bVar = queryLocalInterface instanceof y3b ? (y3b) queryLocalInterface : new y3b(readStrongBinder);
        }
        Q1.recycle();
        return y3bVar;
    }

    @Override // defpackage.k3b
    public final znc zzh() {
        Parcel Q1 = Q1(26, O());
        znc w6 = a0.w6(Q1.readStrongBinder());
        Q1.recycle();
        return w6;
    }

    @Override // defpackage.k3b
    public final w3b zzj() {
        w3b u3bVar;
        Parcel Q1 = Q1(36, O());
        IBinder readStrongBinder = Q1.readStrongBinder();
        if (readStrongBinder == null) {
            u3bVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            u3bVar = queryLocalInterface instanceof w3b ? (w3b) queryLocalInterface : new u3b(readStrongBinder);
        }
        Q1.recycle();
        return u3bVar;
    }

    @Override // defpackage.k3b
    public final c4b zzk() {
        c4b a4bVar;
        Parcel Q1 = Q1(27, O());
        IBinder readStrongBinder = Q1.readStrongBinder();
        if (readStrongBinder == null) {
            a4bVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            a4bVar = queryLocalInterface instanceof c4b ? (c4b) queryLocalInterface : new a4b(readStrongBinder);
        }
        Q1.recycle();
        return a4bVar;
    }

    @Override // defpackage.k3b
    public final zzbvg zzl() {
        Parcel Q1 = Q1(33, O());
        zzbvg zzbvgVar = (zzbvg) nia.a(Q1, zzbvg.CREATOR);
        Q1.recycle();
        return zzbvgVar;
    }

    @Override // defpackage.k3b
    public final zzbvg zzm() {
        Parcel Q1 = Q1(34, O());
        zzbvg zzbvgVar = (zzbvg) nia.a(Q1, zzbvg.CREATOR);
        Q1.recycle();
        return zzbvgVar;
    }

    @Override // defpackage.k3b
    public final ee3 zzn() {
        Parcel Q1 = Q1(2, O());
        ee3 O = ee3.a.O(Q1.readStrongBinder());
        Q1.recycle();
        return O;
    }

    @Override // defpackage.k3b
    public final void zzo() {
        l3(5, O());
    }
}
