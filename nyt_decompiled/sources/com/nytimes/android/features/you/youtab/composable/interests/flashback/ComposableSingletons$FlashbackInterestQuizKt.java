package com.nytimes.android.features.you.youtab.composable.interests.flashback;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.font.o;
import androidx.compose.ui.text.j;
import defpackage.bu1;
import defpackage.do5;
import defpackage.eb5;
import defpackage.ek8;
import defpackage.gb5;
import defpackage.it2;
import defpackage.k48;
import defpackage.m37;
import defpackage.re6;
import defpackage.ww8;
import defpackage.yk6;
import defpackage.zq3;
import defpackage.zr0;

/* loaded from: classes4.dex */
public final class ComposableSingletons$FlashbackInterestQuizKt {
    public static final ComposableSingletons$FlashbackInterestQuizKt a = new ComposableSingletons$FlashbackInterestQuizKt();
    public static it2 b = zr0.c(-26871130, false, new it2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.flashback.ComposableSingletons$FlashbackInterestQuizKt$lambda-1$1
        @Override // defpackage.it2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((m37) obj, (Composer) obj2, ((Number) obj3).intValue());
            return ww8.a;
        }

        public final void invoke(m37 m37Var, Composer composer, int i) {
            int i2;
            zq3.h(m37Var, "$this$OutlinedButton");
            if ((i & 14) == 0) {
                i2 = i | (composer.S(m37Var) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 91) == 18 && composer.i()) {
                composer.K();
                return;
            }
            if (b.G()) {
                b.S(-26871130, i2, -1, "com.nytimes.android.features.you.youtab.composable.interests.flashback.ComposableSingletons$FlashbackInterestQuizKt.lambda-1.<anonymous> (FlashbackInterestQuiz.kt:146)");
            }
            TextKt.c(k48.b(yk6.flashbackQuizSortButtonLabel, composer, 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new j(eb5.Companion.b(composer, 8).g(), ek8.g(16), o.b.g(), null, null, gb5.e(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, ek8.e(18.2d), null, null, null, 0, 0, null, 16646104, null), composer, 0, 0, 65534);
            IconKt.b(do5.d(re6.ic_caret, composer, 0), null, SizeKt.n(PaddingKt.m(m37Var.c(Modifier.a, Alignment.a.i()), bu1.g(8), 0.0f, 0.0f, 0.0f, 14, null), bu1.g(12)), 0L, composer, 56, 8);
            if (b.G()) {
                b.R();
            }
        }
    });

    public final it2 a() {
        return b;
    }
}
