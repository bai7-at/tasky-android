package kotlinx.coroutines;

import defpackage.ss2;
import defpackage.ww8;

/* loaded from: classes5.dex */
final class InvokeOnCompletion extends JobNode {
    private final ss2 handler;

    public InvokeOnCompletion(ss2 ss2Var) {
        this.handler = ss2Var;
    }

    @Override // kotlinx.coroutines.JobNode, kotlinx.coroutines.CompletionHandlerBase, defpackage.ss2
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return ww8.a;
    }

    @Override // kotlinx.coroutines.CompletionHandlerBase
    public void invoke(Throwable th) {
        this.handler.invoke(th);
    }
}
