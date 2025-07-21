package io.embrace.android.embracesdk.internal;

import defpackage.qs2;
import defpackage.zq3;

/* loaded from: classes5.dex */
public final class CacheableValue<T> {
    private boolean initialized;
    private final qs2 input;
    private int prevHashCode;
    private T value;

    public CacheableValue(qs2 qs2Var) {
        zq3.h(qs2Var, "input");
        this.input = qs2Var;
        this.prevHashCode = -1;
    }

    public final T value(qs2 qs2Var) {
        zq3.h(qs2Var, "action");
        int hashCode = this.input.mo865invoke().hashCode();
        if (this.prevHashCode != hashCode || !this.initialized) {
            this.initialized = true;
            this.value = (T) qs2Var.mo865invoke();
        }
        this.prevHashCode = hashCode;
        T t = this.value;
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("Value to be cached is null");
    }
}
