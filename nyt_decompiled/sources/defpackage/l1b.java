package defpackage;

/* loaded from: classes3.dex */
public final class l1b extends hhb {
    private final Object c = new Object();
    private final q1b d;
    private boolean e;

    public l1b(q1b q1bVar) {
        this.d = q1bVar;
    }

    public final void g() {
        pzc.k("release: Trying to acquire lock");
        synchronized (this.c) {
            try {
                pzc.k("release: Lock acquired");
                if (this.e) {
                    pzc.k("release: Lock already released");
                    return;
                }
                this.e = true;
                e(new i1b(this), new xgb());
                e(new j1b(this), new k1b(this));
                pzc.k("release: Lock released");
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
