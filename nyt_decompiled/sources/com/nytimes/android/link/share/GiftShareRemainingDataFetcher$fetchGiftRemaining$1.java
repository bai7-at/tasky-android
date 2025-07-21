package com.nytimes.android.link.share;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.link.share.GiftShareRemainingDataFetcher", f = "GiftShareRemainingDataFetcher.kt", l = {13}, m = "fetchGiftRemaining")
/* loaded from: classes4.dex */
final class GiftShareRemainingDataFetcher$fetchGiftRemaining$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GiftShareRemainingDataFetcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GiftShareRemainingDataFetcher$fetchGiftRemaining$1(GiftShareRemainingDataFetcher giftShareRemainingDataFetcher, by0 by0Var) {
        super(by0Var);
        this.this$0 = giftShareRemainingDataFetcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.a(this);
    }
}
