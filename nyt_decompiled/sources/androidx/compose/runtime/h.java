package androidx.compose.runtime;

import defpackage.ov7;
import defpackage.yu3;
import defpackage.zs0;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* loaded from: classes.dex */
final class h implements Iterator, yu3 {
    private final r a;
    private final int b;
    private int c;
    private final int d;

    public h(r rVar, int i, int i2) {
        this.a = rVar;
        this.b = i2;
        this.c = i;
        this.d = rVar.v();
        if (rVar.w()) {
            throw new ConcurrentModificationException();
        }
    }

    private final void d() {
        if (this.a.v() != this.d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public zs0 next() {
        int I;
        d();
        int i = this.c;
        I = ov7.I(this.a.o(), i);
        this.c = I + i;
        return new s(this.a, i, this.d);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.c < this.b;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
