package com.nytimes.android.ribbon.composable.tabrow;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import defpackage.gt2;
import defpackage.ww8;
import defpackage.zr0;

/* loaded from: classes4.dex */
public final class ComposableSingletons$CustomScrollableTabRowKt {
    public static final ComposableSingletons$CustomScrollableTabRowKt a = new ComposableSingletons$CustomScrollableTabRowKt();
    public static gt2 b = zr0.c(1034247959, false, new gt2() { // from class: com.nytimes.android.ribbon.composable.tabrow.ComposableSingletons$CustomScrollableTabRowKt$lambda-1$1
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
                b.S(1034247959, i, -1, "com.nytimes.android.ribbon.composable.tabrow.ComposableSingletons$CustomScrollableTabRowKt.lambda-1.<anonymous> (CustomScrollableTabRow.kt:109)");
            }
            androidx.compose.material.TabRowDefaults.a.a(null, 0.0f, 0L, composer, androidx.compose.material.TabRowDefaults.e << 9, 7);
            if (b.G()) {
                b.R();
            }
        }
    });

    public final gt2 a() {
        return b;
    }
}
