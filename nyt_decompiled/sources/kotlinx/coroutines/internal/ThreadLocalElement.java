package kotlinx.coroutines.internal;

import defpackage.gt2;
import defpackage.zq3;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.ThreadContextElement;

/* loaded from: classes5.dex */
public final class ThreadLocalElement<T> implements ThreadContextElement<T> {
    private final CoroutineContext.b key;
    private final ThreadLocal<T> threadLocal;
    private final T value;

    public ThreadLocalElement(T t, ThreadLocal<T> threadLocal) {
        this.value = t;
        this.threadLocal = threadLocal;
        this.key = new ThreadLocalKey(threadLocal);
    }

    @Override // kotlinx.coroutines.ThreadContextElement, kotlin.coroutines.CoroutineContext
    public <R> R fold(R r, gt2 gt2Var) {
        return (R) ThreadContextElement.DefaultImpls.fold(this, r, gt2Var);
    }

    @Override // kotlinx.coroutines.ThreadContextElement, kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.a> E get(CoroutineContext.b bVar) {
        if (!zq3.c(getKey(), bVar)) {
            return null;
        }
        zq3.f(this, "null cannot be cast to non-null type E of kotlinx.coroutines.internal.ThreadLocalElement.get");
        return this;
    }

    @Override // kotlinx.coroutines.ThreadContextElement, kotlin.coroutines.CoroutineContext.a
    public CoroutineContext.b getKey() {
        return this.key;
    }

    @Override // kotlinx.coroutines.ThreadContextElement, kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.b bVar) {
        return zq3.c(getKey(), bVar) ? EmptyCoroutineContext.a : this;
    }

    @Override // kotlinx.coroutines.ThreadContextElement, kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return ThreadContextElement.DefaultImpls.plus(this, coroutineContext);
    }

    @Override // kotlinx.coroutines.ThreadContextElement
    public void restoreThreadContext(CoroutineContext coroutineContext, T t) {
        this.threadLocal.set(t);
    }

    public String toString() {
        return "ThreadLocal(value=" + this.value + ", threadLocal = " + this.threadLocal + ')';
    }

    @Override // kotlinx.coroutines.ThreadContextElement
    public T updateThreadContext(CoroutineContext coroutineContext) {
        T t = this.threadLocal.get();
        this.threadLocal.set(this.value);
        return t;
    }
}
