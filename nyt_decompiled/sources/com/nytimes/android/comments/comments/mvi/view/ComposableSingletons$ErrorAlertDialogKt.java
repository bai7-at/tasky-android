package com.nytimes.android.comments.comments.mvi.view;

import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import com.nytimes.android.comments.R;
import defpackage.eb5;
import defpackage.it2;
import defpackage.k48;
import defpackage.m37;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zr0;

/* loaded from: classes4.dex */
public final class ComposableSingletons$ErrorAlertDialogKt {
    public static final ComposableSingletons$ErrorAlertDialogKt INSTANCE = new ComposableSingletons$ErrorAlertDialogKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static it2 f13lambda1 = zr0.c(576435246, false, new it2() { // from class: com.nytimes.android.comments.comments.mvi.view.ComposableSingletons$ErrorAlertDialogKt$lambda-1$1
        @Override // defpackage.it2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((m37) obj, (Composer) obj2, ((Number) obj3).intValue());
            return ww8.a;
        }

        public final void invoke(m37 m37Var, Composer composer, int i) {
            zq3.h(m37Var, "$this$TextButton");
            if ((i & 81) == 16 && composer.i()) {
                composer.K();
                return;
            }
            if (b.G()) {
                b.S(576435246, i, -1, "com.nytimes.android.comments.comments.mvi.view.ComposableSingletons$ErrorAlertDialogKt.lambda-1.<anonymous> (ErrorAlertDialog.kt:28)");
            }
            TextKt.c(k48.b(R.string.submit_comment_error_dialog_positive_button, composer, 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, eb5.Companion.c(composer, 8).b(), composer, 0, 0, 65534);
            if (b.G()) {
                b.R();
            }
        }
    });

    /* renamed from: getLambda-1$comments_release, reason: not valid java name */
    public final it2 m263getLambda1$comments_release() {
        return f13lambda1;
    }
}
