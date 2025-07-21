package com.airbnb.android.showkase.ui;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.font.e;
import androidx.compose.ui.text.font.o;
import androidx.compose.ui.text.j;
import com.comscore.streaming.ContentType;
import defpackage.cc7;
import defpackage.ei0;
import defpackage.ek8;
import defpackage.gt2;
import defpackage.qs2;
import defpackage.rq1;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zr0;

/* loaded from: classes.dex */
public abstract class CommonComponentsKt {
    public static final void a(final String str, final qs2 qs2Var, Composer composer, final int i) {
        final int i2;
        Composer composer2;
        zq3.h(str, "text");
        zq3.h(qs2Var, "onClick");
        Composer h = composer.h(-680203232);
        if ((i & 14) == 0) {
            i2 = (h.S(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i2 |= h.S(qs2Var) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && h.i()) {
            h.K();
            composer2 = h;
        } else {
            if (b.G()) {
                b.S(-680203232, i2, -1, "com.airbnb.android.showkase.ui.SimpleTextCard (CommonComponents.kt:21)");
            }
            composer2 = h;
            ei0.b(qs2Var, PaddingKt.l(SizeKt.h(Modifier.a, 0.0f, 1, null), rq1.c(), rq1.b(), rq1.c(), rq1.b()), false, null, 0L, 0L, null, 0.0f, null, zr0.b(h, -1930578310, true, new gt2() { // from class: com.airbnb.android.showkase.ui.CommonComponentsKt$SimpleTextCard$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer3, int i3) {
                    if ((i3 & 11) == 2 && composer3.i()) {
                        composer3.K();
                        return;
                    }
                    if (b.G()) {
                        b.S(-1930578310, i3, -1, "com.airbnb.android.showkase.ui.SimpleTextCard.<anonymous> (CommonComponents.kt:30)");
                    }
                    TextKt.e(str, PaddingKt.i(Modifier.a, rq1.c()), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, new j(0L, ek8.g(20), o.b.a(), null, null, e.b.d(), null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, 262105, null), composer3, (i2 & 14) | 48, 0, 32764);
                    if (b.G()) {
                        b.R();
                    }
                }
            }), h, ((i2 >> 3) & 14) | 805306368, 508);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = composer2.k();
        if (k == null) {
            return;
        }
        k.a(new gt2() { // from class: com.airbnb.android.showkase.ui.CommonComponentsKt$SimpleTextCard$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return ww8.a;
            }

            public final void invoke(Composer composer3, int i3) {
                CommonComponentsKt.a(str, qs2Var, composer3, i | 1);
            }
        });
    }
}
