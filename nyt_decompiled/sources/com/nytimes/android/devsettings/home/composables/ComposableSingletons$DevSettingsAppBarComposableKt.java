package com.nytimes.android.devsettings.home.composables;

import androidx.compose.material.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import defpackage.ap;
import defpackage.gt2;
import defpackage.it2;
import defpackage.m37;
import defpackage.oe3;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zr0;

/* loaded from: classes4.dex */
public final class ComposableSingletons$DevSettingsAppBarComposableKt {
    public static final ComposableSingletons$DevSettingsAppBarComposableKt a = new ComposableSingletons$DevSettingsAppBarComposableKt();
    public static it2 b = zr0.c(-1932508578, false, new it2() { // from class: com.nytimes.android.devsettings.home.composables.ComposableSingletons$DevSettingsAppBarComposableKt$lambda-1$1
        @Override // defpackage.it2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((m37) obj, (Composer) obj2, ((Number) obj3).intValue());
            return ww8.a;
        }

        public final void invoke(m37 m37Var, Composer composer, int i) {
            zq3.h(m37Var, "$this$null");
            if ((i & 81) == 16 && composer.i()) {
                composer.K();
                return;
            }
            if (b.G()) {
                b.S(-1932508578, i, -1, "com.nytimes.android.devsettings.home.composables.ComposableSingletons$DevSettingsAppBarComposableKt.lambda-1.<anonymous> (DevSettingsAppBarComposable.kt:16)");
            }
            if (b.G()) {
                b.R();
            }
        }
    });
    public static gt2 c = zr0.c(1762599481, false, new gt2() { // from class: com.nytimes.android.devsettings.home.composables.ComposableSingletons$DevSettingsAppBarComposableKt$lambda-2$1
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
                b.S(1762599481, i, -1, "com.nytimes.android.devsettings.home.composables.ComposableSingletons$DevSettingsAppBarComposableKt.lambda-2.<anonymous> (DevSettingsAppBarComposable.kt:21)");
            }
            IconKt.a(ap.a(oe3.a.a), null, null, 0L, composer, 48, 12);
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
