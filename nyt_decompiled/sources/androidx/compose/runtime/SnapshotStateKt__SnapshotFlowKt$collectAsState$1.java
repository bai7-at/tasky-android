package androidx.compose.runtime;

import defpackage.a46;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@fc1(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1", f = "SnapshotFlow.kt", l = {64, 65}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class SnapshotStateKt__SnapshotFlowKt$collectAsState$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ CoroutineContext $context;
    final /* synthetic */ Flow<Object> $this_collectAsState;
    private /* synthetic */ Object L$0;
    int label;

    @fc1(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$2", f = "SnapshotFlow.kt", l = {66}, m = "invokeSuspend")
    /* renamed from: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements gt2 {
        final /* synthetic */ a46 $$this$produceState;
        final /* synthetic */ Flow<Object> $this_collectAsState;
        int label;

        /* renamed from: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$2$a */
        static final class a implements FlowCollector {
            final /* synthetic */ a46 a;

            a(a46 a46Var) {
                this.a = a46Var;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, by0 by0Var) {
                this.a.setValue(obj);
                return ww8.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Flow flow, a46 a46Var, by0 by0Var) {
            super(2, by0Var);
            this.$this_collectAsState = flow;
            this.$$this$produceState = a46Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            return new AnonymousClass2(this.$this_collectAsState, this.$$this$produceState, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object h = kotlin.coroutines.intrinsics.a.h();
            int i = this.label;
            if (i == 0) {
                kotlin.f.b(obj);
                Flow<Object> flow = this.$this_collectAsState;
                a aVar = new a(this.$$this$produceState);
                this.label = 1;
                if (flow.collect(aVar, this) == h) {
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

        @Override // defpackage.gt2
        public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
            return ((AnonymousClass2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
        }
    }

    static final class a implements FlowCollector {
        final /* synthetic */ a46 a;

        a(a46 a46Var) {
            this.a = a46Var;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, by0 by0Var) {
            this.a.setValue(obj);
            return ww8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SnapshotStateKt__SnapshotFlowKt$collectAsState$1(CoroutineContext coroutineContext, Flow flow, by0 by0Var) {
        super(2, by0Var);
        this.$context = coroutineContext;
        this.$this_collectAsState = flow;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(a46 a46Var, by0 by0Var) {
        return ((SnapshotStateKt__SnapshotFlowKt$collectAsState$1) create(a46Var, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        SnapshotStateKt__SnapshotFlowKt$collectAsState$1 snapshotStateKt__SnapshotFlowKt$collectAsState$1 = new SnapshotStateKt__SnapshotFlowKt$collectAsState$1(this.$context, this.$this_collectAsState, by0Var);
        snapshotStateKt__SnapshotFlowKt$collectAsState$1.L$0 = obj;
        return snapshotStateKt__SnapshotFlowKt$collectAsState$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            a46 a46Var = (a46) this.L$0;
            if (zq3.c(this.$context, EmptyCoroutineContext.a)) {
                Flow<Object> flow = this.$this_collectAsState;
                a aVar = new a(a46Var);
                this.label = 1;
                if (flow.collect(aVar, this) == h) {
                    return h;
                }
            } else {
                CoroutineContext coroutineContext = this.$context;
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$this_collectAsState, a46Var, null);
                this.label = 2;
                if (BuildersKt.withContext(coroutineContext, anonymousClass2, this) == h) {
                    return h;
                }
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
        }
        return ww8.a;
    }
}
