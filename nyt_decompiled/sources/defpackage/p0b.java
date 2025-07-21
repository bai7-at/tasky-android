package defpackage;

import android.content.Context;
import android.view.View;
import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.util.Mimetypes;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.internal.ads.zzcei;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class p0b implements h0b, f0b {
    private final wlb a;

    /* JADX WARN: Multi-variable type inference failed */
    public p0b(Context context, zzcei zzceiVar, gfa gfaVar, iq9 iq9Var) {
        dyf.B();
        wlb a = imb.a(context, unb.a(), "", false, false, null, null, zzceiVar, null, null, null, ina.a(), null, null, null, null);
        this.a = a;
        ((View) a).setWillNotDraw(true);
    }

    private static final void Q(Runnable runnable) {
        kia.b();
        if (tfb.w()) {
            pzc.k("runOnUiThread > the UI thread is the main thread, the runnable will be run now");
            runnable.run();
        } else {
            pzc.k("runOnUiThread > the UI thread is not the main thread, the runnable will be added to the message queue");
            if (wxf.l.post(runnable)) {
                return;
            }
            fgb.g("runOnUiThread > the runnable could not be placed to the message queue");
        }
    }

    @Override // defpackage.s1b
    public final void E0(String str, uxa uxaVar) {
        this.a.e0(str, new o0b(this, uxaVar));
    }

    @Override // defpackage.h0b
    public final void K(final String str) {
        pzc.k("loadHtmlWrapper on adWebView from path: ".concat(String.valueOf(str)));
        Q(new Runnable() { // from class: j0b
            @Override // java.lang.Runnable
            public final void run() {
                p0b.this.N(str);
            }
        });
    }

    @Override // defpackage.q0b
    public final /* synthetic */ void M0(String str, JSONObject jSONObject) {
        e0b.d(this, str, jSONObject);
    }

    final /* synthetic */ void N(String str) {
        this.a.loadUrl(str);
    }

    final /* synthetic */ void O(String str) {
        this.a.loadData(str, Mimetypes.MIMETYPE_HTML, Constants.DEFAULT_ENCODING);
    }

    @Override // defpackage.q0b
    public final void a(final String str) {
        pzc.k("invokeJavascript on adWebView from js");
        Q(new Runnable() { // from class: l0b
            @Override // java.lang.Runnable
            public final void run() {
                p0b.this.s(str);
            }
        });
    }

    @Override // defpackage.h0b
    public final void c0(final v0b v0bVar) {
        onb zzN = this.a.zzN();
        Objects.requireNonNull(v0bVar);
        zzN.x0(new nnb() { // from class: k0b
            @Override // defpackage.nnb
            public final void zza() {
                long currentTimeMillis = dyf.b().currentTimeMillis();
                v0b v0bVar2 = v0b.this;
                final long j = v0bVar2.c;
                final ArrayList arrayList = v0bVar2.b;
                arrayList.add(Long.valueOf(currentTimeMillis - j));
                pzc.k("LoadNewJavascriptEngine(onEngLoaded) latency is " + String.valueOf(arrayList.get(0)) + " ms.");
                cde cdeVar = wxf.l;
                final r1b r1bVar = v0bVar2.a;
                final q1b q1bVar = v0bVar2.d;
                final h0b h0bVar = v0bVar2.e;
                cdeVar.postDelayed(new Runnable() { // from class: r0b
                    @Override // java.lang.Runnable
                    public final void run() {
                        r1b.this.i(q1bVar, h0bVar, arrayList, j);
                    }
                }, ((Integer) pla.c().a(mpa.c)).intValue());
            }
        });
    }

    @Override // defpackage.d0b
    public final /* synthetic */ void k(String str, JSONObject jSONObject) {
        e0b.b(this, str, jSONObject);
    }

    @Override // defpackage.h0b
    public final void n(final String str) {
        pzc.k("loadHtml on adWebView from html");
        Q(new Runnable() { // from class: m0b
            @Override // java.lang.Runnable
            public final void run() {
                p0b.this.v(str);
            }
        });
    }

    final /* synthetic */ void s(String str) {
        this.a.a(str);
    }

    @Override // defpackage.d0b
    public final /* synthetic */ void t(String str, Map map) {
        e0b.a(this, str, map);
    }

    final /* synthetic */ void v(String str) {
        this.a.loadData(str, Mimetypes.MIMETYPE_HTML, Constants.DEFAULT_ENCODING);
    }

    @Override // defpackage.s1b
    public final void z0(String str, final uxa uxaVar) {
        this.a.v0(str, new Predicate() { // from class: i0b
            @Override // com.google.android.gms.common.util.Predicate
            public final boolean apply(Object obj) {
                uxa uxaVar2;
                uxa uxaVar3 = (uxa) obj;
                if (!(uxaVar3 instanceof o0b)) {
                    return false;
                }
                uxa uxaVar4 = uxa.this;
                uxaVar2 = ((o0b) uxaVar3).a;
                return uxaVar2.equals(uxaVar4);
            }
        });
    }

    @Override // defpackage.q0b
    public final /* synthetic */ void zzb(String str, String str2) {
        e0b.c(this, str, str2);
    }

    @Override // defpackage.h0b
    public final void zzc() {
        this.a.destroy();
    }

    @Override // defpackage.h0b
    public final void zzh(String str) {
        pzc.k("loadJavascript on adWebView from path: ".concat(String.valueOf(str)));
        final String format = String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", str);
        Q(new Runnable() { // from class: n0b
            @Override // java.lang.Runnable
            public final void run() {
                p0b.this.O(format);
            }
        });
    }

    @Override // defpackage.h0b
    public final boolean zzi() {
        return this.a.y();
    }

    @Override // defpackage.h0b
    public final t1b zzj() {
        return new t1b(this);
    }
}
