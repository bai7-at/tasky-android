package defpackage;

import java.util.Iterator;

/* loaded from: classes5.dex */
public abstract class nf0 implements Iterator, yu3 {
    public abstract byte a();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return Byte.valueOf(a());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
