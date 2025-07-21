package kotlinx.coroutines.test;

import kotlinx.coroutines.ExperimentalCoroutinesApi;

/* loaded from: classes5.dex */
public interface SchedulerAsDelayController extends DelayController {

    public static final class DefaultImpls {
        public static long advanceTimeBy(SchedulerAsDelayController schedulerAsDelayController, long j) {
            long currentTime = schedulerAsDelayController.getScheduler().getCurrentTime();
            schedulerAsDelayController.getScheduler().advanceTimeBy(j);
            schedulerAsDelayController.getScheduler().runCurrent();
            return schedulerAsDelayController.getScheduler().getCurrentTime() - currentTime;
        }

        public static long advanceUntilIdle(SchedulerAsDelayController schedulerAsDelayController) {
            long currentTime = schedulerAsDelayController.getScheduler().getCurrentTime();
            schedulerAsDelayController.getScheduler().advanceUntilIdle();
            return schedulerAsDelayController.getScheduler().getCurrentTime() - currentTime;
        }

        @ExperimentalCoroutinesApi
        public static void cleanupTestCoroutines(SchedulerAsDelayController schedulerAsDelayController) {
            schedulerAsDelayController.getScheduler().runCurrent();
            if (!schedulerAsDelayController.getScheduler().isIdle$kotlinx_coroutines_test(false)) {
                throw new UncompletedCoroutinesError("Unfinished coroutines during tear-down. Ensure all coroutines are completed or cancelled by your test.");
            }
        }

        public static long getCurrentTime(SchedulerAsDelayController schedulerAsDelayController) {
            return schedulerAsDelayController.getScheduler().getCurrentTime();
        }

        public static /* synthetic */ void getCurrentTime$annotations() {
        }

        public static void runCurrent(SchedulerAsDelayController schedulerAsDelayController) {
            schedulerAsDelayController.getScheduler().runCurrent();
        }
    }

    @Override // kotlinx.coroutines.test.DelayController
    long advanceTimeBy(long j);

    @Override // kotlinx.coroutines.test.DelayController
    long advanceUntilIdle();

    @Override // kotlinx.coroutines.test.DelayController
    @ExperimentalCoroutinesApi
    void cleanupTestCoroutines();

    @Override // kotlinx.coroutines.test.DelayController
    long getCurrentTime();

    TestCoroutineScheduler getScheduler();

    @Override // kotlinx.coroutines.test.DelayController
    void runCurrent();
}
