package defpackage;

import java.util.Iterator;

/* loaded from: classes3.dex */
final class g2f implements Iterator {
    final Iterator a;
    final /* synthetic */ h2f b;

    g2f(h2f h2fVar) {
        o1f o1fVar;
        this.b = h2fVar;
        o1fVar = h2fVar.a;
        this.a = o1fVar.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
