package defpackage;

/* loaded from: classes3.dex */
final class b1b implements ygb {
    final /* synthetic */ q1b a;
    final /* synthetic */ f7e b;
    final /* synthetic */ r1b c;

    b1b(r1b r1bVar, q1b q1bVar, f7e f7eVar) {
        this.a = q1bVar;
        this.b = f7eVar;
        this.c = r1bVar;
    }

    @Override // defpackage.ygb
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Object obj2;
        q1b q1bVar;
        v7e v7eVar;
        v7e v7eVar2;
        q1b q1bVar2;
        q1b q1bVar3;
        pzc.k("loadNewJavascriptEngine (success): Trying to acquire lock");
        obj2 = this.c.a;
        synchronized (obj2) {
            try {
                pzc.k("loadNewJavascriptEngine (success): Lock acquired");
                this.c.i = 0;
                r1b r1bVar = this.c;
                q1bVar = r1bVar.h;
                if (q1bVar != null) {
                    q1b q1bVar4 = this.a;
                    q1bVar2 = r1bVar.h;
                    if (q1bVar4 != q1bVar2) {
                        pzc.k("New JS engine is loaded, marking previous one as destroyable.");
                        q1bVar3 = this.c.h;
                        q1bVar3.g();
                    }
                }
                this.c.h = this.a;
                if (((Boolean) jra.d.e()).booleanValue()) {
                    r1b r1bVar2 = this.c;
                    v7eVar = r1bVar2.e;
                    if (v7eVar != null) {
                        v7eVar2 = r1bVar2.e;
                        f7e f7eVar = this.b;
                        f7eVar.S(true);
                        v7eVar2.b(f7eVar.zzl());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        pzc.k("loadNewJavascriptEngine (success): Lock released");
    }
}
