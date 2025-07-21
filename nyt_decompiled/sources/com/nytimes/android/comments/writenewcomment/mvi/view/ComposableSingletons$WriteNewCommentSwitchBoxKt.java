package com.nytimes.android.comments.writenewcomment.mvi.view;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import defpackage.gt2;
import defpackage.ww8;
import defpackage.zr0;

/* loaded from: classes4.dex */
public final class ComposableSingletons$WriteNewCommentSwitchBoxKt {
    public static final ComposableSingletons$WriteNewCommentSwitchBoxKt INSTANCE = new ComposableSingletons$WriteNewCommentSwitchBoxKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static gt2 f29lambda1 = zr0.c(898230855, false, new gt2() { // from class: com.nytimes.android.comments.writenewcomment.mvi.view.ComposableSingletons$WriteNewCommentSwitchBoxKt$lambda-1$1
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
                b.S(898230855, i, -1, "com.nytimes.android.comments.writenewcomment.mvi.view.ComposableSingletons$WriteNewCommentSwitchBoxKt.lambda-1.<anonymous> (WriteNewCommentSwitchBox.kt:72)");
            }
            WriteNewCommentSwitchBoxKt.WriteNewCommentSwitchBox(null, "Email me when my comment is published and if a journalist responds.", false, null, composer, 48, 13);
            if (b.G()) {
                b.R();
            }
        }
    });

    /* renamed from: getLambda-1$comments_release, reason: not valid java name */
    public final gt2 m300getLambda1$comments_release() {
        return f29lambda1;
    }
}
