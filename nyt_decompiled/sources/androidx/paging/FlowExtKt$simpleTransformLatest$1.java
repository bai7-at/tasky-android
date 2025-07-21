package androidx.paging;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gj0;
import defpackage.gt2;
import defpackage.it2;
import defpackage.ns7;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@fc1(c = "androidx.paging.FlowExtKt$simpleTransformLatest$1", f = "FlowExt.kt", l = {88}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class FlowExtKt$simpleTransformLatest$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ Flow<Object> $this_simpleTransformLatest;
    final /* synthetic */ it2 $transform;
    private /* synthetic */ Object L$0;
    int label;

    @fc1(c = "androidx.paging.FlowExtKt$simpleTransformLatest$1$1", f = "FlowExt.kt", l = {89}, m = "invokeSuspend")
    /* renamed from: androidx.paging.FlowExtKt$simpleTransformLatest$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        final /* synthetic */ gj0 $collector;
        final /* synthetic */ it2 $transform;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(it2 it2Var, gj0 gj0Var, by0 by0Var) {
            super(2, by0Var);
            this.$transform = it2Var;
            this.$collector = gj0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$transform, this.$collector, by0Var);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.gt2
        public final Object invoke(Object obj, by0 by0Var) {
            return ((AnonymousClass1) create(obj, by0Var)).invokeSuspend(ww8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object h = kotlin.coroutines.intrinsics.a.h();
            int i = this.label;
            if (i == 0) {
                kotlin.f.b(obj);
                Object obj2 = this.L$0;
                it2 it2Var = this.$transform;
                gj0 gj0Var = this.$collector;
                this.label = 1;
                if (it2Var.invoke(gj0Var, obj2, this) == h) {
                    return h;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.f.b(obj);
            }
            return ww8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlowExtKt$simpleTransformLatest$1(Flow flow, it2 it2Var, by0 by0Var) {
        super(2, by0Var);
        this.$this_simpleTransformLatest = flow;
        this.$transform = it2Var;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(ns7 ns7Var, by0 by0Var) {
        return ((FlowExtKt$simpleTransformLatest$1) create(ns7Var, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        FlowExtKt$simpleTransformLatest$1 flowExtKt$simpleTransformLatest$1 = new FlowExtKt$simpleTransformLatest$1(this.$this_simpleTransformLatest, this.$transform, by0Var);
        flowExtKt$simpleTransformLatest$1.L$0 = obj;
        return flowExtKt$simpleTransformLatest$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            ns7 ns7Var = (ns7) this.L$0;
            Flow<Object> flow = this.$this_simpleTransformLatest;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$transform, new gj0(ns7Var), null);
            this.label = 1;
            if (FlowKt.collectLatest(flow, anonymousClass1, this) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
        }
        return ww8.a;
    }
}
