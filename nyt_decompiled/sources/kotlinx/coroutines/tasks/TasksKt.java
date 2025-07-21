package kotlinx.coroutines.tasks;

import com.google.android.gms.tasks.RuntimeExecutionException;
import defpackage.ak7;
import defpackage.by0;
import defpackage.gt2;
import defpackage.hc1;
import defpackage.me5;
import defpackage.og8;
import defpackage.oh0;
import defpackage.qg8;
import defpackage.ss2;
import defpackage.ww8;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.a;
import kotlin.f;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.ChildHandle;
import kotlinx.coroutines.ChildJob;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.selects.SelectClause0;
import kotlinx.coroutines.selects.SelectClause1;
import kotlinx.coroutines.tasks.TasksKt;

/* loaded from: classes5.dex */
public final class TasksKt {
    public static final <T> Deferred<T> asDeferred(og8 og8Var) {
        return asDeferredImpl(og8Var, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> Deferred<T> asDeferredImpl(og8 og8Var, final oh0 oh0Var) {
        final CompletableDeferred CompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        if (og8Var.p()) {
            Exception l = og8Var.l();
            if (l != null) {
                CompletableDeferred$default.completeExceptionally(l);
            } else if (og8Var.o()) {
                Job.DefaultImpls.cancel$default((Job) CompletableDeferred$default, (CancellationException) null, 1, (Object) null);
            } else {
                CompletableDeferred$default.complete(og8Var.m());
            }
        } else {
            og8Var.c(DirectExecutor.INSTANCE, new me5() { // from class: wg8
                @Override // defpackage.me5
                public final void onComplete(og8 og8Var2) {
                    TasksKt.asDeferredImpl$lambda$0(CompletableDeferred.this, og8Var2);
                }
            });
        }
        if (oh0Var != null) {
            CompletableDeferred$default.invokeOnCompletion(new ss2() { // from class: kotlinx.coroutines.tasks.TasksKt$asDeferredImpl$2
                {
                    super(1);
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return ww8.a;
                }

                public final void invoke(Throwable th) {
                    oh0.this.a();
                }
            });
        }
        return new Deferred<T>() { // from class: kotlinx.coroutines.tasks.TasksKt$asDeferredImpl$3
            @Override // kotlinx.coroutines.Job
            @InternalCoroutinesApi
            public ChildHandle attachChild(ChildJob childJob) {
                return CompletableDeferred$default.attachChild(childJob);
            }

            @Override // kotlinx.coroutines.Deferred
            public Object await(by0<? super T> by0Var) {
                return CompletableDeferred$default.await(by0Var);
            }

            @Override // kotlinx.coroutines.Job
            public /* synthetic */ void cancel() {
                CompletableDeferred$default.cancel();
            }

            @Override // kotlinx.coroutines.Deferred, kotlinx.coroutines.Job, kotlin.coroutines.CoroutineContext
            public <R> R fold(R r, gt2 gt2Var) {
                return (R) CompletableDeferred$default.fold(r, gt2Var);
            }

            @Override // kotlinx.coroutines.Deferred, kotlinx.coroutines.Job, kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
            public <E extends CoroutineContext.a> E get(CoroutineContext.b bVar) {
                return (E) CompletableDeferred$default.get(bVar);
            }

            @Override // kotlinx.coroutines.Job
            @InternalCoroutinesApi
            public CancellationException getCancellationException() {
                return CompletableDeferred$default.getCancellationException();
            }

            @Override // kotlinx.coroutines.Job
            public ak7 getChildren() {
                return CompletableDeferred$default.getChildren();
            }

            @Override // kotlinx.coroutines.Deferred
            @ExperimentalCoroutinesApi
            public T getCompleted() {
                return CompletableDeferred$default.getCompleted();
            }

            @Override // kotlinx.coroutines.Deferred
            @ExperimentalCoroutinesApi
            public Throwable getCompletionExceptionOrNull() {
                return CompletableDeferred$default.getCompletionExceptionOrNull();
            }

            @Override // kotlinx.coroutines.Deferred, kotlinx.coroutines.Job, kotlin.coroutines.CoroutineContext.a
            public CoroutineContext.b getKey() {
                return CompletableDeferred$default.getKey();
            }

            @Override // kotlinx.coroutines.Deferred
            public SelectClause1<T> getOnAwait() {
                return CompletableDeferred$default.getOnAwait();
            }

            @Override // kotlinx.coroutines.Job
            public SelectClause0 getOnJoin() {
                return CompletableDeferred$default.getOnJoin();
            }

            @Override // kotlinx.coroutines.Job
            public Job getParent() {
                return CompletableDeferred$default.getParent();
            }

            @Override // kotlinx.coroutines.Job
            public DisposableHandle invokeOnCompletion(ss2 ss2Var) {
                return CompletableDeferred$default.invokeOnCompletion(ss2Var);
            }

            @Override // kotlinx.coroutines.Job
            public boolean isActive() {
                return CompletableDeferred$default.isActive();
            }

            @Override // kotlinx.coroutines.Job
            public boolean isCancelled() {
                return CompletableDeferred$default.isCancelled();
            }

            @Override // kotlinx.coroutines.Job
            public boolean isCompleted() {
                return CompletableDeferred$default.isCompleted();
            }

            @Override // kotlinx.coroutines.Job
            public Object join(by0<? super ww8> by0Var) {
                return CompletableDeferred$default.join(by0Var);
            }

            @Override // kotlinx.coroutines.Deferred, kotlinx.coroutines.Job, kotlin.coroutines.CoroutineContext
            public CoroutineContext minusKey(CoroutineContext.b bVar) {
                return CompletableDeferred$default.minusKey(bVar);
            }

            @Override // kotlinx.coroutines.Deferred, kotlinx.coroutines.Job, kotlin.coroutines.CoroutineContext
            public CoroutineContext plus(CoroutineContext coroutineContext) {
                return CompletableDeferred$default.plus(coroutineContext);
            }

            @Override // kotlinx.coroutines.Job
            public boolean start() {
                return CompletableDeferred$default.start();
            }

            @Override // kotlinx.coroutines.Job
            public void cancel(CancellationException cancellationException) {
                CompletableDeferred$default.cancel(cancellationException);
            }

            @Override // kotlinx.coroutines.Job
            @InternalCoroutinesApi
            public DisposableHandle invokeOnCompletion(boolean z, boolean z2, ss2 ss2Var) {
                return CompletableDeferred$default.invokeOnCompletion(z, z2, ss2Var);
            }

            @Override // kotlinx.coroutines.Job
            public Job plus(Job job) {
                return CompletableDeferred$default.plus(job);
            }

            @Override // kotlinx.coroutines.Job
            public /* synthetic */ boolean cancel(Throwable th) {
                return CompletableDeferred$default.cancel(th);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void asDeferredImpl$lambda$0(CompletableDeferred completableDeferred, og8 og8Var) {
        Exception l = og8Var.l();
        if (l != null) {
            completableDeferred.completeExceptionally(l);
        } else if (og8Var.o()) {
            Job.DefaultImpls.cancel$default((Job) completableDeferred, (CancellationException) null, 1, (Object) null);
        } else {
            completableDeferred.complete(og8Var.m());
        }
    }

    public static final <T> og8 asTask(final Deferred<? extends T> deferred) {
        final oh0 oh0Var = new oh0();
        final qg8 qg8Var = new qg8(oh0Var.b());
        deferred.invokeOnCompletion(new ss2() { // from class: kotlinx.coroutines.tasks.TasksKt$asTask$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return ww8.a;
            }

            public final void invoke(Throwable th) {
                if (th instanceof CancellationException) {
                    oh0.this.a();
                    return;
                }
                Throwable completionExceptionOrNull = deferred.getCompletionExceptionOrNull();
                if (completionExceptionOrNull == null) {
                    qg8Var.c(deferred.getCompleted());
                    return;
                }
                qg8 qg8Var2 = qg8Var;
                Exception exc = completionExceptionOrNull instanceof Exception ? (Exception) completionExceptionOrNull : null;
                if (exc == null) {
                    exc = new RuntimeExecutionException(completionExceptionOrNull);
                }
                qg8Var2.b(exc);
            }
        });
        return qg8Var.a();
    }

    public static final <T> Object await(og8 og8Var, by0<? super T> by0Var) {
        return awaitImpl(og8Var, null, by0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> Object awaitImpl(og8 og8Var, final oh0 oh0Var, by0<? super T> by0Var) {
        if (!og8Var.p()) {
            final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(a.d(by0Var), 1);
            cancellableContinuationImpl.initCancellability();
            og8Var.c(DirectExecutor.INSTANCE, new me5() { // from class: kotlinx.coroutines.tasks.TasksKt$awaitImpl$2$1
                @Override // defpackage.me5
                public final void onComplete(og8 og8Var2) {
                    Exception l = og8Var2.l();
                    if (l != null) {
                        by0 by0Var2 = cancellableContinuationImpl;
                        Result.a aVar = Result.a;
                        by0Var2.resumeWith(Result.b(f.a(l)));
                        return;
                    }
                    boolean o = og8Var2.o();
                    CancellableContinuation<T> cancellableContinuation = cancellableContinuationImpl;
                    if (o) {
                        CancellableContinuation.DefaultImpls.cancel$default(cancellableContinuation, null, 1, null);
                    } else {
                        Result.a aVar2 = Result.a;
                        cancellableContinuation.resumeWith(Result.b(og8Var2.m()));
                    }
                }
            });
            if (oh0Var != null) {
                cancellableContinuationImpl.invokeOnCancellation(new ss2() { // from class: kotlinx.coroutines.tasks.TasksKt$awaitImpl$2$2
                    {
                        super(1);
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((Throwable) obj);
                        return ww8.a;
                    }

                    public final void invoke(Throwable th) {
                        oh0.this.a();
                    }
                });
            }
            Object result = cancellableContinuationImpl.getResult();
            if (result == a.h()) {
                hc1.c(by0Var);
            }
            return result;
        }
        Exception l = og8Var.l();
        if (l != null) {
            throw l;
        }
        if (!og8Var.o()) {
            return og8Var.m();
        }
        throw new CancellationException("Task " + og8Var + " was cancelled normally.");
    }

    @ExperimentalCoroutinesApi
    public static final <T> Deferred<T> asDeferred(og8 og8Var, oh0 oh0Var) {
        return asDeferredImpl(og8Var, oh0Var);
    }

    @ExperimentalCoroutinesApi
    public static final <T> Object await(og8 og8Var, oh0 oh0Var, by0<? super T> by0Var) {
        return awaitImpl(og8Var, oh0Var, by0Var);
    }
}
