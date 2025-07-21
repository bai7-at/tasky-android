package kotlinx.coroutines.test;

import defpackage.by0;
import defpackage.ss2;
import defpackage.ww8;
import java.util.List;
import java.util.Set;
import kotlin.collections.i;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.c;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.sequences.d;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;

/* loaded from: classes5.dex */
public final class TestCoroutineScopeKt {
    public static final TestCoroutineScope TestCoroutineScope(CoroutineContext coroutineContext) {
        TestCoroutineScheduler testCoroutineScheduler = (TestCoroutineScheduler) coroutineContext.get(TestCoroutineScheduler.Key);
        if (testCoroutineScheduler == null) {
            testCoroutineScheduler = new TestCoroutineScheduler();
        }
        return createTestCoroutineScope(new TestCoroutineDispatcher(testCoroutineScheduler).plus(new TestCoroutineExceptionHandler()).plus(coroutineContext));
    }

    public static /* synthetic */ TestCoroutineScope TestCoroutineScope$default(CoroutineContext coroutineContext, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.a;
        }
        return TestCoroutineScope(coroutineContext);
    }

    public static final Set<Job> activeJobs(CoroutineContext coroutineContext) {
        CoroutineContext.a aVar = coroutineContext.get(Job.Key);
        if (aVar != null) {
            return d.y(d.j(((Job) aVar).getChildren(), new ss2() { // from class: kotlinx.coroutines.test.TestCoroutineScopeKt$activeJobs$1
                @Override // defpackage.ss2
                public final Boolean invoke(Job job) {
                    return Boolean.valueOf(job.isActive());
                }
            }));
        }
        throw new IllegalStateException("Required value was null.");
    }

    @ExperimentalCoroutinesApi
    public static final void advanceTimeBy(TestCoroutineScope testCoroutineScope, long j) {
        c cVar = (c) testCoroutineScope.getCoroutineContext().get(c.P);
        DelayController delayController = cVar instanceof DelayController ? (DelayController) cVar : null;
        if (delayController != null) {
            delayController.advanceTimeBy(j);
        } else {
            testCoroutineScope.getTestScheduler().advanceTimeBy(j);
            testCoroutineScope.getTestScheduler().runCurrent();
        }
    }

    @ExperimentalCoroutinesApi
    public static final void advanceUntilIdle(TestCoroutineScope testCoroutineScope) {
        c cVar = (c) testCoroutineScope.getCoroutineContext().get(c.P);
        DelayController delayController = cVar instanceof DelayController ? (DelayController) cVar : null;
        if (delayController != null) {
            delayController.advanceUntilIdle();
        } else {
            testCoroutineScope.getTestScheduler().advanceUntilIdle();
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [T, kotlinx.coroutines.test.TestCoroutineScope, kotlinx.coroutines.test.TestCoroutineScopeImpl] */
    @ExperimentalCoroutinesApi
    public static final TestCoroutineScope createTestCoroutineScope(CoroutineContext coroutineContext) {
        CoroutineContext withDelaySkipping = TestScopeKt.withDelaySkipping(coroutineContext);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        CoroutineExceptionHandler.Key key = CoroutineExceptionHandler.Key;
        CoroutineContext.a testCoroutineScopeKt$createTestCoroutineScope$ownExceptionHandler$1 = new TestCoroutineScopeKt$createTestCoroutineScope$ownExceptionHandler$1(ref$ObjectRef, key);
        CoroutineContext.a aVar = (CoroutineExceptionHandler) withDelaySkipping.get(key);
        if (aVar instanceof UncaughtExceptionCaptor) {
            testCoroutineScopeKt$createTestCoroutineScope$ownExceptionHandler$1 = aVar;
        } else if (aVar != null && !(aVar instanceof TestCoroutineScopeExceptionHandler)) {
            throw new IllegalArgumentException("A CoroutineExceptionHandler was passed to TestCoroutineScope. Please pass it as an argument to a `launch` or `async` block on an already-created scope if uncaught exceptions require special treatment.");
        }
        CoroutineContext coroutineContext2 = (Job) withDelaySkipping.get(Job.Key);
        if (coroutineContext2 == null) {
            coroutineContext2 = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        }
        ?? testCoroutineScopeImpl = new TestCoroutineScopeImpl(withDelaySkipping.plus(testCoroutineScopeKt$createTestCoroutineScope$ownExceptionHandler$1).plus(coroutineContext2));
        ref$ObjectRef.element = testCoroutineScopeImpl;
        return testCoroutineScopeImpl;
    }

    public static /* synthetic */ TestCoroutineScope createTestCoroutineScope$default(CoroutineContext coroutineContext, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.a;
        }
        return createTestCoroutineScope(coroutineContext);
    }

    public static final long getCurrentTime(TestCoroutineScope testCoroutineScope) {
        c cVar = (c) testCoroutineScope.getCoroutineContext().get(c.P);
        DelayController delayController = cVar instanceof DelayController ? (DelayController) cVar : null;
        return delayController != null ? delayController.getCurrentTime() : testCoroutineScope.getTestScheduler().getCurrentTime();
    }

    @ExperimentalCoroutinesApi
    public static /* synthetic */ void getCurrentTime$annotations(TestCoroutineScope testCoroutineScope) {
    }

    private static final DelayController getDelayController(CoroutineContext coroutineContext) {
        c cVar = (c) coroutineContext.get(c.P);
        if (cVar instanceof DelayController) {
            return (DelayController) cVar;
        }
        return null;
    }

    private static final DelayController getDelayControllerForPausing(TestCoroutineScope testCoroutineScope) {
        c cVar = (c) testCoroutineScope.getCoroutineContext().get(c.P);
        DelayController delayController = cVar instanceof DelayController ? (DelayController) cVar : null;
        if (delayController != null) {
            return delayController;
        }
        throw new IllegalStateException("This scope isn't able to pause its dispatchers");
    }

    public static final List<Throwable> getUncaughtExceptions(TestCoroutineScope testCoroutineScope) {
        List<Throwable> uncaughtExceptions;
        CoroutineContext.a aVar = testCoroutineScope.getCoroutineContext().get(CoroutineExceptionHandler.Key);
        UncaughtExceptionCaptor uncaughtExceptionCaptor = aVar instanceof UncaughtExceptionCaptor ? (UncaughtExceptionCaptor) aVar : null;
        return (uncaughtExceptionCaptor == null || (uncaughtExceptions = uncaughtExceptionCaptor.getUncaughtExceptions()) == null) ? i.l() : uncaughtExceptions;
    }

    public static /* synthetic */ void getUncaughtExceptions$annotations(TestCoroutineScope testCoroutineScope) {
    }

    @ExperimentalCoroutinesApi
    public static final Object pauseDispatcher(TestCoroutineScope testCoroutineScope, ss2 ss2Var, by0<? super ww8> by0Var) {
        Object pauseDispatcher = getDelayControllerForPausing(testCoroutineScope).pauseDispatcher(ss2Var, by0Var);
        return pauseDispatcher == kotlin.coroutines.intrinsics.a.h() ? pauseDispatcher : ww8.a;
    }

    @ExperimentalCoroutinesApi
    public static final void resumeDispatcher(TestCoroutineScope testCoroutineScope) {
        getDelayControllerForPausing(testCoroutineScope).resumeDispatcher();
    }

    @ExperimentalCoroutinesApi
    public static final void runCurrent(TestCoroutineScope testCoroutineScope) {
        c cVar = (c) testCoroutineScope.getCoroutineContext().get(c.P);
        ww8 ww8Var = null;
        DelayController delayController = cVar instanceof DelayController ? (DelayController) cVar : null;
        if (delayController != null) {
            delayController.runCurrent();
            ww8Var = ww8.a;
        }
        if (ww8Var == null) {
            testCoroutineScope.getTestScheduler().runCurrent();
        }
    }

    @ExperimentalCoroutinesApi
    public static final void pauseDispatcher(TestCoroutineScope testCoroutineScope) {
        getDelayControllerForPausing(testCoroutineScope).pauseDispatcher();
    }
}
