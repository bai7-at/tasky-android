package defpackage;

import java.util.Map;

/* loaded from: classes3.dex */
final class y0b implements uxa {
    final /* synthetic */ h0b a;
    final /* synthetic */ udb b;
    final /* synthetic */ r1b c;

    y0b(r1b r1bVar, gfa gfaVar, h0b h0bVar, udb udbVar) {
        this.a = h0bVar;
        this.b = udbVar;
        this.c = r1bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, uxa] */
    @Override // defpackage.uxa
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        Object obj2;
        int i;
        pzc.k("loadJavascriptEngine > /requestReload handler: Trying to acquire lock");
        obj2 = this.c.a;
        synchronized (obj2) {
            try {
                pzc.k("loadJavascriptEngine > /requestReload handler: Lock acquired");
                fgb.f("JS Engine is requesting an update");
                i = this.c.i;
                if (i == 0) {
                    fgb.f("Starting reload.");
                    this.c.i = 2;
                    this.c.d(null);
                }
                this.a.z0("/requestReload", this.b.a());
            } catch (Throwable th) {
                throw th;
            }
        }
        pzc.k("loadJavascriptEngine > /requestReload handler: Lock released");
    }
}
