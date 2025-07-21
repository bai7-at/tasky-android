package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class ur5 extends m1 implements Collection, zu3 {
    private final or5 a;

    public ur5(or5 or5Var) {
        this.a = or5Var;
    }

    @Override // defpackage.m1
    public int a() {
        return this.a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new vr5(this.a);
    }
}
