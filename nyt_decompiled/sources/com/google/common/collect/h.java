package com.google.common.collect;

import defpackage.mp2;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class h extends mp2 implements Map {
    protected h() {
    }

    protected abstract Map c();

    @Override // java.util.Map
    public void clear() {
        c().clear();
    }

    public boolean containsKey(Object obj) {
        return c().containsKey(obj);
    }

    protected boolean d(Object obj) {
        return Maps.b(this, obj);
    }

    public Set entrySet() {
        return c().entrySet();
    }

    protected boolean f(Object obj) {
        return Maps.c(this, obj);
    }

    public Object get(Object obj) {
        return c().get(obj);
    }

    protected int h() {
        return s.d(entrySet());
    }

    public boolean isEmpty() {
        return c().isEmpty();
    }

    public Set keySet() {
        return c().keySet();
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        return c().put(obj, obj2);
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        c().putAll(map);
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        return c().remove(obj);
    }

    public int size() {
        return c().size();
    }

    @Override // java.util.Map
    public Collection values() {
        return c().values();
    }
}
