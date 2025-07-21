package defpackage;

import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.c;

/* loaded from: classes.dex */
public final class hs5 extends i1 {
    private final Object[] c;
    private final ts8 d;

    public hs5(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        super(i, i2);
        this.c = objArr2;
        int d = c.d(i2);
        this.d = new ts8(objArr, uo6.i(i, d), d, i3);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        c();
        if (this.d.hasNext()) {
            h(f() + 1);
            return this.d.next();
        }
        Object[] objArr = this.c;
        int f = f();
        h(f + 1);
        return objArr[f - this.d.g()];
    }

    @Override // java.util.ListIterator
    public Object previous() {
        d();
        if (f() <= this.d.g()) {
            h(f() - 1);
            return this.d.previous();
        }
        Object[] objArr = this.c;
        h(f() - 1);
        return objArr[f() - this.d.g()];
    }
}
