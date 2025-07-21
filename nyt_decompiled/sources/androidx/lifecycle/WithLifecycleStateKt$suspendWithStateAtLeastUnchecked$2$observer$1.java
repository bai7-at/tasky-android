package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import defpackage.d44;
import defpackage.qs2;
import defpackage.zq3;
import kotlin.Result;
import kotlinx.coroutines.CancellableContinuation;

/* loaded from: classes.dex */
public final class WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 implements g {
    final /* synthetic */ Lifecycle.State a;
    final /* synthetic */ Lifecycle b;
    final /* synthetic */ CancellableContinuation c;
    final /* synthetic */ qs2 d;

    @Override // androidx.lifecycle.g
    public void h(d44 d44Var, Lifecycle.Event event) {
        Object b;
        zq3.h(d44Var, "source");
        zq3.h(event, "event");
        if (event != Lifecycle.Event.Companion.d(this.a)) {
            if (event == Lifecycle.Event.ON_DESTROY) {
                this.b.d(this);
                CancellableContinuation cancellableContinuation = this.c;
                Result.a aVar = Result.a;
                cancellableContinuation.resumeWith(Result.b(kotlin.f.a(new LifecycleDestroyedException())));
                return;
            }
            return;
        }
        this.b.d(this);
        CancellableContinuation cancellableContinuation2 = this.c;
        qs2 qs2Var = this.d;
        try {
            Result.a aVar2 = Result.a;
            b = Result.b(qs2Var.mo865invoke());
        } catch (Throwable th) {
            Result.a aVar3 = Result.a;
            b = Result.b(kotlin.f.a(th));
        }
        cancellableContinuation2.resumeWith(b);
    }
}
