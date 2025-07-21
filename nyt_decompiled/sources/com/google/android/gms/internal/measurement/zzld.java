package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class zzld extends LinkedHashMap {
    private static final zzld a;
    private boolean zzb;

    static {
        zzld zzldVar = new zzld();
        a = zzldVar;
        zzldVar.zzb = false;
    }

    private zzld() {
        this.zzb = true;
    }

    public static zzld a() {
        return a;
    }

    private static int i(Object obj) {
        return obj instanceof byte[] ? l2.b((byte[]) obj) : obj.hashCode();
    }

    private final void l() {
        if (!this.zzb) {
            throw new UnsupportedOperationException();
        }
    }

    public final zzld c() {
        return isEmpty() ? new zzld() : new zzld(this);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        l();
        super.clear();
    }

    public final void d() {
        this.zzb = false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        Iterator it2 = entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    public final void f(zzld zzldVar) {
        l();
        if (zzldVar.isEmpty()) {
            return;
        }
        putAll(zzldVar);
    }

    public final boolean h() {
        return this.zzb;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        Iterator it2 = entrySet().iterator();
        int i = 0;
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            i += i(entry.getValue()) ^ i(entry.getKey());
        }
        return i;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        l();
        l2.e(obj);
        l2.e(obj2);
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        l();
        for (Object obj : map.keySet()) {
            l2.e(obj);
            l2.e(map.get(obj));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        l();
        return super.remove(obj);
    }

    private zzld(Map map) {
        super(map);
        this.zzb = true;
    }
}
