package com.nytimes.android.designsystem.uicompose.composable;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.d;
import androidx.compose.material.AppBarKt;
import androidx.compose.material.SnackbarHostKt;
import androidx.compose.material.SnackbarHostState;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import com.airbnb.lottie.compose.a;
import com.comscore.streaming.ContentType;
import com.nytimes.android.designsystem.uicompose.utils.LottieAnimationDetail;
import defpackage.ap0;
import defpackage.cs0;
import defpackage.eb5;
import defpackage.et0;
import defpackage.gt2;
import defpackage.it2;
import defpackage.ju7;
import defpackage.kt2;
import defpackage.qs2;
import defpackage.rb0;
import defpackage.rg4;
import defpackage.ti0;
import defpackage.tv7;
import defpackage.un8;
import defpackage.wh;
import defpackage.ww8;
import defpackage.xn8;
import defpackage.ym5;
import defpackage.zq3;
import defpackage.zr0;

/* loaded from: classes4.dex */
public final class ComposableSingletons$NytScaffoldKt {
    public static final ComposableSingletons$NytScaffoldKt a = new ComposableSingletons$NytScaffoldKt();
    public static gt2 b = zr0.c(1708496191, false, new gt2() { // from class: com.nytimes.android.designsystem.uicompose.composable.ComposableSingletons$NytScaffoldKt$lambda-1$1
        @Override // defpackage.gt2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return ww8.a;
        }

        public final void invoke(Composer composer, int i2) {
            if ((i2 & 11) == 2 && composer.i()) {
                composer.K();
                return;
            }
            if (b.G()) {
                b.S(1708496191, i2, -1, "com.nytimes.android.designsystem.uicompose.composable.ComposableSingletons$NytScaffoldKt.lambda-1.<anonymous> (NytScaffold.kt:70)");
            }
            if (b.G()) {
                b.R();
            }
        }
    });
    public static gt2 c = zr0.c(-1783751089, false, new gt2() { // from class: com.nytimes.android.designsystem.uicompose.composable.ComposableSingletons$NytScaffoldKt$lambda-2$1
        @Override // defpackage.gt2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return ww8.a;
        }

        public final void invoke(Composer composer, int i2) {
            if ((i2 & 11) == 2 && composer.i()) {
                composer.K();
                return;
            }
            if (b.G()) {
                b.S(-1783751089, i2, -1, "com.nytimes.android.designsystem.uicompose.composable.ComposableSingletons$NytScaffoldKt.lambda-2.<anonymous> (NytScaffold.kt:71)");
            }
            if (b.G()) {
                b.R();
            }
        }
    });
    public static gt2 d = zr0.c(858585370, false, new gt2() { // from class: com.nytimes.android.designsystem.uicompose.composable.ComposableSingletons$NytScaffoldKt$lambda-3$1
        @Override // defpackage.gt2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return ww8.a;
        }

        public final void invoke(Composer composer, int i2) {
            if ((i2 & 11) == 2 && composer.i()) {
                composer.K();
                return;
            }
            if (b.G()) {
                b.S(858585370, i2, -1, "com.nytimes.android.designsystem.uicompose.composable.ComposableSingletons$NytScaffoldKt.lambda-3.<anonymous> (NytScaffold.kt:73)");
            }
            if (b.G()) {
                b.R();
            }
        }
    });
    public static it2 e = zr0.c(1622977065, false, new it2() { // from class: com.nytimes.android.designsystem.uicompose.composable.ComposableSingletons$NytScaffoldKt$lambda-4$1
        public final void b(tv7 tv7Var, Composer composer, int i2) {
            zq3.h(tv7Var, "snackbarData");
            if (b.G()) {
                b.S(1622977065, i2, -1, "com.nytimes.android.designsystem.uicompose.composable.ComposableSingletons$NytScaffoldKt.lambda-4.<anonymous> (NytScaffold.kt:78)");
            }
            CustomSnackbarKt.a(tv7Var, null, false, null, 0L, 0L, 0L, 0.0f, composer, 8, 254);
            if (b.G()) {
                b.R();
            }
        }

        @Override // defpackage.it2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((tv7) obj, (Composer) obj2, ((Number) obj3).intValue());
            return ww8.a;
        }
    });
    public static it2 f = zr0.c(406269724, false, new it2() { // from class: com.nytimes.android.designsystem.uicompose.composable.ComposableSingletons$NytScaffoldKt$lambda-5$1
        public final void b(SnackbarHostState snackbarHostState, Composer composer, int i2) {
            zq3.h(snackbarHostState, "hostState");
            if ((i2 & 14) == 0) {
                i2 |= composer.S(snackbarHostState) ? 4 : 2;
            }
            if ((i2 & 91) == 18 && composer.i()) {
                composer.K();
                return;
            }
            if (b.G()) {
                b.S(406269724, i2, -1, "com.nytimes.android.designsystem.uicompose.composable.ComposableSingletons$NytScaffoldKt.lambda-5.<anonymous> (NytScaffold.kt:75)");
            }
            SnackbarHostKt.b(snackbarHostState, null, ComposableSingletons$NytScaffoldKt.a.h(), composer, (i2 & 14) | 384, 2);
            if (b.G()) {
                b.R();
            }
        }

        @Override // defpackage.it2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((SnackbarHostState) obj, (Composer) obj2, ((Number) obj3).intValue());
            return ww8.a;
        }
    });
    public static gt2 g = zr0.c(-1585564625, false, new gt2() { // from class: com.nytimes.android.designsystem.uicompose.composable.ComposableSingletons$NytScaffoldKt$lambda-6$1
        @Override // defpackage.gt2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return ww8.a;
        }

        public final void invoke(Composer composer, int i2) {
            if ((i2 & 11) == 2 && composer.i()) {
                composer.K();
                return;
            }
            if (b.G()) {
                b.S(-1585564625, i2, -1, "com.nytimes.android.designsystem.uicompose.composable.ComposableSingletons$NytScaffoldKt.lambda-6.<anonymous> (NytScaffold.kt:84)");
            }
            if (b.G()) {
                b.R();
            }
        }
    });
    public static kt2 h = zr0.c(-910075045, false, new kt2() { // from class: com.nytimes.android.designsystem.uicompose.composable.ComposableSingletons$NytScaffoldKt$lambda-7$1
        public final void b(wh whVar, xn8 xn8Var, Composer composer, int i2) {
            zq3.h(whVar, "$this$AnimatedVisibilityByState");
            zq3.h(xn8Var, "tooltipMedium");
            if (b.G()) {
                b.S(-910075045, i2, -1, "com.nytimes.android.designsystem.uicompose.composable.ComposableSingletons$NytScaffoldKt.lambda-7.<anonymous> (NytScaffold.kt:201)");
            }
            TooltipMediumLayoutKt.a(xn8Var, null, composer, 8, 2);
            if (b.G()) {
                b.R();
            }
        }

        @Override // defpackage.kt2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            b((wh) obj, (xn8) obj2, (Composer) obj3, ((Number) obj4).intValue());
            return ww8.a;
        }
    });
    public static kt2 i = zr0.c(-2026182832, false, new kt2() { // from class: com.nytimes.android.designsystem.uicompose.composable.ComposableSingletons$NytScaffoldKt$lambda-8$1
        public final void b(wh whVar, un8 un8Var, Composer composer, int i2) {
            zq3.h(whVar, "$this$AnimatedVisibilityByState");
            zq3.h(un8Var, "tooltipLarge");
            if (b.G()) {
                b.S(-2026182832, i2, -1, "com.nytimes.android.designsystem.uicompose.composable.ComposableSingletons$NytScaffoldKt.lambda-8.<anonymous> (NytScaffold.kt:205)");
            }
            LottieAnimationDetail b2 = un8Var.b();
            composer.z(-375969414);
            a b3 = b2 == null ? null : b2.b(false, composer, 64, 1);
            composer.R();
            un8Var.a().invoke(b3, composer, 0);
            if (b.G()) {
                b.R();
            }
        }

        @Override // defpackage.kt2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            b((wh) obj, (un8) obj2, (Composer) obj3, ((Number) obj4).intValue());
            return ww8.a;
        }
    });
    public static kt2 j = zr0.c(40270685, false, new kt2() { // from class: com.nytimes.android.designsystem.uicompose.composable.ComposableSingletons$NytScaffoldKt$lambda-9$1
        public final void b(wh whVar, final ti0 ti0Var, Composer composer, int i2) {
            zq3.h(whVar, "$this$AnimatedVisibilityByState");
            zq3.h(ti0Var, "modal");
            if (b.G()) {
                b.S(40270685, i2, -1, "com.nytimes.android.designsystem.uicompose.composable.ComposableSingletons$NytScaffoldKt.lambda-9.<anonymous> (NytScaffold.kt:210)");
            }
            composer.z(-881527825);
            boolean z = (((i2 & ContentType.LONG_FORM_ON_DEMAND) ^ 48) > 32 && composer.S(ti0Var)) || (i2 & 48) == 32;
            Object A = composer.A();
            if (z || A == Composer.a.a()) {
                A = new qs2() { // from class: com.nytimes.android.designsystem.uicompose.composable.ComposableSingletons$NytScaffoldKt$lambda-9$1$1$1
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                        m340invoke();
                        return ww8.a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m340invoke() {
                        ti0.this.b().mo865invoke();
                    }
                };
                composer.q(A);
            }
            composer.R();
            AndroidDialog_androidKt.a((qs2) A, null, zr0.b(composer, -338305676, true, new gt2() { // from class: com.nytimes.android.designsystem.uicompose.composable.ComposableSingletons$NytScaffoldKt$lambda-9$1.2
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 11) == 2 && composer2.i()) {
                        composer2.K();
                        return;
                    }
                    if (b.G()) {
                        b.S(-338305676, i3, -1, "com.nytimes.android.designsystem.uicompose.composable.ComposableSingletons$NytScaffoldKt.lambda-9.<anonymous>.<anonymous> (NytScaffold.kt:211)");
                    }
                    ti0.this.a().invoke(composer2, 0);
                    if (b.G()) {
                        b.R();
                    }
                }
            }), composer, 384, 2);
            if (b.G()) {
                b.R();
            }
        }

        @Override // defpackage.kt2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            b((wh) obj, (ti0) obj2, (Composer) obj3, ((Number) obj4).intValue());
            return ww8.a;
        }
    });
    public static kt2 k = zr0.c(-879992006, false, new kt2() { // from class: com.nytimes.android.designsystem.uicompose.composable.ComposableSingletons$NytScaffoldKt$lambda-10$1
        public final void b(wh whVar, rb0 rb0Var, Composer composer, int i2) {
            zq3.h(whVar, "$this$AnimatedVisibilityByState");
            zq3.h(rb0Var, "bottomSheet");
            if (b.G()) {
                b.S(-879992006, i2, -1, "com.nytimes.android.designsystem.uicompose.composable.ComposableSingletons$NytScaffoldKt.lambda-10.<anonymous> (NytScaffold.kt:216)");
            }
            rb0Var.a().invoke(composer, 0);
            if (b.G()) {
                b.R();
            }
        }

        @Override // defpackage.kt2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            b((wh) obj, (rb0) obj2, (Composer) obj3, ((Number) obj4).intValue());
            return ww8.a;
        }
    });
    public static gt2 l = zr0.c(-200364637, false, new gt2() { // from class: com.nytimes.android.designsystem.uicompose.composable.ComposableSingletons$NytScaffoldKt$lambda-11$1
        @Override // defpackage.gt2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return ww8.a;
        }

        public final void invoke(Composer composer, int i2) {
            if ((i2 & 11) == 2 && composer.i()) {
                composer.K();
                return;
            }
            if (b.G()) {
                b.S(-200364637, i2, -1, "com.nytimes.android.designsystem.uicompose.composable.ComposableSingletons$NytScaffoldKt.lambda-11.<anonymous> (NytScaffold.kt:228)");
            }
            TextKt.c("Title", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 6, 0, 131070);
            if (b.G()) {
                b.R();
            }
        }
    });
    public static gt2 m = zr0.c(1684713959, false, new gt2() { // from class: com.nytimes.android.designsystem.uicompose.composable.ComposableSingletons$NytScaffoldKt$lambda-12$1
        @Override // defpackage.gt2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return ww8.a;
        }

        public final void invoke(Composer composer, int i2) {
            if ((i2 & 11) == 2 && composer.i()) {
                composer.K();
                return;
            }
            if (b.G()) {
                b.S(1684713959, i2, -1, "com.nytimes.android.designsystem.uicompose.composable.ComposableSingletons$NytScaffoldKt.lambda-12.<anonymous> (NytScaffold.kt:227)");
            }
            AppBarKt.d(ComposableSingletons$NytScaffoldKt.a.c(), null, null, null, eb5.Companion.a(composer, 6).d(), 0L, 0.0f, composer, 6, 110);
            if (b.G()) {
                b.R();
            }
        }
    });
    public static it2 n = zr0.c(-1349954823, false, new it2() { // from class: com.nytimes.android.designsystem.uicompose.composable.ComposableSingletons$NytScaffoldKt$lambda-13$1
        @Override // defpackage.it2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((ym5) obj, (Composer) obj2, ((Number) obj3).intValue());
            return ww8.a;
        }

        public final void invoke(ym5 ym5Var, Composer composer, int i2) {
            int i3;
            zq3.h(ym5Var, "paddingValues");
            if ((i2 & 14) == 0) {
                i3 = i2 | (composer.S(ym5Var) ? 4 : 2);
            } else {
                i3 = i2;
            }
            if ((i3 & 91) == 18 && composer.i()) {
                composer.K();
                return;
            }
            if (b.G()) {
                b.S(-1349954823, i3, -1, "com.nytimes.android.designsystem.uicompose.composable.ComposableSingletons$NytScaffoldKt.lambda-13.<anonymous> (NytScaffold.kt:233)");
            }
            Modifier h2 = PaddingKt.h(Modifier.a, ym5Var);
            composer.z(-483455358);
            rg4 a2 = d.a(Arrangement.a.g(), Alignment.a.k(), composer, 0);
            composer.z(-1323940314);
            int a3 = cs0.a(composer, 0);
            et0 o2 = composer.o();
            ComposeUiNode.Companion companion = ComposeUiNode.F;
            qs2 a4 = companion.a();
            it2 c2 = LayoutKt.c(h2);
            if (composer.j() == null) {
                cs0.c();
            }
            composer.G();
            if (composer.f()) {
                composer.D(a4);
            } else {
                composer.p();
            }
            Composer a5 = Updater.a(composer);
            Updater.c(a5, a2, companion.e());
            Updater.c(a5, o2, companion.g());
            gt2 b2 = companion.b();
            if (a5.f() || !zq3.c(a5.A(), Integer.valueOf(a3))) {
                a5.q(Integer.valueOf(a3));
                a5.v(Integer.valueOf(a3), b2);
            }
            c2.invoke(ju7.a(ju7.b(composer)), composer, 0);
            composer.z(2058660585);
            ap0 ap0Var = ap0.a;
            TextKt.c("Content", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 6, 0, 131070);
            composer.R();
            composer.t();
            composer.R();
            composer.R();
            if (b.G()) {
                b.R();
            }
        }
    });
    public static gt2 o = zr0.c(-1000199718, false, new gt2() { // from class: com.nytimes.android.designsystem.uicompose.composable.ComposableSingletons$NytScaffoldKt$lambda-14$1
        @Override // defpackage.gt2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return ww8.a;
        }

        public final void invoke(Composer composer, int i2) {
            if ((i2 & 11) == 2 && composer.i()) {
                composer.K();
                return;
            }
            if (b.G()) {
                b.S(-1000199718, i2, -1, "com.nytimes.android.designsystem.uicompose.composable.ComposableSingletons$NytScaffoldKt.lambda-14.<anonymous> (NytScaffold.kt:225)");
            }
            ComposableSingletons$NytScaffoldKt composableSingletons$NytScaffoldKt = ComposableSingletons$NytScaffoldKt.a;
            NytScaffoldKt.a(null, composableSingletons$NytScaffoldKt.d(), null, 0.0f, null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, null, null, composableSingletons$NytScaffoldKt.e(), composer, 48, 0, 6, 1048573);
            if (b.G()) {
                b.R();
            }
        }
    });

    public final gt2 a() {
        return b;
    }

    public final kt2 b() {
        return k;
    }

    public final gt2 c() {
        return l;
    }

    public final gt2 d() {
        return m;
    }

    public final it2 e() {
        return n;
    }

    public final gt2 f() {
        return c;
    }

    public final gt2 g() {
        return d;
    }

    public final it2 h() {
        return e;
    }

    public final it2 i() {
        return f;
    }

    public final gt2 j() {
        return g;
    }

    public final kt2 k() {
        return h;
    }

    public final kt2 l() {
        return i;
    }

    public final kt2 m() {
        return j;
    }
}
