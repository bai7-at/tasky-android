package com.google.common.collect;

import defpackage.b16;
import java.io.Serializable;

/* loaded from: classes3.dex */
final class ReverseNaturalOrdering extends o implements Serializable {
    static final ReverseNaturalOrdering a = new ReverseNaturalOrdering();
    private static final long serialVersionUID = 0;

    private ReverseNaturalOrdering() {
    }

    private Object readResolve() {
        return a;
    }

    @Override // com.google.common.collect.o
    public o f() {
        return o.c();
    }

    @Override // com.google.common.collect.o, java.util.Comparator
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable comparable, Comparable comparable2) {
        b16.k(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public String toString() {
        return "Ordering.natural().reverse()";
    }
}
