package defpackage;

import java.util.Iterator;

/* loaded from: classes3.dex */
final class qz9 implements Iterator {
    final Iterator a;
    final /* synthetic */ sz9 b;

    qz9(sz9 sz9Var) {
        vw9 vw9Var;
        this.b = sz9Var;
        vw9Var = sz9Var.a;
        this.a = vw9Var.iterator();
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
