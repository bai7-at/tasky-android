package kotlinx.coroutines;

import defpackage.by0;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.intrinsics.CancellableKt;

/* loaded from: classes5.dex */
final class LazyStandaloneCoroutine extends StandaloneCoroutine {
    private final by0<ww8> continuation;

    public LazyStandaloneCoroutine(CoroutineContext coroutineContext, gt2 gt2Var) {
        super(coroutineContext, false);
        this.continuation = kotlin.coroutines.intrinsics.a.b(gt2Var, this, this);
    }

    @Override // kotlinx.coroutines.JobSupport
    protected void onStart() {
        CancellableKt.startCoroutineCancellable(this.continuation, this);
    }
}
