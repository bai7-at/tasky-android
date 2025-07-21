package com.nytimes.android.gateway;

import android.content.Context;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.id9;
import defpackage.qs2;
import defpackage.sw2;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.gateway.GatewayFragmentCard$onTruncatorActionButton$1$1", f = "GatewayFragmentCard.kt", l = {197}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class GatewayFragmentCard$onTruncatorActionButton$1$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ Context $context;
    final /* synthetic */ String $url;
    int label;
    final /* synthetic */ GatewayFragmentCard this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GatewayFragmentCard$onTruncatorActionButton$1$1(GatewayFragmentCard gatewayFragmentCard, Context context, String str, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = gatewayFragmentCard;
        this.$context = context;
        this.$url = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new GatewayFragmentCard$onTruncatorActionButton$1$1(this.this$0, this.$context, this.$url, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            sw2 h1 = this.this$0.h1();
            Context context = this.$context;
            zq3.g(context, "$context");
            final GatewayFragmentCard gatewayFragmentCard = this.this$0;
            final Context context2 = this.$context;
            final String str = this.$url;
            qs2 qs2Var = new qs2() { // from class: com.nytimes.android.gateway.GatewayFragmentCard$onTruncatorActionButton$1$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m551invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m551invoke() {
                    id9 webActivityNavigator = GatewayFragmentCard.this.getWebActivityNavigator();
                    Context context3 = context2;
                    zq3.g(context3, "$context");
                    webActivityNavigator.c(context3, str);
                }
            };
            this.label = 1;
            if (h1.e(context, qs2Var, this) == h) {
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
        return ((GatewayFragmentCard$onTruncatorActionButton$1$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
