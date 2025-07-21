package defpackage;

/* loaded from: classes2.dex */
final class lq9 implements Runnable {
    final /* synthetic */ ila a;

    lq9(ila ilaVar) {
        this.a = ilaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.b = Thread.currentThread();
        this.a.a();
    }
}
