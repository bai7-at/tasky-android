package kotlin.coroutines.intrinsics;

import defpackage.by0;
import defpackage.gt2;
import defpackage.hc1;
import defpackage.it2;
import defpackage.ku8;
import defpackage.ss2;
import defpackage.zq3;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.RestrictedContinuationImpl;
import kotlin.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class IntrinsicsKt__IntrinsicsJvmKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static by0 a(final ss2 ss2Var, by0 by0Var) {
        zq3.h(ss2Var, "<this>");
        zq3.h(by0Var, "completion");
        final by0<?> a = hc1.a(by0Var);
        if (ss2Var instanceof BaseContinuationImpl) {
            return ((BaseContinuationImpl) ss2Var).create(a);
        }
        final CoroutineContext context = a.getContext();
        return context == EmptyCoroutineContext.a ? new RestrictedContinuationImpl(a, ss2Var) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$1
            final /* synthetic */ ss2 $this_createCoroutineUnintercepted$inlined;
            private int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(a);
                this.$this_createCoroutineUnintercepted$inlined = ss2Var;
                zq3.f(a, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            protected Object invokeSuspend(Object obj) {
                int i = this.label;
                if (i == 0) {
                    this.label = 1;
                    f.b(obj);
                    zq3.f(this.$this_createCoroutineUnintercepted$inlined, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$0>, kotlin.Any?>");
                    return ((ss2) ku8.f(this.$this_createCoroutineUnintercepted$inlined, 1)).invoke(this);
                }
                if (i != 1) {
                    throw new IllegalStateException("This coroutine had already completed");
                }
                this.label = 2;
                f.b(obj);
                return obj;
            }
        } : new ContinuationImpl(a, context, ss2Var) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$2
            final /* synthetic */ ss2 $this_createCoroutineUnintercepted$inlined;
            private int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(a, context);
                this.$this_createCoroutineUnintercepted$inlined = ss2Var;
                zq3.f(a, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            protected Object invokeSuspend(Object obj) {
                int i = this.label;
                if (i == 0) {
                    this.label = 1;
                    f.b(obj);
                    zq3.f(this.$this_createCoroutineUnintercepted$inlined, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$0>, kotlin.Any?>");
                    return ((ss2) ku8.f(this.$this_createCoroutineUnintercepted$inlined, 1)).invoke(this);
                }
                if (i != 1) {
                    throw new IllegalStateException("This coroutine had already completed");
                }
                this.label = 2;
                f.b(obj);
                return obj;
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static by0 b(final gt2 gt2Var, final Object obj, by0 by0Var) {
        zq3.h(gt2Var, "<this>");
        zq3.h(by0Var, "completion");
        final by0<?> a = hc1.a(by0Var);
        if (gt2Var instanceof BaseContinuationImpl) {
            return ((BaseContinuationImpl) gt2Var).create(obj, a);
        }
        final CoroutineContext context = a.getContext();
        return context == EmptyCoroutineContext.a ? new RestrictedContinuationImpl(a, gt2Var, obj) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$3
            final /* synthetic */ Object $receiver$inlined;
            final /* synthetic */ gt2 $this_createCoroutineUnintercepted$inlined;
            private int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(a);
                this.$this_createCoroutineUnintercepted$inlined = gt2Var;
                this.$receiver$inlined = obj;
                zq3.f(a, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            protected Object invokeSuspend(Object obj2) {
                int i = this.label;
                if (i == 0) {
                    this.label = 1;
                    f.b(obj2);
                    zq3.f(this.$this_createCoroutineUnintercepted$inlined, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                    return ((gt2) ku8.f(this.$this_createCoroutineUnintercepted$inlined, 2)).invoke(this.$receiver$inlined, this);
                }
                if (i != 1) {
                    throw new IllegalStateException("This coroutine had already completed");
                }
                this.label = 2;
                f.b(obj2);
                return obj2;
            }
        } : new ContinuationImpl(a, context, gt2Var, obj) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$4
            final /* synthetic */ Object $receiver$inlined;
            final /* synthetic */ gt2 $this_createCoroutineUnintercepted$inlined;
            private int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(a, context);
                this.$this_createCoroutineUnintercepted$inlined = gt2Var;
                this.$receiver$inlined = obj;
                zq3.f(a, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            protected Object invokeSuspend(Object obj2) {
                int i = this.label;
                if (i == 0) {
                    this.label = 1;
                    f.b(obj2);
                    zq3.f(this.$this_createCoroutineUnintercepted$inlined, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                    return ((gt2) ku8.f(this.$this_createCoroutineUnintercepted$inlined, 2)).invoke(this.$receiver$inlined, this);
                }
                if (i != 1) {
                    throw new IllegalStateException("This coroutine had already completed");
                }
                this.label = 2;
                f.b(obj2);
                return obj2;
            }
        };
    }

    private static final by0 c(final by0 by0Var) {
        final CoroutineContext context = by0Var.getContext();
        return context == EmptyCoroutineContext.a ? new RestrictedContinuationImpl(by0Var) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(by0Var);
                zq3.f(by0Var, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            protected Object invokeSuspend(Object obj) {
                f.b(obj);
                return obj;
            }
        } : new ContinuationImpl(by0Var, context) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(by0Var, context);
                zq3.f(by0Var, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            protected Object invokeSuspend(Object obj) {
                f.b(obj);
                return obj;
            }
        };
    }

    public static by0 d(by0 by0Var) {
        by0<Object> intercepted;
        zq3.h(by0Var, "<this>");
        ContinuationImpl continuationImpl = by0Var instanceof ContinuationImpl ? (ContinuationImpl) by0Var : null;
        return (continuationImpl == null || (intercepted = continuationImpl.intercepted()) == null) ? by0Var : intercepted;
    }

    public static Object e(ss2 ss2Var, by0 by0Var) {
        zq3.h(ss2Var, "<this>");
        zq3.h(by0Var, "completion");
        return ((ss2) ku8.f(ss2Var, 1)).invoke(c(hc1.a(by0Var)));
    }

    public static Object f(gt2 gt2Var, Object obj, by0 by0Var) {
        zq3.h(gt2Var, "<this>");
        zq3.h(by0Var, "completion");
        return ((gt2) ku8.f(gt2Var, 2)).invoke(obj, c(hc1.a(by0Var)));
    }

    public static Object g(it2 it2Var, Object obj, Object obj2, by0 by0Var) {
        zq3.h(it2Var, "<this>");
        zq3.h(by0Var, "completion");
        return ((it2) ku8.f(it2Var, 3)).invoke(obj, obj2, c(hc1.a(by0Var)));
    }
}
