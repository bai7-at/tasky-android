package com.nytimes.android.comments.comments.mvi.view;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import com.nytimes.android.comments.comments.mvi.CommentTab;
import defpackage.gt2;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zr0;
import kotlin.collections.d;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public final class ComposableSingletons$CommentsTabsKt {
    public static final ComposableSingletons$CommentsTabsKt INSTANCE = new ComposableSingletons$CommentsTabsKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static gt2 f8lambda1 = zr0.c(-492609474, false, new gt2() { // from class: com.nytimes.android.comments.comments.mvi.view.ComposableSingletons$CommentsTabsKt$lambda-1$1
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
                b.S(-492609474, i, -1, "com.nytimes.android.comments.comments.mvi.view.ComposableSingletons$CommentsTabsKt.lambda-1.<anonymous> (CommentsTabs.kt:100)");
            }
            CommentsTabsKt.CommentsTabs(i.P0(d.C0(CommentTab.values()), 3), null, 0, new ss2() { // from class: com.nytimes.android.comments.comments.mvi.view.ComposableSingletons$CommentsTabsKt$lambda-1$1.1
                public final void invoke(int i2) {
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke(((Number) obj).intValue());
                    return ww8.a;
                }
            }, composer, 3080, 6);
            if (b.G()) {
                b.R();
            }
        }
    });

    /* renamed from: getLambda-1$comments_release, reason: not valid java name */
    public final gt2 m255getLambda1$comments_release() {
        return f8lambda1;
    }
}
