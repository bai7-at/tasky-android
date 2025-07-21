package androidx.paging;

import androidx.paging.PageFetcher;
import defpackage.by0;
import defpackage.fc1;
import defpackage.it2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

@fc1(c = "androidx.paging.PageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1", f = "PageFetcher.kt", l = {105}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class PageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1 extends SuspendLambda implements it2 {
    final /* synthetic */ p $remoteMediatorAccessor$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ PageFetcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1(by0 by0Var, PageFetcher pageFetcher, p pVar) {
        super(3, by0Var);
        this.this$0 = pageFetcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Flow j;
        ConflatedEventBus conflatedEventBus;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            PageFetcher.a aVar = (PageFetcher.a) this.L$1;
            j = this.this$0.j(aVar.b(), aVar.a(), this.$remoteMediatorAccessor$inlined);
            Flow onEach = FlowKt.onEach(j, new PageFetcher$flow$1$3$downstreamFlow$1(null));
            PageFetcher pageFetcher = this.this$0;
            conflatedEventBus = pageFetcher.e;
            PagingData pagingData = new PagingData(onEach, new PageFetcher.c(pageFetcher, conflatedEventBus), new PageFetcher.b(this.this$0, aVar.b()), null, 8, null);
            this.label = 1;
            if (flowCollector.emit(pagingData, this) == h) {
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

    @Override // defpackage.it2
    public final Object invoke(FlowCollector flowCollector, Object obj, by0 by0Var) {
        PageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1 pageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1 = new PageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1(by0Var, this.this$0, this.$remoteMediatorAccessor$inlined);
        pageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1.L$0 = flowCollector;
        pageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1.L$1 = obj;
        return pageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1.invokeSuspend(ww8.a);
    }
}
