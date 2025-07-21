package com.google.common.collect;

import com.google.common.collect.q;
import defpackage.gx8;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class ImmutableMultimap<K, V> extends com.google.common.collect.d implements Serializable {
    private static final long serialVersionUID = 0;
    final transient ImmutableMap e;
    final transient int f;

    private static class EntryCollection<K, V> extends ImmutableCollection<Map.Entry<K, V>> {
        private static final long serialVersionUID = 0;
        final ImmutableMultimap<K, V> multimap;

        EntryCollection(ImmutableMultimap immutableMultimap) {
            this.multimap = immutableMultimap;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.multimap.b(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        /* renamed from: k */
        public gx8 iterator() {
            return this.multimap.i();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.multimap.size();
        }
    }

    private static final class Values<K, V> extends ImmutableCollection<V> {
        private static final long serialVersionUID = 0;
        private final transient ImmutableMultimap b;

        Values(ImmutableMultimap immutableMultimap) {
            this.b = immutableMultimap;
        }

        @Override // com.google.common.collect.ImmutableCollection
        int c(Object[] objArr, int i) {
            gx8 it2 = this.b.e.values().iterator();
            while (it2.hasNext()) {
                i = ((ImmutableCollection) it2.next()).c(objArr, i);
            }
            return i;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return this.b.d(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        /* renamed from: k */
        public gx8 iterator() {
            return this.b.j();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.b.size();
        }
    }

    class a extends gx8 {
        final Iterator a;
        Object b = null;
        Iterator c = Iterators.f();

        a() {
            this.a = ImmutableMultimap.this.e.entrySet().iterator();
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (!this.c.hasNext()) {
                Map.Entry entry = (Map.Entry) this.a.next();
                this.b = entry.getKey();
                this.c = ((ImmutableCollection) entry.getValue()).iterator();
            }
            Object obj = this.b;
            Objects.requireNonNull(obj);
            return Maps.d(obj, this.c.next());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.c.hasNext() || this.a.hasNext();
        }
    }

    class b extends gx8 {
        Iterator a;
        Iterator b = Iterators.f();

        b() {
            this.a = ImmutableMultimap.this.e.values().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.b.hasNext() || this.a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!this.b.hasNext()) {
                this.b = ((ImmutableCollection) this.a.next()).iterator();
            }
            return this.b.next();
        }
    }

    public static class c {
        final Map a = p.d();
        Comparator b;
        Comparator c;

        public ImmutableMultimap a() {
            Collection entrySet = this.a.entrySet();
            Comparator comparator = this.b;
            if (comparator != null) {
                entrySet = o.a(comparator).d().b(entrySet);
            }
            return ImmutableListMultimap.s(entrySet, this.c);
        }

        Collection b() {
            return new ArrayList();
        }

        public c c(Object obj, Object obj2) {
            e.a(obj, obj2);
            Collection collection = (Collection) this.a.get(obj);
            if (collection == null) {
                Map map = this.a;
                Collection b = b();
                map.put(obj, b);
                collection = b;
            }
            collection.add(obj2);
            return this;
        }
    }

    static class d {
        static final q.b a = q.a(ImmutableMultimap.class, "map");
        static final q.b b = q.a(ImmutableMultimap.class, "size");
    }

    ImmutableMultimap(ImmutableMap immutableMap, int i) {
        this.e = immutableMap;
        this.f = i;
    }

    @Override // com.google.common.collect.c, defpackage.tx4
    public /* bridge */ /* synthetic */ boolean b(Object obj, Object obj2) {
        return super.b(obj, obj2);
    }

    @Override // defpackage.tx4
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.c
    public boolean d(Object obj) {
        return obj != null && super.d(obj);
    }

    @Override // com.google.common.collect.c
    Map e() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.c
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.c
    Set g() {
        throw new AssertionError("unreachable");
    }

    @Override // com.google.common.collect.c
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.c, defpackage.tx4
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public ImmutableMap c() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.c
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public ImmutableCollection f() {
        return new EntryCollection(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.c
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public ImmutableCollection h() {
        return new Values(this);
    }

    @Override // com.google.common.collect.c, defpackage.tx4
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public ImmutableCollection a() {
        return (ImmutableCollection) super.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.c
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public gx8 i() {
        return new a();
    }

    @Override // com.google.common.collect.c, defpackage.tx4
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public ImmutableSet keySet() {
        return this.e.keySet();
    }

    @Override // defpackage.tx4
    public final boolean put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.c
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public gx8 j() {
        return new b();
    }

    @Override // com.google.common.collect.c, defpackage.tx4
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public ImmutableCollection values() {
        return (ImmutableCollection) super.values();
    }

    @Override // com.google.common.collect.c, defpackage.tx4
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.tx4
    public int size() {
        return this.f;
    }

    @Override // com.google.common.collect.c
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
