package defpackage;

/* loaded from: classes3.dex */
final class eib implements Runnable {
    final /* synthetic */ boolean a;
    final /* synthetic */ fib b;

    eib(fib fibVar, boolean z) {
        this.a = z;
        this.b = fibVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.l("windowVisibilityChanged", "isVisible", String.valueOf(this.a));
    }
}
