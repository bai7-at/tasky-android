package kotlin.collections.builders;

import defpackage.m1;
import defpackage.zq3;
import defpackage.zu3;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class c extends m1 implements Collection, zu3 {
    private final MapBuilder a;

    public c(MapBuilder mapBuilder) {
        zq3.h(mapBuilder, "backing");
        this.a = mapBuilder;
    }

    @Override // defpackage.m1
    public int a() {
        return this.a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection collection) {
        zq3.h(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return this.a.V();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        return this.a.T(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        zq3.h(collection, "elements");
        this.a.q();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        zq3.h(collection, "elements");
        this.a.q();
        return super.retainAll(collection);
    }
}
