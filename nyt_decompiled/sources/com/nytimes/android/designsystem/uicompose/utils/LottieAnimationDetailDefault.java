package com.nytimes.android.designsystem.uicompose.utils;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import com.airbnb.lottie.compose.c;
import defpackage.gt2;
import defpackage.lj6;

/* loaded from: classes4.dex */
public final class LottieAnimationDetailDefault {
    public static final LottieAnimationDetailDefault a = new LottieAnimationDetailDefault();
    private static final LottieAnimationDetail b = new LottieAnimationDetail(new gt2() { // from class: com.nytimes.android.designsystem.uicompose.utils.LottieAnimationDetailDefault$icNew$1
        public final c b(Composer composer, int i) {
            composer.z(708166509);
            if (b.G()) {
                b.S(708166509, i, -1, "com.nytimes.android.designsystem.uicompose.utils.LottieAnimationDetailDefault.icNew.<anonymous> (LottieAnimationDetailDefault.kt:7)");
            }
            int b2 = c.a.b(lj6.lottie_ic_new);
            if (b.G()) {
                b.R();
            }
            composer.R();
            return c.a.a(b2);
        }

        @Override // defpackage.gt2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return b((Composer) obj, ((Number) obj2).intValue());
        }
    }, new LottieAnimationDetailDefault$icNew$2(null));
    public static final int c = 8;

    private LottieAnimationDetailDefault() {
    }

    public final LottieAnimationDetail a() {
        return b;
    }
}
