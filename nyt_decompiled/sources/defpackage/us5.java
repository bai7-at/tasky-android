package defpackage;

import defpackage.st8;

/* loaded from: classes2.dex */
public final class us5 implements st8 {
    private final uy1 a;
    private final xo5 b = new xo5(new byte[10]);
    private int c = 0;
    private int d;
    private qm8 e;
    private boolean f;
    private boolean g;
    private boolean h;
    private int i;
    private int j;
    private boolean k;
    private long l;

    public us5(uy1 uy1Var) {
        this.a = uy1Var;
    }

    private boolean d(yo5 yo5Var, byte[] bArr, int i) {
        int min = Math.min(yo5Var.a(), i - this.d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            yo5Var.V(min);
        } else {
            yo5Var.l(bArr, this.d, min);
        }
        int i2 = this.d + min;
        this.d = i2;
        return i2 == i;
    }

    private boolean e() {
        this.b.p(0);
        int h = this.b.h(24);
        if (h != 1) {
            a84.j("PesReader", "Unexpected start code prefix: " + h);
            this.j = -1;
            return false;
        }
        this.b.r(8);
        int h2 = this.b.h(16);
        this.b.r(5);
        this.k = this.b.g();
        this.b.r(2);
        this.f = this.b.g();
        this.g = this.b.g();
        this.b.r(6);
        int h3 = this.b.h(8);
        this.i = h3;
        if (h2 == 0) {
            this.j = -1;
        } else {
            int i = (h2 - 3) - h3;
            this.j = i;
            if (i < 0) {
                a84.j("PesReader", "Found negative packet payload size: " + this.j);
                this.j = -1;
            }
        }
        return true;
    }

    private void f() {
        this.b.p(0);
        this.l = -9223372036854775807L;
        if (this.f) {
            this.b.r(4);
            this.b.r(1);
            this.b.r(1);
            long h = (this.b.h(3) << 30) | (this.b.h(15) << 15) | this.b.h(15);
            this.b.r(1);
            if (!this.h && this.g) {
                this.b.r(4);
                this.b.r(1);
                this.b.r(1);
                this.b.r(1);
                this.e.b((this.b.h(3) << 30) | (this.b.h(15) << 15) | this.b.h(15));
                this.h = true;
            }
            this.l = this.e.b(h);
        }
    }

    private void g(int i) {
        this.c = i;
        this.d = 0;
    }

    @Override // defpackage.st8
    public final void a(yo5 yo5Var, int i) {
        ur.i(this.e);
        if ((i & 1) != 0) {
            int i2 = this.c;
            if (i2 != 0 && i2 != 1) {
                if (i2 == 2) {
                    a84.j("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i2 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.j != -1) {
                        a84.j("PesReader", "Unexpected start indicator: expected " + this.j + " more bytes");
                    }
                    this.a.e();
                }
            }
            g(1);
        }
        while (yo5Var.a() > 0) {
            int i3 = this.c;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 == 2) {
                        if (d(yo5Var, this.b.a, Math.min(10, this.i)) && d(yo5Var, null, this.i)) {
                            f();
                            i |= this.k ? 4 : 0;
                            this.a.f(this.l, i);
                            g(3);
                        }
                    } else {
                        if (i3 != 3) {
                            throw new IllegalStateException();
                        }
                        int a = yo5Var.a();
                        int i4 = this.j;
                        int i5 = i4 != -1 ? a - i4 : 0;
                        if (i5 > 0) {
                            a -= i5;
                            yo5Var.T(yo5Var.f() + a);
                        }
                        this.a.a(yo5Var);
                        int i6 = this.j;
                        if (i6 != -1) {
                            int i7 = i6 - a;
                            this.j = i7;
                            if (i7 == 0) {
                                this.a.e();
                                g(1);
                            }
                        }
                    }
                } else if (d(yo5Var, this.b.a, 9)) {
                    g(e() ? 2 : 0);
                }
            } else {
                yo5Var.V(yo5Var.a());
            }
        }
    }

    @Override // defpackage.st8
    public void b(qm8 qm8Var, a82 a82Var, st8.d dVar) {
        this.e = qm8Var;
        this.a.d(a82Var, dVar);
    }

    @Override // defpackage.st8
    public final void c() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.a.c();
    }
}
