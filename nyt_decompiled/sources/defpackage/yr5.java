package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class yr5 extends y1 implements zh3 {
    private final mr5 b;

    public yr5(mr5 mr5Var) {
        this.b = mr5Var;
    }

    @Override // kotlin.collections.AbstractCollection
    public int a() {
        return this.b.size();
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.b.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new zr5(this.b.s());
    }
}
