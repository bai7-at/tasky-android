package com.dropbox.android.external.store4.impl.operators;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.qy1;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@fc1(c = "com.dropbox.android.external.store4.impl.operators.FlowMergeKt$merge$1", f = "FlowMerge.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class FlowMergeKt$merge$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ Flow<Object> $other;
    final /* synthetic */ Flow<Object> $this_merge;
    private /* synthetic */ Object L$0;
    int label;

    @fc1(c = "com.dropbox.android.external.store4.impl.operators.FlowMergeKt$merge$1$1", f = "FlowMerge.kt", l = {49}, m = "invokeSuspend")
    /* renamed from: com.dropbox.android.external.store4.impl.operators.FlowMergeKt$merge$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        final /* synthetic */ ProducerScope<qy1> $$this$channelFlow;
        final /* synthetic */ Flow<Object> $this_merge;
        int label;

        /* renamed from: com.dropbox.android.external.store4.impl.operators.FlowMergeKt$merge$1$1$a */
        public static final class a implements FlowCollector {
            final /* synthetic */ ProducerScope a;

            public a(ProducerScope producerScope) {
                this.a = producerScope;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public Object emit(Object obj, by0 by0Var) {
                Object send = this.a.send(new qy1.a(obj), by0Var);
                return send == kotlin.coroutines.intrinsics.a.h() ? send : ww8.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Flow flow, ProducerScope producerScope, by0 by0Var) {
            super(2, by0Var);
            this.$this_merge = flow;
            this.$$this$channelFlow = producerScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            return new AnonymousClass1(this.$this_merge, this.$$this$channelFlow, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object h = kotlin.coroutines.intrinsics.a.h();
            int i = this.label;
            if (i == 0) {
                f.b(obj);
                Flow<Object> flow = this.$this_merge;
                a aVar = new a(this.$$this$channelFlow);
                this.label = 1;
                if (flow.collect(aVar, this) == h) {
                    return h;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
            }
            return ww8.a;
        }

        @Override // defpackage.gt2
        public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
            return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
        }
    }

    @fc1(c = "com.dropbox.android.external.store4.impl.operators.FlowMergeKt$merge$1$2", f = "FlowMerge.kt", l = {49}, m = "invokeSuspend")
    /* renamed from: com.dropbox.android.external.store4.impl.operators.FlowMergeKt$merge$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements gt2 {
        final /* synthetic */ ProducerScope<qy1> $$this$channelFlow;
        final /* synthetic */ Flow<Object> $other;
        int label;

        /* renamed from: com.dropbox.android.external.store4.impl.operators.FlowMergeKt$merge$1$2$a */
        public static final class a implements FlowCollector {
            final /* synthetic */ ProducerScope a;

            public a(ProducerScope producerScope) {
                this.a = producerScope;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public Object emit(Object obj, by0 by0Var) {
                Object send = this.a.send(new qy1.b(obj), by0Var);
                return send == kotlin.coroutines.intrinsics.a.h() ? send : ww8.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Flow flow, ProducerScope producerScope, by0 by0Var) {
            super(2, by0Var);
            this.$other = flow;
            this.$$this$channelFlow = producerScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            return new AnonymousClass2(this.$other, this.$$this$channelFlow, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object h = kotlin.coroutines.intrinsics.a.h();
            int i = this.label;
            if (i == 0) {
                f.b(obj);
                Flow<Object> flow = this.$other;
                a aVar = new a(this.$$this$channelFlow);
                this.label = 1;
                if (flow.collect(aVar, this) == h) {
                    return h;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
            }
            return ww8.a;
        }

        @Override // defpackage.gt2
        public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
            return ((AnonymousClass2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlowMergeKt$merge$1(Flow flow, Flow flow2, by0 by0Var) {
        super(2, by0Var);
        this.$this_merge = flow;
        this.$other = flow2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        FlowMergeKt$merge$1 flowMergeKt$merge$1 = new FlowMergeKt$merge$1(this.$this_merge, this.$other, by0Var);
        flowMergeKt$merge$1.L$0 = obj;
        return flowMergeKt$merge$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        ProducerScope producerScope = (ProducerScope) this.L$0;
        BuildersKt__Builders_commonKt.launch$default(producerScope, null, null, new AnonymousClass1(this.$this_merge, producerScope, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(producerScope, null, null, new AnonymousClass2(this.$other, producerScope, null), 3, null);
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(ProducerScope producerScope, by0 by0Var) {
        return ((FlowMergeKt$merge$1) create(producerScope, by0Var)).invokeSuspend(ww8.a);
    }
}
