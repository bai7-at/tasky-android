package com.nytimes.android.ribbon.destinations.wirecutter;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.d;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import com.comscore.streaming.ContentType;
import com.nytimes.android.designsystem.uicompose.ui.tpl.TPLTypography;
import com.nytimes.android.designsystem.uicompose.ui.tpl.XPNTypography;
import com.nytimes.android.ribbon.composable.XpnArticleItemKt;
import com.nytimes.android.ribbon.composable.XpnLargeItemKt;
import com.nytimes.android.ribbon.composable.XpnListItemKt;
import defpackage.ac0;
import defpackage.ap0;
import defpackage.bu1;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.dh8;
import defpackage.eb5;
import defpackage.ei9;
import defpackage.em9;
import defpackage.et0;
import defpackage.fi9;
import defpackage.gm9;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.it2;
import defpackage.ju7;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.ww8;
import defpackage.zo0;
import defpackage.zq3;
import defpackage.zr0;

/* loaded from: classes4.dex */
public abstract class WirecutterLockupsKt {
    private static final ei9 a = new ei9("", "", "The Best Surface Cleaners and Disinfectants", "The impressively supportive, adjustable, and durable Steelcase Gesture is still our pick for the best office chair for most people, as it has been since 2015.", "media", "firstName lastName", null, 64, null);
    private static final fi9 b = new fi9(null, "WCD", "The Recommendation", "Independent reviews, expert advice, and intensively researched deals from Wirecutter experts.");

    public static final void a(final ei9 ei9Var, final qs2 qs2Var, Modifier modifier, Composer composer, final int i, final int i2) {
        zq3.h(ei9Var, "wirecutterLockupData");
        zq3.h(qs2Var, "onClick");
        Composer h = composer.h(-1096379783);
        Modifier modifier2 = (i2 & 4) != 0 ? Modifier.a : modifier;
        if (b.G()) {
            b.S(-1096379783, i, -1, "com.nytimes.android.ribbon.destinations.wirecutter.WirecutterArticleItem (WirecutterLockups.kt:118)");
        }
        it2 a2 = gm9.a(ei9Var.e() != null, zr0.b(h, 182696116, true, new it2() { // from class: com.nytimes.android.ribbon.destinations.wirecutter.WirecutterLockupsKt$WirecutterArticleItem$1
            {
                super(3);
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((zo0) obj, (Composer) obj2, ((Number) obj3).intValue());
                return ww8.a;
            }

            public final void invoke(zo0 zo0Var, Composer composer2, int i3) {
                zq3.h(zo0Var, "$this$showScopedComposableOrNull");
                if ((i3 & 81) == 16 && composer2.i()) {
                    composer2.K();
                    return;
                }
                if (b.G()) {
                    b.S(182696116, i3, -1, "com.nytimes.android.ribbon.destinations.wirecutter.WirecutterArticleItem.<anonymous> (WirecutterLockups.kt:130)");
                }
                String e = ei9.this.e();
                zq3.e(e);
                TextKt.c(e, null, eb5.Companion.b(composer2, 8).i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TPLTypography.body16.getValue(), composer2, 0, 0, 65530);
                if (b.G()) {
                    b.R();
                }
            }
        }));
        it2 a3 = gm9.a(ei9Var.c() != null, zr0.b(h, 1189484595, true, new it2() { // from class: com.nytimes.android.ribbon.destinations.wirecutter.WirecutterLockupsKt$WirecutterArticleItem$2
            {
                super(3);
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((zo0) obj, (Composer) obj2, ((Number) obj3).intValue());
                return ww8.a;
            }

            public final void invoke(zo0 zo0Var, Composer composer2, int i3) {
                zq3.h(zo0Var, "$this$showScopedComposableOrNull");
                if ((i3 & 81) == 16 && composer2.i()) {
                    composer2.K();
                    return;
                }
                if (b.G()) {
                    b.S(1189484595, i3, -1, "com.nytimes.android.ribbon.destinations.wirecutter.WirecutterArticleItem.<anonymous> (WirecutterLockups.kt:137)");
                }
                ImageKt.b(em9.a(ei9.this.c(), null, null, null, null, null, null, null, 0, composer2, 0, 510), null, AspectRatioKt.b(SizeKt.h(Modifier.a, 0.0f, 1, null), 1.0f, false, 2, null), null, ContentScale.a.a(), 0.0f, null, composer2, 25008, 104);
                if (b.G()) {
                    b.R();
                }
            }
        }));
        it2 a4 = gm9.a(ei9Var.d() != null, zr0.b(h, 1639863037, true, new it2() { // from class: com.nytimes.android.ribbon.destinations.wirecutter.WirecutterLockupsKt$WirecutterArticleItem$3
            {
                super(3);
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((zo0) obj, (Composer) obj2, ((Number) obj3).intValue());
                return ww8.a;
            }

            public final void invoke(zo0 zo0Var, Composer composer2, int i3) {
                zq3.h(zo0Var, "$this$showScopedComposableOrNull");
                if ((i3 & 81) == 16 && composer2.i()) {
                    composer2.K();
                    return;
                }
                if (b.G()) {
                    b.S(1639863037, i3, -1, "com.nytimes.android.ribbon.destinations.wirecutter.WirecutterArticleItem.<anonymous> (WirecutterLockups.kt:147)");
                }
                Modifier h2 = SizeKt.h(Modifier.a, 0.0f, 1, null);
                String d = ei9.this.d();
                if (d == null) {
                    d = "";
                }
                TextKt.c(d, h2, 0L, 0L, null, null, null, 0L, null, dh8.h(dh8.b.e()), 0L, 0, false, 0, 0, null, XPNTypography.credit.getValue(), composer2, 48, 0, 65020);
                if (b.G()) {
                    b.R();
                }
            }
        }));
        h.z(-474384425);
        boolean z = (((i & ContentType.LONG_FORM_ON_DEMAND) ^ 48) > 32 && h.S(qs2Var)) || (i & 48) == 32;
        Object A = h.A();
        if (z || A == Composer.a.a()) {
            A = new qs2() { // from class: com.nytimes.android.ribbon.destinations.wirecutter.WirecutterLockupsKt$WirecutterArticleItem$4$1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m742invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m742invoke() {
                    qs2.this.mo865invoke();
                }
            };
            h.q(A);
        }
        h.R();
        XpnArticleItemKt.a((qs2) A, zr0.b(h, -74111510, true, new it2() { // from class: com.nytimes.android.ribbon.destinations.wirecutter.WirecutterLockupsKt$WirecutterArticleItem$5
            {
                super(3);
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((zo0) obj, (Composer) obj2, ((Number) obj3).intValue());
                return ww8.a;
            }

            public final void invoke(zo0 zo0Var, Composer composer2, int i3) {
                zq3.h(zo0Var, "$this$XpnArticleItem");
                if ((i3 & 81) == 16 && composer2.i()) {
                    composer2.K();
                    return;
                }
                if (b.G()) {
                    b.S(-74111510, i3, -1, "com.nytimes.android.ribbon.destinations.wirecutter.WirecutterArticleItem.<anonymous> (WirecutterLockups.kt:123)");
                }
                TextKt.c(ei9.this.b(), null, eb5.Companion.b(composer2, 8).g(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, XPNTypography.headline28.getValue(), composer2, 0, 0, 65530);
                if (b.G()) {
                    b.R();
                }
            }
        }), modifier2, a3, a4, null, a2, null, null, null, h, (i & 896) | 48, 928);
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            final Modifier modifier3 = modifier2;
            k.a(new gt2() { // from class: com.nytimes.android.ribbon.destinations.wirecutter.WirecutterLockupsKt$WirecutterArticleItem$6
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
                    WirecutterLockupsKt.a(ei9.this, qs2Var, modifier3, composer2, gt6.a(i | 1), i2);
                }
            });
        }
    }

    public static final void b(final ei9 ei9Var, final qs2 qs2Var, Modifier modifier, Composer composer, final int i, final int i2) {
        zq3.h(ei9Var, "wirecutterLockupData");
        zq3.h(qs2Var, "onClick");
        Composer h = composer.h(-1849348063);
        Modifier modifier2 = (i2 & 4) != 0 ? Modifier.a : modifier;
        if (b.G()) {
            b.S(-1849348063, i, -1, "com.nytimes.android.ribbon.destinations.wirecutter.WirecutterHeroItem (WirecutterLockups.kt:40)");
        }
        it2 a2 = gm9.a(ei9Var.c() != null, zr0.b(h, -521405112, true, new it2() { // from class: com.nytimes.android.ribbon.destinations.wirecutter.WirecutterLockupsKt$WirecutterHeroItem$1
            {
                super(3);
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((zo0) obj, (Composer) obj2, ((Number) obj3).intValue());
                return ww8.a;
            }

            public final void invoke(zo0 zo0Var, Composer composer2, int i3) {
                zq3.h(zo0Var, "$this$showScopedComposableOrNull");
                if ((i3 & 81) == 16 && composer2.i()) {
                    composer2.K();
                    return;
                }
                if (b.G()) {
                    b.S(-521405112, i3, -1, "com.nytimes.android.ribbon.destinations.wirecutter.WirecutterHeroItem.<anonymous> (WirecutterLockups.kt:54)");
                }
                ei9 ei9Var2 = ei9.this;
                composer2.z(-483455358);
                Modifier.a aVar = Modifier.a;
                rg4 a3 = d.a(Arrangement.a.g(), Alignment.a.k(), composer2, 0);
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
                ap0 ap0Var = ap0.a;
                ImageKt.b(em9.a(ei9Var2.c(), null, null, null, null, null, null, null, 0, composer2, 0, 510), null, AspectRatioKt.b(aVar, 1.0f, false, 2, null), null, ContentScale.a.a(), 0.0f, null, composer2, 25008, 104);
                composer2.R();
                composer2.t();
                composer2.R();
                composer2.R();
                if (b.G()) {
                    b.R();
                }
            }
        }));
        h.z(-806309679);
        boolean z = (((i & ContentType.LONG_FORM_ON_DEMAND) ^ 48) > 32 && h.S(qs2Var)) || (i & 48) == 32;
        Object A = h.A();
        if (z || A == Composer.a.a()) {
            A = new qs2() { // from class: com.nytimes.android.ribbon.destinations.wirecutter.WirecutterLockupsKt$WirecutterHeroItem$2$1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m743invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m743invoke() {
                    qs2.this.mo865invoke();
                }
            };
            h.q(A);
        }
        h.R();
        XpnLargeItemKt.a((qs2) A, zr0.b(h, -523046421, true, new it2() { // from class: com.nytimes.android.ribbon.destinations.wirecutter.WirecutterLockupsKt$WirecutterHeroItem$3
            {
                super(3);
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((zo0) obj, (Composer) obj2, ((Number) obj3).intValue());
                return ww8.a;
            }

            public final void invoke(zo0 zo0Var, Composer composer2, int i3) {
                zq3.h(zo0Var, "$this$XpnLargeItem");
                if ((i3 & 81) == 16 && composer2.i()) {
                    composer2.K();
                    return;
                }
                if (b.G()) {
                    b.S(-523046421, i3, -1, "com.nytimes.android.ribbon.destinations.wirecutter.WirecutterHeroItem.<anonymous> (WirecutterLockups.kt:45)");
                }
                ei9 ei9Var2 = ei9.this;
                composer2.z(-483455358);
                Modifier.a aVar = Modifier.a;
                rg4 a3 = d.a(Arrangement.a.g(), Alignment.a.k(), composer2, 0);
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
                ap0 ap0Var = ap0.a;
                TextKt.c(ei9Var2.b(), null, eb5.Companion.b(composer2, 8).g(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, XPNTypography.headline28.getValue(), composer2, 0, 0, 65530);
                composer2.R();
                composer2.t();
                composer2.R();
                composer2.R();
                if (b.G()) {
                    b.R();
                }
            }
        }), modifier2, a2, null, zr0.b(h, -1902709401, true, new it2() { // from class: com.nytimes.android.ribbon.destinations.wirecutter.WirecutterLockupsKt$WirecutterHeroItem$4
            {
                super(3);
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((zo0) obj, (Composer) obj2, ((Number) obj3).intValue());
                return ww8.a;
            }

            public final void invoke(zo0 zo0Var, Composer composer2, int i3) {
                zq3.h(zo0Var, "$this$XpnLargeItem");
                if ((i3 & 81) == 16 && composer2.i()) {
                    composer2.K();
                    return;
                }
                if (b.G()) {
                    b.S(-1902709401, i3, -1, "com.nytimes.android.ribbon.destinations.wirecutter.WirecutterHeroItem.<anonymous> (WirecutterLockups.kt:65)");
                }
                Modifier m = PaddingKt.m(SizeKt.h(Modifier.a, 0.0f, 1, null), 0.0f, 0.0f, bu1.g(20), 0.0f, 11, null);
                String d = ei9.this.d();
                if (d == null) {
                    d = "";
                }
                TextKt.c(d, m, 0L, 0L, null, null, null, 0L, null, dh8.h(dh8.b.e()), 0L, 0, false, 0, 0, null, XPNTypography.credit.getValue(), composer2, 48, 0, 65020);
                if (b.G()) {
                    b.R();
                }
            }
        }), null, null, null, null, null, null, null, h, (i & 896) | 196656, 0, 8144);
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            final Modifier modifier3 = modifier2;
            k.a(new gt2() { // from class: com.nytimes.android.ribbon.destinations.wirecutter.WirecutterLockupsKt$WirecutterHeroItem$5
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
                    WirecutterLockupsKt.b(ei9.this, qs2Var, modifier3, composer2, gt6.a(i | 1), i2);
                }
            });
        }
    }

    public static final void c(final ei9 ei9Var, final qs2 qs2Var, Modifier modifier, Composer composer, final int i, final int i2) {
        zq3.h(ei9Var, "wirecutterLockupData");
        zq3.h(qs2Var, "onClick");
        Composer h = composer.h(-1280100411);
        Modifier modifier2 = (i2 & 4) != 0 ? Modifier.a : modifier;
        if (b.G()) {
            b.S(-1280100411, i, -1, "com.nytimes.android.ribbon.destinations.wirecutter.WirecutterListItem (WirecutterLockups.kt:82)");
        }
        it2 a2 = gm9.a(ei9Var.c() != null, zr0.b(h, -2038093005, true, new it2() { // from class: com.nytimes.android.ribbon.destinations.wirecutter.WirecutterLockupsKt$WirecutterListItem$1
            {
                super(3);
            }

            public final void b(ac0 ac0Var, Composer composer2, int i3) {
                zq3.h(ac0Var, "$this$showScopedComposableOrNull");
                if ((i3 & 81) == 16 && composer2.i()) {
                    composer2.K();
                    return;
                }
                if (b.G()) {
                    b.S(-2038093005, i3, -1, "com.nytimes.android.ribbon.destinations.wirecutter.WirecutterListItem.<anonymous> (WirecutterLockups.kt:94)");
                }
                ImageKt.b(em9.a(ei9.this.c(), null, null, null, null, null, null, null, 0, composer2, 0, 510), null, AspectRatioKt.b(SizeKt.n(Modifier.a, bu1.g(96)), 1.0f, false, 2, null), null, ContentScale.a.a(), 0.0f, null, composer2, 25008, 104);
                if (b.G()) {
                    b.R();
                }
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                b((ac0) obj, (Composer) obj2, ((Number) obj3).intValue());
                return ww8.a;
            }
        }));
        it2 a3 = gm9.a(ei9Var.e() != null, zr0.b(h, 252636937, true, new it2() { // from class: com.nytimes.android.ribbon.destinations.wirecutter.WirecutterLockupsKt$WirecutterListItem$2
            {
                super(3);
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((zo0) obj, (Composer) obj2, ((Number) obj3).intValue());
                return ww8.a;
            }

            public final void invoke(zo0 zo0Var, Composer composer2, int i3) {
                zq3.h(zo0Var, "$this$showScopedComposableOrNull");
                if ((i3 & 81) == 16 && composer2.i()) {
                    composer2.K();
                    return;
                }
                if (b.G()) {
                    b.S(252636937, i3, -1, "com.nytimes.android.ribbon.destinations.wirecutter.WirecutterListItem.<anonymous> (WirecutterLockups.kt:104)");
                }
                String e = ei9.this.e();
                zq3.e(e);
                TextKt.c(e, null, eb5.Companion.b(composer2, 8).i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TPLTypography.body16.getValue(), composer2, 0, 0, 65530);
                if (b.G()) {
                    b.R();
                }
            }
        }));
        h.z(-34235445);
        boolean z = (((i & ContentType.LONG_FORM_ON_DEMAND) ^ 48) > 32 && h.S(qs2Var)) || (i & 48) == 32;
        Object A = h.A();
        if (z || A == Composer.a.a()) {
            A = new qs2() { // from class: com.nytimes.android.ribbon.destinations.wirecutter.WirecutterLockupsKt$WirecutterListItem$3$1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m744invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m744invoke() {
                    qs2.this.mo865invoke();
                }
            };
            h.q(A);
        }
        h.R();
        XpnListItemKt.a((qs2) A, zr0.b(h, 1506887130, true, new it2() { // from class: com.nytimes.android.ribbon.destinations.wirecutter.WirecutterLockupsKt$WirecutterListItem$4
            {
                super(3);
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((zo0) obj, (Composer) obj2, ((Number) obj3).intValue());
                return ww8.a;
            }

            public final void invoke(zo0 zo0Var, Composer composer2, int i3) {
                zq3.h(zo0Var, "$this$XpnListItem");
                if ((i3 & 81) == 16 && composer2.i()) {
                    composer2.K();
                    return;
                }
                if (b.G()) {
                    b.S(1506887130, i3, -1, "com.nytimes.android.ribbon.destinations.wirecutter.WirecutterListItem.<anonymous> (WirecutterLockups.kt:87)");
                }
                TextKt.c(ei9.this.b(), null, eb5.Companion.b(composer2, 8).g(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, XPNTypography.headline20.getValue(), composer2, 0, 0, 65530);
                if (b.G()) {
                    b.R();
                }
            }
        }), modifier2, a2, null, null, a3, null, null, null, h, (i & 896) | 48, 944);
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            final Modifier modifier3 = modifier2;
            k.a(new gt2() { // from class: com.nytimes.android.ribbon.destinations.wirecutter.WirecutterLockupsKt$WirecutterListItem$5
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
                    WirecutterLockupsKt.c(ei9.this, qs2Var, modifier3, composer2, gt6.a(i | 1), i2);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final defpackage.fi9 r33, final boolean r34, final defpackage.ss2 r35, androidx.compose.ui.Modifier r36, androidx.compose.runtime.Composer r37, final int r38, final int r39) {
        /*
            Method dump skipped, instructions count: 1373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.ribbon.destinations.wirecutter.WirecutterLockupsKt.d(fi9, boolean, ss2, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final fi9 e() {
        return b;
    }
}
