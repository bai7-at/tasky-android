package com.nytimes.android.gateway;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.jk;
import defpackage.sw2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.gateway.GatewayFragmentCard$onGatewayActionButton$1$1", f = "GatewayFragmentCard.kt", l = {217}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class GatewayFragmentCard$onGatewayActionButton$1$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ jk $it;
    int label;
    final /* synthetic */ GatewayFragmentCard this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GatewayFragmentCard$onGatewayActionButton$1$1(GatewayFragmentCard gatewayFragmentCard, jk jkVar, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = gatewayFragmentCard;
        this.$it = jkVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new GatewayFragmentCard$onGatewayActionButton$1$1(this.this$0, this.$it, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            sw2 h1 = this.this$0.h1();
            jk jkVar = this.$it;
            this.label = 1;
            if (h1.f(jkVar, this) == h) {
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
        return ((GatewayFragmentCard$onGatewayActionButton$1$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
