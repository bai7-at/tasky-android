package com.nytimes.android.messaging.subscriptionbanner;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.a;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.Modifier;
import defpackage.bu1;
import defpackage.cc7;
import defpackage.eb5;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.qs2;
import defpackage.qt6;
import defpackage.ww8;

/* loaded from: classes4.dex */
public abstract class BarOneSubscribeBannerKt {
    public static final void a(qs2 qs2Var, Composer composer, final int i, final int i2) {
        final qs2 qs2Var2;
        int i3;
        Composer composer2;
        Composer h = composer.h(-1517127152);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            qs2Var2 = qs2Var;
        } else if ((i & 14) == 0) {
            qs2Var2 = qs2Var;
            i3 = (h.C(qs2Var2) ? 4 : 2) | i;
        } else {
            qs2Var2 = qs2Var;
            i3 = i;
        }
        if ((i3 & 11) == 2 && h.i()) {
            h.K();
            composer2 = h;
        } else {
            qs2 qs2Var3 = i4 != 0 ? new qs2() { // from class: com.nytimes.android.messaging.subscriptionbanner.BarOneSubscribeBannerKt$BarOneSubscribeBanner$1
                /* renamed from: invoke, reason: collision with other method in class */
                public final void m614invoke() {
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m614invoke();
                    return ww8.a;
                }
            } : qs2Var2;
            if (b.G()) {
                b.S(-1517127152, i3, -1, "com.nytimes.android.messaging.subscriptionbanner.BarOneSubscribeBanner (BarOneSubscribeBanner.kt:26)");
            }
            Modifier i5 = SizeKt.i(SizeKt.h(Modifier.a, 0.0f, 1, null), bu1.g(55));
            a aVar = a.a;
            eb5.a aVar2 = eb5.Companion;
            composer2 = h;
            ButtonKt.a(qs2Var3, i5, false, null, null, qt6.a(), null, aVar.a(aVar2.a(h, 8).a(), aVar2.a(h, 8).l(), 0L, 0L, h, a.l << 12, 12), null, ComposableSingletons$BarOneSubscribeBannerKt.a.a(), h, (i3 & 14) | 805503024, 348);
            if (b.G()) {
                b.R();
            }
            qs2Var2 = qs2Var3;
        }
        cc7 k = composer2.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.messaging.subscriptionbanner.BarOneSubscribeBannerKt$BarOneSubscribeBanner$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer3, int i6) {
                    BarOneSubscribeBannerKt.a(qs2.this, composer3, gt6.a(i | 1), i2);
                }
            });
        }
    }
}
