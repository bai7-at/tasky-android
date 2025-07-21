package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.t0;
import defpackage.ei7;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class x20 implements y72 {
    private int c;
    private y20 e;
    private long h;
    private sk0 i;
    private int m;
    private boolean n;
    private final yo5 a = new yo5(12);
    private final c b = new c();
    private a82 d = new pw1();
    private sk0[] g = new sk0[0];
    private long k = -1;
    private long l = -1;
    private int j = -1;
    private long f = -9223372036854775807L;

    private class b implements ei7 {
        private final long a;

        public b(long j) {
            this.a = j;
        }

        @Override // defpackage.ei7
        public ei7.a f(long j) {
            ei7.a i = x20.this.g[0].i(j);
            for (int i2 = 1; i2 < x20.this.g.length; i2++) {
                ei7.a i3 = x20.this.g[i2].i(j);
                if (i3.a.b < i.a.b) {
                    i = i3;
                }
            }
            return i;
        }

        @Override // defpackage.ei7
        public boolean h() {
            return true;
        }

        @Override // defpackage.ei7
        public long i() {
            return this.a;
        }
    }

    private static class c {
        public int a;
        public int b;
        public int c;

        private c() {
        }

        public void a(yo5 yo5Var) {
            this.a = yo5Var.u();
            this.b = yo5Var.u();
            this.c = 0;
        }

        public void b(yo5 yo5Var) {
            a(yo5Var);
            if (this.a == 1414744396) {
                this.c = yo5Var.u();
                return;
            }
            throw ParserException.a("LIST expected, found: " + this.a, null);
        }
    }

    private static void f(z72 z72Var) {
        if ((z72Var.getPosition() & 1) == 1) {
            z72Var.p(1);
        }
    }

    private sk0 g(int i) {
        for (sk0 sk0Var : this.g) {
            if (sk0Var.j(i)) {
                return sk0Var;
            }
        }
        return null;
    }

    private void h(yo5 yo5Var) {
        u54 c2 = u54.c(1819436136, yo5Var);
        if (c2.getType() != 1819436136) {
            throw ParserException.a("Unexpected header list type " + c2.getType(), null);
        }
        y20 y20Var = (y20) c2.b(y20.class);
        if (y20Var == null) {
            throw ParserException.a("AviHeader not found", null);
        }
        this.e = y20Var;
        this.f = y20Var.c * y20Var.a;
        ArrayList arrayList = new ArrayList();
        gx8 it2 = c2.a.iterator();
        int i = 0;
        while (it2.hasNext()) {
            w20 w20Var = (w20) it2.next();
            if (w20Var.getType() == 1819440243) {
                int i2 = i + 1;
                sk0 k = k((u54) w20Var, i);
                if (k != null) {
                    arrayList.add(k);
                }
                i = i2;
            }
        }
        this.g = (sk0[]) arrayList.toArray(new sk0[0]);
        this.d.s();
    }

    private void i(yo5 yo5Var) {
        long j = j(yo5Var);
        while (yo5Var.a() >= 16) {
            int u = yo5Var.u();
            int u2 = yo5Var.u();
            long u3 = yo5Var.u() + j;
            yo5Var.u();
            sk0 g = g(u);
            if (g != null) {
                if ((u2 & 16) == 16) {
                    g.b(u3);
                }
                g.k();
            }
        }
        for (sk0 sk0Var : this.g) {
            sk0Var.c();
        }
        this.n = true;
        this.d.p(new b(this.f));
    }

    private long j(yo5 yo5Var) {
        if (yo5Var.a() < 16) {
            return 0L;
        }
        int f = yo5Var.f();
        yo5Var.V(8);
        long u = yo5Var.u();
        long j = this.k;
        long j2 = u <= j ? j + 8 : 0L;
        yo5Var.U(f);
        return j2;
    }

    private sk0 k(u54 u54Var, int i) {
        z20 z20Var = (z20) u54Var.b(z20.class);
        n38 n38Var = (n38) u54Var.b(n38.class);
        if (z20Var == null) {
            a84.j("AviExtractor", "Missing Stream Header");
            return null;
        }
        if (n38Var == null) {
            a84.j("AviExtractor", "Missing Stream Format");
            return null;
        }
        long a2 = z20Var.a();
        t0 t0Var = n38Var.a;
        t0.b c2 = t0Var.c();
        c2.T(i);
        int i2 = z20Var.f;
        if (i2 != 0) {
            c2.Y(i2);
        }
        q38 q38Var = (q38) u54Var.b(q38.class);
        if (q38Var != null) {
            c2.W(q38Var.a);
        }
        int k = ku4.k(t0Var.l);
        if (k != 1 && k != 2) {
            return null;
        }
        yp8 a3 = this.d.a(i, k);
        a3.d(c2.G());
        sk0 sk0Var = new sk0(i, k, a2, z20Var.e, a3);
        this.f = a2;
        return sk0Var;
    }

    private int l(z72 z72Var) {
        if (z72Var.getPosition() >= this.l) {
            return -1;
        }
        sk0 sk0Var = this.i;
        if (sk0Var == null) {
            f(z72Var);
            z72Var.r(this.a.e(), 0, 12);
            this.a.U(0);
            int u = this.a.u();
            if (u == 1414744396) {
                this.a.U(8);
                z72Var.p(this.a.u() != 1769369453 ? 8 : 12);
                z72Var.g();
                return 0;
            }
            int u2 = this.a.u();
            if (u == 1263424842) {
                this.h = z72Var.getPosition() + u2 + 8;
                return 0;
            }
            z72Var.p(8);
            z72Var.g();
            sk0 g = g(u);
            if (g == null) {
                this.h = z72Var.getPosition() + u2;
                return 0;
            }
            g.n(u2);
            this.i = g;
        } else if (sk0Var.m(z72Var)) {
            this.i = null;
        }
        return 0;
    }

    private boolean m(z72 z72Var, e06 e06Var) {
        boolean z;
        if (this.h != -1) {
            long position = z72Var.getPosition();
            long j = this.h;
            if (j < position || j > PlaybackStateCompat.ACTION_SET_REPEAT_MODE + position) {
                e06Var.a = j;
                z = true;
                this.h = -1L;
                return z;
            }
            z72Var.p((int) (j - position));
        }
        z = false;
        this.h = -1L;
        return z;
    }

    @Override // defpackage.y72
    public void a(long j, long j2) {
        this.h = -1L;
        this.i = null;
        for (sk0 sk0Var : this.g) {
            sk0Var.o(j);
        }
        if (j != 0) {
            this.c = 6;
        } else if (this.g.length == 0) {
            this.c = 0;
        } else {
            this.c = 3;
        }
    }

    @Override // defpackage.y72
    public void c(a82 a82Var) {
        this.c = 0;
        this.d = a82Var;
        this.h = -1L;
    }

    @Override // defpackage.y72
    public int d(z72 z72Var, e06 e06Var) {
        if (m(z72Var, e06Var)) {
            return 1;
        }
        switch (this.c) {
            case 0:
                if (!e(z72Var)) {
                    throw ParserException.a("AVI Header List not found", null);
                }
                z72Var.p(12);
                this.c = 1;
                return 0;
            case 1:
                z72Var.readFully(this.a.e(), 0, 12);
                this.a.U(0);
                this.b.b(this.a);
                c cVar = this.b;
                if (cVar.c == 1819436136) {
                    this.j = cVar.b;
                    this.c = 2;
                    return 0;
                }
                throw ParserException.a("hdrl expected, found: " + this.b.c, null);
            case 2:
                int i = this.j - 4;
                yo5 yo5Var = new yo5(i);
                z72Var.readFully(yo5Var.e(), 0, i);
                h(yo5Var);
                this.c = 3;
                return 0;
            case 3:
                if (this.k != -1) {
                    long position = z72Var.getPosition();
                    long j = this.k;
                    if (position != j) {
                        this.h = j;
                        return 0;
                    }
                }
                z72Var.r(this.a.e(), 0, 12);
                z72Var.g();
                this.a.U(0);
                this.b.a(this.a);
                int u = this.a.u();
                int i2 = this.b.a;
                if (i2 == 1179011410) {
                    z72Var.p(12);
                    return 0;
                }
                if (i2 != 1414744396 || u != 1769369453) {
                    this.h = z72Var.getPosition() + this.b.b + 8;
                    return 0;
                }
                long position2 = z72Var.getPosition();
                this.k = position2;
                this.l = position2 + this.b.b + 8;
                if (!this.n) {
                    if (((y20) ur.e(this.e)).a()) {
                        this.c = 4;
                        this.h = this.l;
                        return 0;
                    }
                    this.d.p(new ei7.b(this.f));
                    this.n = true;
                }
                this.h = z72Var.getPosition() + 12;
                this.c = 6;
                return 0;
            case 4:
                z72Var.readFully(this.a.e(), 0, 8);
                this.a.U(0);
                int u2 = this.a.u();
                int u3 = this.a.u();
                if (u2 == 829973609) {
                    this.c = 5;
                    this.m = u3;
                } else {
                    this.h = z72Var.getPosition() + u3;
                }
                return 0;
            case 5:
                yo5 yo5Var2 = new yo5(this.m);
                z72Var.readFully(yo5Var2.e(), 0, this.m);
                i(yo5Var2);
                this.c = 6;
                this.h = this.k;
                return 0;
            case 6:
                return l(z72Var);
            default:
                throw new AssertionError();
        }
    }

    @Override // defpackage.y72
    public boolean e(z72 z72Var) {
        z72Var.r(this.a.e(), 0, 12);
        this.a.U(0);
        if (this.a.u() != 1179011410) {
            return false;
        }
        this.a.V(4);
        return this.a.u() == 541677121;
    }

    @Override // defpackage.y72
    public void release() {
    }
}
