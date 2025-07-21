package com.nytimes.android;

import androidx.compose.runtime.Composer;
import com.nytimes.android.media.audio.views.AudioIndicatorLayoutKt;
import defpackage.gt2;
import defpackage.ww8;
import defpackage.zr0;

/* loaded from: classes2.dex */
public final class ComposableSingletons$SingleArticleActivityKt {
    public static final ComposableSingletons$SingleArticleActivityKt a = new ComposableSingletons$SingleArticleActivityKt();
    public static gt2 b = zr0.c(-93106732, false, new gt2() { // from class: com.nytimes.android.ComposableSingletons$SingleArticleActivityKt$lambda-1$1
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
                androidx.compose.runtime.b.S(-93106732, i, -1, "com.nytimes.android.ComposableSingletons$SingleArticleActivityKt.lambda-1.<anonymous> (SingleArticleActivity.kt:493)");
            }
            AudioIndicatorLayoutKt.a(composer, 0);
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
        }
    });

    public final gt2 a() {
        return b;
    }
}
