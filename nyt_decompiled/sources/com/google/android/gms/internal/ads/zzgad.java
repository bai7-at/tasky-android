package com.google.android.gms.internal.ads;

import com.amazonaws.services.s3.internal.Constants;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class zzgad implements Map, Serializable {
    private transient zzgaf a;
    private transient zzgaf b;
    private transient zzfzv c;

    zzgad() {
    }

    public static zzgad d(Map map) {
        Set entrySet = map.entrySet();
        l9 l9Var = new l9(entrySet instanceof Collection ? entrySet.size() : 4);
        l9Var.b(entrySet);
        return l9Var.c();
    }

    public static zzgad f() {
        return zzgbp.g;
    }

    public static zzgad h(Object obj, Object obj2) {
        r8.b("dialog_not_shown_reason", obj2);
        return zzgbp.n(1, new Object[]{"dialog_not_shown_reason", obj2}, null);
    }

    abstract zzfzv a();

    @Override // java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final zzfzv values() {
        zzfzv zzfzvVar = this.c;
        if (zzfzvVar != null) {
            return zzfzvVar;
        }
        zzfzv a = a();
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
        return y9.b(this, obj);
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
        return na.a(entrySet());
    }

    abstract zzgaf i();

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    abstract zzgaf j();

    @Override // java.util.Map
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final zzgaf entrySet() {
        zzgaf zzgafVar = this.a;
        if (zzgafVar != null) {
            return zzgafVar;
        }
        zzgaf i = i();
        this.a = i;
        return i;
    }

    @Override // java.util.Map
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final zzgaf keySet() {
        zzgaf zzgafVar = this.b;
        if (zzgafVar != null) {
            return zzgafVar;
        }
        zzgaf j = j();
        this.b = j;
        return j;
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
        r8.a(size, "size");
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
