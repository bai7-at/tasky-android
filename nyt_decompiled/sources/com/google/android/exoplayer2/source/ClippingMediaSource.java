package com.google.android.exoplayer2.source;

import com.amazonaws.mobileconnectors.cognito.internal.util.DatasetUtils;
import com.google.android.exoplayer2.g2;
import com.google.android.exoplayer2.source.o;
import defpackage.ob;
import defpackage.ur;
import defpackage.z19;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class ClippingMediaSource extends g0 {
    private long B;
    private long H;
    private final long m;
    private final long n;
    private final boolean r;
    private final boolean s;
    private final boolean t;
    private final ArrayList u;
    private final g2.d w;
    private a x;
    private IllegalClippingException y;

    public static final class IllegalClippingException extends IOException {
        public final int reason;

        public IllegalClippingException(int i) {
            super("Illegal clipping: " + a(i));
            this.reason = i;
        }

        private static String a(int i) {
            return i != 0 ? i != 1 ? i != 2 ? DatasetUtils.UNKNOWN_IDENTITY_ID : "start exceeds end" : "not seekable to start" : "invalid period count";
        }
    }

    private static final class a extends j {
        private final long g;
        private final long h;
        private final long i;
        private final boolean j;

        public a(g2 g2Var, long j, long j2) {
            super(g2Var);
            boolean z = false;
            if (g2Var.n() != 1) {
                throw new IllegalClippingException(0);
            }
            g2.d s = g2Var.s(0, new g2.d());
            long max = Math.max(0L, j);
            if (!s.l && max != 0 && !s.h) {
                throw new IllegalClippingException(1);
            }
            long max2 = j2 == Long.MIN_VALUE ? s.n : Math.max(0L, j2);
            long j3 = s.n;
            if (j3 != -9223372036854775807L) {
                max2 = max2 > j3 ? j3 : max2;
                if (max > max2) {
                    throw new IllegalClippingException(2);
                }
            }
            this.g = max;
            this.h = max2;
            this.i = max2 == -9223372036854775807L ? -9223372036854775807L : max2 - max;
            if (s.i && (max2 == -9223372036854775807L || (j3 != -9223372036854775807L && max2 == j3))) {
                z = true;
            }
            this.j = z;
        }

        @Override // com.google.android.exoplayer2.source.j, com.google.android.exoplayer2.g2
        public g2.b l(int i, g2.b bVar, boolean z) {
            this.f.l(0, bVar, z);
            long s = bVar.s() - this.g;
            long j = this.i;
            return bVar.x(bVar.a, bVar.b, 0, j == -9223372036854775807L ? -9223372036854775807L : j - s, s);
        }

        @Override // com.google.android.exoplayer2.source.j, com.google.android.exoplayer2.g2
        public g2.d t(int i, g2.d dVar, long j) {
            this.f.t(0, dVar, 0L);
            long j2 = dVar.t;
            long j3 = this.g;
            dVar.t = j2 + j3;
            dVar.n = this.i;
            dVar.i = this.j;
            long j4 = dVar.m;
            if (j4 != -9223372036854775807L) {
                long max = Math.max(j4, j3);
                dVar.m = max;
                long j5 = this.h;
                if (j5 != -9223372036854775807L) {
                    max = Math.min(max, j5);
                }
                dVar.m = max - this.g;
            }
            long h1 = z19.h1(this.g);
            long j6 = dVar.e;
            if (j6 != -9223372036854775807L) {
                dVar.e = j6 + h1;
            }
            long j7 = dVar.f;
            if (j7 != -9223372036854775807L) {
                dVar.f = j7 + h1;
            }
            return dVar;
        }
    }

    public ClippingMediaSource(o oVar, long j, long j2, boolean z, boolean z2, boolean z3) {
        super((o) ur.e(oVar));
        ur.a(j >= 0);
        this.m = j;
        this.n = j2;
        this.r = z;
        this.s = z2;
        this.t = z3;
        this.u = new ArrayList();
        this.w = new g2.d();
    }

    private void W(g2 g2Var) {
        long j;
        long j2;
        g2Var.s(0, this.w);
        long h = this.w.h();
        if (this.x == null || this.u.isEmpty() || this.s) {
            long j3 = this.m;
            long j4 = this.n;
            if (this.t) {
                long f = this.w.f();
                j3 += f;
                j4 += f;
            }
            this.B = h + j3;
            this.H = this.n != Long.MIN_VALUE ? h + j4 : Long.MIN_VALUE;
            int size = this.u.size();
            for (int i = 0; i < size; i++) {
                ((b) this.u.get(i)).w(this.B, this.H);
            }
            j = j3;
            j2 = j4;
        } else {
            long j5 = this.B - h;
            j2 = this.n != Long.MIN_VALUE ? this.H - h : Long.MIN_VALUE;
            j = j5;
        }
        try {
            a aVar = new a(g2Var, j, j2);
            this.x = aVar;
            C(aVar);
        } catch (IllegalClippingException e) {
            this.y = e;
            for (int i2 = 0; i2 < this.u.size(); i2++) {
                ((b) this.u.get(i2)).s(this.y);
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.c, com.google.android.exoplayer2.source.a
    protected void D() {
        super.D();
        this.y = null;
        this.x = null;
    }

    @Override // com.google.android.exoplayer2.source.g0
    protected void S(g2 g2Var) {
        if (this.y != null) {
            return;
        }
        W(g2Var);
    }

    @Override // com.google.android.exoplayer2.source.o
    public n g(o.b bVar, ob obVar, long j) {
        b bVar2 = new b(this.k.g(bVar, obVar, j), this.r, this.B, this.H);
        this.u.add(bVar2);
        return bVar2;
    }

    @Override // com.google.android.exoplayer2.source.o
    public void h(n nVar) {
        ur.g(this.u.remove(nVar));
        this.k.h(((b) nVar).a);
        if (!this.u.isEmpty() || this.s) {
            return;
        }
        W(((a) ur.e(this.x)).f);
    }

    @Override // com.google.android.exoplayer2.source.c, com.google.android.exoplayer2.source.o
    public void p() {
        IllegalClippingException illegalClippingException = this.y;
        if (illegalClippingException != null) {
            throw illegalClippingException;
        }
        super.p();
    }
}
