package com.nytimes.android.ribbon.destinations.theathletic;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.Modifier;
import com.nytimes.android.ribbon.composable.XpnDividersKt;
import com.nytimes.android.tpl.TPLSize;
import defpackage.eb5;
import defpackage.h04;
import defpackage.it2;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zr0;

/* loaded from: classes4.dex */
public final class ComposableSingletons$TheAthleticLockupsKt {
    public static final ComposableSingletons$TheAthleticLockupsKt a = new ComposableSingletons$TheAthleticLockupsKt();
    public static it2 b = zr0.c(1173094849, false, new it2() { // from class: com.nytimes.android.ribbon.destinations.theathletic.ComposableSingletons$TheAthleticLockupsKt$lambda-1$1
        @Override // defpackage.it2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((h04) obj, (Composer) obj2, ((Number) obj3).intValue());
            return ww8.a;
        }

        public final void invoke(h04 h04Var, Composer composer, int i) {
            zq3.h(h04Var, "$this$xpnModule");
            if ((i & 81) == 16 && composer.i()) {
                composer.K();
                return;
            }
            if (b.G()) {
                b.S(1173094849, i, -1, "com.nytimes.android.ribbon.destinations.theathletic.ComposableSingletons$TheAthleticLockupsKt.lambda-1.<anonymous> (TheAthleticLockups.kt:88)");
            }
            XpnDividersKt.a(PaddingKt.m(Modifier.a, 0.0f, 0.0f, 0.0f, TPLSize.spacing1_5.m765getValueD9Ej5fM(), 7, null), eb5.Companion.b(composer, 8).g(), null, composer, 0, 4);
            if (b.G()) {
                b.R();
            }
        }
    });

    public final it2 a() {
        return b;
    }
}
