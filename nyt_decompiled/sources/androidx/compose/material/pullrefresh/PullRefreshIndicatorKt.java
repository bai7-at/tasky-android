package androidx.compose.material.pullrefresh;

import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ColorsKt;
import androidx.compose.material.ElevationOverlayKt;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.runtime.y;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import com.comscore.streaming.ContentFeedType;
import defpackage.ag4;
import defpackage.bu1;
import defpackage.c37;
import defpackage.cc7;
import defpackage.cg;
import defpackage.cs0;
import defpackage.d37;
import defpackage.di;
import defpackage.dj7;
import defpackage.du7;
import defpackage.et0;
import defpackage.eu8;
import defpackage.fd5;
import defpackage.fv1;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.hd5;
import defpackage.ip5;
import defpackage.it2;
import defpackage.ju7;
import defpackage.kt6;
import defpackage.lj7;
import defpackage.nn0;
import defpackage.np5;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.ss2;
import defpackage.u48;
import defpackage.uo6;
import defpackage.v48;
import defpackage.ww8;
import defpackage.x08;
import defpackage.xx1;
import defpackage.zq3;
import defpackage.zr0;
import defpackage.zu1;
import defpackage.zy1;

/* loaded from: classes.dex */
public abstract class PullRefreshIndicatorKt {
    private static final float a = bu1.g(40);
    private static final c37 b = d37.f();
    private static final float c = bu1.g((float) 7.5d);
    private static final float d = bu1.g((float) 2.5d);
    private static final float e = bu1.g(10);
    private static final float f = bu1.g(5);
    private static final float g = bu1.g(6);
    private static final eu8 h = di.k(ContentFeedType.OTHER, 0, xx1.d(), 2, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final a a(float f2) {
        float max = (Math.max(Math.min(1.0f, f2) - 0.4f, 0.0f) * 5) / 3;
        float l = uo6.l(Math.abs(f2) - 1.0f, 0.0f, 2.0f);
        float pow = (((0.4f * max) - 0.25f) + (l - (((float) Math.pow(l, 2)) / 4))) * 0.5f;
        float f3 = 360;
        return new a(pow, pow * f3, ((0.8f * max) + pow) * f3, Math.min(1.0f, max));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(final PullRefreshState pullRefreshState, final long j, final Modifier modifier, Composer composer, final int i) {
        Composer h2 = composer.h(-486016981);
        if (b.G()) {
            b.S(-486016981, i, -1, "androidx.compose.material.pullrefresh.CircularArrowIndicator (PullRefreshIndicator.kt:133)");
        }
        h2.z(-492369756);
        Object A = h2.A();
        Composer.a aVar = Composer.a;
        Object obj = A;
        if (A == aVar.a()) {
            ip5 a2 = cg.a();
            a2.A(np5.a.a());
            h2.q(a2);
            obj = a2;
        }
        h2.R();
        final ip5 ip5Var = (ip5) obj;
        h2.z(1157296644);
        boolean S = h2.S(pullRefreshState);
        Object A2 = h2.A();
        if (S || A2 == aVar.a()) {
            A2 = y.d(new qs2() { // from class: androidx.compose.material.pullrefresh.PullRefreshIndicatorKt$CircularArrowIndicator$targetAlpha$2$1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Float mo865invoke() {
                    return Float.valueOf(PullRefreshState.this.j() < 1.0f ? 0.3f : 1.0f);
                }
            });
            h2.q(A2);
        }
        h2.R();
        final x08 d2 = AnimateAsStateKt.d(c((x08) A2), h, 0.0f, null, null, h2, 48, 28);
        CanvasKt.a(dj7.d(modifier, false, new ss2() { // from class: androidx.compose.material.pullrefresh.PullRefreshIndicatorKt$CircularArrowIndicator$1
            public final void b(lj7 lj7Var) {
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                b((lj7) obj2);
                return ww8.a;
            }
        }, 1, null), new ss2() { // from class: androidx.compose.material.pullrefresh.PullRefreshIndicatorKt$CircularArrowIndicator$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                invoke((fv1) obj2);
                return ww8.a;
            }

            public final void invoke(fv1 fv1Var) {
                a a3;
                float f2;
                float f3;
                float f4;
                a3 = PullRefreshIndicatorKt.a(PullRefreshState.this.j());
                float floatValue = ((Number) d2.getValue()).floatValue();
                float b2 = a3.b();
                long j2 = j;
                ip5 ip5Var2 = ip5Var;
                long t1 = fv1Var.t1();
                zu1 i1 = fv1Var.i1();
                long b3 = i1.b();
                i1.c().t();
                i1.a().f(b2, t1);
                f2 = PullRefreshIndicatorKt.c;
                float f1 = fv1Var.f1(f2);
                f3 = PullRefreshIndicatorKt.d;
                float f12 = f1 + (fv1Var.f1(f3) / 2.0f);
                kt6 kt6Var = new kt6(fd5.o(du7.b(fv1Var.b())) - f12, fd5.p(du7.b(fv1Var.b())) - f12, fd5.o(du7.b(fv1Var.b())) + f12, fd5.p(du7.b(fv1Var.b())) + f12);
                float d3 = a3.d();
                float a4 = a3.a() - a3.d();
                long m = kt6Var.m();
                long k = kt6Var.k();
                f4 = PullRefreshIndicatorKt.d;
                fv1.K0(fv1Var, j2, d3, a4, false, m, k, floatValue, new u48(fv1Var.f1(f4), 0.0f, v48.a.c(), 0, null, 26, null), null, 0, 768, null);
                PullRefreshIndicatorKt.k(fv1Var, ip5Var2, kt6Var, j2, floatValue, a3);
                i1.c().k();
                i1.d(b3);
            }
        }, h2, 0);
        if (b.G()) {
            b.R();
        }
        cc7 k = h2.k();
        if (k != null) {
            k.a(new gt2() { // from class: androidx.compose.material.pullrefresh.PullRefreshIndicatorKt$CircularArrowIndicator$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    invoke((Composer) obj2, ((Number) obj3).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i2) {
                    PullRefreshIndicatorKt.b(PullRefreshState.this, j, modifier, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    private static final float c(x08 x08Var) {
        return ((Number) x08Var.getValue()).floatValue();
    }

    public static final void d(final boolean z, final PullRefreshState pullRefreshState, Modifier modifier, long j, long j2, boolean z2, Composer composer, final int i, final int i2) {
        long j3;
        int i3;
        final long j4;
        int i4;
        long j5;
        Composer h2 = composer.h(308716636);
        Modifier modifier2 = (i2 & 4) != 0 ? Modifier.a : modifier;
        if ((i2 & 8) != 0) {
            i3 = i & (-7169);
            j3 = ag4.a.a(h2, 6).n();
        } else {
            j3 = j;
            i3 = i;
        }
        if ((i2 & 16) != 0) {
            long b2 = ColorsKt.b(j3, h2, (i3 >> 9) & 14);
            i3 &= -57345;
            j4 = b2;
        } else {
            j4 = j2;
        }
        boolean z3 = (i2 & 32) != 0 ? false : z2;
        if (b.G()) {
            b.S(308716636, i3, -1, "androidx.compose.material.pullrefresh.PullRefreshIndicator (PullRefreshIndicator.kt:81)");
        }
        Boolean valueOf = Boolean.valueOf(z);
        int i5 = i3 & 14;
        h2.z(511388516);
        boolean S = h2.S(valueOf) | h2.S(pullRefreshState);
        Object A = h2.A();
        if (S || A == Composer.a.a()) {
            A = y.d(new qs2() { // from class: androidx.compose.material.pullrefresh.PullRefreshIndicatorKt$PullRefreshIndicator$showElevation$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final Boolean mo865invoke() {
                    return Boolean.valueOf(z || pullRefreshState.i() > 0.5f);
                }
            });
            h2.q(A);
        }
        h2.R();
        x08 x08Var = (x08) A;
        zy1 zy1Var = (zy1) h2.m(ElevationOverlayKt.d());
        h2.z(52228748);
        nn0 j6 = zy1Var == null ? null : nn0.j(zy1Var.a(j3, g, h2, ((i3 >> 9) & 14) | 48));
        h2.R();
        if (j6 != null) {
            i4 = i5;
            j5 = j6.B();
        } else {
            i4 = i5;
            j5 = j3;
        }
        Modifier a2 = PullRefreshIndicatorTransformKt.a(SizeKt.n(modifier2, a), pullRefreshState, z3);
        float g2 = e(x08Var) ? g : bu1.g(0);
        c37 c37Var = b;
        Modifier c2 = BackgroundKt.c(ShadowKt.b(a2, g2, c37Var, true, 0L, 0L, 24, null), j5, c37Var);
        h2.z(733328855);
        rg4 g3 = BoxKt.g(Alignment.a.o(), false, h2, 0);
        h2.z(-1323940314);
        int a3 = cs0.a(h2, 0);
        et0 o = h2.o();
        ComposeUiNode.Companion companion = ComposeUiNode.F;
        qs2 a4 = companion.a();
        it2 c3 = LayoutKt.c(c2);
        if (h2.j() == null) {
            cs0.c();
        }
        h2.G();
        if (h2.f()) {
            h2.D(a4);
        } else {
            h2.p();
        }
        Composer a5 = Updater.a(h2);
        Updater.c(a5, g3, companion.e());
        Updater.c(a5, o, companion.g());
        gt2 b3 = companion.b();
        if (a5.f() || !zq3.c(a5.A(), Integer.valueOf(a3))) {
            a5.q(Integer.valueOf(a3));
            a5.v(Integer.valueOf(a3), b3);
        }
        c3.invoke(ju7.a(ju7.b(h2)), h2, 0);
        h2.z(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
        final long j7 = j4;
        CrossfadeKt.c(Boolean.valueOf(z), null, di.k(100, 0, null, 6, null), null, zr0.b(h2, 1853731063, true, new it2() { // from class: androidx.compose.material.pullrefresh.PullRefreshIndicatorKt$PullRefreshIndicator$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            public final void b(boolean z4, Composer composer2, int i6) {
                int i7;
                float f2;
                float f3;
                float f4;
                if ((i6 & 14) == 0) {
                    i7 = i6 | (composer2.a(z4) ? 4 : 2);
                } else {
                    i7 = i6;
                }
                if ((i7 & 91) == 18 && composer2.i()) {
                    composer2.K();
                    return;
                }
                if (b.G()) {
                    b.S(1853731063, i7, -1, "androidx.compose.material.pullrefresh.PullRefreshIndicator.<anonymous>.<anonymous> (PullRefreshIndicator.kt:104)");
                }
                Modifier.a aVar = Modifier.a;
                Modifier f5 = SizeKt.f(aVar, 0.0f, 1, null);
                Alignment e2 = Alignment.a.e();
                long j8 = j4;
                PullRefreshState pullRefreshState2 = pullRefreshState;
                composer2.z(733328855);
                rg4 g4 = BoxKt.g(e2, false, composer2, 6);
                composer2.z(-1323940314);
                int a6 = cs0.a(composer2, 0);
                et0 o2 = composer2.o();
                ComposeUiNode.Companion companion2 = ComposeUiNode.F;
                qs2 a7 = companion2.a();
                it2 c4 = LayoutKt.c(f5);
                if (composer2.j() == null) {
                    cs0.c();
                }
                composer2.G();
                if (composer2.f()) {
                    composer2.D(a7);
                } else {
                    composer2.p();
                }
                Composer a8 = Updater.a(composer2);
                Updater.c(a8, g4, companion2.e());
                Updater.c(a8, o2, companion2.g());
                gt2 b4 = companion2.b();
                if (a8.f() || !zq3.c(a8.A(), Integer.valueOf(a6))) {
                    a8.q(Integer.valueOf(a6));
                    a8.v(Integer.valueOf(a6), b4);
                }
                c4.invoke(ju7.a(ju7.b(composer2)), composer2, 0);
                composer2.z(2058660585);
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.a;
                f2 = PullRefreshIndicatorKt.c;
                f3 = PullRefreshIndicatorKt.d;
                float g5 = bu1.g(bu1.g(f2 + f3) * 2);
                if (z4) {
                    composer2.z(-2035147035);
                    f4 = PullRefreshIndicatorKt.d;
                    ProgressIndicatorKt.a(SizeKt.n(aVar, g5), j8, f4, 0L, 0, composer2, 390, 24);
                    composer2.R();
                } else {
                    composer2.z(-2035146781);
                    PullRefreshIndicatorKt.b(pullRefreshState2, j8, SizeKt.n(aVar, g5), composer2, 392);
                    composer2.R();
                }
                composer2.R();
                composer2.t();
                composer2.R();
                composer2.R();
                if (b.G()) {
                    b.R();
                }
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                b(((Boolean) obj).booleanValue(), (Composer) obj2, ((Number) obj3).intValue());
                return ww8.a;
            }
        }), h2, i4 | 24960, 10);
        h2.R();
        h2.t();
        h2.R();
        h2.R();
        if (b.G()) {
            b.R();
        }
        cc7 k = h2.k();
        if (k != null) {
            final Modifier modifier3 = modifier2;
            final long j8 = j3;
            final boolean z4 = z3;
            k.a(new gt2() { // from class: androidx.compose.material.pullrefresh.PullRefreshIndicatorKt$PullRefreshIndicator$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i6) {
                    PullRefreshIndicatorKt.d(z, pullRefreshState, modifier3, j8, j7, z4, composer2, gt6.a(i | 1), i2);
                }
            });
        }
    }

    private static final boolean e(x08 x08Var) {
        return ((Boolean) x08Var.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(fv1 fv1Var, ip5 ip5Var, kt6 kt6Var, long j, float f2, a aVar) {
        ip5Var.a();
        ip5Var.r(0.0f, 0.0f);
        float f3 = e;
        ip5Var.t(fv1Var.f1(f3) * aVar.c(), 0.0f);
        ip5Var.t((fv1Var.f1(f3) * aVar.c()) / 2, fv1Var.f1(f) * aVar.c());
        ip5Var.C(hd5.a(((Math.min(kt6Var.n(), kt6Var.h()) / 2.0f) + fd5.o(kt6Var.g())) - ((fv1Var.f1(f3) * aVar.c()) / 2.0f), fd5.p(kt6Var.g()) + (fv1Var.f1(d) / 2.0f)));
        ip5Var.close();
        float a2 = aVar.a();
        long t1 = fv1Var.t1();
        zu1 i1 = fv1Var.i1();
        long b2 = i1.b();
        i1.c().t();
        i1.a().f(a2, t1);
        fv1.k0(fv1Var, ip5Var, j, f2, null, null, 0, 56, null);
        i1.c().k();
        i1.d(b2);
    }
}
