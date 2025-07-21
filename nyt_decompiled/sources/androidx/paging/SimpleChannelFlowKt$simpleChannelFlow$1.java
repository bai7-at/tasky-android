package androidx.paging;

import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.FlowCollector;

@fc1(c = "androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1", f = "SimpleChannelFlow.kt", l = {49}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class SimpleChannelFlowKt$simpleChannelFlow$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ gt2 $block;
    private /* synthetic */ Object L$0;
    int label;

    @fc1(c = "androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1", f = "SimpleChannelFlow.kt", l = {MdtaMetadataEntry.TYPE_INDICATOR_INT32, 68}, m = "invokeSuspend")
    /* renamed from: androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        final /* synthetic */ FlowCollector<Object> $$this$flow;
        final /* synthetic */ gt2 $block;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(FlowCollector flowCollector, gt2 gt2Var, by0 by0Var) {
            super(2, by0Var);
            this.$$this$flow = flowCollector;
            this.$block = gt2Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$flow, this.$block, by0Var);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x006b  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x005e A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x007b -> B:6:0x001a). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
                int r1 = r12.label
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L31
                if (r1 == r3) goto L25
                if (r1 != r2) goto L1d
                java.lang.Object r1 = r12.L$1
                kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
                java.lang.Object r5 = r12.L$0
                kotlinx.coroutines.Job r5 = (kotlinx.coroutines.Job) r5
                kotlin.f.b(r13)
            L1a:
                r13 = r1
                r1 = r5
                goto L52
            L1d:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r13)
                throw r12
            L25:
                java.lang.Object r1 = r12.L$1
                kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
                java.lang.Object r5 = r12.L$0
                kotlinx.coroutines.Job r5 = (kotlinx.coroutines.Job) r5
                kotlin.f.b(r13)
                goto L63
            L31:
                kotlin.f.b(r13)
                java.lang.Object r13 = r12.L$0
                r5 = r13
                kotlinx.coroutines.CoroutineScope r5 = (kotlinx.coroutines.CoroutineScope) r5
                r13 = 0
                r1 = 6
                kotlinx.coroutines.channels.Channel r13 = kotlinx.coroutines.channels.ChannelKt.Channel$default(r13, r4, r4, r1, r4)
                androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1 r8 = new androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1
                gt2 r1 = r12.$block
                r8.<init>(r13, r1, r4)
                r9 = 3
                r10 = 0
                r6 = 0
                r7 = 0
                kotlinx.coroutines.Job r1 = kotlinx.coroutines.BuildersKt.launch$default(r5, r6, r7, r8, r9, r10)
                kotlinx.coroutines.channels.ChannelIterator r13 = r13.iterator()
            L52:
                r12.L$0 = r1
                r12.L$1 = r13
                r12.label = r3
                java.lang.Object r5 = r13.hasNext(r12)
                if (r5 != r0) goto L5f
                return r0
            L5f:
                r11 = r1
                r1 = r13
                r13 = r5
                r5 = r11
            L63:
                java.lang.Boolean r13 = (java.lang.Boolean) r13
                boolean r13 = r13.booleanValue()
                if (r13 == 0) goto L7e
                java.lang.Object r13 = r1.next()
                kotlinx.coroutines.flow.FlowCollector<java.lang.Object> r6 = r12.$$this$flow
                r12.L$0 = r5
                r12.L$1 = r1
                r12.label = r2
                java.lang.Object r13 = r6.emit(r13, r12)
                if (r13 != r0) goto L1a
                return r0
            L7e:
                kotlinx.coroutines.Job.DefaultImpls.cancel$default(r5, r4, r3, r4)
                ww8 r12 = defpackage.ww8.a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // defpackage.gt2
        public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
            return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SimpleChannelFlowKt$simpleChannelFlow$1(gt2 gt2Var, by0 by0Var) {
        super(2, by0Var);
        this.$block = gt2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        SimpleChannelFlowKt$simpleChannelFlow$1 simpleChannelFlowKt$simpleChannelFlow$1 = new SimpleChannelFlowKt$simpleChannelFlow$1(this.$block, by0Var);
        simpleChannelFlowKt$simpleChannelFlow$1.L$0 = obj;
        return simpleChannelFlowKt$simpleChannelFlow$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1((FlowCollector) this.L$0, this.$block, null);
            this.label = 1;
            if (CoroutineScopeKt.coroutineScope(anonymousClass1, this) == h) {
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
    public final Object invoke(FlowCollector flowCollector, by0 by0Var) {
        return ((SimpleChannelFlowKt$simpleChannelFlow$1) create(flowCollector, by0Var)).invokeSuspend(ww8.a);
    }
}
