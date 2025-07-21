package androidx.paging;

import defpackage.by0;
import defpackage.qs2;
import defpackage.zq3;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;

/* loaded from: classes.dex */
public final class SuspendingPagingSourceFactory implements qs2 {
    private final CoroutineDispatcher a;
    private final qs2 b;

    public SuspendingPagingSourceFactory(CoroutineDispatcher coroutineDispatcher, qs2 qs2Var) {
        zq3.h(coroutineDispatcher, "dispatcher");
        zq3.h(qs2Var, "delegate");
        this.a = coroutineDispatcher;
        this.b = qs2Var;
    }

    public final Object c(by0 by0Var) {
        return BuildersKt.withContext(this.a, new SuspendingPagingSourceFactory$create$2(this, null), by0Var);
    }

    @Override // defpackage.qs2
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public PagingSource mo865invoke() {
        return (PagingSource) this.b.mo865invoke();
    }
}
