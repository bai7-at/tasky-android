package com.airbnb.lottie.compose;

import defpackage.by0;
import defpackage.cc0;
import defpackage.fc1;
import defpackage.it2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$rememberLottieComposition$1", f = "rememberLottieComposition.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class RememberLottieCompositionKt$rememberLottieComposition$1 extends SuspendLambda implements it2 {
    int label;

    RememberLottieCompositionKt$rememberLottieComposition$1(by0 by0Var) {
        super(3, by0Var);
    }

    public final Object b(int i, Throwable th, by0 by0Var) {
        return new RememberLottieCompositionKt$rememberLottieComposition$1(by0Var).invokeSuspend(ww8.a);
    }

    @Override // defpackage.it2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return b(((Number) obj).intValue(), (Throwable) obj2, (by0) obj3);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        return cc0.a(false);
    }
}
