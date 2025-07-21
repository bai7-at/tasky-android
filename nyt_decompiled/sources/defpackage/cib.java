package defpackage;

/* loaded from: classes3.dex */
final class cib implements Runnable {
    final /* synthetic */ fib a;

    cib(fib fibVar) {
        this.a = fibVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.l("surfaceCreated", new String[0]);
    }
}
