package defpackage;

import java.util.Iterator;

/* loaded from: classes5.dex */
public abstract class yq7 implements Iterator, yu3 {
    public abstract short c();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return Short.valueOf(c());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
