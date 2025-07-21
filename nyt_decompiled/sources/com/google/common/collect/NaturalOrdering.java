package com.google.common.collect;

import defpackage.b16;
import java.io.Serializable;

/* loaded from: classes3.dex */
final class NaturalOrdering extends o implements Serializable {
    static final NaturalOrdering a = new NaturalOrdering();
    private static final long serialVersionUID = 0;

    private NaturalOrdering() {
    }

    private Object readResolve() {
        return a;
    }

    @Override // com.google.common.collect.o
    public o f() {
        return ReverseNaturalOrdering.a;
    }

    @Override // com.google.common.collect.o, java.util.Comparator
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable comparable, Comparable comparable2) {
        b16.k(comparable);
        b16.k(comparable2);
        return comparable.compareTo(comparable2);
    }

    public String toString() {
        return "Ordering.natural()";
    }
}
