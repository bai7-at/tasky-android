package kotlinx.coroutines.test;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "kotlinx.coroutines.test.TestBuildersJvmKt$createTestResult$1", f = "TestBuildersJvm.kt", l = {11}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class TestBuildersJvmKt$createTestResult$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ gt2 $testProcedure;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TestBuildersJvmKt$createTestResult$1(gt2 gt2Var, by0<? super TestBuildersJvmKt$createTestResult$1> by0Var) {
        super(2, by0Var);
        this.$testProcedure = gt2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0<ww8> create(Object obj, by0<?> by0Var) {
        TestBuildersJvmKt$createTestResult$1 testBuildersJvmKt$createTestResult$1 = new TestBuildersJvmKt$createTestResult$1(this.$testProcedure, by0Var);
        testBuildersJvmKt$createTestResult$1.L$0 = obj;
        return testBuildersJvmKt$createTestResult$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            gt2 gt2Var = this.$testProcedure;
            this.label = 1;
            if (gt2Var.invoke(coroutineScope, this) == h) {
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
    public final Object invoke(CoroutineScope coroutineScope, by0<? super ww8> by0Var) {
        return ((TestBuildersJvmKt$createTestResult$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
