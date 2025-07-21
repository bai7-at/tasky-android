package defpackage;

import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.c;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class ts8 extends i1 {
    private int c;
    private Object[] d;
    private boolean e;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public ts8(Object[] objArr, int i, int i2, int i3) {
        super(i, i2);
        this.c = i3;
        Object[] objArr2 = new Object[i3];
        this.d = objArr2;
        ?? r5 = i == i2 ? 1 : 0;
        this.e = r5;
        objArr2[0] = objArr;
        l(i - r5, 1);
    }

    private final Object j() {
        int f = f() & 31;
        Object obj = this.d[this.c - 1];
        zq3.f(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return ((Object[]) obj)[f];
    }

    private final void l(int i, int i2) {
        int i3 = (this.c - i2) * 5;
        while (i2 < this.c) {
            Object[] objArr = this.d;
            Object obj = objArr[i2 - 1];
            zq3.f(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[i2] = ((Object[]) obj)[c.a(i, i3)];
            i3 -= 5;
            i2++;
        }
    }

    private final void m(int i) {
        int i2 = 0;
        while (c.a(f(), i2) == i) {
            i2 += 5;
        }
        if (i2 > 0) {
            l(f(), ((this.c - 1) - (i2 / 5)) + 1);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    public final void n(Object[] objArr, int i, int i2, int i3) {
        h(i);
        i(i2);
        this.c = i3;
        if (this.d.length < i3) {
            this.d = new Object[i3];
        }
        this.d[0] = objArr;
        ?? r0 = i == i2 ? 1 : 0;
        this.e = r0;
        l(i - r0, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object j = j();
        h(f() + 1);
        if (f() == g()) {
            this.e = true;
            return j;
        }
        m(0);
        return j;
    }

    @Override // java.util.ListIterator
    public Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        h(f() - 1);
        if (this.e) {
            this.e = false;
            return j();
        }
        m(31);
        return j();
    }
}
