package com.nytimes.android.utils;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.utils.OnboardingActivityManager", f = "OnboardingActivityManager.kt", l = {116}, m = "launchOneTap")
/* loaded from: classes4.dex */
final class OnboardingActivityManager$launchOneTap$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OnboardingActivityManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OnboardingActivityManager$launchOneTap$1(OnboardingActivityManager onboardingActivityManager, by0 by0Var) {
        super(by0Var);
        this.this$0 = onboardingActivityManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        m = this.this$0.m(this);
        return m;
    }
}
