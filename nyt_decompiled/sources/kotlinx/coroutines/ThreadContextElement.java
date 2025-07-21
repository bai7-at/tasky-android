package kotlinx.coroutines;

import defpackage.gt2;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes5.dex */
public interface ThreadContextElement<S> extends CoroutineContext.a {

    public static final class DefaultImpls {
        public static <S, R> R fold(ThreadContextElement<S> threadContextElement, R r, gt2 gt2Var) {
            return (R) CoroutineContext.a.C0497a.a(threadContextElement, r, gt2Var);
        }

        public static <S, E extends CoroutineContext.a> E get(ThreadContextElement<S> threadContextElement, CoroutineContext.b bVar) {
            return (E) CoroutineContext.a.C0497a.b(threadContextElement, bVar);
        }

        public static <S> CoroutineContext minusKey(ThreadContextElement<S> threadContextElement, CoroutineContext.b bVar) {
            return CoroutineContext.a.C0497a.c(threadContextElement, bVar);
        }

        public static <S> CoroutineContext plus(ThreadContextElement<S> threadContextElement, CoroutineContext coroutineContext) {
            return CoroutineContext.a.C0497a.d(threadContextElement, coroutineContext);
        }
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* synthetic */ Object fold(Object obj, gt2 gt2Var);

    @Override // kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    /* synthetic */ CoroutineContext.a get(CoroutineContext.b bVar);

    @Override // kotlin.coroutines.CoroutineContext.a
    /* synthetic */ CoroutineContext.b getKey();

    @Override // kotlin.coroutines.CoroutineContext
    /* synthetic */ CoroutineContext minusKey(CoroutineContext.b bVar);

    @Override // kotlin.coroutines.CoroutineContext
    /* synthetic */ CoroutineContext plus(CoroutineContext coroutineContext);

    void restoreThreadContext(CoroutineContext coroutineContext, S s);

    S updateThreadContext(CoroutineContext coroutineContext);
}
