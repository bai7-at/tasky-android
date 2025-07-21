package defpackage;

import android.util.SparseArray;

/* loaded from: classes3.dex */
final class u2g {
    private final pgd c;
    private final SparseArray b = new SparseArray();
    private int a = -1;

    public u2g(pgd pgdVar) {
        this.c = pgdVar;
    }

    public final Object a(int i) {
        if (this.a == -1) {
            this.a = 0;
        }
        while (true) {
            int i2 = this.a;
            if (i2 > 0 && i < this.b.keyAt(i2)) {
                this.a--;
            }
        }
        while (this.a < this.b.size() - 1 && i >= this.b.keyAt(this.a + 1)) {
            this.a++;
        }
        return this.b.valueAt(this.a);
    }

    public final Object b() {
        return this.b.valueAt(this.b.size() - 1);
    }

    public final void c(int i, Object obj) {
        if (this.a == -1) {
            wad.f(this.b.size() == 0);
            this.a = 0;
        }
        if (this.b.size() > 0) {
            int keyAt = this.b.keyAt(r0.size() - 1);
            wad.d(i >= keyAt);
            if (keyAt == i) {
                o2g.D((m2g) this.b.valueAt(r0.size() - 1));
            }
        }
        this.b.append(i, obj);
    }

    public final void d() {
        for (int i = 0; i < this.b.size(); i++) {
            o2g.D((m2g) this.b.valueAt(i));
        }
        this.a = -1;
        this.b.clear();
    }

    public final void e(int i) {
        int i2 = 0;
        while (i2 < this.b.size() - 1) {
            int i3 = i2 + 1;
            if (i < this.b.keyAt(i3)) {
                return;
            }
            o2g.D((m2g) this.b.valueAt(i2));
            this.b.removeAt(i2);
            int i4 = this.a;
            if (i4 > 0) {
                this.a = i4 - 1;
            }
            i2 = i3;
        }
    }

    public final boolean f() {
        return this.b.size() == 0;
    }
}
