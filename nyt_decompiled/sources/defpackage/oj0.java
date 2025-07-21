package defpackage;

import java.util.Iterator;

/* loaded from: classes5.dex */
public abstract class oj0 implements Iterator, yu3 {
    public abstract char c();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return Character.valueOf(c());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
