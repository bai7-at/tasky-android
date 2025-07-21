package androidx.room;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import java.util.concurrent.Callable;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "androidx.room.CoroutinesRoom$Companion$execute$4$job$1", f = "CoroutinesRoom.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class CoroutinesRoom$Companion$execute$4$job$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ Callable<Object> $callable;
    final /* synthetic */ CancellableContinuation<Object> $continuation;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CoroutinesRoom$Companion$execute$4$job$1(Callable callable, CancellableContinuation cancellableContinuation, by0 by0Var) {
        super(2, by0Var);
        this.$callable = callable;
        this.$continuation = cancellableContinuation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new CoroutinesRoom$Companion$execute$4$job$1(this.$callable, this.$continuation, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.f.b(obj);
        try {
            this.$continuation.resumeWith(Result.b(this.$callable.call()));
        } catch (Throwable th) {
            CancellableContinuation<Object> cancellableContinuation = this.$continuation;
            Result.a aVar = Result.a;
            cancellableContinuation.resumeWith(Result.b(kotlin.f.a(th)));
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((CoroutinesRoom$Companion$execute$4$job$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
