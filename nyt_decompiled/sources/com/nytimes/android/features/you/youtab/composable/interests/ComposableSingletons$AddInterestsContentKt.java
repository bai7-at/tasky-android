package com.nytimes.android.features.you.youtab.composable.interests;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.Modifier;
import defpackage.bu1;
import defpackage.eb5;
import defpackage.h04;
import defpackage.it2;
import defpackage.k48;
import defpackage.ww8;
import defpackage.yk6;
import defpackage.zq3;
import defpackage.zr0;

/* loaded from: classes4.dex */
public final class ComposableSingletons$AddInterestsContentKt {
    public static final ComposableSingletons$AddInterestsContentKt a = new ComposableSingletons$AddInterestsContentKt();
    public static it2 b = zr0.c(-1102756350, false, new it2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.ComposableSingletons$AddInterestsContentKt$lambda-1$1
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
                b.S(-1102756350, i, -1, "com.nytimes.android.features.you.youtab.composable.interests.ComposableSingletons$AddInterestsContentKt.lambda-1.<anonymous> (AddInterestsContent.kt:78)");
            }
            float f = 20;
            TextKt.b(k48.b(yk6.add_interests_prompt, composer, 0), PaddingKt.m(Modifier.a, 0.0f, bu1.g(f), 0.0f, bu1.g(f), 5, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, eb5.Companion.c(composer, 8).r1(), composer, 48, 0, 65532);
            if (b.G()) {
                b.R();
            }
        }
    });
    public static it2 c = zr0.c(364124843, false, new it2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.ComposableSingletons$AddInterestsContentKt$lambda-2$1
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
                b.S(364124843, i, -1, "com.nytimes.android.features.you.youtab.composable.interests.ComposableSingletons$AddInterestsContentKt.lambda-2.<anonymous> (AddInterestsContent.kt:109)");
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

    public final it2 b() {
        return c;
    }
}
