package kotlinx.coroutines.intrinsics;

import defpackage.by0;
import defpackage.gt2;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.ww8;
import kotlin.Result;
import kotlin.coroutines.intrinsics.a;
import kotlin.f;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.internal.DispatchedContinuationKt;

/* loaded from: classes5.dex */
public final class CancellableKt {
    private static final void dispatcherFailure(by0<?> by0Var, Throwable th) {
        Result.a aVar = Result.a;
        by0Var.resumeWith(Result.b(f.a(th)));
        throw th;
    }

    private static final void runSafely(by0<?> by0Var, qs2 qs2Var) {
        try {
            qs2Var.mo865invoke();
        } catch (Throwable th) {
            dispatcherFailure(by0Var, th);
        }
    }

    @InternalCoroutinesApi
    public static final <T> void startCoroutineCancellable(ss2 ss2Var, by0<? super T> by0Var) {
        try {
            by0 d = a.d(a.a(ss2Var, by0Var));
            Result.a aVar = Result.a;
            DispatchedContinuationKt.resumeCancellableWith$default(d, Result.b(ww8.a), null, 2, null);
        } catch (Throwable th) {
            dispatcherFailure(by0Var, th);
        }
    }

    public static /* synthetic */ void startCoroutineCancellable$default(gt2 gt2Var, Object obj, by0 by0Var, ss2 ss2Var, int i, Object obj2) {
        if ((i & 4) != 0) {
            ss2Var = null;
        }
        startCoroutineCancellable(gt2Var, obj, by0Var, ss2Var);
    }

    public static final <R, T> void startCoroutineCancellable(gt2 gt2Var, R r, by0<? super T> by0Var, ss2 ss2Var) {
        try {
            by0 d = a.d(a.b(gt2Var, r, by0Var));
            Result.a aVar = Result.a;
            DispatchedContinuationKt.resumeCancellableWith(d, Result.b(ww8.a), ss2Var);
        } catch (Throwable th) {
            dispatcherFailure(by0Var, th);
        }
    }

    public static final void startCoroutineCancellable(by0<? super ww8> by0Var, by0<?> by0Var2) {
        try {
            by0 d = a.d(by0Var);
            Result.a aVar = Result.a;
            DispatchedContinuationKt.resumeCancellableWith$default(d, Result.b(ww8.a), null, 2, null);
        } catch (Throwable th) {
            dispatcherFailure(by0Var2, th);
        }
    }
}
