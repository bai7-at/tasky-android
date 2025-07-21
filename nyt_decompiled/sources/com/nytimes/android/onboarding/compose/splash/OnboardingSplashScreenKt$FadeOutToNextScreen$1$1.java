package com.nytimes.android.onboarding.compose.splash;

import defpackage.by0;
import defpackage.cc0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

@fc1(c = "com.nytimes.android.onboarding.compose.splash.OnboardingSplashScreenKt$FadeOutToNextScreen$1$1", f = "OnboardingSplashScreen.kt", l = {55, 57}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class OnboardingSplashScreenKt$FadeOutToNextScreen$1$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ qs2 $nextScreen;
    final /* synthetic */ ss2 $visibilityChanged;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OnboardingSplashScreenKt$FadeOutToNextScreen$1$1(ss2 ss2Var, qs2 qs2Var, by0 by0Var) {
        super(2, by0Var);
        this.$visibilityChanged = ss2Var;
        this.$nextScreen = qs2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new OnboardingSplashScreenKt$FadeOutToNextScreen$1$1(this.$visibilityChanged, this.$nextScreen, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            this.label = 1;
            if (DelayKt.delay(1500L, this) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
                this.$nextScreen.mo865invoke();
                return ww8.a;
            }
            f.b(obj);
        }
        this.$visibilityChanged.invoke(cc0.a(false));
        this.label = 2;
        if (DelayKt.delay(600L, this) == h) {
            return h;
        }
        this.$nextScreen.mo865invoke();
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((OnboardingSplashScreenKt$FadeOutToNextScreen$1$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
