package defpackage;

import com.google.android.exoplayer2.source.rtsp.h;
import defpackage.i2;

/* loaded from: classes2.dex */
public final class r37 implements a47 {
    private final h a;
    private yp8 c;
    private int d;
    private long f;
    private long g;
    private final xo5 b = new xo5();
    private long e = -9223372036854775807L;

    public r37(h hVar) {
        this.a = hVar;
    }

    private void e() {
        if (this.d > 0) {
            f();
        }
    }

    private void f() {
        ((yp8) z19.j(this.c)).b(this.f, 1, this.d, 0, null);
        this.d = 0;
    }

    private void g(yo5 yo5Var, boolean z, int i, long j) {
        int a = yo5Var.a();
        ((yp8) ur.e(this.c)).a(yo5Var, a);
        this.d += a;
        this.f = j;
        if (z && i == 3) {
            f();
        }
    }

    private void h(yo5 yo5Var, int i, long j) {
        this.b.n(yo5Var.e());
        this.b.s(2);
        for (int i2 = 0; i2 < i; i2++) {
            i2.b f = i2.f(this.b);
            ((yp8) ur.e(this.c)).a(yo5Var, f.e);
            ((yp8) z19.j(this.c)).b(j, 1, f.e, 0, null);
            j += (f.f / f.c) * 1000000;
            this.b.s(f.e);
        }
    }

    private void i(yo5 yo5Var, long j) {
        int a = yo5Var.a();
        ((yp8) ur.e(this.c)).a(yo5Var, a);
        ((yp8) z19.j(this.c)).b(j, 1, a, 0, null);
    }

    @Override // defpackage.a47
    public void a(long j, long j2) {
        this.e = j;
        this.g = j2;
    }

    @Override // defpackage.a47
    public void b(a82 a82Var, int i) {
        yp8 a = a82Var.a(i, 1);
        this.c = a;
        a.d(this.a.c);
    }

    @Override // defpackage.a47
    public void c(long j, int i) {
        ur.g(this.e == -9223372036854775807L);
        this.e = j;
    }

    @Override // defpackage.a47
    public void d(yo5 yo5Var, long j, int i, boolean z) {
        int H = yo5Var.H() & 3;
        int H2 = yo5Var.H() & 255;
        long a = c47.a(this.g, j, this.e, this.a.b);
        if (H == 0) {
            e();
            if (H2 == 1) {
                i(yo5Var, a);
                return;
            } else {
                h(yo5Var, H2, a);
                return;
            }
        }
        if (H == 1 || H == 2) {
            e();
        } else if (H != 3) {
            throw new IllegalArgumentException(String.valueOf(H));
        }
        g(yo5Var, z, H, a);
    }
}
