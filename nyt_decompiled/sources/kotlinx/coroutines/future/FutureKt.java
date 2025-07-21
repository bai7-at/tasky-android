package kotlinx.coroutines.future;

import defpackage.by0;
import defpackage.gt2;
import defpackage.hc1;
import defpackage.ss2;
import defpackage.ww8;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ExecutionException;
import java.util.function.BiFunction;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.a;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineExceptionHandlerKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.ExceptionsKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.future.FutureKt;

/* loaded from: classes5.dex */
public final class FutureKt {
    public static final <T> CompletableFuture<T> asCompletableFuture(final Deferred<? extends T> deferred) {
        final CompletableFuture<T> completableFuture = new CompletableFuture<>();
        setupCancellation(deferred, completableFuture);
        deferred.invokeOnCompletion(new ss2() { // from class: kotlinx.coroutines.future.FutureKt$asCompletableFuture$1
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
                try {
                    completableFuture.complete(deferred.getCompleted());
                } catch (Throwable th2) {
                    completableFuture.completeExceptionally(th2);
                }
            }
        });
        return completableFuture;
    }

    public static final <T> Deferred<T> asDeferred(CompletionStage<T> completionStage) {
        Throwable cause;
        CompletableFuture<T> completableFuture = completionStage.toCompletableFuture();
        if (!completableFuture.isDone()) {
            final CompletableDeferred CompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
            final gt2 gt2Var = new gt2() { // from class: kotlinx.coroutines.future.FutureKt$asDeferred$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return invoke((FutureKt$asDeferred$2) obj, (Throwable) obj2);
                }

                public final Object invoke(T t, Throwable th) {
                    boolean completeExceptionally;
                    Throwable cause2;
                    try {
                        if (th == null) {
                            completeExceptionally = CompletableDeferred$default.complete(t);
                        } else {
                            CompletableDeferred<T> completableDeferred = CompletableDeferred$default;
                            CompletionException completionException = th instanceof CompletionException ? (CompletionException) th : null;
                            if (completionException != null && (cause2 = completionException.getCause()) != null) {
                                th = cause2;
                            }
                            completeExceptionally = completableDeferred.completeExceptionally(th);
                        }
                        return Boolean.valueOf(completeExceptionally);
                    } catch (Throwable th2) {
                        CoroutineExceptionHandlerKt.handleCoroutineException(EmptyCoroutineContext.a, th2);
                        return ww8.a;
                    }
                }
            };
            completionStage.handle(new BiFunction() { // from class: ut2
                @Override // java.util.function.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    Object invoke;
                    invoke = gt2.this.invoke(obj, (Throwable) obj2);
                    return invoke;
                }
            });
            JobKt.cancelFutureOnCompletion(CompletableDeferred$default, completableFuture);
            return CompletableDeferred$default;
        }
        try {
            return CompletableDeferredKt.CompletableDeferred(completableFuture.get());
        } catch (Throwable th) {
            th = th;
            ExecutionException executionException = th instanceof ExecutionException ? (ExecutionException) th : null;
            if (executionException != null && (cause = executionException.getCause()) != null) {
                th = cause;
            }
            CompletableDeferred CompletableDeferred$default2 = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
            CompletableDeferred$default2.completeExceptionally(th);
            return CompletableDeferred$default2;
        }
    }

    public static final <T> Object await(CompletionStage<T> completionStage, by0<? super T> by0Var) {
        final CompletableFuture<T> completableFuture = completionStage.toCompletableFuture();
        if (completableFuture.isDone()) {
            try {
                return completableFuture.get();
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                if (cause == null) {
                    throw e;
                }
                throw cause;
            }
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(a.d(by0Var), 1);
        cancellableContinuationImpl.initCancellability();
        final ContinuationHandler continuationHandler = new ContinuationHandler(cancellableContinuationImpl);
        completionStage.handle(continuationHandler);
        cancellableContinuationImpl.invokeOnCancellation(new ss2() { // from class: kotlinx.coroutines.future.FutureKt$await$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return ww8.a;
            }

            public final void invoke(Throwable th) {
                completableFuture.cancel(false);
                continuationHandler.cont = null;
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == a.h()) {
            hc1.c(by0Var);
        }
        return result;
    }

    public static final <T> CompletableFuture<T> future(CoroutineScope coroutineScope, CoroutineContext coroutineContext, CoroutineStart coroutineStart, gt2 gt2Var) {
        if (coroutineStart.isLazy()) {
            throw new IllegalArgumentException((coroutineStart + " start is not supported").toString());
        }
        CoroutineContext newCoroutineContext = CoroutineContextKt.newCoroutineContext(coroutineScope, coroutineContext);
        CompletableFuture<T> completableFuture = new CompletableFuture<>();
        CompletableFutureCoroutine completableFutureCoroutine = new CompletableFutureCoroutine(newCoroutineContext, completableFuture);
        completableFuture.handle((BiFunction) completableFutureCoroutine);
        completableFutureCoroutine.start(coroutineStart, completableFutureCoroutine, gt2Var);
        return completableFuture;
    }

    public static /* synthetic */ CompletableFuture future$default(CoroutineScope coroutineScope, CoroutineContext coroutineContext, CoroutineStart coroutineStart, gt2 gt2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.a;
        }
        if ((i & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return future(coroutineScope, coroutineContext, coroutineStart, gt2Var);
    }

    private static final void setupCancellation(final Job job, CompletableFuture<?> completableFuture) {
        completableFuture.handle(new BiFunction() { // from class: vt2
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                ww8 ww8Var;
                ww8Var = FutureKt.setupCancellation$lambda$2(Job.this, obj, (Throwable) obj2);
                return ww8Var;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ww8 setupCancellation$lambda$2(Job job, Object obj, Throwable th) {
        if (th != null) {
            r2 = th instanceof CancellationException ? (CancellationException) th : null;
            if (r2 == null) {
                r2 = ExceptionsKt.CancellationException("CompletableFuture was completed exceptionally", th);
            }
        }
        job.cancel(r2);
        return ww8.a;
    }

    public static final CompletableFuture<ww8> asCompletableFuture(Job job) {
        final CompletableFuture<ww8> completableFuture = new CompletableFuture<>();
        setupCancellation(job, completableFuture);
        job.invokeOnCompletion(new ss2() { // from class: kotlinx.coroutines.future.FutureKt$asCompletableFuture$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return ww8.a;
            }

            public final void invoke(Throwable th) {
                if (th == null) {
                    completableFuture.complete(ww8.a);
                } else {
                    completableFuture.completeExceptionally(th);
                }
            }
        });
        return completableFuture;
    }
}
