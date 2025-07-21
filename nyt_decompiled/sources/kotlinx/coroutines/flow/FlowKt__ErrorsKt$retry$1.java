package kotlinx.coroutines.flow;

import defpackage.by0;
import defpackage.cc0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$1", f = "Errors.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class FlowKt__ErrorsKt$retry$1 extends SuspendLambda implements gt2 {
    int label;

    FlowKt__ErrorsKt$retry$1(by0<? super FlowKt__ErrorsKt$retry$1> by0Var) {
        super(2, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0<ww8> create(Object obj, by0<?> by0Var) {
        return new FlowKt__ErrorsKt$retry$1(by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        return cc0.a(true);
    }

    @Override // defpackage.gt2
    public final Object invoke(Throwable th, by0<? super Boolean> by0Var) {
        return ((FlowKt__ErrorsKt$retry$1) create(th, by0Var)).invokeSuspend(ww8.a);
    }
}
