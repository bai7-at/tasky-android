package kotlinx.coroutines.test;

import defpackage.ss2;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.test.SchedulerAsDelayController;

/* loaded from: classes5.dex */
public final class TestCoroutineDispatcher extends TestDispatcher implements Delay, SchedulerAsDelayController {
    private boolean dispatchImmediately;
    private final TestCoroutineScheduler scheduler;

    /* JADX WARN: Multi-variable type inference failed */
    public TestCoroutineDispatcher() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final DisposableHandle post(Runnable runnable, CoroutineContext coroutineContext) {
        return getScheduler().registerEvent$kotlinx_coroutines_test(this, 0L, runnable, coroutineContext, new ss2() { // from class: kotlinx.coroutines.test.TestCoroutineDispatcher$post$1
            @Override // defpackage.ss2
            public final Boolean invoke(Runnable runnable2) {
                return Boolean.FALSE;
            }
        });
    }

    private final void setDispatchImmediately(boolean z) {
        this.dispatchImmediately = z;
        if (z) {
            getScheduler().advanceUntilIdle();
        }
    }

    @Override // kotlinx.coroutines.test.SchedulerAsDelayController, kotlinx.coroutines.test.DelayController
    public long advanceTimeBy(long j) {
        return SchedulerAsDelayController.DefaultImpls.advanceTimeBy(this, j);
    }

    @Override // kotlinx.coroutines.test.SchedulerAsDelayController, kotlinx.coroutines.test.DelayController
    public long advanceUntilIdle() {
        return SchedulerAsDelayController.DefaultImpls.advanceUntilIdle(this);
    }

    @Override // kotlinx.coroutines.test.SchedulerAsDelayController, kotlinx.coroutines.test.DelayController
    @ExperimentalCoroutinesApi
    public void cleanupTestCoroutines() {
        SchedulerAsDelayController.DefaultImpls.cleanupTestCoroutines(this);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: dispatch */
    public void mo937dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        TestCoroutineSchedulerKt.checkSchedulerInContext(getScheduler(), coroutineContext);
        if (!this.dispatchImmediately) {
            post(runnable, coroutineContext);
        } else {
            getScheduler().sendDispatchEvent$kotlinx_coroutines_test(coroutineContext);
            runnable.run();
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatchYield(CoroutineContext coroutineContext, Runnable runnable) {
        TestCoroutineSchedulerKt.checkSchedulerInContext(getScheduler(), coroutineContext);
        post(runnable, coroutineContext);
    }

    @Override // kotlinx.coroutines.test.SchedulerAsDelayController, kotlinx.coroutines.test.DelayController
    public long getCurrentTime() {
        return SchedulerAsDelayController.DefaultImpls.getCurrentTime(this);
    }

    @Override // kotlinx.coroutines.test.TestDispatcher
    public TestCoroutineScheduler getScheduler() {
        return this.scheduler;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.test.DelayController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object pauseDispatcher(defpackage.ss2 r6, defpackage.by0<? super defpackage.ww8> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.test.TestCoroutineDispatcher$pauseDispatcher$1
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.test.TestCoroutineDispatcher$pauseDispatcher$1 r0 = (kotlinx.coroutines.test.TestCoroutineDispatcher$pauseDispatcher$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.test.TestCoroutineDispatcher$pauseDispatcher$1 r0 = new kotlinx.coroutines.test.TestCoroutineDispatcher$pauseDispatcher$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            boolean r5 = r0.Z$0
            java.lang.Object r6 = r0.L$0
            kotlinx.coroutines.test.TestCoroutineDispatcher r6 = (kotlinx.coroutines.test.TestCoroutineDispatcher) r6
            kotlin.f.b(r7)     // Catch: java.lang.Throwable -> L31
            r7 = r5
            r5 = r6
            goto L55
        L31:
            r7 = move-exception
            r4 = r7
            r7 = r5
            r5 = r6
            r6 = r4
            goto L5c
        L37:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3f:
            kotlin.f.b(r7)
            boolean r7 = r5.dispatchImmediately
            r2 = 0
            r5.setDispatchImmediately(r2)
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L5b
            r0.Z$0 = r7     // Catch: java.lang.Throwable -> L5b
            r0.label = r3     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r6 = r6.invoke(r0)     // Catch: java.lang.Throwable -> L5b
            if (r6 != r1) goto L55
            return r1
        L55:
            r5.setDispatchImmediately(r7)
            ww8 r5 = defpackage.ww8.a
            return r5
        L5b:
            r6 = move-exception
        L5c:
            r5.setDispatchImmediately(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.test.TestCoroutineDispatcher.pauseDispatcher(ss2, by0):java.lang.Object");
    }

    @Override // kotlinx.coroutines.test.DelayController
    public void resumeDispatcher() {
        setDispatchImmediately(true);
    }

    @Override // kotlinx.coroutines.test.SchedulerAsDelayController, kotlinx.coroutines.test.DelayController
    public void runCurrent() {
        SchedulerAsDelayController.DefaultImpls.runCurrent(this);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        return "TestCoroutineDispatcher[scheduler=" + getScheduler() + ']';
    }

    public /* synthetic */ TestCoroutineDispatcher(TestCoroutineScheduler testCoroutineScheduler, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new TestCoroutineScheduler() : testCoroutineScheduler);
    }

    public TestCoroutineDispatcher(TestCoroutineScheduler testCoroutineScheduler) {
        this.scheduler = testCoroutineScheduler;
        this.dispatchImmediately = true;
    }

    @Override // kotlinx.coroutines.test.DelayController
    public void pauseDispatcher() {
        setDispatchImmediately(false);
    }
}
