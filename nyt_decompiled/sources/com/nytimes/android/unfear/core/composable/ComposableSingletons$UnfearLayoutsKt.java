package com.nytimes.android.unfear.core.composable;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.Modifier;
import com.comscore.streaming.ContentType;
import com.nytimes.android.unfear.core.Unfear;
import defpackage.kt2;
import defpackage.l34;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zr0;

/* loaded from: classes4.dex */
public final class ComposableSingletons$UnfearLayoutsKt {
    public static final ComposableSingletons$UnfearLayoutsKt a = new ComposableSingletons$UnfearLayoutsKt();
    public static kt2 b = zr0.c(587208604, false, new kt2() { // from class: com.nytimes.android.unfear.core.composable.ComposableSingletons$UnfearLayoutsKt$lambda-1$1
        public final void b(l34 l34Var, Modifier modifier, Composer composer, int i) {
            int i2;
            zq3.h(l34Var, "interceptedObj");
            zq3.h(modifier, "interceptedModifier");
            if ((i & 14) == 0) {
                i2 = (composer.S(l34Var) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
                i2 |= composer.S(modifier) ? 32 : 16;
            }
            if ((i2 & 731) == 146 && composer.i()) {
                composer.K();
                return;
            }
            if (b.G()) {
                b.S(587208604, i2, -1, "com.nytimes.android.unfear.core.composable.ComposableSingletons$UnfearLayoutsKt.lambda-1.<anonymous> (UnfearLayouts.kt:14)");
            }
            Unfear.a.a(l34Var, modifier, composer, (i2 & ContentType.LONG_FORM_ON_DEMAND) | (i2 & 14) | 384);
            if (b.G()) {
                b.R();
            }
        }

        @Override // defpackage.kt2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            b((l34) obj, (Modifier) obj2, (Composer) obj3, ((Number) obj4).intValue());
            return ww8.a;
        }
    });

    public final kt2 a() {
        return b;
    }
}
