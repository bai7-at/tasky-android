package com.nytimes.android.comments.comments.mvi.view;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import defpackage.gt2;
import defpackage.ww8;
import defpackage.zr0;

/* loaded from: classes4.dex */
public final class ComposableSingletons$HtmlTextKt {
    public static final ComposableSingletons$HtmlTextKt INSTANCE = new ComposableSingletons$HtmlTextKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static gt2 f18lambda1 = zr0.c(-72991502, false, new gt2() { // from class: com.nytimes.android.comments.comments.mvi.view.ComposableSingletons$HtmlTextKt$lambda-1$1
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
                b.S(-72991502, i, -1, "com.nytimes.android.comments.comments.mvi.view.ComposableSingletons$HtmlTextKt.lambda-1.<anonymous> (HtmlText.kt:47)");
            }
            HtmlTextKt.HtmlText("How about this style\n<a href=\"http://www.google.com\" target=\"_blank\">http://www.google.com</a>", null, composer, 6, 2);
            if (b.G()) {
                b.R();
            }
        }
    });

    /* renamed from: getLambda-1$comments_release, reason: not valid java name */
    public final gt2 m270getLambda1$comments_release() {
        return f18lambda1;
    }
}
