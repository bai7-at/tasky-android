package com.nytimes.android.subauth.core.util;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.subauth.core.util.NetworkUtils", f = "NetworkUtils.kt", l = {24}, m = "attemptNetworkCall")
/* loaded from: classes4.dex */
final class NetworkUtils$attemptNetworkCall$1<T> extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NetworkUtils this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NetworkUtils$attemptNetworkCall$1(NetworkUtils networkUtils, by0 by0Var) {
        super(by0Var);
        this.this$0 = networkUtils;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.a(null, null, this);
    }
}
