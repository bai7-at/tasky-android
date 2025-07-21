package defpackage;

/* loaded from: classes3.dex */
final class laa implements Runnable {
    private final zaa a;
    private final dba b;
    private final Runnable c;

    public laa(zaa zaaVar, dba dbaVar, Runnable runnable) {
        this.a = zaaVar;
        this.b = dbaVar;
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.y();
        dba dbaVar = this.b;
        if (dbaVar.c()) {
            this.a.p(dbaVar.a);
        } else {
            this.a.o(dbaVar.c);
        }
        if (this.b.d) {
            this.a.n("intermediate-response");
        } else {
            this.a.q("done");
        }
        Runnable runnable = this.c;
        if (runnable != null) {
            runnable.run();
        }
    }
}
