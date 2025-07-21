package com.nytimes.android.messaging.subscriptionbanner;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.font.e;
import androidx.compose.ui.text.font.o;
import defpackage.bu1;
import defpackage.d37;
import defpackage.eb5;
import defpackage.ek8;
import defpackage.gb5;
import defpackage.it2;
import defpackage.k48;
import defpackage.m37;
import defpackage.ol6;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zr0;

/* loaded from: classes4.dex */
public final class ComposableSingletons$BarOneSubscribeBannerKt {
    public static final ComposableSingletons$BarOneSubscribeBannerKt a = new ComposableSingletons$BarOneSubscribeBannerKt();
    public static it2 b = zr0.c(472974848, false, new it2() { // from class: com.nytimes.android.messaging.subscriptionbanner.ComposableSingletons$BarOneSubscribeBannerKt$lambda-1$1
        @Override // defpackage.it2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((m37) obj, (Composer) obj2, ((Number) obj3).intValue());
            return ww8.a;
        }

        public final void invoke(m37 m37Var, Composer composer, int i) {
            int i2;
            zq3.h(m37Var, "$this$Button");
            if ((i & 14) == 0) {
                i2 = i | (composer.S(m37Var) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 91) == 18 && composer.i()) {
                composer.K();
                return;
            }
            if (b.G()) {
                b.S(472974848, i2, -1, "com.nytimes.android.messaging.subscriptionbanner.ComposableSingletons$BarOneSubscribeBannerKt.lambda-1.<anonymous> (BarOneSubscribeBanner.kt:38)");
            }
            String b2 = k48.b(ol6.subscribe_banner_description, composer, 0);
            long g = ek8.g(14);
            e e = gb5.e();
            o.a aVar = o.b;
            TextKt.c(b2, null, 0L, g, null, aVar.g(), e, ek8.e(0.3d), null, null, 0L, 0, false, 0, 0, null, null, composer, 12782592, 0, 130838);
            Modifier.a aVar2 = Modifier.a;
            SpacerKt.a(m37.b(m37Var, aVar2, 1.0f, false, 2, null), composer, 0);
            eb5.a aVar3 = eb5.Companion;
            TextKt.c(k48.b(ol6.subscribe_banner_cta, composer, 0), PaddingKt.j(BackgroundKt.c(aVar2, aVar3.a(composer, 8).f(), d37.c(bu1.g(3))), bu1.g(10), bu1.g(6)), aVar3.a(composer, 8).o(), ek8.g(14), null, aVar.g(), gb5.e(), ek8.e(0.3d), null, null, 0L, 0, false, 0, 0, null, null, composer, 12782592, 0, 130832);
            if (b.G()) {
                b.R();
            }
        }
    });

    public final it2 a() {
        return b;
    }
}
