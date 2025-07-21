package com.nytimes.android.designsystem.uicompose.composable;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.Modifier;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.comscore.streaming.ContentType;
import com.nytimes.android.utils.composeutils.nestedscroll.ScrollObserver;
import defpackage.cc7;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.ww8;
import defpackage.xn8;
import defpackage.zq3;

/* loaded from: classes4.dex */
public abstract class TooltipMediumLayoutKt {
    public static final void a(final xn8 xn8Var, Modifier modifier, Composer composer, final int i, final int i2) {
        zq3.h(xn8Var, TransferTable.COLUMN_STATE);
        Composer h = composer.h(798692734);
        Modifier modifier2 = (i2 & 2) != 0 ? Modifier.a : modifier;
        if (b.G()) {
            b.S(798692734, i, -1, "com.nytimes.android.designsystem.uicompose.composable.TooltipMediumLayout (TooltipMediumLayout.kt:32)");
        }
        final Modifier modifier3 = modifier2;
        c(xn8Var.e(), xn8Var.b(), xn8Var.a(), modifier2, 0.0f, 0.0f, 0.0f, xn8Var.c(), h, ScrollObserver.g | ((i << 6) & 7168), ContentType.LONG_FORM_ON_DEMAND);
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.designsystem.uicompose.composable.TooltipMediumLayoutKt$TooltipMediumLayout$1
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
                    TooltipMediumLayoutKt.a(xn8.this, modifier3, composer2, gt6.a(i | 1), i2);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final com.nytimes.android.designsystem.uicompose.utils.TooltipArrowPosition r27, final float r28, androidx.compose.ui.Modifier r29, float r30, float r31, float r32, final defpackage.gt2 r33, androidx.compose.runtime.Composer r34, final int r35, final int r36) {
        /*
            Method dump skipped, instructions count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.designsystem.uicompose.composable.TooltipMediumLayoutKt.b(com.nytimes.android.designsystem.uicompose.utils.TooltipArrowPosition, float, androidx.compose.ui.Modifier, float, float, float, gt2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(com.nytimes.android.utils.composeutils.nestedscroll.ScrollObserver r22, final com.nytimes.android.designsystem.uicompose.utils.TooltipArrowPosition r23, final long r24, androidx.compose.ui.Modifier r26, float r27, float r28, float r29, final defpackage.gt2 r30, androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 601
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.designsystem.uicompose.composable.TooltipMediumLayoutKt.c(com.nytimes.android.utils.composeutils.nestedscroll.ScrollObserver, com.nytimes.android.designsystem.uicompose.utils.TooltipArrowPosition, long, androidx.compose.ui.Modifier, float, float, float, gt2, androidx.compose.runtime.Composer, int, int):void");
    }
}
