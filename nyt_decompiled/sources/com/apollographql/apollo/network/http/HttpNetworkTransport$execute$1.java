package com.apollographql.apollo.network.http;

import androidx.recyclerview.widget.RecyclerView;
import com.apollographql.apollo.exception.ApolloException;
import com.apollographql.apollo.internal.MultipartKt;
import com.apollographql.apollo.network.http.HttpNetworkTransport;
import defpackage.ab3;
import defpackage.by0;
import defpackage.db3;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ii5;
import defpackage.o29;
import defpackage.vh1;
import defpackage.w41;
import defpackage.ww8;
import defpackage.xj;
import defpackage.yj;
import defpackage.zq3;
import java.util.List;
import kotlin.collections.i;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

@fc1(c = "com.apollographql.apollo.network.http.HttpNetworkTransport$execute$1", f = "HttpNetworkTransport.kt", l = {70, 103}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class HttpNetworkTransport$execute$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ w41 $customScalarAdapters;
    final /* synthetic */ ab3 $httpRequest;
    final /* synthetic */ xj $request;
    long J$0;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ HttpNetworkTransport this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HttpNetworkTransport$execute$1(HttpNetworkTransport httpNetworkTransport, ab3 ab3Var, xj xjVar, w41 w41Var, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = httpNetworkTransport;
        this.$httpRequest = ab3Var;
        this.$request = xjVar;
        this.$customScalarAdapters = w41Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        HttpNetworkTransport$execute$1 httpNetworkTransport$execute$1 = new HttpNetworkTransport$execute$1(this.this$0, this.$httpRequest, this.$request, this.$customScalarAdapters, by0Var);
        httpNetworkTransport$execute$1.L$0 = obj;
        return httpNetworkTransport$execute$1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlinx.coroutines.flow.FlowCollector] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlinx.coroutines.flow.FlowCollector] */
    /* JADX WARN: Type inference failed for: r1v7, types: [kotlinx.coroutines.flow.FlowCollector] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        final db3 db3Var;
        ?? r1;
        Flow j;
        yj i;
        long a;
        HttpNetworkTransport.c cVar;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i2 = this.label;
        try {
        } catch (ApolloException e) {
            e = e;
            db3Var = null;
            r1 = i2;
        }
        if (i2 == 0) {
            f.b(obj);
            ?? r12 = (FlowCollector) this.L$0;
            a = o29.a();
            List l = this.this$0.l();
            cVar = this.this$0.e;
            vh1 vh1Var = new vh1(i.G0(l, cVar), 0);
            ab3 ab3Var = this.$httpRequest;
            this.L$0 = r12;
            this.J$0 = a;
            this.label = 1;
            obj = vh1Var.a(ab3Var, this);
            i2 = r12;
            if (obj == h) {
                return h;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
                return ww8.a;
            }
            a = this.J$0;
            ?? r13 = (FlowCollector) this.L$0;
            f.b(obj);
            i2 = r13;
        }
        db3Var = (db3) obj;
        e = null;
        r1 = i2;
        final long j2 = a;
        if (db3Var == null) {
            HttpNetworkTransport httpNetworkTransport = this.this$0;
            ii5 g = this.$request.g();
            zq3.e(e);
            i = httpNetworkTransport.i(g, e);
            j = FlowKt.flowOf(i);
        } else {
            int c = db3Var.c();
            j = ((200 > c || c >= 300) && !MultipartKt.c(db3Var)) ? this.this$0.j(this.$request.g(), db3Var) : MultipartKt.d(db3Var) ? this.this$0.m(this.$request.g(), this.$customScalarAdapters, db3Var) : this.this$0.n(this.$request.g(), this.$customScalarAdapters, db3Var);
        }
        final Flow flow = j;
        final HttpNetworkTransport httpNetworkTransport2 = this.this$0;
        final xj xjVar = this.$request;
        Flow flow2 = new Flow() { // from class: com.apollographql.apollo.network.http.HttpNetworkTransport$execute$1$invokeSuspend$$inlined$map$1

            /* renamed from: com.apollographql.apollo.network.http.HttpNetworkTransport$execute$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2 implements FlowCollector {
                final /* synthetic */ FlowCollector a;
                final /* synthetic */ HttpNetworkTransport b;
                final /* synthetic */ xj c;
                final /* synthetic */ db3 d;
                final /* synthetic */ long e;

                @fc1(c = "com.apollographql.apollo.network.http.HttpNetworkTransport$execute$1$invokeSuspend$$inlined$map$1$2", f = "HttpNetworkTransport.kt", l = {219}, m = "emit")
                /* renamed from: com.apollographql.apollo.network.http.HttpNetworkTransport$execute$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector, HttpNetworkTransport httpNetworkTransport, xj xjVar, db3 db3Var, long j) {
                    this.a = flowCollector;
                    this.b = httpNetworkTransport;
                    this.c = xjVar;
                    this.d = db3Var;
                    this.e = j;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r11, defpackage.by0 r12) {
                    /*
                        r10 = this;
                        boolean r0 = r12 instanceof com.apollographql.apollo.network.http.HttpNetworkTransport$execute$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r12
                        com.apollographql.apollo.network.http.HttpNetworkTransport$execute$1$invokeSuspend$$inlined$map$1$2$1 r0 = (com.apollographql.apollo.network.http.HttpNetworkTransport$execute$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.apollographql.apollo.network.http.HttpNetworkTransport$execute$1$invokeSuspend$$inlined$map$1$2$1 r0 = new com.apollographql.apollo.network.http.HttpNetworkTransport$execute$1$invokeSuspend$$inlined$map$1$2$1
                        r0.<init>(r12)
                    L18:
                        java.lang.Object r12 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.f.b(r12)
                        goto L52
                    L29:
                        java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                        java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                        r10.<init>(r11)
                        throw r10
                    L31:
                        kotlin.f.b(r12)
                        kotlinx.coroutines.flow.FlowCollector r12 = r10.a
                        r5 = r11
                        yj r5 = (defpackage.yj) r5
                        com.apollographql.apollo.network.http.HttpNetworkTransport r4 = r10.b
                        xj r11 = r10.c
                        java.util.UUID r6 = r11.h()
                        db3 r7 = r10.d
                        long r8 = r10.e
                        yj r10 = com.apollographql.apollo.network.http.HttpNetworkTransport.h(r4, r5, r6, r7, r8)
                        r0.label = r3
                        java.lang.Object r10 = r12.emit(r10, r0)
                        if (r10 != r1) goto L52
                        return r1
                    L52:
                        ww8 r10 = defpackage.ww8.a
                        return r10
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.apollographql.apollo.network.http.HttpNetworkTransport$execute$1$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, by0):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, by0 by0Var) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, httpNetworkTransport2, xjVar, db3Var, j2), by0Var);
                return collect == kotlin.coroutines.intrinsics.a.h() ? collect : ww8.a;
            }
        };
        this.L$0 = null;
        this.label = 2;
        if (FlowKt.emitAll((FlowCollector) r1, flow2, this) == h) {
            return h;
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(FlowCollector flowCollector, by0 by0Var) {
        return ((HttpNetworkTransport$execute$1) create(flowCollector, by0Var)).invokeSuspend(ww8.a);
    }
}
