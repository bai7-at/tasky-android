package defpackage;

/* loaded from: classes3.dex */
abstract class h4a {
    private tx9 b;
    private sv9 c;
    private u3a d;
    private long e;
    private long f;
    private long g;
    private int h;
    private int i;
    private long k;
    private boolean l;
    private boolean m;
    private final s3a a = new s3a();
    private e4a j = new e4a();

    protected abstract long a(b9e b9eVar);

    protected void b(boolean z) {
        int i;
        if (z) {
            this.j = new e4a();
            this.f = 0L;
            i = 0;
        } else {
            i = 1;
        }
        this.h = i;
        this.e = -1L;
        this.g = 0L;
    }

    protected abstract boolean c(b9e b9eVar, long j, e4a e4aVar);

    final int d(ov9 ov9Var, cx9 cx9Var) {
        wad.b(this.b);
        int i = khe.a;
        int i2 = this.h;
        if (i2 == 0) {
            while (this.a.e(ov9Var)) {
                long zzf = ov9Var.zzf();
                long j = this.f;
                this.k = zzf - j;
                if (c(this.a.a(), j, this.j)) {
                    this.f = ov9Var.zzf();
                } else {
                    l6a l6aVar = this.j.a;
                    this.i = l6aVar.z;
                    if (!this.m) {
                        this.b.f(l6aVar);
                        this.m = true;
                    }
                    u3a u3aVar = this.j.b;
                    if (u3aVar != null) {
                        this.d = u3aVar;
                    } else if (ov9Var.zzd() == -1) {
                        this.d = new g4a(null);
                    } else {
                        t3a b = this.a.b();
                        this.d = new n3a(this, this.f, ov9Var.zzd(), b.d + b.e, b.b, (b.a & 4) != 0);
                    }
                    this.h = 2;
                    this.a.d();
                }
            }
            this.h = 3;
            return -1;
        }
        if (i2 == 1) {
            ((bv9) ov9Var).l((int) this.f, false);
            this.h = 2;
            return 0;
        }
        if (i2 != 2) {
            return -1;
        }
        long b2 = this.d.b(ov9Var);
        if (b2 >= 0) {
            cx9Var.a = b2;
            return 1;
        }
        if (b2 < -1) {
            h(-(b2 + 2));
        }
        if (!this.l) {
            gx9 zze = this.d.zze();
            wad.b(zze);
            this.c.m(zze);
            this.l = true;
        }
        if (this.k <= 0 && !this.a.e(ov9Var)) {
            this.h = 3;
            return -1;
        }
        this.k = 0L;
        b9e a = this.a.a();
        long a2 = a(a);
        if (a2 >= 0) {
            long j2 = this.g;
            if (j2 + a2 >= this.e) {
                long e = e(j2);
                kx9.b(this.b, a, a.t());
                this.b.c(e, 1, a.t(), 0, null);
                this.e = -1L;
            }
        }
        this.g += a2;
        return 0;
    }

    protected final long e(long j) {
        return (j * 1000000) / this.i;
    }

    protected final long f(long j) {
        return (this.i * j) / 1000000;
    }

    final void g(sv9 sv9Var, tx9 tx9Var) {
        this.c = sv9Var;
        this.b = tx9Var;
        b(true);
    }

    protected void h(long j) {
        this.g = j;
    }

    final void i(long j, long j2) {
        this.a.c();
        if (j == 0) {
            b(!this.l);
            return;
        }
        if (this.h != 0) {
            long f = f(j2);
            this.e = f;
            u3a u3aVar = this.d;
            int i = khe.a;
            u3aVar.a(f);
            this.h = 2;
        }
    }
}
