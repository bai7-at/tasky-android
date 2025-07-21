package kotlinx.coroutines.flow.internal;

import defpackage.by0;
import defpackage.gt2;
import defpackage.hc1;
import defpackage.it2;
import defpackage.p01;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.h;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes5.dex */
public final class SafeCollector<T> extends ContinuationImpl implements FlowCollector<T>, p01 {
    public final CoroutineContext collectContext;
    public final int collectContextSize;
    public final FlowCollector<T> collector;
    private by0<? super ww8> completion_;
    private CoroutineContext lastEmissionContext;

    /* JADX WARN: Multi-variable type inference failed */
    public SafeCollector(FlowCollector<? super T> flowCollector, CoroutineContext coroutineContext) {
        super(NoOpContinuation.INSTANCE, EmptyCoroutineContext.a);
        this.collector = flowCollector;
        this.collectContext = coroutineContext;
        this.collectContextSize = ((Number) coroutineContext.fold(0, new gt2() { // from class: kotlinx.coroutines.flow.internal.SafeCollector$collectContextSize$1
            public final Integer invoke(int i, CoroutineContext.a aVar) {
                return Integer.valueOf(i + 1);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Number) obj).intValue(), (CoroutineContext.a) obj2);
            }
        })).intValue();
    }

    private final void checkContext(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, T t) {
        if (coroutineContext2 instanceof DownstreamExceptionContext) {
            exceptionTransparencyViolated((DownstreamExceptionContext) coroutineContext2, t);
        }
        SafeCollector_commonKt.checkContext(this, coroutineContext);
    }

    private final void exceptionTransparencyViolated(DownstreamExceptionContext downstreamExceptionContext, Object obj) {
        throw new IllegalStateException(h.f("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + downstreamExceptionContext.e + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public Object emit(T t, by0<? super ww8> by0Var) {
        try {
            Object emit = emit(by0Var, (by0<? super ww8>) t);
            if (emit == a.h()) {
                hc1.c(by0Var);
            }
            return emit == a.h() ? emit : ww8.a;
        } catch (Throwable th) {
            this.lastEmissionContext = new DownstreamExceptionContext(th, by0Var.getContext());
            throw th;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl, defpackage.p01
    public p01 getCallerFrame() {
        by0<? super ww8> by0Var = this.completion_;
        if (by0Var instanceof p01) {
            return (p01) by0Var;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl, defpackage.by0
    public CoroutineContext getContext() {
        CoroutineContext coroutineContext = this.lastEmissionContext;
        return coroutineContext == null ? EmptyCoroutineContext.a : coroutineContext;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl, defpackage.p01
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public Object invokeSuspend(Object obj) {
        Throwable e = Result.e(obj);
        if (e != null) {
            this.lastEmissionContext = new DownstreamExceptionContext(e, getContext());
        }
        by0<? super ww8> by0Var = this.completion_;
        if (by0Var != null) {
            by0Var.resumeWith(obj);
        }
        return a.h();
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl, kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }

    private final Object emit(by0<? super ww8> by0Var, T t) {
        it2 it2Var;
        CoroutineContext context = by0Var.getContext();
        JobKt.ensureActive(context);
        CoroutineContext coroutineContext = this.lastEmissionContext;
        if (coroutineContext != context) {
            checkContext(context, coroutineContext, t);
            this.lastEmissionContext = context;
        }
        this.completion_ = by0Var;
        it2Var = SafeCollectorKt.emitFun;
        FlowCollector<T> flowCollector = this.collector;
        zq3.f(flowCollector, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        zq3.f(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>");
        Object invoke = it2Var.invoke(flowCollector, t, this);
        if (!zq3.c(invoke, a.h())) {
            this.completion_ = null;
        }
        return invoke;
    }
}
