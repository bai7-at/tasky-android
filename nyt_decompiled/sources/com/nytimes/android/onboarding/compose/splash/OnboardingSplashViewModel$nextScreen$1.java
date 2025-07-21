package com.nytimes.android.onboarding.compose.splash;

import com.nytimes.android.onboarding.compose.b;
import com.nytimes.android.onboarding.compose.c;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.onboarding.compose.splash.OnboardingSplashViewModel$nextScreen$1", f = "OnboardingSplashViewModel.kt", l = {20}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class OnboardingSplashViewModel$nextScreen$1 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ OnboardingSplashViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OnboardingSplashViewModel$nextScreen$1(OnboardingSplashViewModel onboardingSplashViewModel, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = onboardingSplashViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new OnboardingSplashViewModel$nextScreen$1(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b bVar;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            bVar = this.this$0.a;
            c.e eVar = c.e.b;
            this.label = 1;
            if (bVar.d(eVar, this) == h) {
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
        return ((OnboardingSplashViewModel$nextScreen$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
