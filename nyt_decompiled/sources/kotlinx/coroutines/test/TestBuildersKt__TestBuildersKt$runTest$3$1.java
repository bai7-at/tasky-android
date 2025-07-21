package kotlinx.coroutines.test;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.ww8;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.time.DurationUnit;
import kotlin.time.b;
import kotlin.time.c;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

@fc1(c = "kotlinx.coroutines.test.TestBuildersKt__TestBuildersKt$runTest$3$1", f = "TestBuilders.kt", l = {398}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class TestBuildersKt__TestBuildersKt$runTest$3$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ long $dispatchTimeoutMs;
    final /* synthetic */ TestScopeImpl $it;
    final /* synthetic */ gt2 $testBody;
    final /* synthetic */ TestScope $this_runTest;
    private /* synthetic */ Object L$0;
    int label;

    /* renamed from: kotlinx.coroutines.test.TestBuildersKt__TestBuildersKt$runTest$3$1$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements ss2 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1, TestScopeImpl.class, "tryGetCompletionCause", "tryGetCompletionCause()Ljava/lang/Throwable;", 0);
        }

        @Override // defpackage.ss2
        public final Throwable invoke(TestScopeImpl testScopeImpl) {
            return testScopeImpl.tryGetCompletionCause();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TestBuildersKt__TestBuildersKt$runTest$3$1(TestScopeImpl testScopeImpl, long j, gt2 gt2Var, TestScope testScope, by0<? super TestBuildersKt__TestBuildersKt$runTest$3$1> by0Var) {
        super(2, by0Var);
        this.$it = testScopeImpl;
        this.$dispatchTimeoutMs = j;
        this.$testBody = gt2Var;
        this.$this_runTest = testScope;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0<ww8> create(Object obj, by0<?> by0Var) {
        TestBuildersKt__TestBuildersKt$runTest$3$1 testBuildersKt__TestBuildersKt$runTest$3$1 = new TestBuildersKt__TestBuildersKt$runTest$3$1(this.$it, this.$dispatchTimeoutMs, this.$testBody, this.$this_runTest, by0Var);
        testBuildersKt__TestBuildersKt$runTest$3$1.L$0 = obj;
        return testBuildersKt__TestBuildersKt$runTest$3$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            TestScopeImpl testScopeImpl = this.$it;
            b.a aVar = b.b;
            long t = c.t(this.$dispatchTimeoutMs, DurationUnit.MILLISECONDS);
            AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
            gt2 gt2Var = this.$testBody;
            final TestScope testScope = this.$this_runTest;
            final TestScopeImpl testScopeImpl2 = this.$it;
            qs2 qs2Var = new qs2() { // from class: kotlinx.coroutines.test.TestBuildersKt__TestBuildersKt$runTest$3$1.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final List<Throwable> mo865invoke() {
                    CoroutineScopeKt.cancel$default(TestScope.this.getBackgroundScope(), null, 1, null);
                    TestScope.this.getTestScheduler().advanceUntilIdleOr$kotlinx_coroutines_test(new qs2() { // from class: kotlinx.coroutines.test.TestBuildersKt__TestBuildersKt.runTest.3.1.2.1
                        @Override // defpackage.qs2
                        /* renamed from: invoke */
                        public final Boolean mo865invoke() {
                            return Boolean.FALSE;
                        }
                    });
                    return testScopeImpl2.legacyLeave();
                }
            };
            this.label = 1;
            if (TestBuildersKt.m960runTestCoroutineLegacySYHnMyU(coroutineScope, testScopeImpl, t, anonymousClass1, gt2Var, qs2Var, this) == h) {
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
        return ((TestBuildersKt__TestBuildersKt$runTest$3$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
