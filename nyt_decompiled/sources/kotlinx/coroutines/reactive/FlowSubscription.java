package kotlinx.coroutines.reactive;

import defpackage.by0;
import defpackage.hb8;
import defpackage.hc1;
import defpackage.ss2;
import defpackage.va8;
import defpackage.ww8;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.a;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.intrinsics.CancellableKt;

@InternalCoroutinesApi
/* loaded from: classes5.dex */
public final class FlowSubscription<T> extends AbstractCoroutine<ww8> implements hb8 {
    private volatile boolean cancellationRequested;
    public final Flow<T> flow;
    private volatile /* synthetic */ Object producer$volatile;
    private volatile /* synthetic */ long requested$volatile;
    public final va8 subscriber;
    private static final /* synthetic */ AtomicLongFieldUpdater requested$volatile$FU = AtomicLongFieldUpdater.newUpdater(FlowSubscription.class, "requested$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater producer$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(FlowSubscription.class, Object.class, "producer$volatile");

    /* JADX WARN: Multi-variable type inference failed */
    public FlowSubscription(Flow<? extends T> flow, va8 va8Var, CoroutineContext coroutineContext) {
        super(coroutineContext, false, true);
        this.flow = flow;
        this.subscriber = va8Var;
        this.producer$volatile = createInitialContinuation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object consumeFlow(by0<? super ww8> by0Var) {
        Object collect = this.flow.collect(new FlowCollector(this) { // from class: kotlinx.coroutines.reactive.FlowSubscription$consumeFlow$2
            final /* synthetic */ FlowSubscription<T> this$0;

            {
                this.this$0 = this;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(T t, by0<? super ww8> by0Var2) {
                AtomicLongFieldUpdater atomicLongFieldUpdater;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
                this.this$0.subscriber.onNext(t);
                atomicLongFieldUpdater = FlowSubscription.requested$volatile$FU;
                if (atomicLongFieldUpdater.decrementAndGet(this.this$0) > 0) {
                    JobKt.ensureActive(this.this$0.getCoroutineContext());
                    return ww8.a;
                }
                FlowSubscription<T> flowSubscription = this.this$0;
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(a.d(by0Var2), 1);
                cancellableContinuationImpl.initCancellability();
                atomicReferenceFieldUpdater = FlowSubscription.producer$volatile$FU;
                atomicReferenceFieldUpdater.set(flowSubscription, cancellableContinuationImpl);
                Object result = cancellableContinuationImpl.getResult();
                if (result == a.h()) {
                    hc1.c(by0Var2);
                }
                return result == a.h() ? result : ww8.a;
            }
        }, by0Var);
        return collect == a.h() ? collect : ww8.a;
    }

    private final by0<ww8> createInitialContinuation() {
        final CoroutineContext coroutineContext = getCoroutineContext();
        return new by0<ww8>() { // from class: kotlinx.coroutines.reactive.FlowSubscription$createInitialContinuation$$inlined$Continuation$1
            @Override // defpackage.by0
            public CoroutineContext getContext() {
                return CoroutineContext.this;
            }

            @Override // defpackage.by0
            public void resumeWith(Object obj) {
                CancellableKt.startCoroutineCancellable(new FlowSubscription$createInitialContinuation$1$1(this), this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(7:(2:3|(8:5|6|7|(1:(2:10|11)(2:20|21))(3:22|23|(1:25))|12|13|14|15))|7|(0)(0)|12|13|14|15) */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
    
        kotlinx.coroutines.CoroutineExceptionHandlerKt.handleCoroutineException(r4.getCoroutineContext(), r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object flowProcessing(defpackage.by0<? super defpackage.ww8> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof kotlinx.coroutines.reactive.FlowSubscription$flowProcessing$1
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.reactive.FlowSubscription$flowProcessing$1 r0 = (kotlinx.coroutines.reactive.FlowSubscription$flowProcessing$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.reactive.FlowSubscription$flowProcessing$1 r0 = new kotlinx.coroutines.reactive.FlowSubscription$flowProcessing$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.reactive.FlowSubscription r4 = (kotlinx.coroutines.reactive.FlowSubscription) r4
            kotlin.f.b(r5)     // Catch: java.lang.Throwable -> L2d
            goto L45
        L2d:
            r5 = move-exception
            goto L56
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            kotlin.f.b(r5)
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L2d
            r0.label = r3     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r5 = r4.consumeFlow(r0)     // Catch: java.lang.Throwable -> L2d
            if (r5 != r1) goto L45
            return r1
        L45:
            va8 r5 = r4.subscriber     // Catch: java.lang.Throwable -> L4b
            r5.onComplete()     // Catch: java.lang.Throwable -> L4b
            goto L53
        L4b:
            r5 = move-exception
            kotlin.coroutines.CoroutineContext r4 = r4.getCoroutineContext()
            kotlinx.coroutines.CoroutineExceptionHandlerKt.handleCoroutineException(r4, r5)
        L53:
            ww8 r4 = defpackage.ww8.a
            return r4
        L56:
            boolean r0 = r4.cancellationRequested
            if (r0 == 0) goto L66
            boolean r0 = r4.isActive()
            if (r0 != 0) goto L66
            java.util.concurrent.CancellationException r0 = r4.getCancellationException()
            if (r5 == r0) goto L77
        L66:
            va8 r0 = r4.subscriber     // Catch: java.lang.Throwable -> L6c
            r0.onError(r5)     // Catch: java.lang.Throwable -> L6c
            goto L77
        L6c:
            r0 = move-exception
            defpackage.g62.a(r5, r0)
            kotlin.coroutines.CoroutineContext r4 = r4.getCoroutineContext()
            kotlinx.coroutines.CoroutineExceptionHandlerKt.handleCoroutineException(r4, r5)
        L77:
            ww8 r4 = defpackage.ww8.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.reactive.FlowSubscription.flowProcessing(by0):java.lang.Object");
    }

    private final /* synthetic */ long getAndUpdate$atomicfu(Object obj, AtomicLongFieldUpdater atomicLongFieldUpdater, ss2 ss2Var) {
        long j;
        do {
            j = atomicLongFieldUpdater.get(obj);
        } while (!atomicLongFieldUpdater.compareAndSet(obj, j, ((Number) ss2Var.invoke(Long.valueOf(j))).longValue()));
        return j;
    }

    private final /* synthetic */ Object getProducer$volatile() {
        return this.producer$volatile;
    }

    private final /* synthetic */ long getRequested$volatile() {
        return this.requested$volatile;
    }

    private final /* synthetic */ void setProducer$volatile(Object obj) {
        this.producer$volatile = obj;
    }

    private final /* synthetic */ void setRequested$volatile(long j) {
        this.requested$volatile = j;
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.Job
    public void cancel() {
        this.cancellationRequested = true;
        cancel((CancellationException) null);
    }

    @Override // defpackage.hb8
    public void request(long j) {
        long j2;
        long j3;
        by0 by0Var;
        if (j <= 0) {
            return;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = requested$volatile$FU;
        do {
            j2 = atomicLongFieldUpdater.get(this);
            j3 = j2 + j;
            if (j3 <= 0) {
                j3 = Long.MAX_VALUE;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j2, j3));
        if (j2 <= 0) {
            do {
                by0Var = (by0) producer$volatile$FU.getAndSet(this, null);
            } while (by0Var == null);
            Result.a aVar = Result.a;
            by0Var.resumeWith(Result.b(ww8.a));
        }
    }
}
