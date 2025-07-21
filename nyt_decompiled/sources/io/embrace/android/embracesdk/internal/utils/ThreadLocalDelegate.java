package io.embrace.android.embracesdk.internal.utils;

import defpackage.hp6;
import defpackage.iv3;
import defpackage.qs2;
import defpackage.zq3;

/* loaded from: classes5.dex */
public final class ThreadLocalDelegate<T> implements hp6 {
    private final ThreadLocal<T> threadLocal;

    public ThreadLocalDelegate(final qs2 qs2Var) {
        zq3.h(qs2Var, "provider");
        this.threadLocal = new ThreadLocal<T>() { // from class: io.embrace.android.embracesdk.internal.utils.ThreadLocalDelegate$threadLocal$1
            @Override // java.lang.ThreadLocal
            protected T initialValue() {
                return (T) qs2.this.mo865invoke();
            }
        };
    }

    @Override // defpackage.hp6
    public T getValue(Object obj, iv3 iv3Var) {
        zq3.h(iv3Var, "property");
        T t = this.threadLocal.get();
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
