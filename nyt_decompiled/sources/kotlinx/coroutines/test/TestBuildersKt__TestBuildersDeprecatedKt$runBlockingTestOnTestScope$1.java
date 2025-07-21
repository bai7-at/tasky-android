package kotlinx.coroutines.test;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "kotlinx.coroutines.test.TestBuildersKt__TestBuildersDeprecatedKt$runBlockingTestOnTestScope$1", f = "TestBuildersDeprecated.kt", l = {87}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class TestBuildersKt__TestBuildersDeprecatedKt$runBlockingTestOnTestScope$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ TestScopeImpl $scope;
    final /* synthetic */ gt2 $testBody;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TestBuildersKt__TestBuildersDeprecatedKt$runBlockingTestOnTestScope$1(gt2 gt2Var, TestScopeImpl testScopeImpl, by0<? super TestBuildersKt__TestBuildersDeprecatedKt$runBlockingTestOnTestScope$1> by0Var) {
        super(2, by0Var);
        this.$testBody = gt2Var;
        this.$scope = testScopeImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0<ww8> create(Object obj, by0<?> by0Var) {
        return new TestBuildersKt__TestBuildersDeprecatedKt$runBlockingTestOnTestScope$1(this.$testBody, this.$scope, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            gt2 gt2Var = this.$testBody;
            TestScopeImpl testScopeImpl = this.$scope;
            this.label = 1;
            if (gt2Var.invoke(testScopeImpl, this) == h) {
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

    @Override // defpackage.gt2
    public final Object invoke(TestScopeImpl testScopeImpl, by0<? super ww8> by0Var) {
        return ((TestBuildersKt__TestBuildersDeprecatedKt$runBlockingTestOnTestScope$1) create(testScopeImpl, by0Var)).invokeSuspend(ww8.a);
    }
}
