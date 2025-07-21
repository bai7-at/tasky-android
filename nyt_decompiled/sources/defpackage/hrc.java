package defpackage;

/* loaded from: classes3.dex */
abstract class hrc implements Runnable {
    final long a;
    final long b;
    final boolean c;
    final /* synthetic */ j4d d;

    hrc(j4d j4dVar, boolean z) {
        this.d = j4dVar;
        this.a = j4dVar.b.currentTimeMillis();
        this.b = j4dVar.b.elapsedRealtime();
        this.c = z;
    }

    abstract void a();

    protected void b() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        z = this.d.g;
        if (z) {
            b();
            return;
        }
        try {
            a();
        } catch (Exception e) {
            this.d.l(e, false, this.c);
            b();
        }
    }
}
