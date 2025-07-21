package com.nytimes.android.tabs.composable;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import defpackage.it2;
import defpackage.m37;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zr0;

/* loaded from: classes4.dex */
public final class ComposableSingletons$MainTopAppBarKt {
    public static final ComposableSingletons$MainTopAppBarKt a = new ComposableSingletons$MainTopAppBarKt();
    public static it2 b = zr0.c(-1843836917, false, new it2() { // from class: com.nytimes.android.tabs.composable.ComposableSingletons$MainTopAppBarKt$lambda-1$1
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
                b.S(-1843836917, i, -1, "com.nytimes.android.tabs.composable.ComposableSingletons$MainTopAppBarKt.lambda-1.<anonymous> (MainTopAppBar.kt:27)");
            }
            if (b.G()) {
                b.R();
            }
        }
    });

    public final it2 a() {
        return b;
    }
}
