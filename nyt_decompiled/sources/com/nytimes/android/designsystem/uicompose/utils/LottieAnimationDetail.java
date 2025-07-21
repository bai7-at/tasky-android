package com.nytimes.android.designsystem.uicompose.utils;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.runtime.b0;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.RememberLottieCompositionKt;
import com.airbnb.lottie.compose.a;
import com.airbnb.lottie.compose.c;
import com.nytimes.android.utils.composeutils.LifecycleUtilsKt;
import defpackage.gt2;
import defpackage.it2;
import defpackage.py1;
import defpackage.sy4;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class LottieAnimationDetail {
    public static final int c = 8;
    private final gt2 a;
    private final it2 b;

    public LottieAnimationDetail(gt2 gt2Var, it2 it2Var) {
        zq3.h(gt2Var, "spec");
        zq3.h(it2Var, "animation");
        this.a = gt2Var;
        this.b = it2Var;
    }

    private static final a c(sy4 sy4Var) {
        return (a) sy4Var.getValue();
    }

    private static final void d(sy4 sy4Var, a aVar) {
        sy4Var.setValue(aVar);
    }

    public final it2 a() {
        return this.b;
    }

    public final a b(boolean z, Composer composer, int i, int i2) {
        composer.z(-1025254688);
        if ((i2 & 1) != 0) {
            z = true;
        }
        if (b.G()) {
            b.S(-1025254688, i, -1, "com.nytimes.android.designsystem.uicompose.utils.LottieAnimationDetail.toLottieAnimatable (LottieAnimationDetail.kt:22)");
        }
        LottieComposition value = RememberLottieCompositionKt.r((c) this.a.invoke(composer, 0), null, null, null, null, null, composer, 8, 62).getValue();
        composer.z(-933091534);
        Object A = composer.A();
        if (A == Composer.a.a()) {
            A = b0.e(null, null, 2, null);
            composer.q(A);
        }
        sy4 sy4Var = (sy4) A;
        composer.R();
        if (value != null) {
            a d = com.airbnb.lottie.compose.b.d(composer, 0);
            if (z) {
                composer.z(-933091324);
                LifecycleUtilsKt.a(value, new LottieAnimationDetail$toLottieAnimatable$1(this, d, value, null), composer, 72);
                composer.R();
            } else {
                composer.z(-933091172);
                py1.d(value, new LottieAnimationDetail$toLottieAnimatable$2(d, value, null), composer, 72);
                composer.R();
            }
            d(sy4Var, d);
        }
        a c2 = c(sy4Var);
        if (b.G()) {
            b.R();
        }
        composer.R();
        return c2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LottieAnimationDetail)) {
            return false;
        }
        LottieAnimationDetail lottieAnimationDetail = (LottieAnimationDetail) obj;
        return zq3.c(this.a, lottieAnimationDetail.a) && zq3.c(this.b, lottieAnimationDetail.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "LottieAnimationDetail(spec=" + this.a + ", animation=" + this.b + ")";
    }
}
