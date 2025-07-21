package defpackage;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class i3f extends AbstractList {
    private static final j3f c = j3f.b(i3f.class);
    final List a;
    final Iterator b;

    public i3f(List list, Iterator it2) {
        this.a = list;
        this.b = it2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        if (this.a.size() > i) {
            return this.a.get(i);
        }
        if (!this.b.hasNext()) {
            throw new NoSuchElementException();
        }
        this.a.add(this.b.next());
        return get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new h3f(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        j3f j3fVar = c;
        j3fVar.a("potentially expensive size() call");
        j3fVar.a("blowup running");
        while (this.b.hasNext()) {
            this.a.add(this.b.next());
        }
        return this.a.size();
    }
}
