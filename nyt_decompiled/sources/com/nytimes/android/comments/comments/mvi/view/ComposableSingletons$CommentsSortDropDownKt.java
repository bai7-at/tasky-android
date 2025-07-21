package com.nytimes.android.comments.comments.mvi.view;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.Modifier;
import defpackage.bu1;
import defpackage.dp;
import defpackage.eb5;
import defpackage.gt2;
import defpackage.oe3;
import defpackage.ww8;
import defpackage.zr0;

/* loaded from: classes4.dex */
public final class ComposableSingletons$CommentsSortDropDownKt {
    public static final ComposableSingletons$CommentsSortDropDownKt INSTANCE = new ComposableSingletons$CommentsSortDropDownKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static gt2 f7lambda1 = zr0.c(-1395241406, false, new gt2() { // from class: com.nytimes.android.comments.comments.mvi.view.ComposableSingletons$CommentsSortDropDownKt$lambda-1$1
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
                b.S(-1395241406, i, -1, "com.nytimes.android.comments.comments.mvi.view.ComposableSingletons$CommentsSortDropDownKt.lambda-1.<anonymous> (CommentsSortDropDown.kt:86)");
            }
            IconKt.a(dp.a(oe3.a.a()), "Sort By DropDown", SizeKt.n(Modifier.a, bu1.g(24)), eb5.Companion.a(composer, 8).L(), composer, 432, 0);
            if (b.G()) {
                b.R();
            }
        }
    });

    /* renamed from: getLambda-1$comments_release, reason: not valid java name */
    public final gt2 m254getLambda1$comments_release() {
        return f7lambda1;
    }
}
