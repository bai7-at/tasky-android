package defpackage;

import android.content.Context;
import com.google.android.gms.internal.ads.zb;
import com.google.android.gms.internal.ads.zzcei;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class cqc {
    private final ppc a;
    private final iq9 b;
    private final imb c;
    private final Context d;
    private final zuc e;
    private final k6e f;
    private final Executor g;
    private final gfa h;
    private final zzcei i;
    private final jya j;
    private final a8d k;
    private final d8e l;
    private final l8d m;
    private final w1e n;
    private j64 o;

    cqc(zpc zpcVar) {
        Context context;
        Executor executor;
        gfa gfaVar;
        zzcei zzceiVar;
        iq9 iq9Var;
        imb imbVar;
        a8d a8dVar;
        d8e d8eVar;
        zuc zucVar;
        k6e k6eVar;
        l8d l8dVar;
        w1e w1eVar;
        context = zpcVar.c;
        this.d = context;
        executor = zpcVar.g;
        this.g = executor;
        gfaVar = zpcVar.h;
        this.h = gfaVar;
        zzceiVar = zpcVar.i;
        this.i = zzceiVar;
        iq9Var = zpcVar.a;
        this.b = iq9Var;
        this.a = new ppc();
        imbVar = zpcVar.b;
        this.c = imbVar;
        this.j = new jya();
        a8dVar = zpcVar.f;
        this.k = a8dVar;
        d8eVar = zpcVar.j;
        this.l = d8eVar;
        zucVar = zpcVar.d;
        this.e = zucVar;
        k6eVar = zpcVar.e;
        this.f = k6eVar;
        l8dVar = zpcVar.k;
        this.m = l8dVar;
        w1eVar = zpcVar.l;
        this.n = w1eVar;
    }

    final /* synthetic */ wlb a(wlb wlbVar) {
        wlbVar.e0("/result", this.j);
        onb zzN = wlbVar.zzN();
        ela elaVar = new ela(this.d, null, null);
        a8d a8dVar = this.k;
        d8e d8eVar = this.l;
        zuc zucVar = this.e;
        k6e k6eVar = this.f;
        ppc ppcVar = this.a;
        zzN.q0(null, ppcVar, ppcVar, ppcVar, ppcVar, false, null, elaVar, null, null, a8dVar, d8eVar, zucVar, k6eVar, null, null, null, null, null);
        return wlbVar;
    }

    final /* synthetic */ j64 c(String str, JSONObject jSONObject, wlb wlbVar) {
        return this.j.b(wlbVar, str, jSONObject);
    }

    public final synchronized j64 d(final String str, final JSONObject jSONObject) {
        j64 j64Var = this.o;
        if (j64Var == null) {
            return zb.h(null);
        }
        return zb.n(j64Var, new ake() { // from class: qpc
            @Override // defpackage.ake
            public final j64 zza(Object obj) {
                return cqc.this.c(str, jSONObject, (wlb) obj);
            }
        }, this.g);
    }

    public final synchronized void e(v0e v0eVar, y0e y0eVar) {
        j64 j64Var = this.o;
        if (j64Var == null) {
            return;
        }
        zb.r(j64Var, new wpc(this, v0eVar, y0eVar), this.g);
    }

    public final synchronized void f() {
        j64 j64Var = this.o;
        if (j64Var == null) {
            return;
        }
        zb.r(j64Var, new spc(this), this.g);
        this.o = null;
    }

    public final synchronized void g(String str, Map map) {
        j64 j64Var = this.o;
        if (j64Var == null) {
            return;
        }
        zb.r(j64Var, new vpc(this, "sendMessageToNativeJs", map), this.g);
    }

    public final synchronized void h() {
        final String str = (String) pla.c().a(mpa.D3);
        final Context context = this.d;
        final gfa gfaVar = this.h;
        final zzcei zzceiVar = this.i;
        final iq9 iq9Var = this.b;
        final l8d l8dVar = this.m;
        final w1e w1eVar = this.n;
        j64 m = zb.m(zb.k(new zje() { // from class: hmb
            @Override // defpackage.zje
            public final j64 zza() {
                dyf.B();
                Context context2 = context;
                unb a = unb.a();
                gfa gfaVar2 = gfaVar;
                l8d l8dVar2 = l8dVar;
                iq9 iq9Var2 = iq9Var;
                wlb a2 = imb.a(context2, a, "", false, false, gfaVar2, null, zzceiVar, null, null, iq9Var2, ina.a(), null, null, l8dVar2, w1eVar);
                final tgb e = tgb.e(a2);
                a2.zzN().N(new mnb() { // from class: gmb
                    @Override // defpackage.mnb
                    public final void a(boolean z, int i, String str2, String str3) {
                        tgb.this.f();
                    }
                });
                a2.loadUrl(str);
                return e;
            }
        }, pgb.e), new gge() { // from class: rpc
            @Override // defpackage.gge
            public final Object apply(Object obj) {
                wlb wlbVar = (wlb) obj;
                cqc.this.a(wlbVar);
                return wlbVar;
            }
        }, this.g);
        this.o = m;
        sgb.a(m, "NativeJavascriptExecutor.initializeEngine");
    }

    public final synchronized void i(String str, uxa uxaVar) {
        j64 j64Var = this.o;
        if (j64Var == null) {
            return;
        }
        zb.r(j64Var, new tpc(this, str, uxaVar), this.g);
    }

    public final void j(WeakReference weakReference, String str, uxa uxaVar) {
        i(str, new bqc(this, weakReference, str, uxaVar, null));
    }

    public final synchronized void k(String str, uxa uxaVar) {
        j64 j64Var = this.o;
        if (j64Var == null) {
            return;
        }
        zb.r(j64Var, new upc(this, str, uxaVar), this.g);
    }
}
