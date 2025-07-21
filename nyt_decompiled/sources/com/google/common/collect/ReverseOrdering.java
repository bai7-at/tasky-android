package com.google.common.collect;

import defpackage.b16;
import java.io.Serializable;

/* loaded from: classes3.dex */
final class ReverseOrdering<T> extends o implements Serializable {
    private static final long serialVersionUID = 0;
    final o forwardOrder;

    ReverseOrdering(o oVar) {
        this.forwardOrder = (o) b16.k(oVar);
    }

    @Override // com.google.common.collect.o, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.forwardOrder.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ReverseOrdering) {
            return this.forwardOrder.equals(((ReverseOrdering) obj).forwardOrder);
        }
        return false;
    }

    @Override // com.google.common.collect.o
    public o f() {
        return this.forwardOrder;
    }

    public int hashCode() {
        return -this.forwardOrder.hashCode();
    }

    public String toString() {
        String valueOf = String.valueOf(this.forwardOrder);
        StringBuilder sb = new StringBuilder(valueOf.length() + 10);
        sb.append(valueOf);
        sb.append(".reverse()");
        return sb.toString();
    }
}
