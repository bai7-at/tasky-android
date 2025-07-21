package com.nytimes.android.features.games.gameshub.ui.components;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material.DividerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.Modifier;
import com.nytimes.android.ads.ui.compose.AdWrapperUiKt;
import defpackage.bu1;
import defpackage.cc7;
import defpackage.d8;
import defpackage.eb5;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.ww8;
import defpackage.zq3;

/* loaded from: classes4.dex */
public abstract class PlayTabAdsKt {
    public static final void a(final d8 d8Var, Composer composer, final int i) {
        int i2;
        Composer composer2;
        zq3.h(d8Var, "bottomAd");
        Composer h = composer.h(-1539253167);
        if ((i & 14) == 0) {
            i2 = (h.S(d8Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && h.i()) {
            h.K();
            composer2 = h;
        } else {
            if (b.G()) {
                b.S(-1539253167, i2, -1, "com.nytimes.android.features.games.gameshub.ui.components.DisplayAds (PlayTabAds.kt:12)");
            }
            Modifier.a aVar = Modifier.a;
            float f = 16;
            DividerKt.a(PaddingKt.j(aVar, bu1.g(f), bu1.g(f)), eb5.Companion.a(h, 8).U(), 0.0f, 0.0f, h, 6, 12);
            composer2 = h;
            AdWrapperUiKt.f(d8Var, PaddingKt.m(aVar, 0.0f, bu1.g(40), 0.0f, 0.0f, 13, null), false, false, h, d8.a | 48 | (i2 & 14), 12);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = composer2.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.features.games.gameshub.ui.components.PlayTabAdsKt$DisplayAds$1
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
                    PlayTabAdsKt.a(d8.this, composer3, gt6.a(i | 1));
                }
            });
        }
    }
}
