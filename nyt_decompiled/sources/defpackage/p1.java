package defpackage;

import java.util.AbstractSet;
import java.util.Set;

/* loaded from: classes5.dex */
public abstract class p1 extends AbstractSet implements Set, hv3 {
    protected p1() {
    }

    public abstract int getSize();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return getSize();
    }
}
