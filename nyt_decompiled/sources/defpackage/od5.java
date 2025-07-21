package defpackage;

import com.google.android.exoplayer2.ParserException;

/* loaded from: classes2.dex */
final class od5 {
    public int a;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;
    public int g;
    public int h;
    public int i;
    public final int[] j = new int[255];
    private final yo5 k = new yo5(255);

    od5() {
    }

    public boolean a(z72 z72Var, boolean z) {
        b();
        this.k.Q(27);
        if (!b82.b(z72Var, this.k.e(), 0, 27, z) || this.k.J() != 1332176723) {
            return false;
        }
        int H = this.k.H();
        this.a = H;
        if (H != 0) {
            if (z) {
                return false;
            }
            throw ParserException.e("unsupported bit stream revision");
        }
        this.b = this.k.H();
        this.c = this.k.v();
        this.d = this.k.x();
        this.e = this.k.x();
        this.f = this.k.x();
        int H2 = this.k.H();
        this.g = H2;
        this.h = H2 + 27;
        this.k.Q(H2);
        if (!b82.b(z72Var, this.k.e(), 0, this.g, z)) {
            return false;
        }
        for (int i = 0; i < this.g; i++) {
            this.j[i] = this.k.H();
            this.i += this.j[i];
        }
        return true;
    }

    public void b() {
        this.a = 0;
        this.b = 0;
        this.c = 0L;
        this.d = 0L;
        this.e = 0L;
        this.f = 0L;
        this.g = 0;
        this.h = 0;
        this.i = 0;
    }

    public boolean c(z72 z72Var) {
        return d(z72Var, -1L);
    }

    public boolean d(z72 z72Var, long j) {
        ur.a(z72Var.getPosition() == z72Var.l());
        this.k.Q(4);
        while (true) {
            if ((j == -1 || z72Var.getPosition() + 4 < j) && b82.b(z72Var, this.k.e(), 0, 4, true)) {
                this.k.U(0);
                if (this.k.J() == 1332176723) {
                    z72Var.g();
                    return true;
                }
                z72Var.p(1);
            }
        }
        do {
            if (j != -1 && z72Var.getPosition() >= j) {
                break;
            }
        } while (z72Var.a(1) != -1);
        return false;
    }
}
