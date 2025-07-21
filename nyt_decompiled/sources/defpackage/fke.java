package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public abstract class fke extends dke implements j64 {
    protected fke() {
    }

    @Override // defpackage.j64
    public final void a(Runnable runnable, Executor executor) {
        f().a(runnable, executor);
    }

    protected abstract j64 f();
}
