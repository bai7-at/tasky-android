package androidx.paging.compose;

import androidx.compose.runtime.b0;
import androidx.compose.ui.platform.AndroidUiDispatcher;
import androidx.paging.PagingData;
import androidx.paging.PagingDataPresenter;
import androidx.paging.d;
import androidx.paging.e;
import androidx.paging.k;
import defpackage.by0;
import defpackage.dp0;
import defpackage.rr3;
import defpackage.sy4;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.collections.i;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;

/* loaded from: classes.dex */
public final class LazyPagingItems {
    public static final int f = 8;
    private final Flow a;
    private final CoroutineContext b;
    private final b c;
    private final sy4 d;
    private final sy4 e;

    static final class a implements FlowCollector {
        a() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(dp0 dp0Var, by0 by0Var) {
            LazyPagingItems.this.k(dp0Var);
            return ww8.a;
        }
    }

    public static final class b extends PagingDataPresenter {
        b(CoroutineContext coroutineContext, PagingData pagingData) {
            super(coroutineContext, pagingData);
        }

        @Override // androidx.paging.PagingDataPresenter
        public Object q(k kVar, by0 by0Var) {
            LazyPagingItems.this.l();
            return ww8.a;
        }
    }

    public LazyPagingItems(Flow flow) {
        e eVar;
        e eVar2;
        e eVar3;
        e eVar4;
        zq3.h(flow, "flow");
        this.a = flow;
        CoroutineContext b2 = AndroidUiDispatcher.k.b();
        this.b = b2;
        b bVar = new b(b2, flow instanceof SharedFlow ? (PagingData) i.m0(((SharedFlow) flow).getReplayCache()) : null);
        this.c = bVar;
        this.d = b0.e(bVar.r(), null, 2, null);
        dp0 dp0Var = (dp0) bVar.o().getValue();
        if (dp0Var == null) {
            eVar = LazyPagingItemsKt.b;
            d f2 = eVar.f();
            eVar2 = LazyPagingItemsKt.b;
            d e = eVar2.e();
            eVar3 = LazyPagingItemsKt.b;
            d d = eVar3.d();
            eVar4 = LazyPagingItemsKt.b;
            dp0Var = new dp0(f2, e, d, eVar4, null, 16, null);
        }
        this.e = b0.e(dp0Var, null, 2, null);
    }

    private final void j(rr3 rr3Var) {
        this.d.setValue(rr3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(dp0 dp0Var) {
        this.e.setValue(dp0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l() {
        j(this.c.r());
    }

    public final Object d(by0 by0Var) {
        Object collect = FlowKt.filterNotNull(this.c.o()).collect(new a(), by0Var);
        return collect == kotlin.coroutines.intrinsics.a.h() ? collect : ww8.a;
    }

    public final Object e(by0 by0Var) {
        Object collectLatest = FlowKt.collectLatest(this.a, new LazyPagingItems$collectPagingData$2(this, null), by0Var);
        return collectLatest == kotlin.coroutines.intrinsics.a.h() ? collectLatest : ww8.a;
    }

    public final Object f(int i) {
        this.c.n(i);
        return h().get(i);
    }

    public final int g() {
        return h().size();
    }

    public final rr3 h() {
        return (rr3) this.d.getValue();
    }

    public final dp0 i() {
        return (dp0) this.e.getValue();
    }
}
