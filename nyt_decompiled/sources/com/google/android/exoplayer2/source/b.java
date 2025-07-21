package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.source.ClippingMediaSource;
import com.google.android.exoplayer2.source.n;
import com.google.android.exoplayer2.t0;
import defpackage.ep2;
import defpackage.fi7;
import defpackage.ku4;
import defpackage.q72;
import defpackage.ur;
import defpackage.wp8;
import defpackage.y77;
import defpackage.z19;

/* loaded from: classes2.dex */
public final class b implements n, n.a {
    public final n a;
    private n.a b;
    private a[] c = new a[0];
    private long d;
    long e;
    long f;
    private ClippingMediaSource.IllegalClippingException g;

    private final class a implements y77 {
        public final y77 a;
        private boolean b;

        public a(y77 y77Var) {
            this.a = y77Var;
        }

        @Override // defpackage.y77
        public void a() {
            this.a.a();
        }

        public void b() {
            this.b = false;
        }

        @Override // defpackage.y77
        public boolean g() {
            return !b.this.p() && this.a.g();
        }

        @Override // defpackage.y77
        public int p(ep2 ep2Var, DecoderInputBuffer decoderInputBuffer, int i) {
            if (b.this.p()) {
                return -3;
            }
            if (this.b) {
                decoderInputBuffer.q(4);
                return -4;
            }
            long h = b.this.h();
            int p = this.a.p(ep2Var, decoderInputBuffer, i);
            if (p == -5) {
                t0 t0Var = (t0) ur.e(ep2Var.b);
                int i2 = t0Var.S;
                if (i2 != 0 || t0Var.X != 0) {
                    b bVar = b.this;
                    if (bVar.e != 0) {
                        i2 = 0;
                    }
                    ep2Var.b = t0Var.c().P(i2).Q(bVar.f == Long.MIN_VALUE ? t0Var.X : 0).G();
                }
                return -5;
            }
            long j = b.this.f;
            if (j == Long.MIN_VALUE || ((p != -4 || decoderInputBuffer.e < j) && !(p == -3 && h == Long.MIN_VALUE && !decoderInputBuffer.d))) {
                return p;
            }
            decoderInputBuffer.f();
            decoderInputBuffer.q(4);
            this.b = true;
            return -4;
        }

        @Override // defpackage.y77
        public int s(long j) {
            if (b.this.p()) {
                return -3;
            }
            return this.a.s(j);
        }
    }

    public b(n nVar, boolean z, long j, long j2) {
        this.a = nVar;
        this.d = z ? j : -9223372036854775807L;
        this.e = j;
        this.f = j2;
    }

    private fi7 a(long j, fi7 fi7Var) {
        long r = z19.r(fi7Var.a, 0L, j - this.e);
        long j2 = fi7Var.b;
        long j3 = this.f;
        long r2 = z19.r(j2, 0L, j3 == Long.MIN_VALUE ? Long.MAX_VALUE : j3 - j);
        return (r == fi7Var.a && r2 == fi7Var.b) ? fi7Var : new fi7(r, r2);
    }

    private static boolean v(long j, q72[] q72VarArr) {
        if (j != 0) {
            for (q72 q72Var : q72VarArr) {
                if (q72Var != null) {
                    t0 s = q72Var.s();
                    if (!ku4.a(s.l, s.i)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.source.n, com.google.android.exoplayer2.source.c0
    public boolean b() {
        return this.a.b();
    }

    @Override // com.google.android.exoplayer2.source.n, com.google.android.exoplayer2.source.c0
    public long c() {
        long c = this.a.c();
        if (c != Long.MIN_VALUE) {
            long j = this.f;
            if (j == Long.MIN_VALUE || c < j) {
                return c;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.exoplayer2.source.n
    public long d(long j, fi7 fi7Var) {
        long j2 = this.e;
        if (j == j2) {
            return j2;
        }
        return this.a.d(j, a(j, fi7Var));
    }

    @Override // com.google.android.exoplayer2.source.n, com.google.android.exoplayer2.source.c0
    public boolean f(long j) {
        return this.a.f(j);
    }

    @Override // com.google.android.exoplayer2.source.n, com.google.android.exoplayer2.source.c0
    public long h() {
        long h = this.a.h();
        if (h != Long.MIN_VALUE) {
            long j = this.f;
            if (j == Long.MIN_VALUE || h < j) {
                return h;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.exoplayer2.source.n, com.google.android.exoplayer2.source.c0
    public void i(long j) {
        this.a.i(j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:
    
        if (r2 > r4) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006a  */
    @Override // com.google.android.exoplayer2.source.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long j(defpackage.q72[] r13, boolean[] r14, defpackage.y77[] r15, boolean[] r16, long r17) {
        /*
            r12 = this;
            r0 = r12
            r1 = r15
            int r2 = r1.length
            com.google.android.exoplayer2.source.b$a[] r2 = new com.google.android.exoplayer2.source.b.a[r2]
            r0.c = r2
            int r2 = r1.length
            y77[] r9 = new defpackage.y77[r2]
            r10 = 0
            r2 = r10
        Lc:
            int r3 = r1.length
            r11 = 0
            if (r2 >= r3) goto L21
            com.google.android.exoplayer2.source.b$a[] r3 = r0.c
            r4 = r1[r2]
            com.google.android.exoplayer2.source.b$a r4 = (com.google.android.exoplayer2.source.b.a) r4
            r3[r2] = r4
            if (r4 == 0) goto L1c
            y77 r11 = r4.a
        L1c:
            r9[r2] = r11
            int r2 = r2 + 1
            goto Lc
        L21:
            com.google.android.exoplayer2.source.n r2 = r0.a
            r3 = r13
            r4 = r14
            r5 = r9
            r6 = r16
            r7 = r17
            long r2 = r2.j(r3, r4, r5, r6, r7)
            boolean r4 = r12.p()
            if (r4 == 0) goto L43
            long r4 = r0.e
            int r6 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r6 != 0) goto L43
            r6 = r13
            boolean r4 = v(r4, r13)
            if (r4 == 0) goto L43
            r4 = r2
            goto L48
        L43:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L48:
            r0.d = r4
            int r4 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r4 == 0) goto L63
            long r4 = r0.e
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 < 0) goto L61
            long r4 = r0.f
            r6 = -9223372036854775808
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 == 0) goto L63
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 > 0) goto L61
            goto L63
        L61:
            r4 = r10
            goto L64
        L63:
            r4 = 1
        L64:
            defpackage.ur.g(r4)
        L67:
            int r4 = r1.length
            if (r10 >= r4) goto L8d
            r4 = r9[r10]
            if (r4 != 0) goto L73
            com.google.android.exoplayer2.source.b$a[] r4 = r0.c
            r4[r10] = r11
            goto L84
        L73:
            com.google.android.exoplayer2.source.b$a[] r5 = r0.c
            r6 = r5[r10]
            if (r6 == 0) goto L7d
            y77 r6 = r6.a
            if (r6 == r4) goto L84
        L7d:
            com.google.android.exoplayer2.source.b$a r6 = new com.google.android.exoplayer2.source.b$a
            r6.<init>(r4)
            r5[r10] = r6
        L84:
            com.google.android.exoplayer2.source.b$a[] r4 = r0.c
            r4 = r4[r10]
            r1[r10] = r4
            int r10 = r10 + 1
            goto L67
        L8d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.b.j(q72[], boolean[], y77[], boolean[], long):long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
    
        if (r0 > r5) goto L17;
     */
    @Override // com.google.android.exoplayer2.source.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long l(long r6) {
        /*
            r5 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.d = r0
            com.google.android.exoplayer2.source.b$a[] r0 = r5.c
            int r1 = r0.length
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r1) goto L18
            r4 = r0[r3]
            if (r4 == 0) goto L15
            r4.b()
        L15:
            int r3 = r3 + 1
            goto Lc
        L18:
            com.google.android.exoplayer2.source.n r0 = r5.a
            long r0 = r0.l(r6)
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 == 0) goto L34
            long r6 = r5.e
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 < 0) goto L35
            long r5 = r5.f
            r3 = -9223372036854775808
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 == 0) goto L34
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 > 0) goto L35
        L34:
            r2 = 1
        L35:
            defpackage.ur.g(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.b.l(long):long");
    }

    @Override // com.google.android.exoplayer2.source.n
    public long m() {
        if (p()) {
            long j = this.d;
            this.d = -9223372036854775807L;
            long m = m();
            return m != -9223372036854775807L ? m : j;
        }
        long m2 = this.a.m();
        if (m2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        ur.g(m2 >= this.e);
        long j2 = this.f;
        ur.g(j2 == Long.MIN_VALUE || m2 <= j2);
        return m2;
    }

    @Override // com.google.android.exoplayer2.source.n
    public void n(n.a aVar, long j) {
        this.b = aVar;
        this.a.n(this, j);
    }

    @Override // com.google.android.exoplayer2.source.n.a
    public void o(n nVar) {
        if (this.g != null) {
            return;
        }
        ((n.a) ur.e(this.b)).o(this);
    }

    boolean p() {
        return this.d != -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.source.c0.a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public void g(n nVar) {
        ((n.a) ur.e(this.b)).g(this);
    }

    @Override // com.google.android.exoplayer2.source.n
    public void r() {
        ClippingMediaSource.IllegalClippingException illegalClippingException = this.g;
        if (illegalClippingException != null) {
            throw illegalClippingException;
        }
        this.a.r();
    }

    public void s(ClippingMediaSource.IllegalClippingException illegalClippingException) {
        this.g = illegalClippingException;
    }

    @Override // com.google.android.exoplayer2.source.n
    public wp8 t() {
        return this.a.t();
    }

    @Override // com.google.android.exoplayer2.source.n
    public void u(long j, boolean z) {
        this.a.u(j, z);
    }

    public void w(long j, long j2) {
        this.e = j;
        this.f = j2;
    }
}
