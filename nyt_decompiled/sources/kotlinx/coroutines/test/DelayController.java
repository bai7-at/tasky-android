package kotlinx.coroutines.test;

import defpackage.by0;
import defpackage.ss2;
import defpackage.ww8;
import kotlinx.coroutines.ExperimentalCoroutinesApi;

@ExperimentalCoroutinesApi
/* loaded from: classes5.dex */
public interface DelayController {

    public static final class DefaultImpls {
        @ExperimentalCoroutinesApi
        public static /* synthetic */ void getCurrentTime$annotations() {
        }
    }

    @ExperimentalCoroutinesApi
    long advanceTimeBy(long j);

    @ExperimentalCoroutinesApi
    long advanceUntilIdle();

    @ExperimentalCoroutinesApi
    void cleanupTestCoroutines() throws AssertionError;

    long getCurrentTime();

    Object pauseDispatcher(ss2 ss2Var, by0<? super ww8> by0Var);

    void pauseDispatcher();

    void resumeDispatcher();

    @ExperimentalCoroutinesApi
    void runCurrent();
}
