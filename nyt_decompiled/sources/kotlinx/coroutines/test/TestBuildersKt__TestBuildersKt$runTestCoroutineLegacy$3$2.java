package kotlinx.coroutines.test;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "kotlinx.coroutines.test.TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$3$2", f = "TestBuilders.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$3$2 extends SuspendLambda implements gt2 {
    int label;

    TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$3$2(by0<? super TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$3$2> by0Var) {
        super(2, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0<ww8> create(Object obj, by0<?> by0Var) {
        return new TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$3$2(by0Var);
    }

    @Override // defpackage.gt2
    public final Object invoke(ww8 ww8Var, by0<? super ww8> by0Var) {
        return ((TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$3$2) create(ww8Var, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        return ww8.a;
    }
}
