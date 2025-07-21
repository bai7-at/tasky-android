package defpackage;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata;
import com.google.android.exoplayer2.t0;
import defpackage.ei7;

/* loaded from: classes2.dex */
public final class zs3 implements y72 {
    private a82 b;
    private int c;
    private int d;
    private int e;
    private MotionPhotoMetadata g;
    private z72 h;
    private m08 i;
    private rw4 j;
    private final yo5 a = new yo5(6);
    private long f = -1;

    private void b(z72 z72Var) {
        this.a.Q(2);
        z72Var.r(this.a.e(), 0, 2);
        z72Var.n(this.a.N() - 2);
    }

    private void f() {
        h(new Metadata.Entry[0]);
        ((a82) ur.e(this.b)).s();
        this.b.p(new ei7.b(-9223372036854775807L));
        this.c = 6;
    }

    private static MotionPhotoMetadata g(String str, long j) {
        ew4 a;
        if (j == -1 || (a = dm9.a(str)) == null) {
            return null;
        }
        return a.a(j);
    }

    private void h(Metadata.Entry... entryArr) {
        ((a82) ur.e(this.b)).a(1024, 4).d(new t0.b().M("image/jpeg").Z(new Metadata(entryArr)).G());
    }

    private int i(z72 z72Var) {
        this.a.Q(2);
        z72Var.r(this.a.e(), 0, 2);
        return this.a.N();
    }

    private void j(z72 z72Var) {
        this.a.Q(2);
        z72Var.readFully(this.a.e(), 0, 2);
        int N = this.a.N();
        this.d = N;
        if (N == 65498) {
            if (this.f != -1) {
                this.c = 4;
                return;
            } else {
                f();
                return;
            }
        }
        if ((N < 65488 || N > 65497) && N != 65281) {
            this.c = 1;
        }
    }

    private void k(z72 z72Var) {
        String B;
        if (this.d == 65505) {
            yo5 yo5Var = new yo5(this.e);
            z72Var.readFully(yo5Var.e(), 0, this.e);
            if (this.g == null && "http://ns.adobe.com/xap/1.0/".equals(yo5Var.B()) && (B = yo5Var.B()) != null) {
                MotionPhotoMetadata g = g(B, z72Var.getLength());
                this.g = g;
                if (g != null) {
                    this.f = g.videoStartPosition;
                }
            }
        } else {
            z72Var.p(this.e);
        }
        this.c = 0;
    }

    private void l(z72 z72Var) {
        this.a.Q(2);
        z72Var.readFully(this.a.e(), 0, 2);
        this.e = this.a.N() - 2;
        this.c = 2;
    }

    private void m(z72 z72Var) {
        if (!z72Var.e(this.a.e(), 0, 1, true)) {
            f();
            return;
        }
        z72Var.g();
        if (this.j == null) {
            this.j = new rw4();
        }
        m08 m08Var = new m08(z72Var, this.f);
        this.i = m08Var;
        if (!this.j.e(m08Var)) {
            f();
        } else {
            this.j.c(new n08(this.f, (a82) ur.e(this.b)));
            n();
        }
    }

    private void n() {
        h((Metadata.Entry) ur.e(this.g));
        this.c = 5;
    }

    @Override // defpackage.y72
    public void a(long j, long j2) {
        if (j == 0) {
            this.c = 0;
            this.j = null;
        } else if (this.c == 5) {
            ((rw4) ur.e(this.j)).a(j, j2);
        }
    }

    @Override // defpackage.y72
    public void c(a82 a82Var) {
        this.b = a82Var;
    }

    @Override // defpackage.y72
    public int d(z72 z72Var, e06 e06Var) {
        int i = this.c;
        if (i == 0) {
            j(z72Var);
            return 0;
        }
        if (i == 1) {
            l(z72Var);
            return 0;
        }
        if (i == 2) {
            k(z72Var);
            return 0;
        }
        if (i == 4) {
            long position = z72Var.getPosition();
            long j = this.f;
            if (position != j) {
                e06Var.a = j;
                return 1;
            }
            m(z72Var);
            return 0;
        }
        if (i != 5) {
            if (i == 6) {
                return -1;
            }
            throw new IllegalStateException();
        }
        if (this.i == null || z72Var != this.h) {
            this.h = z72Var;
            this.i = new m08(z72Var, this.f);
        }
        int d = ((rw4) ur.e(this.j)).d(this.i, e06Var);
        if (d == 1) {
            e06Var.a += this.f;
        }
        return d;
    }

    @Override // defpackage.y72
    public boolean e(z72 z72Var) {
        if (i(z72Var) != 65496) {
            return false;
        }
        int i = i(z72Var);
        this.d = i;
        if (i == 65504) {
            b(z72Var);
            this.d = i(z72Var);
        }
        if (this.d != 65505) {
            return false;
        }
        z72Var.n(2);
        this.a.Q(6);
        z72Var.r(this.a.e(), 0, 6);
        return this.a.J() == 1165519206 && this.a.N() == 0;
    }

    @Override // defpackage.y72
    public void release() {
        rw4 rw4Var = this.j;
        if (rw4Var != null) {
            rw4Var.release();
        }
    }
}
