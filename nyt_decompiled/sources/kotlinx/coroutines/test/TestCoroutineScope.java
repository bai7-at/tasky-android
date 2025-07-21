package kotlinx.coroutines.test;

import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.ExperimentalCoroutinesApi;

@ExperimentalCoroutinesApi
/* loaded from: classes5.dex */
public interface TestCoroutineScope extends CoroutineScope {

    public static final class DefaultImpls {
        @ExperimentalCoroutinesApi
        public static /* synthetic */ void getTestScheduler$annotations() {
        }
    }

    @ExperimentalCoroutinesApi
    /* renamed from: cleanupTestCoroutines */
    void mo955cleanupTestCoroutines();

    TestCoroutineScheduler getTestScheduler();
}
