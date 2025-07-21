package com.nytimes.android.onboarding.compose;

import com.nytimes.android.eventtracker.pagetracker.scope.ET2Scope;
import com.nytimes.android.onboarding.compose.c;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.onboarding.compose.OnboardingViewModel$fastForward$1", f = "OnboardingViewModel.kt", l = {62, 63}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class OnboardingViewModel$fastForward$1 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ OnboardingViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OnboardingViewModel$fastForward$1(OnboardingViewModel onboardingViewModel, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = onboardingViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new OnboardingViewModel$fastForward$1(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ET2Scope eT2Scope;
        com.nytimes.android.entitlements.a aVar;
        com.nytimes.android.entitlements.a aVar2;
        b bVar;
        b bVar2;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            eT2Scope = this.this$0.d;
            if (eT2Scope.c() != null) {
                OnboardingViewModel onboardingViewModel = this.this$0;
                aVar = onboardingViewModel.b;
                if (aVar.a()) {
                    bVar2 = onboardingViewModel.c;
                    c.f fVar = c.f.b;
                    this.label = 1;
                    if (bVar2.d(fVar, this) == h) {
                        return h;
                    }
                } else {
                    aVar2 = onboardingViewModel.b;
                    if (aVar2.q()) {
                        bVar = onboardingViewModel.c;
                        c.d dVar = c.d.b;
                        this.label = 2;
                        if (bVar.d(dVar, this) == h) {
                            return h;
                        }
                    }
                }
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((OnboardingViewModel$fastForward$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
