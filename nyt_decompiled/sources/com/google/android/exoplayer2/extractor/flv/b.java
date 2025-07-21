package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.extractor.flv.b;
import defpackage.a82;
import defpackage.d82;
import defpackage.e06;
import defpackage.ei7;
import defpackage.ur;
import defpackage.y72;
import defpackage.yo5;
import defpackage.z72;

/* loaded from: classes2.dex */
public final class b implements y72 {
    public static final d82 q = new d82() { // from class: pl2
        @Override // defpackage.d82
        public final y72[] c() {
            y72[] h;
            h = b.h();
            return h;
        }
    };
    private a82 f;
    private boolean h;
    private long i;
    private int j;
    private int k;
    private int l;
    private long m;
    private boolean n;
    private a o;
    private d p;
    private final yo5 a = new yo5(4);
    private final yo5 b = new yo5(9);
    private final yo5 c = new yo5(11);
    private final yo5 d = new yo5();
    private final c e = new c();
    private int g = 1;

    private void f() {
        if (this.n) {
            return;
        }
        this.f.p(new ei7.b(-9223372036854775807L));
        this.n = true;
    }

    private long g() {
        if (this.h) {
            return this.i + this.m;
        }
        if (this.e.d() == -9223372036854775807L) {
            return 0L;
        }
        return this.m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ y72[] h() {
        return new y72[]{new b()};
    }

    private yo5 i(z72 z72Var) {
        if (this.l > this.d.b()) {
            yo5 yo5Var = this.d;
            yo5Var.S(new byte[Math.max(yo5Var.b() * 2, this.l)], 0);
        } else {
            this.d.U(0);
        }
        this.d.T(this.l);
        z72Var.readFully(this.d.e(), 0, this.l);
        return this.d;
    }

    private boolean j(z72 z72Var) {
        if (!z72Var.h(this.b.e(), 0, 9, true)) {
            return false;
        }
        this.b.U(0);
        this.b.V(4);
        int H = this.b.H();
        boolean z = (H & 4) != 0;
        boolean z2 = (H & 1) != 0;
        if (z && this.o == null) {
            this.o = new a(this.f.a(8, 1));
        }
        if (z2 && this.p == null) {
            this.p = new d(this.f.a(9, 2));
        }
        this.f.s();
        this.j = this.b.q() - 5;
        this.g = 2;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean k(defpackage.z72 r10) {
        /*
            r9 = this;
            long r0 = r9.g()
            int r2 = r9.k
            r3 = 8
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = 1
            if (r2 != r3) goto L23
            com.google.android.exoplayer2.extractor.flv.a r3 = r9.o
            if (r3 == 0) goto L23
            r9.f()
            com.google.android.exoplayer2.extractor.flv.a r2 = r9.o
            yo5 r10 = r9.i(r10)
            boolean r10 = r2.a(r10, r0)
        L21:
            r0 = r6
            goto L75
        L23:
            r3 = 9
            if (r2 != r3) goto L39
            com.google.android.exoplayer2.extractor.flv.d r3 = r9.p
            if (r3 == 0) goto L39
            r9.f()
            com.google.android.exoplayer2.extractor.flv.d r2 = r9.p
            yo5 r10 = r9.i(r10)
            boolean r10 = r2.a(r10, r0)
            goto L21
        L39:
            r3 = 18
            if (r2 != r3) goto L6e
            boolean r2 = r9.n
            if (r2 != 0) goto L6e
            com.google.android.exoplayer2.extractor.flv.c r2 = r9.e
            yo5 r10 = r9.i(r10)
            boolean r10 = r2.a(r10, r0)
            com.google.android.exoplayer2.extractor.flv.c r0 = r9.e
            long r0 = r0.d()
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto L21
            a82 r2 = r9.f
            zi3 r3 = new zi3
            com.google.android.exoplayer2.extractor.flv.c r7 = r9.e
            long[] r7 = r7.e()
            com.google.android.exoplayer2.extractor.flv.c r8 = r9.e
            long[] r8 = r8.f()
            r3.<init>(r7, r8, r0)
            r2.p(r3)
            r9.n = r6
            goto L21
        L6e:
            int r0 = r9.l
            r10.p(r0)
            r10 = 0
            r0 = r10
        L75:
            boolean r1 = r9.h
            if (r1 != 0) goto L8f
            if (r10 == 0) goto L8f
            r9.h = r6
            com.google.android.exoplayer2.extractor.flv.c r10 = r9.e
            long r1 = r10.d()
            int r10 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r10 != 0) goto L8b
            long r1 = r9.m
            long r1 = -r1
            goto L8d
        L8b:
            r1 = 0
        L8d:
            r9.i = r1
        L8f:
            r10 = 4
            r9.j = r10
            r10 = 2
            r9.g = r10
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.flv.b.k(z72):boolean");
    }

    private boolean l(z72 z72Var) {
        if (!z72Var.h(this.c.e(), 0, 11, true)) {
            return false;
        }
        this.c.U(0);
        this.k = this.c.H();
        this.l = this.c.K();
        this.m = this.c.K();
        this.m = ((this.c.H() << 24) | this.m) * 1000;
        this.c.V(3);
        this.g = 4;
        return true;
    }

    private void m(z72 z72Var) {
        z72Var.p(this.j);
        this.j = 0;
        this.g = 3;
    }

    @Override // defpackage.y72
    public void a(long j, long j2) {
        if (j == 0) {
            this.g = 1;
            this.h = false;
        } else {
            this.g = 3;
        }
        this.j = 0;
    }

    @Override // defpackage.y72
    public void c(a82 a82Var) {
        this.f = a82Var;
    }

    @Override // defpackage.y72
    public int d(z72 z72Var, e06 e06Var) {
        ur.i(this.f);
        while (true) {
            int i = this.g;
            if (i != 1) {
                if (i == 2) {
                    m(z72Var);
                } else if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException();
                    }
                    if (k(z72Var)) {
                        return 0;
                    }
                } else if (!l(z72Var)) {
                    return -1;
                }
            } else if (!j(z72Var)) {
                return -1;
            }
        }
    }

    @Override // defpackage.y72
    public boolean e(z72 z72Var) {
        z72Var.r(this.a.e(), 0, 3);
        this.a.U(0);
        if (this.a.K() != 4607062) {
            return false;
        }
        z72Var.r(this.a.e(), 0, 2);
        this.a.U(0);
        if ((this.a.N() & 250) != 0) {
            return false;
        }
        z72Var.r(this.a.e(), 0, 4);
        this.a.U(0);
        int q2 = this.a.q();
        z72Var.g();
        z72Var.n(q2);
        z72Var.r(this.a.e(), 0, 4);
        this.a.U(0);
        return this.a.q() == 0;
    }

    @Override // defpackage.y72
    public void release() {
    }
}
