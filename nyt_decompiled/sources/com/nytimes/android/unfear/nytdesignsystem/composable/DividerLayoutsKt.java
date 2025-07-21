package com.nytimes.android.unfear.nytdesignsystem.composable;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material.DividerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.Modifier;
import com.comscore.streaming.ContentType;
import defpackage.bu1;
import defpackage.cb5;
import defpackage.cc7;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.ts1;
import defpackage.ww8;
import defpackage.zq3;

/* loaded from: classes4.dex */
public abstract class DividerLayoutsKt {
    public static final void a(final ts1 ts1Var, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        zq3.h(ts1Var, "dividerConfig");
        Composer h = composer.h(903389478);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (h.S(ts1Var) ? 4 : 2) | i;
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
                b.S(903389478, i3, -1, "com.nytimes.android.unfear.nytdesignsystem.composable.HorizontalDivider (DividerLayouts.kt:27)");
            }
            DividerKt.a(PaddingKt.k(modifier, bu1.g(16), 0.0f, 2, null), cb5.a(ts1Var.a(), null, h, 0, 1), bu1.g(ts1Var.b()), 0.0f, h, 0, 8);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.unfear.nytdesignsystem.composable.DividerLayoutsKt$HorizontalDivider$1
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
                    DividerLayoutsKt.a(ts1.this, modifier, composer2, gt6.a(i | 1), i2);
                }
            });
        }
    }
}
