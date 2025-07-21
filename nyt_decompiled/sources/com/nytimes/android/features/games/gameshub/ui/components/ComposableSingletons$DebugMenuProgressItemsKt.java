package com.nytimes.android.features.games.gameshub.ui.components;

import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import defpackage.it2;
import defpackage.m37;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zr0;

/* loaded from: classes4.dex */
public final class ComposableSingletons$DebugMenuProgressItemsKt {
    public static final ComposableSingletons$DebugMenuProgressItemsKt a = new ComposableSingletons$DebugMenuProgressItemsKt();
    public static it2 b = zr0.c(209094257, false, new it2() { // from class: com.nytimes.android.features.games.gameshub.ui.components.ComposableSingletons$DebugMenuProgressItemsKt$lambda-1$1
        @Override // defpackage.it2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((m37) obj, (Composer) obj2, ((Number) obj3).intValue());
            return ww8.a;
        }

        public final void invoke(m37 m37Var, Composer composer, int i) {
            zq3.h(m37Var, "$this$DropdownMenuItem");
            if ((i & 81) == 16 && composer.i()) {
                composer.K();
                return;
            }
            if (b.G()) {
                b.S(209094257, i, -1, "com.nytimes.android.features.games.gameshub.ui.components.ComposableSingletons$DebugMenuProgressItemsKt.lambda-1.<anonymous> (DebugMenuProgressItems.kt:190)");
            }
            TextKt.c("True", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 6, 0, 131070);
            if (b.G()) {
                b.R();
            }
        }
    });
    public static it2 c = zr0.c(-1412323416, false, new it2() { // from class: com.nytimes.android.features.games.gameshub.ui.components.ComposableSingletons$DebugMenuProgressItemsKt$lambda-2$1
        @Override // defpackage.it2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((m37) obj, (Composer) obj2, ((Number) obj3).intValue());
            return ww8.a;
        }

        public final void invoke(m37 m37Var, Composer composer, int i) {
            zq3.h(m37Var, "$this$DropdownMenuItem");
            if ((i & 81) == 16 && composer.i()) {
                composer.K();
                return;
            }
            if (b.G()) {
                b.S(-1412323416, i, -1, "com.nytimes.android.features.games.gameshub.ui.components.ComposableSingletons$DebugMenuProgressItemsKt.lambda-2.<anonymous> (DebugMenuProgressItems.kt:199)");
            }
            TextKt.c("False", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 6, 0, 131070);
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
