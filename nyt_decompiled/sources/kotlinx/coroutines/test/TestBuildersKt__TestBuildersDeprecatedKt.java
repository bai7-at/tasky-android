package kotlinx.coroutines.test;

import defpackage.gt2;
import defpackage.qs2;
import java.util.List;
import java.util.Set;
import kotlin.collections.b0;
import kotlin.collections.i;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

/* loaded from: classes5.dex */
final /* synthetic */ class TestBuildersKt__TestBuildersDeprecatedKt {
    public static final void runBlockingTest(CoroutineContext coroutineContext, gt2 gt2Var) {
        Deferred async$default;
        TestCoroutineScope createTestCoroutineScope = TestCoroutineScopeKt.createTestCoroutineScope(new TestCoroutineDispatcher(null, 1, null).plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)).plus(coroutineContext));
        TestCoroutineScheduler testScheduler = createTestCoroutineScope.getTestScheduler();
        async$default = BuildersKt__Builders_commonKt.async$default(createTestCoroutineScope, null, null, new TestBuildersKt__TestBuildersDeprecatedKt$runBlockingTest$deferred$1(gt2Var, createTestCoroutineScope, null), 3, null);
        testScheduler.advanceUntilIdle();
        Throwable completionExceptionOrNull = async$default.getCompletionExceptionOrNull();
        if (completionExceptionOrNull != null) {
            throw completionExceptionOrNull;
        }
        createTestCoroutineScope.mo955cleanupTestCoroutines();
    }

    public static /* synthetic */ void runBlockingTest$default(CoroutineContext coroutineContext, gt2 gt2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.a;
        }
        TestBuildersKt.runBlockingTest(coroutineContext, gt2Var);
    }

    public static final void runBlockingTestOnTestScope(CoroutineContext coroutineContext, gt2 gt2Var) {
        Throwable th;
        List<Throwable> l;
        CoroutineContext plus = new TestCoroutineDispatcher(null, 1, null).plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)).plus(coroutineContext);
        Set<Job> activeJobs = TestCoroutineScopeKt.activeJobs(plus);
        TestScopeImpl asSpecificImplementation = TestScopeKt.asSpecificImplementation(TestScopeKt.TestScope(plus));
        asSpecificImplementation.enter();
        asSpecificImplementation.start(CoroutineStart.UNDISPATCHED, asSpecificImplementation, new TestBuildersKt__TestBuildersDeprecatedKt$runBlockingTestOnTestScope$1(gt2Var, asSpecificImplementation, null));
        asSpecificImplementation.getTestScheduler().advanceUntilIdle();
        try {
            th = asSpecificImplementation.getCompletionExceptionOrNull();
        } catch (IllegalStateException unused) {
            th = null;
        }
        CoroutineScopeKt.cancel$default(asSpecificImplementation.getBackgroundScope(), null, 1, null);
        asSpecificImplementation.getTestScheduler().advanceUntilIdleOr$kotlinx_coroutines_test(new qs2() { // from class: kotlinx.coroutines.test.TestBuildersKt__TestBuildersDeprecatedKt$runBlockingTestOnTestScope$2
            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Boolean mo865invoke() {
                return Boolean.FALSE;
            }
        });
        if (th != null) {
            try {
                l = asSpecificImplementation.legacyLeave();
            } catch (UncompletedCoroutinesError unused2) {
                l = i.l();
            }
            TestBuildersKt.throwAll(th, l);
            return;
        }
        TestBuildersKt.throwAll(null, asSpecificImplementation.legacyLeave());
        Set k = b0.k(TestCoroutineScopeKt.activeJobs(plus), activeJobs);
        if (k.isEmpty()) {
            return;
        }
        throw new UncompletedCoroutinesError("Some jobs were not completed at the end of the test: " + k);
    }

    public static /* synthetic */ void runBlockingTestOnTestScope$default(CoroutineContext coroutineContext, gt2 gt2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.a;
        }
        TestBuildersKt.runBlockingTestOnTestScope(coroutineContext, gt2Var);
    }

    @ExperimentalCoroutinesApi
    public static final void runTest(TestCoroutineScope testCoroutineScope, long j, gt2 gt2Var) {
        TestBuildersKt.runTestWithLegacyScope(testCoroutineScope.getCoroutineContext(), j, gt2Var);
    }

    public static /* synthetic */ void runTest$default(TestCoroutineScope testCoroutineScope, long j, gt2 gt2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 60000;
        }
        TestBuildersKt.runTest(testCoroutineScope, j, gt2Var);
    }

    @ExperimentalCoroutinesApi
    public static final void runTestWithLegacyScope(CoroutineContext coroutineContext, long j, gt2 gt2Var) {
        RunningInRunTest runningInRunTest = RunningInRunTest.INSTANCE;
        if (coroutineContext.get(runningInRunTest) != null) {
            throw new IllegalStateException("Calls to `runTest` can't be nested. Please read the docs on `TestResult` for details.");
        }
        TestBuildersJvmKt.createTestResult(new TestBuildersKt__TestBuildersDeprecatedKt$runTestWithLegacyScope$1(new TestBodyCoroutine(TestCoroutineScopeKt.createTestCoroutineScope(coroutineContext.plus(runningInRunTest))), j, gt2Var, null));
    }

    public static /* synthetic */ void runTestWithLegacyScope$default(CoroutineContext coroutineContext, long j, gt2 gt2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.a;
        }
        if ((i & 2) != 0) {
            j = 60000;
        }
        TestBuildersKt.runTestWithLegacyScope(coroutineContext, j, gt2Var);
    }

    public static final void runBlockingTest(TestCoroutineScope testCoroutineScope, gt2 gt2Var) {
        TestBuildersKt.runBlockingTest(testCoroutineScope.getCoroutineContext(), gt2Var);
    }

    public static final void runBlockingTest(TestScope testScope, gt2 gt2Var) {
        TestBuildersKt.runBlockingTestOnTestScope(testScope.getCoroutineContext(), gt2Var);
    }

    public static final void runBlockingTest(TestCoroutineDispatcher testCoroutineDispatcher, gt2 gt2Var) {
        TestBuildersKt.runBlockingTest((CoroutineContext) testCoroutineDispatcher, gt2Var);
    }
}
