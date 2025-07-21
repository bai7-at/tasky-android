package defpackage;

import java.util.Iterator;

/* loaded from: classes3.dex */
final class h3f implements Iterator {
    int a = 0;
    final /* synthetic */ i3f b;

    h3f(i3f i3fVar) {
        this.b = i3fVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b.a.size() || this.b.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.a >= this.b.a.size()) {
            i3f i3fVar = this.b;
            i3fVar.a.add(i3fVar.b.next());
            return next();
        }
        i3f i3fVar2 = this.b;
        int i = this.a;
        this.a = i + 1;
        return i3fVar2.a.get(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
