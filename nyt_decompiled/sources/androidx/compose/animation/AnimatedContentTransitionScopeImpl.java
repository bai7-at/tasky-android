package androidx.compose.animation;

import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b0;
import androidx.compose.runtime.y;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.l;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.di;
import defpackage.ex0;
import defpackage.fm1;
import defpackage.hn3;
import defpackage.hu7;
import defpackage.in3;
import defpackage.ph2;
import defpackage.pl0;
import defpackage.qg4;
import defpackage.sg4;
import defpackage.ss2;
import defpackage.sy4;
import defpackage.sz3;
import defpackage.uo5;
import defpackage.vm3;
import defpackage.ww8;
import defpackage.x08;
import defpackage.zq3;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class AnimatedContentTransitionScopeImpl implements AnimatedContentTransitionScope {
    private final Transition a;
    private Alignment b;
    private LayoutDirection c;
    private final sy4 d = b0.e(hn3.b(hn3.b.a()), null, 2, null);
    private final Map e = new LinkedHashMap();
    private x08 f;

    /* JADX INFO: Access modifiers changed from: private */
    final class SizeModifier extends sz3 {
        private final Transition.a b;
        private final x08 c;

        public SizeModifier(Transition.a aVar, x08 x08Var) {
            this.b = aVar;
            this.c = x08Var;
        }

        @Override // androidx.compose.ui.layout.c
        public sg4 d(androidx.compose.ui.layout.f fVar, qg4 qg4Var, long j) {
            final l W = qg4Var.W(j);
            Transition.a aVar = this.b;
            final AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl = AnimatedContentTransitionScopeImpl.this;
            ss2 ss2Var = new ss2() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$SizeModifier$measure$size$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.ss2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final ph2 invoke(Transition.b bVar) {
                    ph2 a;
                    x08 x08Var = (x08) AnimatedContentTransitionScopeImpl.this.q().get(bVar.d());
                    long j2 = x08Var != null ? ((hn3) x08Var.getValue()).j() : hn3.b.a();
                    x08 x08Var2 = (x08) AnimatedContentTransitionScopeImpl.this.q().get(bVar.a());
                    long j3 = x08Var2 != null ? ((hn3) x08Var2.getValue()).j() : hn3.b.a();
                    hu7 hu7Var = (hu7) this.l().getValue();
                    return (hu7Var == null || (a = hu7Var.a(j2, j3)) == null) ? di.i(0.0f, 0.0f, null, 7, null) : a;
                }
            };
            final AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl2 = AnimatedContentTransitionScopeImpl.this;
            x08 a = aVar.a(ss2Var, new ss2() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$SizeModifier$measure$size$2
                {
                    super(1);
                }

                public final long b(Object obj) {
                    x08 x08Var = (x08) AnimatedContentTransitionScopeImpl.this.q().get(obj);
                    return x08Var != null ? ((hn3) x08Var.getValue()).j() : hn3.b.a();
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return hn3.b(b(obj));
                }
            });
            AnimatedContentTransitionScopeImpl.this.u(a);
            final long a2 = AnimatedContentTransitionScopeImpl.this.n().a(in3.a(W.F0(), W.v0()), ((hn3) a.getValue()).j(), LayoutDirection.Ltr);
            return androidx.compose.ui.layout.f.J(fVar, hn3.g(((hn3) a.getValue()).j()), hn3.f(((hn3) a.getValue()).j()), null, new ss2() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$SizeModifier$measure$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void b(l.a aVar2) {
                    l.a.h(aVar2, l.this, a2, 0.0f, 2, null);
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    b((l.a) obj);
                    return ww8.a;
                }
            }, 4, null);
        }

        public final x08 l() {
            return this.c;
        }
    }

    public static final class a implements uo5 {
        private boolean b;

        public a(boolean z) {
            this.b = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.b == ((a) obj).b;
        }

        public int hashCode() {
            return Boolean.hashCode(this.b);
        }

        @Override // defpackage.uo5
        public Object i(fm1 fm1Var, Object obj) {
            return this;
        }

        public final boolean l() {
            return this.b;
        }

        public final void r(boolean z) {
            this.b = z;
        }

        public String toString() {
            return "ChildData(isTarget=" + this.b + ')';
        }
    }

    public AnimatedContentTransitionScopeImpl(Transition transition, Alignment alignment, LayoutDirection layoutDirection) {
        this.a = transition;
        this.b = alignment;
        this.c = layoutDirection;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long j(long j, long j2) {
        return n().a(j, j2, LayoutDirection.Ltr);
    }

    private static final boolean l(sy4 sy4Var) {
        return ((Boolean) sy4Var.getValue()).booleanValue();
    }

    private static final void m(sy4 sy4Var, boolean z) {
        sy4Var.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long o() {
        x08 x08Var = this.f;
        return x08Var != null ? ((hn3) x08Var.getValue()).j() : p();
    }

    private final boolean s(int i) {
        AnimatedContentTransitionScope.a.C0017a c0017a = AnimatedContentTransitionScope.a.a;
        return AnimatedContentTransitionScope.a.h(i, c0017a.c()) || (AnimatedContentTransitionScope.a.h(i, c0017a.e()) && this.c == LayoutDirection.Ltr) || (AnimatedContentTransitionScope.a.h(i, c0017a.b()) && this.c == LayoutDirection.Rtl);
    }

    private final boolean t(int i) {
        AnimatedContentTransitionScope.a.C0017a c0017a = AnimatedContentTransitionScope.a.a;
        return AnimatedContentTransitionScope.a.h(i, c0017a.d()) || (AnimatedContentTransitionScope.a.h(i, c0017a.e()) && this.c == LayoutDirection.Rtl) || (AnimatedContentTransitionScope.a.h(i, c0017a.b()) && this.c == LayoutDirection.Ltr);
    }

    @Override // androidx.compose.animation.core.Transition.b
    public Object a() {
        return this.a.l().a();
    }

    @Override // androidx.compose.animation.AnimatedContentTransitionScope
    public c c(int i, ph2 ph2Var, final ss2 ss2Var) {
        if (s(i)) {
            return EnterExitTransitionKt.A(ph2Var, new ss2() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideIntoContainer$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final Integer b(int i2) {
                    long o;
                    long o2;
                    long j;
                    ss2 ss2Var2 = ss2.this;
                    o = this.o();
                    int g = hn3.g(o);
                    AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl = this;
                    long a2 = in3.a(i2, i2);
                    o2 = this.o();
                    j = animatedContentTransitionScopeImpl.j(a2, o2);
                    return (Integer) ss2Var2.invoke(Integer.valueOf(g - vm3.j(j)));
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return b(((Number) obj).intValue());
                }
            });
        }
        if (t(i)) {
            return EnterExitTransitionKt.A(ph2Var, new ss2() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideIntoContainer$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final Integer b(int i2) {
                    long o;
                    long j;
                    ss2 ss2Var2 = ss2.this;
                    AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl = this;
                    long a2 = in3.a(i2, i2);
                    o = this.o();
                    j = animatedContentTransitionScopeImpl.j(a2, o);
                    return (Integer) ss2Var2.invoke(Integer.valueOf((-vm3.j(j)) - i2));
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return b(((Number) obj).intValue());
                }
            });
        }
        AnimatedContentTransitionScope.a.C0017a c0017a = AnimatedContentTransitionScope.a.a;
        return AnimatedContentTransitionScope.a.h(i, c0017a.f()) ? EnterExitTransitionKt.C(ph2Var, new ss2() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideIntoContainer$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final Integer b(int i2) {
                long o;
                long o2;
                long j;
                ss2 ss2Var2 = ss2.this;
                o = this.o();
                int f = hn3.f(o);
                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl = this;
                long a2 = in3.a(i2, i2);
                o2 = this.o();
                j = animatedContentTransitionScopeImpl.j(a2, o2);
                return (Integer) ss2Var2.invoke(Integer.valueOf(f - vm3.k(j)));
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return b(((Number) obj).intValue());
            }
        }) : AnimatedContentTransitionScope.a.h(i, c0017a.a()) ? EnterExitTransitionKt.C(ph2Var, new ss2() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideIntoContainer$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final Integer b(int i2) {
                long o;
                long j;
                ss2 ss2Var2 = ss2.this;
                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl = this;
                long a2 = in3.a(i2, i2);
                o = this.o();
                j = animatedContentTransitionScopeImpl.j(a2, o);
                return (Integer) ss2Var2.invoke(Integer.valueOf((-vm3.k(j)) - i2));
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return b(((Number) obj).intValue());
            }
        }) : c.a.a();
    }

    @Override // androidx.compose.animation.core.Transition.b
    public Object d() {
        return this.a.l().d();
    }

    @Override // androidx.compose.animation.AnimatedContentTransitionScope
    public e g(int i, ph2 ph2Var, final ss2 ss2Var) {
        if (s(i)) {
            return EnterExitTransitionKt.F(ph2Var, new ss2() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideOutOfContainer$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final Integer b(int i2) {
                    long j;
                    x08 x08Var = (x08) AnimatedContentTransitionScopeImpl.this.q().get(AnimatedContentTransitionScopeImpl.this.r().n());
                    long j2 = x08Var != null ? ((hn3) x08Var.getValue()).j() : hn3.b.a();
                    ss2 ss2Var2 = ss2Var;
                    j = AnimatedContentTransitionScopeImpl.this.j(in3.a(i2, i2), j2);
                    return (Integer) ss2Var2.invoke(Integer.valueOf((-vm3.j(j)) - i2));
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return b(((Number) obj).intValue());
                }
            });
        }
        if (t(i)) {
            return EnterExitTransitionKt.F(ph2Var, new ss2() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideOutOfContainer$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final Integer b(int i2) {
                    long j;
                    x08 x08Var = (x08) AnimatedContentTransitionScopeImpl.this.q().get(AnimatedContentTransitionScopeImpl.this.r().n());
                    long j2 = x08Var != null ? ((hn3) x08Var.getValue()).j() : hn3.b.a();
                    ss2 ss2Var2 = ss2Var;
                    j = AnimatedContentTransitionScopeImpl.this.j(in3.a(i2, i2), j2);
                    return (Integer) ss2Var2.invoke(Integer.valueOf((-vm3.j(j)) + hn3.g(j2)));
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return b(((Number) obj).intValue());
                }
            });
        }
        AnimatedContentTransitionScope.a.C0017a c0017a = AnimatedContentTransitionScope.a.a;
        return AnimatedContentTransitionScope.a.h(i, c0017a.f()) ? EnterExitTransitionKt.G(ph2Var, new ss2() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideOutOfContainer$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final Integer b(int i2) {
                long j;
                x08 x08Var = (x08) AnimatedContentTransitionScopeImpl.this.q().get(AnimatedContentTransitionScopeImpl.this.r().n());
                long j2 = x08Var != null ? ((hn3) x08Var.getValue()).j() : hn3.b.a();
                ss2 ss2Var2 = ss2Var;
                j = AnimatedContentTransitionScopeImpl.this.j(in3.a(i2, i2), j2);
                return (Integer) ss2Var2.invoke(Integer.valueOf((-vm3.k(j)) - i2));
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return b(((Number) obj).intValue());
            }
        }) : AnimatedContentTransitionScope.a.h(i, c0017a.a()) ? EnterExitTransitionKt.G(ph2Var, new ss2() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideOutOfContainer$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final Integer b(int i2) {
                long j;
                x08 x08Var = (x08) AnimatedContentTransitionScopeImpl.this.q().get(AnimatedContentTransitionScopeImpl.this.r().n());
                long j2 = x08Var != null ? ((hn3) x08Var.getValue()).j() : hn3.b.a();
                ss2 ss2Var2 = ss2Var;
                j = AnimatedContentTransitionScopeImpl.this.j(in3.a(i2, i2), j2);
                return (Integer) ss2Var2.invoke(Integer.valueOf((-vm3.k(j)) + hn3.f(j2)));
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return b(((Number) obj).intValue());
            }
        }) : e.a.a();
    }

    public final Modifier k(ex0 ex0Var, Composer composer, int i) {
        Modifier modifier;
        composer.z(93755870);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(93755870, i, -1, "androidx.compose.animation.AnimatedContentTransitionScopeImpl.createSizeAnimationModifier (AnimatedContent.kt:538)");
        }
        composer.z(1157296644);
        boolean S = composer.S(this);
        Object A = composer.A();
        if (S || A == Composer.a.a()) {
            A = b0.e(Boolean.FALSE, null, 2, null);
            composer.q(A);
        }
        composer.R();
        sy4 sy4Var = (sy4) A;
        x08 o = y.o(ex0Var.b(), composer, 0);
        if (zq3.c(this.a.h(), this.a.n())) {
            m(sy4Var, false);
        } else if (o.getValue() != null) {
            m(sy4Var, true);
        }
        if (l(sy4Var)) {
            Transition.a b = TransitionKt.b(this.a, VectorConvertersKt.g(hn3.b), null, composer, 64, 2);
            composer.z(1157296644);
            boolean S2 = composer.S(b);
            Object A2 = composer.A();
            if (S2 || A2 == Composer.a.a()) {
                hu7 hu7Var = (hu7) o.getValue();
                A2 = ((hu7Var == null || hu7Var.b()) ? pl0.b(Modifier.a) : Modifier.a).h(new SizeModifier(b, o));
                composer.q(A2);
            }
            composer.R();
            modifier = (Modifier) A2;
        } else {
            this.f = null;
            modifier = Modifier.a;
        }
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return modifier;
    }

    public Alignment n() {
        return this.b;
    }

    public final long p() {
        return ((hn3) this.d.getValue()).j();
    }

    public final Map q() {
        return this.e;
    }

    public final Transition r() {
        return this.a;
    }

    public final void u(x08 x08Var) {
        this.f = x08Var;
    }

    public void v(Alignment alignment) {
        this.b = alignment;
    }

    public final void w(LayoutDirection layoutDirection) {
        this.c = layoutDirection;
    }

    public final void x(long j) {
        this.d.setValue(hn3.b(j));
    }
}
