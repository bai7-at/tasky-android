package androidx.work;

import android.content.Context;
import defpackage.by0;
import defpackage.j64;
import defpackage.zq3;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;

/* loaded from: classes.dex */
public abstract class CoroutineWorker extends b {
    private final WorkerParameters e;
    private final CoroutineDispatcher f;

    private static final class a extends CoroutineDispatcher {
        public static final a a = new a();
        private static final CoroutineDispatcher b = Dispatchers.getDefault();

        private a() {
        }

        @Override // kotlinx.coroutines.CoroutineDispatcher
        /* renamed from: dispatch */
        public void mo937dispatch(CoroutineContext coroutineContext, Runnable runnable) {
            zq3.h(coroutineContext, "context");
            zq3.h(runnable, "block");
            b.mo937dispatch(coroutineContext, runnable);
        }

        @Override // kotlinx.coroutines.CoroutineDispatcher
        public boolean isDispatchNeeded(CoroutineContext coroutineContext) {
            zq3.h(coroutineContext, "context");
            return b.isDispatchNeeded(coroutineContext);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        zq3.h(context, "appContext");
        zq3.h(workerParameters, "params");
        this.e = workerParameters;
        this.f = a.a;
    }

    static /* synthetic */ Object e(CoroutineWorker coroutineWorker, by0 by0Var) {
        throw new IllegalStateException("Not implemented");
    }

    public abstract Object b(by0 by0Var);

    public CoroutineDispatcher c() {
        return this.f;
    }

    public Object d(by0 by0Var) {
        return e(this, by0Var);
    }

    @Override // androidx.work.b
    public final j64 getForegroundInfoAsync() {
        CompletableJob Job$default;
        CoroutineDispatcher c = c();
        Job$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        return ListenableFutureKt.k(c.plus(Job$default), null, new CoroutineWorker$getForegroundInfoAsync$1(this, null), 2, null);
    }

    @Override // androidx.work.b
    public final void onStopped() {
        super.onStopped();
    }

    @Override // androidx.work.b
    public final j64 startWork() {
        CompletableJob Job$default;
        CoroutineContext c = !zq3.c(c(), a.a) ? c() : this.e.l();
        zq3.g(c, "if (coroutineContext != …rkerContext\n            }");
        Job$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        return ListenableFutureKt.k(c.plus(Job$default), null, new CoroutineWorker$startWork$1(this, null), 2, null);
    }
}
