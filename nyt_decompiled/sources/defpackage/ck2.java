package defpackage;

import com.google.android.exoplayer2.metadata.Metadata;
import defpackage.dk2;
import defpackage.ei7;
import defpackage.ek2;

/* loaded from: classes2.dex */
public final class ck2 implements y72 {
    public static final d82 o = new d82() { // from class: bk2
        @Override // defpackage.d82
        public final y72[] c() {
            y72[] j;
            j = ck2.j();
            return j;
        }
    };
    private final byte[] a;
    private final yo5 b;
    private final boolean c;
    private final dk2.a d;
    private a82 e;
    private yp8 f;
    private int g;
    private Metadata h;
    private hk2 i;
    private int j;
    private int k;
    private ak2 l;
    private int m;
    private long n;

    public ck2() {
        this(0);
    }

    private long f(yo5 yo5Var, boolean z) {
        boolean z2;
        ur.e(this.i);
        int f = yo5Var.f();
        while (f <= yo5Var.g() - 16) {
            yo5Var.U(f);
            if (dk2.d(yo5Var, this.i, this.k, this.d)) {
                yo5Var.U(f);
                return this.d.a;
            }
            f++;
        }
        if (!z) {
            yo5Var.U(f);
            return -1L;
        }
        while (f <= yo5Var.g() - this.j) {
            yo5Var.U(f);
            try {
                z2 = dk2.d(yo5Var, this.i, this.k, this.d);
            } catch (IndexOutOfBoundsException unused) {
                z2 = false;
            }
            if (yo5Var.f() <= yo5Var.g() ? z2 : false) {
                yo5Var.U(f);
                return this.d.a;
            }
            f++;
        }
        yo5Var.U(yo5Var.g());
        return -1L;
    }

    private void g(z72 z72Var) {
        this.k = ek2.b(z72Var);
        ((a82) z19.j(this.e)).p(h(z72Var.getPosition(), z72Var.getLength()));
        this.g = 5;
    }

    private ei7 h(long j, long j2) {
        ur.e(this.i);
        hk2 hk2Var = this.i;
        if (hk2Var.k != null) {
            return new gk2(hk2Var, j);
        }
        if (j2 == -1 || hk2Var.j <= 0) {
            return new ei7.b(hk2Var.f());
        }
        ak2 ak2Var = new ak2(hk2Var, this.k, j, j2);
        this.l = ak2Var;
        return ak2Var.b();
    }

    private void i(z72 z72Var) {
        byte[] bArr = this.a;
        z72Var.r(bArr, 0, bArr.length);
        z72Var.g();
        this.g = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ y72[] j() {
        return new y72[]{new ck2()};
    }

    private void k() {
        ((yp8) z19.j(this.f)).b((this.n * 1000000) / ((hk2) z19.j(this.i)).e, 1, this.m, 0, null);
    }

    private int l(z72 z72Var, e06 e06Var) {
        boolean z;
        ur.e(this.f);
        ur.e(this.i);
        ak2 ak2Var = this.l;
        if (ak2Var != null && ak2Var.d()) {
            return this.l.c(z72Var, e06Var);
        }
        if (this.n == -1) {
            this.n = dk2.i(z72Var, this.i);
            return 0;
        }
        int g = this.b.g();
        if (g < 32768) {
            int read = z72Var.read(this.b.e(), g, 32768 - g);
            z = read == -1;
            if (!z) {
                this.b.T(g + read);
            } else if (this.b.a() == 0) {
                k();
                return -1;
            }
        } else {
            z = false;
        }
        int f = this.b.f();
        int i = this.m;
        int i2 = this.j;
        if (i < i2) {
            yo5 yo5Var = this.b;
            yo5Var.V(Math.min(i2 - i, yo5Var.a()));
        }
        long f2 = f(this.b, z);
        int f3 = this.b.f() - f;
        this.b.U(f);
        this.f.a(this.b, f3);
        this.m += f3;
        if (f2 != -1) {
            k();
            this.m = 0;
            this.n = f2;
        }
        if (this.b.a() < 16) {
            int a = this.b.a();
            System.arraycopy(this.b.e(), this.b.f(), this.b.e(), 0, a);
            this.b.U(0);
            this.b.T(a);
        }
        return 0;
    }

    private void m(z72 z72Var) {
        this.h = ek2.d(z72Var, !this.c);
        this.g = 1;
    }

    private void n(z72 z72Var) {
        ek2.a aVar = new ek2.a(this.i);
        boolean z = false;
        while (!z) {
            z = ek2.e(z72Var, aVar);
            this.i = (hk2) z19.j(aVar.a);
        }
        ur.e(this.i);
        this.j = Math.max(this.i.c, 6);
        ((yp8) z19.j(this.f)).d(this.i.g(this.a, this.h));
        this.g = 4;
    }

    private void o(z72 z72Var) {
        ek2.i(z72Var);
        this.g = 3;
    }

    @Override // defpackage.y72
    public void a(long j, long j2) {
        if (j == 0) {
            this.g = 0;
        } else {
            ak2 ak2Var = this.l;
            if (ak2Var != null) {
                ak2Var.h(j2);
            }
        }
        this.n = j2 != 0 ? -1L : 0L;
        this.m = 0;
        this.b.Q(0);
    }

    @Override // defpackage.y72
    public void c(a82 a82Var) {
        this.e = a82Var;
        this.f = a82Var.a(0, 1);
        a82Var.s();
    }

    @Override // defpackage.y72
    public int d(z72 z72Var, e06 e06Var) {
        int i = this.g;
        if (i == 0) {
            m(z72Var);
            return 0;
        }
        if (i == 1) {
            i(z72Var);
            return 0;
        }
        if (i == 2) {
            o(z72Var);
            return 0;
        }
        if (i == 3) {
            n(z72Var);
            return 0;
        }
        if (i == 4) {
            g(z72Var);
            return 0;
        }
        if (i == 5) {
            return l(z72Var, e06Var);
        }
        throw new IllegalStateException();
    }

    @Override // defpackage.y72
    public boolean e(z72 z72Var) {
        ek2.c(z72Var, false);
        return ek2.a(z72Var);
    }

    @Override // defpackage.y72
    public void release() {
    }

    public ck2(int i) {
        this.a = new byte[42];
        this.b = new yo5(new byte[32768], 0);
        this.c = (i & 1) != 0;
        this.d = new dk2.a();
        this.g = 0;
    }
}
