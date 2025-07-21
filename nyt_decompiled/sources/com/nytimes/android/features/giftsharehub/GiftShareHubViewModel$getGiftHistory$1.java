package com.nytimes.android.features.giftsharehub;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.features.giftsharehub.GiftShareHubViewModel", f = "GiftShareHubViewModel.kt", l = {185}, m = "getGiftHistory")
/* loaded from: classes4.dex */
final class GiftShareHubViewModel$getGiftHistory$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GiftShareHubViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GiftShareHubViewModel$getGiftHistory$1(GiftShareHubViewModel giftShareHubViewModel, by0 by0Var) {
        super(by0Var);
        this.this$0 = giftShareHubViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object p;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        p = this.this$0.p(this);
        return p;
    }
}
