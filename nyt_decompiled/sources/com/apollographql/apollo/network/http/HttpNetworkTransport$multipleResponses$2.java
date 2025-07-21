package com.apollographql.apollo.network.http;

import com.apollographql.apollo.exception.ApolloException;
import com.comscore.streaming.AdvertisementType;
import defpackage.by0;
import defpackage.fc1;
import defpackage.ii5;
import defpackage.it2;
import defpackage.ww8;
import defpackage.yj;
import defpackage.zq3;
import java.util.UUID;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.flow.FlowCollector;

@fc1(c = "com.apollographql.apollo.network.http.HttpNetworkTransport$multipleResponses$2", f = "HttpNetworkTransport.kt", l = {AdvertisementType.BRANDED_ON_DEMAND_MID_ROLL}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class HttpNetworkTransport$multipleResponses$2 extends SuspendLambda implements it2 {
    final /* synthetic */ ii5 $operation;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HttpNetworkTransport$multipleResponses$2(ii5 ii5Var, by0 by0Var) {
        super(3, by0Var);
        this.$operation = ii5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Throwable th = (Throwable) this.L$1;
            if (th instanceof ApolloException) {
                ii5 ii5Var = this.$operation;
                UUID randomUUID = UUID.randomUUID();
                zq3.g(randomUUID, "randomUUID(...)");
                yj b = new yj.a(ii5Var, randomUUID).e((ApolloException) th).b();
                this.L$0 = null;
                this.label = 1;
                if (flowCollector.emit(b, this) == h) {
                    return h;
                }
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
        HttpNetworkTransport$multipleResponses$2 httpNetworkTransport$multipleResponses$2 = new HttpNetworkTransport$multipleResponses$2(this.$operation, by0Var);
        httpNetworkTransport$multipleResponses$2.L$0 = flowCollector;
        httpNetworkTransport$multipleResponses$2.L$1 = th;
        return httpNetworkTransport$multipleResponses$2.invokeSuspend(ww8.a);
    }
}
