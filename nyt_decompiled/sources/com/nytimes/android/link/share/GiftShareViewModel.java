package com.nytimes.android.link.share;

import androidx.lifecycle.q;
import defpackage.by0;
import defpackage.zq3;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;

/* loaded from: classes4.dex */
public final class GiftShareViewModel extends q {
    private final GiftShareRemainingDataFetcher a;
    private final CoroutineDispatcher b;

    public GiftShareViewModel(GiftShareRemainingDataFetcher giftShareRemainingDataFetcher, CoroutineDispatcher coroutineDispatcher) {
        zq3.h(giftShareRemainingDataFetcher, "giftShareRemainingDataFetcher");
        zq3.h(coroutineDispatcher, "ioDispatcher");
        this.a = giftShareRemainingDataFetcher;
        this.b = coroutineDispatcher;
    }

    public final Object f(by0 by0Var) {
        return BuildersKt.withContext(this.b, new GiftShareViewModel$getGiftShareRemaining$2(this, null), by0Var);
    }
}
