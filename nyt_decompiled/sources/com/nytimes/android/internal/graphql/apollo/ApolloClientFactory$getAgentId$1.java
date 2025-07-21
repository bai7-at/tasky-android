package com.nytimes.android.internal.graphql.apollo;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ss2;
import defpackage.w13;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.internal.graphql.apollo.ApolloClientFactory$getAgentId$1", f = "ApolloClientFactory.kt", l = {98}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ApolloClientFactory$getAgentId$1 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ ApolloClientFactory this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ApolloClientFactory$getAgentId$1(ApolloClientFactory apolloClientFactory, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = apolloClientFactory;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new ApolloClientFactory$getAgentId$1(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        w13 w13Var;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            w13Var = this.this$0.a;
            ss2 a = w13Var.a();
            this.label = 1;
            obj = a.invoke(this);
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        this.this$0.e = (String) obj;
        return obj;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((ApolloClientFactory$getAgentId$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
