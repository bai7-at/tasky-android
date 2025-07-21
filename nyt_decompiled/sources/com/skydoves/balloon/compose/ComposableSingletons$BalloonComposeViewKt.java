package com.skydoves.balloon.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import defpackage.it2;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zr0;

/* loaded from: classes4.dex */
public final class ComposableSingletons$BalloonComposeViewKt {
    public static final ComposableSingletons$BalloonComposeViewKt a = new ComposableSingletons$BalloonComposeViewKt();
    public static it2 b = zr0.c(-1734990613, false, new it2() { // from class: com.skydoves.balloon.compose.ComposableSingletons$BalloonComposeViewKt$lambda-1$1
        public final void b(BalloonComposeView balloonComposeView, Composer composer, int i) {
            zq3.h(balloonComposeView, "it");
            if ((i & 81) == 16 && composer.i()) {
                composer.K();
                return;
            }
            if (b.G()) {
                b.S(-1734990613, i, -1, "com.skydoves.balloon.compose.ComposableSingletons$BalloonComposeViewKt.lambda-1.<anonymous> (BalloonComposeView.kt:78)");
            }
            if (b.G()) {
                b.R();
            }
        }

        @Override // defpackage.it2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((BalloonComposeView) obj, (Composer) obj2, ((Number) obj3).intValue());
            return ww8.a;
        }
    });

    public final it2 a() {
        return b;
    }
}
