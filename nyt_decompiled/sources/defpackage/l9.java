package defpackage;

import com.amazonaws.event.ProgressEvent;
import com.google.android.exoplayer2.ParserException;
import defpackage.ei7;
import defpackage.st8;
import java.io.EOFException;

/* loaded from: classes2.dex */
public final class l9 implements y72 {
    public static final d82 m = new d82() { // from class: k9
        @Override // defpackage.d82
        public final y72[] c() {
            y72[] i;
            i = l9.i();
            return i;
        }
    };
    private final int a;
    private final m9 b;
    private final yo5 c;
    private final yo5 d;
    private final xo5 e;
    private a82 f;
    private long g;
    private long h;
    private int i;
    private boolean j;
    private boolean k;
    private boolean l;

    public l9() {
        this(0);
    }

    private void f(z72 z72Var) {
        if (this.j) {
            return;
        }
        this.i = -1;
        z72Var.g();
        long j = 0;
        if (z72Var.getPosition() == 0) {
            k(z72Var);
        }
        int i = 0;
        int i2 = 0;
        while (z72Var.e(this.d.e(), 0, 2, true)) {
            try {
                this.d.U(0);
                if (!m9.m(this.d.N())) {
                    break;
                }
                if (!z72Var.e(this.d.e(), 0, 4, true)) {
                    break;
                }
                this.e.p(14);
                int h = this.e.h(13);
                if (h <= 6) {
                    this.j = true;
                    throw ParserException.a("Malformed ADTS stream", null);
                }
                j += h;
                i2++;
                if (i2 != 1000 && z72Var.q(h - 6, true)) {
                }
                break;
            } catch (EOFException unused) {
            }
        }
        i = i2;
        z72Var.g();
        if (i > 0) {
            this.i = (int) (j / i);
        } else {
            this.i = -1;
        }
        this.j = true;
    }

    private static int g(int i, long j) {
        return (int) ((i * 8000000) / j);
    }

    private ei7 h(long j, boolean z) {
        return new tu0(j, this.h, g(this.i, this.b.k()), this.i, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ y72[] i() {
        return new y72[]{new l9()};
    }

    private void j(long j, boolean z) {
        if (this.l) {
            return;
        }
        boolean z2 = (this.a & 1) != 0 && this.i > 0;
        if (z2 && this.b.k() == -9223372036854775807L && !z) {
            return;
        }
        if (!z2 || this.b.k() == -9223372036854775807L) {
            this.f.p(new ei7.b(-9223372036854775807L));
        } else {
            this.f.p(h(j, (this.a & 2) != 0));
        }
        this.l = true;
    }

    private int k(z72 z72Var) {
        int i = 0;
        while (true) {
            z72Var.r(this.d.e(), 0, 10);
            this.d.U(0);
            if (this.d.K() != 4801587) {
                break;
            }
            this.d.V(3);
            int G = this.d.G();
            i += G + 10;
            z72Var.n(G);
        }
        z72Var.g();
        z72Var.n(i);
        if (this.h == -1) {
            this.h = i;
        }
        return i;
    }

    @Override // defpackage.y72
    public void a(long j, long j2) {
        this.k = false;
        this.b.c();
        this.g = j2;
    }

    @Override // defpackage.y72
    public void c(a82 a82Var) {
        this.f = a82Var;
        this.b.d(a82Var, new st8.d(0, 1));
        a82Var.s();
    }

    @Override // defpackage.y72
    public int d(z72 z72Var, e06 e06Var) {
        ur.i(this.f);
        long length = z72Var.getLength();
        int i = this.a;
        if ((i & 2) != 0 || ((i & 1) != 0 && length != -1)) {
            f(z72Var);
        }
        int read = z72Var.read(this.c.e(), 0, ProgressEvent.PART_COMPLETED_EVENT_CODE);
        boolean z = read == -1;
        j(length, z);
        if (z) {
            return -1;
        }
        this.c.U(0);
        this.c.T(read);
        if (!this.k) {
            this.b.f(this.g, 4);
            this.k = true;
        }
        this.b.a(this.c);
        return 0;
    }

    @Override // defpackage.y72
    public boolean e(z72 z72Var) {
        int k = k(z72Var);
        int i = k;
        int i2 = 0;
        int i3 = 0;
        do {
            z72Var.r(this.d.e(), 0, 2);
            this.d.U(0);
            if (m9.m(this.d.N())) {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                z72Var.r(this.d.e(), 0, 4);
                this.e.p(14);
                int h = this.e.h(13);
                if (h <= 6) {
                    i++;
                    z72Var.g();
                    z72Var.n(i);
                } else {
                    z72Var.n(h - 6);
                    i3 += h;
                }
            } else {
                i++;
                z72Var.g();
                z72Var.n(i);
            }
            i2 = 0;
            i3 = 0;
        } while (i - k < 8192);
        return false;
    }

    @Override // defpackage.y72
    public void release() {
    }

    public l9(int i) {
        this.a = (i & 2) != 0 ? i | 1 : i;
        this.b = new m9(true);
        this.c = new yo5(ProgressEvent.PART_COMPLETED_EVENT_CODE);
        this.i = -1;
        this.h = -1L;
        yo5 yo5Var = new yo5(10);
        this.d = yo5Var;
        this.e = new xo5(yo5Var.e());
    }
}
