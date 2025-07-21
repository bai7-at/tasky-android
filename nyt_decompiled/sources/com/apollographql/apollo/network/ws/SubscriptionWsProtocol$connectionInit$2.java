package com.apollographql.apollo.network.ws;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.apollographql.apollo.exception.ApolloNetworkException;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import defpackage.zq3;
import java.util.Map;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.apollographql.apollo.network.ws.SubscriptionWsProtocol$connectionInit$2", f = "SubscriptionWsProtocol.kt", l = {39}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SubscriptionWsProtocol$connectionInit$2 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ SubscriptionWsProtocol this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubscriptionWsProtocol$connectionInit$2(SubscriptionWsProtocol subscriptionWsProtocol, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = subscriptionWsProtocol;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new SubscriptionWsProtocol$connectionInit$2(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            SubscriptionWsProtocol subscriptionWsProtocol = this.this$0;
            this.label = 1;
            obj = subscriptionWsProtocol.e(this);
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        Map map = (Map) obj;
        Object obj2 = map.get(TransferTable.COLUMN_TYPE);
        if (zq3.c(obj2, "connection_ack")) {
            return ww8.a;
        }
        if (zq3.c(obj2, "connection_error")) {
            throw new ApolloNetworkException("Connection error:\n" + map, null, 2, null);
        }
        System.out.println((Object) ("unknown message while waiting for connection_ack: '" + obj2));
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((SubscriptionWsProtocol$connectionInit$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
