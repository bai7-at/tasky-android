package com.nytimes.android.comments.writenewcomment.mvi.view;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import defpackage.gt2;
import defpackage.qs2;
import defpackage.ww8;
import defpackage.zr0;

/* loaded from: classes4.dex */
public final class ComposableSingletons$WriteNewCommentTopAppBarKt {
    public static final ComposableSingletons$WriteNewCommentTopAppBarKt INSTANCE = new ComposableSingletons$WriteNewCommentTopAppBarKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static gt2 f30lambda1 = zr0.c(1092512568, false, new gt2() { // from class: com.nytimes.android.comments.writenewcomment.mvi.view.ComposableSingletons$WriteNewCommentTopAppBarKt$lambda-1$1
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
                b.S(1092512568, i, -1, "com.nytimes.android.comments.writenewcomment.mvi.view.ComposableSingletons$WriteNewCommentTopAppBarKt.lambda-1.<anonymous> (WriteNewCommentTopAppBar.kt:95)");
            }
            WriteNewCommentTopAppBarKt.WriteNewCommentTopAppBar(null, "New comment", "Cancel", "Submit", false, new qs2() { // from class: com.nytimes.android.comments.writenewcomment.mvi.view.ComposableSingletons$WriteNewCommentTopAppBarKt$lambda-1$1.1
                /* renamed from: invoke, reason: collision with other method in class */
                public final void m302invoke() {
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m302invoke();
                    return ww8.a;
                }
            }, new qs2() { // from class: com.nytimes.android.comments.writenewcomment.mvi.view.ComposableSingletons$WriteNewCommentTopAppBarKt$lambda-1$1.2
                /* renamed from: invoke, reason: collision with other method in class */
                public final void m303invoke() {
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m303invoke();
                    return ww8.a;
                }
            }, composer, 1797552, 1);
            if (b.G()) {
                b.R();
            }
        }
    });

    /* renamed from: getLambda-1$comments_release, reason: not valid java name */
    public final gt2 m301getLambda1$comments_release() {
        return f30lambda1;
    }
}
