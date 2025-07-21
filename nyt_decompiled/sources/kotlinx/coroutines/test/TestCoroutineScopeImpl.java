package kotlinx.coroutines.test;

import defpackage.zq3;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.Job;

/* loaded from: classes5.dex */
final class TestCoroutineScopeImpl implements TestCoroutineScope {
    private boolean cleanedUp;
    private final CoroutineContext coroutineContext;
    private final Object lock = new Object();
    private List<Throwable> exceptions = new ArrayList();
    private final Set<Job> initialJobs = TestCoroutineScopeKt.activeJobs(getCoroutineContext());

    public TestCoroutineScopeImpl(CoroutineContext coroutineContext) {
        this.coroutineContext = coroutineContext;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x002c, code lost:
    
        if (getTestScheduler().isIdle$kotlinx_coroutines_test(false) == false) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0048 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // kotlinx.coroutines.test.TestCoroutineScope
    /* renamed from: cleanupTestCoroutines */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo955cleanupTestCoroutines() {
        /*
            r5 = this;
            kotlin.coroutines.CoroutineContext r0 = r5.getCoroutineContext()
            kotlin.coroutines.c$b r1 = kotlin.coroutines.c.P
            kotlin.coroutines.CoroutineContext$a r0 = r0.get(r1)
            kotlin.coroutines.c r0 = (kotlin.coroutines.c) r0
            boolean r1 = r0 instanceof kotlinx.coroutines.test.DelayController
            r2 = 0
            if (r1 == 0) goto L14
            kotlinx.coroutines.test.DelayController r0 = (kotlinx.coroutines.test.DelayController) r0
            goto L15
        L14:
            r0 = r2
        L15:
            r1 = 0
            r3 = 1
            if (r0 == 0) goto L1d
            r0.cleanupTestCoroutines()     // Catch: kotlinx.coroutines.test.UncompletedCoroutinesError -> L2e
            goto L2f
        L1d:
            kotlinx.coroutines.test.TestCoroutineScheduler r0 = r5.getTestScheduler()
            r0.runCurrent()
            kotlinx.coroutines.test.TestCoroutineScheduler r0 = r5.getTestScheduler()
            boolean r0 = r0.isIdle$kotlinx_coroutines_test(r1)
            if (r0 != 0) goto L2f
        L2e:
            r1 = r3
        L2f:
            kotlin.coroutines.CoroutineContext r0 = r5.getCoroutineContext()
            kotlinx.coroutines.CoroutineExceptionHandler$Key r4 = kotlinx.coroutines.CoroutineExceptionHandler.Key
            kotlin.coroutines.CoroutineContext$a r0 = r0.get(r4)
            boolean r4 = r0 instanceof kotlinx.coroutines.test.UncaughtExceptionCaptor
            if (r4 == 0) goto L40
            r2 = r0
            kotlinx.coroutines.test.UncaughtExceptionCaptor r2 = (kotlinx.coroutines.test.UncaughtExceptionCaptor) r2
        L40:
            if (r2 == 0) goto L45
            r2.cleanupTestCoroutines()
        L45:
            java.lang.Object r0 = r5.lock
            monitor-enter(r0)
            boolean r2 = r5.cleanedUp     // Catch: java.lang.Throwable -> Lb4
            if (r2 != 0) goto Lb6
            r5.cleanedUp = r3     // Catch: java.lang.Throwable -> Lb4
            ww8 r2 = defpackage.ww8.a     // Catch: java.lang.Throwable -> Lb4
            monitor-exit(r0)
            java.util.List<java.lang.Throwable> r0 = r5.exceptions
            java.lang.Object r0 = kotlin.collections.i.m0(r0)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            if (r0 == 0) goto L7a
            java.util.List<java.lang.Throwable> r5 = r5.exceptions
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.List r5 = kotlin.collections.i.e0(r5, r3)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L69:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L79
            java.lang.Object r1 = r5.next()
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            defpackage.g62.a(r0, r1)
            goto L69
        L79:
            throw r0
        L7a:
            if (r1 != 0) goto Lac
            kotlin.coroutines.CoroutineContext r0 = r5.getCoroutineContext()
            java.util.Set r0 = kotlinx.coroutines.test.TestCoroutineScopeKt.activeJobs(r0)
            java.util.Set<kotlinx.coroutines.Job> r5 = r5.initialJobs
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Set r5 = kotlin.collections.b0.k(r0, r5)
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L95
            return
        L95:
            kotlinx.coroutines.test.UncompletedCoroutinesError r5 = new kotlinx.coroutines.test.UncompletedCoroutinesError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Test finished with active jobs: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r5.<init>(r0)
            throw r5
        Lac:
            kotlinx.coroutines.test.UncompletedCoroutinesError r5 = new kotlinx.coroutines.test.UncompletedCoroutinesError
            java.lang.String r0 = "Unfinished coroutines during teardown. Ensure all coroutines are completed or cancelled by your test."
            r5.<init>(r0)
            throw r5
        Lb4:
            r5 = move-exception
            goto Lbe
        Lb6:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r1 = "Attempting to clean up a test coroutine scope more than once."
            r5.<init>(r1)     // Catch: java.lang.Throwable -> Lb4
            throw r5     // Catch: java.lang.Throwable -> Lb4
        Lbe:
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.test.TestCoroutineScopeImpl.mo955cleanupTestCoroutines():void");
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // kotlinx.coroutines.test.TestCoroutineScope
    public TestCoroutineScheduler getTestScheduler() {
        CoroutineContext.a aVar = getCoroutineContext().get(TestCoroutineScheduler.Key);
        zq3.e(aVar);
        return (TestCoroutineScheduler) aVar;
    }

    public final boolean reportException(Throwable th) {
        boolean z;
        synchronized (this.lock) {
            if (this.cleanedUp) {
                z = false;
            } else {
                this.exceptions.add(th);
                z = true;
            }
        }
        return z;
    }
}
