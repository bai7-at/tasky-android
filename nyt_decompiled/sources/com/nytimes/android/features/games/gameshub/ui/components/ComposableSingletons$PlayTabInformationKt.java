package com.nytimes.android.features.games.gameshub.ui.components;

import androidx.compose.foundation.ImageKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import defpackage.do5;
import defpackage.it2;
import defpackage.me6;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zr0;

/* loaded from: classes4.dex */
public final class ComposableSingletons$PlayTabInformationKt {
    public static final ComposableSingletons$PlayTabInformationKt a = new ComposableSingletons$PlayTabInformationKt();
    public static it2 b = zr0.c(-1707469368, false, new it2() { // from class: com.nytimes.android.features.games.gameshub.ui.components.ComposableSingletons$PlayTabInformationKt$lambda-1$1
        public final void b(String str, Composer composer, int i) {
            zq3.h(str, "it");
            if ((i & 81) == 16 && composer.i()) {
                composer.K();
                return;
            }
            if (b.G()) {
                b.S(-1707469368, i, -1, "com.nytimes.android.features.games.gameshub.ui.components.ComposableSingletons$PlayTabInformationKt.lambda-1.<anonymous> (PlayTabInformation.kt:44)");
            }
            ImageKt.b(do5.d(me6.ic_play_tab_sparkle_icon, composer, 0), "sparkle emoji", null, null, null, 0.0f, null, composer, 56, 124);
            if (b.G()) {
                b.R();
            }
        }

        @Override // defpackage.it2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((String) obj, (Composer) obj2, ((Number) obj3).intValue());
            return ww8.a;
        }
    });

    public final it2 a() {
        return b;
    }
}
