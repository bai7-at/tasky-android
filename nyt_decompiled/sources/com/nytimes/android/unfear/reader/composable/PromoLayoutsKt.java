package com.nytimes.android.unfear.reader.composable;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.Modifier;
import com.comscore.streaming.ContentType;
import com.nytimes.android.api.cms.AssetConstants;
import com.nytimes.android.unfear.reader.model.ImageElement;
import defpackage.cc7;
import defpackage.d56;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.ww8;
import defpackage.zq3;

/* loaded from: classes4.dex */
public abstract class PromoLayoutsKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final com.nytimes.android.unfear.reader.model.ImageElement r34, androidx.compose.ui.Modifier r35, java.lang.Integer r36, float r37, float r38, androidx.compose.ui.layout.ContentScale r39, androidx.compose.runtime.Composer r40, final int r41, final int r42) {
        /*
            Method dump skipped, instructions count: 923
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.unfear.reader.composable.PromoLayoutsKt.a(com.nytimes.android.unfear.reader.model.ImageElement, androidx.compose.ui.Modifier, java.lang.Integer, float, float, androidx.compose.ui.layout.ContentScale, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void b(final d56 d56Var, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        zq3.h(d56Var, AssetConstants.PROMO_TYPE);
        Composer h = composer.h(-311253579);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (h.S(d56Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i3 |= h.S(modifier) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && h.i()) {
            h.K();
        } else {
            if (i4 != 0) {
                modifier = Modifier.a;
            }
            if (b.G()) {
                b.S(-311253579, i3, -1, "com.nytimes.android.unfear.reader.composable.PromoLayout (PromoLayouts.kt:35)");
            }
            if (d56Var.a() instanceof ImageElement) {
                h.z(1836946678);
                a((ImageElement) d56Var.a(), modifier, null, 0.0f, 0.0f, null, h, (i3 & ContentType.LONG_FORM_ON_DEMAND) | 384, 56);
                h.R();
            } else {
                h.z(1836947453);
                h.R();
            }
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.unfear.reader.composable.PromoLayoutsKt$PromoLayout$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i5) {
                    PromoLayoutsKt.b(d56.this, modifier, composer2, gt6.a(i | 1), i2);
                }
            });
        }
    }
}
