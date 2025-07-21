package com.google.common.base;

import defpackage.b16;
import java.io.Serializable;

/* loaded from: classes3.dex */
public abstract class Optional<T> implements Serializable {
    private static final long serialVersionUID = 0;

    Optional() {
    }

    public static Optional a() {
        return Absent.h();
    }

    public static Optional b(Object obj) {
        return obj == null ? a() : new Present(obj);
    }

    public static Optional e(Object obj) {
        return new Present(b16.k(obj));
    }

    public abstract Object c();

    public abstract boolean d();

    public abstract boolean equals(Object obj);

    public abstract Object f(Object obj);

    public abstract Object g();

    public abstract int hashCode();
}
