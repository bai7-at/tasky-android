package defpackage;

import defpackage.yp8;

/* loaded from: classes2.dex */
public final class dt8 {
    private final byte[] a = new byte[10];
    private boolean b;
    private int c;
    private long d;
    private int e;
    private int f;
    private int g;

    public void a(yp8 yp8Var, yp8.a aVar) {
        if (this.c > 0) {
            yp8Var.b(this.d, this.e, this.f, this.g, aVar);
            this.c = 0;
        }
    }

    public void b() {
        this.b = false;
        this.c = 0;
    }

    public void c(yp8 yp8Var, long j, int i, int i2, int i3, yp8.a aVar) {
        ur.h(this.g <= i2 + i3, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.b) {
            int i4 = this.c;
            int i5 = i4 + 1;
            this.c = i5;
            if (i4 == 0) {
                this.d = j;
                this.e = i;
                this.f = 0;
            }
            this.f += i2;
            this.g = i3;
            if (i5 >= 16) {
                a(yp8Var, aVar);
            }
        }
    }

    public void d(z72 z72Var) {
        if (this.b) {
            return;
        }
        z72Var.r(this.a, 0, 10);
        z72Var.g();
        if (i2.j(this.a) == 0) {
            return;
        }
        this.b = true;
    }
}
