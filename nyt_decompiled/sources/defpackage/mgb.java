package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class mgb implements Executor {
    private final Handler a = new jtd(Looper.getMainLooper());

    mgb() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            this.a.post(runnable);
            return;
        }
        try {
            runnable.run();
        } catch (Throwable th) {
            dyf.r();
            wxf.l(dyf.q().d(), th);
            throw th;
        }
    }
}
