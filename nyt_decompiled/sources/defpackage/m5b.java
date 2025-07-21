package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.internal.ads.zzbjb;
import com.google.android.gms.internal.ads.zzbvg;

/* loaded from: classes3.dex */
public final class m5b extends lia implements o5b {
    m5b(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    @Override // defpackage.o5b
    public final boolean F(ee3 ee3Var) {
        Parcel O = O();
        nia.f(O, ee3Var);
        Parcel Q1 = Q1(24, O);
        boolean g = nia.g(Q1);
        Q1.recycle();
        return g;
    }

    @Override // defpackage.o5b
    public final void I1(String str, String str2, zzl zzlVar, ee3 ee3Var, c5b c5bVar, t3b t3bVar, zzq zzqVar) {
        Parcel O = O();
        O.writeString(str);
        O.writeString(str2);
        nia.d(O, zzlVar);
        nia.f(O, ee3Var);
        nia.f(O, c5bVar);
        nia.f(O, t3bVar);
        nia.d(O, zzqVar);
        l3(21, O);
    }

    @Override // defpackage.o5b
    public final void N4(String str, String str2, zzl zzlVar, ee3 ee3Var, z4b z4bVar, t3b t3bVar) {
        Parcel O = O();
        O.writeString(str);
        O.writeString(str2);
        nia.d(O, zzlVar);
        nia.f(O, ee3Var);
        nia.f(O, z4bVar);
        nia.f(O, t3bVar);
        l3(23, O);
    }

    @Override // defpackage.o5b
    public final void O1(String str, String str2, zzl zzlVar, ee3 ee3Var, i5b i5bVar, t3b t3bVar) {
        Parcel O = O();
        O.writeString(str);
        O.writeString(str2);
        nia.d(O, zzlVar);
        nia.f(O, ee3Var);
        nia.f(O, i5bVar);
        nia.f(O, t3bVar);
        l3(18, O);
    }

    @Override // defpackage.o5b
    public final void Q5(String str, String str2, zzl zzlVar, ee3 ee3Var, l5b l5bVar, t3b t3bVar) {
        Parcel O = O();
        O.writeString(str);
        O.writeString(str2);
        nia.d(O, zzlVar);
        nia.f(O, ee3Var);
        nia.f(O, l5bVar);
        nia.f(O, t3bVar);
        l3(16, O);
    }

    @Override // defpackage.o5b
    public final void R4(String str, String str2, zzl zzlVar, ee3 ee3Var, f5b f5bVar, t3b t3bVar) {
        Parcel O = O();
        O.writeString(str);
        O.writeString(str2);
        nia.d(O, zzlVar);
        nia.f(O, ee3Var);
        nia.f(O, f5bVar);
        nia.f(O, t3bVar);
        l3(14, O);
    }

    @Override // defpackage.o5b
    public final void U(String str) {
        Parcel O = O();
        O.writeString(str);
        l3(19, O);
    }

    @Override // defpackage.o5b
    public final boolean b5(ee3 ee3Var) {
        Parcel O = O();
        nia.f(O, ee3Var);
        Parcel Q1 = Q1(17, O);
        boolean g = nia.g(Q1);
        Q1.recycle();
        return g;
    }

    @Override // defpackage.o5b
    public final boolean c0(ee3 ee3Var) {
        Parcel O = O();
        nia.f(O, ee3Var);
        Parcel Q1 = Q1(15, O);
        boolean g = nia.g(Q1);
        Q1.recycle();
        return g;
    }

    @Override // defpackage.o5b
    public final void c2(ee3 ee3Var, String str, Bundle bundle, Bundle bundle2, zzq zzqVar, r5b r5bVar) {
        Parcel O = O();
        nia.f(O, ee3Var);
        O.writeString(str);
        nia.d(O, bundle);
        nia.d(O, bundle2);
        nia.d(O, zzqVar);
        nia.f(O, r5bVar);
        l3(1, O);
    }

    @Override // defpackage.o5b
    public final void o1(String str, String str2, zzl zzlVar, ee3 ee3Var, c5b c5bVar, t3b t3bVar, zzq zzqVar) {
        Parcel O = O();
        O.writeString(str);
        O.writeString(str2);
        nia.d(O, zzlVar);
        nia.f(O, ee3Var);
        nia.f(O, c5bVar);
        nia.f(O, t3bVar);
        nia.d(O, zzqVar);
        l3(13, O);
    }

    @Override // defpackage.o5b
    public final void t2(String str, String str2, zzl zzlVar, ee3 ee3Var, i5b i5bVar, t3b t3bVar, zzbjb zzbjbVar) {
        Parcel O = O();
        O.writeString(str);
        O.writeString(str2);
        nia.d(O, zzlVar);
        nia.f(O, ee3Var);
        nia.f(O, i5bVar);
        nia.f(O, t3bVar);
        nia.d(O, zzbjbVar);
        l3(22, O);
    }

    @Override // defpackage.o5b
    public final void y5(String str, String str2, zzl zzlVar, ee3 ee3Var, l5b l5bVar, t3b t3bVar) {
        Parcel O = O();
        O.writeString(str);
        O.writeString(str2);
        nia.d(O, zzlVar);
        nia.f(O, ee3Var);
        nia.f(O, l5bVar);
        nia.f(O, t3bVar);
        l3(20, O);
    }

    @Override // defpackage.o5b
    public final znc zze() {
        Parcel Q1 = Q1(5, O());
        znc w6 = a0.w6(Q1.readStrongBinder());
        Q1.recycle();
        return w6;
    }

    @Override // defpackage.o5b
    public final zzbvg zzf() {
        Parcel Q1 = Q1(2, O());
        zzbvg zzbvgVar = (zzbvg) nia.a(Q1, zzbvg.CREATOR);
        Q1.recycle();
        return zzbvgVar;
    }

    @Override // defpackage.o5b
    public final zzbvg zzg() {
        Parcel Q1 = Q1(3, O());
        zzbvg zzbvgVar = (zzbvg) nia.a(Q1, zzbvg.CREATOR);
        Q1.recycle();
        return zzbvgVar;
    }
}
