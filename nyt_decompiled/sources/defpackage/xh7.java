package defpackage;

import defpackage.st8;

/* loaded from: classes2.dex */
public final class xh7 implements st8 {
    private final vh7 a;
    private final yo5 b = new yo5(32);
    private int c;
    private int d;
    private boolean e;
    private boolean f;

    public xh7(vh7 vh7Var) {
        this.a = vh7Var;
    }

    @Override // defpackage.st8
    public void a(yo5 yo5Var, int i) {
        boolean z = (i & 1) != 0;
        int f = z ? yo5Var.f() + yo5Var.H() : -1;
        if (this.f) {
            if (!z) {
                return;
            }
            this.f = false;
            yo5Var.U(f);
            this.d = 0;
        }
        while (yo5Var.a() > 0) {
            int i2 = this.d;
            if (i2 < 3) {
                if (i2 == 0) {
                    int H = yo5Var.H();
                    yo5Var.U(yo5Var.f() - 1);
                    if (H == 255) {
                        this.f = true;
                        return;
                    }
                }
                int min = Math.min(yo5Var.a(), 3 - this.d);
                yo5Var.l(this.b.e(), this.d, min);
                int i3 = this.d + min;
                this.d = i3;
                if (i3 == 3) {
                    this.b.U(0);
                    this.b.T(3);
                    this.b.V(1);
                    int H2 = this.b.H();
                    int H3 = this.b.H();
                    this.e = (H2 & 128) != 0;
                    this.c = (((H2 & 15) << 8) | H3) + 3;
                    int b = this.b.b();
                    int i4 = this.c;
                    if (b < i4) {
                        this.b.c(Math.min(4098, Math.max(i4, this.b.b() * 2)));
                    }
                }
            } else {
                int min2 = Math.min(yo5Var.a(), this.c - this.d);
                yo5Var.l(this.b.e(), this.d, min2);
                int i5 = this.d + min2;
                this.d = i5;
                int i6 = this.c;
                if (i5 != i6) {
                    continue;
                } else {
                    if (!this.e) {
                        this.b.T(i6);
                    } else {
                        if (z19.t(this.b.e(), 0, this.c, -1) != 0) {
                            this.f = true;
                            return;
                        }
                        this.b.T(this.c - 4);
                    }
                    this.b.U(0);
                    this.a.a(this.b);
                    this.d = 0;
                }
            }
        }
    }

    @Override // defpackage.st8
    public void b(qm8 qm8Var, a82 a82Var, st8.d dVar) {
        this.a.b(qm8Var, a82Var, dVar);
        this.f = true;
    }

    @Override // defpackage.st8
    public void c() {
        this.f = true;
    }
}
