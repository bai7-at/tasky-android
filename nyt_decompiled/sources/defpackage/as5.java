package defpackage;

import java.util.Iterator;
import kotlin.collections.AbstractCollection;

/* loaded from: classes.dex */
public final class as5 extends AbstractCollection implements ih3 {
    private final mr5 a;

    public as5(mr5 mr5Var) {
        this.a = mr5Var;
    }

    @Override // kotlin.collections.AbstractCollection
    public int a() {
        return this.a.size();
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.a.containsValue(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new bs5(this.a.s());
    }
}
