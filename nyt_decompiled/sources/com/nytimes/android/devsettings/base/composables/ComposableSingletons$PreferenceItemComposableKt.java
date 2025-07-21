package com.nytimes.android.devsettings.base.composables;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.Modifier;
import defpackage.bu1;
import defpackage.gt2;
import defpackage.it2;
import defpackage.ki8;
import defpackage.oe3;
import defpackage.ww8;
import defpackage.zo0;
import defpackage.zq3;
import defpackage.zr0;

/* loaded from: classes4.dex */
public final class ComposableSingletons$PreferenceItemComposableKt {
    public static final ComposableSingletons$PreferenceItemComposableKt a = new ComposableSingletons$PreferenceItemComposableKt();
    public static it2 b = zr0.c(517356530, false, new it2() { // from class: com.nytimes.android.devsettings.base.composables.ComposableSingletons$PreferenceItemComposableKt$lambda-1$1
        @Override // defpackage.it2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((zo0) obj, (Composer) obj2, ((Number) obj3).intValue());
            return ww8.a;
        }

        public final void invoke(zo0 zo0Var, Composer composer, int i) {
            zq3.h(zo0Var, "$this$null");
            if ((i & 81) == 16 && composer.i()) {
                composer.K();
                return;
            }
            if (b.G()) {
                b.S(517356530, i, -1, "com.nytimes.android.devsettings.base.composables.ComposableSingletons$PreferenceItemComposableKt.lambda-1.<anonymous> (PreferenceItemComposable.kt:198)");
            }
            if (b.G()) {
                b.R();
            }
        }
    });
    public static gt2 c = zr0.c(515990432, false, new gt2() { // from class: com.nytimes.android.devsettings.base.composables.ComposableSingletons$PreferenceItemComposableKt$lambda-2$1
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
                b.S(515990432, i, -1, "com.nytimes.android.devsettings.base.composables.ComposableSingletons$PreferenceItemComposableKt.lambda-2.<anonymous> (PreferenceItemComposable.kt:201)");
            }
            IconKt.a(ki8.a(oe3.a.a()), null, PaddingKt.m(Modifier.a, 0.0f, 0.0f, bu1.g(12), 0.0f, 11, null), 0L, composer, 432, 8);
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
}
