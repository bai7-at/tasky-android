package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.i;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.tooling.InspectionTablesKt;
import defpackage.bt0;
import defpackage.cc7;
import defpackage.dn3;
import defpackage.e08;
import defpackage.ej0;
import defpackage.es0;
import defpackage.et0;
import defpackage.f64;
import defpackage.ff3;
import defpackage.ft0;
import defpackage.ft6;
import defpackage.fy0;
import defpackage.gt2;
import defpackage.hd;
import defpackage.ht0;
import defpackage.j17;
import defpackage.kn3;
import defpackage.kr5;
import defpackage.ku8;
import defpackage.kw4;
import defpackage.ln;
import defpackage.lr5;
import defpackage.lw4;
import defpackage.ns0;
import defpackage.o76;
import defpackage.ov6;
import defpackage.pm1;
import defpackage.pv6;
import defpackage.qs2;
import defpackage.rm3;
import defpackage.ss2;
import defpackage.sy4;
import defpackage.to8;
import defpackage.u5;
import defpackage.vy4;
import defpackage.ww8;
import defpackage.x08;
import defpackage.yj2;
import defpackage.ys0;
import defpackage.yv3;
import defpackage.zq3;
import defpackage.zx4;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class ComposerImpl implements Composer {
    private int B;
    private int C;
    private boolean D;
    private boolean G;
    private boolean H;
    private q I;
    private r J;
    private t K;
    private boolean L;
    private kr5 M;
    private ej0 N;
    private final ns0 O;
    private hd P;
    private yj2 Q;
    private boolean R;
    private int S;
    private boolean T;
    private final kn3 U;
    private final ln b;
    private final androidx.compose.runtime.c c;
    private final r d;
    private final Set e;
    private ej0 f;
    private ej0 g;
    private final fy0 h;
    private Pending j;
    private int k;
    private int m;
    private int[] o;
    private zx4 p;
    private boolean q;
    private boolean r;
    private boolean s;
    private rm3 w;
    private boolean x;
    private boolean z;
    private final e08 i = new e08();
    private kn3 l = new kn3();
    private kn3 n = new kn3();
    private final List t = new ArrayList();
    private final kn3 u = new kn3();
    private kr5 v = lr5.a();
    private final kn3 y = new kn3();
    private int A = -1;
    private final c E = new c();
    private final e08 F = new e08();

    private static final class a implements j17 {
        private final b a;

        public a(b bVar) {
            this.a = bVar;
        }

        public final b a() {
            return this.a;
        }

        @Override // defpackage.ov6
        public void c() {
        }

        @Override // defpackage.ov6
        public void d() {
            this.a.r();
        }

        @Override // defpackage.ov6
        public void e() {
            this.a.r();
        }
    }

    private final class b extends androidx.compose.runtime.c {
        private final int a;
        private final boolean b;
        private final boolean c;
        private final ht0 d;
        private Set e;
        private final Set f = new LinkedHashSet();
        private final sy4 g = y.i(lr5.a(), y.n());

        public b(int i, boolean z, boolean z2, ht0 ht0Var) {
            this.a = i;
            this.b = z;
            this.c = z2;
            this.d = ht0Var;
        }

        private final kr5 t() {
            return (kr5) this.g.getValue();
        }

        private final void u(kr5 kr5Var) {
            this.g.setValue(kr5Var);
        }

        @Override // androidx.compose.runtime.c
        public void a(fy0 fy0Var, gt2 gt2Var) {
            ComposerImpl.this.c.a(fy0Var, gt2Var);
        }

        @Override // androidx.compose.runtime.c
        public void b() {
            ComposerImpl composerImpl = ComposerImpl.this;
            composerImpl.B--;
        }

        @Override // androidx.compose.runtime.c
        public boolean c() {
            return this.b;
        }

        @Override // androidx.compose.runtime.c
        public boolean d() {
            return this.c;
        }

        @Override // androidx.compose.runtime.c
        public kr5 e() {
            return t();
        }

        @Override // androidx.compose.runtime.c
        public int f() {
            return this.a;
        }

        @Override // androidx.compose.runtime.c
        public CoroutineContext g() {
            return ComposerImpl.this.c.g();
        }

        @Override // androidx.compose.runtime.c
        public ht0 h() {
            return this.d;
        }

        @Override // androidx.compose.runtime.c
        public void i(lw4 lw4Var) {
            ComposerImpl.this.c.i(lw4Var);
        }

        @Override // androidx.compose.runtime.c
        public void j(fy0 fy0Var) {
            ComposerImpl.this.c.j(ComposerImpl.this.B0());
            ComposerImpl.this.c.j(fy0Var);
        }

        @Override // androidx.compose.runtime.c
        public kw4 k(lw4 lw4Var) {
            return ComposerImpl.this.c.k(lw4Var);
        }

        @Override // androidx.compose.runtime.c
        public void l(Set set) {
            Set set2 = this.e;
            if (set2 == null) {
                set2 = new HashSet();
                this.e = set2;
            }
            set2.add(set);
        }

        @Override // androidx.compose.runtime.c
        public void m(Composer composer) {
            zq3.f(composer, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
            super.m((ComposerImpl) composer);
            this.f.add(composer);
        }

        @Override // androidx.compose.runtime.c
        public void n(fy0 fy0Var) {
            ComposerImpl.this.c.n(fy0Var);
        }

        @Override // androidx.compose.runtime.c
        public void o() {
            ComposerImpl.this.B++;
        }

        @Override // androidx.compose.runtime.c
        public void p(Composer composer) {
            Set<Set> set = this.e;
            if (set != null) {
                for (Set set2 : set) {
                    zq3.f(composer, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
                    set2.remove(((ComposerImpl) composer).d);
                }
            }
            ku8.a(this.f).remove(composer);
        }

        @Override // androidx.compose.runtime.c
        public void q(fy0 fy0Var) {
            ComposerImpl.this.c.q(fy0Var);
        }

        public final void r() {
            if (this.f.isEmpty()) {
                return;
            }
            Set set = this.e;
            if (set != null) {
                for (ComposerImpl composerImpl : this.f) {
                    Iterator it2 = set.iterator();
                    while (it2.hasNext()) {
                        ((Set) it2.next()).remove(composerImpl.d);
                    }
                }
            }
            this.f.clear();
        }

        public final Set s() {
            return this.f;
        }

        public final void v(kr5 kr5Var) {
            u(kr5Var);
        }
    }

    public static final class c implements pm1 {
        c() {
        }

        @Override // defpackage.pm1
        public void a(f fVar) {
            ComposerImpl composerImpl = ComposerImpl.this;
            composerImpl.B--;
        }

        @Override // defpackage.pm1
        public void b(f fVar) {
            ComposerImpl.this.B++;
        }
    }

    public ComposerImpl(ln lnVar, androidx.compose.runtime.c cVar, r rVar, Set set, ej0 ej0Var, ej0 ej0Var2, fy0 fy0Var) {
        this.b = lnVar;
        this.c = cVar;
        this.d = rVar;
        this.e = set;
        this.f = ej0Var;
        this.g = ej0Var2;
        this.h = fy0Var;
        q y = rVar.y();
        y.d();
        this.I = y;
        r rVar2 = new r();
        this.J = rVar2;
        t z = rVar2.z();
        z.L();
        this.K = z;
        this.O = new ns0(this, this.f);
        q y2 = this.J.y();
        try {
            hd a2 = y2.a(0);
            y2.d();
            this.P = a2;
            this.Q = new yj2();
            this.T = true;
            this.U = new kn3();
        } catch (Throwable th) {
            y2.d();
            throw th;
        }
    }

    private final Object E0(q qVar) {
        return qVar.I(qVar.s());
    }

    private final int G0(q qVar, int i) {
        Object w;
        if (!qVar.D(i)) {
            int z = qVar.z(i);
            return (z != 207 || (w = qVar.w(i)) == null || zq3.c(w, Composer.a.a())) ? z : w.hashCode();
        }
        Object A = qVar.A(i);
        if (A != null) {
            return A instanceof Enum ? ((Enum) A).ordinal() : A.hashCode();
        }
        return 0;
    }

    private final void H0(List list) {
        ns0 ns0Var;
        ej0 ej0Var;
        ns0 ns0Var2;
        ej0 ej0Var2;
        List r;
        q qVar;
        q F0;
        int[] iArr;
        rm3 rm3Var;
        ej0 ej0Var3;
        ns0 ns0Var3;
        int i;
        int i2;
        q qVar2;
        int i3 = 1;
        ns0 ns0Var4 = this.O;
        ej0 ej0Var4 = this.g;
        ej0 m = ns0Var4.m();
        try {
            ns0Var4.P(ej0Var4);
            this.O.N();
            int size = list.size();
            int i4 = 0;
            int i5 = 0;
            while (i5 < size) {
                try {
                    Pair pair = (Pair) list.get(i5);
                    final lw4 lw4Var = (lw4) pair.a();
                    lw4 lw4Var2 = (lw4) pair.b();
                    hd a2 = lw4Var.a();
                    int c2 = lw4Var.g().c(a2);
                    dn3 dn3Var = new dn3(i4, i3, null);
                    this.O.d(dn3Var, a2);
                    if (lw4Var2 == null) {
                        if (zq3.c(lw4Var.g(), this.J)) {
                            l0();
                        }
                        final q y = lw4Var.g().y();
                        try {
                            y.N(c2);
                            this.O.w(c2);
                            final ej0 ej0Var5 = new ej0();
                            qVar2 = y;
                            try {
                                T0(this, null, null, null, null, new qs2() { // from class: androidx.compose.runtime.ComposerImpl$insertMovableContentGuarded$1$1$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // defpackage.qs2
                                    /* renamed from: invoke */
                                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                                        m51invoke();
                                        return ww8.a;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m51invoke() {
                                        ns0 ns0Var5;
                                        ns0 ns0Var6;
                                        ns0Var5 = ComposerImpl.this.O;
                                        ej0 ej0Var6 = ej0Var5;
                                        ComposerImpl composerImpl = ComposerImpl.this;
                                        q qVar3 = y;
                                        lw4 lw4Var3 = lw4Var;
                                        ej0 m2 = ns0Var5.m();
                                        try {
                                            ns0Var5.P(ej0Var6);
                                            q F02 = composerImpl.F0();
                                            int[] iArr2 = composerImpl.o;
                                            rm3 rm3Var2 = composerImpl.w;
                                            composerImpl.o = null;
                                            composerImpl.w = null;
                                            try {
                                                composerImpl.c1(qVar3);
                                                ns0Var6 = composerImpl.O;
                                                boolean n = ns0Var6.n();
                                                try {
                                                    ns0Var6.Q(false);
                                                    lw4Var3.c();
                                                    composerImpl.K0(null, lw4Var3.e(), lw4Var3.f(), true);
                                                    ns0Var6.Q(n);
                                                    ww8 ww8Var = ww8.a;
                                                } catch (Throwable th) {
                                                    ns0Var6.Q(n);
                                                    throw th;
                                                }
                                            } finally {
                                                composerImpl.c1(F02);
                                                composerImpl.o = iArr2;
                                                composerImpl.w = rm3Var2;
                                            }
                                        } finally {
                                            ns0Var5.P(m2);
                                        }
                                    }
                                }, 15, null);
                                this.O.p(ej0Var5, dn3Var);
                                ww8 ww8Var = ww8.a;
                                qVar2.d();
                                ns0Var2 = ns0Var4;
                                ej0Var2 = m;
                                i = size;
                                i2 = i5;
                            } catch (Throwable th) {
                                th = th;
                                qVar2.d();
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            qVar2 = y;
                        }
                    } else {
                        kw4 k = this.c.k(lw4Var2);
                        r g = lw4Var2.g();
                        hd a3 = lw4Var2.a();
                        r = androidx.compose.runtime.b.r(g, a3);
                        if (!r.isEmpty()) {
                            this.O.a(r, dn3Var);
                            if (zq3.c(lw4Var.g(), this.d)) {
                                int c3 = this.d.c(a2);
                                s1(c3, x1(c3) + r.size());
                            }
                        }
                        this.O.b(k, this.c, lw4Var2, lw4Var);
                        q y2 = g.y();
                        try {
                            F0 = F0();
                            int[] iArr2 = this.o;
                            rm3 rm3Var2 = this.w;
                            this.o = null;
                            this.w = null;
                            try {
                                c1(y2);
                                int c4 = g.c(a3);
                                y2.N(c4);
                                this.O.w(c4);
                                ej0 ej0Var6 = new ej0();
                                ns0 ns0Var5 = this.O;
                                ej0 m2 = ns0Var5.m();
                                try {
                                    ns0Var5.P(ej0Var6);
                                    i = size;
                                    ns0 ns0Var6 = this.O;
                                    boolean n = ns0Var6.n();
                                    try {
                                        ns0Var6.Q(false);
                                        fy0 b2 = lw4Var2.b();
                                        fy0 b3 = lw4Var.b();
                                        Integer valueOf = Integer.valueOf(y2.k());
                                        ns0Var2 = ns0Var4;
                                        rm3Var = rm3Var2;
                                        ej0Var2 = m;
                                        ej0Var3 = m2;
                                        i2 = i5;
                                        iArr = iArr2;
                                        qVar = y2;
                                        ns0Var3 = ns0Var5;
                                        try {
                                            S0(b2, b3, valueOf, lw4Var2.d(), new qs2() { // from class: androidx.compose.runtime.ComposerImpl$insertMovableContentGuarded$1$1$2$1$1$1$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                @Override // defpackage.qs2
                                                /* renamed from: invoke */
                                                public /* bridge */ /* synthetic */ Object mo865invoke() {
                                                    m52invoke();
                                                    return ww8.a;
                                                }

                                                /* renamed from: invoke, reason: collision with other method in class */
                                                public final void m52invoke() {
                                                    ComposerImpl composerImpl = ComposerImpl.this;
                                                    lw4Var.c();
                                                    composerImpl.K0(null, lw4Var.e(), lw4Var.f(), true);
                                                }
                                            });
                                            try {
                                                ns0Var6.Q(n);
                                                try {
                                                    ns0Var3.P(ej0Var3);
                                                    this.O.p(ej0Var6, dn3Var);
                                                    ww8 ww8Var2 = ww8.a;
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    c1(F0);
                                                    this.o = iArr;
                                                    this.w = rm3Var;
                                                    throw th;
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                                ns0Var3.P(ej0Var3);
                                                throw th;
                                            }
                                        } catch (Throwable th5) {
                                            th = th5;
                                            ns0Var6.Q(n);
                                            throw th;
                                        }
                                    } catch (Throwable th6) {
                                        th = th6;
                                        iArr = iArr2;
                                        qVar = y2;
                                        rm3Var = rm3Var2;
                                        ns0Var3 = ns0Var5;
                                        ej0Var3 = m2;
                                    }
                                } catch (Throwable th7) {
                                    th = th7;
                                    iArr = iArr2;
                                    qVar = y2;
                                    rm3Var = rm3Var2;
                                    ej0Var3 = m2;
                                    ns0Var3 = ns0Var5;
                                }
                            } catch (Throwable th8) {
                                th = th8;
                                iArr = iArr2;
                                qVar = y2;
                                rm3Var = rm3Var2;
                            }
                        } catch (Throwable th9) {
                            th = th9;
                            qVar = y2;
                        }
                        try {
                            c1(F0);
                            this.o = iArr;
                            this.w = rm3Var;
                            try {
                                qVar.d();
                            } catch (Throwable th10) {
                                th = th10;
                                ej0Var = ej0Var2;
                                ns0Var = ns0Var2;
                                ns0Var.P(ej0Var);
                                throw th;
                            }
                        } catch (Throwable th11) {
                            th = th11;
                            qVar.d();
                            throw th;
                        }
                    }
                    this.O.S();
                    i3 = 1;
                    i5 = i2 + 1;
                    size = i;
                    m = ej0Var2;
                    ns0Var4 = ns0Var2;
                    i4 = 0;
                } catch (Throwable th12) {
                    th = th12;
                    ns0Var2 = ns0Var4;
                    ej0Var2 = m;
                }
            }
            ns0 ns0Var7 = ns0Var4;
            ej0 ej0Var7 = m;
            this.O.g();
            this.O.w(0);
            ns0Var7.P(ej0Var7);
        } catch (Throwable th13) {
            th = th13;
            ns0Var = ns0Var4;
            ej0Var = m;
        }
    }

    private final int J0(int i) {
        return (-2) - i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
    
        X0(r13);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void K0(final defpackage.jw4 r12, defpackage.kr5 r13, final java.lang.Object r14, boolean r15) {
        /*
            r11 = this;
            r0 = 126665345(0x78cc281, float:2.1179178E-34)
            r11.F(r0, r12)
            r11.v1(r14)
            int r1 = r11.O()
            r2 = 0
            r11.S = r0     // Catch: java.lang.Throwable -> L1e
            boolean r0 = r11.f()     // Catch: java.lang.Throwable -> L1e
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L21
            androidx.compose.runtime.t r0 = r11.K     // Catch: java.lang.Throwable -> L1e
            androidx.compose.runtime.t.t0(r0, r3, r4, r2)     // Catch: java.lang.Throwable -> L1e
            goto L21
        L1e:
            r12 = move-exception
            goto L9f
        L21:
            boolean r0 = r11.f()     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L28
            goto L35
        L28:
            androidx.compose.runtime.q r0 = r11.I     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r0 = r0.l()     // Catch: java.lang.Throwable -> L1e
            boolean r0 = defpackage.zq3.c(r0, r13)     // Catch: java.lang.Throwable -> L1e
            if (r0 != 0) goto L35
            r3 = r4
        L35:
            if (r3 == 0) goto L3a
            r11.X0(r13)     // Catch: java.lang.Throwable -> L1e
        L3a:
            java.lang.Object r0 = androidx.compose.runtime.b.z()     // Catch: java.lang.Throwable -> L1e
            androidx.compose.runtime.i$a r5 = androidx.compose.runtime.i.a     // Catch: java.lang.Throwable -> L1e
            int r5 = r5.a()     // Catch: java.lang.Throwable -> L1e
            r6 = 202(0xca, float:2.83E-43)
            r11.g1(r6, r0, r5, r13)     // Catch: java.lang.Throwable -> L1e
            r11.M = r2     // Catch: java.lang.Throwable -> L1e
            boolean r13 = r11.f()     // Catch: java.lang.Throwable -> L1e
            if (r13 == 0) goto L7f
            if (r15 != 0) goto L7f
            r11.L = r4     // Catch: java.lang.Throwable -> L1e
            androidx.compose.runtime.t r13 = r11.K     // Catch: java.lang.Throwable -> L1e
            int r15 = r13.c0()     // Catch: java.lang.Throwable -> L1e
            int r15 = r13.E0(r15)     // Catch: java.lang.Throwable -> L1e
            hd r8 = r13.F(r15)     // Catch: java.lang.Throwable -> L1e
            lw4 r13 = new lw4     // Catch: java.lang.Throwable -> L1e
            fy0 r6 = r11.B0()     // Catch: java.lang.Throwable -> L1e
            androidx.compose.runtime.r r7 = r11.J     // Catch: java.lang.Throwable -> L1e
            java.util.List r9 = kotlin.collections.i.l()     // Catch: java.lang.Throwable -> L1e
            kr5 r10 = r11.m0()     // Catch: java.lang.Throwable -> L1e
            r3 = r13
            r4 = r12
            r5 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L1e
            androidx.compose.runtime.c r12 = r11.c     // Catch: java.lang.Throwable -> L1e
            r12.i(r13)     // Catch: java.lang.Throwable -> L1e
            goto L94
        L7f:
            boolean r13 = r11.x     // Catch: java.lang.Throwable -> L1e
            r11.x = r3     // Catch: java.lang.Throwable -> L1e
            androidx.compose.runtime.ComposerImpl$invokeMovableContentLambda$1 r15 = new androidx.compose.runtime.ComposerImpl$invokeMovableContentLambda$1     // Catch: java.lang.Throwable -> L1e
            r15.<init>(r12, r14)     // Catch: java.lang.Throwable -> L1e
            r12 = 316014703(0x12d6006f, float:1.3505406E-27)
            yr0 r12 = defpackage.zr0.c(r12, r4, r15)     // Catch: java.lang.Throwable -> L1e
            defpackage.u5.d(r11, r12)     // Catch: java.lang.Throwable -> L1e
            r11.x = r13     // Catch: java.lang.Throwable -> L1e
        L94:
            r11.t0()
            r11.M = r2
            r11.S = r1
            r11.Q()
            return
        L9f:
            r11.t0()
            r11.M = r2
            r11.S = r1
            r11.Q()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl.K0(jw4, kr5, java.lang.Object, boolean):void");
    }

    private final Object O0(q qVar, int i) {
        return qVar.I(i);
    }

    private final int P0(int i, int i2, int i3, int i4) {
        int M = this.I.M(i2);
        while (M != i3 && !this.I.G(M)) {
            M = this.I.M(M);
        }
        if (this.I.G(M)) {
            i4 = 0;
        }
        if (M == i2) {
            return i4;
        }
        int x1 = (x1(M) - this.I.K(i2)) + i4;
        loop1: while (i4 < x1 && M != i) {
            M++;
            while (M < i) {
                int B = this.I.B(M) + M;
                if (i >= B) {
                    i4 += x1(M);
                    M = B;
                }
            }
            break loop1;
        }
        return i4;
    }

    private final Object S0(fy0 fy0Var, fy0 fy0Var2, Integer num, List list, qs2 qs2Var) {
        Object obj;
        boolean z = this.G;
        int i = this.k;
        try {
            this.G = true;
            this.k = 0;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Pair pair = (Pair) list.get(i2);
                RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) pair.a();
                IdentityArraySet identityArraySet = (IdentityArraySet) pair.b();
                if (identityArraySet != null) {
                    Object[] j = identityArraySet.j();
                    int size2 = identityArraySet.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        Object obj2 = j[i3];
                        zq3.f(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                        m1(recomposeScopeImpl, obj2);
                    }
                } else {
                    m1(recomposeScopeImpl, null);
                }
            }
            if (fy0Var != null) {
                obj = fy0Var.b(fy0Var2, num != null ? num.intValue() : -1, qs2Var);
                if (obj == null) {
                }
                this.G = z;
                this.k = i;
                return obj;
            }
            obj = qs2Var.mo865invoke();
            this.G = z;
            this.k = i;
            return obj;
        } catch (Throwable th) {
            this.G = z;
            this.k = i;
            throw th;
        }
    }

    static /* synthetic */ Object T0(ComposerImpl composerImpl, fy0 fy0Var, fy0 fy0Var2, Integer num, List list, qs2 qs2Var, int i, Object obj) {
        fy0 fy0Var3 = (i & 1) != 0 ? null : fy0Var;
        fy0 fy0Var4 = (i & 2) != 0 ? null : fy0Var2;
        Integer num2 = (i & 4) != 0 ? null : num;
        if ((i & 8) != 0) {
            list = kotlin.collections.i.l();
        }
        return composerImpl.S0(fy0Var3, fy0Var4, num2, list, qs2Var);
    }

    private final void U() {
        h0();
        this.i.a();
        this.l.a();
        this.n.a();
        this.u.a();
        this.y.a();
        this.w = null;
        if (!this.I.i()) {
            this.I.d();
        }
        if (!this.K.Z()) {
            this.K.L();
        }
        this.Q.a();
        l0();
        this.S = 0;
        this.B = 0;
        this.s = false;
        this.R = false;
        this.z = false;
        this.G = false;
        this.r = false;
        this.A = -1;
    }

    private final void U0() {
        j y;
        boolean z = this.G;
        this.G = true;
        int s = this.I.s();
        int B = this.I.B(s) + s;
        int i = this.k;
        int O = O();
        int i2 = this.m;
        y = androidx.compose.runtime.b.y(this.t, this.I.k(), B);
        boolean z2 = false;
        int i3 = s;
        while (y != null) {
            int b2 = y.b();
            androidx.compose.runtime.b.O(this.t, b2);
            if (y.d()) {
                this.I.N(b2);
                int k = this.I.k();
                Y0(i3, k, s);
                this.k = P0(b2, k, s, i);
                this.S = k0(this.I.M(k), s, O);
                this.M = null;
                y.c().h(this);
                this.M = null;
                this.I.O(s);
                i3 = k;
                z2 = true;
            } else {
                this.F.h(y.c());
                y.c().y();
                this.F.g();
            }
            y = androidx.compose.runtime.b.y(this.t, this.I.k(), B);
        }
        if (z2) {
            Y0(i3, s, s);
            this.I.Q();
            int x1 = x1(s);
            this.k = i + x1;
            this.m = i2 + x1;
        } else {
            f1();
        }
        this.S = O;
        this.G = z;
    }

    private final void V0() {
        a1(this.I.k());
        this.O.L();
    }

    private final void W0(hd hdVar) {
        if (this.Q.e()) {
            this.O.q(hdVar, this.J);
        } else {
            this.O.r(hdVar, this.J, this.Q);
            this.Q = new yj2();
        }
    }

    private final void X0(kr5 kr5Var) {
        rm3 rm3Var = this.w;
        if (rm3Var == null) {
            rm3Var = new rm3(0, 1, null);
            this.w = rm3Var;
        }
        rm3Var.b(this.I.k(), kr5Var);
    }

    private final void Y0(int i, int i2, int i3) {
        int I;
        q qVar = this.I;
        I = androidx.compose.runtime.b.I(qVar, i, i2, i3);
        while (i > 0 && i != I) {
            if (qVar.G(i)) {
                this.O.x();
            }
            i = qVar.M(i);
        }
        r0(i2, I);
    }

    private final void Z0() {
        if (this.d.j()) {
            ej0 ej0Var = new ej0();
            this.N = ej0Var;
            q y = this.d.y();
            try {
                this.I = y;
                ns0 ns0Var = this.O;
                ej0 m = ns0Var.m();
                try {
                    ns0Var.P(ej0Var);
                    a1(0);
                    this.O.J();
                    ns0Var.P(m);
                    ww8 ww8Var = ww8.a;
                } catch (Throwable th) {
                    ns0Var.P(m);
                    throw th;
                }
            } finally {
                y.d();
            }
        }
    }

    private final void a1(int i) {
        b1(this, i, false, 0);
        this.O.h();
    }

    private static final int b1(ComposerImpl composerImpl, int i, boolean z, int i2) {
        q qVar = composerImpl.I;
        if (qVar.C(i)) {
            int z2 = qVar.z(i);
            Object A = qVar.A(i);
            if (z2 != 206 || !zq3.c(A, androidx.compose.runtime.b.E())) {
                if (qVar.G(i)) {
                    return 1;
                }
                return qVar.K(i);
            }
            Object y = qVar.y(i, 0);
            a aVar = y instanceof a ? (a) y : null;
            if (aVar != null) {
                for (ComposerImpl composerImpl2 : aVar.a().s()) {
                    composerImpl2.Z0();
                    composerImpl.c.n(composerImpl2.B0());
                }
            }
            return qVar.K(i);
        }
        if (!qVar.e(i)) {
            if (qVar.G(i)) {
                return 1;
            }
            return qVar.K(i);
        }
        int B = qVar.B(i) + i;
        int i3 = 0;
        for (int i4 = i + 1; i4 < B; i4 += qVar.B(i4)) {
            boolean G = qVar.G(i4);
            if (G) {
                composerImpl.O.h();
                composerImpl.O.t(qVar.I(i4));
            }
            i3 += b1(composerImpl, i4, G || z, G ? 0 : i2 + i3);
            if (G) {
                composerImpl.O.h();
                composerImpl.O.x();
            }
        }
        if (qVar.G(i)) {
            return 1;
        }
        return i3;
    }

    private final void e1() {
        this.m += this.I.P();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0067, code lost:
    
        if (r0 != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void f0() {
        /*
            r4 = this;
            boolean r0 = r4.f()
            java.lang.String r1 = "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl"
            if (r0 == 0) goto L24
            androidx.compose.runtime.RecomposeScopeImpl r0 = new androidx.compose.runtime.RecomposeScopeImpl
            fy0 r2 = r4.B0()
            defpackage.zq3.f(r2, r1)
            androidx.compose.runtime.d r2 = (androidx.compose.runtime.d) r2
            r0.<init>(r2)
            e08 r1 = r4.F
            r1.h(r0)
            r4.w1(r0)
            int r4 = r4.C
            r0.I(r4)
            goto L77
        L24:
            java.util.List r0 = r4.t
            androidx.compose.runtime.q r2 = r4.I
            int r2 = r2.s()
            androidx.compose.runtime.j r0 = androidx.compose.runtime.b.n(r0, r2)
            androidx.compose.runtime.q r2 = r4.I
            java.lang.Object r2 = r2.H()
            androidx.compose.runtime.Composer$a r3 = androidx.compose.runtime.Composer.a
            java.lang.Object r3 = r3.a()
            boolean r3 = defpackage.zq3.c(r2, r3)
            if (r3 == 0) goto L54
            androidx.compose.runtime.RecomposeScopeImpl r2 = new androidx.compose.runtime.RecomposeScopeImpl
            fy0 r3 = r4.B0()
            defpackage.zq3.f(r3, r1)
            androidx.compose.runtime.d r3 = (androidx.compose.runtime.d) r3
            r2.<init>(r3)
            r4.w1(r2)
            goto L5b
        L54:
            java.lang.String r1 = "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl"
            defpackage.zq3.f(r2, r1)
            androidx.compose.runtime.RecomposeScopeImpl r2 = (androidx.compose.runtime.RecomposeScopeImpl) r2
        L5b:
            if (r0 != 0) goto L69
            boolean r0 = r2.n()
            r1 = 0
            if (r0 == 0) goto L67
            r2.D(r1)
        L67:
            if (r0 == 0) goto L6a
        L69:
            r1 = 1
        L6a:
            r2.E(r1)
            e08 r0 = r4.F
            r0.h(r2)
            int r4 = r4.C
            r2.I(r4)
        L77:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl.f0():void");
    }

    private final void f1() {
        this.m = this.I.t();
        this.I.Q();
    }

    private final void g1(int i, Object obj, int i2, Object obj2) {
        Object obj3 = obj;
        z1();
        o1(i, obj, obj2);
        i.a aVar = i.a;
        boolean z = i2 != aVar.a();
        Pending pending = null;
        if (f()) {
            this.I.c();
            int a0 = this.K.a0();
            if (z) {
                this.K.e1(i, Composer.a.a());
            } else if (obj2 != null) {
                t tVar = this.K;
                if (obj3 == null) {
                    obj3 = Composer.a.a();
                }
                tVar.a1(i, obj3, obj2);
            } else {
                t tVar2 = this.K;
                if (obj3 == null) {
                    obj3 = Composer.a.a();
                }
                tVar2.c1(i, obj3);
            }
            Pending pending2 = this.j;
            if (pending2 != null) {
                yv3 yv3Var = new yv3(i, -1, J0(a0), -1, 0);
                pending2.i(yv3Var, this.k - pending2.e());
                pending2.h(yv3Var);
            }
            x0(z, null);
            return;
        }
        boolean z2 = i2 == aVar.b() && this.z;
        if (this.j == null) {
            int n = this.I.n();
            if (!z2 && n == i && zq3.c(obj, this.I.o())) {
                j1(z, obj2);
            } else {
                this.j = new Pending(this.I.h(), this.k);
            }
        }
        Pending pending3 = this.j;
        if (pending3 != null) {
            yv3 d = pending3.d(i, obj);
            if (z2 || d == null) {
                this.I.c();
                this.R = true;
                this.M = null;
                w0();
                this.K.I();
                int a02 = this.K.a0();
                if (z) {
                    this.K.e1(i, Composer.a.a());
                } else if (obj2 != null) {
                    t tVar3 = this.K;
                    if (obj3 == null) {
                        obj3 = Composer.a.a();
                    }
                    tVar3.a1(i, obj3, obj2);
                } else {
                    t tVar4 = this.K;
                    if (obj3 == null) {
                        obj3 = Composer.a.a();
                    }
                    tVar4.c1(i, obj3);
                }
                this.P = this.K.F(a02);
                yv3 yv3Var2 = new yv3(i, -1, J0(a02), -1, 0);
                pending3.i(yv3Var2, this.k - pending3.e());
                pending3.h(yv3Var2);
                pending = new Pending(new ArrayList(), z ? 0 : this.k);
            } else {
                pending3.h(d);
                int b2 = d.b();
                this.k = pending3.g(d) + pending3.e();
                int m = pending3.m(d);
                int a2 = m - pending3.a();
                pending3.k(m, pending3.a());
                this.O.v(b2);
                this.I.N(b2);
                if (a2 > 0) {
                    this.O.s(a2);
                }
                j1(z, obj2);
            }
        }
        x0(z, pending);
    }

    private final void h0() {
        this.j = null;
        this.k = 0;
        this.m = 0;
        this.S = 0;
        this.s = false;
        this.O.O();
        this.F.a();
        i0();
    }

    private final void h1(int i) {
        g1(i, null, i.a.a(), null);
    }

    private final void i0() {
        this.o = null;
        this.p = null;
    }

    private final void i1(int i, Object obj) {
        g1(i, obj, i.a.a(), null);
    }

    private final void j1(boolean z, Object obj) {
        if (z) {
            this.I.S();
            return;
        }
        if (obj != null && this.I.l() != obj) {
            this.O.T(obj);
        }
        this.I.R();
    }

    private final int k0(int i, int i2, int i3) {
        if (i == i2) {
            return i3;
        }
        int G0 = G0(this.I, i);
        return G0 == 126665345 ? G0 : Integer.rotateLeft(k0(this.I.M(i), i2, i3), 3) ^ G0;
    }

    private final void l0() {
        androidx.compose.runtime.b.Q(this.K.Z());
        r rVar = new r();
        this.J = rVar;
        t z = rVar.z();
        z.L();
        this.K = z;
    }

    private final void l1() {
        int q;
        this.I = this.d.y();
        h1(100);
        this.c.o();
        this.v = this.c.e();
        kn3 kn3Var = this.y;
        q = androidx.compose.runtime.b.q(this.x);
        kn3Var.i(q);
        this.x = S(this.v);
        this.M = null;
        if (!this.q) {
            this.q = this.c.c();
        }
        if (!this.D) {
            this.D = this.c.d();
        }
        Set set = (Set) ft0.c(this.v, InspectionTablesKt.a());
        if (set != null) {
            set.add(this.d);
            this.c.l(set);
        }
        h1(this.c.f());
    }

    private final kr5 m0() {
        kr5 kr5Var = this.M;
        return kr5Var != null ? kr5Var : n0(this.I.s());
    }

    private final kr5 n0(int i) {
        kr5 kr5Var;
        if (f() && this.L) {
            int c0 = this.K.c0();
            while (c0 > 0) {
                if (this.K.h0(c0) == 202 && zq3.c(this.K.i0(c0), androidx.compose.runtime.b.z())) {
                    Object f0 = this.K.f0(c0);
                    zq3.f(f0, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                    kr5 kr5Var2 = (kr5) f0;
                    this.M = kr5Var2;
                    return kr5Var2;
                }
                c0 = this.K.E0(c0);
            }
        }
        if (this.I.u() > 0) {
            while (i > 0) {
                if (this.I.z(i) == 202 && zq3.c(this.I.A(i), androidx.compose.runtime.b.z())) {
                    rm3 rm3Var = this.w;
                    if (rm3Var == null || (kr5Var = (kr5) rm3Var.a(i)) == null) {
                        Object w = this.I.w(i);
                        zq3.f(w, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                        kr5Var = (kr5) w;
                    }
                    this.M = kr5Var;
                    return kr5Var;
                }
                i = this.I.M(i);
            }
        }
        kr5 kr5Var3 = this.v;
        this.M = kr5Var3;
        return kr5Var3;
    }

    private final void o1(int i, Object obj, Object obj2) {
        if (obj != null) {
            if (obj instanceof Enum) {
                p1(((Enum) obj).ordinal());
                return;
            } else {
                p1(obj.hashCode());
                return;
            }
        }
        if (obj2 == null || i != 207 || zq3.c(obj2, Composer.a.a())) {
            p1(i);
        } else {
            p1(obj2.hashCode());
        }
    }

    private final void p1(int i) {
        this.S = i ^ Integer.rotateLeft(O(), 3);
    }

    private final void q0(ff3 ff3Var, gt2 gt2Var) {
        Comparator comparator;
        if (this.G) {
            androidx.compose.runtime.b.t("Reentrant composition is not supported");
            throw new KotlinNothingValueException();
        }
        Object a2 = to8.a.a("Compose:recompose");
        try {
            this.C = SnapshotKt.H().f();
            this.w = null;
            int g = ff3Var.g();
            for (int i = 0; i < g; i++) {
                Object obj = ff3Var.f()[i];
                zq3.f(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
                IdentityArraySet identityArraySet = (IdentityArraySet) ff3Var.h()[i];
                RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) obj;
                hd j = recomposeScopeImpl.j();
                if (j == null) {
                    return;
                }
                this.t.add(new j(recomposeScopeImpl, j.a(), identityArraySet));
            }
            List list = this.t;
            comparator = androidx.compose.runtime.b.g;
            kotlin.collections.i.A(list, comparator);
            this.k = 0;
            this.G = true;
            try {
                l1();
                Object M0 = M0();
                if (M0 != gt2Var && gt2Var != null) {
                    w1(gt2Var);
                }
                c cVar = this.E;
                vy4 c2 = y.c();
                try {
                    c2.b(cVar);
                    if (gt2Var != null) {
                        i1(200, androidx.compose.runtime.b.A());
                        u5.d(this, gt2Var);
                        t0();
                    } else if (!(this.r || this.x) || M0 == null || zq3.c(M0, Composer.a.a())) {
                        d1();
                    } else {
                        i1(200, androidx.compose.runtime.b.A());
                        u5.d(this, (gt2) ku8.f(M0, 2));
                        t0();
                    }
                    c2.y(c2.q() - 1);
                    v0();
                    this.G = false;
                    this.t.clear();
                    l0();
                    ww8 ww8Var = ww8.a;
                } catch (Throwable th) {
                    c2.y(c2.q() - 1);
                    throw th;
                }
            } catch (Throwable th2) {
                this.G = false;
                this.t.clear();
                U();
                l0();
                throw th2;
            }
        } finally {
            to8.a.b(a2);
        }
    }

    private final void q1(int i, Object obj, Object obj2) {
        if (obj != null) {
            if (obj instanceof Enum) {
                r1(((Enum) obj).ordinal());
                return;
            } else {
                r1(obj.hashCode());
                return;
            }
        }
        if (obj2 == null || i != 207 || zq3.c(obj2, Composer.a.a())) {
            r1(i);
        } else {
            r1(obj2.hashCode());
        }
    }

    private final void r0(int i, int i2) {
        if (i <= 0 || i == i2) {
            return;
        }
        r0(this.I.M(i), i2);
        if (this.I.G(i)) {
            this.O.t(O0(this.I, i));
        }
    }

    private final void r1(int i) {
        this.S = Integer.rotateRight(Integer.hashCode(i) ^ O(), 3);
    }

    private final void s0(boolean z) {
        Set set;
        List list;
        if (f()) {
            int c0 = this.K.c0();
            q1(this.K.h0(c0), this.K.i0(c0), this.K.f0(c0));
        } else {
            int s = this.I.s();
            q1(this.I.z(s), this.I.A(s), this.I.w(s));
        }
        int i = this.m;
        Pending pending = this.j;
        if (pending != null && pending.b().size() > 0) {
            List b2 = pending.b();
            List f = pending.f();
            Set e = f64.e(f);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size = f.size();
            int size2 = b2.size();
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (i2 < size2) {
                yv3 yv3Var = (yv3) b2.get(i2);
                if (e.contains(yv3Var)) {
                    set = e;
                    if (!linkedHashSet.contains(yv3Var)) {
                        if (i3 < size) {
                            yv3 yv3Var2 = (yv3) f.get(i3);
                            if (yv3Var2 != yv3Var) {
                                int g = pending.g(yv3Var2);
                                linkedHashSet.add(yv3Var2);
                                if (g != i4) {
                                    int o = pending.o(yv3Var2);
                                    list = f;
                                    this.O.u(pending.e() + g, i4 + pending.e(), o);
                                    pending.j(g, i4, o);
                                } else {
                                    list = f;
                                }
                            } else {
                                list = f;
                                i2++;
                            }
                            i3++;
                            i4 += pending.o(yv3Var2);
                            e = set;
                            f = list;
                        } else {
                            e = set;
                        }
                    }
                } else {
                    this.O.M(pending.g(yv3Var) + pending.e(), yv3Var.c());
                    pending.n(yv3Var.b(), 0);
                    this.O.v(yv3Var.b());
                    this.I.N(yv3Var.b());
                    V0();
                    this.I.P();
                    set = e;
                    androidx.compose.runtime.b.P(this.t, yv3Var.b(), yv3Var.b() + this.I.B(yv3Var.b()));
                }
                i2++;
                e = set;
            }
            this.O.h();
            if (b2.size() > 0) {
                this.O.v(this.I.m());
                this.I.Q();
            }
        }
        int i5 = this.k;
        while (!this.I.E()) {
            int k = this.I.k();
            V0();
            this.O.M(i5, this.I.P());
            androidx.compose.runtime.b.P(this.t, k, this.I.k());
        }
        boolean f2 = f();
        if (f2) {
            if (z) {
                this.Q.c();
                i = 1;
            }
            this.I.f();
            int c02 = this.K.c0();
            this.K.T();
            if (!this.I.r()) {
                int J0 = J0(c02);
                this.K.U();
                this.K.L();
                W0(this.P);
                this.R = false;
                if (!this.d.isEmpty()) {
                    s1(J0, 0);
                    t1(J0, i);
                }
            }
        } else {
            if (z) {
                this.O.x();
            }
            this.O.f();
            int s2 = this.I.s();
            if (i != x1(s2)) {
                t1(s2, i);
            }
            if (z) {
                i = 1;
            }
            this.I.g();
            this.O.h();
        }
        y0(i, f2);
    }

    private final void s1(int i, int i2) {
        if (x1(i) != i2) {
            if (i < 0) {
                zx4 zx4Var = this.p;
                if (zx4Var == null) {
                    zx4Var = new zx4(0, 1, null);
                    this.p = zx4Var;
                }
                zx4Var.n(i, i2);
                return;
            }
            int[] iArr = this.o;
            if (iArr == null) {
                iArr = new int[this.I.u()];
                kotlin.collections.d.u(iArr, -1, 0, 0, 6, null);
                this.o = iArr;
            }
            iArr[i] = i2;
        }
    }

    private final void t0() {
        s0(false);
    }

    private final void t1(int i, int i2) {
        int x1 = x1(i);
        if (x1 != i2) {
            int i3 = i2 - x1;
            int b2 = this.i.b() - 1;
            while (i != -1) {
                int x12 = x1(i) + i3;
                s1(i, x12);
                int i4 = b2;
                while (true) {
                    if (-1 < i4) {
                        Pending pending = (Pending) this.i.f(i4);
                        if (pending != null && pending.n(i, x12)) {
                            b2 = i4 - 1;
                            break;
                        }
                        i4--;
                    } else {
                        break;
                    }
                }
                if (i < 0) {
                    i = this.I.s();
                } else if (this.I.G(i)) {
                    return;
                } else {
                    i = this.I.M(i);
                }
            }
        }
    }

    private final kr5 u1(kr5 kr5Var, kr5 kr5Var2) {
        kr5.a o = kr5Var.o();
        o.putAll(kr5Var2);
        kr5 build = o.build();
        i1(204, androidx.compose.runtime.b.D());
        v1(build);
        v1(kr5Var2);
        t0();
        return build;
    }

    private final void v0() {
        t0();
        this.c.b();
        t0();
        this.O.i();
        z0();
        this.I.d();
        this.r = false;
    }

    private final void v1(Object obj) {
        M0();
        w1(obj);
    }

    private final void w0() {
        if (this.K.Z()) {
            t z = this.J.z();
            this.K = z;
            z.V0();
            this.L = false;
            this.M = null;
        }
    }

    private final void x0(boolean z, Pending pending) {
        this.i.h(this.j);
        this.j = pending;
        this.l.i(this.k);
        if (z) {
            this.k = 0;
        }
        this.n.i(this.m);
        this.m = 0;
    }

    private final int x1(int i) {
        int i2;
        if (i >= 0) {
            int[] iArr = this.o;
            return (iArr == null || (i2 = iArr[i]) < 0) ? this.I.K(i) : i2;
        }
        zx4 zx4Var = this.p;
        if (zx4Var == null || !zx4Var.a(i)) {
            return 0;
        }
        return zx4Var.c(i);
    }

    private final void y0(int i, boolean z) {
        Pending pending = (Pending) this.i.g();
        if (pending != null && !z) {
            pending.l(pending.a() + 1);
        }
        this.j = pending;
        this.k = this.l.h() + i;
        this.m = this.n.h() + i;
    }

    private final void y1() {
        if (this.s) {
            this.s = false;
        } else {
            androidx.compose.runtime.b.t("A call to createNode(), emitNode() or useNode() expected was not expected");
            throw new KotlinNothingValueException();
        }
    }

    private final void z0() {
        this.O.l();
        if (this.i.c()) {
            h0();
        } else {
            androidx.compose.runtime.b.t("Start/end imbalance");
            throw new KotlinNothingValueException();
        }
    }

    private final void z1() {
        if (this.s) {
            androidx.compose.runtime.b.t("A call to createNode(), emitNode() or useNode() expected");
            throw new KotlinNothingValueException();
        }
    }

    @Override // androidx.compose.runtime.Composer
    public Object A() {
        return N0();
    }

    public final boolean A0() {
        return this.B > 0;
    }

    @Override // androidx.compose.runtime.Composer
    public ys0 B() {
        return this.d;
    }

    public fy0 B0() {
        return this.h;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean C(Object obj) {
        if (M0() == obj) {
            return false;
        }
        w1(obj);
        return true;
    }

    public final RecomposeScopeImpl C0() {
        e08 e08Var = this.F;
        if (this.B == 0 && e08Var.d()) {
            return (RecomposeScopeImpl) e08Var.e();
        }
        return null;
    }

    @Override // androidx.compose.runtime.Composer
    public void D(qs2 qs2Var) {
        y1();
        if (!f()) {
            androidx.compose.runtime.b.t("createNode() can only be called when inserting");
            throw new KotlinNothingValueException();
        }
        int e = this.l.e();
        t tVar = this.K;
        hd F = tVar.F(tVar.c0());
        this.m++;
        this.Q.b(qs2Var, e, F);
    }

    public final ej0 D0() {
        return this.N;
    }

    @Override // androidx.compose.runtime.Composer
    public void E() {
        g1(-127, null, i.a.a(), null);
    }

    @Override // androidx.compose.runtime.Composer
    public void F(int i, Object obj) {
        g1(i, obj, i.a.a(), null);
    }

    public final q F0() {
        return this.I;
    }

    @Override // androidx.compose.runtime.Composer
    public void G() {
        g1(125, null, i.a.c(), null);
        this.s = true;
    }

    @Override // androidx.compose.runtime.Composer
    public void H() {
        this.z = false;
    }

    @Override // androidx.compose.runtime.Composer
    public void I(ft6 ft6Var) {
        RecomposeScopeImpl recomposeScopeImpl = ft6Var instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) ft6Var : null;
        if (recomposeScopeImpl == null) {
            return;
        }
        recomposeScopeImpl.H(true);
    }

    public void I0(List list) {
        try {
            H0(list);
            h0();
        } catch (Throwable th) {
            U();
            throw th;
        }
    }

    @Override // androidx.compose.runtime.Composer
    public void J(int i, Object obj) {
        if (!f() && this.I.n() == i && !zq3.c(this.I.l(), obj) && this.A < 0) {
            this.A = this.I.k();
            this.z = true;
        }
        g1(i, null, i.a.a(), obj);
    }

    @Override // androidx.compose.runtime.Composer
    public void K() {
        if (!(this.m == 0)) {
            androidx.compose.runtime.b.t("No nodes can be emitted before calling skipAndEndGroup");
            throw new KotlinNothingValueException();
        }
        RecomposeScopeImpl C0 = C0();
        if (C0 != null) {
            C0.z();
        }
        if (this.t.isEmpty()) {
            f1();
        } else {
            U0();
        }
    }

    @Override // androidx.compose.runtime.Composer
    public void L(qs2 qs2Var) {
        this.O.R(qs2Var);
    }

    public final boolean L0() {
        return this.G;
    }

    @Override // androidx.compose.runtime.Composer
    public void M() {
        boolean p;
        t0();
        t0();
        p = androidx.compose.runtime.b.p(this.y.h());
        this.x = p;
        this.M = null;
    }

    public final Object M0() {
        if (f()) {
            z1();
            return Composer.a.a();
        }
        Object H = this.I.H();
        return (!this.z || (H instanceof j17)) ? H : Composer.a.a();
    }

    @Override // androidx.compose.runtime.Composer
    public boolean N() {
        if (!i() || this.x) {
            return true;
        }
        RecomposeScopeImpl C0 = C0();
        return C0 != null && C0.m();
    }

    public final Object N0() {
        if (f()) {
            z1();
            return Composer.a.a();
        }
        Object H = this.I.H();
        return (!this.z || (H instanceof j17)) ? H instanceof pv6 ? ((pv6) H).a() : H : Composer.a.a();
    }

    @Override // androidx.compose.runtime.Composer
    public int O() {
        return this.S;
    }

    @Override // androidx.compose.runtime.Composer
    public androidx.compose.runtime.c P() {
        i1(206, androidx.compose.runtime.b.E());
        if (f()) {
            t.t0(this.K, 0, 1, null);
        }
        Object M0 = M0();
        a aVar = M0 instanceof a ? (a) M0 : null;
        if (aVar == null) {
            int O = O();
            boolean z = this.q;
            boolean z2 = this.D;
            fy0 B0 = B0();
            d dVar = B0 instanceof d ? (d) B0 : null;
            aVar = new a(new b(O, z, z2, dVar != null ? dVar.F() : null));
            w1(aVar);
        }
        aVar.a().v(m0());
        t0();
        return aVar.a();
    }

    @Override // androidx.compose.runtime.Composer
    public void Q() {
        t0();
    }

    public final void Q0(qs2 qs2Var) {
        if (this.G) {
            androidx.compose.runtime.b.t("Preparing a composition while composing is not supported");
            throw new KotlinNothingValueException();
        }
        this.G = true;
        try {
            qs2Var.mo865invoke();
        } finally {
            this.G = false;
        }
    }

    @Override // androidx.compose.runtime.Composer
    public void R() {
        t0();
    }

    public final boolean R0(ff3 ff3Var) {
        if (!this.f.c()) {
            androidx.compose.runtime.b.t("Expected applyChanges() to have been called");
            throw new KotlinNothingValueException();
        }
        if (!ff3Var.i() && this.t.isEmpty() && !this.r) {
            return false;
        }
        q0(ff3Var, null);
        return this.f.d();
    }

    @Override // androidx.compose.runtime.Composer
    public boolean S(Object obj) {
        if (zq3.c(M0(), obj)) {
            return false;
        }
        w1(obj);
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    public void T(o76 o76Var) {
        x08 x08Var;
        kr5 e;
        int q;
        kr5 m0 = m0();
        i1(201, androidx.compose.runtime.b.C());
        Object A = A();
        if (zq3.c(A, Composer.a.a())) {
            x08Var = null;
        } else {
            zq3.f(A, "null cannot be cast to non-null type androidx.compose.runtime.State<kotlin.Any?>");
            x08Var = (x08) A;
        }
        bt0 b2 = o76Var.b();
        zq3.f(b2, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        x08 b3 = b2.b(o76Var.c(), x08Var);
        boolean c2 = zq3.c(b3, x08Var);
        if (!c2) {
            q(b3);
        }
        boolean z = true;
        boolean z2 = false;
        if (f()) {
            e = m0.e(b2, b3);
            this.L = true;
        } else {
            q qVar = this.I;
            Object w = qVar.w(qVar.k());
            zq3.f(w, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            kr5 kr5Var = (kr5) w;
            e = (!(i() && c2) && (o76Var.a() || !ft0.a(m0, b2))) ? m0.e(b2, b3) : kr5Var;
            if (!this.z && kr5Var == e) {
                z = false;
            }
            z2 = z;
        }
        if (z2 && !f()) {
            X0(e);
        }
        kn3 kn3Var = this.y;
        q = androidx.compose.runtime.b.q(this.x);
        kn3Var.i(q);
        this.x = z2;
        this.M = e;
        g1(202, androidx.compose.runtime.b.z(), i.a.a(), e);
    }

    @Override // androidx.compose.runtime.Composer
    public boolean a(boolean z) {
        Object M0 = M0();
        if ((M0 instanceof Boolean) && z == ((Boolean) M0).booleanValue()) {
            return false;
        }
        w1(Boolean.valueOf(z));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean b(float f) {
        Object M0 = M0();
        if ((M0 instanceof Float) && f == ((Number) M0).floatValue()) {
            return false;
        }
        w1(Float.valueOf(f));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    public void c() {
        this.z = this.A >= 0;
    }

    public final void c1(q qVar) {
        this.I = qVar;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean d(int i) {
        Object M0 = M0();
        if ((M0 instanceof Integer) && i == ((Number) M0).intValue()) {
            return false;
        }
        w1(Integer.valueOf(i));
        return true;
    }

    public void d1() {
        if (this.t.isEmpty()) {
            e1();
            return;
        }
        q qVar = this.I;
        int n = qVar.n();
        Object o = qVar.o();
        Object l = qVar.l();
        o1(n, o, l);
        j1(qVar.F(), null);
        U0();
        qVar.g();
        q1(n, o, l);
    }

    @Override // androidx.compose.runtime.Composer
    public boolean e(long j) {
        Object M0 = M0();
        if ((M0 instanceof Long) && j == ((Number) M0).longValue()) {
            return false;
        }
        w1(Long.valueOf(j));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean f() {
        return this.R;
    }

    @Override // androidx.compose.runtime.Composer
    public void g(boolean z) {
        if (!(this.m == 0)) {
            androidx.compose.runtime.b.t("No nodes can be emitted before calling dactivateToEndGroup");
            throw new KotlinNothingValueException();
        }
        if (f()) {
            return;
        }
        if (!z) {
            f1();
            return;
        }
        int k = this.I.k();
        int j = this.I.j();
        this.O.c();
        androidx.compose.runtime.b.P(this.t, k, j);
        this.I.Q();
    }

    public final void g0() {
        this.w = null;
    }

    @Override // androidx.compose.runtime.Composer
    public Composer h(int i) {
        g1(i, null, i.a.a(), null);
        f0();
        return this;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean i() {
        RecomposeScopeImpl C0;
        return (f() || this.z || this.x || (C0 = C0()) == null || C0.o() || this.r) ? false : true;
    }

    @Override // androidx.compose.runtime.Composer
    public ln j() {
        return this.b;
    }

    public final void j0(ff3 ff3Var, gt2 gt2Var) {
        if (this.f.c()) {
            q0(ff3Var, gt2Var);
        } else {
            androidx.compose.runtime.b.t("Expected applyChanges() to have been called");
            throw new KotlinNothingValueException();
        }
    }

    @Override // androidx.compose.runtime.Composer
    public cc7 k() {
        hd a2;
        ss2 i;
        RecomposeScopeImpl recomposeScopeImpl = null;
        RecomposeScopeImpl recomposeScopeImpl2 = this.F.d() ? (RecomposeScopeImpl) this.F.g() : null;
        if (recomposeScopeImpl2 != null) {
            recomposeScopeImpl2.E(false);
        }
        if (recomposeScopeImpl2 != null && (i = recomposeScopeImpl2.i(this.C)) != null) {
            this.O.e(i, B0());
        }
        if (recomposeScopeImpl2 != null && !recomposeScopeImpl2.q() && (recomposeScopeImpl2.r() || this.q)) {
            if (recomposeScopeImpl2.j() == null) {
                if (f()) {
                    t tVar = this.K;
                    a2 = tVar.F(tVar.c0());
                } else {
                    q qVar = this.I;
                    a2 = qVar.a(qVar.s());
                }
                recomposeScopeImpl2.A(a2);
            }
            recomposeScopeImpl2.C(false);
            recomposeScopeImpl = recomposeScopeImpl2;
        }
        s0(false);
        return recomposeScopeImpl;
    }

    public final void k1() {
        this.A = 100;
        this.z = true;
    }

    @Override // androidx.compose.runtime.Composer
    public void l() {
        g1(125, null, i.a.b(), null);
        this.s = true;
    }

    @Override // androidx.compose.runtime.Composer
    public Object m(bt0 bt0Var) {
        return ft0.c(m0(), bt0Var);
    }

    public final boolean m1(RecomposeScopeImpl recomposeScopeImpl, Object obj) {
        hd j = recomposeScopeImpl.j();
        if (j == null) {
            return false;
        }
        int d = j.d(this.I.v());
        if (!this.G || d < this.I.k()) {
            return false;
        }
        androidx.compose.runtime.b.F(this.t, d, recomposeScopeImpl, obj);
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    public CoroutineContext n() {
        return this.c.g();
    }

    public final void n1(Object obj) {
        if (obj instanceof ov6) {
            if (f()) {
                this.O.K((ov6) obj);
            }
            this.e.add(obj);
            obj = new pv6((ov6) obj);
        }
        w1(obj);
    }

    @Override // androidx.compose.runtime.Composer
    public et0 o() {
        return m0();
    }

    public final void o0() {
        this.F.a();
        this.t.clear();
        this.f.a();
        this.w = null;
    }

    @Override // androidx.compose.runtime.Composer
    public void p() {
        y1();
        if (f()) {
            androidx.compose.runtime.b.t("useNode() called while inserting");
            throw new KotlinNothingValueException();
        }
        Object E0 = E0(this.I);
        this.O.t(E0);
        if (this.z && (E0 instanceof es0)) {
            this.O.W(E0);
        }
    }

    public final void p0() {
        to8 to8Var = to8.a;
        Object a2 = to8Var.a("Compose:Composer.dispose");
        try {
            this.c.p(this);
            o0();
            j().clear();
            this.H = true;
            ww8 ww8Var = ww8.a;
            to8Var.b(a2);
        } catch (Throwable th) {
            to8.a.b(a2);
            throw th;
        }
    }

    @Override // androidx.compose.runtime.Composer
    public void q(Object obj) {
        n1(obj);
    }

    @Override // androidx.compose.runtime.Composer
    public void r() {
        boolean p;
        t0();
        t0();
        p = androidx.compose.runtime.b.p(this.y.h());
        this.x = p;
        this.M = null;
    }

    @Override // androidx.compose.runtime.Composer
    public void s(o76[] o76VarArr) {
        kr5 u1;
        int q;
        kr5 m0 = m0();
        i1(201, androidx.compose.runtime.b.C());
        boolean z = true;
        boolean z2 = false;
        if (f()) {
            u1 = u1(m0, ft0.e(o76VarArr, m0, null, 4, null));
            this.L = true;
        } else {
            Object x = this.I.x(0);
            zq3.f(x, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            kr5 kr5Var = (kr5) x;
            Object x2 = this.I.x(1);
            zq3.f(x2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            kr5 kr5Var2 = (kr5) x2;
            kr5 d = ft0.d(o76VarArr, m0, kr5Var2);
            if (i() && !this.z && zq3.c(kr5Var2, d)) {
                e1();
                u1 = kr5Var;
            } else {
                u1 = u1(m0, d);
                if (!this.z && zq3.c(u1, kr5Var)) {
                    z = false;
                }
                z2 = z;
            }
        }
        if (z2 && !f()) {
            X0(u1);
        }
        kn3 kn3Var = this.y;
        q = androidx.compose.runtime.b.q(this.x);
        kn3Var.i(q);
        this.x = z2;
        this.M = u1;
        g1(202, androidx.compose.runtime.b.z(), i.a.a(), u1);
    }

    @Override // androidx.compose.runtime.Composer
    public void t() {
        s0(true);
    }

    @Override // androidx.compose.runtime.Composer
    public void u() {
        t0();
        RecomposeScopeImpl C0 = C0();
        if (C0 == null || !C0.r()) {
            return;
        }
        C0.B(true);
    }

    public final void u0() {
        if (this.G || this.A != 100) {
            throw new IllegalArgumentException("Cannot disable reuse from root if it was caused by other groups");
        }
        this.A = -1;
        this.z = false;
    }

    @Override // androidx.compose.runtime.Composer
    public void v(Object obj, gt2 gt2Var) {
        if (f()) {
            this.Q.f(obj, gt2Var);
        } else {
            this.O.U(obj, gt2Var);
        }
    }

    @Override // androidx.compose.runtime.Composer
    public void w() {
        this.q = true;
        this.D = true;
    }

    public final void w1(Object obj) {
        if (f()) {
            this.K.g1(obj);
        } else {
            this.O.V(obj, this.I.q() - 1);
        }
    }

    @Override // androidx.compose.runtime.Composer
    public ft6 x() {
        return C0();
    }

    @Override // androidx.compose.runtime.Composer
    public void y() {
        if (this.z && this.I.s() == this.A) {
            this.A = -1;
            this.z = false;
        }
        s0(false);
    }

    @Override // androidx.compose.runtime.Composer
    public void z(int i) {
        g1(i, null, i.a.a(), null);
    }
}
