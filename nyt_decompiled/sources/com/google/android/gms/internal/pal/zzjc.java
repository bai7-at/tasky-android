package com.google.android.gms.internal.pal;

import com.amazonaws.services.s3.internal.Constants;
import java.io.Serializable;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class zzjc implements Map, Serializable {
    private transient zzjd a;
    private transient zzjd b;
    private transient zziw c;

    zzjc() {
    }

    public static zzjc d() {
        return zzjj.g;
    }

    public static zzjc f(Object obj, Object obj2) {
        v2.a(obj, obj2);
        return zzjj.o(1, new Object[]{obj, obj2}, null);
    }

    public static zzjc h(Object obj, Object obj2, Object obj3, Object obj4) {
        v2.a(obj, obj2);
        v2.a(obj3, obj4);
        return zzjj.o(2, new Object[]{obj, obj2, obj3, obj4}, null);
    }

    public static zzjc i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        v2.a(obj, obj2);
        v2.a(obj3, obj4);
        v2.a(obj5, obj6);
        return zzjj.o(3, new Object[]{obj, obj2, obj3, obj4, obj5, obj6}, null);
    }

    abstract zziw a();

    @Override // java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final zziw values() {
        zziw zziwVar = this.c;
        if (zziwVar != null) {
            return zziwVar;
        }
        zziw a = a();
        this.c = a;
        return a;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return b3.a(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    abstract zzjd j();

    abstract zzjd l();

    @Override // java.util.Map
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final zzjd entrySet() {
        zzjd zzjdVar = this.a;
        if (zzjdVar != null) {
            return zzjdVar;
        }
        zzjd j = j();
        this.a = j;
        return j;
    }

    @Override // java.util.Map
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final zzjd keySet() {
        zzjd zzjdVar = this.b;
        if (zzjdVar != null) {
            return zzjdVar;
        }
        zzjd l = l();
        this.b = l;
        return l;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        if (size < 0) {
            throw new IllegalArgumentException("size cannot be negative but was: " + size);
        }
        StringBuilder sb = new StringBuilder((int) Math.min(size * 8, Constants.GB));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }
}
