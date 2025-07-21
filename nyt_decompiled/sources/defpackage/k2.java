package defpackage;

import defpackage.ei7;
import defpackage.st8;
import okhttp3.internal.http2.Http2;

/* loaded from: classes2.dex */
public final class k2 implements y72 {
    public static final d82 d = new d82() { // from class: j2
        @Override // defpackage.d82
        public final y72[] c() {
            y72[] f;
            f = k2.f();
            return f;
        }
    };
    private final l2 a = new l2();
    private final yo5 b = new yo5(Http2.INITIAL_MAX_FRAME_SIZE);
    private boolean c;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ y72[] f() {
        return new y72[]{new k2()};
    }

    @Override // defpackage.y72
    public void a(long j, long j2) {
        this.c = false;
        this.a.c();
    }

    @Override // defpackage.y72
    public void c(a82 a82Var) {
        this.a.d(a82Var, new st8.d(0, 1));
        a82Var.s();
        a82Var.p(new ei7.b(-9223372036854775807L));
    }

    @Override // defpackage.y72
    public int d(z72 z72Var, e06 e06Var) {
        int read = z72Var.read(this.b.e(), 0, Http2.INITIAL_MAX_FRAME_SIZE);
        if (read == -1) {
            return -1;
        }
        this.b.U(0);
        this.b.T(read);
        if (!this.c) {
            this.a.f(0L, 4);
            this.c = true;
        }
        this.a.a(this.b);
        return 0;
    }

    @Override // defpackage.y72
    public boolean e(z72 z72Var) {
        yo5 yo5Var = new yo5(10);
        int i = 0;
        while (true) {
            z72Var.r(yo5Var.e(), 0, 10);
            yo5Var.U(0);
            if (yo5Var.K() != 4801587) {
                break;
            }
            yo5Var.V(3);
            int G = yo5Var.G();
            i += G + 10;
            z72Var.n(G);
        }
        z72Var.g();
        z72Var.n(i);
        int i2 = 0;
        int i3 = i;
        while (true) {
            z72Var.r(yo5Var.e(), 0, 7);
            yo5Var.U(0);
            int N = yo5Var.N();
            if (N == 44096 || N == 44097) {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                int e = m2.e(yo5Var.e(), N);
                if (e == -1) {
                    return false;
                }
                z72Var.n(e - 7);
            } else {
                z72Var.g();
                i3++;
                if (i3 - i >= 8192) {
                    return false;
                }
                z72Var.n(i3);
                i2 = 0;
            }
        }
    }

    @Override // defpackage.y72
    public void release() {
    }
}
