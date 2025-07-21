package kotlinx.coroutines.future;

import defpackage.by0;
import defpackage.ww8;
import java.util.concurrent.CompletionException;
import java.util.function.BiFunction;
import kotlin.Result;
import kotlin.f;

/* loaded from: classes5.dex */
final class ContinuationHandler<T> implements BiFunction<T, Throwable, ww8> {
    public volatile by0<? super T> cont;

    public ContinuationHandler(by0<? super T> by0Var) {
        this.cont = by0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.function.BiFunction
    public /* bridge */ /* synthetic */ ww8 apply(Object obj, Throwable th) {
        apply2((ContinuationHandler<T>) obj, th);
        return ww8.a;
    }

    /* renamed from: apply, reason: avoid collision after fix types in other method */
    public void apply2(T t, Throwable th) {
        Throwable cause;
        by0<? super T> by0Var = this.cont;
        if (by0Var == null) {
            return;
        }
        if (th == null) {
            by0Var.resumeWith(Result.b(t));
            return;
        }
        CompletionException completionException = th instanceof CompletionException ? (CompletionException) th : null;
        if (completionException != null && (cause = completionException.getCause()) != null) {
            th = cause;
        }
        Result.a aVar = Result.a;
        by0Var.resumeWith(Result.b(f.a(th)));
    }
}
