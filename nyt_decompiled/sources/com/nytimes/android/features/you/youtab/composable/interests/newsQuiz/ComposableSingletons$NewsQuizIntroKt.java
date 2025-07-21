package com.nytimes.android.features.you.youtab.composable.interests.newsQuiz;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.nytimes.android.designsystem.uicompose.ui.tpl.TPLTypography;
import defpackage.bu1;
import defpackage.do5;
import defpackage.it2;
import defpackage.k48;
import defpackage.m37;
import defpackage.re6;
import defpackage.ww8;
import defpackage.yk6;
import defpackage.zq3;
import defpackage.zr0;

/* loaded from: classes4.dex */
public final class ComposableSingletons$NewsQuizIntroKt {
    public static final ComposableSingletons$NewsQuizIntroKt a = new ComposableSingletons$NewsQuizIntroKt();
    public static it2 b = zr0.c(13474398, false, new it2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.newsQuiz.ComposableSingletons$NewsQuizIntroKt$lambda-1$1
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
                b.S(13474398, i2, -1, "com.nytimes.android.features.you.youtab.composable.interests.newsQuiz.ComposableSingletons$NewsQuizIntroKt.lambda-1.<anonymous> (NewsQuizIntro.kt:97)");
            }
            TextKt.c(k48.b(yk6.news_quiz_begin_quiz, composer, 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TPLTypography.title14.getValue(), composer, 0, 0, 65534);
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
