package kotlin.coroutines.jvm.internal;

import defpackage.by0;
import defpackage.gc1;
import defpackage.hc1;
import defpackage.p01;
import defpackage.ww8;
import defpackage.zq3;
import java.io.Serializable;
import kotlin.Result;
import kotlin.coroutines.intrinsics.a;
import kotlin.f;

/* loaded from: classes5.dex */
public abstract class BaseContinuationImpl implements by0<Object>, p01, Serializable {
    private final by0<Object> completion;

    public BaseContinuationImpl(by0 by0Var) {
        this.completion = by0Var;
    }

    public by0<ww8> create(by0<?> by0Var) {
        zq3.h(by0Var, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // defpackage.p01
    public p01 getCallerFrame() {
        by0<Object> by0Var = this.completion;
        if (by0Var instanceof p01) {
            return (p01) by0Var;
        }
        return null;
    }

    public final by0<Object> getCompletion() {
        return this.completion;
    }

    @Override // defpackage.p01
    public StackTraceElement getStackTraceElement() {
        return gc1.d(this);
    }

    protected abstract Object invokeSuspend(Object obj);

    protected void releaseIntercepted() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [by0, by0<java.lang.Object>, java.lang.Object] */
    @Override // defpackage.by0
    public final void resumeWith(Object obj) {
        Object invokeSuspend;
        while (true) {
            hc1.b(this);
            BaseContinuationImpl baseContinuationImpl = this;
            ?? r0 = baseContinuationImpl.completion;
            zq3.e(r0);
            try {
                invokeSuspend = baseContinuationImpl.invokeSuspend(obj);
            } catch (Throwable th) {
                Result.a aVar = Result.a;
                obj = Result.b(f.a(th));
            }
            if (invokeSuspend == a.h()) {
                return;
            }
            obj = Result.b(invokeSuspend);
            baseContinuationImpl.releaseIntercepted();
            if (!(r0 instanceof BaseContinuationImpl)) {
                r0.resumeWith(obj);
                return;
            }
            this = r0;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public by0<ww8> create(Object obj, by0<?> by0Var) {
        zq3.h(by0Var, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}
