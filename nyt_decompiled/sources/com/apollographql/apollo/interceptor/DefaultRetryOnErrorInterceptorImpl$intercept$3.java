package com.apollographql.apollo.interceptor;

import defpackage.by0;
import defpackage.cc0;
import defpackage.fc1;
import defpackage.kt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.time.DurationUnit;
import kotlin.time.b;
import kotlin.time.c;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.FlowCollector;

@fc1(c = "com.apollographql.apollo.interceptor.DefaultRetryOnErrorInterceptorImpl$intercept$3", f = "RetryOnErrorInterceptor.kt", l = {79, 81}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class DefaultRetryOnErrorInterceptorImpl$intercept$3 extends SuspendLambda implements kt2 {
    final /* synthetic */ Ref$IntRef $attempt;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DefaultRetryOnErrorInterceptorImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultRetryOnErrorInterceptorImpl$intercept$3(Ref$IntRef ref$IntRef, DefaultRetryOnErrorInterceptorImpl defaultRetryOnErrorInterceptorImpl, by0 by0Var) {
        super(4, by0Var);
        this.$attempt = ref$IntRef;
        this.this$0 = defaultRetryOnErrorInterceptorImpl;
    }

    @Override // defpackage.kt2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return invoke((FlowCollector) obj, (Throwable) obj2, ((Number) obj3).longValue(), (by0) obj4);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        boolean z = true;
        if (i == 0) {
            f.b(obj);
            if (((Throwable) this.L$0) instanceof RetryException) {
                this.$attempt.element++;
                DefaultRetryOnErrorInterceptorImpl.b(this.this$0);
                b.a aVar = b.b;
                long r = c.r(Math.pow(2.0d, this.$attempt.element), DurationUnit.SECONDS);
                this.label = 2;
                if (DelayKt.m872delayVtjQ1oo(r, this) == h) {
                    return h;
                }
            } else {
                z = false;
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return cc0.a(z);
    }

    public final Object invoke(FlowCollector flowCollector, Throwable th, long j, by0 by0Var) {
        DefaultRetryOnErrorInterceptorImpl$intercept$3 defaultRetryOnErrorInterceptorImpl$intercept$3 = new DefaultRetryOnErrorInterceptorImpl$intercept$3(this.$attempt, this.this$0, by0Var);
        defaultRetryOnErrorInterceptorImpl$intercept$3.L$0 = th;
        return defaultRetryOnErrorInterceptorImpl$intercept$3.invokeSuspend(ww8.a);
    }
}
