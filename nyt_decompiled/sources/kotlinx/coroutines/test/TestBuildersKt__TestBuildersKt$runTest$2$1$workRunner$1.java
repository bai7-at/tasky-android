package kotlinx.coroutines.test;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.qs2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.YieldKt;

@fc1(c = "kotlinx.coroutines.test.TestBuildersKt__TestBuildersKt$runTest$2$1$workRunner$1", f = "TestBuilders.kt", l = {326, 329}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class TestBuildersKt__TestBuildersKt$runTest$2$1$workRunner$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ TestScope $this_runTest;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TestBuildersKt__TestBuildersKt$runTest$2$1$workRunner$1(TestScope testScope, by0<? super TestBuildersKt__TestBuildersKt$runTest$2$1$workRunner$1> by0Var) {
        super(2, by0Var);
        this.$this_runTest = testScope;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0<ww8> create(Object obj, by0<?> by0Var) {
        TestBuildersKt__TestBuildersKt$runTest$2$1$workRunner$1 testBuildersKt__TestBuildersKt$runTest$2$1$workRunner$1 = new TestBuildersKt__TestBuildersKt$runTest$2$1$workRunner$1(this.$this_runTest, by0Var);
        testBuildersKt__TestBuildersKt$runTest$2$1$workRunner$1.L$0 = obj;
        return testBuildersKt__TestBuildersKt$runTest$2$1$workRunner$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        final CoroutineScope coroutineScope;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            coroutineScope = (CoroutineScope) this.L$0;
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope = (CoroutineScope) this.L$0;
            f.b(obj);
        }
        while (true) {
            if (this.$this_runTest.getTestScheduler().tryRunNextTaskUnless$kotlinx_coroutines_test(new qs2() { // from class: kotlinx.coroutines.test.TestBuildersKt__TestBuildersKt$runTest$2$1$workRunner$1$executedSomething$1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final Boolean mo865invoke() {
                    return Boolean.valueOf(!CoroutineScopeKt.isActive(CoroutineScope.this));
                }
            })) {
                this.L$0 = coroutineScope;
                this.label = 1;
                if (YieldKt.yield(this) == h) {
                    return h;
                }
            } else {
                TestCoroutineScheduler testScheduler = this.$this_runTest.getTestScheduler();
                this.L$0 = coroutineScope;
                this.label = 2;
                if (testScheduler.receiveDispatchEvent$kotlinx_coroutines_test(this) == h) {
                    return h;
                }
            }
        }
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0<? super ww8> by0Var) {
        return ((TestBuildersKt__TestBuildersKt$runTest$2$1$workRunner$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
