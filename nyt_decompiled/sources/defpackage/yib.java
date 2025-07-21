package defpackage;

/* loaded from: classes3.dex */
final class yib implements Runnable {
    private final fib a;
    private boolean b = false;

    yib(fib fibVar) {
        this.a = fibVar;
    }

    private final void c() {
        cde cdeVar = wxf.l;
        cdeVar.removeCallbacks(this);
        cdeVar.postDelayed(this, 250L);
    }

    public final void a() {
        this.b = true;
        this.a.v();
    }

    public final void b() {
        this.b = false;
        c();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b) {
            return;
        }
        this.a.v();
        c();
    }
}
