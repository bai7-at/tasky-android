package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.g2;
import com.google.android.exoplayer2.source.o;
import com.google.android.exoplayer2.w0;
import defpackage.ob;
import defpackage.z19;

/* loaded from: classes2.dex */
public final class m extends g0 {
    private final boolean m;
    private final g2.d n;
    private final g2.b r;
    private a s;
    private l t;
    private boolean u;
    private boolean w;
    private boolean x;

    private static final class a extends j {
        public static final Object i = new Object();
        private final Object g;
        private final Object h;

        private a(g2 g2Var, Object obj, Object obj2) {
            super(g2Var);
            this.g = obj;
            this.h = obj2;
        }

        public static a A(g2 g2Var, Object obj, Object obj2) {
            return new a(g2Var, obj, obj2);
        }

        public static a z(w0 w0Var) {
            return new a(new b(w0Var), g2.d.u, i);
        }

        @Override // com.google.android.exoplayer2.source.j, com.google.android.exoplayer2.g2
        public int g(Object obj) {
            Object obj2;
            g2 g2Var = this.f;
            if (i.equals(obj) && (obj2 = this.h) != null) {
                obj = obj2;
            }
            return g2Var.g(obj);
        }

        @Override // com.google.android.exoplayer2.source.j, com.google.android.exoplayer2.g2
        public g2.b l(int i2, g2.b bVar, boolean z) {
            this.f.l(i2, bVar, z);
            if (z19.c(bVar.b, this.h) && z) {
                bVar.b = i;
            }
            return bVar;
        }

        @Override // com.google.android.exoplayer2.source.j, com.google.android.exoplayer2.g2
        public Object r(int i2) {
            Object r = this.f.r(i2);
            return z19.c(r, this.h) ? i : r;
        }

        @Override // com.google.android.exoplayer2.source.j, com.google.android.exoplayer2.g2
        public g2.d t(int i2, g2.d dVar, long j) {
            this.f.t(i2, dVar, j);
            if (z19.c(dVar.a, this.g)) {
                dVar.a = g2.d.u;
            }
            return dVar;
        }

        public a y(g2 g2Var) {
            return new a(g2Var, this.g, this.h);
        }
    }

    public static final class b extends g2 {
        private final w0 f;

        public b(w0 w0Var) {
            this.f = w0Var;
        }

        @Override // com.google.android.exoplayer2.g2
        public int g(Object obj) {
            return obj == a.i ? 0 : -1;
        }

        @Override // com.google.android.exoplayer2.g2
        public g2.b l(int i, g2.b bVar, boolean z) {
            bVar.y(z ? 0 : null, z ? a.i : null, 0, -9223372036854775807L, 0L, com.google.android.exoplayer2.source.ads.a.g, true);
            return bVar;
        }

        @Override // com.google.android.exoplayer2.g2
        public int n() {
            return 1;
        }

        @Override // com.google.android.exoplayer2.g2
        public Object r(int i) {
            return a.i;
        }

        @Override // com.google.android.exoplayer2.g2
        public g2.d t(int i, g2.d dVar, long j) {
            dVar.j(g2.d.u, this.f, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
            dVar.l = true;
            return dVar;
        }

        @Override // com.google.android.exoplayer2.g2
        public int u() {
            return 1;
        }
    }

    public m(o oVar, boolean z) {
        super(oVar);
        this.m = z && oVar.q();
        this.n = new g2.d();
        this.r = new g2.b();
        g2 r = oVar.r();
        if (r == null) {
            this.s = a.z(oVar.f());
        } else {
            this.s = a.A(r, null, null);
            this.x = true;
        }
    }

    private Object X(Object obj) {
        return (this.s.h == null || !this.s.h.equals(obj)) ? obj : a.i;
    }

    private Object Y(Object obj) {
        return (this.s.h == null || !obj.equals(a.i)) ? obj : this.s.h;
    }

    private void a0(long j) {
        l lVar = this.t;
        int g = this.s.g(lVar.a.a);
        if (g == -1) {
            return;
        }
        long j2 = this.s.k(g, this.r).d;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        lVar.w(j);
    }

    @Override // com.google.android.exoplayer2.source.c, com.google.android.exoplayer2.source.a
    public void D() {
        this.w = false;
        this.u = false;
        super.D();
    }

    @Override // com.google.android.exoplayer2.source.g0
    protected o.b M(o.b bVar) {
        return bVar.c(X(bVar.a));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00bb  */
    @Override // com.google.android.exoplayer2.source.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void S(com.google.android.exoplayer2.g2 r15) {
        /*
            r14 = this;
            boolean r0 = r14.w
            if (r0 == 0) goto L19
            com.google.android.exoplayer2.source.m$a r0 = r14.s
            com.google.android.exoplayer2.source.m$a r15 = r0.y(r15)
            r14.s = r15
            com.google.android.exoplayer2.source.l r15 = r14.t
            if (r15 == 0) goto Lae
            long r0 = r15.p()
            r14.a0(r0)
            goto Lae
        L19:
            boolean r0 = r15.v()
            if (r0 == 0) goto L36
            boolean r0 = r14.x
            if (r0 == 0) goto L2a
            com.google.android.exoplayer2.source.m$a r0 = r14.s
            com.google.android.exoplayer2.source.m$a r15 = r0.y(r15)
            goto L32
        L2a:
            java.lang.Object r0 = com.google.android.exoplayer2.g2.d.u
            java.lang.Object r1 = com.google.android.exoplayer2.source.m.a.i
            com.google.android.exoplayer2.source.m$a r15 = com.google.android.exoplayer2.source.m.a.A(r15, r0, r1)
        L32:
            r14.s = r15
            goto Lae
        L36:
            com.google.android.exoplayer2.g2$d r0 = r14.n
            r1 = 0
            r15.s(r1, r0)
            com.google.android.exoplayer2.g2$d r0 = r14.n
            long r2 = r0.f()
            com.google.android.exoplayer2.g2$d r0 = r14.n
            java.lang.Object r0 = r0.a
            com.google.android.exoplayer2.source.l r4 = r14.t
            if (r4 == 0) goto L74
            long r4 = r4.q()
            com.google.android.exoplayer2.source.m$a r6 = r14.s
            com.google.android.exoplayer2.source.l r7 = r14.t
            com.google.android.exoplayer2.source.o$b r7 = r7.a
            java.lang.Object r7 = r7.a
            com.google.android.exoplayer2.g2$b r8 = r14.r
            r6.m(r7, r8)
            com.google.android.exoplayer2.g2$b r6 = r14.r
            long r6 = r6.s()
            long r6 = r6 + r4
            com.google.android.exoplayer2.source.m$a r4 = r14.s
            com.google.android.exoplayer2.g2$d r5 = r14.n
            com.google.android.exoplayer2.g2$d r1 = r4.s(r1, r5)
            long r4 = r1.f()
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 == 0) goto L74
            r12 = r6
            goto L75
        L74:
            r12 = r2
        L75:
            com.google.android.exoplayer2.g2$d r9 = r14.n
            com.google.android.exoplayer2.g2$b r10 = r14.r
            r11 = 0
            r8 = r15
            android.util.Pair r1 = r8.o(r9, r10, r11, r12)
            java.lang.Object r2 = r1.first
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r3 = r1.longValue()
            boolean r1 = r14.x
            if (r1 == 0) goto L94
            com.google.android.exoplayer2.source.m$a r0 = r14.s
            com.google.android.exoplayer2.source.m$a r15 = r0.y(r15)
            goto L98
        L94:
            com.google.android.exoplayer2.source.m$a r15 = com.google.android.exoplayer2.source.m.a.A(r15, r0, r2)
        L98:
            r14.s = r15
            com.google.android.exoplayer2.source.l r15 = r14.t
            if (r15 == 0) goto Lae
            r14.a0(r3)
            com.google.android.exoplayer2.source.o$b r15 = r15.a
            java.lang.Object r0 = r15.a
            java.lang.Object r0 = r14.Y(r0)
            com.google.android.exoplayer2.source.o$b r15 = r15.c(r0)
            goto Laf
        Lae:
            r15 = 0
        Laf:
            r0 = 1
            r14.x = r0
            r14.w = r0
            com.google.android.exoplayer2.source.m$a r0 = r14.s
            r14.C(r0)
            if (r15 == 0) goto Lc6
            com.google.android.exoplayer2.source.l r14 = r14.t
            java.lang.Object r14 = defpackage.ur.e(r14)
            com.google.android.exoplayer2.source.l r14 = (com.google.android.exoplayer2.source.l) r14
            r14.a(r15)
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.m.S(com.google.android.exoplayer2.g2):void");
    }

    @Override // com.google.android.exoplayer2.source.g0
    public void V() {
        if (this.m) {
            return;
        }
        this.u = true;
        U();
    }

    @Override // com.google.android.exoplayer2.source.o
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public l g(o.b bVar, ob obVar, long j) {
        l lVar = new l(bVar, obVar, j);
        lVar.y(this.k);
        if (this.w) {
            lVar.a(bVar.c(Y(bVar.a)));
        } else {
            this.t = lVar;
            if (!this.u) {
                this.u = true;
                U();
            }
        }
        return lVar;
    }

    public g2 Z() {
        return this.s;
    }

    @Override // com.google.android.exoplayer2.source.o
    public void h(n nVar) {
        ((l) nVar).x();
        if (nVar == this.t) {
            this.t = null;
        }
    }

    @Override // com.google.android.exoplayer2.source.c, com.google.android.exoplayer2.source.o
    public void p() {
    }
}
