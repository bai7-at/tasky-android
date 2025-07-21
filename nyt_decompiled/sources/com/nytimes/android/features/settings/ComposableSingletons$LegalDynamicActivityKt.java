package com.nytimes.android.features.settings;

import androidx.compose.material.AppBarKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import defpackage.ag4;
import defpackage.gt2;
import defpackage.ww8;
import defpackage.zr0;

/* loaded from: classes4.dex */
public final class ComposableSingletons$LegalDynamicActivityKt {
    public static final ComposableSingletons$LegalDynamicActivityKt a = new ComposableSingletons$LegalDynamicActivityKt();
    public static gt2 b = zr0.c(-266614728, false, new gt2() { // from class: com.nytimes.android.features.settings.ComposableSingletons$LegalDynamicActivityKt$lambda-1$1
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
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.S(-266614728, i, -1, "com.nytimes.android.features.settings.ComposableSingletons$LegalDynamicActivityKt.lambda-1.<anonymous> (LegalDynamicActivity.kt:45)");
            }
            TextKt.c("Legal", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 6, 0, 131070);
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
        }
    });
    public static gt2 c = zr0.c(-1976416908, false, new gt2() { // from class: com.nytimes.android.features.settings.ComposableSingletons$LegalDynamicActivityKt$lambda-2$1
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
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.S(-1976416908, i, -1, "com.nytimes.android.features.settings.ComposableSingletons$LegalDynamicActivityKt.lambda-2.<anonymous> (LegalDynamicActivity.kt:44)");
            }
            AppBarKt.d(ComposableSingletons$LegalDynamicActivityKt.a.a(), null, null, null, ag4.a.a(composer, ag4.b).c(), 0L, 0.0f, composer, 6, 110);
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
        }
    });

    public final gt2 a() {
        return b;
    }

    public final gt2 b() {
        return c;
    }
}
