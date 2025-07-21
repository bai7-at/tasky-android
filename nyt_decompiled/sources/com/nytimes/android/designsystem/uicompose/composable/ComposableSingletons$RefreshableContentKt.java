package com.nytimes.android.designsystem.uicompose.composable;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.Modifier;
import defpackage.gt2;
import defpackage.ww8;
import defpackage.zr0;

/* loaded from: classes4.dex */
public final class ComposableSingletons$RefreshableContentKt {
    public static final ComposableSingletons$RefreshableContentKt a = new ComposableSingletons$RefreshableContentKt();
    public static gt2 b = zr0.c(463665654, false, new gt2() { // from class: com.nytimes.android.designsystem.uicompose.composable.ComposableSingletons$RefreshableContentKt$lambda-1$1
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
                b.S(463665654, i, -1, "com.nytimes.android.designsystem.uicompose.composable.ComposableSingletons$RefreshableContentKt.lambda-1.<anonymous> (RefreshableContent.kt:40)");
            }
            BoxKt.a(SizeKt.f(Modifier.a, 0.0f, 1, null), composer, 6);
            if (b.G()) {
                b.R();
            }
        }
    });

    public final gt2 a() {
        return b;
    }
}
