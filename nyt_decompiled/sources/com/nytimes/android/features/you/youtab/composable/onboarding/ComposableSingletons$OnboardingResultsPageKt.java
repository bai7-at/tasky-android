package com.nytimes.android.features.you.youtab.composable.onboarding;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.d;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import defpackage.ap0;
import defpackage.bu1;
import defpackage.cs0;
import defpackage.eb5;
import defpackage.et0;
import defpackage.gt2;
import defpackage.h04;
import defpackage.it2;
import defpackage.ju7;
import defpackage.k48;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.ww8;
import defpackage.yk6;
import defpackage.zq3;
import defpackage.zr0;

/* loaded from: classes4.dex */
public final class ComposableSingletons$OnboardingResultsPageKt {
    public static final ComposableSingletons$OnboardingResultsPageKt a = new ComposableSingletons$OnboardingResultsPageKt();
    public static it2 b = zr0.c(-121916262, false, new it2() { // from class: com.nytimes.android.features.you.youtab.composable.onboarding.ComposableSingletons$OnboardingResultsPageKt$lambda-1$1
        @Override // defpackage.it2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((h04) obj, (Composer) obj2, ((Number) obj3).intValue());
            return ww8.a;
        }

        public final void invoke(h04 h04Var, Composer composer, int i) {
            zq3.h(h04Var, "$this$item");
            if ((i & 81) == 16 && composer.i()) {
                composer.K();
                return;
            }
            if (b.G()) {
                b.S(-121916262, i, -1, "com.nytimes.android.features.you.youtab.composable.onboarding.ComposableSingletons$OnboardingResultsPageKt.lambda-1.<anonymous> (OnboardingResultsPage.kt:75)");
            }
            composer.z(-483455358);
            Modifier.a aVar = Modifier.a;
            rg4 a2 = d.a(Arrangement.a.g(), Alignment.a.k(), composer, 0);
            composer.z(-1323940314);
            int a3 = cs0.a(composer, 0);
            et0 o = composer.o();
            ComposeUiNode.Companion companion = ComposeUiNode.F;
            qs2 a4 = companion.a();
            it2 c2 = LayoutKt.c(aVar);
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
            Updater.c(a5, o, companion.g());
            gt2 b2 = companion.b();
            if (a5.f() || !zq3.c(a5.A(), Integer.valueOf(a3))) {
                a5.q(Integer.valueOf(a3));
                a5.v(Integer.valueOf(a3), b2);
            }
            c2.invoke(ju7.a(ju7.b(composer)), composer, 0);
            composer.z(2058660585);
            ap0 ap0Var = ap0.a;
            String b3 = k48.b(yk6.onboarding_step_two, composer, 0);
            eb5.a aVar2 = eb5.Companion;
            TextKt.b(b3, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.c(composer, 8).E0(), composer, 0, 0, 65534);
            float f = 12;
            SpacerKt.a(SizeKt.i(aVar, bu1.g(f)), composer, 6);
            TextKt.b(k48.b(yk6.onboarding_review_title, composer, 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.c(composer, 8).D0(), composer, 0, 0, 65534);
            SpacerKt.a(SizeKt.i(aVar, bu1.g(f)), composer, 6);
            TextKt.b(k48.b(yk6.onboarding_review_description, composer, 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.c(composer, 8).C0(), composer, 0, 0, 65534);
            SpacerKt.a(SizeKt.n(aVar, bu1.g(28)), composer, 6);
            composer.R();
            composer.t();
            composer.R();
            composer.R();
            if (b.G()) {
                b.R();
            }
        }
    });
    public static it2 c = zr0.c(-166605360, false, new it2() { // from class: com.nytimes.android.features.you.youtab.composable.onboarding.ComposableSingletons$OnboardingResultsPageKt$lambda-2$1
        @Override // defpackage.it2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((h04) obj, (Composer) obj2, ((Number) obj3).intValue());
            return ww8.a;
        }

        public final void invoke(h04 h04Var, Composer composer, int i) {
            zq3.h(h04Var, "$this$item");
            if ((i & 81) == 16 && composer.i()) {
                composer.K();
                return;
            }
            if (b.G()) {
                b.S(-166605360, i, -1, "com.nytimes.android.features.you.youtab.composable.onboarding.ComposableSingletons$OnboardingResultsPageKt.lambda-2.<anonymous> (OnboardingResultsPage.kt:184)");
            }
            SpacerKt.a(SizeKt.i(Modifier.a, bu1.g(4)), composer, 6);
            if (b.G()) {
                b.R();
            }
        }
    });

    public final it2 a() {
        return b;
    }

    public final it2 b() {
        return c;
    }
}
