package kotlinx.coroutines.flow;

import defpackage.by0;
import defpackage.fc1;
import defpackage.ss2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.time.b;
import kotlinx.coroutines.TimeoutCancellationException;

@fc1(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$2", f = "Delay.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class FlowKt__DelayKt$timeoutInternal$1$1$2 extends SuspendLambda implements ss2 {
    final /* synthetic */ long $timeout;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlowKt__DelayKt$timeoutInternal$1$1$2(long j, by0<? super FlowKt__DelayKt$timeoutInternal$1$1$2> by0Var) {
        super(1, by0Var);
        this.$timeout = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0<ww8> create(by0<?> by0Var) {
        return new FlowKt__DelayKt$timeoutInternal$1$1$2(this.$timeout, by0Var);
    }

    @Override // defpackage.ss2
    public final Object invoke(by0<?> by0Var) {
        return ((FlowKt__DelayKt$timeoutInternal$1$1$2) create(by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        throw new TimeoutCancellationException("Timed out waiting for " + ((Object) b.L(this.$timeout)));
    }
}
