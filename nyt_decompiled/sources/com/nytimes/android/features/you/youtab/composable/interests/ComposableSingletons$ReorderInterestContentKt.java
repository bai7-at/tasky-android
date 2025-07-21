package com.nytimes.android.features.you.youtab.composable.interests;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.Modifier;
import defpackage.bu1;
import defpackage.h04;
import defpackage.it2;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zr0;

/* loaded from: classes4.dex */
public final class ComposableSingletons$ReorderInterestContentKt {
    public static final ComposableSingletons$ReorderInterestContentKt a = new ComposableSingletons$ReorderInterestContentKt();
    public static it2 b = zr0.c(-1601101645, false, new it2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.ComposableSingletons$ReorderInterestContentKt$lambda-1$1
        @Override // defpackage.it2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((h04) obj, (Composer) obj2, ((Number) obj3).intValue());
            return ww8.a;
        }

        public final void invoke(h04 h04Var, Composer composer, int i) {
            zq3.h(h04Var, "$this$item");
            if ((i & 81) == 16 && composer.i()) {
                composer.K();
                return;
            }
            if (b.G()) {
                b.S(-1601101645, i, -1, "com.nytimes.android.features.you.youtab.composable.interests.ComposableSingletons$ReorderInterestContentKt.lambda-1.<anonymous> (ReorderInterestContent.kt:137)");
            }
            SpacerKt.a(SizeKt.i(Modifier.a, bu1.g(8)), composer, 6);
            if (b.G()) {
                b.R();
            }
        }
    });

    public final it2 a() {
        return b;
    }
}
