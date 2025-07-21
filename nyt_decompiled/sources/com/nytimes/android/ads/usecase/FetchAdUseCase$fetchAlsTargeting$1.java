package com.nytimes.android.ads.usecase;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.ads.usecase.FetchAdUseCase", f = "FetchAdUseCase.kt", l = {30, 30}, m = "fetchAlsTargeting")
/* loaded from: classes2.dex */
final class FetchAdUseCase$fetchAlsTargeting$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FetchAdUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FetchAdUseCase$fetchAlsTargeting$1(FetchAdUseCase fetchAdUseCase, by0 by0Var) {
        super(by0Var);
        this.this$0 = fetchAdUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.d(null, null, null, this);
    }
}
