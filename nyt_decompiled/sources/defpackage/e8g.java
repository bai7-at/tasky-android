package defpackage;

import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
final class e8g implements Runnable {
    final /* synthetic */ w1g a;
    final /* synthetic */ Callable b;

    e8g(w1g w1gVar, Callable callable) {
        this.a = w1gVar;
        this.b = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.u(this.b.call());
        } catch (Exception e) {
            this.a.t(e);
        } catch (Throwable th) {
            this.a.t(new RuntimeException(th));
        }
    }
}
