package com.nytimes.android.onboarding.compose.subscribe;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.d;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.TextKt;
import androidx.compose.material.a;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.runtime.b0;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.j;
import com.comscore.streaming.ContentMediaFormat;
import com.comscore.streaming.ContentType;
import com.google.accompanist.pager.Pager;
import com.google.accompanist.pager.PagerIndicatorKt;
import com.google.accompanist.pager.PagerState;
import com.google.accompanist.pager.PagerStateKt;
import com.nytimes.android.utils.composeutils.ModifierUtilsKt;
import com.nytimes.piano.PianoSpacing;
import defpackage.ap0;
import defpackage.bu1;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.do5;
import defpackage.eb5;
import defpackage.et0;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.it2;
import defpackage.ju7;
import defpackage.k48;
import defpackage.kt2;
import defpackage.pn5;
import defpackage.py1;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.rl6;
import defpackage.sy4;
import defpackage.ve0;
import defpackage.ww8;
import defpackage.zo0;
import defpackage.zq3;
import defpackage.zr0;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class SubscriptionOptionsScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final PagerState pagerState, Composer composer, final int i) {
        int i2;
        Composer h = composer.h(1068017766);
        if ((i & 14) == 0) {
            i2 = (h.S(pagerState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && h.i()) {
            h.K();
        } else {
            if (b.G()) {
                b.S(1068017766, i2, -1, "com.nytimes.android.onboarding.compose.subscribe.AutoScrollPager (SubscriptionOptionsScreen.kt:102)");
            }
            h.z(388431791);
            Object A = h.A();
            Composer.a aVar = Composer.a;
            if (A == aVar.a()) {
                A = b0.e(Boolean.FALSE, null, 2, null);
                h.q(A);
            }
            sy4 sy4Var = (sy4) A;
            h.R();
            Boolean valueOf = Boolean.valueOf(b(sy4Var));
            h.z(388431851);
            boolean z = (i2 & 14) == 4;
            Object A2 = h.A();
            if (z || A2 == aVar.a()) {
                A2 = new SubscriptionOptionsScreenKt$AutoScrollPager$1$1(pagerState, 2500L, sy4Var, null);
                h.q(A2);
            }
            h.R();
            py1.d(valueOf, (gt2) A2, h, 64);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.onboarding.compose.subscribe.SubscriptionOptionsScreenKt$AutoScrollPager$2
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
                    SubscriptionOptionsScreenKt.a(PagerState.this, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(sy4 sy4Var) {
        return ((Boolean) sy4Var.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(sy4 sy4Var, boolean z) {
        sy4Var.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(final List list, Composer composer, final int i) {
        Composer h = composer.h(2113073241);
        if (b.G()) {
            b.S(2113073241, i, -1, "com.nytimes.android.onboarding.compose.subscribe.ImagePager (SubscriptionOptionsScreen.kt:74)");
        }
        PagerState a = PagerStateKt.a(0, h, 0, 1);
        a(a, h, 0);
        Modifier.a aVar = Modifier.a;
        Modifier h2 = SizeKt.h(aVar, 0.0f, 1, null);
        h.z(-483455358);
        Arrangement.m g = Arrangement.a.g();
        Alignment.a aVar2 = Alignment.a;
        rg4 a2 = d.a(g, aVar2.k(), h, 0);
        h.z(-1323940314);
        int a3 = cs0.a(h, 0);
        et0 o = h.o();
        ComposeUiNode.Companion companion = ComposeUiNode.F;
        qs2 a4 = companion.a();
        it2 c = LayoutKt.c(h2);
        if (h.j() == null) {
            cs0.c();
        }
        h.G();
        if (h.f()) {
            h.D(a4);
        } else {
            h.p();
        }
        Composer a5 = Updater.a(h);
        Updater.c(a5, a2, companion.e());
        Updater.c(a5, o, companion.g());
        gt2 b = companion.b();
        if (a5.f() || !zq3.c(a5.A(), Integer.valueOf(a3))) {
            a5.q(Integer.valueOf(a3));
            a5.v(Integer.valueOf(a3), b);
        }
        c.invoke(ju7.a(ju7.b(h)), h, 0);
        h.z(2058660585);
        ap0 ap0Var = ap0.a;
        Pager.a(list.size(), null, a, false, 0.0f, null, null, null, null, false, zr0.b(h, 13182484, true, new kt2() { // from class: com.nytimes.android.onboarding.compose.subscribe.SubscriptionOptionsScreenKt$ImagePager$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            public final void b(pn5 pn5Var, int i2, Composer composer2, int i3) {
                zq3.h(pn5Var, "$this$HorizontalPager");
                if ((i3 & ContentType.LONG_FORM_ON_DEMAND) == 0) {
                    i3 |= composer2.d(i2) ? 32 : 16;
                }
                if ((i3 & 721) == 144 && composer2.i()) {
                    composer2.K();
                    return;
                }
                if (b.G()) {
                    b.S(13182484, i3, -1, "com.nytimes.android.onboarding.compose.subscribe.ImagePager.<anonymous>.<anonymous> (SubscriptionOptionsScreen.kt:83)");
                }
                SubscriptionOptionsScreenKt.e(list.get(i2).a(), list.get(i2).b(), composer2, 0);
                if (b.G()) {
                    b.R();
                }
            }

            @Override // defpackage.kt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                b((pn5) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
                return ww8.a;
            }
        }), h, 0, 6, 1018);
        SpacerKt.a(SizeKt.i(aVar, bu1.g(16)), h, 6);
        PagerIndicatorKt.a(a, ap0Var.c(PaddingKt.i(aVar, bu1.g(8)), aVar2.g()), 0, null, eb5.Companion.a(h, 8).l(), 0L, 0.0f, 0.0f, 0.0f, null, h, 0, ContentMediaFormat.PARTIAL_CONTENT_GENERIC);
        h.R();
        h.t();
        h.R();
        h.R();
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.onboarding.compose.subscribe.SubscriptionOptionsScreenKt$ImagePager$2
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
                    SubscriptionOptionsScreenKt.d(list, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(final int i, final int i2, Composer composer, final int i3) {
        int i4;
        Composer composer2;
        Composer h = composer.h(1875196133);
        if ((i3 & 14) == 0) {
            i4 = (h.d(i) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i4 |= h.d(i2) ? 32 : 16;
        }
        int i5 = i4;
        if ((i5 & 91) == 18 && h.i()) {
            h.K();
            composer2 = h;
        } else {
            if (b.G()) {
                b.S(1875196133, i5, -1, "com.nytimes.android.onboarding.compose.subscribe.PagerSampleItem (SubscriptionOptionsScreen.kt:128)");
            }
            Modifier.a aVar = Modifier.a;
            Modifier b = AspectRatioKt.b(SizeKt.h(aVar, 0.0f, 1, null), 1.0f, false, 2, null);
            h.z(733328855);
            Alignment.a aVar2 = Alignment.a;
            rg4 g = BoxKt.g(aVar2.o(), false, h, 0);
            h.z(-1323940314);
            int a = cs0.a(h, 0);
            et0 o = h.o();
            ComposeUiNode.Companion companion = ComposeUiNode.F;
            qs2 a2 = companion.a();
            it2 c = LayoutKt.c(b);
            if (h.j() == null) {
                cs0.c();
            }
            h.G();
            if (h.f()) {
                h.D(a2);
            } else {
                h.p();
            }
            Composer a3 = Updater.a(h);
            Updater.c(a3, g, companion.e());
            Updater.c(a3, o, companion.g());
            gt2 b2 = companion.b();
            if (a3.f() || !zq3.c(a3.A(), Integer.valueOf(a))) {
                a3.q(Integer.valueOf(a));
                a3.v(Integer.valueOf(a), b2);
            }
            c.invoke(ju7.a(ju7.b(h)), h, 0);
            h.z(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
            ImageKt.b(do5.d(i2, h, (i5 >> 3) & 14), null, boxScopeInstance.e(aVar), null, ContentScale.a.a(), 0.0f, null, h, 24632, 104);
            composer2 = h;
            TextKt.c(k48.b(i, h, i5 & 14), SizeKt.y(boxScopeInstance.c(PaddingKt.j(SizeKt.h(aVar, 0.0f, 1, null), bu1.g(14), bu1.g(24)), aVar2.c()), aVar2.e(), false, 2, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, eb5.Companion.c(h, 8).T0(), composer2, 0, 0, 65532);
            composer2.R();
            composer2.t();
            composer2.R();
            composer2.R();
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = composer2.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.onboarding.compose.subscribe.SubscriptionOptionsScreenKt$PagerSampleItem$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer3, int i6) {
                    SubscriptionOptionsScreenKt.e(i, i2, composer3, gt6.a(i3 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(final qs2 qs2Var, final qs2 qs2Var2, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer h = composer.h(-1341353253);
        if ((i & 14) == 0) {
            i2 = (h.C(qs2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i2 |= h.C(qs2Var2) ? 32 : 16;
        }
        int i3 = i2;
        if ((i3 & 91) == 18 && h.i()) {
            h.K();
            composer2 = h;
        } else {
            if (b.G()) {
                b.S(-1341353253, i3, -1, "com.nytimes.android.onboarding.compose.subscribe.SubscriptionButtons (SubscriptionOptionsScreen.kt:157)");
            }
            Alignment.b g = Alignment.a.g();
            h.z(-483455358);
            Modifier.a aVar = Modifier.a;
            rg4 a = d.a(Arrangement.a.g(), g, h, 48);
            h.z(-1323940314);
            int a2 = cs0.a(h, 0);
            et0 o = h.o();
            ComposeUiNode.Companion companion = ComposeUiNode.F;
            qs2 a3 = companion.a();
            it2 c = LayoutKt.c(aVar);
            if (h.j() == null) {
                cs0.c();
            }
            h.G();
            if (h.f()) {
                h.D(a3);
            } else {
                h.p();
            }
            Composer a4 = Updater.a(h);
            Updater.c(a4, a, companion.e());
            Updater.c(a4, o, companion.g());
            gt2 b = companion.b();
            if (a4.f() || !zq3.c(a4.A(), Integer.valueOf(a2))) {
                a4.q(Integer.valueOf(a2));
                a4.v(Integer.valueOf(a2), b);
            }
            c.invoke(ju7.a(ju7.b(h)), h, 0);
            h.z(2058660585);
            ap0 ap0Var = ap0.a;
            a aVar2 = a.a;
            eb5.a aVar3 = eb5.Companion;
            long o2 = aVar3.a(h, 8).o();
            composer2 = h;
            ve0 a5 = aVar2.a(aVar3.a(h, 8).f(), o2, 0L, 0L, h, a.l << 12, 12);
            float f = 24;
            Modifier m = PaddingKt.m(SizeKt.h(aVar, 0.0f, 1, null), bu1.g(f), bu1.g(f), bu1.g(f), 0.0f, 8, null);
            composer2.z(-2135390545);
            boolean z = (i3 & 14) == 4;
            Object A = composer2.A();
            if (z || A == Composer.a.a()) {
                A = new qs2() { // from class: com.nytimes.android.onboarding.compose.subscribe.SubscriptionOptionsScreenKt$SubscriptionButtons$1$1$1
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                        m636invoke();
                        return ww8.a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m636invoke() {
                        qs2.this.mo865invoke();
                    }
                };
                composer2.q(A);
            }
            composer2.R();
            ComposableSingletons$SubscriptionOptionsScreenKt composableSingletons$SubscriptionOptionsScreenKt = ComposableSingletons$SubscriptionOptionsScreenKt.a;
            ButtonKt.a((qs2) A, m, false, null, null, null, null, a5, null, composableSingletons$SubscriptionOptionsScreenKt.a(), composer2, 805306368, 380);
            Modifier d = ModifierUtilsKt.d(aVar, "Continue without subscribing");
            composer2.z(-2135390155);
            boolean z2 = (i3 & ContentType.LONG_FORM_ON_DEMAND) == 32;
            Object A2 = composer2.A();
            if (z2 || A2 == Composer.a.a()) {
                A2 = new qs2() { // from class: com.nytimes.android.onboarding.compose.subscribe.SubscriptionOptionsScreenKt$SubscriptionButtons$1$2$1
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                        m637invoke();
                        return ww8.a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m637invoke() {
                        qs2.this.mo865invoke();
                    }
                };
                composer2.q(A2);
            }
            composer2.R();
            ButtonKt.d((qs2) A2, d, false, null, null, null, null, null, null, composableSingletons$SubscriptionOptionsScreenKt.b(), composer2, 805306368, 508);
            composer2.R();
            composer2.t();
            composer2.R();
            composer2.R();
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = composer2.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.onboarding.compose.subscribe.SubscriptionOptionsScreenKt$SubscriptionButtons$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer3, int i4) {
                    SubscriptionOptionsScreenKt.f(qs2.this, qs2Var2, composer3, gt6.a(i | 1));
                }
            });
        }
    }

    public static final void g(final List list, final qs2 qs2Var, final qs2 qs2Var2, Composer composer, final int i) {
        zq3.h(list, "carouselItems");
        zq3.h(qs2Var, "nextScreen");
        zq3.h(qs2Var2, "openSubscriptionOptions");
        Composer h = composer.h(-1230374200);
        if (b.G()) {
            b.S(-1230374200, i, -1, "com.nytimes.android.onboarding.compose.subscribe.SubscriptionOptionsScreen (SubscriptionOptionsScreen.kt:53)");
        }
        Modifier.a aVar = Modifier.a;
        Modifier f = ScrollKt.f(SizeKt.f(aVar, 0.0f, 1, null), ScrollKt.c(0, h, 0, 1), false, null, false, 14, null);
        h.z(-483455358);
        rg4 a = d.a(Arrangement.a.g(), Alignment.a.k(), h, 0);
        h.z(-1323940314);
        int a2 = cs0.a(h, 0);
        et0 o = h.o();
        ComposeUiNode.Companion companion = ComposeUiNode.F;
        qs2 a3 = companion.a();
        it2 c = LayoutKt.c(f);
        if (h.j() == null) {
            cs0.c();
        }
        h.G();
        if (h.f()) {
            h.D(a3);
        } else {
            h.p();
        }
        Composer a4 = Updater.a(h);
        Updater.c(a4, a, companion.e());
        Updater.c(a4, o, companion.g());
        gt2 b = companion.b();
        if (a4.f() || !zq3.c(a4.A(), Integer.valueOf(a2))) {
            a4.q(Integer.valueOf(a2));
            a4.v(Integer.valueOf(a2), b);
        }
        c.invoke(ju7.a(ju7.b(h)), h, 0);
        h.z(2058660585);
        ap0 ap0Var = ap0.a;
        d(list, h, 8);
        SpacerKt.a(zo0.b(ap0Var, aVar, 1.0f, false, 2, null), h, 0);
        h(h, 0);
        SpacerKt.a(zo0.b(ap0Var, aVar, 1.0f, false, 2, null), h, 0);
        f(qs2Var2, qs2Var, h, ((i >> 6) & 14) | (i & ContentType.LONG_FORM_ON_DEMAND));
        SpacerKt.a(SizeKt.i(aVar, bu1.g(PianoSpacing.spacing_2.getInDp())), h, 0);
        h.R();
        h.t();
        h.R();
        h.R();
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.onboarding.compose.subscribe.SubscriptionOptionsScreenKt$SubscriptionOptionsScreen$2
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
                    SubscriptionOptionsScreenKt.g(list, qs2Var, qs2Var2, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(Composer composer, final int i) {
        Composer composer2;
        Composer h = composer.h(1489477430);
        if (i == 0 && h.i()) {
            h.K();
            composer2 = h;
        } else {
            if (b.G()) {
                b.S(1489477430, i, -1, "com.nytimes.android.onboarding.compose.subscribe.SubscriptionTexts (SubscriptionOptionsScreen.kt:190)");
            }
            h.z(-483455358);
            Modifier.a aVar = Modifier.a;
            rg4 a = d.a(Arrangement.a.g(), Alignment.a.k(), h, 0);
            h.z(-1323940314);
            int a2 = cs0.a(h, 0);
            et0 o = h.o();
            ComposeUiNode.Companion companion = ComposeUiNode.F;
            qs2 a3 = companion.a();
            it2 c = LayoutKt.c(aVar);
            if (h.j() == null) {
                cs0.c();
            }
            h.G();
            if (h.f()) {
                h.D(a3);
            } else {
                h.p();
            }
            Composer a4 = Updater.a(h);
            Updater.c(a4, a, companion.e());
            Updater.c(a4, o, companion.g());
            gt2 b = companion.b();
            if (a4.f() || !zq3.c(a4.A(), Integer.valueOf(a2))) {
                a4.q(Integer.valueOf(a2));
                a4.v(Integer.valueOf(a2), b);
            }
            c.invoke(ju7.a(ju7.b(h)), h, 0);
            h.z(2058660585);
            ap0 ap0Var = ap0.a;
            String b2 = k48.b(rl6.upsell_carousel_header, h, 0);
            eb5.a aVar2 = eb5.Companion;
            TextKt.c(b2, SizeKt.h(aVar, 0.0f, 1, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.c(h, 8).S0(), h, 48, 0, 65532);
            String b3 = k48.b(rl6.upsell_carousel_copy, h, 0);
            j U0 = aVar2.c(h, 8).U0();
            Modifier i2 = PaddingKt.i(SizeKt.h(aVar, 0.0f, 1, null), bu1.g(12));
            composer2 = h;
            TextKt.c(b3, i2, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, U0, composer2, 48, 0, 65532);
            composer2.R();
            composer2.t();
            composer2.R();
            composer2.R();
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = composer2.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.onboarding.compose.subscribe.SubscriptionOptionsScreenKt$SubscriptionTexts$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer3, int i3) {
                    SubscriptionOptionsScreenKt.h(composer3, gt6.a(i | 1));
                }
            });
        }
    }
}
