package com.nytimes.android.onboarding.compose.splash;

import androidx.compose.foundation.ImageKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import defpackage.do5;
import defpackage.it2;
import defpackage.ve6;
import defpackage.wh;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zr0;

/* loaded from: classes4.dex */
public final class ComposableSingletons$OnboardingSplashScreenKt {
    public static final ComposableSingletons$OnboardingSplashScreenKt a = new ComposableSingletons$OnboardingSplashScreenKt();
    public static it2 b = zr0.c(-1855396079, false, new it2() { // from class: com.nytimes.android.onboarding.compose.splash.ComposableSingletons$OnboardingSplashScreenKt$lambda-1$1
        @Override // defpackage.it2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((wh) obj, (Composer) obj2, ((Number) obj3).intValue());
            return ww8.a;
        }

        public final void invoke(wh whVar, Composer composer, int i) {
            zq3.h(whVar, "$this$AnimatedVisibility");
            if (b.G()) {
                b.S(-1855396079, i, -1, "com.nytimes.android.onboarding.compose.splash.ComposableSingletons$OnboardingSplashScreenKt.lambda-1.<anonymous> (OnboardingSplashScreen.kt:39)");
            }
            ImageKt.b(do5.d(ve6.splash_nameplate, composer, 0), "The New York Times name plate", null, null, null, 0.0f, null, composer, 56, 124);
            if (b.G()) {
                b.R();
            }
        }
    });

    public final it2 a() {
        return b;
    }
}
