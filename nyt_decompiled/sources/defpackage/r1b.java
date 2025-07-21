package defpackage;

import android.content.Context;
import com.google.android.gms.internal.ads.zzcei;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class r1b {
    private final Context b;
    private final String c;
    private final zzcei d;
    private final v7e e;
    private final una f;
    private final una g;
    private q1b h;
    private final Object a = new Object();
    private int i = 1;

    public r1b(Context context, zzcei zzceiVar, String str, una unaVar, una unaVar2, v7e v7eVar) {
        this.c = str;
        this.b = context.getApplicationContext();
        this.d = zzceiVar;
        this.e = v7eVar;
        this.f = unaVar;
        this.g = unaVar2;
    }

    public final l1b b(gfa gfaVar) {
        pzc.k("getEngine: Trying to acquire lock");
        synchronized (this.a) {
            try {
                pzc.k("getEngine: Lock acquired");
                pzc.k("refreshIfDestroyed: Trying to acquire lock");
                synchronized (this.a) {
                    try {
                        pzc.k("refreshIfDestroyed: Lock acquired");
                        q1b q1bVar = this.h;
                        if (q1bVar != null && this.i == 0) {
                            q1bVar.e(new ygb() { // from class: s0b
                                @Override // defpackage.ygb
                                public final void zza(Object obj) {
                                    r1b.this.k((h0b) obj);
                                }
                            }, new wgb() { // from class: t0b
                                @Override // defpackage.wgb
                                public final void zza() {
                                }
                            });
                        }
                    } finally {
                    }
                }
                pzc.k("refreshIfDestroyed: Lock released");
                q1b q1bVar2 = this.h;
                if (q1bVar2 != null && q1bVar2.a() != -1) {
                    int i = this.i;
                    if (i == 0) {
                        pzc.k("getEngine (NO_UPDATE): Lock released");
                        return this.h.f();
                    }
                    if (i != 1) {
                        pzc.k("getEngine (UPDATING): Lock released");
                        return this.h.f();
                    }
                    this.i = 2;
                    d(null);
                    pzc.k("getEngine (PENDING_UPDATE): Lock released");
                    return this.h.f();
                }
                this.i = 2;
                this.h = d(null);
                pzc.k("getEngine (NULL or REJECTED): Lock released");
                return this.h.f();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected final q1b d(gfa gfaVar) {
        f7e a = e7e.a(this.b, 6);
        a.zzh();
        final q1b q1bVar = new q1b(this.g);
        pzc.k("loadJavascriptEngine > Before UI_THREAD_EXECUTOR");
        final gfa gfaVar2 = null;
        pgb.e.execute(new Runnable(gfaVar2, q1bVar) { // from class: w0b
            public final /* synthetic */ q1b b;

            {
                this.b = q1bVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                r1b.this.j(null, this.b);
            }
        });
        pzc.k("loadNewJavascriptEngine: Promise created");
        q1bVar.e(new b1b(this, q1bVar, a), new c1b(this, q1bVar, a));
        return q1bVar;
    }

    final /* synthetic */ void i(q1b q1bVar, final h0b h0bVar, ArrayList arrayList, long j) {
        pzc.k("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Trying to acquire lock");
        synchronized (this.a) {
            pzc.k("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock acquired");
            if (q1bVar.a() != -1 && q1bVar.a() != 1) {
                q1bVar.c();
                kke kkeVar = pgb.e;
                Objects.requireNonNull(h0bVar);
                kkeVar.execute(new Runnable() { // from class: u0b
                    @Override // java.lang.Runnable
                    public final void run() {
                        h0b.this.zzc();
                    }
                });
                pzc.k("Could not receive /jsLoaded in " + String.valueOf(pla.c().a(mpa.c)) + " ms. JS engine session reference status(onEngLoadedTimeout) is " + q1bVar.a() + ". Update status(onEngLoadedTimeout) is " + this.i + ". LoadNewJavascriptEngine(onEngLoadedTimeout) latency is " + String.valueOf(arrayList.get(0)) + " ms. Total latency(onEngLoadedTimeout) is " + (dyf.b().currentTimeMillis() - j) + " ms. Rejecting.");
                pzc.k("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released");
                return;
            }
            pzc.k("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released, the promise is already settled");
        }
    }

    final /* synthetic */ void j(gfa gfaVar, q1b q1bVar) {
        long currentTimeMillis = dyf.b().currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        try {
            pzc.k("loadJavascriptEngine > Before createJavascriptEngine");
            p0b p0bVar = new p0b(this.b, this.d, null, null);
            pzc.k("loadJavascriptEngine > After createJavascriptEngine");
            pzc.k("loadJavascriptEngine > Before setting new engine loaded listener");
            p0bVar.c0(new v0b(this, arrayList, currentTimeMillis, q1bVar, p0bVar));
            pzc.k("loadJavascriptEngine > Before registering GmsgHandler for /jsLoaded");
            p0bVar.E0("/jsLoaded", new x0b(this, currentTimeMillis, q1bVar, p0bVar));
            udb udbVar = new udb();
            y0b y0bVar = new y0b(this, null, p0bVar, udbVar);
            udbVar.b(y0bVar);
            pzc.k("loadJavascriptEngine > Before registering GmsgHandler for /requestReload");
            p0bVar.E0("/requestReload", y0bVar);
            pzc.k("loadJavascriptEngine > javascriptPath: ".concat(String.valueOf(this.c)));
            if (this.c.endsWith(".js")) {
                pzc.k("loadJavascriptEngine > Before newEngine.loadJavascript");
                p0bVar.zzh(this.c);
                pzc.k("loadJavascriptEngine > After newEngine.loadJavascript");
            } else if (this.c.startsWith("<html>")) {
                pzc.k("loadJavascriptEngine > Before newEngine.loadHtml");
                p0bVar.n(this.c);
                pzc.k("loadJavascriptEngine > After newEngine.loadHtml");
            } else {
                pzc.k("loadJavascriptEngine > Before newEngine.loadHtmlWrapper");
                p0bVar.K(this.c);
                pzc.k("loadJavascriptEngine > After newEngine.loadHtmlWrapper");
            }
            pzc.k("loadJavascriptEngine > Before calling ADMOB_UI_HANDLER.postDelayed");
            wxf.l.postDelayed(new a1b(this, q1bVar, p0bVar, arrayList, currentTimeMillis), ((Integer) pla.c().a(mpa.d)).intValue());
        } catch (Throwable th) {
            fgb.e("Error creating webview.", th);
            dyf.q().w(th, "SdkJavascriptFactory.loadJavascriptEngine");
            q1bVar.c();
        }
    }

    final /* synthetic */ void k(h0b h0bVar) {
        if (h0bVar.zzi()) {
            this.i = 1;
        }
    }
}
