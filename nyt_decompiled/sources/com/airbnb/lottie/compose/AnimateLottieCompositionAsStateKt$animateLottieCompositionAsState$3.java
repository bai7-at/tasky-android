package com.airbnb.lottie.compose;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.a;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.sy4;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.airbnb.lottie.compose.AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3", f = "animateLottieCompositionAsState.kt", l = {ModuleDescriptor.MODULE_VERSION, 78}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3 extends SuspendLambda implements gt2 {
    final /* synthetic */ float $actualSpeed;
    final /* synthetic */ a $animatable;
    final /* synthetic */ LottieCancellationBehavior $cancellationBehavior;
    final /* synthetic */ LottieClipSpec $clipSpec;
    final /* synthetic */ LottieComposition $composition;
    final /* synthetic */ boolean $isPlaying;
    final /* synthetic */ int $iterations;
    final /* synthetic */ boolean $restartOnPlay;
    final /* synthetic */ boolean $reverseOnRepeat;
    final /* synthetic */ boolean $useCompositionFrameRate;
    final /* synthetic */ sy4 $wasPlaying$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3(boolean z, boolean z2, a aVar, LottieComposition lottieComposition, int i, boolean z3, float f, LottieClipSpec lottieClipSpec, LottieCancellationBehavior lottieCancellationBehavior, boolean z4, sy4 sy4Var, by0 by0Var) {
        super(2, by0Var);
        this.$isPlaying = z;
        this.$restartOnPlay = z2;
        this.$animatable = aVar;
        this.$composition = lottieComposition;
        this.$iterations = i;
        this.$reverseOnRepeat = z3;
        this.$actualSpeed = f;
        this.$cancellationBehavior = lottieCancellationBehavior;
        this.$useCompositionFrameRate = z4;
        this.$wasPlaying$delegate = sy4Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3(this.$isPlaying, this.$restartOnPlay, this.$animatable, this.$composition, this.$iterations, this.$reverseOnRepeat, this.$actualSpeed, null, this.$cancellationBehavior, this.$useCompositionFrameRate, this.$wasPlaying$delegate, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean d;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            if (this.$isPlaying) {
                d = AnimateLottieCompositionAsStateKt.d(this.$wasPlaying$delegate);
                if (!d && this.$restartOnPlay) {
                    a aVar = this.$animatable;
                    this.label = 1;
                    if (b.e(aVar, this) == h) {
                        return h;
                    }
                }
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
                return ww8.a;
            }
            f.b(obj);
        }
        AnimateLottieCompositionAsStateKt.e(this.$wasPlaying$delegate, this.$isPlaying);
        if (!this.$isPlaying) {
            return ww8.a;
        }
        a aVar2 = this.$animatable;
        LottieComposition lottieComposition = this.$composition;
        int i2 = this.$iterations;
        boolean z = this.$reverseOnRepeat;
        float f = this.$actualSpeed;
        float s = aVar2.s();
        LottieCancellationBehavior lottieCancellationBehavior = this.$cancellationBehavior;
        boolean z2 = this.$useCompositionFrameRate;
        this.label = 2;
        if (a.C0136a.a(aVar2, lottieComposition, 0, i2, z, f, null, s, false, lottieCancellationBehavior, false, z2, this, 514, null) == h) {
            return h;
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
