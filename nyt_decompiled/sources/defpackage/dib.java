package defpackage;

/* loaded from: classes3.dex */
final class dib implements Runnable {
    final /* synthetic */ fib a;

    dib(fib fibVar) {
        this.a = fibVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.l("surfaceDestroyed", new String[0]);
    }
}
