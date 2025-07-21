package kotlinx.coroutines.test;

import defpackage.gt2;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes5.dex */
public final class BackgroundWork implements CoroutineContext.b, CoroutineContext.a {
    public static final BackgroundWork INSTANCE = new BackgroundWork();

    private BackgroundWork() {
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R fold(R r, gt2 gt2Var) {
        return (R) CoroutineContext.a.C0497a.a(this, r, gt2Var);
    }

    @Override // kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.a> E get(CoroutineContext.b bVar) {
        return (E) CoroutineContext.a.C0497a.b(this, bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.a
    public CoroutineContext.b getKey() {
        return this;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.b bVar) {
        return CoroutineContext.a.C0497a.c(this, bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return CoroutineContext.a.C0497a.d(this, coroutineContext);
    }

    public String toString() {
        return "BackgroundWork";
    }
}
