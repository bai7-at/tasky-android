package com.apollographql.apollo.network.ws;

import defpackage.by0;
import defpackage.cc0;
import defpackage.d32;
import defpackage.fc1;
import defpackage.fx2;
import defpackage.it2;
import defpackage.ki5;
import defpackage.lu0;
import defpackage.t35;
import defpackage.ww8;
import defpackage.xj;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.flow.FlowCollector;

@fc1(c = "com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$3", f = "WebSocketNetworkTransport.kt", l = {286, 299}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class WebSocketNetworkTransport$execute$3 extends SuspendLambda implements it2 {
    final /* synthetic */ xj $request;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WebSocketNetworkTransport$execute$3(xj xjVar, by0 by0Var) {
        super(3, by0Var);
        this.$request = xjVar;
    }

    @Override // defpackage.it2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(FlowCollector flowCollector, d32 d32Var, by0 by0Var) {
        WebSocketNetworkTransport$execute$3 webSocketNetworkTransport$execute$3 = new WebSocketNetworkTransport$execute$3(this.$request, by0Var);
        webSocketNetworkTransport$execute$3.L$0 = flowCollector;
        webSocketNetworkTransport$execute$3.L$1 = d32Var;
        return webSocketNetworkTransport$execute$3.invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        boolean z = false;
        if (i != 0) {
            if (i == 1) {
                f.b(obj);
                return cc0.a(z);
            }
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
            z = true;
            return cc0.a(z);
        }
        f.b(obj);
        FlowCollector flowCollector = (FlowCollector) this.L$0;
        d32 d32Var = (d32) this.L$1;
        if (!(d32Var instanceof ki5) && !(d32Var instanceof lu0)) {
            if (d32Var instanceof t35) {
                this.L$0 = null;
                this.label = 1;
                if (flowCollector.emit(d32Var, this) == h) {
                    return h;
                }
            } else {
                if (d32Var instanceof fx2) {
                    System.out.println((Object) ("Received general error while executing operation " + this.$request.g().name() + ": " + ((fx2) d32Var).a()));
                } else {
                    this.L$0 = null;
                    this.label = 2;
                    if (flowCollector.emit(d32Var, this) == h) {
                        return h;
                    }
                }
                z = true;
            }
        }
        return cc0.a(z);
    }
}
