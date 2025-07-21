package kotlinx.coroutines.test;

import defpackage.ss2;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.ThreadSafeHeap;
import kotlinx.coroutines.internal.ThreadSafeHeapNode;

/* loaded from: classes5.dex */
public final class TestCoroutineSchedulerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final long addClamping(long j, long j2) {
        long j3 = j + j2;
        if (j3 >= 0) {
            return j3;
        }
        return Long.MAX_VALUE;
    }

    public static final void checkSchedulerInContext(TestCoroutineScheduler testCoroutineScheduler, CoroutineContext coroutineContext) {
        TestCoroutineScheduler testCoroutineScheduler2 = (TestCoroutineScheduler) coroutineContext.get(TestCoroutineScheduler.Key);
        if (testCoroutineScheduler2 != null && testCoroutineScheduler2 != testCoroutineScheduler) {
            throw new IllegalStateException("Detected use of different schedulers. If you need to use several test coroutine dispatchers, create one `TestCoroutineScheduler` and pass it to each of them.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void currentTimeAheadOfEvents() {
        invalidSchedulerState();
        throw new KotlinNothingValueException();
    }

    private static final Void invalidSchedulerState() {
        throw new IllegalStateException("The test scheduler entered an invalid state. Please report this at https://github.com/Kotlin/kotlinx.coroutines/issues.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends ThreadSafeHeapNode & Comparable<? super T>> boolean none(ThreadSafeHeap<T> threadSafeHeap, ss2 ss2Var) {
        return threadSafeHeap.find(ss2Var) == null;
    }
}
