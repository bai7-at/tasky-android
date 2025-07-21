package androidx.paging;

import androidx.paging.PageEvent;
import androidx.paging.d;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.kt2;
import defpackage.ns7;
import defpackage.qs2;
import defpackage.ww8;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@fc1(c = "androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1", f = "PageFetcher.kt", l = {161}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ Flow $otherFlow;
    final /* synthetic */ f $sourceStates$inlined;
    final /* synthetic */ Flow $this_combineWithoutBatching;
    private /* synthetic */ Object L$0;
    int label;

    @fc1(c = "androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$1", f = "PageFetcher.kt", l = {141}, m = "invokeSuspend")
    /* renamed from: androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements kt2 {
        final /* synthetic */ ns7 $$this$simpleChannelFlow;
        final /* synthetic */ f $sourceStates$inlined;
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ns7 ns7Var, by0 by0Var, f fVar) {
            super(4, by0Var);
            this.$sourceStates$inlined = fVar;
            this.$$this$simpleChannelFlow = ns7Var;
        }

        @Override // defpackage.kt2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object obj, Object obj2, CombineSource combineSource, by0 by0Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$simpleChannelFlow, by0Var, this.$sourceStates$inlined);
            anonymousClass1.L$0 = obj;
            anonymousClass1.L$1 = obj2;
            anonymousClass1.L$2 = combineSource;
            return anonymousClass1.invokeSuspend(ww8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object h = kotlin.coroutines.intrinsics.a.h();
            int i = this.label;
            if (i == 0) {
                kotlin.f.b(obj);
                Object obj2 = this.L$0;
                Object obj3 = this.L$1;
                CombineSource combineSource = (CombineSource) this.L$2;
                ns7 ns7Var = this.$$this$simpleChannelFlow;
                Object obj4 = (PageEvent) obj3;
                e eVar = (e) obj2;
                if (combineSource == CombineSource.RECEIVER) {
                    obj4 = new PageEvent.b(this.$sourceStates$inlined.d(), eVar);
                } else if (obj4 instanceof PageEvent.Insert) {
                    PageEvent.Insert insert = (PageEvent.Insert) obj4;
                    this.$sourceStates$inlined.b(insert.k());
                    obj4 = PageEvent.Insert.e(insert, null, null, 0, 0, insert.k(), eVar, 15, null);
                } else if (obj4 instanceof PageEvent.a) {
                    this.$sourceStates$inlined.c(((PageEvent.a) obj4).c(), d.c.b.b());
                } else {
                    if (!(obj4 instanceof PageEvent.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    PageEvent.b bVar = (PageEvent.b) obj4;
                    this.$sourceStates$inlined.b(bVar.d());
                    obj4 = new PageEvent.b(bVar.d(), eVar);
                }
                this.label = 1;
                if (ns7Var.send(obj4, this) == h) {
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

    @fc1(c = "androidx.paging.FlowExtKt$combineWithoutBatching$2$1$1", f = "FlowExt.kt", l = {147}, m = "invokeSuspend")
    /* renamed from: androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements gt2 {
        final /* synthetic */ ns7 $$this$simpleChannelFlow;
        final /* synthetic */ Flow $flow;
        final /* synthetic */ AtomicInteger $incompleteFlows;
        final /* synthetic */ int $index;
        final /* synthetic */ UnbatchedFlowCombiner $unbatchedFlowCombiner;
        int label;

        /* renamed from: androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$2$1, reason: invalid class name */
        public static final class AnonymousClass1 implements FlowCollector {
            final /* synthetic */ UnbatchedFlowCombiner a;
            final /* synthetic */ int b;

            /* renamed from: androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$2$1$1, reason: invalid class name and collision with other inner class name */
            static final class C01021 extends ContinuationImpl {
                int label;
                /* synthetic */ Object result;

                C01021(by0 by0Var) {
                    super(by0Var);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.result = obj;
                    this.label |= RecyclerView.UNDEFINED_DURATION;
                    return AnonymousClass1.this.emit(null, this);
                }
            }

            public AnonymousClass1(UnbatchedFlowCombiner unbatchedFlowCombiner, int i) {
                this.a = unbatchedFlowCombiner;
                this.b = i;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0050 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r6, defpackage.by0 r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1.AnonymousClass2.AnonymousClass1.C01021
                    if (r0 == 0) goto L13
                    r0 = r7
                    androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$2$1$1 r0 = (androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1.AnonymousClass2.AnonymousClass1.C01021) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L18
                L13:
                    androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$2$1$1 r0 = new androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$2$1$1
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
                    int r2 = r0.label
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L38
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    kotlin.f.b(r7)
                    goto L51
                L2c:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L34:
                    kotlin.f.b(r7)
                    goto L48
                L38:
                    kotlin.f.b(r7)
                    androidx.paging.UnbatchedFlowCombiner r7 = r5.a
                    int r5 = r5.b
                    r0.label = r4
                    java.lang.Object r5 = r7.a(r5, r6, r0)
                    if (r5 != r1) goto L48
                    return r1
                L48:
                    r0.label = r3
                    java.lang.Object r5 = kotlinx.coroutines.YieldKt.yield(r0)
                    if (r5 != r1) goto L51
                    return r1
                L51:
                    ww8 r5 = defpackage.ww8.a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1.AnonymousClass2.AnonymousClass1.emit(java.lang.Object, by0):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Flow flow, AtomicInteger atomicInteger, ns7 ns7Var, UnbatchedFlowCombiner unbatchedFlowCombiner, int i, by0 by0Var) {
            super(2, by0Var);
            this.$flow = flow;
            this.$incompleteFlows = atomicInteger;
            this.$unbatchedFlowCombiner = unbatchedFlowCombiner;
            this.$index = i;
            this.$$this$simpleChannelFlow = ns7Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            return new AnonymousClass2(this.$flow, this.$incompleteFlows, this.$$this$simpleChannelFlow, this.$unbatchedFlowCombiner, this.$index, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AtomicInteger atomicInteger;
            Object h = kotlin.coroutines.intrinsics.a.h();
            int i = this.label;
            try {
                if (i == 0) {
                    kotlin.f.b(obj);
                    Flow flow = this.$flow;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$unbatchedFlowCombiner, this.$index);
                    this.label = 1;
                    if (flow.collect(anonymousClass1, this) == h) {
                        return h;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.f.b(obj);
                }
                if (atomicInteger.decrementAndGet() == 0) {
                    SendChannel.DefaultImpls.close$default(this.$$this$simpleChannelFlow, null, 1, null);
                }
                return ww8.a;
            } finally {
                if (this.$incompleteFlows.decrementAndGet() == 0) {
                    SendChannel.DefaultImpls.close$default(this.$$this$simpleChannelFlow, null, 1, null);
                }
            }
        }

        @Override // defpackage.gt2
        public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
            return ((AnonymousClass2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1(Flow flow, Flow flow2, by0 by0Var, f fVar) {
        super(2, by0Var);
        this.$this_combineWithoutBatching = flow;
        this.$otherFlow = flow2;
        this.$sourceStates$inlined = fVar;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(ns7 ns7Var, by0 by0Var) {
        return ((PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1) create(ns7Var, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1 pageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1 = new PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1(this.$this_combineWithoutBatching, this.$otherFlow, by0Var, this.$sourceStates$inlined);
        pageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1.L$0 = obj;
        return pageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        final CompletableJob Job$default;
        int i = 0;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.f.b(obj);
            ns7 ns7Var = (ns7) this.L$0;
            AtomicInteger atomicInteger = new AtomicInteger(2);
            UnbatchedFlowCombiner unbatchedFlowCombiner = new UnbatchedFlowCombiner(new AnonymousClass1(ns7Var, null, this.$sourceStates$inlined));
            Job$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
            Flow[] flowArr = {this.$this_combineWithoutBatching, this.$otherFlow};
            int i3 = 0;
            while (i < 2) {
                BuildersKt__Builders_commonKt.launch$default(ns7Var, Job$default, null, new AnonymousClass2(flowArr[i], atomicInteger, ns7Var, unbatchedFlowCombiner, i3, null), 2, null);
                i++;
                i3++;
                flowArr = flowArr;
            }
            qs2 qs2Var = new qs2() { // from class: androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1.3
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m123invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m123invoke() {
                    Job.DefaultImpls.cancel$default((Job) CompletableJob.this, (CancellationException) null, 1, (Object) null);
                }
            };
            this.label = 1;
            if (ns7Var.F0(qs2Var, this) == h) {
                return h;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
        }
        return ww8.a;
    }
}
