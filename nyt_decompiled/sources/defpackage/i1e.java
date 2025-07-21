package defpackage;

import java.util.Iterator;

/* loaded from: classes3.dex */
final class i1e implements Iterator {
    final Iterator a;
    final /* synthetic */ k2e b;

    i1e(k2e k2eVar) {
        rlc rlcVar;
        this.b = k2eVar;
        rlcVar = k2eVar.a;
        this.a = rlcVar.iterator();
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
