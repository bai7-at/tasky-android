package com.nytimes.android.ribbon.destinations.games;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.j;
import com.nytimes.android.designsystem.uicompose.ui.tpl.XPNTypography;
import com.nytimes.android.ribbon.composable.XpnDividersKt;
import com.nytimes.android.tpl.TPLSize;
import defpackage.eb5;
import defpackage.h04;
import defpackage.it2;
import defpackage.ww8;
import defpackage.zo0;
import defpackage.zq3;
import defpackage.zr0;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class ComposableSingletons$GamesLockupsKt {
    public static final ComposableSingletons$GamesLockupsKt a = new ComposableSingletons$GamesLockupsKt();
    public static it2 b = zr0.c(1644408776, false, new it2() { // from class: com.nytimes.android.ribbon.destinations.games.ComposableSingletons$GamesLockupsKt$lambda-1$1
        @Override // defpackage.it2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((zo0) obj, (Composer) obj2, ((Number) obj3).intValue());
            return ww8.a;
        }

        public final void invoke(zo0 zo0Var, Composer composer, int i) {
            zq3.h(zo0Var, "$this$XpnLargeItem");
            if ((i & 81) == 16 && composer.i()) {
                composer.K();
                return;
            }
            if (b.G()) {
                b.S(1644408776, i, -1, "com.nytimes.android.ribbon.destinations.games.ComposableSingletons$GamesLockupsKt.lambda-1.<anonymous> (GamesLockups.kt:62)");
            }
            String upperCase = "featured game".toUpperCase(Locale.ROOT);
            zq3.g(upperCase, "toUpperCase(...)");
            j value = XPNTypography.labelMedium.getValue();
            TextKt.c(upperCase, PaddingKt.m(Modifier.a, 0.0f, TPLSize.spacing1.m765getValueD9Ej5fM(), 0.0f, 0.0f, 13, null), eb5.Companion.b(composer, 8).g(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, value, composer, 0, 0, 65528);
            if (b.G()) {
                b.R();
            }
        }
    });
    public static it2 c = zr0.c(381524221, false, new it2() { // from class: com.nytimes.android.ribbon.destinations.games.ComposableSingletons$GamesLockupsKt$lambda-2$1
        @Override // defpackage.it2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((h04) obj, (Composer) obj2, ((Number) obj3).intValue());
            return ww8.a;
        }

        public final void invoke(h04 h04Var, Composer composer, int i) {
            zq3.h(h04Var, "$this$xpnListModule");
            if ((i & 81) == 16 && composer.i()) {
                composer.K();
                return;
            }
            if (b.G()) {
                b.S(381524221, i, -1, "com.nytimes.android.ribbon.destinations.games.ComposableSingletons$GamesLockupsKt.lambda-2.<anonymous> (GamesLockups.kt:180)");
            }
            XpnDividersKt.b("Tips and Tricks", null, false, false, null, composer, 6, 30);
            if (b.G()) {
                b.R();
            }
        }
    });

    public final it2 a() {
        return c;
    }
}
