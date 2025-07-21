package com.nytimes.android.ribbon.destinations.cooking;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.ribbon.destinations.cooking.CookingViewModel", f = "CookingViewModel.kt", l = {255}, m = "getHeroImageUrl")
/* loaded from: classes4.dex */
final class CookingViewModel$getHeroImageUrl$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CookingViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CookingViewModel$getHeroImageUrl$1(CookingViewModel cookingViewModel, by0 by0Var) {
        super(by0Var);
        this.this$0 = cookingViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object s;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        s = this.this$0.s(null, this);
        return s;
    }
}
