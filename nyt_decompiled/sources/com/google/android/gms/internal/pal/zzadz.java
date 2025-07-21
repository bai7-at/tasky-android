package com.google.android.gms.internal.pal;

import defpackage.ew9;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class zzadz extends LinkedHashMap {
    private static final zzadz a;
    private boolean zzb;

    static {
        zzadz zzadzVar = new zzadz();
        a = zzadzVar;
        zzadzVar.zzb = false;
    }

    private zzadz() {
        this.zzb = true;
    }

    public static zzadz a() {
        return a;
    }

    private static int i(Object obj) {
        if (obj instanceof byte[]) {
            return f0.b((byte[]) obj);
        }
        if (obj instanceof ew9) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    private final void l() {
        if (!this.zzb) {
            throw new UnsupportedOperationException();
        }
    }

    public final zzadz c() {
        return isEmpty() ? new zzadz() : new zzadz(this);
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

    public final void f(zzadz zzadzVar) {
        l();
        if (zzadzVar.isEmpty()) {
            return;
        }
        putAll(zzadzVar);
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
        f0.e(obj);
        f0.e(obj2);
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        l();
        for (Object obj : map.keySet()) {
            f0.e(obj);
            f0.e(map.get(obj));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        l();
        return super.remove(obj);
    }

    private zzadz(Map map) {
        super(map);
        this.zzb = true;
    }
}
