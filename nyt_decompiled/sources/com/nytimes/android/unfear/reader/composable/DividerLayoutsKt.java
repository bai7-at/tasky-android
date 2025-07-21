package com.nytimes.android.unfear.reader.composable;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.Modifier;
import com.comscore.streaming.ContentType;
import defpackage.cc7;
import defpackage.fa3;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.i59;
import defpackage.ts1;
import defpackage.ww8;
import defpackage.zq3;

/* loaded from: classes4.dex */
public abstract class DividerLayoutsKt {
    public static final void a(final fa3 fa3Var, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        zq3.h(fa3Var, "level");
        Composer h = composer.h(-365825987);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (h.S(fa3Var) ? 4 : 2) | i;
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
                b.S(-365825987, i3, -1, "com.nytimes.android.unfear.reader.composable.HorizontalDividerLevelLayout (DividerLayouts.kt:15)");
            }
            if (!fa3Var.b().c()) {
                com.nytimes.android.unfear.nytdesignsystem.composable.DividerLayoutsKt.a(fa3Var.b(), modifier, h, (i3 & ContentType.LONG_FORM_ON_DEMAND) | ts1.c, 0);
            }
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.unfear.reader.composable.DividerLayoutsKt$HorizontalDividerLevelLayout$1
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
                    DividerLayoutsKt.a(fa3.this, modifier, composer2, gt6.a(i | 1), i2);
                }
            });
        }
    }

    public static final void b(final i59 i59Var, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        zq3.h(i59Var, "level");
        Composer h = composer.h(-417237571);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (h.S(i59Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = 2 & i2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i3 |= h.S(modifier) ? 32 : 16;
        }
        if ((i3 & 91) != 18 || !h.i()) {
            if (i4 != 0) {
                Modifier.a aVar = Modifier.a;
            }
            if (b.G()) {
                b.S(-417237571, i3, -1, "com.nytimes.android.unfear.reader.composable.VerticalDividerLevelLayout (DividerLayouts.kt:25)");
            }
            throw null;
        }
        h.K();
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2(i59Var, modifier, i, i2) { // from class: com.nytimes.android.unfear.reader.composable.DividerLayoutsKt$VerticalDividerLevelLayout$1
                final /* synthetic */ int $$changed;
                final /* synthetic */ int $$default;
                final /* synthetic */ i59 $level;
                final /* synthetic */ Modifier $modifier;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                    this.$modifier = modifier;
                    this.$$changed = i;
                    this.$$default = i2;
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i5) {
                    DividerLayoutsKt.b(null, this.$modifier, composer2, gt6.a(this.$$changed | 1), this.$$default);
                }
            });
        }
    }
}
