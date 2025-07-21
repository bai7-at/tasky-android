package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class sxf implements Executor {
    sxf() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
