package defpackage;

import java.util.Iterator;

/* loaded from: classes3.dex */
final class ogf implements Iterator {
    final Iterator a;
    final /* synthetic */ rgf b;

    ogf(rgf rgfVar) {
        gcf gcfVar;
        this.b = rgfVar;
        gcfVar = rgfVar.a;
        this.a = gcfVar.iterator();
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
