package com.nytimes.android.features.you.youtab;

import androidx.recyclerview.widget.RecyclerView;
import com.comscore.streaming.ContentDeliveryMode;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.features.you.youtab.YouScreenViewModel", f = "YouScreenViewModel.kt", l = {ContentDeliveryMode.LINEAR}, m = "getSavedItems")
/* loaded from: classes4.dex */
final class YouScreenViewModel$getSavedItems$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ YouScreenViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    YouScreenViewModel$getSavedItems$1(YouScreenViewModel youScreenViewModel, by0 by0Var) {
        super(by0Var);
        this.this$0 = youScreenViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object M;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        M = this.this$0.M(this);
        return M;
    }
}
