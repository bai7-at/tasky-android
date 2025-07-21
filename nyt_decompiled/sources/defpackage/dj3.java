package defpackage;

import java.util.Iterator;
import kotlin.collections.i;

/* loaded from: classes5.dex */
public final class dj3 implements Iterator, yu3 {
    private final Iterator a;
    private int b;

    public dj3(Iterator it2) {
        zq3.h(it2, "iterator");
        this.a = it2;
    }

    @Override // java.util.Iterator
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final bj3 next() {
        int i = this.b;
        this.b = i + 1;
        if (i < 0) {
            i.v();
        }
        return new bj3(i, this.a.next());
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
