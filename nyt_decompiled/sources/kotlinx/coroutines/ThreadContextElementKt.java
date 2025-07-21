package kotlinx.coroutines;

import defpackage.bk3;
import defpackage.by0;
import defpackage.cc0;
import defpackage.ww8;
import kotlinx.coroutines.internal.ThreadLocalElement;
import kotlinx.coroutines.internal.ThreadLocalKey;

/* loaded from: classes5.dex */
public final class ThreadContextElementKt {
    public static final <T> ThreadContextElement<T> asContextElement(ThreadLocal<T> threadLocal, T t) {
        return new ThreadLocalElement(t, threadLocal);
    }

    public static /* synthetic */ ThreadContextElement asContextElement$default(ThreadLocal threadLocal, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = threadLocal.get();
        }
        return asContextElement(threadLocal, obj);
    }

    public static final Object ensurePresent(ThreadLocal<?> threadLocal, by0<? super ww8> by0Var) {
        if (by0Var.getContext().get(new ThreadLocalKey(threadLocal)) != null) {
            return ww8.a;
        }
        throw new IllegalStateException(("ThreadLocal " + threadLocal + " is missing from context " + by0Var.getContext()).toString());
    }

    private static final Object ensurePresent$$forInline(ThreadLocal<?> threadLocal, by0<? super ww8> by0Var) {
        bk3.c(3);
        throw null;
    }

    public static final Object isPresent(ThreadLocal<?> threadLocal, by0<? super Boolean> by0Var) {
        return cc0.a(by0Var.getContext().get(new ThreadLocalKey(threadLocal)) != null);
    }

    private static final Object isPresent$$forInline(ThreadLocal<?> threadLocal, by0<? super Boolean> by0Var) {
        bk3.c(3);
        throw null;
    }
}
