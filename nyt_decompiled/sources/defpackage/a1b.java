package defpackage;

import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes3.dex */
final class a1b implements Runnable {
    final /* synthetic */ q1b a;
    final /* synthetic */ h0b b;
    final /* synthetic */ ArrayList c;
    final /* synthetic */ long d;
    final /* synthetic */ r1b e;

    a1b(r1b r1bVar, q1b q1bVar, h0b h0bVar, ArrayList arrayList, long j) {
        this.a = q1bVar;
        this.b = h0bVar;
        this.c = arrayList;
        this.d = j;
        this.e = r1bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        int i;
        String str;
        pzc.k("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Trying to acquire lock");
        obj = this.e.a;
        synchronized (obj) {
            try {
                pzc.k("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock acquired");
                if (this.a.a() != -1 && this.a.a() != 1) {
                    this.a.c();
                    kke kkeVar = pgb.e;
                    final h0b h0bVar = this.b;
                    Objects.requireNonNull(h0bVar);
                    kkeVar.execute(new Runnable() { // from class: z0b
                        @Override // java.lang.Runnable
                        public final void run() {
                            h0b.this.zzc();
                        }
                    });
                    String valueOf = String.valueOf(pla.c().a(mpa.d));
                    int a = this.a.a();
                    i = this.e.i;
                    if (this.c.isEmpty()) {
                        str = ". Still waiting for the engine to be loaded";
                    } else {
                        str = ". While waiting for the /jsLoaded gmsg, observed the loadNewJavascriptEngine latency is " + String.valueOf(this.c.get(0));
                    }
                    pzc.k("Could not finish the full JS engine loading in " + valueOf + " ms. JS engine session reference status(fullLoadTimeout) is " + a + ". Update status(fullLoadTimeout) is " + i + str + " ms. Total latency(fullLoadTimeout) is " + (dyf.b().currentTimeMillis() - this.d) + " ms at timeout. Rejecting.");
                    pzc.k("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released");
                    return;
                }
                pzc.k("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released, the promise is already settled");
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
