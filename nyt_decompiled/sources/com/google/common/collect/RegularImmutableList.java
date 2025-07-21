package com.google.common.collect;

import defpackage.b16;
import java.util.Objects;

/* loaded from: classes3.dex */
class RegularImmutableList<E> extends ImmutableList<E> {
    static final ImmutableList e = new RegularImmutableList(new Object[0], 0);
    final transient Object[] c;
    private final transient int d;

    RegularImmutableList(Object[] objArr, int i) {
        this.c = objArr;
        this.d = i;
    }

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
    int c(Object[] objArr, int i) {
        System.arraycopy(this.c, 0, objArr, i, this.d);
        return i + this.d;
    }

    @Override // com.google.common.collect.ImmutableCollection
    Object[] e() {
        return this.c;
    }

    @Override // com.google.common.collect.ImmutableCollection
    int f() {
        return this.d;
    }

    @Override // com.google.common.collect.ImmutableCollection
    int g() {
        return 0;
    }

    @Override // java.util.List
    public Object get(int i) {
        b16.i(i, this.d);
        Object obj = this.c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.common.collect.ImmutableCollection
    boolean j() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.d;
    }
}
