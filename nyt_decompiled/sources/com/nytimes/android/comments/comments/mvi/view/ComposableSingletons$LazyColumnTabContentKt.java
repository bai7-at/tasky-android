package com.nytimes.android.comments.comments.mvi.view;

import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.text.font.e;
import androidx.compose.ui.text.font.o;
import androidx.compose.ui.text.j;
import com.nytimes.android.comments.R;
import defpackage.eb5;
import defpackage.ek8;
import defpackage.gb5;
import defpackage.it2;
import defpackage.k48;
import defpackage.m37;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zr0;

/* loaded from: classes4.dex */
public final class ComposableSingletons$LazyColumnTabContentKt {
    public static final ComposableSingletons$LazyColumnTabContentKt INSTANCE = new ComposableSingletons$LazyColumnTabContentKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static it2 f19lambda1 = zr0.c(-2042527944, false, new it2() { // from class: com.nytimes.android.comments.comments.mvi.view.ComposableSingletons$LazyColumnTabContentKt$lambda-1$1
        @Override // defpackage.it2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((m37) obj, (Composer) obj2, ((Number) obj3).intValue());
            return ww8.a;
        }

        public final void invoke(m37 m37Var, Composer composer, int i) {
            zq3.h(m37Var, "$this$Button");
            if ((i & 81) == 16 && composer.i()) {
                composer.K();
                return;
            }
            if (b.G()) {
                b.S(-2042527944, i, -1, "com.nytimes.android.comments.comments.mvi.view.ComposableSingletons$LazyColumnTabContentKt.lambda-1.<anonymous> (LazyColumnTabContent.kt:392)");
            }
            String b = k48.b(R.string.comment_thread_view_all_replies, composer, 0);
            long g = ek8.g(12);
            long g2 = ek8.g(18);
            e e = gb5.e();
            TextKt.c(b, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new j(eb5.Companion.a(composer, 8).X(), g, o.b.f(), null, null, e, null, 0L, null, null, null, 0L, null, null, null, 0, 0, g2, null, null, null, 0, 0, null, 16646104, null), composer, 0, 0, 65534);
            if (b.G()) {
                b.R();
            }
        }
    });

    /* renamed from: getLambda-1$comments_release, reason: not valid java name */
    public final it2 m271getLambda1$comments_release() {
        return f19lambda1;
    }
}
