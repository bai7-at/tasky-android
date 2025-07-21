package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
class d {
    final b a;
    final a b = new a();
    final List c = new ArrayList();

    static class a {
        long a = 0;
        a b;

        a() {
        }

        private void c() {
            if (this.b == null) {
                this.b = new a();
            }
        }

        void a(int i) {
            if (i < 64) {
                this.a &= ~(1 << i);
                return;
            }
            a aVar = this.b;
            if (aVar != null) {
                aVar.a(i - 64);
            }
        }

        int b(int i) {
            a aVar = this.b;
            if (aVar == null) {
                if (i >= 64) {
                    return Long.bitCount(this.a);
                }
                return Long.bitCount(((1 << i) - 1) & this.a);
            }
            if (i >= 64) {
                return aVar.b(i - 64) + Long.bitCount(this.a);
            }
            return Long.bitCount(((1 << i) - 1) & this.a);
        }

        boolean d(int i) {
            if (i < 64) {
                return ((1 << i) & this.a) != 0;
            }
            c();
            return this.b.d(i - 64);
        }

        void e(int i, boolean z) {
            if (i >= 64) {
                c();
                this.b.e(i - 64, z);
                return;
            }
            long j = this.a;
            boolean z2 = (Long.MIN_VALUE & j) != 0;
            long j2 = (1 << i) - 1;
            this.a = ((j & (~j2)) << 1) | (j & j2);
            if (z) {
                h(i);
            } else {
                a(i);
            }
            if (z2 || this.b != null) {
                c();
                this.b.e(0, z2);
            }
        }

        boolean f(int i) {
            if (i >= 64) {
                c();
                return this.b.f(i - 64);
            }
            long j = 1 << i;
            long j2 = this.a;
            boolean z = (j2 & j) != 0;
            long j3 = j2 & (~j);
            this.a = j3;
            long j4 = j - 1;
            this.a = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
            a aVar = this.b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.b.f(0);
            }
            return z;
        }

        void g() {
            this.a = 0L;
            a aVar = this.b;
            if (aVar != null) {
                aVar.g();
            }
        }

        void h(int i) {
            if (i < 64) {
                this.a |= 1 << i;
            } else {
                c();
                this.b.h(i - 64);
            }
        }

        public String toString() {
            if (this.b == null) {
                return Long.toBinaryString(this.a);
            }
            return this.b.toString() + "xx" + Long.toBinaryString(this.a);
        }
    }

    interface b {
        View a(int i);

        void b(View view);

        int c();

        RecyclerView.d0 d(View view);

        void e(int i);

        void f(View view, int i);

        void g();

        int h(View view);

        void i(View view);

        void j(int i);

        void k(View view, int i, ViewGroup.LayoutParams layoutParams);
    }

    d(b bVar) {
        this.a = bVar;
    }

    private int h(int i) {
        if (i < 0) {
            return -1;
        }
        int c = this.a.c();
        int i2 = i;
        while (i2 < c) {
            int b2 = i - (i2 - this.b.b(i2));
            if (b2 == 0) {
                while (this.b.d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += b2;
        }
        return -1;
    }

    private void l(View view) {
        this.c.add(view);
        this.a.b(view);
    }

    private boolean t(View view) {
        if (!this.c.remove(view)) {
            return false;
        }
        this.a.i(view);
        return true;
    }

    void a(View view, int i, boolean z) {
        int c = i < 0 ? this.a.c() : h(i);
        this.b.e(c, z);
        if (z) {
            l(view);
        }
        this.a.f(view, c);
    }

    void b(View view, boolean z) {
        a(view, -1, z);
    }

    void c(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int c = i < 0 ? this.a.c() : h(i);
        this.b.e(c, z);
        if (z) {
            l(view);
        }
        this.a.k(view, c, layoutParams);
    }

    void d(int i) {
        int h = h(i);
        this.b.f(h);
        this.a.e(h);
    }

    View e(int i) {
        int size = this.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = (View) this.c.get(i2);
            RecyclerView.d0 d = this.a.d(view);
            if (d.u() == i && !d.C() && !d.E()) {
                return view;
            }
        }
        return null;
    }

    View f(int i) {
        return this.a.a(h(i));
    }

    int g() {
        return this.a.c() - this.c.size();
    }

    View i(int i) {
        return this.a.a(i);
    }

    int j() {
        return this.a.c();
    }

    void k(View view) {
        int h = this.a.h(view);
        if (h >= 0) {
            this.b.h(h);
            l(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    int m(View view) {
        int h = this.a.h(view);
        if (h == -1 || this.b.d(h)) {
            return -1;
        }
        return h - this.b.b(h);
    }

    boolean n(View view) {
        return this.c.contains(view);
    }

    void o() {
        this.b.g();
        for (int size = this.c.size() - 1; size >= 0; size--) {
            this.a.i((View) this.c.get(size));
            this.c.remove(size);
        }
        this.a.g();
    }

    void p(View view) {
        int h = this.a.h(view);
        if (h < 0) {
            return;
        }
        if (this.b.f(h)) {
            t(view);
        }
        this.a.j(h);
    }

    void q(int i) {
        int h = h(i);
        View a2 = this.a.a(h);
        if (a2 == null) {
            return;
        }
        if (this.b.f(h)) {
            t(a2);
        }
        this.a.j(h);
    }

    boolean r(View view) {
        int h = this.a.h(view);
        if (h == -1) {
            t(view);
            return true;
        }
        if (!this.b.d(h)) {
            return false;
        }
        this.b.f(h);
        t(view);
        this.a.j(h);
        return true;
    }

    void s(View view) {
        int h = this.a.h(view);
        if (h < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        if (this.b.d(h)) {
            this.b.a(h);
            t(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public String toString() {
        return this.b.toString() + ", hidden list:" + this.c.size();
    }
}
