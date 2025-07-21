package defpackage;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.t0;
import defpackage.d0;
import defpackage.st8;
import java.util.Collections;

/* loaded from: classes2.dex */
public final class qy3 implements uy1 {
    private final String a;
    private final yo5 b;
    private final xo5 c;
    private yp8 d;
    private String e;
    private t0 f;
    private int g;
    private int h;
    private int i;
    private int j;
    private long k;
    private boolean l;
    private int m;
    private int n;
    private int o;
    private boolean p;
    private long q;
    private int r;
    private long s;
    private int t;
    private String u;

    public qy3(String str) {
        this.a = str;
        yo5 yo5Var = new yo5(1024);
        this.b = yo5Var;
        this.c = new xo5(yo5Var.e());
        this.k = -9223372036854775807L;
    }

    private static long b(xo5 xo5Var) {
        return xo5Var.h((xo5Var.h(2) + 1) * 8);
    }

    private void g(xo5 xo5Var) {
        if (!xo5Var.g()) {
            this.l = true;
            l(xo5Var);
        } else if (!this.l) {
            return;
        }
        if (this.m != 0) {
            throw ParserException.a(null, null);
        }
        if (this.n != 0) {
            throw ParserException.a(null, null);
        }
        k(xo5Var, j(xo5Var));
        if (this.p) {
            xo5Var.r((int) this.q);
        }
    }

    private int h(xo5 xo5Var) {
        int b = xo5Var.b();
        d0.b e = d0.e(xo5Var, true);
        this.u = e.c;
        this.r = e.a;
        this.t = e.b;
        return b - xo5Var.b();
    }

    private void i(xo5 xo5Var) {
        int h = xo5Var.h(3);
        this.o = h;
        if (h == 0) {
            xo5Var.r(8);
            return;
        }
        if (h == 1) {
            xo5Var.r(9);
            return;
        }
        if (h == 3 || h == 4 || h == 5) {
            xo5Var.r(6);
        } else {
            if (h != 6 && h != 7) {
                throw new IllegalStateException();
            }
            xo5Var.r(1);
        }
    }

    private int j(xo5 xo5Var) {
        int h;
        if (this.o != 0) {
            throw ParserException.a(null, null);
        }
        int i = 0;
        do {
            h = xo5Var.h(8);
            i += h;
        } while (h == 255);
        return i;
    }

    private void k(xo5 xo5Var, int i) {
        int e = xo5Var.e();
        if ((e & 7) == 0) {
            this.b.U(e >> 3);
        } else {
            xo5Var.i(this.b.e(), 0, i * 8);
            this.b.U(0);
        }
        this.d.a(this.b, i);
        long j = this.k;
        if (j != -9223372036854775807L) {
            this.d.b(j, 1, i, 0, null);
            this.k += this.s;
        }
    }

    private void l(xo5 xo5Var) {
        boolean g;
        int h = xo5Var.h(1);
        int h2 = h == 1 ? xo5Var.h(1) : 0;
        this.m = h2;
        if (h2 != 0) {
            throw ParserException.a(null, null);
        }
        if (h == 1) {
            b(xo5Var);
        }
        if (!xo5Var.g()) {
            throw ParserException.a(null, null);
        }
        this.n = xo5Var.h(6);
        int h3 = xo5Var.h(4);
        int h4 = xo5Var.h(3);
        if (h3 != 0 || h4 != 0) {
            throw ParserException.a(null, null);
        }
        if (h == 0) {
            int e = xo5Var.e();
            int h5 = h(xo5Var);
            xo5Var.p(e);
            byte[] bArr = new byte[(h5 + 7) / 8];
            xo5Var.i(bArr, 0, h5);
            t0 G = new t0.b().U(this.e).g0("audio/mp4a-latm").K(this.u).J(this.t).h0(this.r).V(Collections.singletonList(bArr)).X(this.a).G();
            if (!G.equals(this.f)) {
                this.f = G;
                this.s = 1024000000 / G.N;
                this.d.d(G);
            }
        } else {
            xo5Var.r(((int) b(xo5Var)) - h(xo5Var));
        }
        i(xo5Var);
        boolean g2 = xo5Var.g();
        this.p = g2;
        this.q = 0L;
        if (g2) {
            if (h == 1) {
                this.q = b(xo5Var);
            } else {
                do {
                    g = xo5Var.g();
                    this.q = (this.q << 8) + xo5Var.h(8);
                } while (g);
            }
        }
        if (xo5Var.g()) {
            xo5Var.r(8);
        }
    }

    private void m(int i) {
        this.b.Q(i);
        this.c.n(this.b.e());
    }

    @Override // defpackage.uy1
    public void a(yo5 yo5Var) {
        ur.i(this.d);
        while (yo5Var.a() > 0) {
            int i = this.g;
            if (i != 0) {
                if (i == 1) {
                    int H = yo5Var.H();
                    if ((H & 224) == 224) {
                        this.j = H;
                        this.g = 2;
                    } else if (H != 86) {
                        this.g = 0;
                    }
                } else if (i == 2) {
                    int H2 = ((this.j & (-225)) << 8) | yo5Var.H();
                    this.i = H2;
                    if (H2 > this.b.e().length) {
                        m(this.i);
                    }
                    this.h = 0;
                    this.g = 3;
                } else {
                    if (i != 3) {
                        throw new IllegalStateException();
                    }
                    int min = Math.min(yo5Var.a(), this.i - this.h);
                    yo5Var.l(this.c.a, this.h, min);
                    int i2 = this.h + min;
                    this.h = i2;
                    if (i2 == this.i) {
                        this.c.p(0);
                        g(this.c);
                        this.g = 0;
                    }
                }
            } else if (yo5Var.H() == 86) {
                this.g = 1;
            }
        }
    }

    @Override // defpackage.uy1
    public void c() {
        this.g = 0;
        this.k = -9223372036854775807L;
        this.l = false;
    }

    @Override // defpackage.uy1
    public void d(a82 a82Var, st8.d dVar) {
        dVar.a();
        this.d = a82Var.a(dVar.c(), 1);
        this.e = dVar.b();
    }

    @Override // defpackage.uy1
    public void e() {
    }

    @Override // defpackage.uy1
    public void f(long j, int i) {
        if (j != -9223372036854775807L) {
            this.k = j;
        }
    }
}
