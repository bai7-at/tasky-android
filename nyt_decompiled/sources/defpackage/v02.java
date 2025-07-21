package defpackage;

import android.os.Parcel;
import android.util.Base64;
import androidx.compose.ui.text.font.l;
import androidx.compose.ui.text.font.m;
import androidx.compose.ui.text.font.o;
import defpackage.dk8;
import defpackage.fk8;
import defpackage.nn0;

/* loaded from: classes.dex */
public final class v02 {
    private Parcel a = Parcel.obtain();

    public final void a(byte b) {
        this.a.writeByte(b);
    }

    public final void b(float f) {
        this.a.writeFloat(f);
    }

    public final void c(int i) {
        this.a.writeInt(i);
    }

    public final void d(jo7 jo7Var) {
        m(jo7Var.c());
        b(fd5.o(jo7Var.d()));
        b(fd5.p(jo7Var.d()));
        b(jo7Var.b());
    }

    public final void e(jy7 jy7Var) {
        long i = jy7Var.i();
        nn0.a aVar = nn0.b;
        if (!nn0.t(i, aVar.g())) {
            a((byte) 1);
            m(jy7Var.i());
        }
        long m = jy7Var.m();
        dk8.a aVar2 = dk8.b;
        if (!dk8.e(m, aVar2.a())) {
            a((byte) 2);
            j(jy7Var.m());
        }
        o p = jy7Var.p();
        if (p != null) {
            a((byte) 3);
            h(p);
        }
        l n = jy7Var.n();
        if (n != null) {
            int i2 = n.i();
            a((byte) 4);
            o(i2);
        }
        m o = jy7Var.o();
        if (o != null) {
            int m2 = o.m();
            a((byte) 5);
            l(m2);
        }
        String l = jy7Var.l();
        if (l != null) {
            a((byte) 6);
            i(l);
        }
        if (!dk8.e(jy7Var.q(), aVar2.a())) {
            a((byte) 7);
            j(jy7Var.q());
        }
        m60 g = jy7Var.g();
        if (g != null) {
            float h = g.h();
            a((byte) 8);
            k(h);
        }
        li8 w = jy7Var.w();
        if (w != null) {
            a((byte) 9);
            g(w);
        }
        if (!nn0.t(jy7Var.f(), aVar.g())) {
            a((byte) 10);
            m(jy7Var.f());
        }
        ph8 u = jy7Var.u();
        if (u != null) {
            a((byte) 11);
            f(u);
        }
        jo7 t = jy7Var.t();
        if (t != null) {
            a((byte) 12);
            d(t);
        }
    }

    public final void f(ph8 ph8Var) {
        c(ph8Var.e());
    }

    public final void g(li8 li8Var) {
        b(li8Var.b());
        b(li8Var.c());
    }

    public final void h(o oVar) {
        c(oVar.p());
    }

    public final void i(String str) {
        this.a.writeString(str);
    }

    public final void j(long j) {
        long g = dk8.g(j);
        fk8.a aVar = fk8.b;
        byte b = 0;
        if (!fk8.g(g, aVar.c())) {
            if (fk8.g(g, aVar.b())) {
                b = 1;
            } else if (fk8.g(g, aVar.a())) {
                b = 2;
            }
        }
        a(b);
        if (fk8.g(dk8.g(j), aVar.c())) {
            return;
        }
        b(dk8.h(j));
    }

    public final void k(float f) {
        b(f);
    }

    public final void l(int i) {
        m.a aVar = m.b;
        byte b = 0;
        if (!m.h(i, aVar.b())) {
            if (m.h(i, aVar.a())) {
                b = 1;
            } else if (m.h(i, aVar.d())) {
                b = 2;
            } else if (m.h(i, aVar.c())) {
                b = 3;
            }
        }
        a(b);
    }

    public final void m(long j) {
        n(j);
    }

    public final void n(long j) {
        this.a.writeLong(j);
    }

    public final void o(int i) {
        l.a aVar = l.b;
        byte b = 0;
        if (!l.f(i, aVar.b()) && l.f(i, aVar.a())) {
            b = 1;
        }
        a(b);
    }

    public final String p() {
        return Base64.encodeToString(this.a.marshall(), 0);
    }

    public final void q() {
        this.a.recycle();
        this.a = Parcel.obtain();
    }
}
