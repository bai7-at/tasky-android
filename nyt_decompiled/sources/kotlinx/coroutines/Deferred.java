package kotlinx.coroutines;

import defpackage.by0;
import defpackage.gt2;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.selects.SelectClause1;

/* loaded from: classes5.dex */
public interface Deferred<T> extends Job {

    public static final class DefaultImpls {
        public static <T, R> R fold(Deferred<? extends T> deferred, R r, gt2 gt2Var) {
            return (R) Job.DefaultImpls.fold(deferred, r, gt2Var);
        }

        public static <T, E extends CoroutineContext.a> E get(Deferred<? extends T> deferred, CoroutineContext.b bVar) {
            return (E) Job.DefaultImpls.get(deferred, bVar);
        }

        public static <T> CoroutineContext minusKey(Deferred<? extends T> deferred, CoroutineContext.b bVar) {
            return Job.DefaultImpls.minusKey(deferred, bVar);
        }

        public static <T> CoroutineContext plus(Deferred<? extends T> deferred, CoroutineContext coroutineContext) {
            return Job.DefaultImpls.plus(deferred, coroutineContext);
        }

        public static <T> Job plus(Deferred<? extends T> deferred, Job job) {
            return Job.DefaultImpls.plus((Job) deferred, job);
        }
    }

    Object await(by0<? super T> by0Var);

    @Override // kotlinx.coroutines.Job, kotlin.coroutines.CoroutineContext
    /* synthetic */ Object fold(Object obj, gt2 gt2Var);

    @Override // kotlinx.coroutines.Job, kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    /* synthetic */ CoroutineContext.a get(CoroutineContext.b bVar);

    @ExperimentalCoroutinesApi
    T getCompleted();

    @ExperimentalCoroutinesApi
    Throwable getCompletionExceptionOrNull();

    @Override // kotlinx.coroutines.Job, kotlin.coroutines.CoroutineContext.a
    /* synthetic */ CoroutineContext.b getKey();

    SelectClause1<T> getOnAwait();

    @Override // kotlinx.coroutines.Job, kotlin.coroutines.CoroutineContext
    /* synthetic */ CoroutineContext minusKey(CoroutineContext.b bVar);

    @Override // kotlinx.coroutines.Job, kotlin.coroutines.CoroutineContext
    /* synthetic */ CoroutineContext plus(CoroutineContext coroutineContext);
}
