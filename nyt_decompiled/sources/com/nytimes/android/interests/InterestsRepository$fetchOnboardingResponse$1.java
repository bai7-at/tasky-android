package com.nytimes.android.interests;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.interests.InterestsRepository", f = "InterestsRepository.kt", l = {83}, m = "fetchOnboardingResponse")
/* loaded from: classes4.dex */
final class InterestsRepository$fetchOnboardingResponse$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InterestsRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InterestsRepository$fetchOnboardingResponse$1(InterestsRepository interestsRepository, by0 by0Var) {
        super(by0Var);
        this.this$0 = interestsRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.e(this);
    }
}
