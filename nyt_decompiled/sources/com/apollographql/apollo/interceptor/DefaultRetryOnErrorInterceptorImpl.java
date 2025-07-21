package com.apollographql.apollo.interceptor;

import defpackage.l45;
import defpackage.uj;
import defpackage.vj;
import defpackage.xj;
import defpackage.zq3;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes2.dex */
final class DefaultRetryOnErrorInterceptorImpl implements uj {
    public DefaultRetryOnErrorInterceptorImpl(l45 l45Var) {
    }

    public static final /* synthetic */ l45 b(DefaultRetryOnErrorInterceptorImpl defaultRetryOnErrorInterceptorImpl) {
        defaultRetryOnErrorInterceptorImpl.getClass();
        return null;
    }

    @Override // defpackage.uj
    public Flow a(xj xjVar, vj vjVar) {
        zq3.h(xjVar, "request");
        zq3.h(vjVar, "chain");
        Boolean d = xjVar.d();
        boolean booleanValue = d != null ? d.booleanValue() : false;
        Boolean i = xjVar.i();
        boolean booleanValue2 = i != null ? i.booleanValue() : false;
        if (!booleanValue && !booleanValue2) {
            return vjVar.a(xjVar);
        }
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        return FlowKt.retryWhen(FlowKt.onEach(FlowKt.flow(new DefaultRetryOnErrorInterceptorImpl$intercept$1(booleanValue, this, xjVar, vjVar.a(xjVar), null)), new DefaultRetryOnErrorInterceptorImpl$intercept$2(booleanValue2, ref$IntRef, null)), new DefaultRetryOnErrorInterceptorImpl$intercept$3(ref$IntRef, this, null));
    }
}
