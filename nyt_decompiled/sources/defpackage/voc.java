package defpackage;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.internal.ads.zb;
import com.google.android.gms.internal.ads.zzeml;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class voc {
    private final s1e a;
    private final Executor b;
    private final urc c;
    private final lqc d;
    private final Context e;
    private final zuc f;
    private final k6e g;
    private final d8e h;
    private final a8d i;

    public voc(s1e s1eVar, Executor executor, urc urcVar, Context context, zuc zucVar, k6e k6eVar, d8e d8eVar, a8d a8dVar, lqc lqcVar) {
        this.a = s1eVar;
        this.b = executor;
        this.c = urcVar;
        this.e = context;
        this.f = zucVar;
        this.g = k6eVar;
        this.h = d8eVar;
        this.i = a8dVar;
        this.d = lqcVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void h(wlb wlbVar) {
        j(wlbVar);
        wlbVar.e0("/video", txa.l);
        wlbVar.e0("/videoMeta", txa.m);
        wlbVar.e0("/precache", new nkb());
        wlbVar.e0("/delayPageLoaded", txa.p);
        wlbVar.e0("/instrument", txa.n);
        wlbVar.e0("/log", txa.g);
        wlbVar.e0("/click", new nwa(null, 0 == true ? 1 : 0));
        if (this.a.b != null) {
            wlbVar.zzN().h0(true);
            wlbVar.e0("/open", new fya(null, null, null, null, null, null));
        } else {
            wlbVar.zzN().h0(false);
        }
        if (dyf.p().p(wlbVar.getContext())) {
            wlbVar.e0("/logScionEvent", new zxa(wlbVar.getContext()));
        }
    }

    private final void i(wlb wlbVar, tgb tgbVar) {
        if (this.a.a != null && wlbVar.zzq() != null) {
            wlbVar.zzq().A6(this.a.a);
        }
        tgbVar.f();
    }

    private static final void j(wlb wlbVar) {
        wlbVar.e0("/videoClicked", txa.h);
        wlbVar.zzN().Q(true);
        if (((Boolean) pla.c().a(mpa.F3)).booleanValue()) {
            wlbVar.e0("/getNativeAdViewSignals", txa.s);
        }
        wlbVar.e0("/getNativeClickMeta", txa.t);
    }

    public final j64 a(final JSONObject jSONObject) {
        return zb.n(zb.n(zb.h(null), new ake() { // from class: moc
            @Override // defpackage.ake
            public final j64 zza(Object obj) {
                return voc.this.e(obj);
            }
        }, this.b), new ake() { // from class: loc
            @Override // defpackage.ake
            public final j64 zza(Object obj) {
                return voc.this.c(jSONObject, (wlb) obj);
            }
        }, this.b);
    }

    public final j64 b(final String str, final String str2, final v0e v0eVar, final y0e y0eVar, final zzq zzqVar) {
        return zb.n(zb.h(null), new ake() { // from class: koc
            @Override // defpackage.ake
            public final j64 zza(Object obj) {
                return voc.this.d(zzqVar, v0eVar, y0eVar, str, str2, obj);
            }
        }, this.b);
    }

    final /* synthetic */ j64 c(JSONObject jSONObject, final wlb wlbVar) {
        final tgb e = tgb.e(wlbVar);
        if (this.a.b != null) {
            wlbVar.t0(unb.d());
        } else {
            wlbVar.t0(unb.e());
        }
        wlbVar.zzN().N(new mnb() { // from class: noc
            @Override // defpackage.mnb
            public final void a(boolean z, int i, String str, String str2) {
                voc.this.f(wlbVar, e, z, i, str, str2);
            }
        });
        wlbVar.M0("google.afma.nativeAds.renderVideo", jSONObject);
        return e;
    }

    final /* synthetic */ j64 d(zzq zzqVar, v0e v0eVar, y0e y0eVar, String str, String str2, Object obj) {
        final wlb a = this.c.a(zzqVar, v0eVar, y0eVar);
        final tgb e = tgb.e(a);
        if (this.a.b != null) {
            h(a);
            a.t0(unb.d());
        } else {
            iqc b = this.d.b();
            a.zzN().q0(b, b, b, b, b, false, null, new ela(this.e, null, null), null, null, this.i, this.h, this.f, this.g, null, b, null, null, null);
            j(a);
        }
        a.zzN().N(new mnb() { // from class: ooc
            @Override // defpackage.mnb
            public final void a(boolean z, int i, String str3, String str4) {
                voc.this.g(a, e, z, i, str3, str4);
            }
        });
        a.J0(str, str2, null);
        return e;
    }

    final /* synthetic */ j64 e(Object obj) {
        wlb a = this.c.a(zzq.H0(), null, null);
        final tgb e = tgb.e(a);
        h(a);
        a.zzN().x0(new nnb() { // from class: poc
            @Override // defpackage.nnb
            public final void zza() {
                tgb.this.f();
            }
        });
        a.loadUrl((String) pla.c().a(mpa.E3));
        return e;
    }

    final /* synthetic */ void f(wlb wlbVar, tgb tgbVar, boolean z, int i, String str, String str2) {
        if (!((Boolean) pla.c().a(mpa.P3)).booleanValue()) {
            i(wlbVar, tgbVar);
            return;
        }
        if (z) {
            i(wlbVar, tgbVar);
            return;
        }
        tgbVar.d(new zzeml(1, "Native Video WebView failed to load. Error code: " + i + ", Description: " + str + ", Failing URL: " + str2));
    }

    final /* synthetic */ void g(wlb wlbVar, tgb tgbVar, boolean z, int i, String str, String str2) {
        if (z) {
            if (this.a.a != null && wlbVar.zzq() != null) {
                wlbVar.zzq().A6(this.a.a);
            }
            tgbVar.f();
            return;
        }
        tgbVar.d(new zzeml(1, "Html video Web View failed to load. Error code: " + i + ", Description: " + str + ", Failing URL: " + str2));
    }
}
