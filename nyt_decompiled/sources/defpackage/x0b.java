package defpackage;

import java.util.Map;

/* loaded from: classes3.dex */
final class x0b implements uxa {
    final /* synthetic */ long a;
    final /* synthetic */ q1b b;
    final /* synthetic */ h0b c;
    final /* synthetic */ r1b d;

    x0b(r1b r1bVar, long j, q1b q1bVar, h0b h0bVar) {
        this.a = j;
        this.b = q1bVar;
        this.c = h0bVar;
        this.d = r1bVar;
    }

    @Override // defpackage.uxa
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        Object obj2;
        pzc.k("onGmsg /jsLoaded. JsLoaded latency is " + (dyf.b().currentTimeMillis() - this.a) + " ms.");
        pzc.k("loadJavascriptEngine > /jsLoaded handler: Trying to acquire lock");
        obj2 = this.d.a;
        synchronized (obj2) {
            pzc.k("loadJavascriptEngine > /jsLoaded handler: Lock acquired");
            if (this.b.a() != -1 && this.b.a() != 1) {
                this.d.i = 0;
                h0b h0bVar = this.c;
                h0bVar.E0("/log", txa.g);
                h0bVar.E0("/result", txa.o);
                this.b.d(this.c);
                this.d.h = this.b;
                pzc.k("Successfully loaded JS Engine.");
                pzc.k("loadJavascriptEngine > /jsLoaded handler: Lock released");
                return;
            }
            pzc.k("loadJavascriptEngine > /jsLoaded handler: Lock released, the promise is already settled");
        }
    }
}
