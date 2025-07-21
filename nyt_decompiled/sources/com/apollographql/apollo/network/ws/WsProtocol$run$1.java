package com.apollographql.apollo.network.ws;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.apollographql.apollo.network.ws.WsProtocol", f = "WsProtocol.kt", l = {143}, m = "run$suspendImpl")
/* loaded from: classes2.dex */
final class WsProtocol$run$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WsProtocol this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WsProtocol$run$1(WsProtocol wsProtocol, by0 by0Var) {
        super(by0Var);
        this.this$0 = wsProtocol;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return WsProtocol.g(this.this$0, this);
    }
}
