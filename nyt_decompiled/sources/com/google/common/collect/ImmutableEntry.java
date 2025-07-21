package com.google.common.collect;

import java.io.Serializable;

/* loaded from: classes3.dex */
class ImmutableEntry<K, V> extends b implements Serializable {
    private static final long serialVersionUID = 0;
    final K key;
    final V value;

    /* JADX WARN: Multi-variable type inference failed */
    ImmutableEntry(Object obj, Object obj2) {
        this.key = obj;
        this.value = obj2;
    }

    @Override // com.google.common.collect.b, java.util.Map.Entry
    public final Object getKey() {
        return this.key;
    }

    @Override // com.google.common.collect.b, java.util.Map.Entry
    public final Object getValue() {
        return this.value;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
