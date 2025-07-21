package io.embrace.android.embracesdk.internal.utils;

import defpackage.zq3;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class MapExtensionsKt {
    public static final <K, V> Map<K, V> toNonNullMap(Map<K, ? extends V> map) {
        zq3.h(map, "$this$toNonNullMap");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<K, ? extends V> entry : map.entrySet()) {
            if (entry.getValue() != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }
}
