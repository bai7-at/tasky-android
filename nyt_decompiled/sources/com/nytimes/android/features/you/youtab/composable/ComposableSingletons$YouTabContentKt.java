package com.nytimes.android.features.you.youtab.composable;

import androidx.compose.material3.DividerKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import defpackage.bu1;
import defpackage.eb5;
import defpackage.fk;
import defpackage.gt2;
import defpackage.h04;
import defpackage.it2;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zr0;

/* loaded from: classes4.dex */
public final class ComposableSingletons$YouTabContentKt {
    public static final ComposableSingletons$YouTabContentKt a = new ComposableSingletons$YouTabContentKt();
    public static gt2 b = zr0.c(1844193819, false, new gt2() { // from class: com.nytimes.android.features.you.youtab.composable.ComposableSingletons$YouTabContentKt$lambda-1$1
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
                b.S(1844193819, i, -1, "com.nytimes.android.features.you.youtab.composable.ComposableSingletons$YouTabContentKt.lambda-1.<anonymous> (YouTabContent.kt:233)");
            }
            DividerKt.a(null, bu1.g((float) 0.5d), eb5.Companion.b(composer, 8).l(), composer, 48, 1);
            if (b.G()) {
                b.R();
            }
        }
    });
    public static it2 c = zr0.c(-247626304, false, new it2() { // from class: com.nytimes.android.features.you.youtab.composable.ComposableSingletons$YouTabContentKt$lambda-2$1
        @Override // defpackage.it2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((h04) obj, (Composer) obj2, ((Number) obj3).intValue());
            return ww8.a;
        }

        public final void invoke(h04 h04Var, Composer composer, int i) {
            zq3.h(h04Var, "$this$stickyHeader");
            if ((i & 81) == 16 && composer.i()) {
                composer.K();
                return;
            }
            if (b.G()) {
                b.S(-247626304, i, -1, "com.nytimes.android.features.you.youtab.composable.ComposableSingletons$YouTabContentKt.lambda-2.<anonymous> (YouTabContent.kt:229)");
            }
            SurfaceKt.a(null, null, eb5.Companion.b(composer, 8).a(), 0L, 0.0f, fk.a.b(), null, ComposableSingletons$YouTabContentKt.a.a(), composer, 12582912, 91);
            if (b.G()) {
                b.R();
            }
        }
    });

    public final gt2 a() {
        return b;
    }

    public final it2 b() {
        return c;
    }
}
