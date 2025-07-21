package androidx.compose.foundation.pager;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier;
import androidx.compose.foundation.lazy.layout.f;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.runtime.b0;
import androidx.compose.runtime.snapshots.e;
import androidx.compose.runtime.y;
import defpackage.an3;
import defpackage.by0;
import defpackage.ci;
import defpackage.cy4;
import defpackage.dg4;
import defpackage.di;
import defpackage.dy4;
import defpackage.fd5;
import defpackage.fm1;
import defpackage.fn5;
import defpackage.fo3;
import defpackage.gt2;
import defpackage.i04;
import defpackage.iv0;
import defpackage.k04;
import defpackage.kv6;
import defpackage.ln5;
import defpackage.lv6;
import defpackage.nn5;
import defpackage.on5;
import defpackage.ow7;
import defpackage.qc7;
import defpackage.qs2;
import defpackage.sn5;
import defpackage.ss2;
import defpackage.sy4;
import defpackage.t26;
import defpackage.tc5;
import defpackage.tc7;
import defpackage.u04;
import defpackage.ug4;
import defpackage.uo6;
import defpackage.ww8;
import defpackage.x08;
import defpackage.yx4;
import kotlin.collections.i;

/* loaded from: classes.dex */
public abstract class PagerState implements tc7 {
    private final sy4 A;
    private final lv6 B;
    private long C;
    private final f D;
    private final sy4 E;
    private final sy4 F;
    private final sy4 G;
    private final sy4 a;
    private final yx4 b;
    private final i04 c;
    private final sy4 d;
    private final sn5 e;
    private int f;
    private int g;
    private int h;
    private float i;
    private float j;
    private final tc7 k;
    private int l;
    private boolean m;
    private int n;
    private u04.a o;
    private boolean p;
    private sy4 q;
    private fm1 r;
    private final dy4 s;
    private final cy4 t;
    private final cy4 u;
    private final x08 v;
    private final x08 w;
    private final u04 x;
    private final k04 y;
    private final AwaitFirstLayoutModifier z;

    public static final class a implements lv6 {
        a() {
        }

        @Override // defpackage.lv6
        public void g(kv6 kv6Var) {
            PagerState.this.h0(kv6Var);
        }
    }

    public PagerState(int i, float f) {
        PagerStateKt.b bVar;
        double d = f;
        if (-0.5d > d || d > 0.5d) {
            throw new IllegalArgumentException(("initialPageOffsetFraction " + f + " is not within the range -0.5 to 0.5").toString());
        }
        this.a = b0.e(fd5.d(fd5.b.c()), null, 2, null);
        this.b = t26.a(0.0f);
        this.c = nn5.a(this);
        Boolean bool = Boolean.FALSE;
        this.d = b0.e(bool, null, 2, null);
        sn5 sn5Var = new sn5(i, f, this);
        this.e = sn5Var;
        this.f = i;
        this.h = Integer.MAX_VALUE;
        this.k = ScrollableStateKt.a(new ss2() { // from class: androidx.compose.foundation.pager.PagerState$scrollableState$1
            {
                super(1);
            }

            public final Float b(float f2) {
                float Y;
                Y = PagerState.this.Y(f2);
                return Float.valueOf(Y);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return b(((Number) obj).floatValue());
            }
        });
        this.m = true;
        this.n = -1;
        this.q = y.i(PagerStateKt.g(), y.k());
        bVar = PagerStateKt.c;
        this.r = bVar;
        this.s = fo3.a();
        this.t = ow7.a(-1);
        this.u = ow7.a(i);
        this.v = y.e(y.q(), new qs2() { // from class: androidx.compose.foundation.pager.PagerState$settledPage$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Integer mo865invoke() {
                return Integer.valueOf(PagerState.this.c() ? PagerState.this.Q() : PagerState.this.w());
            }
        });
        this.w = y.e(y.q(), new qs2() { // from class: androidx.compose.foundation.pager.PagerState$targetPage$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Integer mo865invoke() {
                int M;
                int d2;
                boolean V;
                int t;
                if (PagerState.this.c()) {
                    M = PagerState.this.M();
                    if (M != -1) {
                        d2 = PagerState.this.M();
                    } else if (PagerState.this.R() != 0.0f) {
                        d2 = dg4.d(PagerState.this.R() / PagerState.this.G()) + PagerState.this.w();
                    } else if (Math.abs(PagerState.this.x()) >= Math.abs(PagerState.this.K())) {
                        V = PagerState.this.V();
                        d2 = V ? PagerState.this.z() + 1 : PagerState.this.z();
                    } else {
                        d2 = PagerState.this.w();
                    }
                } else {
                    d2 = PagerState.this.w();
                }
                t = PagerState.this.t(d2);
                return Integer.valueOf(t);
            }
        });
        this.x = new u04();
        this.y = new k04();
        this.z = new AwaitFirstLayoutModifier();
        this.A = b0.e(null, null, 2, null);
        this.B = new a();
        this.C = iv0.b(0, 0, 0, 0, 15, null);
        this.D = new f();
        sn5Var.e();
        this.E = tc5.c(null, 1, null);
        this.F = b0.e(bool, null, 2, null);
        this.G = b0.e(bool, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int M() {
        return this.t.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int Q() {
        return this.u.d();
    }

    private final boolean T(float f) {
        if (C().c() != Orientation.Vertical ? Math.signum(f) != Math.signum(-fd5.o(S())) : Math.signum(f) != Math.signum(-fd5.p(S()))) {
            if (!U()) {
                return false;
            }
        }
        return true;
    }

    private final boolean U() {
        return ((int) fd5.o(S())) == 0 && ((int) fd5.p(S())) == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean V() {
        return ((Boolean) this.d.getValue()).booleanValue();
    }

    private final void X(float f, ln5 ln5Var) {
        u04.a aVar;
        if (this.m && !ln5Var.i().isEmpty()) {
            boolean z = f > 0.0f;
            int index = z ? ((fn5) i.w0(ln5Var.i())).getIndex() + ln5Var.h() + 1 : (((fn5) i.k0(ln5Var.i())).getIndex() - ln5Var.h()) - 1;
            if (index == this.n || index < 0 || index >= E()) {
                return;
            }
            if (this.p != z && (aVar = this.o) != null) {
                aVar.cancel();
            }
            this.p = z;
            this.n = index;
            this.o = this.x.a(index, this.C);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float Y(float f) {
        float b = this.e.b();
        float f2 = b + f + this.i;
        float l = uo6.l(f2, 0.0f, this.h);
        boolean z = f2 == l;
        float f3 = l - b;
        this.j = f3;
        if (Math.abs(f3) != 0.0f) {
            i0(f3 > 0.0f);
        }
        int d = dg4.d(f3);
        on5 on5Var = (on5) this.q.getValue();
        if (on5Var.s(-d)) {
            p(on5Var, true);
            tc5.d(this.E);
        } else {
            this.e.a(d);
            kv6 N = N();
            if (N != null) {
                N.f();
            }
        }
        this.i = f3 - d;
        return !z ? f3 : f;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object Z(androidx.compose.foundation.pager.PagerState r5, androidx.compose.foundation.MutatePriority r6, defpackage.gt2 r7, defpackage.by0 r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.foundation.pager.PagerState$scroll$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.pager.PagerState$scroll$1 r0 = (androidx.compose.foundation.pager.PagerState$scroll$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.pager.PagerState$scroll$1 r0 = new androidx.compose.foundation.pager.PagerState$scroll$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4a
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r5 = r0.L$0
            androidx.compose.foundation.pager.PagerState r5 = (androidx.compose.foundation.pager.PagerState) r5
            kotlin.f.b(r8)
            goto L7b
        L30:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L38:
            java.lang.Object r5 = r0.L$2
            r7 = r5
            gt2 r7 = (defpackage.gt2) r7
            java.lang.Object r5 = r0.L$1
            r6 = r5
            androidx.compose.foundation.MutatePriority r6 = (androidx.compose.foundation.MutatePriority) r6
            java.lang.Object r5 = r0.L$0
            androidx.compose.foundation.pager.PagerState r5 = (androidx.compose.foundation.pager.PagerState) r5
            kotlin.f.b(r8)
            goto L5c
        L4a:
            kotlin.f.b(r8)
            r0.L$0 = r5
            r0.L$1 = r6
            r0.L$2 = r7
            r0.label = r4
            java.lang.Object r8 = r5.r(r0)
            if (r8 != r1) goto L5c
            return r1
        L5c:
            boolean r8 = r5.c()
            if (r8 != 0) goto L69
            int r8 = r5.w()
            r5.j0(r8)
        L69:
            tc7 r8 = r5.k
            r0.L$0 = r5
            r2 = 0
            r0.L$1 = r2
            r0.L$2 = r2
            r0.label = r3
            java.lang.Object r6 = r8.b(r6, r7, r0)
            if (r6 != r1) goto L7b
            return r1
        L7b:
            r6 = -1
            r5.g0(r6)
            ww8 r5 = defpackage.ww8.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerState.Z(androidx.compose.foundation.pager.PagerState, androidx.compose.foundation.MutatePriority, gt2, by0):java.lang.Object");
    }

    public static /* synthetic */ Object b0(PagerState pagerState, int i, float f, by0 by0Var, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scrollToPage");
        }
        if ((i2 & 2) != 0) {
            f = 0.0f;
        }
        return pagerState.a0(i, f, by0Var);
    }

    private final void c0(boolean z) {
        this.G.setValue(Boolean.valueOf(z));
    }

    private final void d0(boolean z) {
        this.F.setValue(Boolean.valueOf(z));
    }

    private final void g0(int i) {
        this.t.f(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h0(kv6 kv6Var) {
        this.A.setValue(kv6Var);
    }

    private final void i0(boolean z) {
        this.d.setValue(Boolean.valueOf(z));
    }

    private final void j0(int i) {
        this.u.f(i);
    }

    private final void n0(on5 on5Var) {
        e c = e.e.c();
        try {
            e l = c.l();
            try {
                if (Math.abs(this.j) > 0.5f && this.m && T(this.j)) {
                    X(this.j, on5Var);
                }
                ww8 ww8Var = ww8.a;
                c.s(l);
            } catch (Throwable th) {
                c.s(l);
                throw th;
            }
        } finally {
            c.d();
        }
    }

    public static /* synthetic */ Object o(PagerState pagerState, int i, float f, ci ciVar, by0 by0Var, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateScrollToPage");
        }
        if ((i2 & 2) != 0) {
            f = 0.0f;
        }
        if ((i2 & 4) != 0) {
            ciVar = di.i(0.0f, 0.0f, null, 7, null);
        }
        return pagerState.n(i, f, ciVar, by0Var);
    }

    public static /* synthetic */ void q(PagerState pagerState, on5 on5Var, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: applyMeasureResult");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        pagerState.p(on5Var, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object r(by0 by0Var) {
        Object l = this.z.l(by0Var);
        return l == kotlin.coroutines.intrinsics.a.h() ? l : ww8.a;
    }

    private final void s(ln5 ln5Var) {
        if (this.n == -1 || ln5Var.i().isEmpty()) {
            return;
        }
        if (this.n != (this.p ? ((fn5) i.w0(ln5Var.i())).getIndex() + ln5Var.h() + 1 : (((fn5) i.k0(ln5Var.i())).getIndex() - ln5Var.h()) - 1)) {
            this.n = -1;
            u04.a aVar = this.o;
            if (aVar != null) {
                aVar.cancel();
            }
            this.o = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int t(int i) {
        if (E() > 0) {
            return uo6.m(i, 0, E() - 1);
        }
        return 0;
    }

    public final int A() {
        return this.g;
    }

    public final dy4 B() {
        return this.s;
    }

    public final ln5 C() {
        return (ln5) this.q.getValue();
    }

    public final an3 D() {
        return (an3) this.e.e().getValue();
    }

    public abstract int E();

    public final int F() {
        return ((on5) this.q.getValue()).g();
    }

    public final int G() {
        return F() + H();
    }

    public final int H() {
        return ((on5) this.q.getValue()).j();
    }

    public final f I() {
        return this.D;
    }

    public final sy4 J() {
        return this.E;
    }

    public final float K() {
        return Math.min(this.r.f1(PagerStateKt.f()), F() / 2.0f) / F();
    }

    public final u04 L() {
        return this.x;
    }

    public final kv6 N() {
        return (kv6) this.A.getValue();
    }

    public final lv6 O() {
        return this.B;
    }

    public final int P() {
        return ((Number) this.v.getValue()).intValue();
    }

    public final float R() {
        return this.b.a();
    }

    public final long S() {
        return ((fd5) this.a.getValue()).x();
    }

    public final int W(PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, int i) {
        return this.e.f(pagerLazyLayoutItemProvider, i);
    }

    @Override // defpackage.tc7
    public final boolean a() {
        return ((Boolean) this.F.getValue()).booleanValue();
    }

    public final Object a0(int i, float f, by0 by0Var) {
        Object e = tc7.e(this, null, new PagerState$scrollToPage$2(this, f, i, null), by0Var, 1, null);
        return e == kotlin.coroutines.intrinsics.a.h() ? e : ww8.a;
    }

    @Override // defpackage.tc7
    public Object b(MutatePriority mutatePriority, gt2 gt2Var, by0 by0Var) {
        return Z(this, mutatePriority, gt2Var, by0Var);
    }

    @Override // defpackage.tc7
    public boolean c() {
        return this.k.c();
    }

    @Override // defpackage.tc7
    public final boolean d() {
        return ((Boolean) this.G.getValue()).booleanValue();
    }

    public final void e0(fm1 fm1Var) {
        this.r = fm1Var;
    }

    @Override // defpackage.tc7
    public float f(float f) {
        return this.k.f(f);
    }

    public final void f0(long j) {
        this.C = j;
    }

    public final void k0(float f) {
        this.b.r(f);
    }

    public final void l0(long j) {
        this.a.setValue(fd5.d(j));
    }

    public final void m0(int i, float f) {
        this.e.g(i, f);
        kv6 N = N();
        if (N != null) {
            N.f();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(int r12, float r13, defpackage.ci r14, defpackage.by0 r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof androidx.compose.foundation.pager.PagerState$animateScrollToPage$1
            if (r0 == 0) goto L13
            r0 = r15
            androidx.compose.foundation.pager.PagerState$animateScrollToPage$1 r0 = (androidx.compose.foundation.pager.PagerState$animateScrollToPage$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.pager.PagerState$animateScrollToPage$1 r0 = new androidx.compose.foundation.pager.PagerState$animateScrollToPage$1
            r0.<init>(r11, r15)
        L18:
            java.lang.Object r15 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L48
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.f.b(r15)
            goto La7
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L35:
            float r13 = r0.F$0
            int r12 = r0.I$0
            java.lang.Object r11 = r0.L$1
            r14 = r11
            ci r14 = (defpackage.ci) r14
            java.lang.Object r11 = r0.L$0
            androidx.compose.foundation.pager.PagerState r11 = (androidx.compose.foundation.pager.PagerState) r11
            kotlin.f.b(r15)
        L45:
            r5 = r11
            r9 = r14
            goto L74
        L48:
            kotlin.f.b(r15)
            int r15 = r11.w()
            if (r12 != r15) goto L5a
            float r15 = r11.x()
            int r15 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r15 != 0) goto L5a
            goto L60
        L5a:
            int r15 = r11.E()
            if (r15 != 0) goto L63
        L60:
            ww8 r11 = defpackage.ww8.a
            return r11
        L63:
            r0.L$0 = r11
            r0.L$1 = r14
            r0.I$0 = r12
            r0.F$0 = r13
            r0.label = r4
            java.lang.Object r15 = r11.r(r0)
            if (r15 != r1) goto L45
            return r1
        L74:
            double r14 = (double) r13
            r6 = -4620693217682128896(0xbfe0000000000000, double:-0.5)
            int r11 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r11 > 0) goto Laa
            r6 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r11 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r11 > 0) goto Laa
            int r6 = r5.t(r12)
            int r11 = r5.G()
            float r11 = (float) r11
            float r13 = r13 * r11
            int r8 = defpackage.dg4.d(r13)
            i04 r11 = r5.c
            androidx.compose.foundation.pager.PagerState$animateScrollToPage$3$1 r12 = new androidx.compose.foundation.pager.PagerState$animateScrollToPage$3$1
            r10 = 0
            r4 = r12
            r7 = r11
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r13 = 0
            r0.L$0 = r13
            r0.L$1 = r13
            r0.label = r3
            java.lang.Object r11 = r11.h(r12, r0)
            if (r11 != r1) goto La7
            return r1
        La7:
            ww8 r11 = defpackage.ww8.a
            return r11
        Laa:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "pageOffsetFraction "
            r11.append(r12)
            r11.append(r13)
            java.lang.String r12 = " is not within the range -0.5 to 0.5"
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r11 = r11.toString()
            r12.<init>(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerState.n(int, float, ci, by0):java.lang.Object");
    }

    public final void o0(qc7 qc7Var, int i) {
        g0(t(i));
    }

    public final void p(on5 on5Var, boolean z) {
        int e;
        if (z) {
            this.e.k(on5Var.n());
        } else {
            this.e.l(on5Var);
            s(on5Var);
        }
        this.q.setValue(on5Var);
        d0(on5Var.l());
        c0(on5Var.k());
        this.l++;
        ug4 o = on5Var.o();
        if (o != null) {
            this.f = o.getIndex();
        }
        this.g = on5Var.p();
        n0(on5Var);
        e = PagerStateKt.e(on5Var, E());
        this.h = e;
    }

    public final AwaitFirstLayoutModifier u() {
        return this.z;
    }

    public final k04 v() {
        return this.y;
    }

    public final int w() {
        return this.e.c();
    }

    public final float x() {
        return this.e.d();
    }

    public final fm1 y() {
        return this.r;
    }

    public final int z() {
        return this.f;
    }
}
