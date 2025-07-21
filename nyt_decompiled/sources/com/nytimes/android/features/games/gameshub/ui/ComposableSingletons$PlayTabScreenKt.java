package com.nytimes.android.features.games.gameshub.ui;

import androidx.compose.material.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import defpackage.gt2;
import defpackage.kn7;
import defpackage.oe3;
import defpackage.ww8;
import defpackage.zr0;

/* loaded from: classes4.dex */
public final class ComposableSingletons$PlayTabScreenKt {
    public static final ComposableSingletons$PlayTabScreenKt a = new ComposableSingletons$PlayTabScreenKt();
    public static gt2 b = zr0.c(-717127663, false, new gt2() { // from class: com.nytimes.android.features.games.gameshub.ui.ComposableSingletons$PlayTabScreenKt$lambda-1$1
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
                b.S(-717127663, i, -1, "com.nytimes.android.features.games.gameshub.ui.ComposableSingletons$PlayTabScreenKt.lambda-1.<anonymous> (PlayTabScreen.kt:173)");
            }
            IconKt.a(kn7.a(oe3.a.a), "progress settings", null, 0L, composer, 48, 12);
            if (b.G()) {
                b.R();
            }
        }
    });

    public final gt2 a() {
        return b;
    }
}
