package com.apollographql.apollo.interceptor;

import com.apollographql.apollo.exception.ApolloException;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import defpackage.yj;
import defpackage.zq3;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.internal.Ref$IntRef;

@fc1(c = "com.apollographql.apollo.interceptor.DefaultRetryOnErrorInterceptorImpl$intercept$2", f = "RetryOnErrorInterceptor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class DefaultRetryOnErrorInterceptorImpl$intercept$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ Ref$IntRef $attempt;
    final /* synthetic */ boolean $retryOnError;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultRetryOnErrorInterceptorImpl$intercept$2(boolean z, Ref$IntRef ref$IntRef, by0 by0Var) {
        super(2, by0Var);
        this.$retryOnError = z;
        this.$attempt = ref$IntRef;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(yj yjVar, by0 by0Var) {
        return ((DefaultRetryOnErrorInterceptorImpl$intercept$2) create(yjVar, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        DefaultRetryOnErrorInterceptorImpl$intercept$2 defaultRetryOnErrorInterceptorImpl$intercept$2 = new DefaultRetryOnErrorInterceptorImpl$intercept$2(this.$retryOnError, this.$attempt, by0Var);
        defaultRetryOnErrorInterceptorImpl$intercept$2.L$0 = obj;
        return defaultRetryOnErrorInterceptorImpl$intercept$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ApolloException apolloException;
        boolean c;
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        yj yjVar = (yj) this.L$0;
        if (this.$retryOnError && (apolloException = yjVar.e) != null) {
            zq3.e(apolloException);
            c = a.c(apolloException);
            if (c) {
                throw RetryException.a;
            }
        }
        this.$attempt.element = 0;
        return ww8.a;
    }
}
