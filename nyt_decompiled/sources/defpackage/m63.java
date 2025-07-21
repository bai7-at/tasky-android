package defpackage;

import com.google.android.exoplayer2.t0;
import defpackage.j15;
import defpackage.st8;
import java.util.Collections;

/* loaded from: classes2.dex */
public final class m63 implements uy1 {
    private final mi7 a;
    private String b;
    private yp8 c;
    private a d;
    private boolean e;
    private long l;
    private final boolean[] f = new boolean[3];
    private final i15 g = new i15(32, 128);
    private final i15 h = new i15(33, 128);
    private final i15 i = new i15(34, 128);
    private final i15 j = new i15(39, 128);
    private final i15 k = new i15(40, 128);
    private long m = -9223372036854775807L;
    private final yo5 n = new yo5();

    private static final class a {
        private final yp8 a;
        private long b;
        private boolean c;
        private int d;
        private long e;
        private boolean f;
        private boolean g;
        private boolean h;
        private boolean i;
        private boolean j;
        private long k;
        private long l;
        private boolean m;

        public a(yp8 yp8Var) {
            this.a = yp8Var;
        }

        private static boolean b(int i) {
            return (32 <= i && i <= 35) || i == 39;
        }

        private static boolean c(int i) {
            return i < 32 || i == 40;
        }

        private void d(int i) {
            long j = this.l;
            if (j == -9223372036854775807L) {
                return;
            }
            boolean z = this.m;
            this.a.b(j, z ? 1 : 0, (int) (this.b - this.k), i, null);
        }

        public void a(long j, int i, boolean z) {
            if (this.j && this.g) {
                this.m = this.c;
                this.j = false;
            } else if (this.h || this.g) {
                if (z && this.i) {
                    d(i + ((int) (j - this.b)));
                }
                this.k = this.b;
                this.l = this.e;
                this.m = this.c;
                this.i = true;
            }
        }

        public void e(byte[] bArr, int i, int i2) {
            if (this.f) {
                int i3 = this.d;
                int i4 = (i + 2) - i3;
                if (i4 >= i2) {
                    this.d = i3 + (i2 - i);
                } else {
                    this.g = (bArr[i4] & 128) != 0;
                    this.f = false;
                }
            }
        }

        public void f() {
            this.f = false;
            this.g = false;
            this.h = false;
            this.i = false;
            this.j = false;
        }

        public void g(long j, int i, int i2, long j2, boolean z) {
            this.g = false;
            this.h = false;
            this.e = j2;
            this.d = 0;
            this.b = j;
            if (!c(i2)) {
                if (this.i && !this.j) {
                    if (z) {
                        d(i);
                    }
                    this.i = false;
                }
                if (b(i2)) {
                    this.h = !this.j;
                    this.j = true;
                }
            }
            boolean z2 = i2 >= 16 && i2 <= 21;
            this.c = z2;
            this.f = z2 || i2 <= 9;
        }
    }

    public m63(mi7 mi7Var) {
        this.a = mi7Var;
    }

    private void b() {
        ur.i(this.c);
        z19.j(this.d);
    }

    private void g(long j, int i, int i2, long j2) {
        this.d.a(j, i, this.e);
        if (!this.e) {
            this.g.b(i2);
            this.h.b(i2);
            this.i.b(i2);
            if (this.g.c() && this.h.c() && this.i.c()) {
                this.c.d(i(this.b, this.g, this.h, this.i));
                this.e = true;
            }
        }
        if (this.j.b(i2)) {
            i15 i15Var = this.j;
            this.n.S(this.j.d, j15.q(i15Var.d, i15Var.e));
            this.n.V(5);
            this.a.a(j2, this.n);
        }
        if (this.k.b(i2)) {
            i15 i15Var2 = this.k;
            this.n.S(this.k.d, j15.q(i15Var2.d, i15Var2.e));
            this.n.V(5);
            this.a.a(j2, this.n);
        }
    }

    private void h(byte[] bArr, int i, int i2) {
        this.d.e(bArr, i, i2);
        if (!this.e) {
            this.g.a(bArr, i, i2);
            this.h.a(bArr, i, i2);
            this.i.a(bArr, i, i2);
        }
        this.j.a(bArr, i, i2);
        this.k.a(bArr, i, i2);
    }

    private static t0 i(String str, i15 i15Var, i15 i15Var2, i15 i15Var3) {
        int i = i15Var.e;
        byte[] bArr = new byte[i15Var2.e + i + i15Var3.e];
        System.arraycopy(i15Var.d, 0, bArr, 0, i);
        System.arraycopy(i15Var2.d, 0, bArr, i15Var.e, i15Var2.e);
        System.arraycopy(i15Var3.d, 0, bArr, i15Var.e + i15Var2.e, i15Var3.e);
        j15.a h = j15.h(i15Var2.d, 3, i15Var2.e);
        return new t0.b().U(str).g0("video/hevc").K(wm0.c(h.a, h.b, h.c, h.d, h.h, h.i)).n0(h.k).S(h.l).c0(h.m).V(Collections.singletonList(bArr)).G();
    }

    private void j(long j, int i, int i2, long j2) {
        this.d.g(j, i, i2, j2, this.e);
        if (!this.e) {
            this.g.e(i2);
            this.h.e(i2);
            this.i.e(i2);
        }
        this.j.e(i2);
        this.k.e(i2);
    }

    @Override // defpackage.uy1
    public void a(yo5 yo5Var) {
        b();
        while (yo5Var.a() > 0) {
            int f = yo5Var.f();
            int g = yo5Var.g();
            byte[] e = yo5Var.e();
            this.l += yo5Var.a();
            this.c.a(yo5Var, yo5Var.a());
            while (f < g) {
                int c = j15.c(e, f, g, this.f);
                if (c == g) {
                    h(e, f, g);
                    return;
                }
                int e2 = j15.e(e, c);
                int i = c - f;
                if (i > 0) {
                    h(e, f, c);
                }
                int i2 = g - c;
                long j = this.l - i2;
                g(j, i2, i < 0 ? -i : 0, this.m);
                j(j, i2, e2, this.m);
                f = c + 3;
            }
        }
    }

    @Override // defpackage.uy1
    public void c() {
        this.l = 0L;
        this.m = -9223372036854775807L;
        j15.a(this.f);
        this.g.d();
        this.h.d();
        this.i.d();
        this.j.d();
        this.k.d();
        a aVar = this.d;
        if (aVar != null) {
            aVar.f();
        }
    }

    @Override // defpackage.uy1
    public void d(a82 a82Var, st8.d dVar) {
        dVar.a();
        this.b = dVar.b();
        yp8 a2 = a82Var.a(dVar.c(), 2);
        this.c = a2;
        this.d = new a(a2);
        this.a.b(a82Var, dVar);
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
}
