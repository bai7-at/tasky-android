package com.nytimes.android.features.you.youtab.composable;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.Modifier;
import com.nytimes.android.designsystem.uicompose.ui.tpl.TPLTypography;
import defpackage.bu1;
import defpackage.it2;
import defpackage.k48;
import defpackage.m37;
import defpackage.ww8;
import defpackage.yk6;
import defpackage.zq3;
import defpackage.zr0;

/* loaded from: classes4.dex */
public final class ComposableSingletons$LoggedOutContentKt {
    public static final ComposableSingletons$LoggedOutContentKt a = new ComposableSingletons$LoggedOutContentKt();
    public static it2 b = zr0.c(-952415784, false, new it2() { // from class: com.nytimes.android.features.you.youtab.composable.ComposableSingletons$LoggedOutContentKt$lambda-1$1
        @Override // defpackage.it2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((m37) obj, (Composer) obj2, ((Number) obj3).intValue());
            return ww8.a;
        }

        public final void invoke(m37 m37Var, Composer composer, int i) {
            zq3.h(m37Var, "$this$OutlinedButton");
            if ((i & 81) == 16 && composer.i()) {
                composer.K();
                return;
            }
            if (b.G()) {
                b.S(-952415784, i, -1, "com.nytimes.android.features.you.youtab.composable.ComposableSingletons$LoggedOutContentKt.lambda-1.<anonymous> (LoggedOutContent.kt:167)");
            }
            TextKt.c(k48.b(yk6.log_in, composer, 0), PaddingKt.k(Modifier.a, 0.0f, bu1.g(8), 1, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TPLTypography.title16.getValue(), composer, 48, 0, 65532);
            if (b.G()) {
                b.R();
            }
        }
    });

    public final it2 a() {
        return b;
    }
}
