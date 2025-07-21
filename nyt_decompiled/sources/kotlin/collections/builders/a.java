package kotlin.collections.builders;

import defpackage.l1;
import defpackage.zq3;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes5.dex */
public final class a extends l1 {
    private final MapBuilder a;

    public a(MapBuilder mapBuilder) {
        zq3.h(mapBuilder, "backing");
        this.a = mapBuilder;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection collection) {
        zq3.h(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.l1
    public boolean c(Map.Entry entry) {
        zq3.h(entry, "element");
        return this.a.t(entry);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        zq3.h(collection, "elements");
        return this.a.s(collection);
    }

    @Override // defpackage.l1
    public boolean f(Map.Entry entry) {
        zq3.h(entry, "element");
        return this.a.O(entry);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public boolean add(Map.Entry entry) {
        zq3.h(entry, "element");
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.p1
    public int getSize() {
        return this.a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return this.a.x();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        zq3.h(collection, "elements");
        this.a.q();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        zq3.h(collection, "elements");
        this.a.q();
        return super.retainAll(collection);
    }
}
