package defpackage;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class wr5 extends y1 implements zh3 {
    private final mr5 b;

    public wr5(mr5 mr5Var) {
        this.b = mr5Var;
    }

    @Override // kotlin.collections.AbstractCollection
    public int a() {
        return this.b.size();
    }

    public boolean c(Map.Entry entry) {
        if (entry == null) {
            return false;
        }
        Object obj = this.b.get(entry.getKey());
        return obj != null ? zq3.c(obj, entry.getValue()) : entry.getValue() == null && this.b.containsKey(entry.getKey());
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return c((Map.Entry) obj);
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new xr5(this.b.s());
    }
}
