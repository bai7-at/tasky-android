package defpackage;

/* loaded from: classes3.dex */
final class c1b implements wgb {
    final /* synthetic */ q1b a;
    final /* synthetic */ f7e b;
    final /* synthetic */ r1b c;

    c1b(r1b r1bVar, q1b q1bVar, f7e f7eVar) {
        this.a = q1bVar;
        this.b = f7eVar;
        this.c = r1bVar;
    }

    @Override // defpackage.wgb
    public final void zza() {
        Object obj;
        v7e v7eVar;
        v7e v7eVar2;
        pzc.k("loadNewJavascriptEngine (failure): Trying to acquire lock");
        obj = this.c.a;
        synchronized (obj) {
            try {
                pzc.k("loadNewJavascriptEngine (failure): Lock acquired");
                this.c.i = 1;
                pzc.k("Failed loading new engine. Marking new engine destroyable.");
                this.a.g();
                if (((Boolean) jra.d.e()).booleanValue()) {
                    r1b r1bVar = this.c;
                    v7eVar = r1bVar.e;
                    if (v7eVar != null) {
                        v7eVar2 = r1bVar.e;
                        f7e f7eVar = this.b;
                        f7eVar.s("Failed loading new engine");
                        f7eVar.S(false);
                        v7eVar2.b(f7eVar.zzl());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        pzc.k("loadNewJavascriptEngine (failure): Lock released");
    }
}
