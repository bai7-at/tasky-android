package com.nytimes.android.comments.comments.mvi.view;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.Modifier;
import com.comscore.streaming.ContentType;
import com.nytimes.android.utils.composeutils.ModifierUtilsKt;
import defpackage.cc7;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.qs2;
import defpackage.ww8;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class WriteNewCommentFloatingButtonKt {
    public static final void WriteNewCommentFloatingButton(final boolean z, final qs2 qs2Var, Composer composer, final int i) {
        int i2;
        zq3.h(qs2Var, "onClick");
        Composer h = composer.h(40382412);
        if ((i & 14) == 0) {
            i2 = (h.a(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i2 |= h.C(qs2Var) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && h.i()) {
            h.K();
        } else {
            if (b.G()) {
                b.S(40382412, i2, -1, "com.nytimes.android.comments.comments.mvi.view.WriteNewCommentFloatingButton (WriteNewCommentFloatingButton.kt:16)");
            }
            Modifier d = ModifierUtilsKt.d(Modifier.a, "Write Comment button");
            ComposableSingletons$WriteNewCommentFloatingButtonKt composableSingletons$WriteNewCommentFloatingButtonKt = ComposableSingletons$WriteNewCommentFloatingButtonKt.INSTANCE;
            NYTimesExtendableFloatingActionButtonKt.NYTimesExtendableFloatingActionButton(d, z, composableSingletons$WriteNewCommentFloatingButtonKt.m272getLambda1$comments_release(), composableSingletons$WriteNewCommentFloatingButtonKt.m273getLambda2$comments_release(), qs2Var, h, ((i2 << 3) & ContentType.LONG_FORM_ON_DEMAND) | 3456 | ((i2 << 9) & 57344), 0);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.comments.comments.mvi.view.WriteNewCommentFloatingButtonKt$WriteNewCommentFloatingButton$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i3) {
                    WriteNewCommentFloatingButtonKt.WriteNewCommentFloatingButton(z, qs2Var, composer2, gt6.a(i | 1));
                }
            });
        }
    }
}
