package kotlinx.coroutines;

import defpackage.gt2;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.Job;

@InternalCoroutinesApi
/* loaded from: classes5.dex */
public interface ParentJob extends Job {

    public static final class DefaultImpls {
        public static <R> R fold(ParentJob parentJob, R r, gt2 gt2Var) {
            return (R) Job.DefaultImpls.fold(parentJob, r, gt2Var);
        }

        public static <E extends CoroutineContext.a> E get(ParentJob parentJob, CoroutineContext.b bVar) {
            return (E) Job.DefaultImpls.get(parentJob, bVar);
        }

        public static CoroutineContext minusKey(ParentJob parentJob, CoroutineContext.b bVar) {
            return Job.DefaultImpls.minusKey(parentJob, bVar);
        }

        public static CoroutineContext plus(ParentJob parentJob, CoroutineContext coroutineContext) {
            return Job.DefaultImpls.plus(parentJob, coroutineContext);
        }

        public static Job plus(ParentJob parentJob, Job job) {
            return Job.DefaultImpls.plus((Job) parentJob, job);
        }
    }

    @Override // kotlinx.coroutines.Job, kotlin.coroutines.CoroutineContext
    /* synthetic */ Object fold(Object obj, gt2 gt2Var);

    @Override // kotlinx.coroutines.Job, kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    /* synthetic */ CoroutineContext.a get(CoroutineContext.b bVar);

    @InternalCoroutinesApi
    CancellationException getChildJobCancellationCause();

    @Override // kotlinx.coroutines.Job, kotlin.coroutines.CoroutineContext.a
    /* synthetic */ CoroutineContext.b getKey();

    @Override // kotlinx.coroutines.Job, kotlin.coroutines.CoroutineContext
    /* synthetic */ CoroutineContext minusKey(CoroutineContext.b bVar);

    @Override // kotlinx.coroutines.Job, kotlin.coroutines.CoroutineContext
    /* synthetic */ CoroutineContext plus(CoroutineContext coroutineContext);
}
