package defpackage;

import java.util.Iterator;

/* loaded from: classes5.dex */
public abstract class wt1 implements Iterator, yu3 {
    public abstract double c();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return Double.valueOf(c());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
