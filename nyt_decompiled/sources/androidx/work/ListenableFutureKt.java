package androidx.work;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.work.ListenableFutureKt;
import defpackage.gt2;
import defpackage.j64;
import defpackage.qs2;
import defpackage.zq3;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

/* loaded from: classes.dex */
public abstract class ListenableFutureKt {
    public static final j64 f(final Executor executor, final String str, final qs2 qs2Var) {
        zq3.h(executor, "<this>");
        zq3.h(str, "debugTag");
        zq3.h(qs2Var, "block");
        j64 a = CallbackToFutureAdapter.a(new CallbackToFutureAdapter.b() { // from class: l64
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.b
            public final Object a(CallbackToFutureAdapter.a aVar) {
                Object g;
                g = ListenableFutureKt.g(executor, str, qs2Var, aVar);
                return g;
            }
        });
        zq3.g(a, "getFuture { completer ->… }\n        debugTag\n    }");
        return a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object g(Executor executor, String str, final qs2 qs2Var, final CallbackToFutureAdapter.a aVar) {
        zq3.h(aVar, "completer");
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        aVar.a(new Runnable() { // from class: n64
            @Override // java.lang.Runnable
            public final void run() {
                ListenableFutureKt.h(atomicBoolean);
            }
        }, DirectExecutor.INSTANCE);
        executor.execute(new Runnable() { // from class: o64
            @Override // java.lang.Runnable
            public final void run() {
                ListenableFutureKt.i(atomicBoolean, aVar, qs2Var);
            }
        });
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(AtomicBoolean atomicBoolean) {
        atomicBoolean.set(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(AtomicBoolean atomicBoolean, CallbackToFutureAdapter.a aVar, qs2 qs2Var) {
        if (atomicBoolean.get()) {
            return;
        }
        try {
            aVar.c(qs2Var.mo865invoke());
        } catch (Throwable th) {
            aVar.f(th);
        }
    }

    public static final j64 j(final CoroutineContext coroutineContext, final CoroutineStart coroutineStart, final gt2 gt2Var) {
        zq3.h(coroutineContext, "context");
        zq3.h(coroutineStart, "start");
        zq3.h(gt2Var, "block");
        j64 a = CallbackToFutureAdapter.a(new CallbackToFutureAdapter.b() { // from class: k64
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.b
            public final Object a(CallbackToFutureAdapter.a aVar) {
                Object l;
                l = ListenableFutureKt.l(CoroutineContext.this, coroutineStart, gt2Var, aVar);
                return l;
            }
        });
        zq3.g(a, "getFuture { completer ->…owable)\n        }\n    }\n}");
        return a;
    }

    public static /* synthetic */ j64 k(CoroutineContext coroutineContext, CoroutineStart coroutineStart, gt2 gt2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.a;
        }
        if ((i & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return j(coroutineContext, coroutineStart, gt2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object l(CoroutineContext coroutineContext, CoroutineStart coroutineStart, gt2 gt2Var, CallbackToFutureAdapter.a aVar) {
        Job launch$default;
        zq3.h(aVar, "completer");
        final Job job = (Job) coroutineContext.get(Job.Key);
        aVar.a(new Runnable() { // from class: m64
            @Override // java.lang.Runnable
            public final void run() {
                ListenableFutureKt.m(Job.this);
            }
        }, DirectExecutor.INSTANCE);
        launch$default = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(coroutineContext), null, coroutineStart, new ListenableFutureKt$launchFuture$1$2(gt2Var, aVar, null), 1, null);
        return launch$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(Job job) {
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
    }
}
