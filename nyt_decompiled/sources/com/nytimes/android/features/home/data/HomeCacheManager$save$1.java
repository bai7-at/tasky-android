package com.nytimes.android.features.home.data;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.features.home.data.HomeCacheManager", f = "HomeCacheManager.kt", l = {52}, m = "save")
/* loaded from: classes4.dex */
final class HomeCacheManager$save$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HomeCacheManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HomeCacheManager$save$1(HomeCacheManager homeCacheManager, by0 by0Var) {
        super(by0Var);
        this.this$0 = homeCacheManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.g(null, this);
    }
}
