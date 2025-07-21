package defpackage;

import java.util.AbstractList;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class n1 extends AbstractList implements List, bv3 {
    protected n1() {
    }

    public abstract int a();

    public abstract Object c(int i);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i) {
        return c(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return a();
    }
}
