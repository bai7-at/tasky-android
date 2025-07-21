package com.nytimes.android.comments.comments.mvi.view;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.Modifier;
import defpackage.gt2;
import defpackage.ww8;
import defpackage.zr0;

/* loaded from: classes4.dex */
public final class ComposableSingletons$CommentsEmptyContentKt {
    public static final ComposableSingletons$CommentsEmptyContentKt INSTANCE = new ComposableSingletons$CommentsEmptyContentKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static gt2 f3lambda1 = zr0.c(438077282, false, new gt2() { // from class: com.nytimes.android.comments.comments.mvi.view.ComposableSingletons$CommentsEmptyContentKt$lambda-1$1
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
                b.S(438077282, i, -1, "com.nytimes.android.comments.comments.mvi.view.ComposableSingletons$CommentsEmptyContentKt.lambda-1.<anonymous> (CommentsEmptyContent.kt:74)");
            }
            CommentsEmptyContentKt.CommentsEmptyContent(Modifier.a, composer, 6, 0);
            if (b.G()) {
                b.R();
            }
        }
    });

    /* renamed from: getLambda-1$comments_release, reason: not valid java name */
    public final gt2 m250getLambda1$comments_release() {
        return f3lambda1;
    }
}
