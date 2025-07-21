package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class vs8 implements Iterator, yu3 {
    private Object[] a = us8.e.a().p();
    private int b;
    private int c;

    public final Object c() {
        op0.a(h());
        return this.a[this.c];
    }

    public final us8 d() {
        op0.a(i());
        Object obj = this.a[this.c];
        zq3.f(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        return (us8) obj;
    }

    protected final Object[] f() {
        return this.a;
    }

    protected final int g() {
        return this.c;
    }

    public final boolean h() {
        return this.c < this.b;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return h();
    }

    public final boolean i() {
        op0.a(this.c >= this.b);
        return this.c < this.a.length;
    }

    public final void j() {
        op0.a(h());
        this.c += 2;
    }

    public final void l() {
        op0.a(i());
        this.c++;
    }

    public final void m(Object[] objArr, int i) {
        n(objArr, i, 0);
    }

    public final void n(Object[] objArr, int i, int i2) {
        this.a = objArr;
        this.b = i;
        this.c = i2;
    }

    protected final void o(int i) {
        this.c = i;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
