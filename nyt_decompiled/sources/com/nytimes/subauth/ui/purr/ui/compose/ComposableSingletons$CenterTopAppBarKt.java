package com.nytimes.subauth.ui.purr.ui.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import defpackage.it2;
import defpackage.m37;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zr0;

/* loaded from: classes4.dex */
public final class ComposableSingletons$CenterTopAppBarKt {
    public static final ComposableSingletons$CenterTopAppBarKt a = new ComposableSingletons$CenterTopAppBarKt();
    public static it2 b = zr0.c(6923538, false, new it2() { // from class: com.nytimes.subauth.ui.purr.ui.compose.ComposableSingletons$CenterTopAppBarKt$lambda-1$1
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
                b.S(6923538, i, -1, "com.nytimes.subauth.ui.purr.ui.compose.ComposableSingletons$CenterTopAppBarKt.lambda-1.<anonymous> (CenterTopAppBar.kt:57)");
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
