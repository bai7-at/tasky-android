package com.nytimes.android.libs.messagingarchitecture.network.local;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.libs.messagingarchitecture.network.local.LocalOMAMessageFetcher", f = "LocalOMAMessageFetcher.kt", l = {12}, m = "fetchData")
/* loaded from: classes4.dex */
final class LocalOMAMessageFetcher$fetchData$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LocalOMAMessageFetcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LocalOMAMessageFetcher$fetchData$1(LocalOMAMessageFetcher localOMAMessageFetcher, by0 by0Var) {
        super(by0Var);
        this.this$0 = localOMAMessageFetcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.a(this);
    }
}
