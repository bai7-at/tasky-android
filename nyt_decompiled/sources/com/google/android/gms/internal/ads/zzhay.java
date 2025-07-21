package com.google.android.gms.internal.ads;

import defpackage.m0f;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class zzhay extends LinkedHashMap {
    private static final zzhay a;
    private boolean zzb;

    static {
        zzhay zzhayVar = new zzhay();
        a = zzhayVar;
        zzhayVar.zzb = false;
    }

    private zzhay() {
        this.zzb = true;
    }

    public static zzhay a() {
        return a;
    }

    private static int i(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof m0f) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = ai.d;
        int length = bArr.length;
        int b = ai.b(length, bArr, 0, length);
        if (b == 0) {
            return 1;
        }
        return b;
    }

    private final void l() {
        if (!this.zzb) {
            throw new UnsupportedOperationException();
        }
    }

    public final zzhay c() {
        return isEmpty() ? new zzhay() : new zzhay(this);
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

    public final void f(zzhay zzhayVar) {
        l();
        if (zzhayVar.isEmpty()) {
            return;
        }
        putAll(zzhayVar);
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
        byte[] bArr = ai.d;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        l();
        for (Object obj : map.keySet()) {
            byte[] bArr = ai.d;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        l();
        return super.remove(obj);
    }

    private zzhay(Map map) {
        super(map);
        this.zzb = true;
    }
}
