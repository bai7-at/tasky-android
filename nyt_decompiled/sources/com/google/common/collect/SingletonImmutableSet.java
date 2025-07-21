package com.google.common.collect;

import defpackage.b16;
import defpackage.gx8;

/* loaded from: classes3.dex */
final class SingletonImmutableSet<E> extends ImmutableSet<E> {
    final transient Object c;

    SingletonImmutableSet(Object obj) {
        this.c = b16.k(obj);
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public ImmutableList a() {
        return ImmutableList.y(this.c);
    }

    @Override // com.google.common.collect.ImmutableCollection
    int c(Object[] objArr, int i) {
        objArr[i] = this.c;
        return i + 1;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.c.equals(obj);
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // com.google.common.collect.ImmutableCollection
    boolean j() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: k */
    public gx8 iterator() {
        return Iterators.r(this.c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        String obj = this.c.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2);
        sb.append('[');
        sb.append(obj);
        sb.append(']');
        return sb.toString();
    }
}
