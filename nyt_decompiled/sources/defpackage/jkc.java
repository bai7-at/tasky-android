package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.amazonaws.services.s3.model.InstructionFileId;
import com.google.android.gms.internal.ads.zb;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzeih;
import com.google.android.gms.internal.ads.zzeii;
import com.google.android.gms.internal.ads.zzgaa;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class jkc extends u0c {
    public static final zzgaa H = zzgaa.y("3010", "3008", "1005", "1009", "2011", "2007");
    private final zzcei A;
    private final Context B;
    private final lkc C;
    private final bid D;
    private final Map E;
    private final List F;
    private final xia G;
    private final Executor j;
    private final rkc k;
    private final zkc l;
    private final ulc m;
    private final wkc n;
    private final clc o;
    private final l3f p;
    private final l3f q;
    private final l3f r;
    private final l3f s;
    private final l3f t;
    private qmc u;
    private boolean v;
    private boolean w;
    private boolean x;
    private final ydb y;
    private final gfa z;

    public jkc(t0c t0cVar, Executor executor, rkc rkcVar, zkc zkcVar, ulc ulcVar, wkc wkcVar, clc clcVar, l3f l3fVar, l3f l3fVar2, l3f l3fVar3, l3f l3fVar4, l3f l3fVar5, ydb ydbVar, gfa gfaVar, zzcei zzceiVar, Context context, lkc lkcVar, bid bidVar, xia xiaVar) {
        super(t0cVar);
        this.j = executor;
        this.k = rkcVar;
        this.l = zkcVar;
        this.m = ulcVar;
        this.n = wkcVar;
        this.o = clcVar;
        this.p = l3fVar;
        this.q = l3fVar2;
        this.r = l3fVar3;
        this.s = l3fVar4;
        this.t = l3fVar5;
        this.y = ydbVar;
        this.z = gfaVar;
        this.A = zzceiVar;
        this.B = context;
        this.C = lkcVar;
        this.D = bidVar;
        this.E = new HashMap();
        this.F = new ArrayList();
        this.G = xiaVar;
    }

    public static boolean D(View view) {
        if (!((Boolean) pla.c().a(mpa.ea)).booleanValue()) {
            return view.isShown() && view.getGlobalVisibleRect(new Rect(), null);
        }
        dyf.r();
        long X = wxf.X(view);
        if (view.isShown() && view.getGlobalVisibleRect(new Rect(), null)) {
            if (X >= ((Integer) pla.c().a(mpa.fa)).intValue()) {
                return true;
            }
        }
        return false;
    }

    private final synchronized View F(Map map) {
        if (map != null) {
            zzgaa zzgaaVar = H;
            int size = zzgaaVar.size();
            int i = 0;
            while (i < size) {
                WeakReference weakReference = (WeakReference) map.get((String) zzgaaVar.get(i));
                i++;
                if (weakReference != null) {
                    return (View) weakReference.get();
                }
            }
        }
        return null;
    }

    private final synchronized ImageView.ScaleType G() {
        if (!((Boolean) pla.c().a(mpa.Q7)).booleanValue()) {
            return null;
        }
        qmc qmcVar = this.u;
        if (qmcVar == null) {
            fgb.b("Ad should be associated with an ad view before calling getMediaviewScaleType()");
            return null;
        }
        ee3 zzj = qmcVar.zzj();
        if (zzj != null) {
            return (ImageView.ScaleType) fc5.Q1(zzj);
        }
        return ulc.k;
    }

    private final void I(String str, boolean z) {
        if (!((Boolean) pla.c().a(mpa.a5)).booleanValue()) {
            Q("Google", true);
            return;
        }
        j64 j0 = this.k.j0();
        if (j0 == null) {
            return;
        }
        zb.r(j0, new hkc(this, "Google", true), this.j);
    }

    private final synchronized void J(View view, Map map, Map map2) {
        this.m.d(this.u);
        this.l.c(view, map, map2, G());
        this.w = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(View view, k8e k8eVar) {
        wlb e0 = this.k.e0();
        if (!this.n.d() || k8eVar == null || e0 == null || view == null) {
            return;
        }
        dyf.a().c(k8eVar, view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public final synchronized void c0(qmc qmcVar) {
        Iterator<String> keys;
        View view;
        try {
            if (!this.v) {
                this.u = qmcVar;
                this.m.e(qmcVar);
                this.l.k(qmcVar.zzf(), qmcVar.zzm(), qmcVar.zzn(), qmcVar, qmcVar);
                if (((Boolean) pla.c().a(mpa.v2)).booleanValue()) {
                    this.z.c().a(qmcVar.zzf());
                }
                if (((Boolean) pla.c().a(mpa.K1)).booleanValue()) {
                    v0e v0eVar = this.b;
                    if (v0eVar.l0 && (keys = v0eVar.k0.keys()) != null) {
                        while (keys.hasNext()) {
                            String next = keys.next();
                            WeakReference weakReference = (WeakReference) this.u.zzl().get(next);
                            this.E.put(next, Boolean.FALSE);
                            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                                wia wiaVar = new wia(this.B, view);
                                this.F.add(wiaVar);
                                wiaVar.e(new gkc(this, next));
                            }
                        }
                    }
                }
                if (qmcVar.zzi() != null) {
                    qmcVar.zzi().e(this.y);
                }
            }
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public final void d0(qmc qmcVar) {
        this.l.h(qmcVar.zzf(), qmcVar.zzl());
        if (qmcVar.zzh() != null) {
            qmcVar.zzh().setClickable(false);
            qmcVar.zzh().removeAllViews();
        }
        if (qmcVar.zzi() != null) {
            qmcVar.zzi().g(this.y);
        }
        this.u = null;
    }

    public static /* synthetic */ void V(jkc jkcVar) {
        try {
            rkc rkcVar = jkcVar.k;
            int P = rkcVar.P();
            if (P == 1) {
                if (jkcVar.o.b() != null) {
                    jkcVar.I("Google", true);
                    jkcVar.o.b().m4((gua) jkcVar.p.zzb());
                    return;
                }
                return;
            }
            if (P == 2) {
                if (jkcVar.o.a() != null) {
                    jkcVar.I("Google", true);
                    jkcVar.o.a().O4((eua) jkcVar.q.zzb());
                    return;
                }
                return;
            }
            if (P == 3) {
                if (jkcVar.o.d(rkcVar.a()) != null) {
                    if (jkcVar.k.f0() != null) {
                        jkcVar.Q("Google", true);
                    }
                    jkcVar.o.d(jkcVar.k.a()).a3((jua) jkcVar.t.zzb());
                    return;
                }
                return;
            }
            if (P == 6) {
                if (jkcVar.o.f() != null) {
                    jkcVar.I("Google", true);
                    jkcVar.o.f().d3((pva) jkcVar.r.zzb());
                    return;
                }
                return;
            }
            if (P != 7) {
                fgb.d("Wrong native template id!");
                return;
            }
            clc clcVar = jkcVar.o;
            if (clcVar.g() != null) {
                clcVar.g().F3((qza) jkcVar.s.zzb());
            }
        } catch (RemoteException e) {
            fgb.e("RemoteException when notifyAdLoad is called", e);
        }
    }

    public final synchronized boolean A() {
        return this.l.o();
    }

    public final synchronized boolean B() {
        return this.l.v();
    }

    public final boolean C() {
        return this.n.d();
    }

    public final synchronized boolean E(Bundle bundle) {
        if (this.w) {
            return true;
        }
        boolean i = this.l.i(bundle);
        this.w = i;
        return i;
    }

    public final synchronized int H() {
        return this.l.zza();
    }

    public final lkc N() {
        return this.C;
    }

    public final k8e Q(String str, boolean z) {
        String str2;
        zzeii zzeiiVar;
        zzeih zzeihVar;
        if (!this.n.d() || TextUtils.isEmpty(str)) {
            return null;
        }
        rkc rkcVar = this.k;
        wlb e0 = rkcVar.e0();
        wlb f0 = rkcVar.f0();
        if (e0 == null && f0 == null) {
            fgb.g("Omid display and video webview are null. Skipping initialization.");
            return null;
        }
        boolean z2 = false;
        boolean z3 = e0 != null;
        boolean z4 = f0 != null;
        if (((Boolean) pla.c().a(mpa.Y4)).booleanValue()) {
            this.n.a();
            int b = this.n.a().b();
            int i = b - 1;
            if (i != 0) {
                if (i != 1) {
                    fgb.g("Unknown omid media type: " + (b != 1 ? b != 2 ? "UNKNOWN" : "DISPLAY" : "VIDEO") + ". Not initializing Omid.");
                    return null;
                }
                if (e0 == null) {
                    fgb.g("Omid media type was display but there was no display webview.");
                    return null;
                }
                z4 = false;
                z2 = true;
            } else {
                if (f0 == null) {
                    fgb.g("Omid media type was video but there was no video webview.");
                    return null;
                }
                z4 = true;
            }
        } else {
            z2 = z3;
        }
        if (z2) {
            str2 = null;
        } else {
            str2 = "javascript";
            e0 = f0;
        }
        e0.A();
        if (!dyf.a().a(this.B)) {
            fgb.g("Failed to initialize omid in InternalNativeAd");
            return null;
        }
        zzcei zzceiVar = this.A;
        String str3 = zzceiVar.zzb + InstructionFileId.DOT + zzceiVar.zzc;
        if (z4) {
            zzeihVar = zzeih.VIDEO;
            zzeiiVar = zzeii.DEFINED_BY_JAVASCRIPT;
        } else {
            rkc rkcVar2 = this.k;
            zzeih zzeihVar2 = zzeih.NATIVE_DISPLAY;
            zzeiiVar = rkcVar2.P() == 3 ? zzeii.UNSPECIFIED : zzeii.ONE_PIXEL;
            zzeihVar = zzeihVar2;
        }
        k8e g = dyf.a().g(str3, e0.A(), "", "javascript", str2, str, zzeiiVar, zzeihVar, this.b.m0);
        if (g == null) {
            fgb.g("Failed to create omid session in InternalNativeAd");
            return null;
        }
        this.k.w(g);
        e0.I0(g);
        if (z4) {
            dyf.a().c(g, f0.h());
            this.x = true;
        }
        if (z) {
            dyf.a().d(g);
            e0.t("onSdkLoaded", new so());
        }
        return g;
    }

    public final String R() {
        return this.n.b();
    }

    public final synchronized JSONObject T(View view, Map map, Map map2) {
        return this.l.m(view, map, map2, G());
    }

    public final synchronized JSONObject U(View view, Map map, Map map2) {
        return this.l.q(view, map, map2, G());
    }

    public final void X(View view) {
        k8e h0 = this.k.h0();
        if (!this.n.d() || h0 == null || view == null) {
            return;
        }
        dyf.a().f(h0, view);
    }

    public final synchronized void Y() {
        this.l.zzh();
    }

    final /* synthetic */ void Z() {
        this.l.zzi();
        this.k.i();
    }

    @Override // defpackage.u0c
    public final synchronized void a() {
        this.v = true;
        this.j.execute(new Runnable() { // from class: ekc
            @Override // java.lang.Runnable
            public final void run() {
                jkc.this.Z();
            }
        });
        super.a();
    }

    final /* synthetic */ void a0(View view, boolean z, int i) {
        this.l.n(view, this.u.zzf(), this.u.zzl(), this.u.zzm(), z, G(), i);
    }

    @Override // defpackage.u0c
    public final void b() {
        this.j.execute(new Runnable() { // from class: bkc
            @Override // java.lang.Runnable
            public final void run() {
                jkc.V(jkc.this);
            }
        });
        if (this.k.P() != 7) {
            Executor executor = this.j;
            final zkc zkcVar = this.l;
            Objects.requireNonNull(zkcVar);
            executor.execute(new Runnable() { // from class: ckc
                @Override // java.lang.Runnable
                public final void run() {
                    zkc.this.zzp();
                }
            });
        }
        super.b();
    }

    final /* synthetic */ void b0(boolean z) {
        this.l.n(null, this.u.zzf(), this.u.zzl(), this.u.zzm(), z, G(), 0);
    }

    public final synchronized void h(View view, Map map, Map map2, boolean z) {
        try {
            if (!this.w) {
                if (((Boolean) pla.c().a(mpa.K1)).booleanValue() && this.b.l0) {
                    Iterator it2 = this.E.keySet().iterator();
                    while (it2.hasNext()) {
                        if (!((Boolean) this.E.get((String) it2.next())).booleanValue()) {
                            break;
                        }
                    }
                }
                if (z) {
                    View F = F(map);
                    if (F == null) {
                        J(view, map, map2);
                        return;
                    }
                    if (!((Boolean) pla.c().a(mpa.M3)).booleanValue()) {
                        if (!((Boolean) pla.c().a(mpa.N3)).booleanValue()) {
                            J(view, map, map2);
                            return;
                        }
                        Rect rect = new Rect();
                        if (F.getGlobalVisibleRect(rect, null) && F.getHeight() == rect.height() && F.getWidth() == rect.width()) {
                            J(view, map, map2);
                        }
                    } else if (D(F)) {
                        J(view, map, map2);
                    }
                } else {
                    if (((Boolean) pla.c().a(mpa.L3)).booleanValue() && map != null) {
                        Iterator it3 = map.entrySet().iterator();
                        while (it3.hasNext()) {
                            View view2 = (View) ((WeakReference) ((Map.Entry) it3.next()).getValue()).get();
                            if (view2 != null && D(view2)) {
                                J(view, map, map2);
                                return;
                            }
                        }
                    }
                }
            }
        } finally {
        }
    }

    public final synchronized void i(m0c m0cVar) {
        this.l.p(m0cVar);
    }

    public final synchronized void j(View view, View view2, Map map, Map map2, boolean z) {
        this.m.c(this.u);
        this.l.d(view, view2, map, map2, z, G());
        if (this.x) {
            rkc rkcVar = this.k;
            if (rkcVar.f0() != null) {
                rkcVar.f0().t("onSdkAdUserInteractionClick", new so());
            }
        }
    }

    public final synchronized void k(final View view, final int i) {
        if (((Boolean) pla.c().a(mpa.Ua)).booleanValue()) {
            qmc qmcVar = this.u;
            if (qmcVar == null) {
                fgb.b("Ad should be associated with an ad view before calling performClickForCustomGesture()");
            } else {
                final boolean z = qmcVar instanceof llc;
                this.j.execute(new Runnable() { // from class: dkc
                    @Override // java.lang.Runnable
                    public final void run() {
                        jkc.this.a0(view, z, i);
                    }
                });
            }
        }
    }

    public final synchronized void l(String str) {
        this.l.x(str);
    }

    public final synchronized void m(Bundle bundle) {
        this.l.e(bundle);
    }

    public final synchronized void n() {
        qmc qmcVar = this.u;
        if (qmcVar == null) {
            fgb.b("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        } else {
            final boolean z = qmcVar instanceof llc;
            this.j.execute(new Runnable() { // from class: fkc
                @Override // java.lang.Runnable
                public final void run() {
                    jkc.this.b0(z);
                }
            });
        }
    }

    public final synchronized void o() {
        if (this.w) {
            return;
        }
        this.l.zzr();
    }

    public final void p(View view) {
        if (!((Boolean) pla.c().a(mpa.a5)).booleanValue()) {
            K(view, this.k.h0());
            return;
        }
        ugb c0 = this.k.c0();
        if (c0 == null) {
            return;
        }
        zb.r(c0, new ikc(this, view), this.j);
    }

    public final synchronized void q(View view, MotionEvent motionEvent, View view2) {
        this.l.b(view, motionEvent, view2);
    }

    public final synchronized void r(Bundle bundle) {
        this.l.l(bundle);
    }

    public final synchronized void s(View view) {
        this.l.j(view);
    }

    public final synchronized void t() {
        this.l.a();
    }

    public final synchronized void u(bwb bwbVar) {
        this.l.f(bwbVar);
    }

    public final synchronized void v(zcc zccVar) {
        this.D.b(zccVar);
    }

    public final synchronized void w(mva mvaVar) {
        this.l.g(mvaVar);
    }

    public final synchronized void x(final qmc qmcVar) {
        if (((Boolean) pla.c().a(mpa.I1)).booleanValue()) {
            wxf.l.post(new Runnable() { // from class: zjc
                @Override // java.lang.Runnable
                public final void run() {
                    jkc.this.c0(qmcVar);
                }
            });
        } else {
            c0(qmcVar);
        }
    }

    public final synchronized void y(final qmc qmcVar) {
        if (((Boolean) pla.c().a(mpa.I1)).booleanValue()) {
            wxf.l.post(new Runnable() { // from class: akc
                @Override // java.lang.Runnable
                public final void run() {
                    jkc.this.d0(qmcVar);
                }
            });
        } else {
            d0(qmcVar);
        }
    }

    public final boolean z() {
        return this.n.e();
    }
}
