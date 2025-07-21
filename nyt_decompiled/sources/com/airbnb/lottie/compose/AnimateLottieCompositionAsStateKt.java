package com.airbnb.lottie.compose;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b0;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.airbnb.lottie.LottieComposition;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.amazonaws.services.s3.model.InstructionFileId;
import defpackage.l29;
import defpackage.py1;
import defpackage.sy4;
import defpackage.xb4;

/* loaded from: classes.dex */
public abstract class AnimateLottieCompositionAsStateKt {
    public static final xb4 c(LottieComposition lottieComposition, boolean z, boolean z2, boolean z3, LottieClipSpec lottieClipSpec, float f, int i, LottieCancellationBehavior lottieCancellationBehavior, boolean z4, boolean z5, Composer composer, int i2, int i3) {
        composer.z(683659508);
        boolean z6 = (i3 & 2) != 0 ? true : z;
        boolean z7 = (i3 & 4) != 0 ? true : z2;
        boolean z8 = (i3 & 8) != 0 ? false : z3;
        LottieClipSpec lottieClipSpec2 = (i3 & 16) != 0 ? null : lottieClipSpec;
        float f2 = (i3 & 32) != 0 ? 1.0f : f;
        int i4 = (i3 & 64) != 0 ? 1 : i;
        LottieCancellationBehavior lottieCancellationBehavior2 = (i3 & 128) != 0 ? LottieCancellationBehavior.Immediately : lottieCancellationBehavior;
        boolean z9 = (i3 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? false : z4;
        boolean z10 = (i3 & 512) != 0 ? false : z5;
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(683659508, i2, -1, "com.airbnb.lottie.compose.animateLottieCompositionAsState (animateLottieCompositionAsState.kt:54)");
        }
        if (i4 <= 0) {
            throw new IllegalArgumentException(("Iterations must be a positive number (" + i4 + ").").toString());
        }
        if (Float.isInfinite(f2) || Float.isNaN(f2)) {
            throw new IllegalArgumentException(("Speed must be a finite number. It is " + f2 + InstructionFileId.DOT).toString());
        }
        a d = b.d(composer, 0);
        composer.z(-180606964);
        Object A = composer.A();
        if (A == Composer.a.a()) {
            A = b0.e(Boolean.valueOf(z6), null, 2, null);
            composer.q(A);
        }
        sy4 sy4Var = (sy4) A;
        composer.R();
        composer.z(-180606834);
        if (!z9) {
            f2 /= l29.f((Context) composer.m(AndroidCompositionLocals_androidKt.g()));
        }
        float f3 = f2;
        composer.R();
        py1.g(new Object[]{lottieComposition, Boolean.valueOf(z6), lottieClipSpec2, Float.valueOf(f3), Integer.valueOf(i4)}, new AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3(z6, z7, d, lottieComposition, i4, z8, f3, lottieClipSpec2, lottieCancellationBehavior2, z10, sy4Var, null), composer, 72);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(sy4 sy4Var) {
        return ((Boolean) sy4Var.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(sy4 sy4Var, boolean z) {
        sy4Var.setValue(Boolean.valueOf(z));
    }
}
