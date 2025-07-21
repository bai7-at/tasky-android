package com.nytimes.android.comments.comments.mvi.view;

import androidx.compose.material.IconKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.Modifier;
import com.nytimes.android.comments.R;
import com.nytimes.android.utils.composeutils.ModifierUtilsKt;
import defpackage.gt2;
import defpackage.hy1;
import defpackage.k48;
import defpackage.oe3;
import defpackage.ww8;
import defpackage.zr0;

/* loaded from: classes4.dex */
public final class ComposableSingletons$WriteNewCommentFloatingButtonKt {
    public static final ComposableSingletons$WriteNewCommentFloatingButtonKt INSTANCE = new ComposableSingletons$WriteNewCommentFloatingButtonKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static gt2 f20lambda1 = zr0.c(-1250965156, false, new gt2() { // from class: com.nytimes.android.comments.comments.mvi.view.ComposableSingletons$WriteNewCommentFloatingButtonKt$lambda-1$1
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
                b.S(-1250965156, i, -1, "com.nytimes.android.comments.comments.mvi.view.ComposableSingletons$WriteNewCommentFloatingButtonKt.lambda-1.<anonymous> (WriteNewCommentFloatingButton.kt:21)");
            }
            TextKt.c(k48.b(R.string.floating_button_title, composer, 0), ModifierUtilsKt.d(Modifier.a, "Comment Text"), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 131068);
            if (b.G()) {
                b.R();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static gt2 f21lambda2 = zr0.c(-1487582981, false, new gt2() { // from class: com.nytimes.android.comments.comments.mvi.view.ComposableSingletons$WriteNewCommentFloatingButtonKt$lambda-2$1
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
                b.S(-1487582981, i, -1, "com.nytimes.android.comments.comments.mvi.view.ComposableSingletons$WriteNewCommentFloatingButtonKt.lambda-2.<anonymous> (WriteNewCommentFloatingButton.kt:27)");
            }
            IconKt.a(hy1.a(oe3.a.a), k48.b(R.string.floating_button_title, composer, 0), ModifierUtilsKt.d(Modifier.a, "Comment Pencil Icon"), 0L, composer, 0, 8);
            if (b.G()) {
                b.R();
            }
        }
    });

    /* renamed from: getLambda-1$comments_release, reason: not valid java name */
    public final gt2 m272getLambda1$comments_release() {
        return f20lambda1;
    }

    /* renamed from: getLambda-2$comments_release, reason: not valid java name */
    public final gt2 m273getLambda2$comments_release() {
        return f21lambda2;
    }
}
