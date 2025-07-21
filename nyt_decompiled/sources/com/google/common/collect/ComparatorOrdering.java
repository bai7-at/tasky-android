package com.google.common.collect;

import defpackage.b16;
import java.io.Serializable;
import java.util.Comparator;

/* loaded from: classes3.dex */
final class ComparatorOrdering<T> extends o implements Serializable {
    private static final long serialVersionUID = 0;
    final Comparator<T> comparator;

    ComparatorOrdering(Comparator comparator) {
        this.comparator = (Comparator) b16.k(comparator);
    }

    @Override // com.google.common.collect.o, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.comparator.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ComparatorOrdering) {
            return this.comparator.equals(((ComparatorOrdering) obj).comparator);
        }
        return false;
    }

    public int hashCode() {
        return this.comparator.hashCode();
    }

    public String toString() {
        return this.comparator.toString();
    }
}
