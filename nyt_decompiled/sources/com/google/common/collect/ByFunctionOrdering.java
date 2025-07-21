package com.google.common.collect;

import defpackage.b16;
import defpackage.hc5;
import defpackage.ht2;
import java.io.Serializable;

/* loaded from: classes3.dex */
final class ByFunctionOrdering<F, T> extends o implements Serializable {
    private static final long serialVersionUID = 0;
    final ht2 function;
    final o ordering;

    ByFunctionOrdering(ht2 ht2Var, o oVar) {
        this.function = (ht2) b16.k(ht2Var);
        this.ordering = (o) b16.k(oVar);
    }

    @Override // com.google.common.collect.o, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.ordering.compare(this.function.apply(obj), this.function.apply(obj2));
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByFunctionOrdering)) {
            return false;
        }
        ByFunctionOrdering byFunctionOrdering = (ByFunctionOrdering) obj;
        return this.function.equals(byFunctionOrdering.function) && this.ordering.equals(byFunctionOrdering.ordering);
    }

    public int hashCode() {
        return hc5.b(this.function, this.ordering);
    }

    public String toString() {
        String valueOf = String.valueOf(this.ordering);
        String valueOf2 = String.valueOf(this.function);
        StringBuilder sb = new StringBuilder(valueOf.length() + 13 + valueOf2.length());
        sb.append(valueOf);
        sb.append(".onResultOf(");
        sb.append(valueOf2);
        sb.append(")");
        return sb.toString();
    }
}
