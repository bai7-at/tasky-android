package kotlinx.coroutines;

import defpackage.gt2;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.Deferred;

/* loaded from: classes5.dex */
public interface CompletableDeferred<T> extends Deferred<T> {

    public static final class DefaultImpls {
        public static <T, R> R fold(CompletableDeferred<T> completableDeferred, R r, gt2 gt2Var) {
            return (R) Deferred.DefaultImpls.fold(completableDeferred, r, gt2Var);
        }

        public static <T, E extends CoroutineContext.a> E get(CompletableDeferred<T> completableDeferred, CoroutineContext.b bVar) {
            return (E) Deferred.DefaultImpls.get(completableDeferred, bVar);
        }

        public static <T> CoroutineContext minusKey(CompletableDeferred<T> completableDeferred, CoroutineContext.b bVar) {
            return Deferred.DefaultImpls.minusKey(completableDeferred, bVar);
        }

        public static <T> CoroutineContext plus(CompletableDeferred<T> completableDeferred, CoroutineContext coroutineContext) {
            return Deferred.DefaultImpls.plus(completableDeferred, coroutineContext);
        }

        public static <T> Job plus(CompletableDeferred<T> completableDeferred, Job job) {
            return Deferred.DefaultImpls.plus((Deferred) completableDeferred, job);
        }
    }

    boolean complete(T t);

    boolean completeExceptionally(Throwable th);

    @Override // kotlinx.coroutines.Deferred, kotlinx.coroutines.Job, kotlin.coroutines.CoroutineContext
    /* synthetic */ Object fold(Object obj, gt2 gt2Var);

    @Override // kotlinx.coroutines.Deferred, kotlinx.coroutines.Job, kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    /* synthetic */ CoroutineContext.a get(CoroutineContext.b bVar);

    @Override // kotlinx.coroutines.Deferred, kotlinx.coroutines.Job, kotlin.coroutines.CoroutineContext.a
    /* synthetic */ CoroutineContext.b getKey();

    @Override // kotlinx.coroutines.Deferred, kotlinx.coroutines.Job, kotlin.coroutines.CoroutineContext
    /* synthetic */ CoroutineContext minusKey(CoroutineContext.b bVar);

    @Override // kotlinx.coroutines.Deferred, kotlinx.coroutines.Job, kotlin.coroutines.CoroutineContext
    /* synthetic */ CoroutineContext plus(CoroutineContext coroutineContext);
}
