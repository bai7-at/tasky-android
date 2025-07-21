package com.nytimes.android.features.you.youtab.composable.interests.column;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import com.comscore.streaming.ContentType;
import defpackage.cc7;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class SmallColumnInterestKt {
    public static final void a(final ss2 ss2Var, final int i, final List list, final gt2 gt2Var, Composer composer, final int i2) {
        zq3.h(ss2Var, "assetHasBeenViewed");
        zq3.h(list, "assetList");
        zq3.h(gt2Var, "onAssetClick");
        Composer h = composer.h(25545);
        if (b.G()) {
            b.S(25545, i2, -1, "com.nytimes.android.features.you.youtab.composable.interests.column.SmallColumnInterest (SmallColumnInterest.kt:13)");
        }
        HorizontalAssetCarouselKt.a(ss2Var, i, list, null, gt2Var, h, (i2 & 14) | 512 | (i2 & ContentType.LONG_FORM_ON_DEMAND) | ((i2 << 3) & 57344), 8);
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.column.SmallColumnInterestKt$SmallColumnInterest$1
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
                    SmallColumnInterestKt.a(ss2.this, i, list, gt2Var, composer2, gt6.a(i2 | 1));
                }
            });
        }
    }
}
