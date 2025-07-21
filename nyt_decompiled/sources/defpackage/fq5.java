package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes.dex */
public final class fq5 extends CoroutineDispatcher {
    public final es1 a = new es1();

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: dispatch */
    public void mo937dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        zq3.h(coroutineContext, "context");
        zq3.h(runnable, "block");
        this.a.c(coroutineContext, runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public boolean isDispatchNeeded(CoroutineContext coroutineContext) {
        zq3.h(coroutineContext, "context");
        if (Dispatchers.getMain().getImmediate().isDispatchNeeded(coroutineContext)) {
            return true;
        }
        return !this.a.b();
    }
}
