package defpackage;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.google.android.exoplayer2.t0;
import defpackage.d0;
import defpackage.st8;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: classes2.dex */
public final class m9 implements uy1 {
    private static final byte[] v = {73, 68, 51};
    private final boolean a;
    private final xo5 b;
    private final yo5 c;
    private final String d;
    private String e;
    private yp8 f;
    private yp8 g;
    private int h;
    private int i;
    private int j;
    private boolean k;
    private boolean l;
    private int m;
    private int n;
    private int o;
    private boolean p;
    private long q;
    private int r;
    private long s;
    private yp8 t;
    private long u;

    public m9(boolean z) {
        this(z, null);
    }

    private void b() {
        ur.e(this.f);
        z19.j(this.t);
        z19.j(this.g);
    }

    private void g(yo5 yo5Var) {
        if (yo5Var.a() == 0) {
            return;
        }
        this.b.a[0] = yo5Var.e()[yo5Var.f()];
        this.b.p(2);
        int h = this.b.h(4);
        int i = this.n;
        if (i != -1 && h != i) {
            q();
            return;
        }
        if (!this.l) {
            this.l = true;
            this.m = this.o;
            this.n = h;
        }
        t();
    }

    private boolean h(yo5 yo5Var, int i) {
        yo5Var.U(i + 1);
        if (!w(yo5Var, this.b.a, 1)) {
            return false;
        }
        this.b.p(4);
        int h = this.b.h(1);
        int i2 = this.m;
        if (i2 != -1 && h != i2) {
            return false;
        }
        if (this.n != -1) {
            if (!w(yo5Var, this.b.a, 1)) {
                return true;
            }
            this.b.p(2);
            if (this.b.h(4) != this.n) {
                return false;
            }
            yo5Var.U(i + 2);
        }
        if (!w(yo5Var, this.b.a, 4)) {
            return true;
        }
        this.b.p(14);
        int h2 = this.b.h(13);
        if (h2 < 7) {
            return false;
        }
        byte[] e = yo5Var.e();
        int g = yo5Var.g();
        int i3 = i + h2;
        if (i3 >= g) {
            return true;
        }
        byte b = e[i3];
        if (b == -1) {
            int i4 = i3 + 1;
            if (i4 == g) {
                return true;
            }
            return l((byte) -1, e[i4]) && ((e[i4] & 8) >> 3) == h;
        }
        if (b != 73) {
            return false;
        }
        int i5 = i3 + 1;
        if (i5 == g) {
            return true;
        }
        if (e[i5] != 68) {
            return false;
        }
        int i6 = i3 + 2;
        return i6 == g || e[i6] == 51;
    }

    private boolean i(yo5 yo5Var, byte[] bArr, int i) {
        int min = Math.min(yo5Var.a(), i - this.i);
        yo5Var.l(bArr, this.i, min);
        int i2 = this.i + min;
        this.i = i2;
        return i2 == i;
    }

    private void j(yo5 yo5Var) {
        byte[] e = yo5Var.e();
        int f = yo5Var.f();
        int g = yo5Var.g();
        while (f < g) {
            int i = f + 1;
            byte b = e[f];
            int i2 = b & 255;
            if (this.j == 512 && l((byte) -1, (byte) i2) && (this.l || h(yo5Var, f - 1))) {
                this.o = (b & 8) >> 3;
                this.k = (b & 1) == 0;
                if (this.l) {
                    t();
                } else {
                    r();
                }
                yo5Var.U(i);
                return;
            }
            int i3 = this.j;
            int i4 = i2 | i3;
            if (i4 == 329) {
                this.j = 768;
            } else if (i4 == 511) {
                this.j = 512;
            } else if (i4 == 836) {
                this.j = 1024;
            } else if (i4 == 1075) {
                u();
                yo5Var.U(i);
                return;
            } else if (i3 != 256) {
                this.j = JceEncryptionConstants.SYMMETRIC_KEY_LENGTH;
            }
            f = i;
        }
        yo5Var.U(f);
    }

    private boolean l(byte b, byte b2) {
        return m(((b & 255) << 8) | (b2 & 255));
    }

    public static boolean m(int i) {
        return (i & 65526) == 65520;
    }

    private void n() {
        this.b.p(0);
        if (this.p) {
            this.b.r(10);
        } else {
            int i = 2;
            int h = this.b.h(2) + 1;
            if (h != 2) {
                a84.j("AdtsReader", "Detected audio object type: " + h + ", but assuming AAC LC.");
            } else {
                i = h;
            }
            this.b.r(5);
            byte[] b = d0.b(i, this.n, this.b.h(3));
            d0.b f = d0.f(b);
            t0 G = new t0.b().U(this.e).g0("audio/mp4a-latm").K(f.c).J(f.b).h0(f.a).V(Collections.singletonList(b)).X(this.d).G();
            this.q = 1024000000 / G.N;
            this.f.d(G);
            this.p = true;
        }
        this.b.r(4);
        int h2 = this.b.h(13);
        int i2 = h2 - 7;
        if (this.k) {
            i2 = h2 - 9;
        }
        v(this.f, this.q, 0, i2);
    }

    private void o() {
        this.g.a(this.c, 10);
        this.c.U(6);
        v(this.g, 0L, 10, this.c.G() + 10);
    }

    private void p(yo5 yo5Var) {
        int min = Math.min(yo5Var.a(), this.r - this.i);
        this.t.a(yo5Var, min);
        int i = this.i + min;
        this.i = i;
        int i2 = this.r;
        if (i == i2) {
            long j = this.s;
            if (j != -9223372036854775807L) {
                this.t.b(j, 1, i2, 0, null);
                this.s += this.u;
            }
            s();
        }
    }

    private void q() {
        this.l = false;
        s();
    }

    private void r() {
        this.h = 1;
        this.i = 0;
    }

    private void s() {
        this.h = 0;
        this.i = 0;
        this.j = JceEncryptionConstants.SYMMETRIC_KEY_LENGTH;
    }

    private void t() {
        this.h = 3;
        this.i = 0;
    }

    private void u() {
        this.h = 2;
        this.i = v.length;
        this.r = 0;
        this.c.U(0);
    }

    private void v(yp8 yp8Var, long j, int i, int i2) {
        this.h = 4;
        this.i = i;
        this.t = yp8Var;
        this.u = j;
        this.r = i2;
    }

    private boolean w(yo5 yo5Var, byte[] bArr, int i) {
        if (yo5Var.a() < i) {
            return false;
        }
        yo5Var.l(bArr, 0, i);
        return true;
    }

    @Override // defpackage.uy1
    public void a(yo5 yo5Var) {
        b();
        while (yo5Var.a() > 0) {
            int i = this.h;
            if (i == 0) {
                j(yo5Var);
            } else if (i == 1) {
                g(yo5Var);
            } else if (i != 2) {
                if (i == 3) {
                    if (i(yo5Var, this.b.a, this.k ? 7 : 5)) {
                        n();
                    }
                } else {
                    if (i != 4) {
                        throw new IllegalStateException();
                    }
                    p(yo5Var);
                }
            } else if (i(yo5Var, this.c.e(), 10)) {
                o();
            }
        }
    }

    @Override // defpackage.uy1
    public void c() {
        this.s = -9223372036854775807L;
        q();
    }

    @Override // defpackage.uy1
    public void d(a82 a82Var, st8.d dVar) {
        dVar.a();
        this.e = dVar.b();
        yp8 a = a82Var.a(dVar.c(), 1);
        this.f = a;
        this.t = a;
        if (!this.a) {
            this.g = new rw1();
            return;
        }
        dVar.a();
        yp8 a2 = a82Var.a(dVar.c(), 5);
        this.g = a2;
        a2.d(new t0.b().U(dVar.b()).g0("application/id3").G());
    }

    @Override // defpackage.uy1
    public void e() {
    }

    @Override // defpackage.uy1
    public void f(long j, int i) {
        if (j != -9223372036854775807L) {
            this.s = j;
        }
    }

    public long k() {
        return this.q;
    }

    public m9(boolean z, String str) {
        this.b = new xo5(new byte[7]);
        this.c = new yo5(Arrays.copyOf(v, 10));
        s();
        this.m = -1;
        this.n = -1;
        this.q = -9223372036854775807L;
        this.s = -9223372036854775807L;
        this.a = z;
        this.d = str;
    }
}
