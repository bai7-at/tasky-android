package kotlinx.coroutines.test;

import defpackage.im8;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.c;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.ExperimentalCoroutinesApi;

/* loaded from: classes5.dex */
public final class TestScopeKt {
    private static boolean catchNonTestRelatedExceptions = true;

    /* JADX WARN: Type inference failed for: r1v1, types: [T, kotlinx.coroutines.test.TestScope, kotlinx.coroutines.test.TestScopeImpl] */
    public static final TestScope TestScope(CoroutineContext coroutineContext) {
        CoroutineContext withDelaySkipping = withDelaySkipping(coroutineContext);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        CoroutineExceptionHandler.Key key = CoroutineExceptionHandler.Key;
        if (((CoroutineExceptionHandler) withDelaySkipping.get(key)) != null) {
            throw new IllegalArgumentException("A CoroutineExceptionHandler was passed to TestScope. Please pass it as an argument to a `launch` or `async` block on an already-created scope if uncaught exceptions require special treatment.");
        }
        ?? testScopeImpl = new TestScopeImpl(withDelaySkipping.plus(new TestScopeKt$TestScope$$inlined$CoroutineExceptionHandler$1(key, ref$ObjectRef)));
        ref$ObjectRef.element = testScopeImpl;
        return testScopeImpl;
    }

    public static /* synthetic */ TestScope TestScope$default(CoroutineContext coroutineContext, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.a;
        }
        return TestScope(coroutineContext);
    }

    @ExperimentalCoroutinesApi
    public static final void advanceTimeBy(TestScope testScope, long j) {
        testScope.getTestScheduler().advanceTimeBy(j);
    }

    @ExperimentalCoroutinesApi
    /* renamed from: advanceTimeBy-HG0u8IE, reason: not valid java name */
    public static final void m969advanceTimeByHG0u8IE(TestScope testScope, long j) {
        testScope.getTestScheduler().m968advanceTimeByLRDsOJo(j);
    }

    @ExperimentalCoroutinesApi
    public static final void advanceUntilIdle(TestScope testScope) {
        testScope.getTestScheduler().advanceUntilIdle();
    }

    public static final TestScopeImpl asSpecificImplementation(TestScope testScope) {
        if (testScope instanceof TestScopeImpl) {
            return (TestScopeImpl) testScope;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean getCatchNonTestRelatedExceptions() {
        return catchNonTestRelatedExceptions;
    }

    public static /* synthetic */ void getCatchNonTestRelatedExceptions$annotations() {
    }

    public static final long getCurrentTime(TestScope testScope) {
        return testScope.getTestScheduler().getCurrentTime();
    }

    @ExperimentalCoroutinesApi
    public static /* synthetic */ void getCurrentTime$annotations(TestScope testScope) {
    }

    public static final im8 getTestTimeSource(TestScope testScope) {
        return testScope.getTestScheduler().getTimeSource();
    }

    @ExperimentalCoroutinesApi
    public static /* synthetic */ void getTestTimeSource$annotations(TestScope testScope) {
    }

    @ExperimentalCoroutinesApi
    public static final void runCurrent(TestScope testScope) {
        testScope.getTestScheduler().runCurrent();
    }

    public static final void setCatchNonTestRelatedExceptions(boolean z) {
        catchNonTestRelatedExceptions = z;
    }

    public static final CoroutineContext withDelaySkipping(CoroutineContext coroutineContext) {
        TestDispatcher StandardTestDispatcher$default;
        c cVar = (c) coroutineContext.get(c.P);
        if (cVar instanceof TestDispatcher) {
            TestCoroutineScheduler testCoroutineScheduler = (TestCoroutineScheduler) coroutineContext.get(TestCoroutineScheduler.Key);
            if (testCoroutineScheduler != null && ((TestDispatcher) cVar).getScheduler() != testCoroutineScheduler) {
                throw new IllegalArgumentException(("Both a TestCoroutineScheduler " + testCoroutineScheduler + " and TestDispatcher " + cVar + " linked to another scheduler were passed.").toString());
            }
            StandardTestDispatcher$default = (TestDispatcher) cVar;
        } else {
            if (cVar != null) {
                throw new IllegalArgumentException("Dispatcher must implement TestDispatcher: " + cVar);
            }
            StandardTestDispatcher$default = TestCoroutineDispatchersKt.StandardTestDispatcher$default((TestCoroutineScheduler) coroutineContext.get(TestCoroutineScheduler.Key), null, 2, null);
        }
        return coroutineContext.plus(StandardTestDispatcher$default).plus(StandardTestDispatcher$default.getScheduler());
    }
}
