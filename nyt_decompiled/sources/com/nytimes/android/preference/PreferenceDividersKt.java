package com.nytimes.android.preference;

import androidx.compose.material.DividerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.Modifier;
import defpackage.bu1;
import defpackage.cc7;
import defpackage.eb5;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.ww8;

/* loaded from: classes4.dex */
public abstract class PreferenceDividersKt {
    public static final void a(final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer h = composer.h(1162086582);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (h.S(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 11) == 2 && h.i()) {
            h.K();
        } else {
            if (i4 != 0) {
                modifier = Modifier.a;
            }
            if (b.G()) {
                b.S(1162086582, i3, -1, "com.nytimes.android.preference.PreferenceCategoryDivider (PreferenceDividers.kt:22)");
            }
            DividerKt.a(modifier, eb5.Companion.a(h, 8).W(), 0.0f, 0.0f, h, i3 & 14, 12);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.preference.PreferenceDividersKt$PreferenceCategoryDivider$1
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
                    PreferenceDividersKt.a(Modifier.this, composer2, gt6.a(i | 1), i2);
                }
            });
        }
    }

    public static final void b(final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer h = composer.h(1089802562);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (h.S(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 11) == 2 && h.i()) {
            h.K();
        } else {
            if (i4 != 0) {
                modifier = Modifier.a;
            }
            if (b.G()) {
                b.S(1089802562, i3, -1, "com.nytimes.android.preference.PreferenceSimpleDivider (PreferenceDividers.kt:11)");
            }
            DividerKt.a(modifier, eb5.Companion.a(h, 8).V(), 0.0f, bu1.g(16), h, (i3 & 14) | 3072, 4);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.preference.PreferenceDividersKt$PreferenceSimpleDivider$1
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
                    PreferenceDividersKt.b(Modifier.this, composer2, gt6.a(i | 1), i2);
                }
            });
        }
    }
}
