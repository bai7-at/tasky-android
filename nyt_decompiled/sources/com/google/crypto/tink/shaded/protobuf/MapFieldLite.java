package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.u;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class MapFieldLite<K, V> extends LinkedHashMap<K, V> {
    private static final MapFieldLite a;
    private boolean isMutable;

    static {
        MapFieldLite mapFieldLite = new MapFieldLite();
        a = mapFieldLite;
        mapFieldLite.n();
    }

    private MapFieldLite() {
        this.isMutable = true;
    }

    static int a(Map map) {
        int i = 0;
        for (Map.Entry<K, V> entry : map.entrySet()) {
            i += c(entry.getValue()) ^ c(entry.getKey());
        }
        return i;
    }

    private static int c(Object obj) {
        if (obj instanceof byte[]) {
            return u.d((byte[]) obj);
        }
        if (obj instanceof u.a) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    private static void d(Map map) {
        for (K k : map.keySet()) {
            u.a(k);
            u.a(map.get(k));
        }
    }

    public static MapFieldLite f() {
        return a;
    }

    private void h() {
        if (!m()) {
            throw new UnsupportedOperationException();
        }
    }

    private static boolean i(Object obj, Object obj2) {
        return ((obj instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) obj, (byte[]) obj2) : obj.equals(obj2);
    }

    static boolean l(Map map, Map map2) {
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey()) || !i(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        h();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        return (obj instanceof Map) && l(this, (Map) obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return a(this);
    }

    public boolean m() {
        return this.isMutable;
    }

    public void n() {
        this.isMutable = false;
    }

    public void o(MapFieldLite mapFieldLite) {
        h();
        if (mapFieldLite.isEmpty()) {
            return;
        }
        putAll(mapFieldLite);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        h();
        u.a(obj);
        u.a(obj2);
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map map) {
        h();
        d(map);
        super.putAll(map);
    }

    public MapFieldLite q() {
        return isEmpty() ? new MapFieldLite() : new MapFieldLite(this);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        h();
        return super.remove(obj);
    }

    private MapFieldLite(Map map) {
        super(map);
        this.isMutable = true;
    }
}
