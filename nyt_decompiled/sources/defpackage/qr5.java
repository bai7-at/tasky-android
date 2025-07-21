package defpackage;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class qr5 extends k1 {
    private final or5 a;

    public qr5(or5 or5Var) {
        this.a = or5Var;
    }

    @Override // defpackage.k1
    public boolean c(Map.Entry entry) {
        Object obj = this.a.get(entry.getKey());
        return obj != null ? zq3.c(obj, entry.getValue()) : entry.getValue() == null && this.a.containsKey(entry.getKey());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.a.clear();
    }

    @Override // defpackage.k1
    public boolean g(Map.Entry entry) {
        return this.a.remove(entry.getKey(), entry.getValue());
    }

    @Override // defpackage.p1
    public int getSize() {
        return this.a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new rr5(this.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public boolean add(Map.Entry entry) {
        throw new UnsupportedOperationException();
    }
}
