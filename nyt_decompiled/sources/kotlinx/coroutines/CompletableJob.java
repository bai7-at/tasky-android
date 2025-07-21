package kotlinx.coroutines;

import defpackage.gt2;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.Job;

/* loaded from: classes5.dex */
public interface CompletableJob extends Job {

    public static final class DefaultImpls {
        public static <R> R fold(CompletableJob completableJob, R r, gt2 gt2Var) {
            return (R) Job.DefaultImpls.fold(completableJob, r, gt2Var);
        }

        public static <E extends CoroutineContext.a> E get(CompletableJob completableJob, CoroutineContext.b bVar) {
            return (E) Job.DefaultImpls.get(completableJob, bVar);
        }

        public static CoroutineContext minusKey(CompletableJob completableJob, CoroutineContext.b bVar) {
            return Job.DefaultImpls.minusKey(completableJob, bVar);
        }

        public static CoroutineContext plus(CompletableJob completableJob, CoroutineContext coroutineContext) {
            return Job.DefaultImpls.plus(completableJob, coroutineContext);
        }

        public static Job plus(CompletableJob completableJob, Job job) {
            return Job.DefaultImpls.plus((Job) completableJob, job);
        }
    }

    boolean complete();

    boolean completeExceptionally(Throwable th);

    @Override // kotlinx.coroutines.Job, kotlin.coroutines.CoroutineContext
    /* synthetic */ Object fold(Object obj, gt2 gt2Var);

    @Override // kotlinx.coroutines.Job, kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    /* synthetic */ CoroutineContext.a get(CoroutineContext.b bVar);

    @Override // kotlinx.coroutines.Job, kotlin.coroutines.CoroutineContext.a
    /* synthetic */ CoroutineContext.b getKey();

    @Override // kotlinx.coroutines.Job, kotlin.coroutines.CoroutineContext
    /* synthetic */ CoroutineContext minusKey(CoroutineContext.b bVar);

    @Override // kotlinx.coroutines.Job, kotlin.coroutines.CoroutineContext
    /* synthetic */ CoroutineContext plus(CoroutineContext coroutineContext);
}
