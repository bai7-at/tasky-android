package defpackage;

import com.google.android.exoplayer2.t0;
import defpackage.m2;
import defpackage.st8;

/* loaded from: classes2.dex */
public final class l2 implements uy1 {
    private final xo5 a;
    private final yo5 b;
    private final String c;
    private String d;
    private yp8 e;
    private int f;
    private int g;
    private boolean h;
    private boolean i;
    private long j;
    private t0 k;
    private int l;
    private long m;

    public l2() {
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
        m2.b d = m2.d(this.a);
        t0 t0Var = this.k;
        if (t0Var == null || d.c != t0Var.M || d.b != t0Var.N || !"audio/ac4".equals(t0Var.l)) {
            t0 G = new t0.b().U(this.d).g0("audio/ac4").J(d.c).h0(d.b).X(this.c).G();
            this.k = G;
            this.e.d(G);
        }
        this.l = d.d;
        this.j = (d.e * 1000000) / this.k.N;
    }

    private boolean h(yo5 yo5Var) {
        int H;
        while (true) {
            if (yo5Var.a() <= 0) {
                return false;
            }
            if (this.h) {
                H = yo5Var.H();
                this.h = H == 172;
                if (H == 64 || H == 65) {
                    break;
                }
            } else {
                this.h = yo5Var.H() == 172;
            }
        }
        this.i = H == 65;
        return true;
    }

    @Override // defpackage.uy1
    public void a(yo5 yo5Var) {
        ur.i(this.e);
        while (yo5Var.a() > 0) {
            int i = this.f;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        int min = Math.min(yo5Var.a(), this.l - this.g);
                        this.e.a(yo5Var, min);
                        int i2 = this.g + min;
                        this.g = i2;
                        int i3 = this.l;
                        if (i2 == i3) {
                            long j = this.m;
                            if (j != -9223372036854775807L) {
                                this.e.b(j, 1, i3, 0, null);
                                this.m += this.j;
                            }
                            this.f = 0;
                        }
                    }
                } else if (b(yo5Var, this.b.e(), 16)) {
                    g();
                    this.b.U(0);
                    this.e.a(this.b, 16);
                    this.f = 2;
                }
            } else if (h(yo5Var)) {
                this.f = 1;
                this.b.e()[0] = -84;
                this.b.e()[1] = (byte) (this.i ? 65 : 64);
                this.g = 2;
            }
        }
    }

    @Override // defpackage.uy1
    public void c() {
        this.f = 0;
        this.g = 0;
        this.h = false;
        this.i = false;
        this.m = -9223372036854775807L;
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
            this.m = j;
        }
    }

    public l2(String str) {
        xo5 xo5Var = new xo5(new byte[16]);
        this.a = xo5Var;
        this.b = new yo5(xo5Var.a);
        this.f = 0;
        this.g = 0;
        this.h = false;
        this.i = false;
        this.m = -9223372036854775807L;
        this.c = str;
    }
}
