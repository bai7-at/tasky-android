package com.nytimes.android.ribbon.composable.tabrow;

import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.m;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.material.TabKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.e;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.j;
import androidx.compose.ui.unit.LayoutDirection;
import com.amazonaws.event.ProgressEvent;
import com.nytimes.android.designsystem.uicompose.ui.tpl.XPNTypography;
import com.nytimes.android.ribbon.config.RibbonConfig;
import com.nytimes.android.ribbon.config.b;
import defpackage.bu1;
import defpackage.by0;
import defpackage.cc0;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.dh8;
import defpackage.di;
import defpackage.eb5;
import defpackage.et0;
import defpackage.eu8;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.hu8;
import defpackage.ip5;
import defpackage.it2;
import defpackage.jf8;
import defpackage.ju7;
import defpackage.n37;
import defpackage.ph2;
import defpackage.pl0;
import defpackage.py1;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.sm9;
import defpackage.ww8;
import defpackage.wx2;
import defpackage.x08;
import defpackage.xx1;
import defpackage.zo0;
import defpackage.zq3;
import defpackage.zr0;
import defpackage.zt7;
import java.util.List;
import kotlin.collections.i;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public abstract class RibbonTabRowKt {
    private static final float a = bu1.g(10);
    private static final float b = bu1.g(4);

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final PagerState pagerState, final int i, final b bVar, final it2 it2Var, Composer composer, final int i2) {
        Composer h = composer.h(-1256295510);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-1256295510, i2, -1, "com.nytimes.android.ribbon.composable.tabrow.DestinationTab (RibbonTabRow.kt:82)");
        }
        h.z(773894976);
        h.z(-492369756);
        Object A = h.A();
        if (A == Composer.a.a()) {
            e eVar = new e(py1.j(EmptyCoroutineContext.a, h));
            h.q(eVar);
            A = eVar;
        }
        h.R();
        final CoroutineScope a2 = ((e) A).a();
        h.R();
        boolean z = pagerState.w() == i;
        final long d = z ? bVar.d() : bVar.e();
        final j value = (z ? XPNTypography.titleBold16 : XPNTypography.title16).getValue();
        TabKt.b(z, new qs2() { // from class: com.nytimes.android.ribbon.composable.tabrow.RibbonTabRowKt$DestinationTab$1

            @fc1(c = "com.nytimes.android.ribbon.composable.tabrow.RibbonTabRowKt$DestinationTab$1$1", f = "RibbonTabRow.kt", l = {94, 95}, m = "invokeSuspend")
            /* renamed from: com.nytimes.android.ribbon.composable.tabrow.RibbonTabRowKt$DestinationTab$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends SuspendLambda implements gt2 {
                final /* synthetic */ int $index;
                final /* synthetic */ b $item;
                final /* synthetic */ it2 $onScrollToTop;
                final /* synthetic */ PagerState $pagerState;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(it2 it2Var, int i, b bVar, PagerState pagerState, by0 by0Var) {
                    super(2, by0Var);
                    this.$onScrollToTop = it2Var;
                    this.$index = i;
                    this.$item = bVar;
                    this.$pagerState = pagerState;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final by0 create(Object obj, by0 by0Var) {
                    return new AnonymousClass1(this.$onScrollToTop, this.$index, this.$item, this.$pagerState, by0Var);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object h = a.h();
                    int i = this.label;
                    if (i == 0) {
                        f.b(obj);
                        it2 it2Var = this.$onScrollToTop;
                        Integer c = cc0.c(this.$index);
                        RibbonConfig f = this.$item.f();
                        this.label = 1;
                        if (it2Var.invoke(c, f, this) == h) {
                            return h;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            f.b(obj);
                            return ww8.a;
                        }
                        f.b(obj);
                    }
                    PagerState pagerState = this.$pagerState;
                    int i2 = this.$index;
                    this.label = 2;
                    if (PagerState.o(pagerState, i2, 0.0f, null, this, 6, null) == h) {
                        return h;
                    }
                    return ww8.a;
                }

                @Override // defpackage.gt2
                public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
                    return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m659invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m659invoke() {
                BuildersKt__Builders_commonKt.launch$default(CoroutineScope.this, null, null, new AnonymousClass1(it2Var, i, bVar, pagerState, null), 3, null);
            }
        }, SizeKt.f(Modifier.a, 0.0f, 1, null), false, null, 0L, 0L, zr0.b(h, -398444579, true, new it2() { // from class: com.nytimes.android.ribbon.composable.tabrow.RibbonTabRowKt$DestinationTab$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((zo0) obj, (Composer) obj2, ((Number) obj3).intValue());
                return ww8.a;
            }

            public final void invoke(zo0 zo0Var, Composer composer2, int i3) {
                float f;
                zq3.h(zo0Var, "$this$Tab");
                if ((i3 & 81) == 16 && composer2.i()) {
                    composer2.K();
                    return;
                }
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.S(-398444579, i3, -1, "com.nytimes.android.ribbon.composable.tabrow.DestinationTab.<anonymous> (RibbonTabRow.kt:98)");
                }
                Alignment.c i4 = Alignment.a.i();
                b bVar2 = b.this;
                long j = d;
                j jVar = value;
                composer2.z(693286680);
                Modifier.a aVar = Modifier.a;
                rg4 a3 = m.a(Arrangement.a.f(), i4, composer2, 48);
                composer2.z(-1323940314);
                int a4 = cs0.a(composer2, 0);
                et0 o = composer2.o();
                ComposeUiNode.Companion companion = ComposeUiNode.F;
                qs2 a5 = companion.a();
                it2 c = LayoutKt.c(aVar);
                if (composer2.j() == null) {
                    cs0.c();
                }
                composer2.G();
                if (composer2.f()) {
                    composer2.D(a5);
                } else {
                    composer2.p();
                }
                Composer a6 = Updater.a(composer2);
                Updater.c(a6, a3, companion.e());
                Updater.c(a6, o, companion.g());
                gt2 b2 = companion.b();
                if (a6.f() || !zq3.c(a6.A(), Integer.valueOf(a4))) {
                    a6.q(Integer.valueOf(a4));
                    a6.v(Integer.valueOf(a4), b2);
                }
                c.invoke(ju7.a(ju7.b(composer2)), composer2, 0);
                composer2.z(2058660585);
                n37 n37Var = n37.a;
                float g = bu1.g(8);
                f = RibbonTabRowKt.a;
                TextKt.c(bVar2.a(), PaddingKt.j(aVar, f, g), j, 0L, null, null, null, 0L, null, dh8.h(dh8.b.a()), 0L, 0, false, 1, 0, null, jVar, composer2, 0, 3072, 56824);
                composer2.R();
                composer2.t();
                composer2.R();
                composer2.R();
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.R();
                }
            }
        }), h, 12583296, 120);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.ribbon.composable.tabrow.RibbonTabRowKt$DestinationTab$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i3) {
                    RibbonTabRowKt.a(PagerState.this, i, bVar, it2Var, composer2, gt6.a(i2 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v5 */
    public static final void b(final List list, final List list2, final PagerState pagerState, Composer composer, final int i) {
        int i2;
        ?? r14;
        Composer h = composer.h(1163260457);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(1163260457, i, -1, "com.nytimes.android.ribbon.composable.tabrow.NytHomeIndicator (RibbonTabRow.kt:122)");
        }
        if (list2.isEmpty() || list.size() != list2.size()) {
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
            cc7 k = h.k();
            if (k != null) {
                k.a(new gt2() { // from class: com.nytimes.android.ribbon.composable.tabrow.RibbonTabRowKt$NytHomeIndicator$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // defpackage.gt2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return ww8.a;
                    }

                    public final void invoke(Composer composer2, int i3) {
                        RibbonTabRowKt.b(list, list2, pagerState, composer2, gt6.a(i | 1));
                    }
                });
                return;
            }
            return;
        }
        int w = pagerState.w();
        b bVar = (b) list2.get(w);
        Transition f = TransitionKt.f(Integer.valueOf(w), "", h, 48, 0);
        RibbonTabRowKt$NytHomeIndicator$indicatorStart$2 ribbonTabRowKt$NytHomeIndicator$indicatorStart$2 = new it2() { // from class: com.nytimes.android.ribbon.composable.tabrow.RibbonTabRowKt$NytHomeIndicator$indicatorStart$2
            public final ph2 b(Transition.b bVar2, Composer composer2, int i3) {
                zq3.h(bVar2, "$this$animateDp");
                composer2.z(939846167);
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.S(939846167, i3, -1, "com.nytimes.android.ribbon.composable.tabrow.NytHomeIndicator.<anonymous> (RibbonTabRow.kt:131)");
                }
                eu8 k2 = di.k(280, 0, xx1.c(), 2, null);
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.R();
                }
                composer2.R();
                return k2;
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return b((Transition.b) obj, (Composer) obj2, ((Number) obj3).intValue());
            }
        };
        h.z(184732935);
        bu1.a aVar = bu1.b;
        hu8 b2 = VectorConvertersKt.b(aVar);
        h.z(-142660079);
        int intValue = ((Number) f.h()).intValue();
        h.z(553743165);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(553743165, 0, -1, "com.nytimes.android.ribbon.composable.tabrow.NytHomeIndicator.<anonymous> (RibbonTabRow.kt:134)");
        }
        float a2 = ((jf8) list.get(intValue)).a();
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        h.R();
        bu1 d = bu1.d(a2);
        int intValue2 = ((Number) f.n()).intValue();
        h.z(553743165);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(553743165, 0, -1, "com.nytimes.android.ribbon.composable.tabrow.NytHomeIndicator.<anonymous> (RibbonTabRow.kt:134)");
        }
        float a3 = ((jf8) list.get(intValue2)).a();
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        h.R();
        x08 c = TransitionKt.c(f, d, bu1.d(a3), (ph2) ribbonTabRowKt$NytHomeIndicator$indicatorStart$2.invoke(f.l(), h, 0), b2, "", h, 196608);
        h.R();
        h.R();
        RibbonTabRowKt$NytHomeIndicator$indicatorEnd$2 ribbonTabRowKt$NytHomeIndicator$indicatorEnd$2 = new it2() { // from class: com.nytimes.android.ribbon.composable.tabrow.RibbonTabRowKt$NytHomeIndicator$indicatorEnd$2
            public final ph2 b(Transition.b bVar2, Composer composer2, int i3) {
                zq3.h(bVar2, "$this$animateDp");
                composer2.z(1144539728);
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.S(1144539728, i3, -1, "com.nytimes.android.ribbon.composable.tabrow.NytHomeIndicator.<anonymous> (RibbonTabRow.kt:138)");
                }
                eu8 k2 = di.k(280, 0, xx1.c(), 2, null);
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.R();
                }
                composer2.R();
                return k2;
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return b((Transition.b) obj, (Composer) obj2, ((Number) obj3).intValue());
            }
        };
        h.z(184732935);
        hu8 b3 = VectorConvertersKt.b(aVar);
        h.z(-142660079);
        int intValue3 = ((Number) f.h()).intValue();
        h.z(2029053174);
        if (androidx.compose.runtime.b.G()) {
            i2 = 0;
            androidx.compose.runtime.b.S(2029053174, 0, -1, "com.nytimes.android.ribbon.composable.tabrow.NytHomeIndicator.<anonymous> (RibbonTabRow.kt:141)");
        } else {
            i2 = 0;
        }
        float b4 = ((jf8) list.get(intValue3)).b();
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        h.R();
        bu1 d2 = bu1.d(b4);
        int intValue4 = ((Number) f.n()).intValue();
        h.z(2029053174);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(2029053174, i2, -1, "com.nytimes.android.ribbon.composable.tabrow.NytHomeIndicator.<anonymous> (RibbonTabRow.kt:141)");
        }
        float b5 = ((jf8) list.get(intValue4)).b();
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        h.R();
        x08 c2 = TransitionKt.c(f, d2, bu1.d(b5), (ph2) ribbonTabRowKt$NytHomeIndicator$indicatorEnd$2.invoke(f.l(), h, Integer.valueOf(i2)), b3, "", h, 196608);
        h.R();
        h.R();
        RibbonTabRowKt$NytHomeIndicator$indicatorHeight$2 ribbonTabRowKt$NytHomeIndicator$indicatorHeight$2 = new it2() { // from class: com.nytimes.android.ribbon.composable.tabrow.RibbonTabRowKt$NytHomeIndicator$indicatorHeight$2
            public final ph2 b(Transition.b bVar2, Composer composer2, int i3) {
                zq3.h(bVar2, "$this$animateDp");
                composer2.z(-1895783408);
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.S(-1895783408, i3, -1, "com.nytimes.android.ribbon.composable.tabrow.NytHomeIndicator.<anonymous> (RibbonTabRow.kt:145)");
                }
                eu8 k2 = di.k(280, 0, xx1.c(), 2, null);
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.R();
                }
                composer2.R();
                return k2;
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return b((Transition.b) obj, (Composer) obj2, ((Number) obj3).intValue());
            }
        };
        h.z(184732935);
        hu8 b6 = VectorConvertersKt.b(aVar);
        h.z(-142660079);
        int intValue5 = ((Number) f.h()).intValue();
        h.z(-980074582);
        if (androidx.compose.runtime.b.G()) {
            r14 = 0;
            androidx.compose.runtime.b.S(-980074582, 0, -1, "com.nytimes.android.ribbon.composable.tabrow.NytHomeIndicator.<anonymous> (RibbonTabRow.kt:148)");
        } else {
            r14 = 0;
        }
        float b7 = ((b) list2.get(intValue5)).b();
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        h.R();
        bu1 d3 = bu1.d(b7);
        int intValue6 = ((Number) f.n()).intValue();
        h.z(-980074582);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-980074582, r14, -1, "com.nytimes.android.ribbon.composable.tabrow.NytHomeIndicator.<anonymous> (RibbonTabRow.kt:148)");
        }
        float b8 = ((b) list2.get(intValue6)).b();
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        h.R();
        x08 c3 = TransitionKt.c(f, d3, bu1.d(b8), (ph2) ribbonTabRowKt$NytHomeIndicator$indicatorHeight$2.invoke(f.l(), h, Integer.valueOf((int) r14)), b6, "", h, 196608);
        h.R();
        h.R();
        BoxKt.a(sm9.a(BackgroundKt.d(SizeKt.f(SizeKt.i(PaddingKt.k(SizeKt.s(SizeKt.y(OffsetKt.c(Modifier.a, c(c), 0.0f, 2, null), Alignment.a.d(), r14, 2, null), bu1.g(d(c2) - c(c))), bu1.g(a - b), 0.0f, 2, null), e(c3)), 0.0f, 1, null), bVar.c(), null, 2, null), -1.0f), h, r14);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        cc7 k2 = h.k();
        if (k2 != null) {
            k2.a(new gt2() { // from class: com.nytimes.android.ribbon.composable.tabrow.RibbonTabRowKt$NytHomeIndicator$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i3) {
                    RibbonTabRowKt.b(list, list2, pagerState, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    private static final float c(x08 x08Var) {
        return ((bu1) x08Var.getValue()).n();
    }

    private static final float d(x08 x08Var) {
        return ((bu1) x08Var.getValue()).n();
    }

    private static final float e(x08 x08Var) {
        return ((bu1) x08Var.getValue()).n();
    }

    public static final void f(final PagerState pagerState, final List list, final it2 it2Var, final float f, Composer composer, final int i) {
        zq3.h(pagerState, "pagerState");
        zq3.h(list, "tabs");
        zq3.h(it2Var, "onTabSelected");
        Composer h = composer.h(271175999);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(271175999, i, -1, "com.nytimes.android.ribbon.composable.tabrow.RibbonTabRow (RibbonTabRow.kt:45)");
        }
        Modifier a2 = sm9.a(ShadowKt.b(pl0.a(SizeKt.h(SizeKt.i(Modifier.a, f), 0.0f, 1, null), new wx2(new it2() { // from class: com.nytimes.android.ribbon.composable.tabrow.RibbonTabRowKt$RibbonTabRow$1
            public final void b(ip5 ip5Var, long j, LayoutDirection layoutDirection) {
                zq3.h(ip5Var, "$this$$receiver");
                zq3.h(layoutDirection, "<anonymous parameter 1>");
                ip5Var.t(zt7.i(j), 0.0f);
                ip5Var.t(zt7.i(j), Float.MAX_VALUE);
                ip5Var.t(0.0f, Float.MAX_VALUE);
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                b((ip5) obj, ((zt7) obj2).m(), (LayoutDirection) obj3);
                return ww8.a;
            }
        })), bu1.g(2), null, false, 0L, 0L, 30, null), 1.0f);
        int w = pagerState.w();
        float g = bu1.g(8);
        eb5.a aVar = eb5.Companion;
        CustomScrollableTabRowKt.a(w, a2, aVar.a(h, 8).a(), aVar.a(h, 8).S(), g, zr0.b(h, 1917064560, true, new it2() { // from class: com.nytimes.android.ribbon.composable.tabrow.RibbonTabRowKt$RibbonTabRow$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            public final void b(List list2, Composer composer2, int i2) {
                zq3.h(list2, "tabPositions");
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.S(1917064560, i2, -1, "com.nytimes.android.ribbon.composable.tabrow.RibbonTabRow.<anonymous> (RibbonTabRow.kt:63)");
                }
                RibbonTabRowKt.b(list2, list, pagerState, composer2, 72);
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.R();
                }
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                b((List) obj, (Composer) obj2, ((Number) obj3).intValue());
                return ww8.a;
            }
        }), ComposableSingletons$RibbonTabRowKt.a.a(), zr0.b(h, -716912784, true, new gt2() { // from class: com.nytimes.android.ribbon.composable.tabrow.RibbonTabRowKt$RibbonTabRow$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return ww8.a;
            }

            public final void invoke(Composer composer2, int i2) {
                if ((i2 & 11) == 2 && composer2.i()) {
                    composer2.K();
                    return;
                }
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.S(-716912784, i2, -1, "com.nytimes.android.ribbon.composable.tabrow.RibbonTabRow.<anonymous> (RibbonTabRow.kt:70)");
                }
                List<b> list2 = list;
                PagerState pagerState2 = pagerState;
                it2 it2Var2 = it2Var;
                int i3 = 0;
                for (Object obj : list2) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        i.v();
                    }
                    RibbonTabRowKt.a(pagerState2, i3, (b) obj, it2Var2, composer2, ProgressEvent.PART_FAILED_EVENT_CODE);
                    i3 = i4;
                }
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.R();
                }
            }
        }), h, 14376960, 0);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.ribbon.composable.tabrow.RibbonTabRowKt$RibbonTabRow$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i2) {
                    RibbonTabRowKt.f(PagerState.this, list, it2Var, f, composer2, gt6.a(i | 1));
                }
            });
        }
    }
}
