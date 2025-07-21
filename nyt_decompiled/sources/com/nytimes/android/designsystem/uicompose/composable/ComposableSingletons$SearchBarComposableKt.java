package com.nytimes.android.designsystem.uicompose.composable;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.Modifier;
import com.nytimes.android.utils.composeutils.ModifierUtilsKt;
import defpackage.bu1;
import defpackage.cp;
import defpackage.eb5;
import defpackage.em0;
import defpackage.gt2;
import defpackage.ne3;
import defpackage.oe3;
import defpackage.ww8;
import defpackage.zr0;

/* loaded from: classes4.dex */
public final class ComposableSingletons$SearchBarComposableKt {
    public static final ComposableSingletons$SearchBarComposableKt a = new ComposableSingletons$SearchBarComposableKt();
    public static gt2 b = zr0.c(-2109117451, false, new gt2() { // from class: com.nytimes.android.designsystem.uicompose.composable.ComposableSingletons$SearchBarComposableKt$lambda-1$1
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
                b.S(-2109117451, i, -1, "com.nytimes.android.designsystem.uicompose.composable.ComposableSingletons$SearchBarComposableKt.lambda-1.<anonymous> (SearchBarComposable.kt:73)");
            }
            TextKt.c("Search Articles", ModifierUtilsKt.d(Modifier.a, "Search Placeholder"), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 6, 0, 131068);
            if (b.G()) {
                b.R();
            }
        }
    });
    public static gt2 c = zr0.c(-207589768, false, new gt2() { // from class: com.nytimes.android.designsystem.uicompose.composable.ComposableSingletons$SearchBarComposableKt$lambda-2$1
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
                b.S(-207589768, i, -1, "com.nytimes.android.designsystem.uicompose.composable.ComposableSingletons$SearchBarComposableKt.lambda-2.<anonymous> (SearchBarComposable.kt:80)");
            }
            IconKt.a(cp.a(ne3.a), null, ModifierUtilsKt.d(PaddingKt.m(Modifier.a, bu1.g(12), 0.0f, bu1.g(32), 0.0f, 10, null), "Navigate back button"), eb5.Companion.a(composer, 6).l(), composer, 48, 0);
            if (b.G()) {
                b.R();
            }
        }
    });
    public static gt2 d = zr0.c(799091479, false, new gt2() { // from class: com.nytimes.android.designsystem.uicompose.composable.ComposableSingletons$SearchBarComposableKt$lambda-3$1
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
                b.S(799091479, i, -1, "com.nytimes.android.designsystem.uicompose.composable.ComposableSingletons$SearchBarComposableKt.lambda-3.<anonymous> (SearchBarComposable.kt:93)");
            }
            IconKt.a(em0.a(oe3.a.a()), null, ModifierUtilsKt.d(Modifier.a, "Clear text button"), 0L, composer, 48, 8);
            if (b.G()) {
                b.R();
            }
        }
    });

    public final gt2 a() {
        return b;
    }

    public final gt2 b() {
        return c;
    }

    public final gt2 c() {
        return d;
    }
}
