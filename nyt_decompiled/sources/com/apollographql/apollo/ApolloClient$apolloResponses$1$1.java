package com.apollographql.apollo;

import com.apollographql.apollo.exception.ApolloException;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import defpackage.yj;
import defpackage.zq3;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.apollographql.apollo.ApolloClient$apolloResponses$1$1", f = "ApolloClient.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ApolloClient$apolloResponses$1$1 extends SuspendLambda implements gt2 {
    /* synthetic */ Object L$0;
    int label;

    ApolloClient$apolloResponses$1$1(by0 by0Var) {
        super(2, by0Var);
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(yj yjVar, by0 by0Var) {
        return ((ApolloClient$apolloResponses$1$1) create(yjVar, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        ApolloClient$apolloResponses$1$1 apolloClient$apolloResponses$1$1 = new ApolloClient$apolloResponses$1$1(by0Var);
        apolloClient$apolloResponses$1$1.L$0 = obj;
        return apolloClient$apolloResponses$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        ApolloException apolloException = ((yj) this.L$0).e;
        if (apolloException == null) {
            return ww8.a;
        }
        zq3.e(apolloException);
        throw apolloException;
    }
}
