package defpackage;

import java.util.Iterator;

/* loaded from: classes5.dex */
public abstract class yk2 implements Iterator, yu3 {
    public abstract float c();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return Float.valueOf(c());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
