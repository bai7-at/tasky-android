package com.google.common.collect;

import defpackage.ht2;
import java.util.Comparator;

/* loaded from: classes3.dex */
public abstract class o implements Comparator {
    protected o() {
    }

    public static o a(Comparator comparator) {
        return comparator instanceof o ? (o) comparator : new ComparatorOrdering(comparator);
    }

    public static o c() {
        return NaturalOrdering.a;
    }

    public ImmutableList b(Iterable iterable) {
        return ImmutableList.C(this, iterable);
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);

    o d() {
        return e(Maps.e());
    }

    public o e(ht2 ht2Var) {
        return new ByFunctionOrdering(ht2Var, this);
    }

    public o f() {
        return new ReverseOrdering(this);
    }
}
