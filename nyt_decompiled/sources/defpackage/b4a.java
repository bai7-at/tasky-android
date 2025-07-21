package defpackage;

import java.util.Iterator;

/* loaded from: classes3.dex */
final class b4a implements Iterator {
    final /* synthetic */ Iterator a;

    b4a(Iterator it2) {
        this.a = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return new eda((String) this.a.next());
    }
}
