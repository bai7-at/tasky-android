package kotlinx.coroutines;

import defpackage.ak7;
import defpackage.by0;
import defpackage.gt2;
import defpackage.ss2;
import defpackage.ww8;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.selects.SelectClause0;

/* loaded from: classes5.dex */
public interface Job extends CoroutineContext.a {
    public static final Key Key = Key.$$INSTANCE;

    public static final class DefaultImpls {
        public static /* synthetic */ void cancel$default(Job job, CancellationException cancellationException, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i & 1) != 0) {
                cancellationException = null;
            }
            job.cancel(cancellationException);
        }

        public static <R> R fold(Job job, R r, gt2 gt2Var) {
            return (R) CoroutineContext.a.C0497a.a(job, r, gt2Var);
        }

        public static <E extends CoroutineContext.a> E get(Job job, CoroutineContext.b bVar) {
            return (E) CoroutineContext.a.C0497a.b(job, bVar);
        }

        @ExperimentalCoroutinesApi
        public static /* synthetic */ void getParent$annotations() {
        }

        public static /* synthetic */ DisposableHandle invokeOnCompletion$default(Job job, boolean z, boolean z2, ss2 ss2Var, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            if ((i & 2) != 0) {
                z2 = true;
            }
            return job.invokeOnCompletion(z, z2, ss2Var);
        }

        public static CoroutineContext minusKey(Job job, CoroutineContext.b bVar) {
            return CoroutineContext.a.C0497a.c(job, bVar);
        }

        public static Job plus(Job job, Job job2) {
            return job2;
        }

        public static /* synthetic */ boolean cancel$default(Job job, Throwable th, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i & 1) != 0) {
                th = null;
            }
            return job.cancel(th);
        }

        public static CoroutineContext plus(Job job, CoroutineContext coroutineContext) {
            return CoroutineContext.a.C0497a.d(job, coroutineContext);
        }
    }

    public static final class Key implements CoroutineContext.b {
        static final /* synthetic */ Key $$INSTANCE = new Key();

        private Key() {
        }
    }

    @InternalCoroutinesApi
    ChildHandle attachChild(ChildJob childJob);

    /* synthetic */ void cancel();

    void cancel(CancellationException cancellationException);

    /* synthetic */ boolean cancel(Throwable th);

    @Override // kotlin.coroutines.CoroutineContext
    /* synthetic */ Object fold(Object obj, gt2 gt2Var);

    @Override // kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    /* synthetic */ CoroutineContext.a get(CoroutineContext.b bVar);

    @InternalCoroutinesApi
    CancellationException getCancellationException();

    ak7 getChildren();

    @Override // kotlin.coroutines.CoroutineContext.a
    /* synthetic */ CoroutineContext.b getKey();

    SelectClause0 getOnJoin();

    Job getParent();

    DisposableHandle invokeOnCompletion(ss2 ss2Var);

    @InternalCoroutinesApi
    DisposableHandle invokeOnCompletion(boolean z, boolean z2, ss2 ss2Var);

    boolean isActive();

    boolean isCancelled();

    boolean isCompleted();

    Object join(by0<? super ww8> by0Var);

    @Override // kotlin.coroutines.CoroutineContext
    /* synthetic */ CoroutineContext minusKey(CoroutineContext.b bVar);

    @Override // kotlin.coroutines.CoroutineContext
    /* synthetic */ CoroutineContext plus(CoroutineContext coroutineContext);

    Job plus(Job job);

    boolean start();
}
