package com.nytimes.android.media.audio.views;

import androidx.compose.runtime.Composer;
import defpackage.it2;
import defpackage.m37;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zr0;

/* loaded from: classes4.dex */
public final class ComposableSingletons$AudioIndicatorLayoutKt {
    public static final ComposableSingletons$AudioIndicatorLayoutKt a = new ComposableSingletons$AudioIndicatorLayoutKt();
    public static it2 b = zr0.c(1493350067, false, new it2() { // from class: com.nytimes.android.media.audio.views.ComposableSingletons$AudioIndicatorLayoutKt$lambda-1$1
        @Override // defpackage.it2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((m37) obj, (Composer) obj2, ((Number) obj3).intValue());
            return ww8.a;
        }

        public final void invoke(m37 m37Var, Composer composer, int i) {
            zq3.h(m37Var, "$this$SwipeToDismiss");
            if ((i & 81) == 16 && composer.i()) {
                composer.K();
                return;
            }
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.S(1493350067, i, -1, "com.nytimes.android.media.audio.views.ComposableSingletons$AudioIndicatorLayoutKt.lambda-1.<anonymous> (AudioIndicatorLayout.kt:46)");
            }
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
        }
    });

    public final it2 a() {
        return b;
    }
}
