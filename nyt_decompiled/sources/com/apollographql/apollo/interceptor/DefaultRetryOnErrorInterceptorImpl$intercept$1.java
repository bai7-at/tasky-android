package com.apollographql.apollo.interceptor;

import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import defpackage.xj;
import defpackage.yj;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

@fc1(c = "com.apollographql.apollo.interceptor.DefaultRetryOnErrorInterceptorImpl$intercept$1", f = "RetryOnErrorInterceptor.kt", l = {65, MdtaMetadataEntry.TYPE_INDICATOR_INT32}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class DefaultRetryOnErrorInterceptorImpl$intercept$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ Flow<yj> $downStream;
    final /* synthetic */ boolean $failFastIfOffline;
    final /* synthetic */ xj $request;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DefaultRetryOnErrorInterceptorImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultRetryOnErrorInterceptorImpl$intercept$1(boolean z, DefaultRetryOnErrorInterceptorImpl defaultRetryOnErrorInterceptorImpl, xj xjVar, Flow flow, by0 by0Var) {
        super(2, by0Var);
        this.$failFastIfOffline = z;
        this.this$0 = defaultRetryOnErrorInterceptorImpl;
        this.$request = xjVar;
        this.$downStream = flow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        DefaultRetryOnErrorInterceptorImpl$intercept$1 defaultRetryOnErrorInterceptorImpl$intercept$1 = new DefaultRetryOnErrorInterceptorImpl$intercept$1(this.$failFastIfOffline, this.this$0, this.$request, this.$downStream, by0Var);
        defaultRetryOnErrorInterceptorImpl$intercept$1.L$0 = obj;
        return defaultRetryOnErrorInterceptorImpl$intercept$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            if (this.$failFastIfOffline) {
                DefaultRetryOnErrorInterceptorImpl.b(this.this$0);
            }
            Flow<yj> flow = this.$downStream;
            this.label = 2;
            if (FlowKt.emitAll(flowCollector, flow, this) == h) {
                return h;
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(FlowCollector flowCollector, by0 by0Var) {
        return ((DefaultRetryOnErrorInterceptorImpl$intercept$1) create(flowCollector, by0Var)).invokeSuspend(ww8.a);
    }
}
