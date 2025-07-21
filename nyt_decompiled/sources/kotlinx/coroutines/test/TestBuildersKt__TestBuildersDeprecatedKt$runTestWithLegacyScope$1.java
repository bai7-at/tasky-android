package kotlinx.coroutines.test;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.ww8;
import java.util.List;
import kotlin.collections.i;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.time.DurationUnit;
import kotlin.time.b;
import kotlin.time.c;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "kotlinx.coroutines.test.TestBuildersKt__TestBuildersDeprecatedKt$runTestWithLegacyScope$1", f = "TestBuildersDeprecated.kt", l = {171}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class TestBuildersKt__TestBuildersDeprecatedKt$runTestWithLegacyScope$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ long $dispatchTimeoutMs;
    final /* synthetic */ gt2 $testBody;
    final /* synthetic */ TestBodyCoroutine $testScope;
    private /* synthetic */ Object L$0;
    int label;

    /* renamed from: kotlinx.coroutines.test.TestBuildersKt__TestBuildersDeprecatedKt$runTestWithLegacyScope$1$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements ss2 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1, TestBodyCoroutine.class, "tryGetCompletionCause", "tryGetCompletionCause()Ljava/lang/Throwable;", 0);
        }

        @Override // defpackage.ss2
        public final Throwable invoke(TestBodyCoroutine testBodyCoroutine) {
            return testBodyCoroutine.tryGetCompletionCause();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TestBuildersKt__TestBuildersDeprecatedKt$runTestWithLegacyScope$1(TestBodyCoroutine testBodyCoroutine, long j, gt2 gt2Var, by0<? super TestBuildersKt__TestBuildersDeprecatedKt$runTestWithLegacyScope$1> by0Var) {
        super(2, by0Var);
        this.$testScope = testBodyCoroutine;
        this.$dispatchTimeoutMs = j;
        this.$testBody = gt2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0<ww8> create(Object obj, by0<?> by0Var) {
        TestBuildersKt__TestBuildersDeprecatedKt$runTestWithLegacyScope$1 testBuildersKt__TestBuildersDeprecatedKt$runTestWithLegacyScope$1 = new TestBuildersKt__TestBuildersDeprecatedKt$runTestWithLegacyScope$1(this.$testScope, this.$dispatchTimeoutMs, this.$testBody, by0Var);
        testBuildersKt__TestBuildersDeprecatedKt$runTestWithLegacyScope$1.L$0 = obj;
        return testBuildersKt__TestBuildersDeprecatedKt$runTestWithLegacyScope$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            TestBodyCoroutine testBodyCoroutine = this.$testScope;
            b.a aVar = b.b;
            long t = c.t(this.$dispatchTimeoutMs, DurationUnit.MILLISECONDS);
            AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
            gt2 gt2Var = this.$testBody;
            final TestBodyCoroutine testBodyCoroutine2 = this.$testScope;
            qs2 qs2Var = new qs2() { // from class: kotlinx.coroutines.test.TestBuildersKt__TestBuildersDeprecatedKt$runTestWithLegacyScope$1.2
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final List<Throwable> mo865invoke() {
                    try {
                        TestBodyCoroutine.this.cleanup();
                        return i.l();
                    } catch (UncompletedCoroutinesError e) {
                        throw e;
                    } catch (Throwable th) {
                        return i.e(th);
                    }
                }
            };
            this.label = 1;
            if (TestBuildersKt.m960runTestCoroutineLegacySYHnMyU(coroutineScope, testBodyCoroutine, t, anonymousClass1, gt2Var, qs2Var, this) == h) {
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
        return ((TestBuildersKt__TestBuildersDeprecatedKt$runTestWithLegacyScope$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
