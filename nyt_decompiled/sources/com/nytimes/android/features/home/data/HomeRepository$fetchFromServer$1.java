package com.nytimes.android.features.home.data;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.features.home.data.HomeRepository", f = "HomeRepository.kt", l = {33}, m = "fetchFromServer")
/* loaded from: classes4.dex */
final class HomeRepository$fetchFromServer$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HomeRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HomeRepository$fetchFromServer$1(HomeRepository homeRepository, by0 by0Var) {
        super(by0Var);
        this.this$0 = homeRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.g(null, this);
    }
}
