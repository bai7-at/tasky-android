package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode;
import androidx.compose.runtime.b0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.f;
import androidx.compose.ui.layout.l;
import androidx.compose.ui.node.c;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.a;
import androidx.compose.ui.text.font.e;
import androidx.compose.ui.text.j;
import defpackage.aj8;
import defpackage.cv1;
import defpackage.dg4;
import defpackage.do0;
import defpackage.du7;
import defpackage.du8;
import defpackage.dv1;
import defpackage.ej7;
import defpackage.fd5;
import defpackage.fj7;
import defpackage.fm1;
import defpackage.fv0;
import defpackage.fv1;
import defpackage.gv1;
import defpackage.hn3;
import defpackage.jj7;
import defpackage.jo7;
import defpackage.kj8;
import defpackage.kt6;
import defpackage.lj7;
import defpackage.nn0;
import defpackage.nt6;
import defpackage.nx4;
import defpackage.ph0;
import defpackage.ph8;
import defpackage.qf2;
import defpackage.qg4;
import defpackage.qs2;
import defpackage.qz3;
import defpackage.sg4;
import defpackage.ss2;
import defpackage.sy4;
import defpackage.ui7;
import defpackage.ww8;
import defpackage.xq3;
import defpackage.yc0;
import defpackage.yq3;
import defpackage.yv0;
import defpackage.zq3;
import defpackage.zz3;
import java.util.List;
import java.util.Map;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class TextAnnotatedStringNode extends Modifier.c implements c, cv1, ej7 {
    private List B;
    private ss2 H;
    private ui7 L;
    private do0 M;
    private Map N;
    private nx4 Q;
    private ss2 S;
    private final sy4 X;
    private androidx.compose.ui.text.a n;
    private j r;
    private e.b s;
    private ss2 t;
    private int u;
    private boolean w;
    private int x;
    private int y;

    public /* synthetic */ TextAnnotatedStringNode(androidx.compose.ui.text.a aVar, j jVar, e.b bVar, ss2 ss2Var, int i, boolean z, int i2, int i3, List list, ss2 ss2Var2, ui7 ui7Var, do0 do0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, jVar, bVar, ss2Var, i, z, i2, i3, list, ss2Var2, ui7Var, do0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k2() {
        w2(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final nx4 n2() {
        if (this.Q == null) {
            this.Q = new nx4(this.n, this.r, this.s, this.u, this.w, this.x, this.y, this.B, null);
        }
        nx4 nx4Var = this.Q;
        zq3.e(nx4Var);
        return nx4Var;
    }

    private final nx4 o2(fm1 fm1Var) {
        nx4 a2;
        a p2 = p2();
        if (p2 != null && p2.c() && (a2 = p2.a()) != null) {
            a2.k(fm1Var);
            return a2;
        }
        nx4 n2 = n2();
        n2.k(fm1Var);
        return n2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a p2() {
        return (a) this.X.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean v2(androidx.compose.ui.text.a aVar) {
        ww8 ww8Var;
        a p2 = p2();
        if (p2 == null) {
            a aVar2 = new a(this.n, aVar, false, null, 12, null);
            nx4 nx4Var = new nx4(aVar, this.r, this.s, this.u, this.w, this.x, this.y, this.B, null);
            nx4Var.k(n2().a());
            aVar2.d(nx4Var);
            w2(aVar2);
            return true;
        }
        if (zq3.c(aVar, p2.b())) {
            return false;
        }
        p2.f(aVar);
        nx4 a2 = p2.a();
        if (a2 != null) {
            a2.n(aVar, this.r, this.s, this.u, this.w, this.x, this.y, this.B);
            ww8Var = ww8.a;
        } else {
            ww8Var = null;
        }
        return ww8Var != null;
    }

    private final void w2(a aVar) {
        this.X.setValue(aVar);
    }

    public final boolean A2(androidx.compose.ui.text.a aVar) {
        if (zq3.c(this.n, aVar)) {
            return false;
        }
        this.n = aVar;
        k2();
        return true;
    }

    @Override // androidx.compose.ui.node.c
    public sg4 d(f fVar, qg4 qg4Var, long j) {
        nx4 o2 = o2(fVar);
        boolean f = o2.f(j, fVar.getLayoutDirection());
        aj8 c = o2.c();
        c.w().j().c();
        if (f) {
            qz3.a(this);
            ss2 ss2Var = this.t;
            if (ss2Var != null) {
                ss2Var.invoke(c);
            }
            this.N = t.m(du8.a(AlignmentLineKt.a(), Integer.valueOf(dg4.d(c.h()))), du8.a(AlignmentLineKt.b(), Integer.valueOf(dg4.d(c.k()))));
        }
        ss2 ss2Var2 = this.H;
        if (ss2Var2 != null) {
            ss2Var2.invoke(c.A());
        }
        final l W = qg4Var.W(zz3.d(fv0.b, hn3.g(c.B()), hn3.f(c.B())));
        int g = hn3.g(c.B());
        int f2 = hn3.f(c.B());
        Map map = this.N;
        zq3.e(map);
        return fVar.P(g, f2, map, new ss2() { // from class: androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode$measure$1
            {
                super(1);
            }

            public final void b(l.a aVar) {
                l.a.f(aVar, l.this, 0, 0, 0.0f, 4, null);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((l.a) obj);
                return ww8.a;
            }
        });
    }

    @Override // androidx.compose.ui.node.c
    public int f(yq3 yq3Var, xq3 xq3Var, int i) {
        return o2(yq3Var).i(yq3Var.getLayoutDirection());
    }

    public final void l2(boolean z, boolean z2, boolean z3, boolean z4) {
        if (L1()) {
            if (z2 || (z && this.S != null)) {
                fj7.b(this);
            }
            if (z2 || z3 || z4) {
                n2().n(this.n, this.r, this.s, this.u, this.w, this.x, this.y, this.B);
                qz3.b(this);
                dv1.a(this);
            }
            if (z) {
                dv1.a(this);
            }
        }
    }

    @Override // androidx.compose.ui.node.c
    public int m(yq3 yq3Var, xq3 xq3Var, int i) {
        return o2(yq3Var).d(i, yq3Var.getLayoutDirection());
    }

    public final void m2(yv0 yv0Var) {
        w(yv0Var);
    }

    @Override // androidx.compose.ui.node.c
    public int o(yq3 yq3Var, xq3 xq3Var, int i) {
        return o2(yq3Var).d(i, yq3Var.getLayoutDirection());
    }

    public final int q2(yq3 yq3Var, xq3 xq3Var, int i) {
        return m(yq3Var, xq3Var, i);
    }

    public final int r2(yq3 yq3Var, xq3 xq3Var, int i) {
        return u(yq3Var, xq3Var, i);
    }

    public final sg4 s2(f fVar, qg4 qg4Var, long j) {
        return d(fVar, qg4Var, j);
    }

    public final int t2(yq3 yq3Var, xq3 xq3Var, int i) {
        return o(yq3Var, xq3Var, i);
    }

    @Override // androidx.compose.ui.node.c
    public int u(yq3 yq3Var, xq3 xq3Var, int i) {
        return o2(yq3Var).h(yq3Var.getLayoutDirection());
    }

    @Override // defpackage.ej7
    public void u0(lj7 lj7Var) {
        ss2 ss2Var = this.S;
        if (ss2Var == null) {
            ss2Var = new ss2() { // from class: androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode$applySemantics$1
                {
                    super(1);
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x00bb  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x00bd  */
                @Override // defpackage.ss2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Boolean invoke(java.util.List r38) {
                    /*
                        r37 = this;
                        r0 = r37
                        androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode r1 = androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.this
                        nx4 r1 = androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.f2(r1)
                        aj8 r2 = r1.b()
                        if (r2 == 0) goto Lb8
                        androidx.compose.ui.text.g r1 = new androidx.compose.ui.text.g
                        androidx.compose.ui.text.g r3 = r2.l()
                        androidx.compose.ui.text.a r4 = r3.j()
                        androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode r3 = androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.this
                        androidx.compose.ui.text.j r5 = androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.h2(r3)
                        androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode r0 = androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.this
                        do0 r0 = androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.g2(r0)
                        if (r0 == 0) goto L2b
                        long r6 = r0.a()
                        goto L31
                    L2b:
                        nn0$a r0 = defpackage.nn0.b
                        long r6 = r0.g()
                    L31:
                        r35 = 16777214(0xfffffe, float:2.3509884E-38)
                        r36 = 0
                        r8 = 0
                        r10 = 0
                        r11 = 0
                        r12 = 0
                        r13 = 0
                        r14 = 0
                        r15 = 0
                        r17 = 0
                        r18 = 0
                        r19 = 0
                        r20 = 0
                        r22 = 0
                        r23 = 0
                        r24 = 0
                        r25 = 0
                        r26 = 0
                        r27 = 0
                        r29 = 0
                        r30 = 0
                        r31 = 0
                        r32 = 0
                        r33 = 0
                        r34 = 0
                        androidx.compose.ui.text.j r5 = androidx.compose.ui.text.j.P(r5, r6, r8, r10, r11, r12, r13, r14, r15, r17, r18, r19, r20, r22, r23, r24, r25, r26, r27, r29, r30, r31, r32, r33, r34, r35, r36)
                        androidx.compose.ui.text.g r0 = r2.l()
                        java.util.List r6 = r0.g()
                        androidx.compose.ui.text.g r0 = r2.l()
                        int r7 = r0.e()
                        androidx.compose.ui.text.g r0 = r2.l()
                        boolean r8 = r0.h()
                        androidx.compose.ui.text.g r0 = r2.l()
                        int r9 = r0.f()
                        androidx.compose.ui.text.g r0 = r2.l()
                        fm1 r10 = r0.b()
                        androidx.compose.ui.text.g r0 = r2.l()
                        androidx.compose.ui.unit.LayoutDirection r11 = r0.d()
                        androidx.compose.ui.text.g r0 = r2.l()
                        androidx.compose.ui.text.font.e$b r12 = r0.c()
                        androidx.compose.ui.text.g r0 = r2.l()
                        long r13 = r0.a()
                        r15 = 0
                        r3 = r1
                        r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r15)
                        r6 = 2
                        r7 = 0
                        r4 = 0
                        aj8 r0 = defpackage.aj8.b(r2, r3, r4, r6, r7)
                        if (r0 == 0) goto Lb8
                        r1 = r38
                        r1.add(r0)
                        goto Lb9
                    Lb8:
                        r0 = 0
                    Lb9:
                        if (r0 == 0) goto Lbd
                        r0 = 1
                        goto Lbe
                    Lbd:
                        r0 = 0
                    Lbe:
                        java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode$applySemantics$1.invoke(java.util.List):java.lang.Boolean");
                }
            };
            this.S = ss2Var;
        }
        jj7.b0(lj7Var, this.n);
        a p2 = p2();
        if (p2 != null) {
            jj7.f0(lj7Var, p2.b());
            jj7.Z(lj7Var, p2.c());
        }
        jj7.h0(lj7Var, null, new ss2() { // from class: androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode$applySemantics$2
            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(a aVar) {
                TextAnnotatedStringNode.this.v2(aVar);
                fj7.b(TextAnnotatedStringNode.this);
                return Boolean.TRUE;
            }
        }, 1, null);
        jj7.m0(lj7Var, null, new ss2() { // from class: androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode$applySemantics$3
            {
                super(1);
            }

            public final Boolean b(boolean z) {
                TextAnnotatedStringNode.a p22;
                TextAnnotatedStringNode.a p23;
                p22 = TextAnnotatedStringNode.this.p2();
                if (p22 == null) {
                    return Boolean.FALSE;
                }
                p23 = TextAnnotatedStringNode.this.p2();
                if (p23 != null) {
                    p23.e(z);
                }
                fj7.b(TextAnnotatedStringNode.this);
                qz3.b(TextAnnotatedStringNode.this);
                dv1.a(TextAnnotatedStringNode.this);
                return Boolean.TRUE;
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return b(((Boolean) obj).booleanValue());
            }
        }, 1, null);
        jj7.d(lj7Var, null, new qs2() { // from class: androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode$applySemantics$4
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Boolean mo865invoke() {
                TextAnnotatedStringNode.this.k2();
                fj7.b(TextAnnotatedStringNode.this);
                qz3.b(TextAnnotatedStringNode.this);
                dv1.a(TextAnnotatedStringNode.this);
                return Boolean.TRUE;
            }
        }, 1, null);
        jj7.q(lj7Var, null, ss2Var, 1, null);
    }

    public final int u2(yq3 yq3Var, xq3 xq3Var, int i) {
        return f(yq3Var, xq3Var, i);
    }

    @Override // defpackage.cv1
    public void w(yv0 yv0Var) {
        if (L1()) {
            ph0 c = yv0Var.i1().c();
            aj8 c2 = o2(yv0Var).c();
            MultiParagraph w = c2.w();
            boolean z = c2.i() && !kj8.e(this.u, kj8.a.c());
            if (z) {
                kt6 b = nt6.b(fd5.b.c(), du7.a(hn3.g(c2.B()), hn3.f(c2.B())));
                c.t();
                ph0.h(c, b, 0, 2, null);
            }
            try {
                ph8 E = this.r.E();
                if (E == null) {
                    E = ph8.b.c();
                }
                ph8 ph8Var = E;
                jo7 B = this.r.B();
                if (B == null) {
                    B = jo7.d.a();
                }
                jo7 jo7Var = B;
                gv1 m = this.r.m();
                if (m == null) {
                    m = qf2.a;
                }
                gv1 gv1Var = m;
                yc0 k = this.r.k();
                if (k != null) {
                    w.D(c, k, (r17 & 4) != 0 ? Float.NaN : this.r.h(), (r17 & 8) != 0 ? null : jo7Var, (r17 & 16) != 0 ? null : ph8Var, (r17 & 32) != 0 ? null : gv1Var, (r17 & 64) != 0 ? fv1.p.a() : 0);
                } else {
                    do0 do0Var = this.M;
                    long a2 = do0Var != null ? do0Var.a() : nn0.b.g();
                    nn0.a aVar = nn0.b;
                    if (a2 == aVar.g()) {
                        a2 = this.r.l() != aVar.g() ? this.r.l() : aVar.a();
                    }
                    w.B(c, (r14 & 2) != 0 ? nn0.b.g() : a2, (r14 & 4) != 0 ? null : jo7Var, (r14 & 8) != 0 ? null : ph8Var, (r14 & 16) == 0 ? gv1Var : null, (r14 & 32) != 0 ? fv1.p.a() : 0);
                }
                if (z) {
                    c.k();
                }
                List list = this.B;
                if (list == null || list.isEmpty()) {
                    return;
                }
                yv0Var.A1();
            } catch (Throwable th) {
                if (z) {
                    c.k();
                }
                throw th;
            }
        }
    }

    public final boolean x2(ss2 ss2Var, ss2 ss2Var2, ui7 ui7Var) {
        boolean z;
        if (zq3.c(this.t, ss2Var)) {
            z = false;
        } else {
            this.t = ss2Var;
            z = true;
        }
        if (!zq3.c(this.H, ss2Var2)) {
            this.H = ss2Var2;
            z = true;
        }
        if (zq3.c(this.L, ui7Var)) {
            return z;
        }
        return true;
    }

    public final boolean y2(do0 do0Var, j jVar) {
        boolean c = zq3.c(do0Var, this.M);
        this.M = do0Var;
        return (c && jVar.J(this.r)) ? false : true;
    }

    public final boolean z2(j jVar, List list, int i, int i2, boolean z, e.b bVar, int i3) {
        boolean z2 = !this.r.K(jVar);
        this.r = jVar;
        if (!zq3.c(this.B, list)) {
            this.B = list;
            z2 = true;
        }
        if (this.y != i) {
            this.y = i;
            z2 = true;
        }
        if (this.x != i2) {
            this.x = i2;
            z2 = true;
        }
        if (this.w != z) {
            this.w = z;
            z2 = true;
        }
        if (!zq3.c(this.s, bVar)) {
            this.s = bVar;
            z2 = true;
        }
        if (kj8.e(this.u, i3)) {
            return z2;
        }
        this.u = i3;
        return true;
    }

    private TextAnnotatedStringNode(androidx.compose.ui.text.a aVar, j jVar, e.b bVar, ss2 ss2Var, int i, boolean z, int i2, int i3, List list, ss2 ss2Var2, ui7 ui7Var, do0 do0Var) {
        this.n = aVar;
        this.r = jVar;
        this.s = bVar;
        this.t = ss2Var;
        this.u = i;
        this.w = z;
        this.x = i2;
        this.y = i3;
        this.B = list;
        this.H = ss2Var2;
        this.M = do0Var;
        this.X = b0.e(null, null, 2, null);
    }

    public static final class a {
        private final androidx.compose.ui.text.a a;
        private androidx.compose.ui.text.a b;
        private boolean c;
        private nx4 d;

        public a(androidx.compose.ui.text.a aVar, androidx.compose.ui.text.a aVar2, boolean z, nx4 nx4Var) {
            this.a = aVar;
            this.b = aVar2;
            this.c = z;
            this.d = nx4Var;
        }

        public final nx4 a() {
            return this.d;
        }

        public final androidx.compose.ui.text.a b() {
            return this.b;
        }

        public final boolean c() {
            return this.c;
        }

        public final void d(nx4 nx4Var) {
            this.d = nx4Var;
        }

        public final void e(boolean z) {
            this.c = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return zq3.c(this.a, aVar.a) && zq3.c(this.b, aVar.b) && this.c == aVar.c && zq3.c(this.d, aVar.d);
        }

        public final void f(androidx.compose.ui.text.a aVar) {
            this.b = aVar;
        }

        public int hashCode() {
            int hashCode = ((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + Boolean.hashCode(this.c)) * 31;
            nx4 nx4Var = this.d;
            return hashCode + (nx4Var == null ? 0 : nx4Var.hashCode());
        }

        public String toString() {
            return "TextSubstitutionValue(original=" + ((Object) this.a) + ", substitution=" + ((Object) this.b) + ", isShowingSubstitution=" + this.c + ", layoutCache=" + this.d + ')';
        }

        public /* synthetic */ a(androidx.compose.ui.text.a aVar, androidx.compose.ui.text.a aVar2, boolean z, nx4 nx4Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(aVar, aVar2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : nx4Var);
        }
    }
}
