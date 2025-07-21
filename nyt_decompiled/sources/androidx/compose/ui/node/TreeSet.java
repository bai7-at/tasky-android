package androidx.compose.ui.node;

import java.util.Comparator;

/* loaded from: classes.dex */
public final class TreeSet<E> extends java.util.TreeSet<E> {
    public TreeSet(Comparator comparator) {
        super(comparator);
    }

    public /* bridge */ int a() {
        return super.size();
    }

    @Override // java.util.TreeSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return a();
    }
}
