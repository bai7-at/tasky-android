package com.nytimes.android.comments.writenewcomment.mvi.view;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.runtime.b0;
import defpackage.cc7;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.qs2;
import defpackage.sy4;
import defpackage.ww8;

/* loaded from: classes4.dex */
public final class WriteNewCommentTextKt {
    /* JADX WARN: Removed duplicated region for block: B:112:0x0681  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x065e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x068f  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0536  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void WriteNewCommentText(final java.lang.String r58, final java.lang.String r59, int r60, boolean r61, java.lang.String r62, final defpackage.qs2 r63, androidx.compose.runtime.Composer r64, final int r65, final int r66) {
        /*
            Method dump skipped, instructions count: 1700
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.comments.writenewcomment.mvi.view.WriteNewCommentTextKt.WriteNewCommentText(java.lang.String, java.lang.String, int, boolean, java.lang.String, qs2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void WriteNewCommentTextPreview(Composer composer, final int i) {
        Composer h = composer.h(1330321580);
        if (i == 0 && h.i()) {
            h.K();
        } else {
            if (b.G()) {
                b.S(1330321580, i, -1, "com.nytimes.android.comments.writenewcomment.mvi.view.WriteNewCommentTextPreview (WriteNewCommentText.kt:142)");
            }
            h.z(-956800050);
            Object A = h.A();
            if (A == Composer.a.a()) {
                A = b0.e("John Doe", null, 2, null);
                h.q(A);
            }
            h.R();
            WriteNewCommentText(WriteNewCommentTextPreview$lambda$6((sy4) A), "Reporter", 0, true, null, new qs2() { // from class: com.nytimes.android.comments.writenewcomment.mvi.view.WriteNewCommentTextKt$WriteNewCommentTextPreview$1
                /* renamed from: invoke, reason: collision with other method in class */
                public final void m315invoke() {
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m315invoke();
                    return ww8.a;
                }
            }, h, 199728, 20);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.comments.writenewcomment.mvi.view.WriteNewCommentTextKt$WriteNewCommentTextPreview$2
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
                    WriteNewCommentTextKt.WriteNewCommentTextPreview(composer2, gt6.a(i | 1));
                }
            });
        }
    }

    private static final String WriteNewCommentTextPreview$lambda$6(sy4 sy4Var) {
        return (String) sy4Var.getValue();
    }
}
