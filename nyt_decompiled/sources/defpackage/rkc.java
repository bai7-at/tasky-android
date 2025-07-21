package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class rkc {
    private int a;
    private znc b;
    private fta c;
    private View d;
    private List e;
    private ecd g;
    private Bundle h;
    private wlb i;
    private wlb j;
    private wlb k;
    private k8e l;
    private j64 m;
    private ugb n;
    private View o;
    private View p;
    private ee3 q;
    private double r;
    private mta s;
    private mta t;
    private String u;
    private float x;
    private String y;
    private final hs7 v = new hs7();
    private final hs7 w = new hs7();
    private List f = Collections.emptyList();

    public static rkc H(y3b y3bVar) {
        try {
            nkc L = L(y3bVar.s4(), null);
            fta x4 = y3bVar.x4();
            View view = (View) N(y3bVar.h6());
            String zzo = y3bVar.zzo();
            List w6 = y3bVar.w6();
            String zzm = y3bVar.zzm();
            Bundle zzf = y3bVar.zzf();
            String zzn = y3bVar.zzn();
            View view2 = (View) N(y3bVar.v6());
            ee3 zzl = y3bVar.zzl();
            String zzq = y3bVar.zzq();
            String zzp = y3bVar.zzp();
            double zze = y3bVar.zze();
            mta Y4 = y3bVar.Y4();
            rkc rkcVar = new rkc();
            rkcVar.a = 2;
            rkcVar.b = L;
            rkcVar.c = x4;
            rkcVar.d = view;
            rkcVar.z("headline", zzo);
            rkcVar.e = w6;
            rkcVar.z("body", zzm);
            rkcVar.h = zzf;
            rkcVar.z("call_to_action", zzn);
            rkcVar.o = view2;
            rkcVar.q = zzl;
            rkcVar.z("store", zzq);
            rkcVar.z("price", zzp);
            rkcVar.r = zze;
            rkcVar.s = Y4;
            return rkcVar;
        } catch (RemoteException e) {
            fgb.h("Failed to get native ad from app install ad mapper", e);
            return null;
        }
    }

    public static rkc I(z3b z3bVar) {
        try {
            nkc L = L(z3bVar.s4(), null);
            fta x4 = z3bVar.x4();
            View view = (View) N(z3bVar.zzi());
            String zzo = z3bVar.zzo();
            List w6 = z3bVar.w6();
            String zzm = z3bVar.zzm();
            Bundle zze = z3bVar.zze();
            String zzn = z3bVar.zzn();
            View view2 = (View) N(z3bVar.h6());
            ee3 v6 = z3bVar.v6();
            String zzl = z3bVar.zzl();
            mta Y4 = z3bVar.Y4();
            rkc rkcVar = new rkc();
            rkcVar.a = 1;
            rkcVar.b = L;
            rkcVar.c = x4;
            rkcVar.d = view;
            rkcVar.z("headline", zzo);
            rkcVar.e = w6;
            rkcVar.z("body", zzm);
            rkcVar.h = zze;
            rkcVar.z("call_to_action", zzn);
            rkcVar.o = view2;
            rkcVar.q = v6;
            rkcVar.z("advertiser", zzl);
            rkcVar.t = Y4;
            return rkcVar;
        } catch (RemoteException e) {
            fgb.h("Failed to get native ad from content ad mapper", e);
            return null;
        }
    }

    public static rkc J(y3b y3bVar) {
        try {
            return M(L(y3bVar.s4(), null), y3bVar.x4(), (View) N(y3bVar.h6()), y3bVar.zzo(), y3bVar.w6(), y3bVar.zzm(), y3bVar.zzf(), y3bVar.zzn(), (View) N(y3bVar.v6()), y3bVar.zzl(), y3bVar.zzq(), y3bVar.zzp(), y3bVar.zze(), y3bVar.Y4(), null, 0.0f);
        } catch (RemoteException e) {
            fgb.h("Failed to get native ad assets from app install ad mapper", e);
            return null;
        }
    }

    public static rkc K(z3b z3bVar) {
        try {
            return M(L(z3bVar.s4(), null), z3bVar.x4(), (View) N(z3bVar.zzi()), z3bVar.zzo(), z3bVar.w6(), z3bVar.zzm(), z3bVar.zze(), z3bVar.zzn(), (View) N(z3bVar.h6()), z3bVar.v6(), null, null, -1.0d, z3bVar.Y4(), z3bVar.zzl(), 0.0f);
        } catch (RemoteException e) {
            fgb.h("Failed to get native ad assets from content ad mapper", e);
            return null;
        }
    }

    private static nkc L(znc zncVar, c4b c4bVar) {
        if (zncVar == null) {
            return null;
        }
        return new nkc(zncVar, c4bVar);
    }

    private static rkc M(znc zncVar, fta ftaVar, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, ee3 ee3Var, String str4, String str5, double d, mta mtaVar, String str6, float f) {
        rkc rkcVar = new rkc();
        rkcVar.a = 6;
        rkcVar.b = zncVar;
        rkcVar.c = ftaVar;
        rkcVar.d = view;
        rkcVar.z("headline", str);
        rkcVar.e = list;
        rkcVar.z("body", str2);
        rkcVar.h = bundle;
        rkcVar.z("call_to_action", str3);
        rkcVar.o = view2;
        rkcVar.q = ee3Var;
        rkcVar.z("store", str4);
        rkcVar.z("price", str5);
        rkcVar.r = d;
        rkcVar.s = mtaVar;
        rkcVar.z("advertiser", str6);
        rkcVar.r(f);
        return rkcVar;
    }

    private static Object N(ee3 ee3Var) {
        if (ee3Var == null) {
            return null;
        }
        return fc5.Q1(ee3Var);
    }

    public static rkc g0(c4b c4bVar) {
        try {
            return M(L(c4bVar.zzj(), c4bVar), c4bVar.zzk(), (View) N(c4bVar.zzm()), c4bVar.zzs(), c4bVar.a(), c4bVar.zzq(), c4bVar.zzi(), c4bVar.zzr(), (View) N(c4bVar.zzn()), c4bVar.zzo(), c4bVar.c(), c4bVar.g(), c4bVar.zze(), c4bVar.zzl(), c4bVar.zzp(), c4bVar.zzf());
        } catch (RemoteException e) {
            fgb.h("Failed to get native ad assets from unified ad mapper", e);
            return null;
        }
    }

    public final synchronized double A() {
        return this.r;
    }

    public final synchronized void B(int i) {
        this.a = i;
    }

    public final synchronized void C(znc zncVar) {
        this.b = zncVar;
    }

    public final synchronized void D(View view) {
        this.o = view;
    }

    public final synchronized void E(wlb wlbVar) {
        this.i = wlbVar;
    }

    public final synchronized void F(View view) {
        this.p = view;
    }

    public final synchronized boolean G() {
        return this.j != null;
    }

    public final synchronized float O() {
        return this.x;
    }

    public final synchronized int P() {
        return this.a;
    }

    public final synchronized Bundle Q() {
        try {
            if (this.h == null) {
                this.h = new Bundle();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.h;
    }

    public final synchronized View R() {
        return this.d;
    }

    public final synchronized View S() {
        return this.o;
    }

    public final synchronized View T() {
        return this.p;
    }

    public final synchronized hs7 U() {
        return this.v;
    }

    public final synchronized hs7 V() {
        return this.w;
    }

    public final synchronized znc W() {
        return this.b;
    }

    public final synchronized ecd X() {
        return this.g;
    }

    public final synchronized fta Y() {
        return this.c;
    }

    public final mta Z() {
        List list = this.e;
        if (list == null || list.isEmpty()) {
            return null;
        }
        Object obj = this.e.get(0);
        if (obj instanceof IBinder) {
            return lta.w6((IBinder) obj);
        }
        return null;
    }

    public final synchronized String a() {
        return this.u;
    }

    public final synchronized mta a0() {
        return this.s;
    }

    public final synchronized String b() {
        return f("headline");
    }

    public final synchronized mta b0() {
        return this.t;
    }

    public final synchronized String c() {
        return this.y;
    }

    public final synchronized ugb c0() {
        return this.n;
    }

    public final synchronized String d() {
        return f("price");
    }

    public final synchronized wlb d0() {
        return this.j;
    }

    public final synchronized String e() {
        return f("store");
    }

    public final synchronized wlb e0() {
        return this.k;
    }

    public final synchronized String f(String str) {
        return (String) this.w.get(str);
    }

    public final synchronized wlb f0() {
        return this.i;
    }

    public final synchronized List g() {
        return this.e;
    }

    public final synchronized List h() {
        return this.f;
    }

    public final synchronized k8e h0() {
        return this.l;
    }

    public final synchronized void i() {
        try {
            wlb wlbVar = this.i;
            if (wlbVar != null) {
                wlbVar.destroy();
                this.i = null;
            }
            wlb wlbVar2 = this.j;
            if (wlbVar2 != null) {
                wlbVar2.destroy();
                this.j = null;
            }
            wlb wlbVar3 = this.k;
            if (wlbVar3 != null) {
                wlbVar3.destroy();
                this.k = null;
            }
            j64 j64Var = this.m;
            if (j64Var != null) {
                j64Var.cancel(false);
                this.m = null;
            }
            ugb ugbVar = this.n;
            if (ugbVar != null) {
                ugbVar.cancel(false);
                this.n = null;
            }
            this.l = null;
            this.v.clear();
            this.w.clear();
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
            this.h = null;
            this.o = null;
            this.p = null;
            this.q = null;
            this.s = null;
            this.t = null;
            this.u = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized ee3 i0() {
        return this.q;
    }

    public final synchronized void j(fta ftaVar) {
        this.c = ftaVar;
    }

    public final synchronized j64 j0() {
        return this.m;
    }

    public final synchronized void k(String str) {
        this.u = str;
    }

    public final synchronized String k0() {
        return f("advertiser");
    }

    public final synchronized void l(ecd ecdVar) {
        this.g = ecdVar;
    }

    public final synchronized String l0() {
        return f("body");
    }

    public final synchronized void m(mta mtaVar) {
        this.s = mtaVar;
    }

    public final synchronized String m0() {
        return f("call_to_action");
    }

    public final synchronized void n(String str, usa usaVar) {
        if (usaVar == null) {
            this.v.remove(str);
        } else {
            this.v.put(str, usaVar);
        }
    }

    public final synchronized void o(wlb wlbVar) {
        this.j = wlbVar;
    }

    public final synchronized void p(List list) {
        this.e = list;
    }

    public final synchronized void q(mta mtaVar) {
        this.t = mtaVar;
    }

    public final synchronized void r(float f) {
        this.x = f;
    }

    public final synchronized void s(List list) {
        this.f = list;
    }

    public final synchronized void t(wlb wlbVar) {
        this.k = wlbVar;
    }

    public final synchronized void u(j64 j64Var) {
        this.m = j64Var;
    }

    public final synchronized void v(String str) {
        this.y = str;
    }

    public final synchronized void w(k8e k8eVar) {
        this.l = k8eVar;
    }

    public final synchronized void x(ugb ugbVar) {
        this.n = ugbVar;
    }

    public final synchronized void y(double d) {
        this.r = d;
    }

    public final synchronized void z(String str, String str2) {
        if (str2 == null) {
            this.w.remove(str);
        } else {
            this.w.put(str, str2);
        }
    }
}
