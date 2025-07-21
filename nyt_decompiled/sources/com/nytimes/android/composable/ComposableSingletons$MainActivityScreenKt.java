package com.nytimes.android.composable;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import com.nytimes.android.media.audio.views.AudioIndicatorLayoutKt;
import defpackage.gt2;
import defpackage.ww8;
import defpackage.zr0;

/* loaded from: classes4.dex */
public final class ComposableSingletons$MainActivityScreenKt {
    public static final ComposableSingletons$MainActivityScreenKt a = new ComposableSingletons$MainActivityScreenKt();
    public static gt2 b = zr0.c(1443812085, false, new gt2() { // from class: com.nytimes.android.composable.ComposableSingletons$MainActivityScreenKt$lambda-1$1
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
                b.S(1443812085, i, -1, "com.nytimes.android.composable.ComposableSingletons$MainActivityScreenKt.lambda-1.<anonymous> (MainActivityScreen.kt:136)");
            }
            if (b.G()) {
                b.R();
            }
        }
    });
    public static gt2 c = zr0.c(-871533896, false, new gt2() { // from class: com.nytimes.android.composable.ComposableSingletons$MainActivityScreenKt$lambda-2$1
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
                b.S(-871533896, i, -1, "com.nytimes.android.composable.ComposableSingletons$MainActivityScreenKt.lambda-2.<anonymous> (MainActivityScreen.kt:134)");
            }
            AudioIndicatorLayoutKt.a(composer, 0);
            if (b.G()) {
                b.R();
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
