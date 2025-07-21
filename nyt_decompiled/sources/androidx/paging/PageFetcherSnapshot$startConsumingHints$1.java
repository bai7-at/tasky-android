package androidx.paging;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.qs2;
import defpackage.ww8;
import defpackage.yn5;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@fc1(c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$1", f = "PageFetcherSnapshot.kt", l = {220}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class PageFetcherSnapshot$startConsumingHints$1 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ PageFetcherSnapshot this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PageFetcherSnapshot$startConsumingHints$1(PageFetcherSnapshot pageFetcherSnapshot, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = pageFetcherSnapshot;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new PageFetcherSnapshot$startConsumingHints$1(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        HintHandler hintHandler;
        HintHandler hintHandler2;
        qs2 qs2Var;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            hintHandler = this.this$0.h;
            Flow c = hintHandler.c(LoadType.APPEND);
            hintHandler2 = this.this$0.h;
            Flow merge = FlowKt.merge(c, hintHandler2.c(LoadType.PREPEND));
            PageFetcherSnapshot$startConsumingHints$1$jumpHint$1 pageFetcherSnapshot$startConsumingHints$1$jumpHint$1 = new PageFetcherSnapshot$startConsumingHints$1$jumpHint$1(this.this$0, null);
            this.label = 1;
            obj = FlowKt.firstOrNull(merge, pageFetcherSnapshot$startConsumingHints$1$jumpHint$1, this);
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
        }
        s sVar = (s) obj;
        if (sVar != null) {
            PageFetcherSnapshot pageFetcherSnapshot = this.this$0;
            yn5 yn5Var = yn5.a;
            if (yn5Var.a(3)) {
                yn5Var.b(3, "Jump triggered on PagingSource " + pageFetcherSnapshot.v() + " by " + sVar, null);
            }
            qs2Var = this.this$0.g;
            qs2Var.mo865invoke();
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((PageFetcherSnapshot$startConsumingHints$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
