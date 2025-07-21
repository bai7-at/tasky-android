package com.nytimes.android.comments.writenewcomment.mvi.view;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.TextFieldDefaults;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.Modifier;
import defpackage.cc7;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.ww8;

/* loaded from: classes4.dex */
public final class WriteNewCommentFooterKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void WriteNewCommentFooter(androidx.compose.ui.Modifier r33, java.lang.String r34, java.lang.String r35, androidx.compose.runtime.Composer r36, final int r37, final int r38) {
        /*
            Method dump skipped, instructions count: 613
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.comments.writenewcomment.mvi.view.WriteNewCommentFooterKt.WriteNewCommentFooter(androidx.compose.ui.Modifier, java.lang.String, java.lang.String, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void WriteNewCommentFooterPreview(Composer composer, final int i) {
        Composer h = composer.h(-687838896);
        if (i == 0 && h.i()) {
            h.K();
        } else {
            if (b.G()) {
                b.S(-687838896, i, -1, "com.nytimes.android.comments.writenewcomment.mvi.view.WriteNewCommentFooterPreview (WriteNewCommentFooter.kt:68)");
            }
            WriteNewCommentFooter(SizeKt.b(SizeKt.h(Modifier.a, 0.0f, 1, null), 0.0f, TextFieldDefaults.a.d(), 1, null), "Comment body cannot exceed 1500 characters.", "1892/1500", h, 432, 0);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.comments.writenewcomment.mvi.view.WriteNewCommentFooterKt$WriteNewCommentFooterPreview$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i2) {
                    WriteNewCommentFooterKt.WriteNewCommentFooterPreview(composer2, gt6.a(i | 1));
                }
            });
        }
    }
}
