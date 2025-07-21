package com.nytimes.android.ribbon.destinations.cooking;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.ribbon.destinations.cooking.CookingViewModel", f = "CookingViewModel.kt", l = {200}, m = "parseHomepageData")
/* loaded from: classes4.dex */
final class CookingViewModel$parseHomepageData$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CookingViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CookingViewModel$parseHomepageData$1(CookingViewModel cookingViewModel, by0 by0Var) {
        super(by0Var);
        this.this$0 = cookingViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object y;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        y = this.this$0.y(null, this);
        return y;
    }
}
