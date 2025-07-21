package kotlinx.coroutines.test;

import defpackage.ww8;
import kotlinx.coroutines.AbstractCoroutine;

/* loaded from: classes5.dex */
final class TestBodyCoroutine extends AbstractCoroutine<ww8> implements TestCoroutineScope {
    private final TestCoroutineScope testScope;

    public TestBodyCoroutine(TestCoroutineScope testCoroutineScope) {
        super(testCoroutineScope.getCoroutineContext(), true, true);
        this.testScope = testCoroutineScope;
    }

    public final void cleanup() {
        this.testScope.mo955cleanupTestCoroutines();
    }

    @Override // kotlinx.coroutines.test.TestCoroutineScope
    public TestCoroutineScheduler getTestScheduler() {
        return this.testScope.getTestScheduler();
    }

    public final Throwable tryGetCompletionCause() {
        return getCompletionCause();
    }

    @Override // kotlinx.coroutines.test.TestCoroutineScope
    /* renamed from: cleanupTestCoroutines, reason: merged with bridge method [inline-methods] */
    public Void mo955cleanupTestCoroutines() {
        throw new UnsupportedOperationException("Calling `cleanupTestCoroutines` inside `runTest` is prohibited: it will be called at the end of the test in any case.");
    }
}
