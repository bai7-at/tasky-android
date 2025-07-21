package androidx.paging;

import androidx.paging.PageEvent;
import defpackage.by0;
import defpackage.h4;
import defpackage.qs2;
import defpackage.ww8;
import defpackage.zq3;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes.dex */
final class MulticastedPagingData {
    private final CoroutineScope a;
    private final PagingData b;
    private final CachedPageEventFlow c;

    public MulticastedPagingData(CoroutineScope coroutineScope, PagingData pagingData, h4 h4Var) {
        zq3.h(coroutineScope, "scope");
        zq3.h(pagingData, "parent");
        this.a = coroutineScope;
        this.b = pagingData;
        this.c = new CachedPageEventFlow(pagingData.b(), coroutineScope);
    }

    public final PagingData b() {
        return new PagingData(FlowKt.onCompletion(FlowKt.onStart(this.c.g(), new MulticastedPagingData$asPagingData$1(this, null)), new MulticastedPagingData$asPagingData$2(this, null)), this.b.d(), this.b.c(), new qs2() { // from class: androidx.paging.MulticastedPagingData$asPagingData$3
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final PageEvent.Insert mo865invoke() {
                CachedPageEventFlow cachedPageEventFlow;
                cachedPageEventFlow = MulticastedPagingData.this.c;
                return cachedPageEventFlow.f();
            }
        });
    }

    public final Object c(by0 by0Var) {
        this.c.e();
        return ww8.a;
    }

    public final h4 d() {
        return null;
    }
}
