package com.nytimes.android.features.you.youtab.composable.interests.newsQuiz;

import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import com.nytimes.android.designsystem.uicompose.ui.tpl.TPLTypography;
import defpackage.it2;
import defpackage.k48;
import defpackage.m37;
import defpackage.ww8;
import defpackage.yk6;
import defpackage.zq3;
import defpackage.zr0;

/* loaded from: classes4.dex */
public final class ComposableSingletons$NewsQuizMoreContextKt {
    public static final ComposableSingletons$NewsQuizMoreContextKt a = new ComposableSingletons$NewsQuizMoreContextKt();
    public static it2 b = zr0.c(-761812230, false, new it2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.newsQuiz.ComposableSingletons$NewsQuizMoreContextKt$lambda-1$1
        @Override // defpackage.it2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((m37) obj, (Composer) obj2, ((Number) obj3).intValue());
            return ww8.a;
        }

        public final void invoke(m37 m37Var, Composer composer, int i) {
            zq3.h(m37Var, "$this$OutlinedButton");
            if ((i & 81) == 16 && composer.i()) {
                composer.K();
                return;
            }
            if (b.G()) {
                b.S(-761812230, i, -1, "com.nytimes.android.features.you.youtab.composable.interests.newsQuiz.ComposableSingletons$NewsQuizMoreContextKt.lambda-1.<anonymous> (NewsQuizMoreContext.kt:149)");
            }
            TextKt.c(k48.b(yk6.take_the_full_quiz, composer, 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TPLTypography.title14.getValue(), composer, 0, 0, 65534);
            if (b.G()) {
                b.R();
            }
        }
    });

    public final it2 a() {
        return b;
    }
}
