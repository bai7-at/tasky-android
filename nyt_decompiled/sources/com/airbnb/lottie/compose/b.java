package com.airbnb.lottie.compose;

import androidx.compose.runtime.Composer;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.a;
import defpackage.by0;
import defpackage.ww8;

/* loaded from: classes.dex */
public abstract class b {
    public static final a a() {
        return new LottieAnimatableImpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float c(LottieComposition lottieComposition, LottieClipSpec lottieClipSpec, float f) {
        return ((f >= 0.0f || lottieComposition != null) && (lottieComposition == null || f >= 0.0f)) ? 0.0f : 1.0f;
    }

    public static final a d(Composer composer, int i) {
        composer.z(2024497114);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(2024497114, i, -1, "com.airbnb.lottie.compose.rememberLottieAnimatable (LottieAnimatable.kt:28)");
        }
        composer.z(-610207850);
        Object A = composer.A();
        if (A == Composer.a.a()) {
            A = a();
            composer.q(A);
        }
        a aVar = (a) A;
        composer.R();
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return aVar;
    }

    public static final Object e(a aVar, by0 by0Var) {
        LottieComposition v = aVar.v();
        aVar.w();
        Object b = a.C0136a.b(aVar, null, c(v, null, aVar.q()), 1, false, by0Var, 9, null);
        return b == kotlin.coroutines.intrinsics.a.h() ? b : ww8.a;
    }
}
