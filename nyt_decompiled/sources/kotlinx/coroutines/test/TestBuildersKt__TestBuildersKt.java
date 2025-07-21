package kotlinx.coroutines.test;

import defpackage.g62;
import defpackage.gt2;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.ww8;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.collections.i;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.f;
import kotlin.sequences.d;
import kotlin.time.DurationUnit;
import kotlin.time.b;
import kotlin.time.c;
import kotlinx.coroutines.AbstractCoroutine;

/* loaded from: classes5.dex */
final /* synthetic */ class TestBuildersKt__TestBuildersKt {
    private static final Object DEFAULT_TIMEOUT;

    static {
        Object b;
        try {
            Result.a aVar = Result.a;
            b = Result.b(b.f(((b) systemProperty$TestBuildersKt__TestBuildersKt("kotlinx.coroutines.test.default_timeout", new TestBuildersKt__TestBuildersKt$DEFAULT_TIMEOUT$1$1(b.b), b.f(c.s(60, DurationUnit.SECONDS)))).N()));
        } catch (Throwable th) {
            Result.a aVar2 = Result.a;
            b = Result.b(f.a(th));
        }
        DEFAULT_TIMEOUT = b;
    }

    /* renamed from: handleTimeout-dWUq8MI$TestBuildersKt__TestBuildersKt, reason: not valid java name */
    private static final <T extends AbstractCoroutine<? super ww8>> AssertionError m961handleTimeoutdWUq8MI$TestBuildersKt__TestBuildersKt(T t, long j, ss2 ss2Var, qs2 qs2Var) {
        List l;
        try {
            l = (List) qs2Var.mo865invoke();
        } catch (UncompletedCoroutinesError unused) {
            l = i.l();
        }
        List w = d.w(d.j(t.getChildren(), TestBuildersKt__TestBuildersKt$handleTimeout$activeChildren$1.INSTANCE));
        Throwable th = t.isCancelled() ? (Throwable) ss2Var.invoke(t) : null;
        String str = "After waiting for " + ((Object) b.L(j));
        if (th == null) {
            str = str + ", the test coroutine is not completing";
        }
        if (!w.isEmpty()) {
            str = str + ", there were active child jobs: " + w;
        }
        if (th != null && w.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(t.isCompleted() ? ", the test coroutine completed" : ", the test coroutine was not completed");
            str = sb.toString();
        }
        UncompletedCoroutinesError uncompletedCoroutinesError = new UncompletedCoroutinesError(str);
        if (th != null) {
            g62.a(uncompletedCoroutinesError, th);
        }
        Iterator it2 = l.iterator();
        while (it2.hasNext()) {
            g62.a(uncompletedCoroutinesError, (Throwable) it2.next());
        }
        return uncompletedCoroutinesError;
    }

    public static final void runTest(CoroutineContext coroutineContext, long j, gt2 gt2Var) {
        RunningInRunTest runningInRunTest = RunningInRunTest.INSTANCE;
        if (coroutineContext.get(runningInRunTest) != null) {
            throw new IllegalStateException("Calls to `runTest` can't be nested. Please read the docs on `TestResult` for details.");
        }
        TestBuildersKt.runTest(TestScopeKt.TestScope(coroutineContext.plus(runningInRunTest)), j, gt2Var);
    }

    public static /* synthetic */ void runTest$default(CoroutineContext coroutineContext, long j, gt2 gt2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.a;
        }
        TestBuildersKt.runTest(coroutineContext, j, gt2Var);
    }

    /* renamed from: runTest-8Mi8wO0, reason: not valid java name */
    public static final void m962runTest8Mi8wO0(CoroutineContext coroutineContext, long j, gt2 gt2Var) {
        RunningInRunTest runningInRunTest = RunningInRunTest.INSTANCE;
        if (coroutineContext.get(runningInRunTest) != null) {
            throw new IllegalStateException("Calls to `runTest` can't be nested. Please read the docs on `TestResult` for details.");
        }
        TestBuildersKt.m957runTest8Mi8wO0(TestScopeKt.TestScope(coroutineContext.plus(runningInRunTest)), j, gt2Var);
    }

    /* renamed from: runTest-8Mi8wO0$default, reason: not valid java name */
    public static /* synthetic */ void m964runTest8Mi8wO0$default(CoroutineContext coroutineContext, long j, gt2 gt2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.a;
        }
        if ((i & 2) != 0) {
            Object obj2 = DEFAULT_TIMEOUT;
            f.b(obj2);
            j = ((b) obj2).N();
        }
        TestBuildersKt.m956runTest8Mi8wO0(coroutineContext, j, gt2Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0170 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x019b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01a3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Type inference failed for: r13v9, types: [kotlinx.coroutines.AbstractCoroutine] */
    /* JADX WARN: Type inference failed for: r14v9, types: [kotlinx.coroutines.AbstractCoroutine] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0171 -> B:17:0x017c). Please report as a decompilation issue!!! */
    /* renamed from: runTestCoroutineLegacy-SYHnMyU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T extends kotlinx.coroutines.AbstractCoroutine<? super defpackage.ww8>> java.lang.Object m966runTestCoroutineLegacySYHnMyU(kotlinx.coroutines.CoroutineScope r23, T r24, long r25, defpackage.ss2 r27, defpackage.gt2 r28, defpackage.qs2 r29, defpackage.by0<? super defpackage.ww8> r30) {
        /*
            Method dump skipped, instructions count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.test.TestBuildersKt__TestBuildersKt.m966runTestCoroutineLegacySYHnMyU(kotlinx.coroutines.CoroutineScope, kotlinx.coroutines.AbstractCoroutine, long, ss2, gt2, qs2, by0):java.lang.Object");
    }

    private static final <T> T systemProperty$TestBuildersKt__TestBuildersKt(String str, ss2 ss2Var, T t) {
        String systemPropertyImpl = TestBuildersJvmKt.systemPropertyImpl(str);
        return systemPropertyImpl == null ? t : (T) ss2Var.invoke(systemPropertyImpl);
    }

    public static final void throwAll(Throwable th, List<? extends Throwable> list) {
        if (th != null) {
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                g62.a(th, (Throwable) it2.next());
            }
            throw th;
        }
        Throwable th2 = (Throwable) i.m0(list);
        if (th2 != null) {
            Iterator it3 = i.e0(list, 1).iterator();
            while (it3.hasNext()) {
                g62.a(th2, (Throwable) it3.next());
            }
            throw th2;
        }
    }

    public static final /* synthetic */ void runTest$default(TestScope testScope, long j, gt2 gt2Var, int i, Object obj) {
        if ((i & 1) == 0) {
            j = 60000;
        }
        TestBuildersKt.runTest(testScope, j, gt2Var);
    }

    public static final void runTest(TestScope testScope, long j, gt2 gt2Var) {
        TestScopeImpl asSpecificImplementation = TestScopeKt.asSpecificImplementation(testScope);
        asSpecificImplementation.enter();
        TestBuildersJvmKt.createTestResult(new TestBuildersKt__TestBuildersKt$runTest$3$1(asSpecificImplementation, j, gt2Var, testScope, null));
    }

    /* renamed from: runTest-8Mi8wO0, reason: not valid java name */
    public static final void m963runTest8Mi8wO0(TestScope testScope, long j, gt2 gt2Var) {
        TestScopeImpl asSpecificImplementation = TestScopeKt.asSpecificImplementation(testScope);
        asSpecificImplementation.enter();
        TestBuildersJvmKt.createTestResult(new TestBuildersKt__TestBuildersKt$runTest$2$1(asSpecificImplementation, j, testScope, gt2Var, null));
    }

    /* renamed from: runTest-8Mi8wO0$default, reason: not valid java name */
    public static /* synthetic */ void m965runTest8Mi8wO0$default(TestScope testScope, long j, gt2 gt2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            Object obj2 = DEFAULT_TIMEOUT;
            f.b(obj2);
            j = ((b) obj2).N();
        }
        TestBuildersKt.m957runTest8Mi8wO0(testScope, j, gt2Var);
    }
}
