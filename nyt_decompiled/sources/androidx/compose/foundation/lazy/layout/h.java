package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.a;
import defpackage.ss2;
import defpackage.vy4;

/* loaded from: classes.dex */
public final class h implements a {
    private final vy4 a = new vy4(new a.C0029a[16], 0);
    private int b;
    private a.C0029a c;

    private final void d(int i) {
        if (i < 0 || i >= a()) {
            throw new IndexOutOfBoundsException("Index " + i + ", size " + a());
        }
    }

    private final boolean e(a.C0029a c0029a, int i) {
        return i < c0029a.b() + c0029a.a() && c0029a.b() <= i;
    }

    private final a.C0029a f(int i) {
        int b;
        a.C0029a c0029a = this.c;
        if (c0029a != null && e(c0029a, i)) {
            return c0029a;
        }
        vy4 vy4Var = this.a;
        b = b.b(vy4Var, i);
        a.C0029a c0029a2 = (a.C0029a) vy4Var.p()[b];
        this.c = c0029a2;
        return c0029a2;
    }

    @Override // androidx.compose.foundation.lazy.layout.a
    public int a() {
        return this.b;
    }

    @Override // androidx.compose.foundation.lazy.layout.a
    public void b(int i, int i2, ss2 ss2Var) {
        int b;
        d(i);
        d(i2);
        if (i2 < i) {
            throw new IllegalArgumentException(("toIndex (" + i2 + ") should be not smaller than fromIndex (" + i + ')').toString());
        }
        b = b.b(this.a, i);
        int b2 = ((a.C0029a) this.a.p()[b]).b();
        while (b2 <= i2) {
            a.C0029a c0029a = (a.C0029a) this.a.p()[b];
            ss2Var.invoke(c0029a);
            b2 += c0029a.a();
            b++;
        }
    }

    public final void c(int i, Object obj) {
        if (i < 0) {
            throw new IllegalArgumentException(("size should be >=0, but was " + i).toString());
        }
        if (i == 0) {
            return;
        }
        a.C0029a c0029a = new a.C0029a(a(), i, obj);
        this.b = a() + i;
        this.a.b(c0029a);
    }

    @Override // androidx.compose.foundation.lazy.layout.a
    public a.C0029a get(int i) {
        d(i);
        return f(i);
    }
}
