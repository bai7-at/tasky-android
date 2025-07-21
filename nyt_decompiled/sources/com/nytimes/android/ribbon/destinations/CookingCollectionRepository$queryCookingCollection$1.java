package com.nytimes.android.ribbon.destinations;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.ribbon.destinations.CookingCollectionRepository", f = "CookingCollectionRepository.kt", l = {28}, m = "queryCookingCollection")
/* loaded from: classes4.dex */
final class CookingCollectionRepository$queryCookingCollection$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CookingCollectionRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CookingCollectionRepository$queryCookingCollection$1(CookingCollectionRepository cookingCollectionRepository, by0 by0Var) {
        super(by0Var);
        this.this$0 = cookingCollectionRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.e(null, this);
    }
}
