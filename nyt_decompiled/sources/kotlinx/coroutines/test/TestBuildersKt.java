package kotlinx.coroutines.test;

import defpackage.by0;
import defpackage.gt2;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.ww8;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.ExperimentalCoroutinesApi;

/* loaded from: classes5.dex */
public final class TestBuildersKt {
    public static final long DEFAULT_DISPATCH_TIMEOUT_MS = 60000;

    public static final void runBlockingTest(CoroutineContext coroutineContext, gt2 gt2Var) {
        TestBuildersKt__TestBuildersDeprecatedKt.runBlockingTest(coroutineContext, gt2Var);
    }

    public static final void runBlockingTestOnTestScope(CoroutineContext coroutineContext, gt2 gt2Var) {
        TestBuildersKt__TestBuildersDeprecatedKt.runBlockingTestOnTestScope(coroutineContext, gt2Var);
    }

    public static final void runTest(CoroutineContext coroutineContext, long j, gt2 gt2Var) {
        TestBuildersKt__TestBuildersKt.runTest(coroutineContext, j, gt2Var);
    }

    /* renamed from: runTest-8Mi8wO0, reason: not valid java name */
    public static final void m956runTest8Mi8wO0(CoroutineContext coroutineContext, long j, gt2 gt2Var) {
        TestBuildersKt__TestBuildersKt.m962runTest8Mi8wO0(coroutineContext, j, gt2Var);
    }

    /* renamed from: runTestCoroutineLegacy-SYHnMyU, reason: not valid java name */
    public static final <T extends AbstractCoroutine<? super ww8>> Object m960runTestCoroutineLegacySYHnMyU(CoroutineScope coroutineScope, T t, long j, ss2 ss2Var, gt2 gt2Var, qs2 qs2Var, by0<? super ww8> by0Var) {
        return TestBuildersKt__TestBuildersKt.m966runTestCoroutineLegacySYHnMyU(coroutineScope, t, j, ss2Var, gt2Var, qs2Var, by0Var);
    }

    @ExperimentalCoroutinesApi
    public static final void runTestWithLegacyScope(CoroutineContext coroutineContext, long j, gt2 gt2Var) {
        TestBuildersKt__TestBuildersDeprecatedKt.runTestWithLegacyScope(coroutineContext, j, gt2Var);
    }

    public static final void throwAll(Throwable th, List<? extends Throwable> list) {
        TestBuildersKt__TestBuildersKt.throwAll(th, list);
    }

    public static final void runBlockingTest(TestCoroutineDispatcher testCoroutineDispatcher, gt2 gt2Var) {
        TestBuildersKt__TestBuildersDeprecatedKt.runBlockingTest(testCoroutineDispatcher, gt2Var);
    }

    @ExperimentalCoroutinesApi
    public static final void runTest(TestCoroutineScope testCoroutineScope, long j, gt2 gt2Var) {
        TestBuildersKt__TestBuildersDeprecatedKt.runTest(testCoroutineScope, j, gt2Var);
    }

    /* renamed from: runTest-8Mi8wO0, reason: not valid java name */
    public static final void m957runTest8Mi8wO0(TestScope testScope, long j, gt2 gt2Var) {
        TestBuildersKt__TestBuildersKt.m963runTest8Mi8wO0(testScope, j, gt2Var);
    }

    public static final void runBlockingTest(TestCoroutineScope testCoroutineScope, gt2 gt2Var) {
        TestBuildersKt__TestBuildersDeprecatedKt.runBlockingTest(testCoroutineScope, gt2Var);
    }

    public static final void runTest(TestScope testScope, long j, gt2 gt2Var) {
        TestBuildersKt__TestBuildersKt.runTest(testScope, j, gt2Var);
    }

    public static final void runBlockingTest(TestScope testScope, gt2 gt2Var) {
        TestBuildersKt__TestBuildersDeprecatedKt.runBlockingTest(testScope, gt2Var);
    }
}
