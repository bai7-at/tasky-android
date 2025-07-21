package kotlinx.coroutines.test;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.AbstractCoroutine;

@fc1(c = "kotlinx.coroutines.test.TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$2", f = "TestBuilders.kt", l = {456}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ gt2 $testBody;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$2(gt2 gt2Var, by0<? super TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$2> by0Var) {
        super(2, by0Var);
        this.$testBody = gt2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0<ww8> create(Object obj, by0<?> by0Var) {
        TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$2 testBuildersKt__TestBuildersKt$runTestCoroutineLegacy$2 = new TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$2(this.$testBody, by0Var);
        testBuildersKt__TestBuildersKt$runTestCoroutineLegacy$2.L$0 = obj;
        return testBuildersKt__TestBuildersKt$runTestCoroutineLegacy$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            AbstractCoroutine abstractCoroutine = (AbstractCoroutine) this.L$0;
            gt2 gt2Var = this.$testBody;
            this.label = 1;
            if (gt2Var.invoke(abstractCoroutine, this) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return ww8.a;
    }

    /* JADX WARN: Incorrect types in method signature: (TT;Lby0<-Lww8;>;)Ljava/lang/Object; */
    @Override // defpackage.gt2
    public final Object invoke(AbstractCoroutine abstractCoroutine, by0 by0Var) {
        return ((TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$2) create(abstractCoroutine, by0Var)).invokeSuspend(ww8.a);
    }
}
