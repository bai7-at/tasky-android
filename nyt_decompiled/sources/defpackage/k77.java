package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class k77 implements by0, p01 {
    private static final a b = new a(null);
    private static final AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(k77.class, Object.class, "result");
    private final by0 a;
    private volatile Object result;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public k77(by0 by0Var, Object obj) {
        zq3.h(by0Var, "delegate");
        this.a = by0Var;
        this.result = obj;
    }

    public final Object a() {
        Object obj = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.UNDECIDED;
        if (obj == coroutineSingletons) {
            if (v1.a(c, this, coroutineSingletons, kotlin.coroutines.intrinsics.a.h())) {
                return kotlin.coroutines.intrinsics.a.h();
            }
            obj = this.result;
        }
        if (obj == CoroutineSingletons.RESUMED) {
            return kotlin.coroutines.intrinsics.a.h();
        }
        if (obj instanceof Result.Failure) {
            throw ((Result.Failure) obj).exception;
        }
        return obj;
    }

    @Override // defpackage.p01
    public p01 getCallerFrame() {
        by0 by0Var = this.a;
        if (by0Var instanceof p01) {
            return (p01) by0Var;
        }
        return null;
    }

    @Override // defpackage.by0
    public CoroutineContext getContext() {
        return this.a.getContext();
    }

    @Override // defpackage.p01
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // defpackage.by0
    public void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.UNDECIDED;
            if (obj2 == coroutineSingletons) {
                if (v1.a(c, this, coroutineSingletons, obj)) {
                    return;
                }
            } else {
                if (obj2 != kotlin.coroutines.intrinsics.a.h()) {
                    throw new IllegalStateException("Already resumed");
                }
                if (v1.a(c, this, kotlin.coroutines.intrinsics.a.h(), CoroutineSingletons.RESUMED)) {
                    this.a.resumeWith(obj);
                    return;
                }
            }
        }
    }

    public String toString() {
        return "SafeContinuation for " + this.a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k77(by0 by0Var) {
        this(by0Var, CoroutineSingletons.UNDECIDED);
        zq3.h(by0Var, "delegate");
    }
}
