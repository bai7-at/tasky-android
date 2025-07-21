package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class nh3 implements List, RandomAccess {
    private final List a;

    private nh3(List list) {
        this.a = Collections.unmodifiableList(list);
    }

    public static nh3 a(List list) {
        return new nh3(list);
    }

    public static nh3 c(Object... objArr) {
        return new nh3(Arrays.asList(objArr));
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(Object obj) {
        return this.a.add(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection collection) {
        return this.a.addAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        this.a.clear();
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return this.a.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection collection) {
        return this.a.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        return this.a.equals(obj);
    }

    @Override // java.util.List
    public Object get(int i) {
        return this.a.get(i);
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return this.a.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return this.a.iterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return this.a.lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return this.a.listIterator();
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        return this.a.remove(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection collection) {
        return this.a.removeAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection collection) {
        return this.a.retainAll(collection);
    }

    @Override // java.util.List
    public Object set(int i, Object obj) {
        return this.a.set(i, obj);
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
        return this.a.size();
    }

    @Override // java.util.List
    public List subList(int i, int i2) {
        return this.a.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return this.a.toArray();
    }

    @Override // java.util.List
    public void add(int i, Object obj) {
        this.a.add(i, obj);
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection collection) {
        return this.a.addAll(i, collection);
    }

    @Override // java.util.List
    public ListIterator listIterator(int i) {
        return this.a.listIterator(i);
    }

    @Override // java.util.List
    public Object remove(int i) {
        return this.a.remove(i);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return this.a.toArray(objArr);
    }
}
