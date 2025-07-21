package kotlinx.coroutines.test;

import defpackage.g62;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.sequences.d;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.internal.CoroutineExceptionHandlerImplKt;
import kotlinx.coroutines.test.internal.ExceptionCollector;
import kotlinx.coroutines.test.internal.ReportingSupervisorJob;

/* loaded from: classes5.dex */
public final class TestScopeImpl extends AbstractCoroutine<ww8> implements TestScope {
    private final CoroutineScope backgroundScope;
    private boolean entered;
    private boolean finished;
    private final Object lock;
    private final List<Throwable> uncaughtExceptions;

    public TestScopeImpl(CoroutineContext coroutineContext) {
        super(coroutineContext, true, true);
        this.uncaughtExceptions = new ArrayList();
        this.lock = new Object();
        this.backgroundScope = CoroutineScopeKt.CoroutineScope(getCoroutineContext().plus(BackgroundWork.INSTANCE).plus(new ReportingSupervisorJob(null, new ss2() { // from class: kotlinx.coroutines.test.TestScopeImpl$backgroundScope$1
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return ww8.a;
            }

            public final void invoke(Throwable th) {
                if (th instanceof CancellationException) {
                    return;
                }
                TestScopeImpl.this.reportException(th);
            }
        }, 1, null)));
    }

    public final void enter() {
        ExceptionCollector exceptionCollector;
        List<Throwable> list;
        synchronized (this.lock) {
            try {
                if (this.entered) {
                    throw new IllegalStateException("Only a single call to `runTest` can be performed during one test.");
                }
                this.entered = true;
                if (this.finished) {
                    throw new IllegalStateException("Check failed.");
                }
                exceptionCollector = ExceptionCollector.INSTANCE;
                CoroutineExceptionHandlerImplKt.ensurePlatformExceptionHandlerLoaded(exceptionCollector);
                if (TestScopeKt.getCatchNonTestRelatedExceptions()) {
                    exceptionCollector.addOnExceptionCallback(this.lock, new TestScopeImpl$enter$exceptions$1$2(this));
                }
                list = this.uncaughtExceptions;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (list.isEmpty()) {
            return;
        }
        exceptionCollector.removeOnExceptionCallback(this.lock);
        UncaughtExceptionsBeforeTest uncaughtExceptionsBeforeTest = new UncaughtExceptionsBeforeTest();
        Iterator<Throwable> it2 = list.iterator();
        while (it2.hasNext()) {
            g62.a(uncaughtExceptionsBeforeTest, it2.next());
        }
        throw uncaughtExceptionsBeforeTest;
    }

    @Override // kotlinx.coroutines.test.TestScope
    public CoroutineScope getBackgroundScope() {
        return this.backgroundScope;
    }

    @Override // kotlinx.coroutines.test.TestScope
    public TestCoroutineScheduler getTestScheduler() {
        CoroutineContext.a aVar = getContext().get(TestCoroutineScheduler.Key);
        zq3.e(aVar);
        return (TestCoroutineScheduler) aVar;
    }

    public final List<Throwable> leave() {
        List<Throwable> list;
        synchronized (this.lock) {
            if (!this.entered || this.finished) {
                throw new IllegalStateException("Check failed.");
            }
            ExceptionCollector.INSTANCE.removeOnExceptionCallback(this.lock);
            this.finished = true;
            list = this.uncaughtExceptions;
        }
        return list;
    }

    public final List<Throwable> legacyLeave() {
        List<Throwable> list;
        synchronized (this.lock) {
            if (!this.entered || this.finished) {
                throw new IllegalStateException("Check failed.");
            }
            ExceptionCollector.INSTANCE.removeOnExceptionCallback(this.lock);
            this.finished = true;
            list = this.uncaughtExceptions;
        }
        List w = d.w(d.j(getChildren(), new ss2() { // from class: kotlinx.coroutines.test.TestScopeImpl$legacyLeave$activeJobs$1
            @Override // defpackage.ss2
            public final Boolean invoke(Job job) {
                return Boolean.valueOf(job.isActive());
            }
        }));
        if (list.isEmpty()) {
            if (!w.isEmpty()) {
                throw new UncompletedCoroutinesError("Active jobs found during the tear-down. Ensure that all coroutines are completed or cancelled by your test. The active jobs: " + w);
            }
            if (!TestCoroutineScheduler.isIdle$kotlinx_coroutines_test$default(getTestScheduler(), false, 1, null)) {
                throw new UncompletedCoroutinesError("Unfinished coroutines found during the tear-down. Ensure that all coroutines are completed or cancelled by your test.");
            }
        }
        return list;
    }

    public final void reportException(Throwable th) {
        synchronized (this.lock) {
            if (this.finished) {
                throw th;
            }
            Iterator<Throwable> it2 = this.uncaughtExceptions.iterator();
            while (it2.hasNext()) {
                if (zq3.c(th, it2.next())) {
                    return;
                }
            }
            this.uncaughtExceptions.add(th);
            if (this.entered) {
                ww8 ww8Var = ww8.a;
            } else {
                UncaughtExceptionsBeforeTest uncaughtExceptionsBeforeTest = new UncaughtExceptionsBeforeTest();
                g62.a(uncaughtExceptionsBeforeTest, th);
                throw uncaughtExceptionsBeforeTest;
            }
        }
    }

    @Override // kotlinx.coroutines.JobSupport
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TestScope[");
        sb.append(this.finished ? "test ended" : this.entered ? "test started" : "test not started");
        sb.append(']');
        return sb.toString();
    }

    public final Throwable tryGetCompletionCause() {
        return getCompletionCause();
    }
}
