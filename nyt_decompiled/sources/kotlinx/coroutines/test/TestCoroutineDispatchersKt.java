package kotlinx.coroutines.test;

import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.test.internal.TestMainDispatcher;

/* loaded from: classes5.dex */
public final class TestCoroutineDispatchersKt {
    public static final TestDispatcher StandardTestDispatcher(TestCoroutineScheduler testCoroutineScheduler, String str) {
        if (testCoroutineScheduler == null && (testCoroutineScheduler = TestMainDispatcher.Companion.getCurrentTestScheduler$kotlinx_coroutines_test()) == null) {
            testCoroutineScheduler = new TestCoroutineScheduler();
        }
        return new StandardTestDispatcherImpl(testCoroutineScheduler, str);
    }

    public static /* synthetic */ TestDispatcher StandardTestDispatcher$default(TestCoroutineScheduler testCoroutineScheduler, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            testCoroutineScheduler = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return StandardTestDispatcher(testCoroutineScheduler, str);
    }

    @ExperimentalCoroutinesApi
    public static final TestDispatcher UnconfinedTestDispatcher(TestCoroutineScheduler testCoroutineScheduler, String str) {
        if (testCoroutineScheduler == null && (testCoroutineScheduler = TestMainDispatcher.Companion.getCurrentTestScheduler$kotlinx_coroutines_test()) == null) {
            testCoroutineScheduler = new TestCoroutineScheduler();
        }
        return new UnconfinedTestDispatcherImpl(testCoroutineScheduler, str);
    }

    public static /* synthetic */ TestDispatcher UnconfinedTestDispatcher$default(TestCoroutineScheduler testCoroutineScheduler, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            testCoroutineScheduler = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return UnconfinedTestDispatcher(testCoroutineScheduler, str);
    }
}
