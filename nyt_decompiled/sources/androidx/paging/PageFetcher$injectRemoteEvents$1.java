package androidx.paging;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ns7;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@fc1(c = "androidx.paging.PageFetcher$injectRemoteEvents$1", f = "PageFetcher.kt", l = {203}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class PageFetcher$injectRemoteEvents$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ p $accessor;
    final /* synthetic */ f $sourceStates;
    final /* synthetic */ PageFetcherSnapshot $this_injectRemoteEvents;
    private /* synthetic */ Object L$0;
    int label;

    static final class a implements FlowCollector {
        final /* synthetic */ ns7 a;

        a(ns7 ns7Var) {
            this.a = ns7Var;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(PageEvent pageEvent, by0 by0Var) {
            Object send = this.a.send(pageEvent, by0Var);
            return send == kotlin.coroutines.intrinsics.a.h() ? send : ww8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PageFetcher$injectRemoteEvents$1(p pVar, PageFetcherSnapshot pageFetcherSnapshot, f fVar, by0 by0Var) {
        super(2, by0Var);
        this.$this_injectRemoteEvents = pageFetcherSnapshot;
        this.$sourceStates = fVar;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(ns7 ns7Var, by0 by0Var) {
        return ((PageFetcher$injectRemoteEvents$1) create(ns7Var, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        PageFetcher$injectRemoteEvents$1 pageFetcher$injectRemoteEvents$1 = new PageFetcher$injectRemoteEvents$1(this.$accessor, this.$this_injectRemoteEvents, this.$sourceStates, by0Var);
        pageFetcher$injectRemoteEvents$1.L$0 = obj;
        return pageFetcher$injectRemoteEvents$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            ns7 ns7Var = (ns7) this.L$0;
            Flow a2 = SimpleChannelFlowKt.a(new PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1(this.$accessor.getState(), this.$this_injectRemoteEvents.u(), null, this.$sourceStates));
            a aVar = new a(ns7Var);
            this.label = 1;
            if (a2.collect(aVar, this) == h) {
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
