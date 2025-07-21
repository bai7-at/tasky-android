package defpackage;

import java.util.Iterator;

/* loaded from: classes3.dex */
final class yad implements Iterator {
    final Iterator a;
    final /* synthetic */ ccd b;

    yad(ccd ccdVar) {
        cqb cqbVar;
        this.b = ccdVar;
        cqbVar = ccdVar.a;
        this.a = cqbVar.iterator();
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
