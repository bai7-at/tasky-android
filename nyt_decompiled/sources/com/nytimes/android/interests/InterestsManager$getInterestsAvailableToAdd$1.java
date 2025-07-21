package com.nytimes.android.interests;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.interests.InterestsManager", f = "InterestsManager.kt", l = {133}, m = "getInterestsAvailableToAdd")
/* loaded from: classes4.dex */
final class InterestsManager$getInterestsAvailableToAdd$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InterestsManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InterestsManager$getInterestsAvailableToAdd$1(InterestsManager interestsManager, by0 by0Var) {
        super(by0Var);
        this.this$0 = interestsManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object i;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        i = this.this$0.i(this);
        return i;
    }
}
