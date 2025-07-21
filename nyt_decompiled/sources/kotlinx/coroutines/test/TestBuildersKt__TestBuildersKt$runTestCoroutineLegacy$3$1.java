package kotlinx.coroutines.test;

import defpackage.by0;
import defpackage.fc1;
import defpackage.ss2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.internal.Ref$BooleanRef;

@fc1(c = "kotlinx.coroutines.test.TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$3$1", f = "TestBuilders.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$3$1 extends SuspendLambda implements ss2 {
    final /* synthetic */ Ref$BooleanRef $completed;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$3$1(Ref$BooleanRef ref$BooleanRef, by0<? super TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$3$1> by0Var) {
        super(1, by0Var);
        this.$completed = ref$BooleanRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0<ww8> create(by0<?> by0Var) {
        return new TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$3$1(this.$completed, by0Var);
    }

    @Override // defpackage.ss2
    public final Object invoke(by0<? super ww8> by0Var) {
        return ((TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$3$1) create(by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        this.$completed.element = true;
        return ww8.a;
    }
}
