package com.apollographql.apollo.interceptor;

import androidx.recyclerview.widget.RecyclerView;
import com.apollographql.apollo.api.http.HttpMethod;
import com.apollographql.apollo.exception.AutoPersistedQueriesNotSupported;
import defpackage.by0;
import defpackage.cc0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.vj;
import defpackage.ww8;
import defpackage.xj;
import defpackage.yj;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

@fc1(c = "com.apollographql.apollo.interceptor.AutoPersistedQueryInterceptor$intercept$1", f = "AutoPersistedQueryInterceptor.kt", l = {40}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class AutoPersistedQueryInterceptor$intercept$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ vj $chain;
    final /* synthetic */ boolean $isMutation;
    final /* synthetic */ xj $request;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AutoPersistedQueryInterceptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AutoPersistedQueryInterceptor$intercept$1(vj vjVar, xj xjVar, AutoPersistedQueryInterceptor autoPersistedQueryInterceptor, boolean z, by0 by0Var) {
        super(2, by0Var);
        this.$chain = vjVar;
        this.$request = xjVar;
        this.this$0 = autoPersistedQueryInterceptor;
        this.$isMutation = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        AutoPersistedQueryInterceptor$intercept$1 autoPersistedQueryInterceptor$intercept$1 = new AutoPersistedQueryInterceptor$intercept$1(this.$chain, this.$request, this.this$0, this.$isMutation, by0Var);
        autoPersistedQueryInterceptor$intercept$1.L$0 = obj;
        return autoPersistedQueryInterceptor$intercept$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            final FlowCollector flowCollector = (FlowCollector) this.L$0;
            Flow a = this.$chain.a(this.$request);
            final AutoPersistedQueryInterceptor autoPersistedQueryInterceptor = this.this$0;
            final xj xjVar = this.$request;
            final boolean z = this.$isMutation;
            final vj vjVar = this.$chain;
            FlowCollector flowCollector2 = new FlowCollector() { // from class: com.apollographql.apollo.interceptor.AutoPersistedQueryInterceptor$intercept$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object emit(yj yjVar, by0 by0Var) {
                    boolean f;
                    boolean g;
                    yj h2;
                    f = AutoPersistedQueryInterceptor.this.f(yjVar.d);
                    if (f) {
                        xj b = xjVar.l().r(z ? HttpMethod.Post : AutoPersistedQueryInterceptor.this.b).w(cc0.a(true)).v(cc0.a(true)).b();
                        FlowCollector flowCollector3 = flowCollector;
                        final Flow a2 = vjVar.a(b);
                        final AutoPersistedQueryInterceptor autoPersistedQueryInterceptor2 = AutoPersistedQueryInterceptor.this;
                        Object emitAll = FlowKt.emitAll(flowCollector3, new Flow() { // from class: com.apollographql.apollo.interceptor.AutoPersistedQueryInterceptor$intercept$1$1$emit$$inlined$map$1

                            /* renamed from: com.apollographql.apollo.interceptor.AutoPersistedQueryInterceptor$intercept$1$1$emit$$inlined$map$1$2, reason: invalid class name */
                            public static final class AnonymousClass2 implements FlowCollector {
                                final /* synthetic */ FlowCollector a;
                                final /* synthetic */ AutoPersistedQueryInterceptor b;

                                @fc1(c = "com.apollographql.apollo.interceptor.AutoPersistedQueryInterceptor$intercept$1$1$emit$$inlined$map$1$2", f = "AutoPersistedQueryInterceptor.kt", l = {219}, m = "emit")
                                /* renamed from: com.apollographql.apollo.interceptor.AutoPersistedQueryInterceptor$intercept$1$1$emit$$inlined$map$1$2$1, reason: invalid class name */
                                public static final class AnonymousClass1 extends ContinuationImpl {
                                    Object L$0;
                                    int label;
                                    /* synthetic */ Object result;

                                    public AnonymousClass1(by0 by0Var) {
                                        super(by0Var);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final Object invokeSuspend(Object obj) {
                                        this.result = obj;
                                        this.label |= RecyclerView.UNDEFINED_DURATION;
                                        return AnonymousClass2.this.emit(null, this);
                                    }
                                }

                                public AnonymousClass2(FlowCollector flowCollector, AutoPersistedQueryInterceptor autoPersistedQueryInterceptor) {
                                    this.a = flowCollector;
                                    this.b = autoPersistedQueryInterceptor;
                                }

                                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                                @Override // kotlinx.coroutines.flow.FlowCollector
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct add '--show-bad-code' argument
                                */
                                public final java.lang.Object emit(java.lang.Object r5, defpackage.by0 r6) {
                                    /*
                                        r4 = this;
                                        boolean r0 = r6 instanceof com.apollographql.apollo.interceptor.AutoPersistedQueryInterceptor$intercept$1$1$emit$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                        if (r0 == 0) goto L13
                                        r0 = r6
                                        com.apollographql.apollo.interceptor.AutoPersistedQueryInterceptor$intercept$1$1$emit$$inlined$map$1$2$1 r0 = (com.apollographql.apollo.interceptor.AutoPersistedQueryInterceptor$intercept$1$1$emit$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                                        int r1 = r0.label
                                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                        r3 = r1 & r2
                                        if (r3 == 0) goto L13
                                        int r1 = r1 - r2
                                        r0.label = r1
                                        goto L18
                                    L13:
                                        com.apollographql.apollo.interceptor.AutoPersistedQueryInterceptor$intercept$1$1$emit$$inlined$map$1$2$1 r0 = new com.apollographql.apollo.interceptor.AutoPersistedQueryInterceptor$intercept$1$1$emit$$inlined$map$1$2$1
                                        r0.<init>(r6)
                                    L18:
                                        java.lang.Object r6 = r0.result
                                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
                                        int r2 = r0.label
                                        r3 = 1
                                        if (r2 == 0) goto L31
                                        if (r2 != r3) goto L29
                                        kotlin.f.b(r6)
                                        goto L48
                                    L29:
                                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                                        java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                                        r4.<init>(r5)
                                        throw r4
                                    L31:
                                        kotlin.f.b(r6)
                                        kotlinx.coroutines.flow.FlowCollector r6 = r4.a
                                        yj r5 = (defpackage.yj) r5
                                        com.apollographql.apollo.interceptor.AutoPersistedQueryInterceptor r4 = r4.b
                                        r2 = 0
                                        yj r4 = com.apollographql.apollo.interceptor.AutoPersistedQueryInterceptor.e(r4, r5, r2)
                                        r0.label = r3
                                        java.lang.Object r4 = r6.emit(r4, r0)
                                        if (r4 != r1) goto L48
                                        return r1
                                    L48:
                                        ww8 r4 = defpackage.ww8.a
                                        return r4
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.apollographql.apollo.interceptor.AutoPersistedQueryInterceptor$intercept$1$1$emit$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, by0):java.lang.Object");
                                }
                            }

                            @Override // kotlinx.coroutines.flow.Flow
                            public Object collect(FlowCollector flowCollector4, by0 by0Var2) {
                                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector4, autoPersistedQueryInterceptor2), by0Var2);
                                return collect == kotlin.coroutines.intrinsics.a.h() ? collect : ww8.a;
                            }
                        }, (by0<? super ww8>) by0Var);
                        return emitAll == kotlin.coroutines.intrinsics.a.h() ? emitAll : ww8.a;
                    }
                    g = AutoPersistedQueryInterceptor.this.g(yjVar.d);
                    if (g) {
                        Object emit = flowCollector.emit(new yj.a(xjVar.g(), xjVar.h()).e(new AutoPersistedQueriesNotSupported()).b(), by0Var);
                        return emit == kotlin.coroutines.intrinsics.a.h() ? emit : ww8.a;
                    }
                    FlowCollector flowCollector4 = flowCollector;
                    h2 = AutoPersistedQueryInterceptor.this.h(yjVar, true);
                    Object emit2 = flowCollector4.emit(h2, by0Var);
                    return emit2 == kotlin.coroutines.intrinsics.a.h() ? emit2 : ww8.a;
                }
            };
            this.label = 1;
            if (a.collect(flowCollector2, this) == h) {
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
    public final Object invoke(FlowCollector flowCollector, by0 by0Var) {
        return ((AutoPersistedQueryInterceptor$intercept$1) create(flowCollector, by0Var)).invokeSuspend(ww8.a);
    }
}
