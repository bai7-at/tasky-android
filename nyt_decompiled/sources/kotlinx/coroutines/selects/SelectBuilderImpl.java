package kotlinx.coroutines.selects;

import defpackage.by0;
import kotlin.Result;
import kotlin.coroutines.intrinsics.a;
import kotlin.f;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;

/* loaded from: classes5.dex */
public final class SelectBuilderImpl<R> extends SelectImplementation<R> {
    private final CancellableContinuationImpl<R> cont;

    public SelectBuilderImpl(by0<? super R> by0Var) {
        super(by0Var.getContext());
        this.cont = new CancellableContinuationImpl<>(a.d(by0Var), 1);
    }

    public final Object getResult() {
        if (this.cont.isCompleted()) {
            return this.cont.getResult();
        }
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(getContext()), null, CoroutineStart.UNDISPATCHED, new SelectBuilderImpl$getResult$1(this, null), 1, null);
        return this.cont.getResult();
    }

    public final void handleBuilderException(Throwable th) {
        CancellableContinuationImpl<R> cancellableContinuationImpl = this.cont;
        Result.a aVar = Result.a;
        cancellableContinuationImpl.resumeWith(Result.b(f.a(th)));
    }
}
