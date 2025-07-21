package com.google.common.collect;

import defpackage.a64;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
abstract class AbstractListMultimap<K, V> extends AbstractMapBasedMultimap<K, V> implements a64 {
    private static final long serialVersionUID = 6588350623831699109L;

    protected AbstractListMultimap(Map map) {
        super(map);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    Collection A(Object obj, Collection collection) {
        return B(obj, (List) collection, null);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, defpackage.tx4
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public List get(Object obj) {
        return (List) super.get(obj);
    }

    @Override // com.google.common.collect.c, defpackage.tx4
    public Map c() {
        return super.c();
    }

    @Override // com.google.common.collect.c
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, defpackage.tx4
    public boolean put(Object obj, Object obj2) {
        return super.put(obj, obj2);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    Collection z(Collection collection) {
        return Collections.unmodifiableList((List) collection);
    }
}
