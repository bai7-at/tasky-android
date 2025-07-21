package defpackage;

import com.google.android.exoplayer2.t0;
import defpackage.i2;
import defpackage.st8;

/* loaded from: classes2.dex */
public final class h2 implements uy1 {
    private final xo5 a;
    private final yo5 b;
    private final String c;
    private String d;
    private yp8 e;
    private int f;
    private int g;
    private boolean h;
    private long i;
    private t0 j;
    private int k;
    private long l;

    public h2() {
        this(null);
    }

    private boolean b(yo5 yo5Var, byte[] bArr, int i) {
        int min = Math.min(yo5Var.a(), i - this.g);
        yo5Var.l(bArr, this.g, min);
        int i2 = this.g + min;
        this.g = i2;
        return i2 == i;
    }

    private void g() {
        this.a.p(0);
        i2.b f = i2.f(this.a);
        t0 t0Var = this.j;
        if (t0Var == null || f.d != t0Var.M || f.c != t0Var.N || !z19.c(f.a, t0Var.l)) {
            t0.b b0 = new t0.b().U(this.d).g0(f.a).J(f.d).h0(f.c).X(this.c).b0(f.g);
            if ("audio/ac3".equals(f.a)) {
                b0.I(f.g);
            }
            t0 G = b0.G();
            this.j = G;
            this.e.d(G);
        }
        this.k = f.e;
        this.i = (f.f * 1000000) / this.j.N;
    }

    private boolean h(yo5 yo5Var) {
        while (true) {
            if (yo5Var.a() <= 0) {
                return false;
            }
            if (this.h) {
                int H = yo5Var.H();
                if (H == 119) {
                    this.h = false;
                    return true;
                }
                this.h = H == 11;
            } else {
                this.h = yo5Var.H() == 11;
            }
        }
    }

    @Override // defpackage.uy1
    public void a(yo5 yo5Var) {
        ur.i(this.e);
        while (yo5Var.a() > 0) {
            int i = this.f;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        int min = Math.min(yo5Var.a(), this.k - this.g);
                        this.e.a(yo5Var, min);
                        int i2 = this.g + min;
                        this.g = i2;
                        int i3 = this.k;
                        if (i2 == i3) {
                            long j = this.l;
                            if (j != -9223372036854775807L) {
                                this.e.b(j, 1, i3, 0, null);
                                this.l += this.i;
                            }
                            this.f = 0;
                        }
                    }
                } else if (b(yo5Var, this.b.e(), 128)) {
                    g();
                    this.b.U(0);
                    this.e.a(this.b, 128);
                    this.f = 2;
                }
            } else if (h(yo5Var)) {
                this.f = 1;
                this.b.e()[0] = 11;
                this.b.e()[1] = 119;
                this.g = 2;
            }
        }
    }

    @Override // defpackage.uy1
    public void c() {
        this.f = 0;
        this.g = 0;
        this.h = false;
        this.l = -9223372036854775807L;
    }

    @Override // defpackage.uy1
    public void d(a82 a82Var, st8.d dVar) {
        dVar.a();
        this.d = dVar.b();
        this.e = a82Var.a(dVar.c(), 1);
    }

    @Override // defpackage.uy1
    public void e() {
    }

    @Override // defpackage.uy1
    public void f(long j, int i) {
        if (j != -9223372036854775807L) {
            this.l = j;
        }
    }

    public h2(String str) {
        xo5 xo5Var = new xo5(new byte[128]);
        this.a = xo5Var;
        this.b = new yo5(xo5Var.a);
        this.f = 0;
        this.l = -9223372036854775807L;
        this.c = str;
    }
}
