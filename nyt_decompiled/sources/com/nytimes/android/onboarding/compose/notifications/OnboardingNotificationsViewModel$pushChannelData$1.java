package com.nytimes.android.onboarding.compose.notifications;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.onboarding.compose.notifications.OnboardingNotificationsViewModel", f = "OnboardingNotificationsViewModel.kt", l = {93}, m = "pushChannelData")
/* loaded from: classes4.dex */
final class OnboardingNotificationsViewModel$pushChannelData$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OnboardingNotificationsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OnboardingNotificationsViewModel$pushChannelData$1(OnboardingNotificationsViewModel onboardingNotificationsViewModel, by0 by0Var) {
        super(by0Var);
        this.this$0 = onboardingNotificationsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object G;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        G = this.this$0.G(null, this);
        return G;
    }
}
