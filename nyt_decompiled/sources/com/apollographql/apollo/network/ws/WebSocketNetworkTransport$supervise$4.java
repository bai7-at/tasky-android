package com.apollographql.apollo.network.ws;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;

@fc1(c = "com.apollographql.apollo.network.ws.WebSocketNetworkTransport$supervise$4", f = "WebSocketNetworkTransport.kt", l = {253}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class WebSocketNetworkTransport$supervise$4 extends SuspendLambda implements gt2 {
    final /* synthetic */ Ref$ObjectRef<Job> $connectionJob;
    final /* synthetic */ Ref$ObjectRef<Job> $idleJob;
    final /* synthetic */ Ref$ObjectRef<WsProtocol> $protocol;
    int label;
    final /* synthetic */ WebSocketNetworkTransport this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WebSocketNetworkTransport$supervise$4(WebSocketNetworkTransport webSocketNetworkTransport, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, Ref$ObjectRef ref$ObjectRef3, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = webSocketNetworkTransport;
        this.$protocol = ref$ObjectRef;
        this.$connectionJob = ref$ObjectRef2;
        this.$idleJob = ref$ObjectRef3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new WebSocketNetworkTransport$supervise$4(this.this$0, this.$protocol, this.$connectionJob, this.$idleJob, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        long j;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            j = this.this$0.d;
            this.label = 1;
            if (DelayKt.delay(j, this) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        WebSocketNetworkTransport.j(this.$protocol, this.$connectionJob, this.$idleJob);
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((WebSocketNetworkTransport$supervise$4) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
