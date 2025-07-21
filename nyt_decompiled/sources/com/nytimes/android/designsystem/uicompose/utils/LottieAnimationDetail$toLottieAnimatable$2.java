package com.nytimes.android.designsystem.uicompose.utils;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.a;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.designsystem.uicompose.utils.LottieAnimationDetail$toLottieAnimatable$2", f = "LottieAnimationDetail.kt", l = {34}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class LottieAnimationDetail$toLottieAnimatable$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ a $animator;
    final /* synthetic */ LottieComposition $composition;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LottieAnimationDetail$toLottieAnimatable$2(a aVar, LottieComposition lottieComposition, by0 by0Var) {
        super(2, by0Var);
        this.$animator = aVar;
        this.$composition = lottieComposition;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new LottieAnimationDetail$toLottieAnimatable$2(this.$animator, this.$composition, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            a aVar = this.$animator;
            LottieComposition lottieComposition = this.$composition;
            this.label = 1;
            if (a.C0136a.b(aVar, lottieComposition, 0.0f, 0, false, this, 12, null) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((LottieAnimationDetail$toLottieAnimatable$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
