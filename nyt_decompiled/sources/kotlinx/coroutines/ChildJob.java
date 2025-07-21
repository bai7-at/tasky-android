package kotlinx.coroutines;

import defpackage.gt2;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.Job;

@InternalCoroutinesApi
/* loaded from: classes5.dex */
public interface ChildJob extends Job {

    public static final class DefaultImpls {
        public static <R> R fold(ChildJob childJob, R r, gt2 gt2Var) {
            return (R) Job.DefaultImpls.fold(childJob, r, gt2Var);
        }

        public static <E extends CoroutineContext.a> E get(ChildJob childJob, CoroutineContext.b bVar) {
            return (E) Job.DefaultImpls.get(childJob, bVar);
        }

        public static CoroutineContext minusKey(ChildJob childJob, CoroutineContext.b bVar) {
            return Job.DefaultImpls.minusKey(childJob, bVar);
        }

        public static CoroutineContext plus(ChildJob childJob, CoroutineContext coroutineContext) {
            return Job.DefaultImpls.plus(childJob, coroutineContext);
        }

        public static Job plus(ChildJob childJob, Job job) {
            return Job.DefaultImpls.plus((Job) childJob, job);
        }
    }

    @Override // kotlinx.coroutines.Job, kotlin.coroutines.CoroutineContext
    /* synthetic */ Object fold(Object obj, gt2 gt2Var);

    @Override // kotlinx.coroutines.Job, kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    /* synthetic */ CoroutineContext.a get(CoroutineContext.b bVar);

    @Override // kotlinx.coroutines.Job, kotlin.coroutines.CoroutineContext.a
    /* synthetic */ CoroutineContext.b getKey();

    @Override // kotlinx.coroutines.Job, kotlin.coroutines.CoroutineContext
    /* synthetic */ CoroutineContext minusKey(CoroutineContext.b bVar);

    @InternalCoroutinesApi
    void parentCancelled(ParentJob parentJob);

    @Override // kotlinx.coroutines.Job, kotlin.coroutines.CoroutineContext
    /* synthetic */ CoroutineContext plus(CoroutineContext coroutineContext);
}
