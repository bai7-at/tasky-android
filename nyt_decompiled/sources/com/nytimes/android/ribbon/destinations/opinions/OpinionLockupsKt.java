package com.nytimes.android.ribbon.destinations.opinions;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.j;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentType;
import com.nytimes.android.designsystem.uicompose.ui.tpl.TPLTypography;
import com.nytimes.android.designsystem.uicompose.ui.tpl.XPNTypography;
import com.nytimes.android.ribbon.composable.ComposableSingletons$XpnModuleKt;
import com.nytimes.android.ribbon.composable.XpnLargeItemKt;
import com.nytimes.android.ribbon.composable.XpnListItemKt;
import com.nytimes.android.ribbon.composable.XpnModuleKt;
import com.nytimes.android.ribbon.composable.c;
import com.nytimes.android.ribbon.et2.Key;
import com.nytimes.android.tpl.TPLSize;
import defpackage.ac0;
import defpackage.ap0;
import defpackage.bu1;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.dh8;
import defpackage.eb5;
import defpackage.em9;
import defpackage.et0;
import defpackage.gm9;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.h04;
import defpackage.it2;
import defpackage.ju7;
import defpackage.mt2;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zo0;
import defpackage.zq3;
import defpackage.zr0;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class OpinionLockupsKt {
    private static final ThePointPersonalizedResult a = new ThePointPersonalizedResult(new ThePointArticleData("Are You Sure Your Stuff Wasn’t Made in China?", "article.com", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam.", "uri", "Opinion", "id"), new ThePointAuthorData("Peter Coy", "picture.jpg"), (Map) null, 4, (DefaultConstructorMarker) null);
    private static final OpinionItemLockupData b = new OpinionItemLockupData("DAVID WALLACE-WELLS", "John Kerry: 'I am Deeply Pissed'", "url", "uri", "image.jpg", "MARCH 10, 2024", "The departing climate envoy on what the world has and hasn't achieved", "Gimme My Tens", (Map) null, JceEncryptionConstants.SYMMETRIC_KEY_LENGTH, (DefaultConstructorMarker) null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final OpinionItemLockupData opinionItemLockupData, final qs2 qs2Var, Modifier modifier, Composer composer, final int i, final int i2) {
        Composer h = composer.h(1670848774);
        Modifier modifier2 = (i2 & 4) != 0 ? Modifier.a : modifier;
        if (b.G()) {
            b.S(1670848774, i, -1, "com.nytimes.android.ribbon.destinations.opinions.OpinionLargeItem (OpinionLockups.kt:147)");
        }
        it2 a2 = gm9.a(opinionItemLockupData.e() != null, zr0.b(h, 378312557, true, new it2() { // from class: com.nytimes.android.ribbon.destinations.opinions.OpinionLockupsKt$OpinionLargeItem$1
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
                    b.S(378312557, i3, -1, "com.nytimes.android.ribbon.destinations.opinions.OpinionLargeItem.<anonymous> (OpinionLockups.kt:159)");
                }
                ImageKt.b(em9.a(OpinionItemLockupData.this.e(), null, null, null, null, null, null, null, 0, composer2, 0, 510), "Article Image", AspectRatioKt.b(Modifier.a, 1.0f, false, 2, null), null, ContentScale.a.a(), 0.0f, null, composer2, 25008, 104);
                if (b.G()) {
                    b.R();
                }
            }
        }));
        it2 a3 = gm9.a(opinionItemLockupData.g() != null, zr0.b(h, -1325174079, true, new it2() { // from class: com.nytimes.android.ribbon.destinations.opinions.OpinionLockupsKt$OpinionLargeItem$2
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
                    b.S(-1325174079, i3, -1, "com.nytimes.android.ribbon.destinations.opinions.OpinionLargeItem.<anonymous> (OpinionLockups.kt:168)");
                }
                Modifier m = PaddingKt.m(SizeKt.h(Modifier.a, 0.0f, 1, null), 0.0f, 0.0f, TPLSize.spacing2_5.m765getValueD9Ej5fM(), 0.0f, 11, null);
                String g = OpinionItemLockupData.this.g();
                zq3.e(g);
                TextKt.c(g, m, eb5.Companion.b(composer2, 8).j(), 0L, null, null, null, 0L, null, dh8.h(dh8.b.e()), 0L, 0, false, 0, 0, null, XPNTypography.credit.getValue(), composer2, 0, 0, 65016);
                if (b.G()) {
                    b.R();
                }
            }
        }));
        it2 a4 = gm9.a(opinionItemLockupData.f() != null, zr0.b(h, 1851508585, true, new it2() { // from class: com.nytimes.android.ribbon.destinations.opinions.OpinionLockupsKt$OpinionLargeItem$3
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
                    b.S(1851508585, i3, -1, "com.nytimes.android.ribbon.destinations.opinions.OpinionLargeItem.<anonymous> (OpinionLockups.kt:179)");
                }
                j value = XPNTypography.labelOpinion.getValue();
                long j = eb5.Companion.b(composer2, 8).j();
                String f = OpinionItemLockupData.this.f();
                zq3.e(f);
                String upperCase = f.toUpperCase(Locale.ROOT);
                zq3.g(upperCase, "toUpperCase(...)");
                Modifier h2 = SizeKt.h(Modifier.a, 0.0f, 1, null);
                TPLSize tPLSize = TPLSize.spacing0_5;
                TextKt.c(upperCase, PaddingKt.m(h2, 0.0f, tPLSize.m765getValueD9Ej5fM(), 0.0f, tPLSize.m765getValueD9Ej5fM(), 5, null), j, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, value, composer2, 0, 0, 65528);
                if (b.G()) {
                    b.R();
                }
            }
        }));
        it2 a5 = gm9.a(opinionItemLockupData.h() != null, zr0.b(h, -273164024, true, new it2() { // from class: com.nytimes.android.ribbon.destinations.opinions.OpinionLockupsKt$OpinionLargeItem$4
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
                    b.S(-273164024, i3, -1, "com.nytimes.android.ribbon.destinations.opinions.OpinionLargeItem.<anonymous> (OpinionLockups.kt:189)");
                }
                String h2 = OpinionItemLockupData.this.h();
                zq3.e(h2);
                j value = TPLTypography.body16.getValue();
                TextKt.c(h2, SizeKt.h(Modifier.a, 0.0f, 1, null), eb5.Companion.b(composer2, 8).i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, value, composer2, 48, 0, 65528);
                if (b.G()) {
                    b.R();
                }
            }
        }));
        c h2 = h(c.Companion.c());
        h.z(-1072213289);
        boolean z = (((i & ContentType.LONG_FORM_ON_DEMAND) ^ 48) > 32 && h.S(qs2Var)) || (i & 48) == 32;
        Object A = h.A();
        if (z || A == Composer.a.a()) {
            A = new qs2() { // from class: com.nytimes.android.ribbon.destinations.opinions.OpinionLockupsKt$OpinionLargeItem$5$1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m712invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m712invoke() {
                    qs2.this.mo865invoke();
                }
            };
            h.q(A);
        }
        h.R();
        XpnLargeItemKt.a((qs2) A, zr0.b(h, 2036630096, true, new it2() { // from class: com.nytimes.android.ribbon.destinations.opinions.OpinionLockupsKt$OpinionLargeItem$6
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
                    b.S(2036630096, i3, -1, "com.nytimes.android.ribbon.destinations.opinions.OpinionLargeItem.<anonymous> (OpinionLockups.kt:152)");
                }
                TextKt.c(OpinionItemLockupData.this.b(), null, eb5.Companion.b(composer2, 8).g(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TPLTypography.headlineOpinion36.getValue(), composer2, 0, 0, 65530);
                if (b.G()) {
                    b.R();
                }
            }
        }), modifier2, a2, null, a3, a4, a5, null, null, null, h2, null, h, (i & 896) | 48, 0, 5904);
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            final Modifier modifier3 = modifier2;
            k.a(new gt2() { // from class: com.nytimes.android.ribbon.destinations.opinions.OpinionLockupsKt$OpinionLargeItem$7
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
                    OpinionLockupsKt.a(OpinionItemLockupData.this, qs2Var, modifier3, composer2, gt6.a(i | 1), i2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(final OpinionItemLockupData opinionItemLockupData, final qs2 qs2Var, Modifier modifier, Composer composer, final int i, final int i2) {
        Composer h = composer.h(197100817);
        Modifier modifier2 = (i2 & 4) != 0 ? Modifier.a : modifier;
        if (b.G()) {
            b.S(197100817, i, -1, "com.nytimes.android.ribbon.destinations.opinions.OpinionListItem (OpinionLockups.kt:243)");
        }
        it2 a2 = gm9.a(opinionItemLockupData.e() != null, zr0.b(h, -353603229, true, new it2() { // from class: com.nytimes.android.ribbon.destinations.opinions.OpinionLockupsKt$OpinionListItem$1
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
                    b.S(-353603229, i3, -1, "com.nytimes.android.ribbon.destinations.opinions.OpinionListItem.<anonymous> (OpinionLockups.kt:255)");
                }
                ImageKt.b(em9.a(OpinionItemLockupData.this.e(), null, null, null, null, null, null, null, 0, composer2, 0, 510), null, AspectRatioKt.b(Modifier.a, 1.0f, false, 2, null), null, ContentScale.a.a(), 0.0f, null, composer2, 25008, 104);
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
        it2 a3 = gm9.a(opinionItemLockupData.f() != null, zr0.b(h, 1755489071, true, new it2() { // from class: com.nytimes.android.ribbon.destinations.opinions.OpinionLockupsKt$OpinionListItem$2
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
                    b.S(1755489071, i3, -1, "com.nytimes.android.ribbon.destinations.opinions.OpinionListItem.<anonymous> (OpinionLockups.kt:264)");
                }
                String f = OpinionItemLockupData.this.f();
                zq3.e(f);
                String upperCase = f.toUpperCase(Locale.ROOT);
                zq3.g(upperCase, "toUpperCase(...)");
                j value = XPNTypography.labelOpinion.getValue();
                TextKt.c(upperCase, PaddingKt.m(SizeKt.h(Modifier.a, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, TPLSize.spacing0_5.m765getValueD9Ej5fM(), 7, null), eb5.Companion.b(composer2, 8).j(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, value, composer2, 0, 0, 65528);
                if (b.G()) {
                    b.R();
                }
            }
        }));
        it2 a4 = gm9.a(opinionItemLockupData.i() != null, zr0.b(h, -291606129, true, new it2() { // from class: com.nytimes.android.ribbon.destinations.opinions.OpinionLockupsKt$OpinionListItem$3
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
                    b.S(-291606129, i3, -1, "com.nytimes.android.ribbon.destinations.opinions.OpinionListItem.<anonymous> (OpinionLockups.kt:273)");
                }
                OpinionItemLockupData opinionItemLockupData2 = OpinionItemLockupData.this;
                composer2.z(-483455358);
                Modifier.a aVar = Modifier.a;
                rg4 a5 = d.a(Arrangement.a.g(), Alignment.a.k(), composer2, 0);
                composer2.z(-1323940314);
                int a6 = cs0.a(composer2, 0);
                et0 o = composer2.o();
                ComposeUiNode.Companion companion = ComposeUiNode.F;
                qs2 a7 = companion.a();
                it2 c = LayoutKt.c(aVar);
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
                Updater.c(a8, a5, companion.e());
                Updater.c(a8, o, companion.g());
                gt2 b2 = companion.b();
                if (a8.f() || !zq3.c(a8.A(), Integer.valueOf(a6))) {
                    a8.q(Integer.valueOf(a6));
                    a8.v(Integer.valueOf(a6), b2);
                }
                c.invoke(ju7.a(ju7.b(composer2)), composer2, 0);
                composer2.z(2058660585);
                ap0 ap0Var = ap0.a;
                String i4 = opinionItemLockupData2.i();
                zq3.e(i4);
                j value = TPLTypography.labelRegular.getValue();
                TextKt.c(i4, SizeKt.h(aVar, 0.0f, 1, null), eb5.Companion.b(composer2, 8).j(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, value, composer2, 48, 0, 65528);
                composer2.R();
                composer2.t();
                composer2.R();
                composer2.R();
                if (b.G()) {
                    b.R();
                }
            }
        }));
        c h2 = h(c.Companion.d());
        h.z(734072448);
        boolean z = (((i & ContentType.LONG_FORM_ON_DEMAND) ^ 48) > 32 && h.S(qs2Var)) || (i & 48) == 32;
        Object A = h.A();
        if (z || A == Composer.a.a()) {
            A = new qs2() { // from class: com.nytimes.android.ribbon.destinations.opinions.OpinionLockupsKt$OpinionListItem$4$1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m713invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m713invoke() {
                    qs2.this.mo865invoke();
                }
            };
            h.q(A);
        }
        h.R();
        XpnListItemKt.a((qs2) A, zr0.b(h, -166071140, true, new it2() { // from class: com.nytimes.android.ribbon.destinations.opinions.OpinionLockupsKt$OpinionListItem$5
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
                    b.S(-166071140, i3, -1, "com.nytimes.android.ribbon.destinations.opinions.OpinionListItem.<anonymous> (OpinionLockups.kt:248)");
                }
                TextKt.c(OpinionItemLockupData.this.b(), null, eb5.Companion.b(composer2, 8).g(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TPLTypography.headlineOpinion24.getValue(), composer2, 0, 0, 65530);
                if (b.G()) {
                    b.R();
                }
            }
        }), modifier2, a2, null, a3, null, a4, h2, null, h, (i & 896) | 48, 592);
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            final Modifier modifier3 = modifier2;
            k.a(new gt2() { // from class: com.nytimes.android.ribbon.destinations.opinions.OpinionLockupsKt$OpinionListItem$6
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
                    OpinionLockupsKt.b(OpinionItemLockupData.this, qs2Var, modifier3, composer2, gt6.a(i | 1), i2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(final OpinionItemLockupData opinionItemLockupData, final qs2 qs2Var, Modifier modifier, Composer composer, final int i, final int i2) {
        Composer h = composer.h(-1249586002);
        Modifier modifier2 = (i2 & 4) != 0 ? Modifier.a : modifier;
        if (b.G()) {
            b.S(-1249586002, i, -1, "com.nytimes.android.ribbon.destinations.opinions.OpinionListItemTopFive (OpinionLockups.kt:206)");
        }
        it2 a2 = gm9.a(opinionItemLockupData.e() != null, zr0.b(h, -2007578596, true, new it2() { // from class: com.nytimes.android.ribbon.destinations.opinions.OpinionLockupsKt$OpinionListItemTopFive$1
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
                    b.S(-2007578596, i3, -1, "com.nytimes.android.ribbon.destinations.opinions.OpinionListItemTopFive.<anonymous> (OpinionLockups.kt:218)");
                }
                ImageKt.b(em9.a(OpinionItemLockupData.this.e(), null, null, null, null, null, null, null, 0, composer2, 0, 510), null, AspectRatioKt.b(Modifier.a, 1.0f, false, 2, null), null, ContentScale.a.a(), 0.0f, null, composer2, 25008, 104);
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
        it2 a3 = gm9.a(opinionItemLockupData.f() != null, zr0.b(h, 854014160, true, new it2() { // from class: com.nytimes.android.ribbon.destinations.opinions.OpinionLockupsKt$OpinionListItemTopFive$2
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
                    b.S(854014160, i3, -1, "com.nytimes.android.ribbon.destinations.opinions.OpinionListItemTopFive.<anonymous> (OpinionLockups.kt:227)");
                }
                String f = OpinionItemLockupData.this.f();
                zq3.e(f);
                String upperCase = f.toUpperCase(Locale.ROOT);
                zq3.g(upperCase, "toUpperCase(...)");
                j value = XPNTypography.labelOpinion.getValue();
                TextKt.c(upperCase, PaddingKt.m(SizeKt.h(Modifier.a, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, TPLSize.spacing0_5.m765getValueD9Ej5fM(), 7, null), eb5.Companion.b(composer2, 8).j(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, value, composer2, 0, 0, 65528);
                if (b.G()) {
                    b.R();
                }
            }
        }));
        h.z(963933844);
        boolean z = (((i & ContentType.LONG_FORM_ON_DEMAND) ^ 48) > 32 && h.S(qs2Var)) || (i & 48) == 32;
        Object A = h.A();
        if (z || A == Composer.a.a()) {
            A = new qs2() { // from class: com.nytimes.android.ribbon.destinations.opinions.OpinionLockupsKt$OpinionListItemTopFive$3$1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m714invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m714invoke() {
                    qs2.this.mo865invoke();
                }
            };
            h.q(A);
        }
        h.R();
        XpnListItemKt.a((qs2) A, zr0.b(h, 1537401539, true, new it2() { // from class: com.nytimes.android.ribbon.destinations.opinions.OpinionLockupsKt$OpinionListItemTopFive$4
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
                    b.S(1537401539, i3, -1, "com.nytimes.android.ribbon.destinations.opinions.OpinionListItemTopFive.<anonymous> (OpinionLockups.kt:211)");
                }
                TextKt.c(OpinionItemLockupData.this.b(), null, eb5.Companion.b(composer2, 8).g(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TPLTypography.headlineOpinion24.getValue(), composer2, 0, 0, 65530);
                if (b.G()) {
                    b.R();
                }
            }
        }), modifier2, a2, null, a3, null, null, null, null, h, (i & 896) | 48, 976);
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            final Modifier modifier3 = modifier2;
            k.a(new gt2() { // from class: com.nytimes.android.ribbon.destinations.opinions.OpinionLockupsKt$OpinionListItemTopFive$5
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
                    OpinionLockupsKt.c(OpinionItemLockupData.this, qs2Var, modifier3, composer2, gt6.a(i | 1), i2);
                }
            });
        }
    }

    public static final void g(LazyListScope lazyListScope, final OpinionItemLockupData opinionItemLockupData, final it2 it2Var, LazyListState lazyListState, qs2 qs2Var, final it2 it2Var2) {
        zq3.h(lazyListScope, "<this>");
        zq3.h(opinionItemLockupData, "heroItem");
        zq3.h(it2Var, "openTopFiveArticle");
        zq3.h(lazyListState, "listState");
        zq3.h(qs2Var, "isCurrentPage");
        zq3.h(it2Var2, "onView");
        XpnModuleKt.e(lazyListScope, (r17 & 1) != 0 ? null : null, (r17 & 2) != 0 ? TPLSize.spacing3.m765getValueD9Ej5fM() : 0.0f, new Key(opinionItemLockupData.d()), new ss2() { // from class: com.nytimes.android.ribbon.destinations.opinions.OpinionLockupsKt$heroItem$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(Key key) {
                zq3.h(key, TransferTable.COLUMN_KEY);
                it2.this.invoke(key, 0, opinionItemLockupData);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((Key) obj);
                return ww8.a;
            }
        }, lazyListState, qs2Var, zr0.c(-1639154313, true, new it2() { // from class: com.nytimes.android.ribbon.destinations.opinions.OpinionLockupsKt$heroItem$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((h04) obj, (Composer) obj2, ((Number) obj3).intValue());
                return ww8.a;
            }

            public final void invoke(h04 h04Var, Composer composer, int i) {
                zq3.h(h04Var, "$this$xpnModule");
                if ((i & 81) == 16 && composer.i()) {
                    composer.K();
                    return;
                }
                if (b.G()) {
                    b.S(-1639154313, i, -1, "com.nytimes.android.ribbon.destinations.opinions.heroItem.<anonymous> (OpinionLockups.kt:57)");
                }
                final OpinionItemLockupData opinionItemLockupData2 = OpinionItemLockupData.this;
                final it2 it2Var3 = it2Var;
                OpinionLockupsKt.a(opinionItemLockupData2, new qs2() { // from class: com.nytimes.android.ribbon.destinations.opinions.OpinionLockupsKt$heroItem$2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                        m715invoke();
                        return ww8.a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m715invoke() {
                        it2.this.invoke("hero", 0, opinionItemLockupData2);
                    }
                }, null, composer, 8, 4);
                if (b.G()) {
                    b.R();
                }
            }
        }));
    }

    private static final c h(c cVar) {
        c e;
        e = cVar.e((r18 & 1) != 0 ? cVar.a : 0.0f, (r18 & 2) != 0 ? cVar.b : 0.0f, (r18 & 4) != 0 ? cVar.c : 0.0f, (r18 & 8) != 0 ? cVar.d : bu1.g(cVar.n() + bu1.g(4)), (r18 & 16) != 0 ? cVar.e : 0.0f, (r18 & 32) != 0 ? cVar.f : 0.0f, (r18 & 64) != 0 ? cVar.g : 0.0f, (r18 & 128) != 0 ? cVar.h : 0.0f);
        return e;
    }

    public static final void i(LazyListScope lazyListScope, List list, LazyListState lazyListState, qs2 qs2Var, it2 it2Var, final gt2 gt2Var) {
        zq3.h(lazyListScope, "<this>");
        zq3.h(list, "latestArticles");
        zq3.h(lazyListState, "listState");
        zq3.h(qs2Var, "isCurrentPage");
        zq3.h(it2Var, "onView");
        zq3.h(gt2Var, "onClick");
        ComposableSingletons$OpinionLockupsKt composableSingletons$OpinionLockupsKt = ComposableSingletons$OpinionLockupsKt.a;
        XpnModuleKt.c(lazyListScope, list, (r25 & 2) != 0 ? null : composableSingletons$OpinionLockupsKt.a(), (r25 & 4) != 0 ? ComposableSingletons$XpnModuleKt.a.a() : null, (r25 & 8) != 0 ? false : false, (r25 & 16) != 0 ? false : false, (r25 & 32) != 0 ? TPLSize.spacing3.m765getValueD9Ej5fM() : 0.0f, new gt2() { // from class: com.nytimes.android.ribbon.destinations.opinions.OpinionLockupsKt$theLatestArticles$1
            public final Key b(int i, OpinionItemLockupData opinionItemLockupData) {
                zq3.h(opinionItemLockupData, "item");
                return new Key(opinionItemLockupData.d());
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return b(((Number) obj).intValue(), (OpinionItemLockupData) obj2);
            }
        }, it2Var, lazyListState, qs2Var, zr0.c(-1762674068, true, new mt2() { // from class: com.nytimes.android.ribbon.destinations.opinions.OpinionLockupsKt$theLatestArticles$2
            {
                super(5);
            }

            public final void b(h04 h04Var, final int i, final OpinionItemLockupData opinionItemLockupData, Composer composer, int i2) {
                zq3.h(h04Var, "$this$xpnListModule");
                zq3.h(opinionItemLockupData, "asset");
                if (b.G()) {
                    b.S(-1762674068, i2, -1, "com.nytimes.android.ribbon.destinations.opinions.theLatestArticles.<anonymous> (OpinionLockups.kt:102)");
                }
                final gt2 gt2Var2 = gt2.this;
                OpinionLockupsKt.b(opinionItemLockupData, new qs2() { // from class: com.nytimes.android.ribbon.destinations.opinions.OpinionLockupsKt$theLatestArticles$2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                        m716invoke();
                        return ww8.a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m716invoke() {
                        gt2.this.invoke(Integer.valueOf(i), opinionItemLockupData);
                    }
                }, null, composer, 8, 4);
                if (b.G()) {
                    b.R();
                }
            }

            @Override // defpackage.mt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                b((h04) obj, ((Number) obj2).intValue(), (OpinionItemLockupData) obj3, (Composer) obj4, ((Number) obj5).intValue());
                return ww8.a;
            }
        }));
        LazyListScope.d(lazyListScope, null, null, composableSingletons$OpinionLockupsKt.b(), 3, null);
    }

    public static final void j(LazyListScope lazyListScope, List list, final it2 it2Var, LazyListState lazyListState, qs2 qs2Var, it2 it2Var2) {
        zq3.h(lazyListScope, "<this>");
        zq3.h(list, "remainingArticles");
        zq3.h(it2Var, "openTopFiveArticle");
        zq3.h(lazyListState, "listState");
        zq3.h(qs2Var, "isCurrentPage");
        zq3.h(it2Var2, "onView");
        XpnModuleKt.c(lazyListScope, list, (r25 & 2) != 0 ? null : null, (r25 & 4) != 0 ? ComposableSingletons$XpnModuleKt.a.a() : null, (r25 & 8) != 0 ? false : true, (r25 & 16) != 0 ? false : false, (r25 & 32) != 0 ? TPLSize.spacing3.m765getValueD9Ej5fM() : 0.0f, new gt2() { // from class: com.nytimes.android.ribbon.destinations.opinions.OpinionLockupsKt$topFiveArticles$1
            public final Key b(int i, OpinionItemLockupData opinionItemLockupData) {
                zq3.h(opinionItemLockupData, "item");
                return new Key(opinionItemLockupData.d());
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return b(((Number) obj).intValue(), (OpinionItemLockupData) obj2);
            }
        }, it2Var2, lazyListState, qs2Var, zr0.c(-1123553510, true, new mt2() { // from class: com.nytimes.android.ribbon.destinations.opinions.OpinionLockupsKt$topFiveArticles$2
            {
                super(5);
            }

            public final void b(h04 h04Var, final int i, final OpinionItemLockupData opinionItemLockupData, Composer composer, int i2) {
                zq3.h(h04Var, "$this$xpnListModule");
                zq3.h(opinionItemLockupData, "listItem");
                if (b.G()) {
                    b.S(-1123553510, i2, -1, "com.nytimes.android.ribbon.destinations.opinions.topFiveArticles.<anonymous> (OpinionLockups.kt:79)");
                }
                final it2 it2Var3 = it2.this;
                OpinionLockupsKt.c(opinionItemLockupData, new qs2() { // from class: com.nytimes.android.ribbon.destinations.opinions.OpinionLockupsKt$topFiveArticles$2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                        m717invoke();
                        return ww8.a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m717invoke() {
                        it2.this.invoke("recommended", Integer.valueOf(i), opinionItemLockupData);
                    }
                }, null, composer, 8, 4);
                if (b.G()) {
                    b.R();
                }
            }

            @Override // defpackage.mt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                b((h04) obj, ((Number) obj2).intValue(), (OpinionItemLockupData) obj3, (Composer) obj4, ((Number) obj5).intValue());
                return ww8.a;
            }
        }));
    }
}
