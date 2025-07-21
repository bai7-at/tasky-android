package com.google.android.gms.internal.ads;

import defpackage.the;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class d9 extends the implements Map {
    protected d9() {
    }

    @Override // java.util.Map
    public final void clear() {
        d().clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return d().containsKey(obj);
    }

    protected abstract Map d();

    @Override // java.util.Map
    public abstract Set entrySet();

    protected final int f() {
        return na.a(entrySet());
    }

    protected final boolean i(Object obj) {
        t9 t9Var = new t9(entrySet().iterator());
        if (obj == null) {
            while (t9Var.hasNext()) {
                if (t9Var.next() == null) {
                }
            }
            return false;
        }
        while (t9Var.hasNext()) {
            if (obj.equals(t9Var.next())) {
            }
        }
        return false;
        return true;
    }

    protected final boolean j(Object obj) {
        return y9.b(this, obj);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return d().put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        d().putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return d().remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        return d().size();
    }

    @Override // java.util.Map
    public final Collection values() {
        return d().values();
    }
}
