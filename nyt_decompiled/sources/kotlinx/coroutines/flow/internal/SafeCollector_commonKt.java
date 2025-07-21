package kotlinx.coroutines.flow.internal;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.gt2;
import defpackage.zq3;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.internal.ScopeCoroutine;

/* loaded from: classes5.dex */
public final class SafeCollector_commonKt {
    public static final void checkContext(final SafeCollector<?> safeCollector, CoroutineContext coroutineContext) {
        if (((Number) coroutineContext.fold(0, new gt2() { // from class: kotlinx.coroutines.flow.internal.SafeCollector_commonKt$checkContext$result$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Number) obj).intValue(), (CoroutineContext.a) obj2);
            }

            public final Integer invoke(int i, CoroutineContext.a aVar) {
                CoroutineContext.b key = aVar.getKey();
                CoroutineContext.a aVar2 = safeCollector.collectContext.get(key);
                if (key != Job.Key) {
                    return Integer.valueOf(aVar != aVar2 ? RecyclerView.UNDEFINED_DURATION : i + 1);
                }
                Job job = (Job) aVar2;
                zq3.f(aVar, "null cannot be cast to non-null type kotlinx.coroutines.Job");
                Job transitiveCoroutineParent = SafeCollector_commonKt.transitiveCoroutineParent((Job) aVar, job);
                if (transitiveCoroutineParent == job) {
                    if (job != null) {
                        i++;
                    }
                    return Integer.valueOf(i);
                }
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + transitiveCoroutineParent + ", expected child of " + job + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
            }
        })).intValue() == safeCollector.collectContextSize) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + safeCollector.collectContext + ",\n\t\tbut emission happened in " + coroutineContext + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    public static final Job transitiveCoroutineParent(Job job, Job job2) {
        while (job != null) {
            if (job == job2 || !(job instanceof ScopeCoroutine)) {
                return job;
            }
            job = job.getParent();
        }
        return null;
    }

    public static final <T> Flow<T> unsafeFlow(gt2 gt2Var) {
        return new SafeCollector_commonKt$unsafeFlow$1(gt2Var);
    }
}
