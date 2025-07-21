package com.google.android.gms.internal.pal;

import java.util.Map;

/* loaded from: classes3.dex */
final class d9 implements Map.Entry {
    d9 a;
    d9 b;
    d9 c;
    d9 d;
    d9 e;
    final Object f;
    Object g;
    int h;

    d9() {
        this.f = null;
        this.e = this;
        this.d = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.g;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj3.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.g;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.g;
        return hashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.g;
        this.g = obj;
        return obj2;
    }

    public final String toString() {
        return this.f + "=" + this.g;
    }

    d9(d9 d9Var, Object obj, d9 d9Var2, d9 d9Var3) {
        this.a = d9Var;
        this.f = obj;
        this.h = 1;
        this.d = d9Var2;
        this.e = d9Var3;
        d9Var3.d = this;
        d9Var2.e = this;
    }
}
