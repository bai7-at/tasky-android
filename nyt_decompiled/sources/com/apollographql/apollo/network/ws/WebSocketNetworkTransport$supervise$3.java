package com.apollographql.apollo.network.ws;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.apollographql.apollo.network.ws.WebSocketNetworkTransport$supervise$3", f = "WebSocketNetworkTransport.kt", l = {227}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class WebSocketNetworkTransport$supervise$3 extends SuspendLambda implements gt2 {
    final /* synthetic */ Ref$ObjectRef<WsProtocol> $protocol;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WebSocketNetworkTransport$supervise$3(Ref$ObjectRef ref$ObjectRef, by0 by0Var) {
        super(2, by0Var);
        this.$protocol = ref$ObjectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new WebSocketNetworkTransport$supervise$3(this.$protocol, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            WsProtocol wsProtocol = this.$protocol.element;
            zq3.e(wsProtocol);
            this.label = 1;
            if (wsProtocol.f(this) == h) {
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

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((WebSocketNetworkTransport$supervise$3) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
