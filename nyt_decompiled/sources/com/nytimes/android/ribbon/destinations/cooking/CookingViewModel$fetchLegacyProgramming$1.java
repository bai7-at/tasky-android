package com.nytimes.android.ribbon.destinations.cooking;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.ribbon.destinations.cooking.CookingViewModel", f = "CookingViewModel.kt", l = {99}, m = "fetchLegacyProgramming")
/* loaded from: classes4.dex */
final class CookingViewModel$fetchLegacyProgramming$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CookingViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CookingViewModel$fetchLegacyProgramming$1(CookingViewModel cookingViewModel, by0 by0Var) {
        super(by0Var);
        this.this$0 = cookingViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object q;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        q = this.this$0.q(this);
        return q;
    }
}
