package defpackage;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.t0;
import defpackage.ei7;
import java.io.EOFException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class ec implements y72 {
    private static final int[] r;
    private static final int u;
    private final byte[] a;
    private final int b;
    private boolean c;
    private long d;
    private int e;
    private int f;
    private boolean g;
    private long h;
    private int i;
    private int j;
    private long k;
    private a82 l;
    private yp8 m;
    private ei7 n;
    private boolean o;
    public static final d82 p = new d82() { // from class: dc
        @Override // defpackage.d82
        public final y72[] c() {
            y72[] m;
            m = ec.m();
            return m;
        }
    };
    private static final int[] q = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    private static final byte[] s = z19.o0("#!AMR\n");
    private static final byte[] t = z19.o0("#!AMR-WB\n");

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        r = iArr;
        u = iArr[8];
    }

    public ec() {
        this(0);
    }

    private void f() {
        ur.i(this.m);
        z19.j(this.l);
    }

    private static int g(int i, long j) {
        return (int) ((i * 8000000) / j);
    }

    private ei7 h(long j, boolean z) {
        return new tu0(j, this.h, g(this.i, 20000L), this.i, z);
    }

    private int i(int i) {
        if (k(i)) {
            return this.c ? r[i] : q[i];
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Illegal AMR ");
        sb.append(this.c ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i);
        throw ParserException.a(sb.toString(), null);
    }

    private boolean j(int i) {
        return !this.c && (i < 12 || i > 14);
    }

    private boolean k(int i) {
        return i >= 0 && i <= 15 && (l(i) || j(i));
    }

    private boolean l(int i) {
        return this.c && (i < 10 || i > 13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ y72[] m() {
        return new y72[]{new ec()};
    }

    private void n() {
        if (this.o) {
            return;
        }
        this.o = true;
        boolean z = this.c;
        this.m.d(new t0.b().g0(z ? "audio/amr-wb" : "audio/3gpp").Y(u).J(1).h0(z ? 16000 : 8000).G());
    }

    private void o(long j, int i) {
        int i2;
        if (this.g) {
            return;
        }
        int i3 = this.b;
        if ((i3 & 1) == 0 || j == -1 || !((i2 = this.i) == -1 || i2 == this.e)) {
            ei7.b bVar = new ei7.b(-9223372036854775807L);
            this.n = bVar;
            this.l.p(bVar);
            this.g = true;
            return;
        }
        if (this.j >= 20 || i == -1) {
            ei7 h = h(j, (i3 & 2) != 0);
            this.n = h;
            this.l.p(h);
            this.g = true;
        }
    }

    private static boolean p(z72 z72Var, byte[] bArr) {
        z72Var.g();
        byte[] bArr2 = new byte[bArr.length];
        z72Var.r(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    private int q(z72 z72Var) {
        z72Var.g();
        z72Var.r(this.a, 0, 1);
        byte b = this.a[0];
        if ((b & 131) <= 0) {
            return i((b >> 3) & 15);
        }
        throw ParserException.a("Invalid padding bits for frame header " + ((int) b), null);
    }

    private boolean r(z72 z72Var) {
        byte[] bArr = s;
        if (p(z72Var, bArr)) {
            this.c = false;
            z72Var.p(bArr.length);
            return true;
        }
        byte[] bArr2 = t;
        if (!p(z72Var, bArr2)) {
            return false;
        }
        this.c = true;
        z72Var.p(bArr2.length);
        return true;
    }

    private int s(z72 z72Var) {
        if (this.f == 0) {
            try {
                int q2 = q(z72Var);
                this.e = q2;
                this.f = q2;
                if (this.i == -1) {
                    this.h = z72Var.getPosition();
                    this.i = this.e;
                }
                if (this.i == this.e) {
                    this.j++;
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int e = this.m.e(z72Var, this.f, true);
        if (e == -1) {
            return -1;
        }
        int i = this.f - e;
        this.f = i;
        if (i > 0) {
            return 0;
        }
        this.m.b(this.k + this.d, 1, this.e, 0, null);
        this.d += 20000;
        return 0;
    }

    @Override // defpackage.y72
    public void a(long j, long j2) {
        this.d = 0L;
        this.e = 0;
        this.f = 0;
        if (j != 0) {
            ei7 ei7Var = this.n;
            if (ei7Var instanceof tu0) {
                this.k = ((tu0) ei7Var).c(j);
                return;
            }
        }
        this.k = 0L;
    }

    @Override // defpackage.y72
    public void c(a82 a82Var) {
        this.l = a82Var;
        this.m = a82Var.a(0, 1);
        a82Var.s();
    }

    @Override // defpackage.y72
    public int d(z72 z72Var, e06 e06Var) {
        f();
        if (z72Var.getPosition() == 0 && !r(z72Var)) {
            throw ParserException.a("Could not find AMR header.", null);
        }
        n();
        int s2 = s(z72Var);
        o(z72Var.getLength(), s2);
        return s2;
    }

    @Override // defpackage.y72
    public boolean e(z72 z72Var) {
        return r(z72Var);
    }

    @Override // defpackage.y72
    public void release() {
    }

    public ec(int i) {
        this.b = (i & 2) != 0 ? i | 1 : i;
        this.a = new byte[1];
        this.i = -1;
    }
}
