package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.l;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.fj0;
import defpackage.hn3;
import defpackage.in3;
import defpackage.iv0;
import defpackage.n23;
import defpackage.ph2;
import defpackage.qg4;
import defpackage.qu7;
import defpackage.qz7;
import defpackage.rz3;
import defpackage.sg4;
import defpackage.ss2;
import defpackage.vm3;
import defpackage.wm3;
import defpackage.ww8;
import defpackage.x08;
import defpackage.zq3;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
final class EnterExitTransitionModifierNode extends rz3 {
    private Alignment L;
    private Transition n;
    private Transition.a r;
    private Transition.a s;
    private Transition.a t;
    private c u;
    private e w;
    private n23 x;
    private boolean y;
    private long B = b.c();
    private long H = iv0.b(0, 0, 0, 0, 15, null);
    private final ss2 M = new ss2() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$sizeTransitionSpec$1
        {
            super(1);
        }

        @Override // defpackage.ss2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ph2 invoke(Transition.b bVar) {
            qz7 qz7Var;
            EnterExitState enterExitState = EnterExitState.PreEnter;
            EnterExitState enterExitState2 = EnterExitState.Visible;
            ph2 ph2Var = null;
            if (bVar.f(enterExitState, enterExitState2)) {
                fj0 a2 = EnterExitTransitionModifierNode.this.f2().b().a();
                if (a2 != null) {
                    ph2Var = a2.b();
                }
            } else if (bVar.f(enterExitState2, EnterExitState.PostExit)) {
                fj0 a3 = EnterExitTransitionModifierNode.this.g2().b().a();
                if (a3 != null) {
                    ph2Var = a3.b();
                }
            } else {
                ph2Var = EnterExitTransitionKt.d;
            }
            if (ph2Var != null) {
                return ph2Var;
            }
            qz7Var = EnterExitTransitionKt.d;
            return qz7Var;
        }
    };
    private final ss2 N = new ss2() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$slideSpec$1
        {
            super(1);
        }

        @Override // defpackage.ss2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ph2 invoke(Transition.b bVar) {
            qz7 qz7Var;
            qz7 qz7Var2;
            ph2 a2;
            qz7 qz7Var3;
            ph2 a3;
            EnterExitState enterExitState = EnterExitState.PreEnter;
            EnterExitState enterExitState2 = EnterExitState.Visible;
            if (bVar.f(enterExitState, enterExitState2)) {
                qu7 f = EnterExitTransitionModifierNode.this.f2().b().f();
                if (f != null && (a3 = f.a()) != null) {
                    return a3;
                }
                qz7Var3 = EnterExitTransitionKt.c;
                return qz7Var3;
            }
            if (!bVar.f(enterExitState2, EnterExitState.PostExit)) {
                qz7Var = EnterExitTransitionKt.c;
                return qz7Var;
            }
            qu7 f2 = EnterExitTransitionModifierNode.this.g2().b().f();
            if (f2 != null && (a2 = f2.a()) != null) {
                return a2;
            }
            qz7Var2 = EnterExitTransitionKt.c;
            return qz7Var2;
        }
    };

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnterExitState.values().length];
            try {
                iArr[EnterExitState.Visible.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnterExitState.PreEnter.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnterExitState.PostExit.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public EnterExitTransitionModifierNode(Transition transition, Transition.a aVar, Transition.a aVar2, Transition.a aVar3, c cVar, e eVar, n23 n23Var) {
        this.n = transition;
        this.r = aVar;
        this.s = aVar2;
        this.t = aVar3;
        this.u = cVar;
        this.w = eVar;
        this.x = n23Var;
    }

    private final void k2(long j) {
        this.y = true;
        this.H = j;
    }

    @Override // androidx.compose.ui.Modifier.c
    public void O1() {
        super.O1();
        this.y = false;
        this.B = b.c();
    }

    @Override // androidx.compose.ui.node.c
    public sg4 d(androidx.compose.ui.layout.f fVar, qg4 qg4Var, long j) {
        x08 a2;
        x08 a3;
        if (this.n.h() == this.n.n()) {
            this.L = null;
        } else if (this.L == null) {
            Alignment e2 = e2();
            if (e2 == null) {
                e2 = Alignment.a.o();
            }
            this.L = e2;
        }
        if (fVar.Z()) {
            final l W = qg4Var.W(j);
            long a4 = in3.a(W.F0(), W.v0());
            this.B = a4;
            k2(j);
            return androidx.compose.ui.layout.f.J(fVar, hn3.g(a4), hn3.f(a4), null, new ss2() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$1
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
            }, 4, null);
        }
        final ss2 init = this.x.init();
        final l W2 = qg4Var.W(j);
        long a5 = in3.a(W2.F0(), W2.v0());
        final long j2 = b.d(this.B) ? this.B : a5;
        Transition.a aVar = this.r;
        x08 a6 = aVar != null ? aVar.a(this.M, new ss2() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$animSize$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final long b(EnterExitState enterExitState) {
                return EnterExitTransitionModifierNode.this.p2(enterExitState, j2);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return hn3.b(b((EnterExitState) obj));
            }
        }) : null;
        if (a6 != null) {
            a5 = ((hn3) a6.getValue()).j();
        }
        long d = iv0.d(j, a5);
        Transition.a aVar2 = this.s;
        final long a7 = (aVar2 == null || (a3 = aVar2.a(new ss2() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$offsetDelta$1
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ph2 invoke(Transition.b bVar) {
                qz7 qz7Var;
                qz7Var = EnterExitTransitionKt.c;
                return qz7Var;
            }
        }, new ss2() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$offsetDelta$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final long b(EnterExitState enterExitState) {
                return EnterExitTransitionModifierNode.this.r2(enterExitState, j2);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return vm3.b(b((EnterExitState) obj));
            }
        })) == null) ? vm3.b.a() : ((vm3) a3.getValue()).n();
        Transition.a aVar3 = this.t;
        long a8 = (aVar3 == null || (a2 = aVar3.a(this.N, new ss2() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$slideOffset$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final long b(EnterExitState enterExitState) {
                return EnterExitTransitionModifierNode.this.q2(enterExitState, j2);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return vm3.b(b((EnterExitState) obj));
            }
        })) == null) ? vm3.b.a() : ((vm3) a2.getValue()).n();
        Alignment alignment = this.L;
        long a9 = alignment != null ? alignment.a(j2, d, LayoutDirection.Ltr) : vm3.b.a();
        final long a10 = wm3.a(vm3.j(a9) + vm3.j(a8), vm3.k(a9) + vm3.k(a8));
        return androidx.compose.ui.layout.f.J(fVar, hn3.g(d), hn3.f(d), null, new ss2() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(l.a aVar4) {
                aVar4.q(l.this, vm3.j(a7) + vm3.j(a10), vm3.k(a7) + vm3.k(a10), 0.0f, init);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((l.a) obj);
                return ww8.a;
            }
        }, 4, null);
    }

    public final Alignment e2() {
        Alignment a2;
        if (this.n.l().f(EnterExitState.PreEnter, EnterExitState.Visible)) {
            fj0 a3 = this.u.b().a();
            if (a3 == null || (a2 = a3.a()) == null) {
                fj0 a4 = this.w.b().a();
                if (a4 != null) {
                    return a4.a();
                }
                return null;
            }
        } else {
            fj0 a5 = this.w.b().a();
            if (a5 == null || (a2 = a5.a()) == null) {
                fj0 a6 = this.u.b().a();
                if (a6 != null) {
                    return a6.a();
                }
                return null;
            }
        }
        return a2;
    }

    public final c f2() {
        return this.u;
    }

    public final e g2() {
        return this.w;
    }

    public final void h2(c cVar) {
        this.u = cVar;
    }

    public final void i2(e eVar) {
        this.w = eVar;
    }

    public final void j2(n23 n23Var) {
        this.x = n23Var;
    }

    public final void l2(Transition.a aVar) {
        this.s = aVar;
    }

    public final void m2(Transition.a aVar) {
        this.r = aVar;
    }

    public final void n2(Transition.a aVar) {
        this.t = aVar;
    }

    public final void o2(Transition transition) {
        this.n = transition;
    }

    public final long p2(EnterExitState enterExitState, long j) {
        ss2 d;
        ss2 d2;
        int i = a.a[enterExitState.ordinal()];
        if (i == 1) {
            return j;
        }
        if (i == 2) {
            fj0 a2 = this.u.b().a();
            return (a2 == null || (d = a2.d()) == null) ? j : ((hn3) d.invoke(hn3.b(j))).j();
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        fj0 a3 = this.w.b().a();
        return (a3 == null || (d2 = a3.d()) == null) ? j : ((hn3) d2.invoke(hn3.b(j))).j();
    }

    public final long q2(EnterExitState enterExitState, long j) {
        ss2 b;
        ss2 b2;
        qu7 f = this.u.b().f();
        long a2 = (f == null || (b2 = f.b()) == null) ? vm3.b.a() : ((vm3) b2.invoke(hn3.b(j))).n();
        qu7 f2 = this.w.b().f();
        long a3 = (f2 == null || (b = f2.b()) == null) ? vm3.b.a() : ((vm3) b.invoke(hn3.b(j))).n();
        int i = a.a[enterExitState.ordinal()];
        if (i == 1) {
            return vm3.b.a();
        }
        if (i == 2) {
            return a2;
        }
        if (i == 3) {
            return a3;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final long r2(EnterExitState enterExitState, long j) {
        int i;
        if (this.L != null && e2() != null && !zq3.c(this.L, e2()) && (i = a.a[enterExitState.ordinal()]) != 1 && i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            fj0 a2 = this.w.b().a();
            if (a2 == null) {
                return vm3.b.a();
            }
            long j2 = ((hn3) a2.d().invoke(hn3.b(j))).j();
            Alignment e2 = e2();
            zq3.e(e2);
            LayoutDirection layoutDirection = LayoutDirection.Ltr;
            long a3 = e2.a(j, j2, layoutDirection);
            Alignment alignment = this.L;
            zq3.e(alignment);
            long a4 = alignment.a(j, j2, layoutDirection);
            return wm3.a(vm3.j(a3) - vm3.j(a4), vm3.k(a3) - vm3.k(a4));
        }
        return vm3.b.a();
    }
}
