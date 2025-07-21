package androidx.compose.runtime;

import defpackage.by0;
import defpackage.ss2;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public abstract class m {
    public static final l a(CoroutineContext coroutineContext) {
        l lVar = (l) coroutineContext.get(l.E);
        if (lVar != null) {
            return lVar;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }

    public static final Object b(final ss2 ss2Var, by0 by0Var) {
        return a(by0Var.getContext()).b(new ss2() { // from class: androidx.compose.runtime.MonotonicFrameClockKt$withFrameMillis$2
            {
                super(1);
            }

            public final Object b(long j) {
                return ss2.this.invoke(Long.valueOf(j / 1000000));
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return b(((Number) obj).longValue());
            }
        }, by0Var);
    }

    public static final Object c(ss2 ss2Var, by0 by0Var) {
        return a(by0Var.getContext()).b(ss2Var, by0Var);
    }
}
