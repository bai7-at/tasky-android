package com.google.common.base;

import defpackage.b16;

/* loaded from: classes3.dex */
final class Absent<T> extends Optional<T> {
    static final Absent a = new Absent();
    private static final long serialVersionUID = 0;

    private Absent() {
    }

    static Optional h() {
        return a;
    }

    private Object readResolve() {
        return a;
    }

    @Override // com.google.common.base.Optional
    public Object c() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // com.google.common.base.Optional
    public boolean d() {
        return false;
    }

    @Override // com.google.common.base.Optional
    public boolean equals(Object obj) {
        return obj == this;
    }

    @Override // com.google.common.base.Optional
    public Object f(Object obj) {
        return b16.l(obj, "use Optional.orNull() instead of Optional.or(null)");
    }

    @Override // com.google.common.base.Optional
    public Object g() {
        return null;
    }

    @Override // com.google.common.base.Optional
    public int hashCode() {
        return 2040732332;
    }

    public String toString() {
        return "Optional.absent()";
    }
}
