package kotlinx.coroutines;

import defpackage.by0;
import defpackage.ww8;
import kotlin.Result;

/* loaded from: classes5.dex */
final class ResumeOnCompletion extends JobNode {
    private final by0<ww8> continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public ResumeOnCompletion(by0<? super ww8> by0Var) {
        this.continuation = by0Var;
    }

    @Override // kotlinx.coroutines.JobNode, kotlinx.coroutines.CompletionHandlerBase, defpackage.ss2
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return ww8.a;
    }

    @Override // kotlinx.coroutines.CompletionHandlerBase
    public void invoke(Throwable th) {
        by0<ww8> by0Var = this.continuation;
        Result.a aVar = Result.a;
        by0Var.resumeWith(Result.b(ww8.a));
    }
}
