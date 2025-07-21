package com.nytimes.android.features.home.ui;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.features.home.ui.HomeWebViewClient", f = "HomeWebViewClient.kt", l = {48}, m = "handleURL")
/* loaded from: classes4.dex */
final class HomeWebViewClient$handleURL$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HomeWebViewClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HomeWebViewClient$handleURL$1(HomeWebViewClient homeWebViewClient, by0 by0Var) {
        super(by0Var);
        this.this$0 = homeWebViewClient;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.j(null, this);
    }
}
