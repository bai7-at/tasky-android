package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
final class lu9 implements Iterator {
    final /* synthetic */ Iterator a;
    final /* synthetic */ Iterator b;

    lu9(qx9 qx9Var, Iterator it2, Iterator it3) {
        this.a = it2;
        this.b = it3;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.a.hasNext()) {
            return true;
        }
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (this.a.hasNext()) {
            return new eda(((Integer) this.a.next()).toString());
        }
        if (this.b.hasNext()) {
            return new eda((String) this.b.next());
        }
        throw new NoSuchElementException();
    }
}
