package com.nytimes.android.composeui.base;

import androidx.compose.material.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import defpackage.ap;
import defpackage.ek6;
import defpackage.gt2;
import defpackage.k48;
import defpackage.oe3;
import defpackage.ww8;
import defpackage.zr0;

/* loaded from: classes4.dex */
public final class ComposableSingletons$BasicAppBarKt {
    public static final ComposableSingletons$BasicAppBarKt a = new ComposableSingletons$BasicAppBarKt();
    public static gt2 b = zr0.c(766902863, false, new gt2() { // from class: com.nytimes.android.composeui.base.ComposableSingletons$BasicAppBarKt$lambda-1$1
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
                b.S(766902863, i, -1, "com.nytimes.android.composeui.base.ComposableSingletons$BasicAppBarKt.lambda-1.<anonymous> (BasicAppBar.kt:89)");
            }
            IconKt.a(ap.a(oe3.a.a), k48.b(ek6.app_bar_back_button_accessibility, composer, 0), null, 0L, composer, 0, 12);
            if (b.G()) {
                b.R();
            }
        }
    });
    public static gt2 c = zr0.c(-1294034726, false, new gt2() { // from class: com.nytimes.android.composeui.base.ComposableSingletons$BasicAppBarKt$lambda-2$1
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
                b.S(-1294034726, i, -1, "com.nytimes.android.composeui.base.ComposableSingletons$BasicAppBarKt.lambda-2.<anonymous> (BasicAppBar.kt:100)");
            }
            BasicAppBarKt.a(null, "Title", false, null, 0L, 0L, composer, 432, 57);
            if (b.G()) {
                b.R();
            }
        }
    });
    public static gt2 d = zr0.c(-1555589804, false, new gt2() { // from class: com.nytimes.android.composeui.base.ComposableSingletons$BasicAppBarKt$lambda-3$1
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
                b.S(-1555589804, i, -1, "com.nytimes.android.composeui.base.ComposableSingletons$BasicAppBarKt.lambda-3.<anonymous> (BasicAppBar.kt:108)");
            }
            BasicAppBarKt.a(null, "Title", true, null, 0L, 0L, composer, 432, 57);
            if (b.G()) {
                b.R();
            }
        }
    });

    public final gt2 a() {
        return b;
    }
}
