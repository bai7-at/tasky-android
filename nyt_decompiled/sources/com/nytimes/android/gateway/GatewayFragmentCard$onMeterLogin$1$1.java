package com.nytimes.android.gateway;

import android.content.Context;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.sw2;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.gateway.GatewayFragmentCard$onMeterLogin$1$1", f = "GatewayFragmentCard.kt", l = {210}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class GatewayFragmentCard$onMeterLogin$1$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ Context $it;
    int label;
    final /* synthetic */ GatewayFragmentCard this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GatewayFragmentCard$onMeterLogin$1$1(GatewayFragmentCard gatewayFragmentCard, Context context, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = gatewayFragmentCard;
        this.$it = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new GatewayFragmentCard$onMeterLogin$1$1(this.this$0, this.$it, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            sw2 h1 = this.this$0.h1();
            Context context = this.$it;
            zq3.g(context, "$it");
            this.label = 1;
            if (h1.b(context, this) == h) {
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
        return ((GatewayFragmentCard$onMeterLogin$1$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
