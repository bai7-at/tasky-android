package com.google.common.collect;

import defpackage.gx8;

/* loaded from: classes3.dex */
final class RegularImmutableSet<E> extends ImmutableSet<E> {
    private static final Object[] h;
    static final RegularImmutableSet i;
    final transient Object[] c;
    private final transient int d;
    final transient Object[] e;
    private final transient int f;
    private final transient int g;

    static {
        Object[] objArr = new Object[0];
        h = objArr;
        i = new RegularImmutableSet(objArr, 0, objArr, 0, 0);
    }

    RegularImmutableSet(Object[] objArr, int i2, Object[] objArr2, int i3, int i4) {
        this.c = objArr;
        this.d = i2;
        this.e = objArr2;
        this.f = i3;
        this.g = i4;
    }

    @Override // com.google.common.collect.ImmutableCollection
    int c(Object[] objArr, int i2) {
        System.arraycopy(this.c, 0, objArr, i2, this.g);
        return i2 + this.g;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        Object[] objArr = this.e;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int c = i.c(obj);
        while (true) {
            int i2 = c & this.f;
            Object obj2 = objArr[i2];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            c = i2 + 1;
        }
    }

    @Override // com.google.common.collect.ImmutableCollection
    Object[] e() {
        return this.c;
    }

    @Override // com.google.common.collect.ImmutableCollection
    int f() {
        return this.g;
    }

    @Override // com.google.common.collect.ImmutableCollection
    int g() {
        return 0;
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.d;
    }

    @Override // com.google.common.collect.ImmutableCollection
    boolean j() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: k */
    public gx8 iterator() {
        return a().iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.g;
    }

    @Override // com.google.common.collect.ImmutableSet
    ImmutableList w() {
        return ImmutableList.o(this.c, this.g);
    }

    @Override // com.google.common.collect.ImmutableSet
    boolean x() {
        return true;
    }
}
