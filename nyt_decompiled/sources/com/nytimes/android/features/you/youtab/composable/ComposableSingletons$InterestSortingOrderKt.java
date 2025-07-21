package com.nytimes.android.features.you.youtab.composable;

import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import com.nytimes.android.designsystem.uicompose.ui.tpl.TPLTypography;
import defpackage.eb5;
import defpackage.it2;
import defpackage.k48;
import defpackage.m37;
import defpackage.ww8;
import defpackage.yk6;
import defpackage.zq3;
import defpackage.zr0;

/* loaded from: classes4.dex */
public final class ComposableSingletons$InterestSortingOrderKt {
    public static final ComposableSingletons$InterestSortingOrderKt a = new ComposableSingletons$InterestSortingOrderKt();
    public static it2 b = zr0.c(1039996049, false, new it2() { // from class: com.nytimes.android.features.you.youtab.composable.ComposableSingletons$InterestSortingOrderKt$lambda-1$1
        @Override // defpackage.it2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((m37) obj, (Composer) obj2, ((Number) obj3).intValue());
            return ww8.a;
        }

        public final void invoke(m37 m37Var, Composer composer, int i) {
            zq3.h(m37Var, "$this$DropdownMenuItem");
            if ((i & 81) == 16 && composer.i()) {
                composer.K();
                return;
            }
            if (b.G()) {
                b.S(1039996049, i, -1, "com.nytimes.android.features.you.youtab.composable.ComposableSingletons$InterestSortingOrderKt.lambda-1.<anonymous> (InterestSortingOrder.kt:86)");
            }
            TextKt.c(k48.b(yk6.interest_most_recent, composer, 0), null, eb5.Companion.b(composer, 8).g(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TPLTypography.title16.getValue(), composer, 0, 0, 65530);
            if (b.G()) {
                b.R();
            }
        }
    });
    public static it2 c = zr0.c(46986760, false, new it2() { // from class: com.nytimes.android.features.you.youtab.composable.ComposableSingletons$InterestSortingOrderKt$lambda-2$1
        @Override // defpackage.it2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((m37) obj, (Composer) obj2, ((Number) obj3).intValue());
            return ww8.a;
        }

        public final void invoke(m37 m37Var, Composer composer, int i) {
            zq3.h(m37Var, "$this$DropdownMenuItem");
            if ((i & 81) == 16 && composer.i()) {
                composer.K();
                return;
            }
            if (b.G()) {
                b.S(46986760, i, -1, "com.nytimes.android.features.you.youtab.composable.ComposableSingletons$InterestSortingOrderKt.lambda-2.<anonymous> (InterestSortingOrder.kt:97)");
            }
            TextKt.c(k48.b(yk6.interest_your_order, composer, 0), null, eb5.Companion.b(composer, 8).g(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TPLTypography.title16.getValue(), composer, 0, 0, 65530);
            if (b.G()) {
                b.R();
            }
        }
    });

    public final it2 a() {
        return b;
    }

    public final it2 b() {
        return c;
    }
}
