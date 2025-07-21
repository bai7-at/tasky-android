package com.nytimes.android.interests;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.interests.InterestsOnboardingManager", f = "InterestsOnboardingManager.kt", l = {58, 59, 62}, m = "setOnboardingUserInterests")
/* loaded from: classes4.dex */
final class InterestsOnboardingManager$setOnboardingUserInterests$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InterestsOnboardingManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InterestsOnboardingManager$setOnboardingUserInterests$1(InterestsOnboardingManager interestsOnboardingManager, by0 by0Var) {
        super(by0Var);
        this.this$0 = interestsOnboardingManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.f(null, null, null, this);
    }
}
