package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import com.google.android.gms.internal.ads.s6;
import com.google.android.gms.internal.ads.zb;
import com.google.android.gms.internal.ads.zzbze;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzfjc;
import com.google.android.gms.internal.ads.zzflg;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class y4d extends a9b {
    private final Context a;
    private final kke b;
    private final t5d c;
    private final lub d;
    private final ArrayDeque e;
    private final v7e f;
    private final eab g;
    private final q5d h;

    public y4d(Context context, kke kkeVar, eab eabVar, lub lubVar, t5d t5dVar, ArrayDeque arrayDeque, q5d q5dVar, v7e v7eVar) {
        mpa.a(context);
        this.a = context;
        this.b = kkeVar;
        this.g = eabVar;
        this.c = t5dVar;
        this.d = lubVar;
        this.e = arrayDeque;
        this.h = q5dVar;
        this.f = v7eVar;
    }

    private final synchronized v4d B6(String str) {
        Iterator it2 = this.e.iterator();
        while (it2.hasNext()) {
            v4d v4dVar = (v4d) it2.next();
            if (v4dVar.c.equals(str)) {
                it2.remove();
                return v4dVar;
            }
        }
        return null;
    }

    private static j64 C6(j64 j64Var, s6 s6Var, e2b e2bVar, q7e q7eVar, f7e f7eVar) {
        u1b a = e2bVar.a("AFMA_getAdDictionary", b2b.b, new w1b() { // from class: r4d
            @Override // defpackage.w1b
            public final Object a(JSONObject jSONObject) {
                return new v9b(jSONObject);
            }
        });
        p7e.d(j64Var, f7eVar);
        h5e a2 = s6Var.b(zzflg.BUILD_URL, j64Var).f(a).a();
        p7e.c(a2, q7eVar, f7eVar);
        return a2;
    }

    private static j64 D6(zzbze zzbzeVar, s6 s6Var, final grd grdVar) {
        ake akeVar = new ake() { // from class: h4d
            @Override // defpackage.ake
            public final j64 zza(Object obj) {
                return grd.this.b().a(kia.b().j((Bundle) obj));
            }
        };
        return s6Var.b(zzflg.GMS_SIGNALS, zb.h(zzbzeVar.zza)).f(akeVar).e(new f5e() { // from class: m4d
            @Override // defpackage.f5e
            public final Object zza(Object obj) {
                JSONObject jSONObject = (JSONObject) obj;
                pzc.k("Ad request signals:");
                pzc.k(jSONObject.toString(2));
                return jSONObject;
            }
        }).a();
    }

    private final synchronized void E6(v4d v4dVar) {
        zzo();
        this.e.addLast(v4dVar);
    }

    private final void F6(j64 j64Var, q9b q9bVar) {
        zb.r(zb.n(j64Var, new ake() { // from class: f4d
            @Override // defpackage.ake
            public final j64 zza(Object obj) {
                return zb.h(v2e.a((InputStream) obj));
            }
        }, pgb.a), new u4d(this, q9bVar), pgb.f);
    }

    private final synchronized void zzo() {
        int intValue = ((Long) csa.c.e()).intValue();
        while (this.e.size() >= intValue) {
            this.e.removeFirst();
        }
    }

    final /* synthetic */ InputStream A6(j64 j64Var, j64 j64Var2, zzbze zzbzeVar, f7e f7eVar) {
        String c = ((v9b) j64Var.get()).c();
        E6(new v4d((v9b) j64Var.get(), (JSONObject) j64Var2.get(), zzbzeVar.zzh, c, f7eVar));
        return new ByteArrayInputStream(c.getBytes(ege.c));
    }

    @Override // defpackage.b9b
    public final void R3(zzbze zzbzeVar, q9b q9bVar) {
        F6(y6(zzbzeVar, Binder.getCallingUid()), q9bVar);
    }

    @Override // defpackage.b9b
    public final void X4(zzbze zzbzeVar, q9b q9bVar) {
        j64 x6 = x6(zzbzeVar, Binder.getCallingUid());
        F6(x6, q9bVar);
        if (((Boolean) vra.c.e()).booleanValue()) {
            t5d t5dVar = this.c;
            Objects.requireNonNull(t5dVar);
            x6.a(new q4d(t5dVar), this.b);
        }
    }

    @Override // defpackage.b9b
    public final void Z5(String str, q9b q9bVar) {
        F6(z6(str), q9bVar);
    }

    @Override // defpackage.b9b
    public final void o4(zzbze zzbzeVar, q9b q9bVar) {
        F6(w6(zzbzeVar, Binder.getCallingUid()), q9bVar);
    }

    public final j64 w6(final zzbze zzbzeVar, int i) {
        if (!((Boolean) csa.a.e()).booleanValue()) {
            return zb.g(new Exception("Split request is disabled."));
        }
        zzfjc zzfjcVar = zzbzeVar.zzi;
        if (zzfjcVar == null) {
            return zb.g(new Exception("Pool configuration missing from request."));
        }
        if (zzfjcVar.zzc == 0 || zzfjcVar.zzd == 0) {
            return zb.g(new Exception("Caching is disabled."));
        }
        e2b b = dyf.h().b(this.a, zzcei.t0(), this.f);
        grd a = this.d.a(zzbzeVar, i);
        s6 c = a.c();
        final j64 D6 = D6(zzbzeVar, c, a);
        q7e d = a.d();
        final f7e a2 = e7e.a(this.a, 9);
        final j64 C6 = C6(D6, c, b, d, a2);
        return c.a(zzflg.GET_URL_AND_CACHE_KEY, D6, C6).a(new Callable() { // from class: p4d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return y4d.this.A6(C6, D6, zzbzeVar, a2);
            }
        }).a();
    }

    public final j64 x6(zzbze zzbzeVar, int i) {
        v4d B6;
        h5e a;
        e2b b = dyf.h().b(this.a, zzcei.t0(), this.f);
        grd a2 = this.d.a(zzbzeVar, i);
        u1b a3 = b.a("google.afma.response.normalize", x4d.d, b2b.c);
        if (((Boolean) csa.a.e()).booleanValue()) {
            B6 = B6(zzbzeVar.zzh);
            if (B6 == null) {
                pzc.k("Request contained a PoolKey but no matching parameters were found.");
            }
        } else {
            String str = zzbzeVar.zzj;
            B6 = null;
            if (str != null && !str.isEmpty()) {
                pzc.k("Request contained a PoolKey but split request is disabled.");
            }
        }
        f7e a4 = B6 == null ? e7e.a(this.a, 9) : B6.e;
        q7e d = a2.d();
        d.d(zzbzeVar.zza.getStringArrayList("ad_types"));
        s5d s5dVar = new s5d(zzbzeVar.zzg, d, a4);
        p5d p5dVar = new p5d(this.a, zzbzeVar.zzb.zza, this.g, i);
        s6 c = a2.c();
        f7e a5 = e7e.a(this.a, 11);
        if (B6 == null) {
            final j64 D6 = D6(zzbzeVar, c, a2);
            final j64 C6 = C6(D6, c, b, d, a4);
            f7e a6 = e7e.a(this.a, 10);
            final h5e a7 = c.a(zzflg.HTTP, C6, D6).a(new Callable() { // from class: n4d
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new r5d((JSONObject) j64.this.get(), (v9b) C6.get());
                }
            }).e(s5dVar).e(new l7e(a6)).e(p5dVar).a();
            p7e.a(a7, d, a6);
            p7e.d(a7, a5);
            a = c.a(zzflg.PRE_PROCESS, D6, C6, a7).a(new Callable() { // from class: o4d
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new x4d((l5d) j64.this.get(), (JSONObject) D6.get(), (v9b) C6.get());
                }
            }).f(a3).a();
        } else {
            r5d r5dVar = new r5d(B6.b, B6.a);
            f7e a8 = e7e.a(this.a, 10);
            final h5e a9 = c.b(zzflg.HTTP, zb.h(r5dVar)).e(s5dVar).e(new l7e(a8)).e(p5dVar).a();
            p7e.a(a9, d, a8);
            final j64 h = zb.h(B6);
            p7e.d(a9, a5);
            a = c.a(zzflg.PRE_PROCESS, a9, h).a(new Callable() { // from class: g4d
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    l5d l5dVar = (l5d) j64.this.get();
                    j64 j64Var = h;
                    return new x4d(l5dVar, ((v4d) j64Var.get()).b, ((v4d) j64Var.get()).a);
                }
            }).f(a3).a();
        }
        p7e.a(a, d, a5);
        return a;
    }

    public final j64 y6(zzbze zzbzeVar, int i) {
        e2b b = dyf.h().b(this.a, zzcei.t0(), this.f);
        if (!((Boolean) hsa.a.e()).booleanValue()) {
            return zb.g(new Exception("Signal collection disabled."));
        }
        grd a = this.d.a(zzbzeVar, i);
        final jqd a2 = a.a();
        u1b a3 = b.a("google.afma.request.getSignals", b2b.b, b2b.c);
        f7e a4 = e7e.a(this.a, 22);
        h5e a5 = a.c().b(zzflg.GET_SIGNALS, zb.h(zzbzeVar.zza)).e(new l7e(a4)).f(new ake() { // from class: s4d
            @Override // defpackage.ake
            public final j64 zza(Object obj) {
                return jqd.this.a(kia.b().j((Bundle) obj));
            }
        }).b(zzflg.JS_SIGNALS).f(a3).a();
        q7e d = a.d();
        d.d(zzbzeVar.zza.getStringArrayList("ad_types"));
        p7e.b(a5, d, a4);
        if (((Boolean) vra.e.e()).booleanValue()) {
            t5d t5dVar = this.c;
            Objects.requireNonNull(t5dVar);
            a5.a(new q4d(t5dVar), this.b);
        }
        return a5;
    }

    public final j64 z6(String str) {
        if (((Boolean) csa.a.e()).booleanValue()) {
            return B6(str) == null ? zb.g(new Exception("URL to be removed not found for cache key: ".concat(String.valueOf(str)))) : zb.h(new t4d(this));
        }
        return zb.g(new Exception("Split request is disabled."));
    }
}
