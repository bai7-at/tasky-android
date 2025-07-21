package com.nytimes.android.comments.comments.mvi.view;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import defpackage.gt2;
import defpackage.ww8;
import defpackage.zr0;

/* loaded from: classes4.dex */
public final class ComposableSingletons$CommentsMessageHeaderKt {
    public static final ComposableSingletons$CommentsMessageHeaderKt INSTANCE = new ComposableSingletons$CommentsMessageHeaderKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static gt2 f4lambda1 = zr0.c(264828218, false, new gt2() { // from class: com.nytimes.android.comments.comments.mvi.view.ComposableSingletons$CommentsMessageHeaderKt$lambda-1$1
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
                b.S(264828218, i, -1, "com.nytimes.android.comments.comments.mvi.view.ComposableSingletons$CommentsMessageHeaderKt.lambda-1.<anonymous> (CommentsMessageHeader.kt:101)");
            }
            CommentsMessageHeaderKt.CommentMessageHeaderYourVoice(composer, 0);
            if (b.G()) {
                b.R();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static gt2 f5lambda2 = zr0.c(-1046596031, false, new gt2() { // from class: com.nytimes.android.comments.comments.mvi.view.ComposableSingletons$CommentsMessageHeaderKt$lambda-2$1
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
                b.S(-1046596031, i, -1, "com.nytimes.android.comments.comments.mvi.view.ComposableSingletons$CommentsMessageHeaderKt.lambda-2.<anonymous> (CommentsMessageHeader.kt:119)");
            }
            CommentsMessageHeaderKt.CommentMessageHeaderClosedComments(composer, 0);
            if (b.G()) {
                b.R();
            }
        }
    });

    /* renamed from: lambda-3, reason: not valid java name */
    public static gt2 f6lambda3 = zr0.c(825504740, false, new gt2() { // from class: com.nytimes.android.comments.comments.mvi.view.ComposableSingletons$CommentsMessageHeaderKt$lambda-3$1
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
                b.S(825504740, i, -1, "com.nytimes.android.comments.comments.mvi.view.ComposableSingletons$CommentsMessageHeaderKt.lambda-3.<anonymous> (CommentsMessageHeader.kt:135)");
            }
            CommentsMessageHeaderKt.CommentMessageHeaderCommentAsStaffTitle(composer, 0);
            if (b.G()) {
                b.R();
            }
        }
    });

    /* renamed from: getLambda-1$comments_release, reason: not valid java name */
    public final gt2 m251getLambda1$comments_release() {
        return f4lambda1;
    }

    /* renamed from: getLambda-2$comments_release, reason: not valid java name */
    public final gt2 m252getLambda2$comments_release() {
        return f5lambda2;
    }

    /* renamed from: getLambda-3$comments_release, reason: not valid java name */
    public final gt2 m253getLambda3$comments_release() {
        return f6lambda3;
    }
}
