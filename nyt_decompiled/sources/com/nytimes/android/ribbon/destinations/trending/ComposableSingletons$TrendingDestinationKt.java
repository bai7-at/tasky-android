package com.nytimes.android.ribbon.destinations.trending;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.Modifier;
import com.nytimes.android.designsystem.uicompose.ui.NytThemeKt;
import com.nytimes.android.ribbon.composable.XpnDividersKt;
import defpackage.bu1;
import defpackage.eb5;
import defpackage.gt2;
import defpackage.h04;
import defpackage.it2;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zr0;

/* loaded from: classes4.dex */
public final class ComposableSingletons$TrendingDestinationKt {
    public static final ComposableSingletons$TrendingDestinationKt a = new ComposableSingletons$TrendingDestinationKt();
    public static it2 b = zr0.c(447415796, false, new it2() { // from class: com.nytimes.android.ribbon.destinations.trending.ComposableSingletons$TrendingDestinationKt$lambda-1$1
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
                b.S(447415796, i, -1, "com.nytimes.android.ribbon.destinations.trending.ComposableSingletons$TrendingDestinationKt.lambda-1.<anonymous> (TrendingDestination.kt:85)");
            }
            XpnDividersKt.b("Most Shared", PaddingKt.m(Modifier.a, 0.0f, bu1.g(22), 0.0f, bu1.g(4), 5, null), false, false, null, composer, 6, 28);
            if (b.G()) {
                b.R();
            }
        }
    });
    public static gt2 c = zr0.c(1795637133, false, new gt2() { // from class: com.nytimes.android.ribbon.destinations.trending.ComposableSingletons$TrendingDestinationKt$lambda-2$1
        @Override // defpackage.gt2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return ww8.a;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) == 2 && composer.i()) {
                composer.K();
                return;
            }
            if (b.G()) {
                b.S(1795637133, i, -1, "com.nytimes.android.ribbon.destinations.trending.ComposableSingletons$TrendingDestinationKt.lambda-2.<anonymous> (TrendingDestination.kt:117)");
            }
            XpnDividersKt.b("Most Watched", PaddingKt.m(BackgroundKt.d(Modifier.a, eb5.Companion.b(composer, 8).a(), null, 2, null), 0.0f, bu1.g(22), 0.0f, bu1.g(4), 5, null), false, false, null, composer, 6, 28);
            if (b.G()) {
                b.R();
            }
        }
    });
    public static it2 d = zr0.c(-2041902307, false, new it2() { // from class: com.nytimes.android.ribbon.destinations.trending.ComposableSingletons$TrendingDestinationKt$lambda-3$1
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
                b.S(-2041902307, i, -1, "com.nytimes.android.ribbon.destinations.trending.ComposableSingletons$TrendingDestinationKt.lambda-3.<anonymous> (TrendingDestination.kt:116)");
            }
            NytThemeKt.a(true, null, null, ComposableSingletons$TrendingDestinationKt.a.b(), composer, 3078, 6);
            if (b.G()) {
                b.R();
            }
        }
    });

    public final it2 a() {
        return b;
    }

    public final gt2 b() {
        return c;
    }

    public final it2 c() {
        return d;
    }
}
