package com.apollographql.apollo.network.ws;

import defpackage.by0;
import defpackage.fc1;
import defpackage.it2;
import defpackage.w18;
import defpackage.ww8;
import defpackage.xj;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.flow.FlowCollector;

@fc1(c = "com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$6", f = "WebSocketNetworkTransport.kt", l = {336}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class WebSocketNetworkTransport$execute$6 extends SuspendLambda implements it2 {
    final /* synthetic */ xj $request;
    int label;
    final /* synthetic */ WebSocketNetworkTransport this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WebSocketNetworkTransport$execute$6(WebSocketNetworkTransport webSocketNetworkTransport, xj xjVar, by0 by0Var) {
        super(3, by0Var);
        this.this$0 = webSocketNetworkTransport;
        this.$request = xjVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            Channel channel = this.this$0.g;
            w18 w18Var = new w18(this.$request);
            this.label = 1;
            if (channel.send(w18Var, this) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return ww8.a;
    }

    @Override // defpackage.it2
    public final Object invoke(FlowCollector flowCollector, Throwable th, by0 by0Var) {
        return new WebSocketNetworkTransport$execute$6(this.this$0, this.$request, by0Var).invokeSuspend(ww8.a);
    }
}
