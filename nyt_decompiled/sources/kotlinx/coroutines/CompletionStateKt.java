package kotlinx.coroutines;

import defpackage.by0;
import defpackage.ss2;
import kotlin.Result;
import kotlin.f;

/* loaded from: classes5.dex */
public final class CompletionStateKt {
    public static final <T> Object recoverResult(Object obj, by0<? super T> by0Var) {
        if (!(obj instanceof CompletedExceptionally)) {
            return Result.b(obj);
        }
        Result.a aVar = Result.a;
        return Result.b(f.a(((CompletedExceptionally) obj).cause));
    }

    public static final <T> Object toState(Object obj, ss2 ss2Var) {
        Throwable e = Result.e(obj);
        return e == null ? ss2Var != null ? new CompletedWithCancellation(obj, ss2Var) : obj : new CompletedExceptionally(e, false, 2, null);
    }

    public static /* synthetic */ Object toState$default(Object obj, ss2 ss2Var, int i, Object obj2) {
        if ((i & 1) != 0) {
            ss2Var = null;
        }
        return toState(obj, ss2Var);
    }

    public static final <T> Object toState(Object obj, CancellableContinuation<?> cancellableContinuation) {
        Throwable e = Result.e(obj);
        return e == null ? obj : new CompletedExceptionally(e, false, 2, null);
    }
}
